package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.C4984k;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C11392i;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11431p;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p276a.C11284b;
import com.ironsource.mediationsdk.p276a.C11291c;
import com.ironsource.mediationsdk.p276a.C11296h;
import com.ironsource.mediationsdk.utils.C11483b;
import com.ironsource.mediationsdk.utils.C11484c;
import com.ironsource.mediationsdk.utils.C11497m;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.f0 */
final class C11381f0 extends C11433n implements C4984k, C11257T, C11304ab, C11359c, C11386g, C11507y {

    /* renamed from: A */
    private int f51117A;

    /* renamed from: B */
    private String f51118B = "";

    /* renamed from: C */
    private boolean f51119C = false;

    /* renamed from: D */
    private NetworkStateReceiver f51120D;

    /* renamed from: E */
    private C11504w f51121E;

    /* renamed from: b */
    final ConcurrentHashMap<String, C11258U> f51122b;

    /* renamed from: c */
    private CopyOnWriteArrayList<C11258U> f51123c;

    /* renamed from: d */
    private List<C11291c> f51124d;

    /* renamed from: e */
    private ConcurrentHashMap<String, C11291c> f51125e;

    /* renamed from: f */
    private ConcurrentHashMap<String, C11392i.C11393a> f51126f;

    /* renamed from: g */
    private C11291c f51127g;

    /* renamed from: h */
    C11497m f51128h;

    /* renamed from: i */
    private C11300aa f51129i;

    /* renamed from: j */
    private boolean f51130j;

    /* renamed from: k */
    private boolean f51131k;

    /* renamed from: l */
    private boolean f51132l;

    /* renamed from: m */
    C11389h f51133m;

    /* renamed from: n */
    C11392i f51134n;

    /* renamed from: o */
    private String f51135o;

    /* renamed from: p */
    String f51136p;

    /* renamed from: q */
    JSONObject f51137q;

    /* renamed from: r */
    int f51138r = 1;

    /* renamed from: s */
    long f51139s;

    /* renamed from: t */
    private long f51140t;

    /* renamed from: u */
    private long f51141u;

    /* renamed from: v */
    private int f51142v;

    /* renamed from: w */
    private boolean f51143w;

    /* renamed from: x */
    private boolean f51144x;

    /* renamed from: y */
    private Boolean f51145y;

    /* renamed from: z */
    private C11385d f51146z;

    /* renamed from: com.ironsource.mediationsdk.f0$a */
    class C11382a extends TimerTask {
        C11382a() {
        }

        public final void run() {
            C11381f0 f0Var = C11381f0.this;
            f0Var.mo44262i(C11385d.RV_STATE_AUCTION_IN_PROGRESS);
            AsyncTask.execute(new C11383b());
        }
    }

    /* renamed from: com.ironsource.mediationsdk.f0$b */
    class C11383b implements Runnable {
        C11383b() {
        }

