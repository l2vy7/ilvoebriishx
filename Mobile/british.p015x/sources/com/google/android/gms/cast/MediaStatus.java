package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6489l;
import p109l4.C10689l0;
import p244q4.C10920a;
import p244q4.C10922b;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class MediaStatus extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaStatus> CREATOR = new C10689l0();

    /* renamed from: z */
    private static final C10922b f28468z = new C10922b("MediaStatus");

    /* renamed from: b */
    MediaInfo f28469b;

    /* renamed from: c */
    long f28470c;

    /* renamed from: d */
    int f28471d;

    /* renamed from: e */
    double f28472e;

    /* renamed from: f */
    int f28473f;

    /* renamed from: g */
    int f28474g;

    /* renamed from: h */
    long f28475h;

    /* renamed from: i */
    long f28476i;

    /* renamed from: j */
    double f28477j;

    /* renamed from: k */
    boolean f28478k;

    /* renamed from: l */
    long[] f28479l;

    /* renamed from: m */
    int f28480m;

    /* renamed from: n */
    int f28481n;

    /* renamed from: o */
    String f28482o;

    /* renamed from: p */
    JSONObject f28483p;

    /* renamed from: q */
    int f28484q;

    /* renamed from: r */
    final List<MediaQueueItem> f28485r;

    /* renamed from: s */
    boolean f28486s;

    /* renamed from: t */
    AdBreakStatus f28487t;

    /* renamed from: u */
    VideoInfo f28488u;

    /* renamed from: v */
    MediaLiveSeekableRange f28489v;

    /* renamed from: w */
    MediaQueueData f28490w;

    /* renamed from: x */
    private final SparseArray<Integer> f28491x;

    /* renamed from: y */
    private final C7088a f28492y;

    /* renamed from: com.google.android.gms.cast.MediaStatus$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public class C7088a {
        public C7088a() {
        }

        /* renamed from: a */
        public void mo29360a(boolean z) {
            MediaStatus.this.f28486s = z;
        }
    }

    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List<MediaQueueItem> list, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        String str2 = str;
        List<MediaQueueItem> list2 = list;
        this.f28485r = new ArrayList();
        this.f28491x = new SparseArray<>();
        this.f28492y = new C7088a();
        this.f28469b = mediaInfo;
        this.f28470c = j;
        this.f28471d = i;
        this.f28472e = d;
        this.f28473f = i2;
        this.f28474g = i3;
        this.f28475h = j2;
        this.f28476i = j3;
        this.f28477j = d2;
        this.f28478k = z;
        this.f28479l = jArr;
        this.f28480m = i4;
        this.f28481n = i5;
        this.f28482o = str2;
        if (str2 != null) {
            try {
                this.f28483p = new JSONObject(str2);
            } catch (JSONException unused) {
                this.f28483p = null;
                this.f28482o = null;
            }
        } else {
            this.f28483p = null;
        }
        this.f28484q = i6;
        if (list2 != null && !list.isEmpty()) {
            m29178c1(list2);
        }
        this.f28486s = z2;
        this.f28487t = adBreakStatus;
        this.f28488u = videoInfo;
        this.f28489v = mediaLiveSeekableRange;
        this.f28490w = mediaQueueData;
    }

    /* renamed from: c1 */
    private final void m29178c1(List<MediaQueueItem> list) {
        this.f28485r.clear();
        this.f28491x.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                MediaQueueItem mediaQueueItem = list.get(i);
                this.f28485r.add(mediaQueueItem);
                this.f28491x.put(mediaQueueItem.mo29319F0(), Integer.valueOf(i));
            }
        }
    }

    /* renamed from: d1 */
    private static final boolean m29179d1(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            }
            if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public long[] mo29330C0() {
        return this.f28479l;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public AdBreakStatus mo29331D0() {
        return this.f28487t;
    }

    @RecentlyNullable
    /* renamed from: E0 */
    public AdBreakClipInfo mo29332E0() {
        MediaInfo mediaInfo;
        List<AdBreakClipInfo> C0;
        AdBreakStatus adBreakStatus = this.f28487t;
        if (adBreakStatus == null) {
            return null;
        }
        String C02 = adBreakStatus.mo29163C0();
        if (!TextUtils.isEmpty(C02) && (mediaInfo = this.f28469b) != null && (C0 = mediaInfo.mo29218C0()) != null && !C0.isEmpty()) {
            for (AdBreakClipInfo next : C0) {
                if (C02.equals(next.mo29142H0())) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: F0 */
    public int mo29333F0() {
        return this.f28471d;
    }

    /* renamed from: G0 */
    public int mo29334G0() {
        return this.f28474g;
    }

    @RecentlyNonNull
    /* renamed from: H0 */
    public Integer mo29335H0(int i) {
        return this.f28491x.get(i);
    }

    @RecentlyNullable
    /* renamed from: I0 */
    public MediaQueueItem mo29336I0(int i) {
        Integer num = this.f28491x.get(i);
        if (num == null) {
            return null;
        }
        return this.f28485r.get(num.intValue());
    }

    @RecentlyNullable
    /* renamed from: J0 */
    public MediaLiveSeekableRange mo29337J0() {
        return this.f28489v;
    }

    /* renamed from: K0 */
    public int mo29338K0() {
        return this.f28480m;
    }

    @RecentlyNullable
    /* renamed from: L0 */
    public MediaInfo mo29339L0() {
        return this.f28469b;
    }

    /* renamed from: M0 */
    public double mo29340M0() {
        return this.f28472e;
    }

    /* renamed from: N0 */
    public int mo29341N0() {
        return this.f28473f;
    }

    /* renamed from: O0 */
    public int mo29342O0() {
        return this.f28481n;
    }

    @RecentlyNullable
    /* renamed from: P0 */
    public MediaQueueData mo29343P0() {
        return this.f28490w;
    }

    @RecentlyNullable
    /* renamed from: Q0 */
    public MediaQueueItem mo29344Q0(int i) {
        return mo29336I0(i);
    }

    /* renamed from: R0 */
    public int mo29345R0() {
        return this.f28485r.size();
    }

    /* renamed from: S0 */
    public int mo29346S0() {
        return this.f28484q;
    }

    /* renamed from: T0 */
    public long mo29347T0() {
        return this.f28475h;
    }

    /* renamed from: U0 */
    public double mo29348U0() {
        return this.f28477j;
    }

    @RecentlyNullable
    /* renamed from: V0 */
    public VideoInfo mo29349V0() {
        return this.f28488u;
    }

    @RecentlyNonNull
    /* renamed from: W0 */
    public C7088a mo29350W0() {
        return this.f28492y;
    }

    /* renamed from: X0 */
    public boolean mo29351X0(long j) {
        return (j & this.f28476i) != 0;
    }

    /* renamed from: Y0 */
    public boolean mo29352Y0() {
        return this.f28478k;
    }

    /* renamed from: Z0 */
    public boolean mo29353Z0() {
        return this.f28486s;
    }

    /* renamed from: a1 */
    public final long mo29354a1() {
        return this.f28470c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02d8, code lost:
        if (r15 == false) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018c, code lost:
        if (r13.f28479l != null) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0386  */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29355b1(@androidx.annotation.RecentlyNonNull org.json.JSONObject r14, int r15) throws org.json.JSONException {
        /*
            r13 = this;
            java.lang.String r0 = "extendedStatus"
            org.json.JSONObject r1 = r14.optJSONObject(r0)
            r2 = 0
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ JSONException -> 0x004c }
            r3.<init>()     // Catch:{ JSONException -> 0x004c }
            java.util.Iterator r4 = r14.keys()     // Catch:{ JSONException -> 0x004c }
        L_0x0012:
            boolean r5 = r4.hasNext()     // Catch:{ JSONException -> 0x004c }
            if (r5 == 0) goto L_0x0022
            java.lang.Object r5 = r4.next()     // Catch:{ JSONException -> 0x004c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x004c }
            r3.add(r5)     // Catch:{ JSONException -> 0x004c }
            goto L_0x0012
        L_0x0022:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004c }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ JSONException -> 0x004c }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ JSONException -> 0x004c }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ JSONException -> 0x004c }
            r4.<init>(r14, r3)     // Catch:{ JSONException -> 0x004c }
            java.util.Iterator r3 = r1.keys()     // Catch:{ JSONException -> 0x004c }
        L_0x0033:
            boolean r5 = r3.hasNext()     // Catch:{ JSONException -> 0x004c }
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r3.next()     // Catch:{ JSONException -> 0x004c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x004c }
            java.lang.Object r6 = r1.get(r5)     // Catch:{ JSONException -> 0x004c }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x004c }
            goto L_0x0033
        L_0x0047:
            r4.remove(r0)     // Catch:{ JSONException -> 0x004c }
            r14 = r4
            goto L_0x004d
        L_0x004c:
        L_0x004d:
            java.lang.String r0 = "mediaSessionId"
            long r0 = r14.getLong(r0)
            long r3 = r13.f28470c
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x005e
            r13.f28470c = r0
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            java.lang.String r1 = "playerState"
            boolean r3 = r14.has(r1)
            r4 = 2
            if (r3 == 0) goto L_0x00e7
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r3 = "IDLE"
            boolean r3 = r1.equals(r3)
            r6 = 3
            r7 = 4
            if (r3 == 0) goto L_0x0078
            r1 = 1
            goto L_0x00a1
        L_0x0078:
            java.lang.String r3 = "PLAYING"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0082
            r1 = 2
            goto L_0x00a1
        L_0x0082:
            java.lang.String r3 = "PAUSED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r1 = 3
            goto L_0x00a1
        L_0x008c:
            java.lang.String r3 = "BUFFERING"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0096
            r1 = 4
            goto L_0x00a1
        L_0x0096:
            java.lang.String r3 = "LOADING"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a0
            r1 = 5
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r13.f28473f
            if (r1 == r3) goto L_0x00a9
            r13.f28473f = r1
            r0 = r0 | 2
        L_0x00a9:
            if (r1 != r5) goto L_0x00e7
            java.lang.String r1 = "idleReason"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00e7
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r3 = "CANCELLED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00c1
            r6 = 2
            goto L_0x00df
        L_0x00c1:
            java.lang.String r3 = "INTERRUPTED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ca
            goto L_0x00df
        L_0x00ca:
            java.lang.String r3 = "FINISHED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00d4
            r6 = 1
            goto L_0x00df
        L_0x00d4:
            java.lang.String r3 = "ERROR"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00de
            r6 = 4
            goto L_0x00df
        L_0x00de:
            r6 = 0
        L_0x00df:
            int r1 = r13.f28474g
            if (r6 == r1) goto L_0x00e7
            r13.f28474g = r6
            r0 = r0 | 2
        L_0x00e7:
            java.lang.String r1 = "playbackRate"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00fd
            double r6 = r14.getDouble(r1)
            double r8 = r13.f28472e
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00fd
            r13.f28472e = r6
            r0 = r0 | 2
        L_0x00fd:
            java.lang.String r1 = "currentTime"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x0119
            double r6 = r14.getDouble(r1)
            long r6 = p244q4.C10920a.m49141d(r6)
            long r8 = r13.f28475h
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0117
            r13.f28475h = r6
            r0 = r0 | 2
        L_0x0117:
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x0119:
            java.lang.String r1 = "supportedMediaCommands"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x012f
            long r6 = r14.getLong(r1)
            long r8 = r13.f28476i
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012f
            r13.f28476i = r6
            r0 = r0 | 2
        L_0x012f:
            java.lang.String r1 = "volume"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x015b
            if (r15 != 0) goto L_0x015b
            org.json.JSONObject r15 = r14.getJSONObject(r1)
            java.lang.String r1 = "level"
            double r6 = r15.getDouble(r1)
            double r8 = r13.f28477j
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x014d
            r13.f28477j = r6
            r0 = r0 | 2
        L_0x014d:
            java.lang.String r1 = "muted"
            boolean r15 = r15.getBoolean(r1)
            boolean r1 = r13.f28478k
            if (r15 == r1) goto L_0x015b
            r13.f28478k = r15
            r0 = r0 | 2
        L_0x015b:
            java.lang.String r15 = "activeTrackIds"
            boolean r1 = r14.has(r15)
            r3 = 0
            if (r1 == 0) goto L_0x0169
            org.json.JSONArray r15 = r14.getJSONArray(r15)
            goto L_0x016a
        L_0x0169:
            r15 = r3
        L_0x016a:
            long[] r15 = p244q4.C10920a.m49151n(r15)
            if (r15 == 0) goto L_0x018a
            long[] r1 = r13.f28479l
            if (r1 != 0) goto L_0x0175
            goto L_0x018e
        L_0x0175:
            int r1 = r1.length
            int r6 = r15.length
            if (r1 != r6) goto L_0x018e
            r1 = 0
        L_0x017a:
            int r6 = r15.length
            if (r1 >= r6) goto L_0x0192
            long[] r6 = r13.f28479l
            r7 = r6[r1]
            r9 = r15[r1]
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x018e
            int r1 = r1 + 1
            goto L_0x017a
        L_0x018a:
            long[] r1 = r13.f28479l
            if (r1 == 0) goto L_0x0192
        L_0x018e:
            r13.f28479l = r15
            r0 = r0 | 2
        L_0x0192:
            java.lang.String r15 = "customData"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01a4
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r13.f28483p = r15
            r13.f28482o = r3
            r0 = r0 | 2
        L_0x01a4:
            java.lang.String r15 = "media"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01cd
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            com.google.android.gms.cast.MediaInfo r1 = new com.google.android.gms.cast.MediaInfo
            r1.<init>((org.json.JSONObject) r15)
            com.google.android.gms.cast.MediaInfo r6 = r13.f28469b
            if (r6 == 0) goto L_0x01bf
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x01c3
        L_0x01bf:
            r13.f28469b = r1
            r0 = r0 | 2
        L_0x01c3:
            java.lang.String r1 = "metadata"
            boolean r15 = r15.has(r1)
            if (r15 == 0) goto L_0x01cd
            r0 = r0 | 4
        L_0x01cd:
            java.lang.String r15 = "currentItemId"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01e1
            int r15 = r14.getInt(r15)
            int r1 = r13.f28471d
            if (r1 == r15) goto L_0x01e1
            r13.f28471d = r15
            r0 = r0 | 2
        L_0x01e1:
            java.lang.String r15 = "preloadedItemId"
            int r15 = r14.optInt(r15, r2)
            int r1 = r13.f28481n
            if (r1 == r15) goto L_0x01ef
            r13.f28481n = r15
            r0 = r0 | 16
        L_0x01ef:
            java.lang.String r15 = "loadingItemId"
            int r15 = r14.optInt(r15, r2)
            int r1 = r13.f28480m
            if (r1 == r15) goto L_0x01fd
            r13.f28480m = r15
            r0 = r0 | 2
        L_0x01fd:
            com.google.android.gms.cast.MediaInfo r15 = r13.f28469b
            if (r15 != 0) goto L_0x0203
            r15 = -1
            goto L_0x0207
        L_0x0203:
            int r15 = r15.mo29230O0()
        L_0x0207:
            int r1 = r13.f28473f
            int r6 = r13.f28474g
            int r7 = r13.f28480m
            boolean r15 = m29179d1(r1, r6, r7, r15)
            if (r15 != 0) goto L_0x02db
            java.lang.String r15 = "repeatMode"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x0240
            java.lang.String r15 = r14.getString(r15)
            java.lang.Integer r15 = p247r4.C10963a.m49297a(r15)
            if (r15 != 0) goto L_0x0228
            int r15 = r13.f28484q
            goto L_0x022c
        L_0x0228:
            int r15 = r15.intValue()
        L_0x022c:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            int r1 = r13.f28484q
            int r6 = r15.intValue()
            if (r1 == r6) goto L_0x0240
            int r15 = r15.intValue()
            r13.f28484q = r15
            r15 = 1
            goto L_0x0241
        L_0x0240:
            r15 = 0
        L_0x0241:
            java.lang.String r1 = "items"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x02d8
            org.json.JSONArray r1 = r14.getJSONArray(r1)
            int r6 = r1.length()
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            r8 = 0
        L_0x0257:
            if (r8 >= r6) goto L_0x026d
            org.json.JSONObject r9 = r1.getJSONObject(r8)
            java.lang.String r10 = "itemId"
            int r9 = r9.getInt(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.put(r8, r9)
            int r8 = r8 + 1
            goto L_0x0257
        L_0x026d:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
        L_0x0273:
            if (r9 >= r6) goto L_0x02c8
            java.lang.Object r10 = r7.get(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            org.json.JSONObject r11 = r1.getJSONObject(r9)
            int r12 = r10.intValue()
            com.google.android.gms.cast.MediaQueueItem r12 = r13.mo29336I0(r12)
            if (r12 == 0) goto L_0x02a0
            boolean r11 = r12.mo29316C0(r11)
            r15 = r15 | r11
            r8.add(r12)
            int r10 = r10.intValue()
            java.lang.Integer r10 = r13.mo29335H0(r10)
            int r10 = r10.intValue()
            if (r9 == r10) goto L_0x02c5
            goto L_0x02c4
        L_0x02a0:
            int r15 = r10.intValue()
            int r10 = r13.f28471d
            if (r15 != r10) goto L_0x02bc
            com.google.android.gms.cast.MediaInfo r15 = r13.f28469b
            if (r15 == 0) goto L_0x02bc
            com.google.android.gms.cast.MediaQueueItem$a r10 = new com.google.android.gms.cast.MediaQueueItem$a
            r10.<init>((com.google.android.gms.cast.MediaInfo) r15)
            com.google.android.gms.cast.MediaQueueItem r15 = r10.mo29329a()
            r15.mo29316C0(r11)
            r8.add(r15)
            goto L_0x02c4
        L_0x02bc:
            com.google.android.gms.cast.MediaQueueItem r15 = new com.google.android.gms.cast.MediaQueueItem
            r15.<init>(r11)
            r8.add(r15)
        L_0x02c4:
            r15 = 1
        L_0x02c5:
            int r9 = r9 + 1
            goto L_0x0273
        L_0x02c8:
            java.util.List<com.google.android.gms.cast.MediaQueueItem> r1 = r13.f28485r
            int r1 = r1.size()
            if (r1 == r6) goto L_0x02d2
            r1 = 0
            goto L_0x02d3
        L_0x02d2:
            r1 = 1
        L_0x02d3:
            r1 = r1 ^ r5
            r15 = r15 | r1
            r13.m29178c1(r8)
        L_0x02d8:
            if (r15 == 0) goto L_0x02f7
            goto L_0x02f5
        L_0x02db:
            r13.f28471d = r2
            r13.f28480m = r2
            r13.f28481n = r2
            java.util.List<com.google.android.gms.cast.MediaQueueItem> r15 = r13.f28485r
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x02f7
            r13.f28484q = r2
            java.util.List<com.google.android.gms.cast.MediaQueueItem> r15 = r13.f28485r
            r15.clear()
            android.util.SparseArray<java.lang.Integer> r15 = r13.f28491x
            r15.clear()
        L_0x02f5:
            r0 = r0 | 8
        L_0x02f7:
            java.lang.String r15 = "breakStatus"
            org.json.JSONObject r15 = r14.optJSONObject(r15)
            com.google.android.gms.cast.AdBreakStatus r15 = com.google.android.gms.cast.AdBreakStatus.m29029H0(r15)
            com.google.android.gms.cast.AdBreakStatus r1 = r13.f28487t
            if (r1 != 0) goto L_0x0307
            if (r15 != 0) goto L_0x030f
        L_0x0307:
            if (r1 == 0) goto L_0x0324
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0324
        L_0x030f:
            if (r15 == 0) goto L_0x031e
            java.lang.String r1 = r15.mo29164D0()
            if (r1 != 0) goto L_0x031d
            java.lang.String r1 = r15.mo29163C0()
            if (r1 == 0) goto L_0x031e
        L_0x031d:
            r2 = 1
        L_0x031e:
            r13.f28486s = r2
            r13.f28487t = r15
            r0 = r0 | 32
        L_0x0324:
            java.lang.String r15 = "videoInfo"
            org.json.JSONObject r15 = r14.optJSONObject(r15)
            com.google.android.gms.cast.VideoInfo r15 = com.google.android.gms.cast.VideoInfo.m29241F0(r15)
            com.google.android.gms.cast.VideoInfo r1 = r13.f28488u
            if (r1 != 0) goto L_0x0334
            if (r15 != 0) goto L_0x033c
        L_0x0334:
            if (r1 == 0) goto L_0x0340
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0340
        L_0x033c:
            r13.f28488u = r15
            r0 = r0 | 64
        L_0x0340:
            java.lang.String r15 = "breakInfo"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x0355
            com.google.android.gms.cast.MediaInfo r1 = r13.f28469b
            if (r1 == 0) goto L_0x0355
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r1.mo29234S0(r15)
            r0 = r0 | 2
        L_0x0355:
            java.lang.String r15 = "queueData"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x036f
            com.google.android.gms.cast.MediaQueueData$a r1 = new com.google.android.gms.cast.MediaQueueData$a
            r1.<init>()
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r1.mo29315b(r15)
            com.google.android.gms.cast.MediaQueueData r15 = r1.mo29314a()
            r13.f28490w = r15
        L_0x036f:
            java.lang.String r15 = "liveSeekableRange"
            boolean r15 = r14.has(r15)
            if (r15 == 0) goto L_0x0386
            java.lang.String r15 = "liveSeekableRange"
            org.json.JSONObject r14 = r14.optJSONObject(r15)
            com.google.android.gms.cast.MediaLiveSeekableRange r14 = com.google.android.gms.cast.MediaLiveSeekableRange.m29107G0(r14)
            r13.f28489v = r14
            r14 = r0 | 2
            goto L_0x038f
        L_0x0386:
            com.google.android.gms.cast.MediaLiveSeekableRange r14 = r13.f28489v
            if (r14 == 0) goto L_0x038c
            r0 = r0 | 2
        L_0x038c:
            r13.f28489v = r3
            r14 = r0
        L_0x038f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.mo29355b1(org.json.JSONObject, int):int");
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        return (this.f28483p == null) == (mediaStatus.f28483p == null) && this.f28470c == mediaStatus.f28470c && this.f28471d == mediaStatus.f28471d && this.f28472e == mediaStatus.f28472e && this.f28473f == mediaStatus.f28473f && this.f28474g == mediaStatus.f28474g && this.f28475h == mediaStatus.f28475h && this.f28477j == mediaStatus.f28477j && this.f28478k == mediaStatus.f28478k && this.f28480m == mediaStatus.f28480m && this.f28481n == mediaStatus.f28481n && this.f28484q == mediaStatus.f28484q && Arrays.equals(this.f28479l, mediaStatus.f28479l) && C10920a.m49143f(Long.valueOf(this.f28476i), Long.valueOf(mediaStatus.f28476i)) && C10920a.m49143f(this.f28485r, mediaStatus.f28485r) && C10920a.m49143f(this.f28469b, mediaStatus.f28469b) && ((jSONObject = this.f28483p) == null || (jSONObject2 = mediaStatus.f28483p) == null || C6489l.m28274a(jSONObject, jSONObject2)) && this.f28486s == mediaStatus.mo29353Z0() && C10920a.m49143f(this.f28487t, mediaStatus.f28487t) && C10920a.m49143f(this.f28488u, mediaStatus.f28488u) && C10920a.m49143f(this.f28489v, mediaStatus.f28489v) && C7408m.m30028a(this.f28490w, mediaStatus.f28490w);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28469b, Long.valueOf(this.f28470c), Integer.valueOf(this.f28471d), Double.valueOf(this.f28472e), Integer.valueOf(this.f28473f), Integer.valueOf(this.f28474g), Long.valueOf(this.f28475h), Long.valueOf(this.f28476i), Double.valueOf(this.f28477j), Boolean.valueOf(this.f28478k), Integer.valueOf(Arrays.hashCode(this.f28479l)), Integer.valueOf(this.f28480m), Integer.valueOf(this.f28481n), String.valueOf(this.f28483p), Integer.valueOf(this.f28484q), this.f28485r, Boolean.valueOf(this.f28486s), this.f28487t, this.f28488u, this.f28489v, this.f28490w);
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.f28483p;
        this.f28482o = jSONObject == null ? null : jSONObject.toString();
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, mo29339L0(), i, false);
        C11058b.m49531q(parcel, 3, this.f28470c);
        C11058b.m49527m(parcel, 4, mo29333F0());
        C11058b.m49522h(parcel, 5, mo29340M0());
        C11058b.m49527m(parcel, 6, mo29341N0());
        C11058b.m49527m(parcel, 7, mo29334G0());
        C11058b.m49531q(parcel, 8, mo29347T0());
        C11058b.m49531q(parcel, 9, this.f28476i);
        C11058b.m49522h(parcel, 10, mo29348U0());
        C11058b.m49517c(parcel, 11, mo29352Y0());
        C11058b.m49532r(parcel, 12, mo29330C0(), false);
        C11058b.m49527m(parcel, 13, mo29338K0());
        C11058b.m49527m(parcel, 14, mo29342O0());
        C11058b.m49537w(parcel, 15, this.f28482o, false);
        C11058b.m49527m(parcel, 16, this.f28484q);
        C11058b.m49510A(parcel, 17, this.f28485r, false);
        C11058b.m49517c(parcel, 18, mo29353Z0());
        C11058b.m49535u(parcel, 19, mo29331D0(), i, false);
        C11058b.m49535u(parcel, 20, mo29349V0(), i, false);
        C11058b.m49535u(parcel, 21, mo29337J0(), i, false);
        C11058b.m49535u(parcel, 22, mo29343P0(), i, false);
        C11058b.m49516b(parcel, a);
    }

    public final boolean zzc() {
        MediaInfo mediaInfo = this.f28469b;
        return m29179d1(this.f28473f, this.f28474g, this.f28480m, mediaInfo == null ? -1 : mediaInfo.mo29230O0());
    }

    public MediaStatus(@RecentlyNonNull JSONObject jSONObject) throws JSONException {
        this((MediaInfo) null, 0, 0, 0.0d, 0, 0, 0, 0, 0.0d, false, (long[]) null, 0, 0, (String) null, 0, (List<MediaQueueItem>) null, false, (AdBreakStatus) null, (VideoInfo) null, (MediaLiveSeekableRange) null, (MediaQueueData) null);
        mo29355b1(jSONObject, 0);
    }
}
