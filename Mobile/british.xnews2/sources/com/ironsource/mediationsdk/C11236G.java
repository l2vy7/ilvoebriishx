package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.C11347b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p275a.C11284b;
import com.ironsource.mediationsdk.p275a.C11296h;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.G */
public final class C11236G extends C11261V implements RewardedVideoSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public C11237a f50440h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C11239H f50441i;

    /* renamed from: j */
    private Timer f50442j;

    /* renamed from: k */
    private int f50443k;

    /* renamed from: l */
    private String f50444l;

    /* renamed from: m */
    private String f50445m;

    /* renamed from: n */
    private Placement f50446n;

    /* renamed from: o */
    private long f50447o;

    /* renamed from: p */
    String f50448p;

    /* renamed from: q */
    private JSONObject f50449q;

    /* renamed from: r */
    private int f50450r;

    /* renamed from: s */
    private String f50451s;

    /* renamed from: t */
    private final Object f50452t;

    /* renamed from: u */
    private final Object f50453u;

    /* renamed from: v */
    private long f50454v;

    /* renamed from: com.ironsource.mediationsdk.G$a */
    public enum C11237a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    /* renamed from: com.ironsource.mediationsdk.G$b */
    class C11238b extends TimerTask {
        C11238b() {
        }

        public final void run() {
            boolean z;
            int i;
            C11237a r = C11236G.this.f50440h;
            C11237a aVar = C11237a.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (r == aVar || C11236G.this.f50440h == C11237a.INIT_IN_PROGRESS) {
                if (C11236G.this.f50440h == aVar) {
                    i = 1025;
                } else {
                    i = 1032;
                    str = "Rewarded Video - init instance time out";
                }
                C11236G.this.m50182u(C11237a.NOT_LOADED);
                z = true;
            } else {
                i = 0;
                z = false;
            }
            C11236G.this.m50173A(str);
            if (z) {
                C11236G.this.mo43788b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11236G.this.m50178F())}});
                C11236G.this.mo43788b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11236G.this.m50178F())}});
                C11236G.this.f50441i.mo43810b(C11236G.this);
                return;
            }
            C11236G.this.mo43788b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11236G.this.m50178F())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C11236G.this.f50440h.name()}});
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11236G(com.ironsource.mediationsdk.C11236G r10, com.ironsource.mediationsdk.C11239H r11, com.ironsource.mediationsdk.AbstractAdapter r12, int r13, java.lang.String r14, org.json.JSONObject r15, int r16, java.lang.String r17) {
        /*
            r9 = this;
            r8 = r9
            r0 = r10
            java.lang.String r1 = r0.f50444l
            java.lang.String r2 = r0.f50445m
            com.ironsource.mediationsdk.model.a r3 = r0.f50599b
            com.ironsource.mediationsdk.model.NetworkSettings r3 = r3.f51346a
            int r5 = r0.f50443k
            r0 = r9
            r4 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r14
            r8.f50448p = r0
            r0 = r15
            r8.f50449q = r0
            r0 = r16
            r8.f50450r = r0
            r0 = r17
            r8.f50451s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11236G.<init>(com.ironsource.mediationsdk.G, com.ironsource.mediationsdk.H, com.ironsource.mediationsdk.AbstractAdapter, int, java.lang.String, org.json.JSONObject, int, java.lang.String):void");
    }

    public C11236G(String str, String str2, NetworkSettings networkSettings, C11239H h, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new C11415a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f50452t = new Object();
        this.f50453u = new Object();
        this.f50444l = str;
        this.f50445m = str2;
        this.f50441i = h;
        this.f50442j = null;
        this.f50443k = i;
        this.f50598a.updateRewardedVideoListener(this);
        this.f50603f = i2;
        this.f50440h = C11237a.NO_INIT;
        this.f50454v = 0;
        if (this.f50599b.f51348c) {
            m50173A("initForBidding()");
            m50182u(C11237a.INIT_IN_PROGRESS);
            m50176D();
            try {
                this.f50598a.initRewardedVideoForBidding(this.f50444l, this.f50445m, this.f50601d, this);
            } catch (Throwable th) {
                m50174B("initForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m50173A(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo43926k() + " " + hashCode() + "  : " + str, 0);
    }

    /* renamed from: B */
    private void m50174B(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo43926k() + " " + hashCode() + " : " + str, 3);
    }

    /* renamed from: C */
    private boolean m50175C() {
        return this.f50598a.isRewardedVideoAvailable(this.f50601d);
    }

    /* renamed from: D */
    private void m50176D() {
        try {
            String str = C11232E.m50103a().f50431u;
            if (!TextUtils.isEmpty(str)) {
                this.f50598a.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f50598a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Exception e) {
            m50173A("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: E */
    private void m50177E() {
        synchronized (this.f50453u) {
            Timer timer = this.f50442j;
            if (timer != null) {
                timer.cancel();
                this.f50442j = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public long m50178F() {
        return new Date().getTime() - this.f50447o;
    }

    /* renamed from: s */
    private void m50180s(int i) {
        m50181t(i, (Object[][]) null, false);
    }

    /* renamed from: t */
    private void m50181t(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo43929n();
        if (!TextUtils.isEmpty(this.f50448p)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f50448p);
        }
        JSONObject jSONObject = this.f50449q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f50449q);
        }
        if (z && (placement = this.f50446n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f50446n.getPlacementName());
        }
        if (m50186y(i)) {
            C11296h.m50466e();
            C11284b.m50398a(n, this.f50450r, this.f50451s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f50603f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo43926k() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11296h.m50466e().mo43979b(new C11308a(i, new JSONObject(n)));
        if (i == 1203) {
            C11499n.m51312a().mo44566a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m50182u(C11237a aVar) {
        m50173A("current state=" + this.f50440h + ", new state=" + aVar);
        synchronized (this.f50452t) {
            this.f50440h = aVar;
        }
    }

    /* renamed from: y */
    private static boolean m50186y(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* renamed from: a */
    public final Map<String, Object> mo43783a() {
        try {
            if (mo43923h()) {
                return this.f50598a.getRewardedVideoBiddingData(this.f50601d);
            }
            return null;
        } catch (Throwable th) {
            m50174B("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo43788b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo43784a(int i, Object[][] objArr) {
        m50181t(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo43785a(Placement placement) {
        m50177E();
        m50173A("showVideo()");
        this.f50446n = placement;
        m50182u(C11237a.SHOW_IN_PROGRESS);
        mo43784a(IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f50598a.showRewardedVideo(this.f50601d, this);
        } catch (Throwable th) {
            m50174B("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(1038, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo43786a(String str) {
        C11237a aVar;
        C11237a aVar2;
        m50173A("loadVideo() auctionId: " + this.f50448p + " state: " + this.f50440h);
        this.f50604g = null;
        this.f50600c = false;
        synchronized (this.f50452t) {
            aVar = this.f50440h;
            aVar2 = C11237a.LOAD_IN_PROGRESS;
            if (!(aVar == aVar2 || aVar == C11237a.SHOW_IN_PROGRESS)) {
                m50182u(aVar2);
            }
        }
        if (aVar == aVar2) {
            mo43788b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
        } else if (aVar == C11237a.SHOW_IN_PROGRESS) {
            mo43788b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
        } else {
            synchronized (this.f50453u) {
                Timer timer = new Timer();
                this.f50442j = timer;
                timer.schedule(new C11238b(), (long) (this.f50443k * 1000));
            }
            this.f50447o = new Date().getTime();
            m50180s(1001);
            try {
                if (mo43923h()) {
                    this.f50598a.loadRewardedVideoForBidding(this.f50601d, this, str);
                    return;
                }
                m50176D();
                this.f50598a.initRewardedVideo(this.f50444l, this.f50445m, this.f50601d, this);
            } catch (Throwable th) {
                m50174B("loadVideo exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                mo43788b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo43787a(boolean z) {
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_STATUS;
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m50181t(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo43788b(int i, Object[][] objArr) {
        m50181t(i, objArr, false);
    }

    /* renamed from: b */
    public final boolean mo43789b() {
        try {
            return mo43923h() ? this.f50440h == C11237a.LOADED && m50175C() : m50175C();
        } catch (Throwable th) {
            m50174B("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo43788b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: b_ */
    public final void mo43790b_() {
        this.f50598a.setMediationState(C11347b.C11348a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m50181t(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    /* renamed from: c */
    public final LoadWhileShowSupportState mo43791c() {
        return this.f50598a.getLoadWhileShowSupportState(this.f50601d);
    }

    /* renamed from: e */
    public final int mo43792e() {
        return 2;
    }

    public final void onRewardedVideoAdClicked() {
        m50173A("onRewardedVideoAdClicked");
        this.f50441i.mo43811b(this, this.f50446n);
        mo43784a(1006, (Object[][]) null);
    }

    public final void onRewardedVideoAdClosed() {
        m50173A("onRewardedVideoAdClosed");
        synchronized (this.f50452t) {
            if (this.f50440h != C11237a.SHOW_IN_PROGRESS) {
                mo43784a(IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)};
                mo43788b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.f50440h}});
                return;
            }
            m50182u(C11237a.ENDED);
            this.f50454v = new Date().getTime();
            this.f50441i.mo43813d(this);
        }
    }

    public final void onRewardedVideoAdEnded() {
        m50173A("onRewardedVideoAdEnded");
        this.f50441i.mo43815f(this);
        mo43784a(IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m50173A("onRewardedVideoAdOpened");
        this.f50441i.mo43812c(this);
        mo43784a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m50173A("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f50441i.mo43808a(this, this.f50446n);
        Map<String, Object> n = mo43929n();
        Placement placement = this.f50446n;
        if (placement != null) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f50446n.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f50446n.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C11232E.m50103a().f50423m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C11232E.m50103a().f50423m);
        }
        if (C11232E.m50103a().f50424n != null) {
            for (String next : C11232E.m50103a().f50424n.keySet()) {
                n.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C11232E.m50103a().f50424n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f50448p)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f50448p);
        }
        JSONObject jSONObject = this.f50449q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f50449q);
        }
        if (m50186y(1010)) {
            C11296h.m50466e();
            C11284b.m50398a(n, this.f50450r, this.f50451s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f50603f));
        C11308a aVar = new C11308a(1010, new JSONObject(n));
        aVar.mo44039a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.mo44040b(), mo43926k()));
        long j = this.f50454v;
        if (j != 0) {
            long j2 = time - j;
            m50173A("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            aVar.mo44039a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2));
        }
        C11296h.m50466e().mo43979b(aVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m50173A("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo43784a(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f50452t) {
            if (this.f50440h != C11237a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo43788b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f50440h}});
                return;
            }
            m50182u(C11237a.ENDED);
            this.f50441i.mo43809a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m50173A("onRewardedVideoAdStarted");
        this.f50441i.mo43814e(this);
        mo43784a(IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m50173A("onRewardedVideoAdVisible");
        mo43784a(IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m50173A("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f50440h.name());
        synchronized (this.f50452t) {
            if (this.f50440h == C11237a.LOAD_IN_PROGRESS) {
                m50182u(z ? C11237a.LOADED : C11237a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m50177E();
            mo43788b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50178F())}});
            if (z) {
                this.f50441i.mo43807a(this);
            } else {
                this.f50441i.mo43810b(this);
            }
        } else if (z) {
            mo43788b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f50440h.name()}});
        } else {
            mo43788b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1034}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50178F())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f50440h.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m50173A("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m50177E();
        mo43788b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1033}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50178F())}});
        mo43788b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50178F())}});
        synchronized (this.f50452t) {
            if (this.f50440h != C11237a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo43788b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f50440h}});
                return;
            }
            m50182u(C11237a.NO_INIT);
            this.f50441i.mo43810b(this);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m50173A("onRewardedVideoInitSuccess");
        synchronized (this.f50452t) {
            if (this.f50440h != C11237a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo43788b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f50440h}});
                return;
            }
            m50182u(C11237a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m50181t(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50178F())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f50604g = Long.valueOf(System.currentTimeMillis());
        }
        m50181t(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50178F())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
