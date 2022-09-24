package com.ironsource.mediationsdk;

import android.util.Log;
import com.ironsource.mediationsdk.C11347b;
import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p275a.C11296h;
import com.ironsource.mediationsdk.sdk.C11475m;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.Z */
public final class C11281Z extends C11347b implements RewardedVideoSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: A */
    public long f50640A;

    /* renamed from: B */
    String f50641B;

    /* renamed from: C */
    private int f50642C;

    /* renamed from: D */
    private final String f50643D = IronSourceConstants.REQUEST_URL;

    /* renamed from: w */
    public int f50644w;

    /* renamed from: x */
    JSONObject f50645x;
    /* access modifiers changed from: package-private */

    /* renamed from: y */
    public C11475m f50646y;
    /* access modifiers changed from: package-private */

    /* renamed from: z */
    public AtomicBoolean f50647z;

    /* renamed from: com.ironsource.mediationsdk.Z$a */
    class C11282a extends TimerTask {
        C11282a() {
        }

        public final void run() {
            synchronized (C11281Z.this) {
                cancel();
                if (C11281Z.this.f50646y != null) {
                    String str = "Timeout for " + C11281Z.this.f50933e;
                    C11281Z.this.f50947s.log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                    C11281Z.this.mo44177a(C11347b.C11348a.NOT_AVAILABLE);
                    long time = new Date().getTime() - C11281Z.this.f50640A;
                    if (C11281Z.this.f50647z.compareAndSet(true, false)) {
                        C11281Z.this.m50383o(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
                        C11281Z.this.m50383o(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
                    } else {
                        C11281Z.this.m50383o(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
                    }
                    C11281Z.this.f50646y.mo44273a(false, C11281Z.this);
                }
            }
        }
    }

    C11281Z(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        this.f50645x = rewardedVideoSettings;
        this.f50943o = rewardedVideoSettings.optInt("maxAdsPerIteration", 99);
        this.f50944p = this.f50645x.optInt("maxAdsPerSession", 99);
        this.f50941m = this.f50645x.optInt("maxAdsPerDay", 99);
        this.f50641B = this.f50645x.optString(IronSourceConstants.REQUEST_URL);
        this.f50647z = new AtomicBoolean(false);
        this.f50642C = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m50383o(int i, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData((C11347b) this);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f50947s.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoSmash logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11296h.m50466e().mo43979b(new C11308a(i, providerAdditionalData));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo43722i() {
        this.f50938j = 0;
        mo44177a(mo43963o() ? C11347b.C11348a.AVAILABLE : C11347b.C11348a.NOT_AVAILABLE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo43723k() {
        return IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE;
    }

    /* renamed from: n */
    public final void mo43962n() {
        this.f50946r = null;
        if (this.f50930b != null) {
            C11347b.C11348a aVar = this.f50929a;
            if (!(aVar == C11347b.C11348a.CAPPED_PER_DAY || aVar == C11347b.C11348a.CAPPED_PER_SESSION)) {
                this.f50647z.set(true);
                this.f50640A = new Date().getTime();
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f50947s;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f50933e + ":fetchRewardedVideoForAutomaticLoad()", 1);
            this.f50930b.fetchRewardedVideoForAutomaticLoad(this.f50645x, this);
        }
    }

    /* renamed from: o */
    public final boolean mo43963o() {
        if (this.f50930b == null) {
            return false;
        }
        IronSourceLoggerManager ironSourceLoggerManager = this.f50947s;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f50933e + ":isRewardedVideoAvailable()", 1);
        return this.f50930b.isRewardedVideoAvailable(this.f50645x);
    }

    public final void onRewardedVideoAdClicked() {
        C11475m mVar = this.f50646y;
        if (mVar != null) {
            mVar.mo44280f(this);
        }
    }

    public final void onRewardedVideoAdClosed() {
        C11475m mVar = this.f50646y;
        if (mVar != null) {
            mVar.mo44274b(this);
        }
        mo43962n();
    }

    public final void onRewardedVideoAdEnded() {
        C11475m mVar = this.f50646y;
        if (mVar != null) {
            mVar.mo44278d(this);
        }
    }

    public final void onRewardedVideoAdOpened() {
        C11475m mVar = this.f50646y;
        if (mVar != null) {
            mVar.mo44269a(this);
        }
    }

    public final void onRewardedVideoAdRewarded() {
        C11475m mVar = this.f50646y;
        if (mVar != null) {
            mVar.mo44279e(this);
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        C11475m mVar = this.f50646y;
        if (mVar != null) {
            mVar.mo44270a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        C11475m mVar = this.f50646y;
        if (mVar != null) {
            mVar.mo44275c(this);
        }
    }

    public final void onRewardedVideoAdVisible() {
        C11475m mVar = this.f50646y;
        if (mVar != null) {
            mVar.mo44281g(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onRewardedVideoAvailabilityChanged(boolean r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.mo44183g()     // Catch:{ all -> 0x00b2 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f50647z     // Catch:{ all -> 0x00b2 }
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r2, r1)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0036
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00b2 }
            r0.<init>()     // Catch:{ all -> 0x00b2 }
            long r3 = r0.getTime()     // Catch:{ all -> 0x00b2 }
            long r5 = r8.f50640A     // Catch:{ all -> 0x00b2 }
            long r3 = r3 - r5
            if (r9 == 0) goto L_0x001f
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0021
        L_0x001f:
            r0 = 1200(0x4b0, float:1.682E-42)
        L_0x0021:
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x00b2 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = "duration"
            r6[r1] = r7     // Catch:{ all -> 0x00b2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b2 }
            r6[r2] = r3     // Catch:{ all -> 0x00b2 }
            r5[r1] = r6     // Catch:{ all -> 0x00b2 }
            r8.m50383o(r0, r5)     // Catch:{ all -> 0x00b2 }
            goto L_0x0041
        L_0x0036:
            if (r9 == 0) goto L_0x003b
            r0 = 1207(0x4b7, float:1.691E-42)
            goto L_0x003d
        L_0x003b:
            r0 = 1208(0x4b8, float:1.693E-42)
        L_0x003d:
            r1 = 0
            r8.m50383o(r0, r1)     // Catch:{ all -> 0x00b2 }
        L_0x0041:
            boolean r0 = r8.mo44181e()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0098
            if (r9 == 0) goto L_0x004f
            com.ironsource.mediationsdk.b$a r0 = r8.f50929a     // Catch:{ all -> 0x00b2 }
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C11347b.C11348a.AVAILABLE     // Catch:{ all -> 0x00b2 }
            if (r0 != r1) goto L_0x0057
        L_0x004f:
            if (r9 != 0) goto L_0x0076
            com.ironsource.mediationsdk.b$a r0 = r8.f50929a     // Catch:{ all -> 0x00b2 }
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C11347b.C11348a.NOT_AVAILABLE     // Catch:{ all -> 0x00b2 }
            if (r0 == r1) goto L_0x0076
        L_0x0057:
            if (r9 == 0) goto L_0x005c
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C11347b.C11348a.AVAILABLE     // Catch:{ all -> 0x00b2 }
            goto L_0x005e
        L_0x005c:
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C11347b.C11348a.NOT_AVAILABLE     // Catch:{ all -> 0x00b2 }
        L_0x005e:
            r8.mo44177a(r0)     // Catch:{ all -> 0x00b2 }
            if (r9 == 0) goto L_0x006d
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b2 }
            r8.f50945q = r0     // Catch:{ all -> 0x00b2 }
        L_0x006d:
            com.ironsource.mediationsdk.sdk.m r0 = r8.f50646y     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00b0
            r0.mo44273a((boolean) r9, (com.ironsource.mediationsdk.C11281Z) r8)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r8)
            return
        L_0x0076:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r1.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = r8.f50933e     // Catch:{ all -> 0x00b2 }
            r1.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = ": state remains "
            r1.append(r2)     // Catch:{ all -> 0x00b2 }
            r1.append(r9)     // Catch:{ all -> 0x00b2 }
            java.lang.String r9 = " in smash, mediation remains unchanged"
            r1.append(r9)     // Catch:{ all -> 0x00b2 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00b2 }
            r0.info(r9)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r8)
            return
        L_0x0098:
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r0.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r8.f50933e     // Catch:{ all -> 0x00b2 }
            r0.append(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = ": is capped or exhausted"
            r0.append(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b2 }
            r9.info(r0)     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r8)
            return
        L_0x00b2:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11281Z.onRewardedVideoAvailabilityChanged(boolean):void");
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        long time = new Date().getTime() - this.f50640A;
        if (ironSourceError.getErrorCode() == 1058) {
            m50383o(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f50946r = Long.valueOf(System.currentTimeMillis());
        }
        m50383o(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
    }

    public final void onRewardedVideoLoadSuccess() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo43964s() {
        try {
            mo44183g();
            Timer timer = new Timer();
            this.f50939k = timer;
            timer.schedule(new C11282a(), (long) (this.f50642C * 1000));
        } catch (Exception e) {
            mo44178b("startInitTimer", e.getLocalizedMessage());
        }
    }
}
