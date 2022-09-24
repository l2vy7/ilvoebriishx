package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.C11347b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p276a.C11284b;
import com.ironsource.mediationsdk.p276a.C11296h;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.U */
public final class C11258U extends C11261V implements RewardedVideoSmashListener {

    /* renamed from: A */
    private String f50567A;

    /* renamed from: B */
    private String f50568B;

    /* renamed from: C */
    private final Object f50569C = new Object();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Object f50570D = new Object();
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public C11259a f50571h = C11259a.NO_INIT;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C11257T f50572i;

    /* renamed from: j */
    private Timer f50573j;

    /* renamed from: k */
    private int f50574k;

    /* renamed from: l */
    private String f50575l;

    /* renamed from: m */
    private String f50576m;

    /* renamed from: n */
    private String f50577n;

    /* renamed from: o */
    private boolean f50578o;

    /* renamed from: p */
    private boolean f50579p;

    /* renamed from: q */
    boolean f50580q;

    /* renamed from: r */
    private Placement f50581r;

    /* renamed from: s */
    private long f50582s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f50583t;

    /* renamed from: u */
    private JSONObject f50584u;

    /* renamed from: v */
    private String f50585v;

    /* renamed from: w */
    private int f50586w;

    /* renamed from: x */
    private String f50587x;

    /* renamed from: y */
    private int f50588y;

    /* renamed from: z */
    private int f50589z;

    /* renamed from: com.ironsource.mediationsdk.U$a */
    public enum C11259a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    /* renamed from: com.ironsource.mediationsdk.U$b */
    class C11260b extends TimerTask {
        C11260b() {
        }