        public final void run() {
            StringBuilder sb;
            C11381f0.m50874a("makeAuction()");
            C11381f0 f0Var = C11381f0.this;
            f0Var.f51136p = "";
            f0Var.f51137q = null;
            f0Var.f51139s = new Date().getTime();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            for (C11258U next : C11381f0.this.f51122b.values()) {
                if (next.mo43923h()) {
                    next.f50580q = false;
                }
                if (!C11381f0.this.f51128h.mo44565b(next)) {
                    if (next.mo43923h()) {
                        Map<String, Object> a = next.mo43912a();
                        if (a != null) {
                            hashMap.put(next.mo43926k(), a);
                            sb = new StringBuilder();
                        }
                    } else {
                        arrayList.add(next.mo43926k());
                        sb = new StringBuilder();
                    }
                    sb.append(next.mo43924i());
                    sb.append(next.mo43926k());
                    sb.append(",");
                    sb2.append(sb.toString());
                }
            }
            if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                C11381f0.this.mo44263m(IronSourceConstants.RV_AUCTION_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
                C11381f0.m50874a("makeAuction() failed - No candidates available for auctioning");
                C11381f0.this.mo44265w();
                return;
            }
            C11381f0.m50874a("makeAuction() - request waterfall is: " + sb2);
            C11381f0.this.mo44260e(1000);
            C11381f0.this.mo44260e(IronSourceConstants.RV_AUCTION_REQUEST);
            C11381f0.this.mo44261f(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
            C11389h hVar = C11381f0.this.f51133m;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C11381f0 f0Var2 = C11381f0.this;
            hVar.mo44287a(applicationContext, (Map<String, Object>) hashMap, (List<String>) arrayList, f0Var2.f51134n, f0Var2.f51138r);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.f0$c */
    class C11384c extends TimerTask {
        C11384c() {
        }

        public final void run() {
            C11381f0.this.mo44264u();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.f0$d */
    enum C11385d {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11381f0(List<NetworkSettings> list, C11431p pVar, String str, String str2, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        C11431p pVar2 = pVar;
        long time = new Date().getTime();
        mo44260e(IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo44262i(C11385d.RV_STATE_INITIATING);
        this.f51145y = null;
        this.f51142v = pVar2.f51426c;
        this.f51143w = pVar2.f51427d;
        this.f51135o = "";
        C11483b bVar = pVar2.f51435l;
        this.f51144x = false;
        this.f51123c = new CopyOnWriteArrayList<>();
        this.f51124d = new ArrayList();
        this.f51125e = new ConcurrentHashMap<>();
        this.f51126f = new ConcurrentHashMap<>();
        this.f51141u = new Date().getTime();
        boolean z = bVar.f51536e > 0;
        this.f51130j = z;
        this.f51131k = bVar.f51544m;
        this.f51132l = !bVar.f51545n;
        this.f51140t = bVar.f51543l;
        if (z) {
            this.f51133m = new C11389h("rewardedVideo", bVar, this);
        }
        this.f51129i = new C11300aa(bVar, this);
        this.f51122b = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C11369d.m50788a().mo44228a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C11372e a2 = C11372e.m50812a();
                if (a2.mo44245b(a, a2.f51073b, "rewarded video")) {
                    C11258U u = r0;
                    C11258U u2 = new C11258U(str, str2, next, this, pVar2.f51428e, a);
                    String k = u.mo43926k();
                    this.f51122b.put(k, u);
                    arrayList.add(k);
                }
            }
        }
        this.f51134n = new C11392i(arrayList, bVar.f51537f);
        this.f51128h = new C11497m(new ArrayList(this.f51122b.values()));
        for (C11258U next2 : this.f51122b.values()) {
            if (next2.mo43923h()) {
                next2.mo43917b();
            }
        }
        mo44261f(IronSourceConstants.RV_MANAGER_INIT_ENDED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        this.f51121E = new C11504w(pVar2.f51432i, this);
        m50877h(bVar.f51540i);
    }

    /* renamed from: a */
    static void m50874a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 0);
    }

    /* renamed from: d */
    private String m50875d(C11291c cVar) {
        C11258U u = this.f51122b.get(cVar.mo44004a());
        String num = u != null ? Integer.toString(u.mo43924i()) : TextUtils.isEmpty(cVar.mo44005b()) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "2";
        return num + cVar.mo44004a();
    }

    /* renamed from: g */
    private void m50876g(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (z2 && !TextUtils.isEmpty(this.f51136p)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f51136p);
        }
        JSONObject jSONObject = this.f51137q;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f51137q);
        }
        if (z && !TextUtils.isEmpty(this.f51135o)) {
            hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f51135o);
        }
        if (m50887t(i)) {
            C11296h.m50466e();
            C11284b.m50398a(hashMap, this.f51117A, this.f51118B);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f51138r));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "ProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11296h.m50466e().mo43979b(new C11308a(i, new JSONObject(hashMap)));
    }

    /* renamed from: h */
    private void m50877h(long j) {
        if (this.f51128h.mo44564a()) {
            mo44263m(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo44265w();
        } else if (this.f51130j) {
            if (!this.f51126f.isEmpty()) {
                this.f51134n.mo44295a(this.f51126f);
                this.f51126f.clear();
            }
            new Timer().schedule(new C11382a(), j);
        } else {
            IronLog.INTERNAL.info("auction is disabled, fallback flow will occur");
            m50889x();
            if (this.f51124d.isEmpty()) {
                mo44263m(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
                mo44265w();
                return;
            }
            mo44260e(1000);
            if (!this.f51132l || !this.f51144x) {
                mo44264u();
            }
        }
    }

    /* renamed from: j */
    private void m50878j(List<C11291c> list) {
        this.f51124d = list;
        StringBuilder sb = new StringBuilder();
        for (C11291c d : list) {
            sb.append(m50875d(d) + ",");
        }
        m50874a("updateNextWaterfallToLoad() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m50874a("Updated waterfall is empty");
        }
        mo44263m(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: k */
    private void m50879k(boolean z, Map<String, Object> map) {
        Boolean bool = this.f51145y;
        if (bool == null || bool.booleanValue() != z) {
            this.f51145y = Boolean.valueOf(z);
            long time = new Date().getTime() - this.f51141u;
            this.f51141u = new Date().getTime();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
            mo44263m(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
            C11270X.m50368a().mo43944a(z);
        }
    }

    /* renamed from: l */
    private void m50880l(int i) {
        m50876g(i, new HashMap(), true, true);
    }

    /* renamed from: n */
    private static void m50881n(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 3);
    }

    /* renamed from: o */
    private void m50882o(List<C11291c> list) {
        this.f51123c.clear();
        this.f51125e.clear();
        this.f51126f.clear();
        for (C11291c next : list) {
            C11258U u = this.f51122b.get(next.mo44004a());
            if (u != null) {
                u.f50600c = true;
                this.f51123c.add(u);
                this.f51125e.put(u.mo43926k(), next);
                this.f51126f.put(next.mo44004a(), C11392i.C11393a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m50874a("updateWaterfall() - could not find matching smash for auction response item " + next.mo44004a());
            }
        }
        this.f51124d.clear();
    }

    /* renamed from: p */
    private void m50883p(boolean z) {
        m50879k(z, new HashMap());
    }

    /* renamed from: q */
    private void m50884q(int i, Map<String, Object> map) {
        m50876g(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: r */
    private static void m50885r(C11258U u, String str) {
        String str2 = u.mo43926k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str2, 0);
    }

    /* renamed from: s */
    private static void m50886s(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: t */
    private static boolean m50887t(int i) {
        return i == 1003 || i == 1302 || i == 1301;
    }

    /* renamed from: v */
    private void m50888v(C11258U u) {
        String b = this.f51125e.get(u.mo43926k()).mo44005b();
        C11377f.m50856a();
        C11258U u2 = u;
        u2.mo43915a(b, this.f51136p, this.f51137q, this.f51117A, this.f51118B, this.f51138r, C11377f.m50861d(b));
    }

    /* renamed from: x */
    private void m50889x() {
        this.f51136p = C11433n.m51092c();
        m50878j(m50890y());
    }

    /* renamed from: y */
    private List<C11291c> m50890y() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C11258U next : this.f51122b.values()) {
            if (!next.mo43923h() && !this.f51128h.mo44565b(next)) {
                copyOnWriteArrayList.add(new C11291c(next.mo43926k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: z */
    private void m50891z() {
        if (this.f51123c.isEmpty()) {
            mo44263m(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo44265w();
            return;
        }
        mo44262i(C11385d.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f51123c.size() && i < this.f51142v; i2++) {
            C11258U u = this.f51123c.get(i2);
            if (u.f50600c) {
                if (!this.f51143w || !u.mo43923h()) {
                    m50888v(u);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + u.mo43926k() + ". No other instances will be loaded at the same time.";
                    m50874a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m50888v(u);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + u.mo43926k() + " as a non bidder is being loaded";
                    m50874a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo43850a(int i, String str, int i2, String str2, long j) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m50874a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f51117A = i2;
        this.f51118B = str2;
        this.f51137q = null;
        m50889x();
        if (TextUtils.isEmpty(str)) {
            map = C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            map = C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        mo44263m(IronSourceConstants.RV_AUCTION_FAILED, map);
        if (!this.f51132l || !this.f51144x) {
            mo44264u();
        }
    }

    /* renamed from: a */
    public final void mo44197a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f51119C = z;
            if (z) {
                if (this.f51120D == null) {
                    this.f51120D = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f51120D, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f51120D != null) {
                context.getApplicationContext().unregisterReceiver(this.f51120D);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo43903a(C11258U u) {
        synchronized (this) {
            this.f51138r++;
            m50885r(u, "onRewardedVideoAdOpened");
            C11270X.m50368a().mo43948c();
            if (this.f51130j) {
                C11291c cVar = this.f51125e.get(u.mo43926k());
                if (cVar != null) {
                    C11389h.m50959a(cVar, u.mo43924i(), this.f51127g, this.f51135o);
                    this.f51126f.put(u.mo43926k(), C11392i.C11393a.ISAuctionPerformanceShowedSuccessfully);
                    mo44447a(cVar, this.f51135o);
                } else {
                    String k = u.mo43926k();
                    m50881n("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                    mo44263m(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f51146z}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
                }
            }
            this.f51129i.mo44029a();
        }
    }

    /* renamed from: a */
    public final void mo43904a(C11258U u, Placement placement) {
        m50885r(u, "onRewardedVideoAdRewarded");
        C11270X.m50368a().mo43942a(placement);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x013b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43905a(com.ironsource.mediationsdk.C11258U r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "onLoadSuccess "
            m50885r(r12, r0)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = r11.f51136p     // Catch:{ all -> 0x013c }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0060
            boolean r0 = r13.equalsIgnoreCase(r0)     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x0060
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            java.lang.String r4 = "onLoadSuccess was invoked with auctionId: "
            r0.<init>(r4)     // Catch:{ all -> 0x013c }
            r0.append(r13)     // Catch:{ all -> 0x013c }
            java.lang.String r13 = " and the current id is "
            r0.append(r13)     // Catch:{ all -> 0x013c }
            java.lang.String r13 = r11.f51136p     // Catch:{ all -> 0x013c }
            r0.append(r13)     // Catch:{ all -> 0x013c }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x013c }
            m50874a((java.lang.String) r13)     // Catch:{ all -> 0x013c }
            r13 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r2][]     // Catch:{ all -> 0x013c }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x013c }
            java.lang.String r5 = "errorCode"
            r4[r1] = r5     // Catch:{ all -> 0x013c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x013c }
            r4[r3] = r5     // Catch:{ all -> 0x013c }
            r0[r1] = r4     // Catch:{ all -> 0x013c }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x013c }
            java.lang.String r4 = "reason"
            r2[r1] = r4     // Catch:{ all -> 0x013c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            java.lang.String r4 = "onLoadSuccess wrong auction ID "
            r1.<init>(r4)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.f0$d r4 = r11.f51146z     // Catch:{ all -> 0x013c }
            r1.append(r4)     // Catch:{ all -> 0x013c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x013c }
            r2[r3] = r1     // Catch:{ all -> 0x013c }
            r0[r3] = r2     // Catch:{ all -> 0x013c }
            r12.mo43918b(r13, r0)     // Catch:{ all -> 0x013c }
            monitor-exit(r11)
            return
        L_0x0060:
            com.ironsource.mediationsdk.f0$d r0 = r11.f51146z     // Catch:{ all -> 0x013c }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r4 = r11.f51126f     // Catch:{ all -> 0x013c }
            java.lang.String r5 = r12.mo43926k()     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.i$a r6 = com.ironsource.mediationsdk.C11392i.C11393a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x013c }
            r4.put(r5, r6)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.f0$d r4 = r11.f51146z     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.f0$d r5 = com.ironsource.mediationsdk.C11381f0.C11385d.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x013c }
            if (r4 != r5) goto L_0x013a
            r11.m50883p(r3)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.f0$d r4 = com.ironsource.mediationsdk.C11381f0.C11385d.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x013c }
            r11.mo44262i(r4)     // Catch:{ all -> 0x013c }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x013c }
            r4.<init>()     // Catch:{ all -> 0x013c }
            long r4 = r4.getTime()     // Catch:{ all -> 0x013c }
            long r6 = r11.f51139s     // Catch:{ all -> 0x013c }
            long r4 = r4 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x013c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x013c }
            java.lang.String r9 = "duration"
            r8[r1] = r9     // Catch:{ all -> 0x013c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x013c }
            r8[r3] = r4     // Catch:{ all -> 0x013c }
            r7[r1] = r8     // Catch:{ all -> 0x013c }
            java.util.Map r4 = com.ironsource.environment.C4952a.C49531.m22720a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x013c }
            r11.mo44263m(r6, r4)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.w r4 = r11.f51121E     // Catch:{ all -> 0x013c }
            r5 = 0
            r4.mo44584a(r5)     // Catch:{ all -> 0x013c }
            boolean r4 = r11.f51130j     // Catch:{ all -> 0x013c }
            if (r4 == 0) goto L_0x013a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.a.c> r4 = r11.f51125e     // Catch:{ all -> 0x013c }
            java.lang.String r5 = r12.mo43926k()     // Catch:{ all -> 0x013c }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x013c }
            r10 = r4
            com.ironsource.mediationsdk.a.c r10 = (com.ironsource.mediationsdk.p276a.C11291c) r10     // Catch:{ all -> 0x013c }
            if (r10 == 0) goto L_0x00d4
            int r13 = r12.mo43924i()     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.a.c r0 = r11.f51127g     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.C11389h.m50958a(r10, r13, r0)     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.h r5 = r11.f51133m     // Catch:{ all -> 0x013c }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.U> r6 = r11.f51123c     // Catch:{ all -> 0x013c }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.a.c> r7 = r11.f51125e     // Catch:{ all -> 0x013c }
            int r8 = r12.mo43924i()     // Catch:{ all -> 0x013c }
            com.ironsource.mediationsdk.a.c r9 = r11.f51127g     // Catch:{ all -> 0x013c }
            r5.mo44288a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C11261V>) r6, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.p276a.C11291c>) r7, (int) r8, (com.ironsource.mediationsdk.p276a.C11291c) r9, (com.ironsource.mediationsdk.p276a.C11291c) r10)     // Catch:{ all -> 0x013c }
            monitor-exit(r11)
            return
        L_0x00d4:
            java.lang.String r12 = r12.mo43926k()     // Catch:{ all -> 0x013c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            java.lang.String r5 = "onLoadSuccess winner instance "
            r4.<init>(r5)     // Catch:{ all -> 0x013c }
            r4.append(r12)     // Catch:{ all -> 0x013c }
            java.lang.String r5 = " missing from waterfall. auctionId: "
            r4.append(r5)     // Catch:{ all -> 0x013c }
            r4.append(r13)     // Catch:{ all -> 0x013c }
            java.lang.String r13 = " and the current id is "
            r4.append(r13)     // Catch:{ all -> 0x013c }
            java.lang.String r13 = r11.f51136p     // Catch:{ all -> 0x013c }
            r4.append(r13)     // Catch:{ all -> 0x013c }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x013c }
            m50881n(r13)     // Catch:{ all -> 0x013c }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r4 = 3
            java.lang.Object[][] r4 = new java.lang.Object[r4][]     // Catch:{ all -> 0x013c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x013c }
            java.lang.String r6 = "errorCode"
            r5[r1] = r6     // Catch:{ all -> 0x013c }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x013c }
            r5[r3] = r6     // Catch:{ all -> 0x013c }
            r4[r1] = r5     // Catch:{ all -> 0x013c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x013c }
            java.lang.String r6 = "reason"
            r5[r1] = r6     // Catch:{ all -> 0x013c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            java.lang.String r7 = "Loaded missing "
            r6.<init>(r7)     // Catch:{ all -> 0x013c }
            r6.append(r0)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x013c }
            r5[r3] = r0     // Catch:{ all -> 0x013c }
            r4[r3] = r5     // Catch:{ all -> 0x013c }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x013c }
            java.lang.String r5 = "ext1"
            r0[r1] = r5     // Catch:{ all -> 0x013c }
            r0[r3] = r12     // Catch:{ all -> 0x013c }
            r4[r2] = r0     // Catch:{ all -> 0x013c }
            java.util.Map r12 = com.ironsource.environment.C4952a.C49531.m22720a((java.lang.Object[][]) r4)     // Catch:{ all -> 0x013c }
            r11.mo44263m(r13, r12)     // Catch:{ all -> 0x013c }
        L_0x013a:
            monitor-exit(r11)
            return
        L_0x013c:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11381f0.mo43905a(com.ironsource.mediationsdk.U, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo43906a(IronSourceError ironSourceError, C11258U u) {
        synchronized (this) {
            m50885r(u, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
            m50884q(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
            C11270X.m50368a().mo43946b(ironSourceError);
            this.f51144x = false;
            this.f51126f.put(u.mo43926k(), C11392i.C11393a.ISAuctionPerformanceFailedToShow);
            if (this.f51146z != C11385d.RV_STATE_READY_TO_SHOW) {
                m50883p(false);
            }
            this.f51129i.mo44031c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo44198a(Placement placement) {
        if (placement == null) {
            m50886s("showRewardedVideo error: empty default placement");
            C11270X.m50368a().mo43946b(new IronSourceError(1021, "showRewardedVideo error: empty default placement"));
            m50876g(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
            return;
        }
        this.f51135o = placement.getPlacementName();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 1);
        m50880l(IronSourceConstants.RV_API_SHOW_CALLED);
        if (this.f51144x) {
            m50886s("showRewardedVideo error: can't show ad while an ad is already showing");
            C11270X.m50368a().mo43946b(new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing"));
            m50884q(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
        } else if (this.f51146z != C11385d.RV_STATE_READY_TO_SHOW) {
            m50886s("showRewardedVideo error: show called while no ads are available");
            C11270X.m50368a().mo43946b(new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available"));
            m50884q(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
        } else if (C11484c.m51245c(ContextProvider.getInstance().getApplicationContext(), this.f51135o)) {
            String str = "showRewardedVideo error: placement " + this.f51135o + " is capped";
            m50886s(str);
            C11270X.m50368a().mo43946b(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str));
            m50884q(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<C11258U> it = this.f51123c.iterator();
            while (it.hasNext()) {
                C11258U next = it.next();
                if (next.mo43919c()) {
                    this.f51144x = true;
                    next.mo43916a(true, this.f51138r);
                    m50874a("showVideo()");
                    this.f51128h.mo44563a(next);
                    if (this.f51128h.mo44565b(next)) {
                        next.mo43920f();
                        IronSourceUtils.sendAutomationLog(next.mo43926k() + " rewarded video is now session capped");
                    }
                    C11484c.m51248e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                    if (C11484c.m51245c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                        m50880l(IronSourceConstants.RV_CAP_PLACEMENT);
                    }
                    this.f51121E.mo44583a();
                    next.mo43914a(placement, this.f51138r);
                    mo44262i(C11385d.RV_STATE_NOT_LOADED);
                    return;
                }
                if (next.mo43930o() != null) {
                    stringBuffer.append(next.mo43926k() + ":" + next.mo43930o() + ",");
                }
                next.mo43916a(false, this.f51138r);
            }
            m50874a("showRewardedVideo(): No ads to show");
            C11270X.m50368a().mo43946b(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo(): No ads to show");
            if (stringBuffer.length() != 0) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            }
            m50884q(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, hashMap);
            this.f51129i.mo44031c();
        }
    }

    /* renamed from: a */
    public final void mo43855a(List<C11291c> list, String str, C11291c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        m50874a("makeAuction(): success");
        this.f51136p = str;
        this.f51127g = cVar;
        this.f51137q = jSONObject;
        this.f51117A = i;
        this.f51118B = "";
        mo44263m(IronSourceConstants.RV_AUCTION_SUCCESS, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        m50878j(list);
        if (!TextUtils.isEmpty(str2)) {
            mo44263m(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        if (!this.f51132l || !this.f51144x) {
            mo44264u();
        }
    }

    /* renamed from: a */
    public final void mo20593a(boolean z) {
        if (this.f51119C) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z2 = true;
            logger.log(ironSourceTag, "Network Availability Changed To: " + z, 1);
            Boolean bool = this.f51145y;
            boolean z3 = false;
            if (bool != null) {
                if ((!z || bool.booleanValue() || !mo44199a_()) && (z || !this.f51145y.booleanValue())) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (z3) {
                m50883p(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return false;
     */
    /* renamed from: a_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo44199a_() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f51119C     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0040 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0040 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r3)
            return r1
        L_0x0016:
            com.ironsource.mediationsdk.f0$d r0 = r3.f51146z     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.f0$d r2 = com.ironsource.mediationsdk.C11381f0.C11385d.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0040 }
            if (r0 != r2) goto L_0x003e
            boolean r0 = r3.f51144x     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.U> r0 = r3.f51123c     // Catch:{ all -> 0x0040 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0040 }
        L_0x0027:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.U r2 = (com.ironsource.mediationsdk.C11258U) r2     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.mo43919c()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0027
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x003c:
            monitor-exit(r3)
            return r1
        L_0x003e:
            monitor-exit(r3)
            return r1
        L_0x0040:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x0044
        L_0x0043:
            throw r0
        L_0x0044:
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11381f0.mo44199a_():boolean");
    }

    /* renamed from: b */
    public final void mo43907b(C11258U u) {
        synchronized (this) {
            u.mo43913a((int) IronSourceConstants.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = false"}});
            m50885r(u, "onRewardedVideoAdClosed, mediation state: " + this.f51146z.name());
            C11270X.m50368a().mo43949d();
            this.f51144x = false;
            if (this.f51146z != C11385d.RV_STATE_READY_TO_SHOW) {
                m50883p(false);
            }
            if (this.f51131k) {
                List<C11291c> list = this.f51124d;
                if (list != null && list.size() > 0) {
                    new Timer().schedule(new C11384c(), this.f51140t);
                }
            } else {
                this.f51129i.mo44030b();
            }
        }
    }

    /* renamed from: b */
    public final void mo43908b(C11258U u, Placement placement) {
        m50885r(u, "onRewardedVideoAdClicked");
        C11270X.m50368a().mo43947b(placement);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0157, code lost:
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015f, code lost:
        if (r9.hasNext() == false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0161, code lost:
        m50888v((com.ironsource.mediationsdk.C11258U) r9.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016b, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43909b(com.ironsource.mediationsdk.C11258U r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            java.lang.String r2 = "onLoadError state="
            r1.<init>(r2)     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.f0$d r2 = r8.f51146z     // Catch:{ all -> 0x016c }
            r1.append(r2)     // Catch:{ all -> 0x016c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x016c }
            m50885r(r9, r1)     // Catch:{ all -> 0x016c }
            java.lang.String r1 = r8.f51136p     // Catch:{ all -> 0x016c }
            boolean r1 = r10.equalsIgnoreCase(r1)     // Catch:{ all -> 0x016c }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0072
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            java.lang.String r1 = "onLoadError was invoked with auctionId:"
            r0.<init>(r1)     // Catch:{ all -> 0x016c }
            r0.append(r10)     // Catch:{ all -> 0x016c }
            java.lang.String r10 = " and the current id is "
            r0.append(r10)     // Catch:{ all -> 0x016c }
            java.lang.String r10 = r8.f51136p     // Catch:{ all -> 0x016c }
            r0.append(r10)     // Catch:{ all -> 0x016c }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x016c }
            m50874a((java.lang.String) r10)     // Catch:{ all -> 0x016c }
            r10 = 81315(0x13da3, float:1.13947E-40)
            r0 = 2
            java.lang.Object[][] r1 = new java.lang.Object[r0][]     // Catch:{ all -> 0x016c }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x016c }
            java.lang.String r5 = "errorCode"
            r4[r3] = r5     // Catch:{ all -> 0x016c }
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x016c }
            r4[r2] = r5     // Catch:{ all -> 0x016c }
            r1[r3] = r4     // Catch:{ all -> 0x016c }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x016c }
            java.lang.String r4 = "reason"
            r0[r3] = r4     // Catch:{ all -> 0x016c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            java.lang.String r4 = "loadError wrong auction ID "
            r3.<init>(r4)     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.f0$d r4 = r8.f51146z     // Catch:{ all -> 0x016c }
            r3.append(r4)     // Catch:{ all -> 0x016c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x016c }
            r0[r2] = r3     // Catch:{ all -> 0x016c }
            r1[r2] = r0     // Catch:{ all -> 0x016c }
            r9.mo43918b(r10, r1)     // Catch:{ all -> 0x016c }
            monitor-exit(r8)     // Catch:{ all -> 0x016c }
            return
        L_0x0072:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r10 = r8.f51126f     // Catch:{ all -> 0x016c }
            java.lang.String r1 = r9.mo43926k()     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.i$a r4 = com.ironsource.mediationsdk.C11392i.C11393a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x016c }
            r10.put(r1, r4)     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.f0$d r10 = r8.f51146z     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.f0$d r1 = com.ironsource.mediationsdk.C11381f0.C11385d.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x016c }
            if (r10 == r1) goto L_0x0089
            com.ironsource.mediationsdk.f0$d r1 = com.ironsource.mediationsdk.C11381f0.C11385d.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x016c }
            if (r10 == r1) goto L_0x0089
            monitor-exit(r8)     // Catch:{ all -> 0x016c }
            return
        L_0x0089:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.U> r10 = r8.f51123c     // Catch:{ all -> 0x016c }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x016c }
            r1 = 0
            r4 = 0
        L_0x0091:
            boolean r5 = r10.hasNext()     // Catch:{ all -> 0x016c }
            if (r5 == 0) goto L_0x013a
            java.lang.Object r5 = r10.next()     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.U r5 = (com.ironsource.mediationsdk.C11258U) r5     // Catch:{ all -> 0x016c }
            boolean r6 = r5.f50600c     // Catch:{ all -> 0x016c }
            if (r6 == 0) goto L_0x011e
            boolean r6 = r8.f51143w     // Catch:{ all -> 0x016c }
            if (r6 == 0) goto L_0x00f6
            boolean r6 = r5.mo43923h()     // Catch:{ all -> 0x016c }
            if (r6 == 0) goto L_0x00f6
            if (r1 != 0) goto L_0x00ce
            if (r4 == 0) goto L_0x00b0
            goto L_0x00ce
        L_0x00b0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            java.lang.String r7 = "Advanced Loading: Starting to load bidder "
            r6.<init>(r7)     // Catch:{ all -> 0x016c }
            java.lang.String r7 = r5.mo43926k()     // Catch:{ all -> 0x016c }
            r6.append(r7)     // Catch:{ all -> 0x016c }
            java.lang.String r7 = ". No other instances will be loaded at the same time."
            r6.append(r7)     // Catch:{ all -> 0x016c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x016c }
            m50874a((java.lang.String) r6)     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6)     // Catch:{ all -> 0x016c }
            goto L_0x00f6
        L_0x00ce:
            if (r1 == 0) goto L_0x00d3
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00d5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            java.lang.String r2 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r2)     // Catch:{ all -> 0x016c }
            java.lang.String r2 = r5.mo43926k()     // Catch:{ all -> 0x016c }
            r10.append(r2)     // Catch:{ all -> 0x016c }
            java.lang.String r2 = " as "
            r10.append(r2)     // Catch:{ all -> 0x016c }
            r10.append(r9)     // Catch:{ all -> 0x016c }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x016c }
            m50874a((java.lang.String) r9)     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x016c }
            goto L_0x013a
        L_0x00f6:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.a.c> r6 = r8.f51125e     // Catch:{ all -> 0x016c }
            java.lang.String r7 = r5.mo43926k()     // Catch:{ all -> 0x016c }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x016c }
            if (r6 == 0) goto L_0x0091
            r0.add(r5)     // Catch:{ all -> 0x016c }
            boolean r6 = r8.f51143w     // Catch:{ all -> 0x016c }
            if (r6 == 0) goto L_0x013a
            boolean r6 = r9.mo43923h()     // Catch:{ all -> 0x016c }
            if (r6 == 0) goto L_0x013a
            boolean r5 = r5.mo43923h()     // Catch:{ all -> 0x016c }
            if (r5 != 0) goto L_0x013a
            int r5 = r0.size()     // Catch:{ all -> 0x016c }
            int r6 = r8.f51142v     // Catch:{ all -> 0x016c }
            if (r5 >= r6) goto L_0x013a
            goto L_0x012e
        L_0x011e:
            com.ironsource.mediationsdk.U$a r6 = r5.f50571h     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.U$a r7 = com.ironsource.mediationsdk.C11258U.C11259a.INIT_IN_PROGRESS     // Catch:{ all -> 0x016c }
            if (r6 == r7) goto L_0x012b
            com.ironsource.mediationsdk.U$a r7 = com.ironsource.mediationsdk.C11258U.C11259a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x016c }
            if (r6 != r7) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r6 = 0
            goto L_0x012c
        L_0x012b:
            r6 = 1
        L_0x012c:
            if (r6 == 0) goto L_0x0131
        L_0x012e:
            r1 = 1
            goto L_0x0091
        L_0x0131:
            boolean r5 = r5.mo43919c()     // Catch:{ all -> 0x016c }
            if (r5 == 0) goto L_0x0091
            r4 = 1
            goto L_0x0091
        L_0x013a:
            int r9 = r0.size()     // Catch:{ all -> 0x016c }
            if (r9 != 0) goto L_0x0156
            if (r4 != 0) goto L_0x0156
            if (r1 != 0) goto L_0x0156
            java.lang.String r9 = "onLoadError(): No other available smashes"
            m50874a((java.lang.String) r9)     // Catch:{ all -> 0x016c }
            r8.m50883p(r3)     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.f0$d r9 = com.ironsource.mediationsdk.C11381f0.C11385d.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x016c }
            r8.mo44262i(r9)     // Catch:{ all -> 0x016c }
            com.ironsource.mediationsdk.aa r9 = r8.f51129i     // Catch:{ all -> 0x016c }
            r9.mo44032d()     // Catch:{ all -> 0x016c }
        L_0x0156:
            monitor-exit(r8)     // Catch:{ all -> 0x016c }
            java.util.Iterator r9 = r0.iterator()
        L_0x015b:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x016b
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.U r10 = (com.ironsource.mediationsdk.C11258U) r10
            r8.m50888v(r10)
            goto L_0x015b
        L_0x016b:
            return
        L_0x016c:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x016c }
            goto L_0x0170
        L_0x016f:
            throw r9
        L_0x0170:
            goto L_0x016f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11381f0.mo43909b(com.ironsource.mediationsdk.U, java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo43910c(C11258U u) {
        m50885r(u, "onRewardedVideoAdStarted");
        C11270X.m50368a().mo43950e();
    }

    /* renamed from: c_ */
    public final void mo44142c_() {
        mo44262i(C11385d.RV_STATE_NOT_LOADED);
        m50879k(false, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m50877h(0);
    }

    /* renamed from: d */
    public final synchronized void mo44036d() {
        m50874a("onLoadTriggered: RV load was triggered in " + this.f51146z + " state");
        m50877h(0);
    }

    /* renamed from: d */
    public final void mo43911d(C11258U u) {
        m50885r(u, "onRewardedVideoAdEnded");
        C11270X.m50368a().mo43951f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo44260e(int i) {
        m50876g(i, new HashMap(), false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo44261f(int i, Map<String, Object> map) {
        m50876g(i, map, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo44262i(C11385d dVar) {
        m50874a("current state=" + this.f51146z + ", new state=" + dVar);
        this.f51146z = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo44263m(int i, Map<String, Object> map) {
        m50876g(i, map, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo44264u() {
        m50882o(this.f51124d);
        m50891z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo44265w() {
        mo44262i(C11385d.RV_STATE_NOT_LOADED);
        m50883p(false);
        this.f51129i.mo44032d();
    }
}
