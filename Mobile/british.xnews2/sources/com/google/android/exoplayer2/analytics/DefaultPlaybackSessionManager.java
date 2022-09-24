package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackSessionManager;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p148s6.C11010o;

public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final C11010o<String> DEFAULT_SESSION_ID_GENERATOR = C6583i1.f27261b;
    private static final Random RANDOM = new Random();
    private static final int SESSION_ID_LENGTH = 12;
    private String currentSessionId;
    private Timeline currentTimeline;
    private PlaybackSessionManager.Listener listener;
    /* access modifiers changed from: private */
    public final Timeline.Period period;
    private final C11010o<String> sessionIdGenerator;
    private final HashMap<String, SessionDescriptor> sessions;
    /* access modifiers changed from: private */
    public final Timeline.Window window;

    private final class SessionDescriptor {
        /* access modifiers changed from: private */
        public MediaSource.MediaPeriodId adMediaPeriodId;
        /* access modifiers changed from: private */
        public boolean isActive;
        /* access modifiers changed from: private */
        public boolean isCreated;
        /* access modifiers changed from: private */
        public final String sessionId;
        /* access modifiers changed from: private */
        public int windowIndex;
        /* access modifiers changed from: private */
        public long windowSequenceNumber;

        public SessionDescriptor(String str, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            long j;
            this.sessionId = str;
            this.windowIndex = i;
            if (mediaPeriodId == null) {
                j = -1;
            } else {
                j = mediaPeriodId.windowSequenceNumber;
            }
            this.windowSequenceNumber = j;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                this.adMediaPeriodId = mediaPeriodId;
            }
        }

        private int resolveWindowIndexToNewTimeline(Timeline timeline, Timeline timeline2, int i) {
            if (i < timeline.getWindowCount()) {
                timeline.getWindow(i, DefaultPlaybackSessionManager.this.window);
                for (int i2 = DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i2 <= DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i2++) {
                    int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
                    if (indexOfPeriod != -1) {
                        return timeline2.getPeriod(indexOfPeriod, DefaultPlaybackSessionManager.this.period).windowIndex;
                    }
                }
                return -1;
            } else if (i < timeline2.getWindowCount()) {
                return i;
            } else {
                return -1;
            }
        }

        public boolean belongsToSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId == null) {
                return i == this.windowIndex;
            }
            MediaSource.MediaPeriodId mediaPeriodId2 = this.adMediaPeriodId;
            if (mediaPeriodId2 == null) {
                if (mediaPeriodId.isAd() || mediaPeriodId.windowSequenceNumber != this.windowSequenceNumber) {
                    return false;
                }
                return true;
            } else if (mediaPeriodId.windowSequenceNumber == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
            long j = this.windowSequenceNumber;
            if (j == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                if (this.windowIndex != eventTime.windowIndex) {
                    return true;
                }
                return false;
            } else if (mediaPeriodId.windowSequenceNumber > j) {
                return true;
            } else {
                if (this.adMediaPeriodId == null) {
                    return false;
                }
                int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
                int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
                MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
                if (mediaPeriodId2.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                    return false;
                }
                if (indexOfPeriod > indexOfPeriod2) {
                    return true;
                }
                if (mediaPeriodId2.isAd()) {
                    MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
                    int i = mediaPeriodId3.adGroupIndex;
                    int i2 = mediaPeriodId3.adIndexInAdGroup;
                    MediaSource.MediaPeriodId mediaPeriodId4 = this.adMediaPeriodId;
                    int i3 = mediaPeriodId4.adGroupIndex;
                    if (i > i3 || (i == i3 && i2 > mediaPeriodId4.adIndexInAdGroup)) {
                        return true;
                    }
                    return false;
                }
                int i4 = eventTime.mediaPeriodId.nextAdGroupIndex;
                if (i4 == -1 || i4 > this.adMediaPeriodId.adGroupIndex) {
                    return true;
                }
                return false;
            }
        }

        public void maybeSetWindowSequenceNumber(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber == -1 && i == this.windowIndex && mediaPeriodId != null) {
                this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
            }
        }

        public boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
            int resolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = resolveWindowIndexToNewTimeline;
            if (resolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            if (mediaPeriodId != null && timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) == -1) {
                return false;
            }
            return true;
        }
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    /* access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private SessionDescriptor getOrAddSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        SessionDescriptor sessionDescriptor = null;
        long j = Long.MAX_VALUE;
        for (SessionDescriptor next : this.sessions.values()) {
            next.maybeSetWindowSequenceNumber(i, mediaPeriodId);
            if (next.belongsToSession(i, mediaPeriodId)) {
                long access$100 = next.windowSequenceNumber;
                if (access$100 == -1 || access$100 < j) {
                    sessionDescriptor = next;
                    j = access$100;
                } else if (!(access$100 != j || ((SessionDescriptor) Util.castNonNull(sessionDescriptor)).adMediaPeriodId == null || next.adMediaPeriodId == null)) {
                    sessionDescriptor = next;
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        String str = this.sessionIdGenerator.get();
        SessionDescriptor sessionDescriptor2 = new SessionDescriptor(str, i, mediaPeriodId);
        this.sessions.put(str, sessionDescriptor2);
        return sessionDescriptor2;
    }

    @RequiresNonNull({"listener"})
    private void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            this.currentSessionId = null;
            return;
        }
        SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
        SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.sessionId;
        updateSessions(eventTime);
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null && mediaPeriodId.isAd()) {
            if (sessionDescriptor == null || sessionDescriptor.windowSequenceNumber != eventTime.mediaPeriodId.windowSequenceNumber || sessionDescriptor.adMediaPeriodId == null || sessionDescriptor.adMediaPeriodId.adGroupIndex != eventTime.mediaPeriodId.adGroupIndex || sessionDescriptor.adMediaPeriodId.adIndexInAdGroup != eventTime.mediaPeriodId.adIndexInAdGroup) {
                MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
                this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber)).sessionId, orAddSession.sessionId);
            }
        }
    }

    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
        SessionDescriptor sessionDescriptor = this.sessions.get(str);
        if (sessionDescriptor == null) {
            return false;
        }
        sessionDescriptor.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return sessionDescriptor.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    public synchronized void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener2;
        this.currentSessionId = null;
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            it.remove();
            if (next.isCreated && (listener2 = this.listener) != null) {
                listener2.onSessionFinished(eventTime, next.sessionId, false);
            }
        }
    }

    public synchronized String getActiveSessionId() {
        return this.currentSessionId;
    }

    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    public void setListener(PlaybackSessionManager.Listener listener2) {
        this.listener = listener2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            monitor-enter(r24)
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r2 = r1.listener     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.Timeline r2 = r0.timeline     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r24)
            return
        L_0x0014:
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r2 = r1.sessions     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.currentSessionId     // Catch:{ all -> 0x0118 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r2 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r2     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.mediaPeriodId     // Catch:{ all -> 0x0118 }
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x004b
            long r5 = r2.windowSequenceNumber     // Catch:{ all -> 0x0118 }
            r7 = -1
            r3 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x003a
            int r2 = r2.windowIndex     // Catch:{ all -> 0x0118 }
            int r5 = r0.windowIndex     // Catch:{ all -> 0x0118 }
            if (r2 == r5) goto L_0x0047
        L_0x0038:
            r3 = 1
            goto L_0x0047
        L_0x003a:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r0.mediaPeriodId     // Catch:{ all -> 0x0118 }
            long r5 = r5.windowSequenceNumber     // Catch:{ all -> 0x0118 }
            long r7 = r2.windowSequenceNumber     // Catch:{ all -> 0x0118 }
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0047
            goto L_0x0038
        L_0x0047:
            if (r3 == 0) goto L_0x004b
            monitor-exit(r24)
            return
        L_0x004b:
            int r2 = r0.windowIndex     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.mediaPeriodId     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r2 = r1.getOrAddSession(r2, r3)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.currentSessionId     // Catch:{ all -> 0x0118 }
            if (r3 != 0) goto L_0x005d
            java.lang.String r3 = r2.sessionId     // Catch:{ all -> 0x0118 }
            r1.currentSessionId = r3     // Catch:{ all -> 0x0118 }
        L_0x005d:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.mediaPeriodId     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00d9
            boolean r3 = r3.isAd()     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00d9
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r10 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.mediaPeriodId     // Catch:{ all -> 0x0118 }
            java.lang.Object r5 = r3.periodUid     // Catch:{ all -> 0x0118 }
            long r6 = r3.windowSequenceNumber     // Catch:{ all -> 0x0118 }
            int r3 = r3.adGroupIndex     // Catch:{ all -> 0x0118 }
            r10.<init>(r5, r6, r3)     // Catch:{ all -> 0x0118 }
            int r3 = r0.windowIndex     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r3 = r1.getOrAddSession(r3, r10)     // Catch:{ all -> 0x0118 }
            boolean r5 = r3.isCreated     // Catch:{ all -> 0x0118 }
            if (r5 != 0) goto L_0x00d9
            boolean unused = r3.isCreated = r4     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.Timeline r5 = r0.timeline     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r0.mediaPeriodId     // Catch:{ all -> 0x0118 }
            java.lang.Object r6 = r6.periodUid     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.Timeline$Period r7 = r1.period     // Catch:{ all -> 0x0118 }
            r5.getPeriodByUid(r6, r7)     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.Timeline$Period r5 = r1.period     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r0.mediaPeriodId     // Catch:{ all -> 0x0118 }
            int r6 = r6.adGroupIndex     // Catch:{ all -> 0x0118 }
            long r5 = r5.getAdGroupTimeUs(r6)     // Catch:{ all -> 0x0118 }
            long r5 = com.google.android.exoplayer2.C6540C.usToMs(r5)     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.Timeline$Period r7 = r1.period     // Catch:{ all -> 0x0118 }
            long r7 = r7.getPositionInWindowMs()     // Catch:{ all -> 0x0118 }
            long r5 = r5 + r7
            r7 = 0
            long r11 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r15 = new com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime     // Catch:{ all -> 0x0118 }
            long r6 = r0.realtimeMs     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.Timeline r8 = r0.timeline     // Catch:{ all -> 0x0118 }
            int r9 = r0.windowIndex     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.Timeline r13 = r0.currentTimeline     // Catch:{ all -> 0x0118 }
            int r14 = r0.currentWindowIndex     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r0.currentMediaPeriodId     // Catch:{ all -> 0x0118 }
            r16 = r5
            long r4 = r0.currentPlaybackPositionMs     // Catch:{ all -> 0x0118 }
            r20 = r2
            r21 = r3
            long r2 = r0.totalBufferedDurationMs     // Catch:{ all -> 0x0118 }
            r22 = r4
            r4 = r16
            r16 = r22
            r5 = r15
            r0 = r15
            r15 = r4
            r18 = r2
            r5.<init>(r6, r8, r9, r10, r11, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r2 = r1.listener     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r21.sessionId     // Catch:{ all -> 0x0118 }
            r2.onSessionCreated(r0, r3)     // Catch:{ all -> 0x0118 }
            goto L_0x00db
        L_0x00d9:
            r20 = r2
        L_0x00db:
            boolean r0 = r20.isCreated     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00f3
            r0 = r20
            r2 = 1
            boolean unused = r0.isCreated = r2     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r2 = r1.listener     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r0.sessionId     // Catch:{ all -> 0x0118 }
            r4 = r25
            r2.onSessionCreated(r4, r3)     // Catch:{ all -> 0x0118 }
            goto L_0x00f7
        L_0x00f3:
            r4 = r25
            r0 = r20
        L_0x00f7:
            java.lang.String r2 = r0.sessionId     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.currentSessionId     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0116
            boolean r2 = r0.isActive     // Catch:{ all -> 0x0118 }
            if (r2 != 0) goto L_0x0116
            r2 = 1
            boolean unused = r0.isActive = r2     // Catch:{ all -> 0x0118 }
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r2 = r1.listener     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r0.sessionId     // Catch:{ all -> 0x0118 }
            r2.onSessionActive(r4, r0)     // Catch:{ all -> 0x0118 }
        L_0x0116:
            monitor-exit(r24)
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r24)
            goto L_0x011c
        L_0x011b:
            throw r0
        L_0x011c:
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime):void");
    }

    public synchronized void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        Assertions.checkNotNull(this.listener);
        boolean z = i == 0;
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            if (next.isFinishedAtEventTime(eventTime)) {
                it.remove();
                if (next.isCreated) {
                    boolean equals = next.sessionId.equals(this.currentSessionId);
                    boolean z2 = z && equals && next.isActive;
                    if (equals) {
                        this.currentSessionId = null;
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, z2);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        Assertions.checkNotNull(this.listener);
        Timeline timeline = this.currentTimeline;
        this.currentTimeline = eventTime.timeline;
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline)) {
                it.remove();
                if (next.isCreated) {
                    if (next.sessionId.equals(this.currentSessionId)) {
                        this.currentSessionId = null;
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    public DefaultPlaybackSessionManager(C11010o<String> oVar) {
        this.sessionIdGenerator = oVar;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.sessions = new HashMap<>();
        this.currentTimeline = Timeline.EMPTY;
    }
}