        public final void run() {
            boolean z;
            int i;
            String str;
            int i2;
            String str2 = "Rewarded Video - load instance time out";
            synchronized (C11258U.this.f50570D) {
                C11259a y = C11258U.this.f50571h;
                C11259a aVar = C11259a.LOAD_IN_PROGRESS;
                if (y != aVar) {
                    if (C11258U.this.f50571h != C11259a.INIT_IN_PROGRESS) {
                        i = 0;
                        z = false;
                    }
                }
                if (C11258U.this.f50571h == aVar) {
                    str = str2;
                    i2 = 1025;
                } else {
                    i2 = 1032;
                    str = "Rewarded Video - init instance time out";
                }
                C11258U.this.m50335u(C11259a.NOT_LOADED);
                z = true;
                String str3 = str;
                i = i2;
                str2 = str3;
            }
            C11258U.this.m50331a(str2);
            if (z) {
                C11258U.this.mo43918b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11258U.this.m50330I())}});
                C11258U.this.mo43918b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11258U.this.m50330I())}});
                C11257T D = C11258U.this.f50572i;
                C11258U u = C11258U.this;
                D.mo43909b(u, u.f50583t);
                return;
            }
            C11258U.this.mo43918b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11258U.this.m50330I())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C11258U.this.f50571h.name()}});
        }
    }

    public C11258U(String str, String str2, NetworkSettings networkSettings, C11257T t, int i, AbstractAdapter abstractAdapter) {
        super(new C11415a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f50575l = str;
        this.f50576m = str2;
        this.f50572i = t;
        this.f50573j = null;
        this.f50574k = i;
        this.f50598a.addRewardedVideoListener(this);
        this.f50578o = false;
        this.f50579p = false;
        this.f50580q = false;
        this.f50581r = null;
        this.f50583t = "";
        this.f50584u = null;
        this.f50603f = 1;
        m50326E();
    }

    /* renamed from: B */
    private void m50323B(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo43926k() + " : " + str, 3);
    }

    /* renamed from: E */
    private void m50326E() {
        this.f50585v = "";
        this.f50588y = -1;
        this.f50568B = "";
        this.f50577n = "";
        this.f50589z = this.f50603f;
        this.f50567A = "";
    }

    /* renamed from: F */
    private boolean m50327F() {
        return this.f50598a.isRewardedVideoAvailable(this.f50601d);
    }

    /* renamed from: G */
    private void m50328G() {
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
            m50331a("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: H */
    private void m50329H() {
        synchronized (this.f50569C) {
            Timer timer = this.f50573j;
            if (timer != null) {
                timer.cancel();
                this.f50573j = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public long m50330I() {
        return new Date().getTime() - this.f50582s;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50331a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo43926k() + " : " + str, 0);
    }

    /* renamed from: s */
    private void m50333s(int i) {
        m50334t(i, (Object[][]) null, false);
    }

    /* renamed from: t */
    private void m50334t(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo43929n();
        if (!TextUtils.isEmpty(this.f50583t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f50583t);
        }
        JSONObject jSONObject = this.f50584u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f50584u);
        }
        if (z && (placement = this.f50581r) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f50581r.getPlacementName());
        }
        if (m50340z(i)) {
            C11296h.m50466e();
            C11284b.m50398a(n, this.f50586w, this.f50587x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f50603f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo43926k() + " smash: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11296h.m50466e().mo43979b(new C11308a(i, new JSONObject(n)));
        if (i == 1203) {
            C11499n.m51312a().mo44566a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m50335u(C11259a aVar) {
        m50331a("current state=" + this.f50571h + ", new state=" + aVar);
        synchronized (this.f50570D) {
            this.f50571h = aVar;
        }
    }

    /* renamed from: x */
    private void m50338x(String str, String str2, int i, String str3, int i2, String str4) {
        this.f50585v = str2;
        this.f50577n = str;
        this.f50588y = i;
        this.f50568B = str3;
        this.f50589z = i2;
        this.f50567A = str4;
    }

    /* renamed from: z */
    private static boolean m50340z(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1213 || i == 1212 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* renamed from: a */
    public final Map<String, Object> mo43912a() {
        try {
            if (mo43923h()) {
                return this.f50598a.getRewardedVideoBiddingData(this.f50601d);
            }
            return null;
        } catch (Throwable th) {
            m50323B("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo43918b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo43913a(int i, Object[][] objArr) {
        m50334t(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo43914a(Placement placement, int i) {
        m50329H();
        m50331a("showVideo()");
        this.f50581r = placement;
        this.f50603f = i;
        m50335u(C11259a.SHOW_IN_PROGRESS);
        mo43913a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f50598a.showRewardedVideo(this.f50601d, this);
        } catch (Throwable th) {
            m50323B("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(1038, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo43915a(String str, String str2, JSONObject jSONObject, int i, String str3, int i2, String str4) {
        C11259a aVar;
        C11259a aVar2;
        m50331a("loadVideo() auctionId: " + str2 + " state: " + this.f50571h);
        this.f50604g = null;
        this.f50600c = false;
        this.f50580q = true;
        synchronized (this.f50570D) {
            aVar = this.f50571h;
            aVar2 = C11259a.LOAD_IN_PROGRESS;
            if (!(aVar == aVar2 || aVar == C11259a.SHOW_IN_PROGRESS)) {
                m50335u(aVar2);
            }
        }
        if (aVar == aVar2) {
            mo43918b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
            this.f50579p = true;
            m50338x(str, str2, i, str3, i2, str4);
            this.f50572i.mo43909b(this, str2);
        } else if (aVar == C11259a.SHOW_IN_PROGRESS) {
            mo43918b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
            this.f50578o = true;
            m50338x(str, str2, i, str3, i2, str4);
        } else {
            this.f50602e = str4;
            this.f50583t = str2;
            this.f50584u = jSONObject;
            this.f50586w = i;
            this.f50587x = str3;
            this.f50603f = i2;
            synchronized (this.f50569C) {
                m50329H();
                Timer timer = new Timer();
                this.f50573j = timer;
                timer.schedule(new C11260b(), (long) (this.f50574k * 1000));
            }
            this.f50582s = new Date().getTime();
            m50333s(1001);
            try {
                if (mo43923h()) {
                    this.f50598a.loadRewardedVideoForBidding(this.f50601d, this, str);
                } else if (aVar == C11259a.NO_INIT) {
                    m50328G();
                    this.f50598a.initRewardedVideo(this.f50575l, this.f50576m, this.f50601d, this);
                } else {
                    this.f50598a.fetchRewardedVideoForAutomaticLoad(this.f50601d, this);
                }
            } catch (Throwable th) {
                m50323B("loadRewardedVideoForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                mo43918b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo43916a(boolean z, int i) {
        this.f50603f = i;
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_STATUS;
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m50334t(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo43917b() {
        m50331a("initForBidding()");
        m50335u(C11259a.INIT_IN_PROGRESS);
        m50328G();
        try {
            this.f50598a.initRewardedVideoForBidding(this.f50575l, this.f50576m, this.f50601d, this);
        } catch (Throwable th) {
            m50323B("initForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: b */
    public final void mo43918b(int i, Object[][] objArr) {
        m50334t(i, objArr, false);
    }

    /* renamed from: c */
    public final boolean mo43919c() {
        try {
            return mo43923h() ? this.f50580q && this.f50571h == C11259a.LOADED && m50327F() : m50327F();
        } catch (Throwable th) {
            m50323B("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo43918b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: f */
    public final void mo43920f() {
        this.f50598a.setMediationState(C11347b.C11348a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m50334t(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    public final void onRewardedVideoAdClicked() {
        m50331a("onRewardedVideoAdClicked");
        this.f50572i.mo43908b(this, this.f50581r);
        mo43913a(1006, (Object[][]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        r12.f50572i.mo43907b(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r12.f50578o == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        m50331a("onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding");
        r12.f50578o = false;
        mo43915a(r12.f50577n, r12.f50585v, r12.f50584u, r12.f50588y, r12.f50568B, r12.f50589z, r12.f50567A);
        m50326E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRewardedVideoAdClosed() {
        /*
            r12 = this;
            java.lang.String r0 = "onRewardedVideoAdClosed"
            r12.m50331a(r0)
            java.lang.Object r0 = r12.f50570D
            monitor-enter(r0)
            com.ironsource.mediationsdk.U$a r1 = r12.f50571h     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.U$a r2 = com.ironsource.mediationsdk.C11258U.C11259a.SHOW_IN_PROGRESS     // Catch:{ all -> 0x0077 }
            r3 = 0
            if (r1 == r2) goto L_0x004b
            r1 = 1203(0x4b3, float:1.686E-42)
            r2 = 0
            r12.mo43913a((int) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0077 }
            r1 = 81316(0x13da4, float:1.13948E-40)
            r2 = 2
            java.lang.Object[][] r4 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "errorCode"
            r5[r3] = r6     // Catch:{ all -> 0x0077 }
            r6 = 5009(0x1391, float:7.019E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0077 }
            r7 = 1
            r5[r7] = r6     // Catch:{ all -> 0x0077 }
            r4[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "reason"
            r2[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "adClosed: "
            r3.<init>(r5)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.U$a r5 = r12.f50571h     // Catch:{ all -> 0x0077 }
            r3.append(r5)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0077 }
            r2[r7] = r3     // Catch:{ all -> 0x0077 }
            r4[r7] = r2     // Catch:{ all -> 0x0077 }
            r12.mo43918b(r1, r4)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x004b:
            com.ironsource.mediationsdk.U$a r1 = com.ironsource.mediationsdk.C11258U.C11259a.NOT_LOADED     // Catch:{ all -> 0x0077 }
            r12.m50335u(r1)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.T r0 = r12.f50572i
            r0.mo43907b(r12)
            boolean r0 = r12.f50578o
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding"
            r12.m50331a(r0)
            r12.f50578o = r3
            java.lang.String r5 = r12.f50577n
            java.lang.String r6 = r12.f50585v
            org.json.JSONObject r7 = r12.f50584u
            int r8 = r12.f50588y
            java.lang.String r9 = r12.f50568B
            int r10 = r12.f50589z
            java.lang.String r11 = r12.f50567A
            r4 = r12
            r4.mo43915a(r5, r6, r7, r8, r9, r10, r11)
            r12.m50326E()
        L_0x0076:
            return
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11258U.onRewardedVideoAdClosed():void");
    }

    public final void onRewardedVideoAdEnded() {
        m50331a("onRewardedVideoAdEnded");
        this.f50572i.mo43911d(this);
        mo43913a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m50331a("onRewardedVideoAdOpened");
        this.f50572i.mo43903a(this);
        mo43913a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m50331a("onRewardedVideoAdRewarded");
        this.f50572i.mo43904a(this, this.f50581r);
        Map<String, Object> n = mo43929n();
        Placement placement = this.f50581r;
        if (placement != null) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f50581r.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f50581r.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C11232E.m50103a().f50423m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C11232E.m50103a().f50423m);
        }
        if (C11232E.m50103a().f50424n != null) {
            for (String next : C11232E.m50103a().f50424n.keySet()) {
                n.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C11232E.m50103a().f50424n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f50583t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f50583t);
        }
        JSONObject jSONObject = this.f50584u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f50584u);
        }
        if (m50340z(1010)) {
            C11296h.m50466e();
            C11284b.m50398a(n, this.f50586w, this.f50587x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f50603f));
        C11308a aVar = new C11308a(1010, new JSONObject(n));
        aVar.mo44039a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.mo44040b(), mo43926k()));
        C11296h.m50466e().mo43979b(aVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m50331a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo43913a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f50570D) {
            if (this.f50571h != C11259a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo43918b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f50571h}});
                return;
            }
            m50335u(C11259a.NOT_LOADED);
            this.f50572i.mo43906a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m50331a("onRewardedVideoAdStarted");
        this.f50572i.mo43910c(this);
        mo43913a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m50331a("onRewardedVideoAdVisible");
        mo43913a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m50331a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f50571h.name());
        synchronized (this.f50570D) {
            if (this.f50571h == C11259a.LOAD_IN_PROGRESS) {
                m50335u(z ? C11259a.LOADED : C11259a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m50329H();
            mo43918b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50330I())}});
            if (this.f50579p) {
                this.f50579p = false;
                m50331a("onRewardedVideoAvailabilityChanged to " + z + "and mShouldLoadAfterLoad is true - calling loadVideo");
                mo43915a(this.f50577n, this.f50585v, this.f50584u, this.f50588y, this.f50568B, this.f50589z, this.f50567A);
                m50326E();
            } else if (z) {
                this.f50572i.mo43905a(this, this.f50583t);
            } else {
                this.f50572i.mo43909b(this, this.f50583t);
            }
        } else if (z) {
            mo43918b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f50571h.name()}});
        } else {
            mo43918b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1034}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50330I())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f50571h.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m50331a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m50329H();
        mo43918b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1033}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50330I())}});
        mo43918b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50330I())}});
        synchronized (this.f50570D) {
            if (this.f50571h != C11259a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo43918b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f50571h}});
                return;
            }
            m50335u(C11259a.NO_INIT);
            this.f50572i.mo43909b(this, this.f50583t);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m50331a("onRewardedVideoInitSuccess");
        synchronized (this.f50570D) {
            if (this.f50571h != C11259a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo43918b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f50571h}});
                return;
            }
            m50335u(C11259a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m50334t(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50330I())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f50604g = Long.valueOf(System.currentTimeMillis());
        }
        m50334t(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m50330I())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
