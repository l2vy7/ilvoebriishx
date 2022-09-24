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
import com.ironsource.mediationsdk.C11236G;
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
import com.ironsource.mediationsdk.utils.C11497m;
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

/* renamed from: com.ironsource.mediationsdk.b0 */
final class C11355b0 extends C11433n implements C4984k, C11239H, C11304ab, C11359c, C11386g, C11507y {

    /* renamed from: A */
    private C11504w f50968A;

    /* renamed from: b */
    C11240I f50969b;

    /* renamed from: c */
    private ConcurrentHashMap<String, C11291c> f50970c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C11392i.C11393a> f50971d;

    /* renamed from: e */
    private C11291c f50972e;

    /* renamed from: f */
    C11392i f50973f;

    /* renamed from: g */
    C11389h f50974g;

    /* renamed from: h */
    private JSONObject f50975h;

    /* renamed from: i */
    private C11300aa f50976i;

    /* renamed from: j */
    private boolean f50977j;

    /* renamed from: k */
    long f50978k;

    /* renamed from: l */
    private String f50979l = "";

    /* renamed from: m */
    private int f50980m;

    /* renamed from: n */
    private NetworkStateReceiver f50981n;

    /* renamed from: o */
    private boolean f50982o = false;

    /* renamed from: p */
    final ConcurrentHashMap<String, C11236G> f50983p;

    /* renamed from: q */
    C11497m f50984q;

    /* renamed from: r */
    int f50985r = 1;

    /* renamed from: s */
    private String f50986s;

    /* renamed from: t */
    private int f50987t;

    /* renamed from: u */
    private boolean f50988u;

    /* renamed from: v */
    private boolean f50989v;

    /* renamed from: w */
    C11358c f50990w;

    /* renamed from: x */
    private long f50991x;

    /* renamed from: y */
    private Boolean f50992y;

    /* renamed from: z */
    final Object f50993z = new Object();

    /* renamed from: com.ironsource.mediationsdk.b0$a */
    class C11356a extends TimerTask {
        C11356a() {
        }

        public final void run() {
            C11355b0 b0Var = C11355b0.this;
            synchronized (b0Var.f50993z) {
                C11358c cVar = b0Var.f50990w;
                C11358c cVar2 = C11358c.RV_STATE_AUCTION_IN_PROGRESS;
                if (cVar != cVar2) {
                    b0Var.mo44202i(cVar2);
                    AsyncTask.execute(new C11357b());
                }
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.b0$b */
    class C11357b implements Runnable {
        C11357b() {
        }

        public final void run() {
            StringBuilder sb;
            C11355b0.m50726a("makeAuction()");
            C11355b0.this.f50978k = new Date().getTime();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            for (C11236G next : C11355b0.this.f50983p.values()) {
                if (!C11355b0.this.f50984q.mo44565b(next) && C11355b0.this.f50969b.mo43820b(next)) {
                    if (next.mo43923h()) {
                        Map<String, Object> a = next.mo43783a();
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
                C11355b0.this.mo44203m(IronSourceConstants.RV_AUCTION_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
                C11355b0.m50726a("makeAuction() failed - No candidates available for auctioning");
                C11355b0.this.mo44204s();
                return;
            }
            C11355b0.m50726a("makeAuction() - request waterfall is: " + sb2);
            C11355b0.this.mo44200e(1000);
            C11355b0.this.mo44200e((int) IronSourceConstants.RV_AUCTION_REQUEST);
            C11355b0.this.mo44201f(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
            C11389h hVar = C11355b0.this.f50974g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C11355b0 b0Var = C11355b0.this;
            hVar.mo44287a(applicationContext, (Map<String, Object>) hashMap, (List<String>) arrayList, b0Var.f50973f, b0Var.f50985r);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.b0$c */
    enum C11358c {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11355b0(List<NetworkSettings> list, C11431p pVar, String str, String str2, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        C11431p pVar2 = pVar;
        long time = new Date().getTime();
        mo44200e((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo44202i(C11358c.RV_STATE_INITIATING);
        this.f50992y = null;
        this.f50987t = pVar2.f51426c;
        this.f50988u = pVar2.f51427d;
        this.f50986s = "";
        this.f50975h = null;
        C11483b bVar = pVar2.f51435l;
        this.f50989v = false;
        this.f50969b = new C11240I(bVar.f51546o, bVar.f51538g);
        this.f50970c = new ConcurrentHashMap<>();
        this.f50971d = new ConcurrentHashMap<>();
        this.f50991x = new Date().getTime();
        boolean z = bVar.f51536e > 0;
        this.f50977j = z;
        if (z) {
            this.f50974g = new C11389h("rewardedVideo", bVar, this);
        }
        this.f50976i = new C11300aa(bVar, this);
        this.f50983p = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C11369d.m50788a().mo44228a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C11236G g = r0;
                C11236G g2 = new C11236G(str, str2, next, this, pVar2.f51428e, a, this.f50985r);
                String k = g.mo43926k();
                this.f50983p.put(k, g);
                arrayList.add(k);
            }
        }
        this.f50973f = new C11392i(arrayList, bVar.f51537f);
        this.f50984q = new C11497m(new ArrayList(this.f50983p.values()));
        mo44201f(IronSourceConstants.RV_MANAGER_INIT_ENDED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        this.f50968A = new C11504w(pVar2.f51432i, this);
        m50729h(bVar.f51540i);
    }

    /* renamed from: a */
    static void m50726a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    /* renamed from: d */
    private String m50727d(C11291c cVar) {
        C11236G g = this.f50983p.get(cVar.mo44004a());
        String num = g != null ? Integer.toString(g.mo43924i()) : TextUtils.isEmpty(cVar.mo44005b()) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "2";
        return num + cVar.mo44004a();
    }

    /* renamed from: g */
    private void m50728g(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !TextUtils.isEmpty(this.f50969b.f50465b)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f50969b.f50465b);
        }
        JSONObject jSONObject = this.f50975h;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f50975h);
        }
        if (z && !TextUtils.isEmpty(this.f50986s)) {
            hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f50986s);
        }
        if (m50734o(i)) {
            C11296h.m50466e();
            C11284b.m50398a(hashMap, this.f50980m, this.f50979l);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f50985r));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11296h.m50466e().mo43979b(new C11308a(i, new JSONObject(hashMap)));
    }

    /* renamed from: h */
    private void m50729h(long j) {
        if (this.f50984q.mo44564a()) {
            m50726a("all smashes are capped");
            mo44203m(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo44204s();
        } else if (this.f50977j) {
            if (!this.f50971d.isEmpty()) {
                this.f50973f.mo44295a(this.f50971d);
                this.f50971d.clear();
            }
            new Timer().schedule(new C11356a(), j);
        } else {
            m50726a("auction fallback flow starting");
            m50738t();
            if (this.f50969b.mo43816a().isEmpty()) {
                m50726a("loadSmashes -  waterfall is empty");
                mo44203m(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
                mo44204s();
                return;
            }
            mo44200e(1000);
            m50741w();
        }
    }

    /* renamed from: j */
    private static void m50730j(C11236G g, String str) {
        String str2 = g.mo43926k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    /* renamed from: k */
    private void m50731k(List<C11291c> list, String str, JSONObject jSONObject) {
        this.f50970c.clear();
        this.f50971d.clear();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        StringBuilder sb = new StringBuilder();
        for (C11291c next : list) {
            sb.append(m50727d(next) + ",");
            C11236G g = this.f50983p.get(next.mo44004a());
            if (g != null) {
                AbstractAdapter a = C11369d.m50788a().mo44227a(g.f50599b.f51346a);
                if (a != null) {
                    C11236G g2 = new C11236G(g, this, a, this.f50985r, str, jSONObject, this.f50980m, this.f50979l);
                    g2.f50600c = true;
                    copyOnWriteArrayList.add(g2);
                    this.f50970c.put(g2.mo43926k(), next);
                    this.f50971d.put(next.mo44004a(), C11392i.C11393a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                m50726a("updateWaterfall() - could not find matching smash for auction response item " + next.mo44004a());
            }
        }
        this.f50969b.mo43818a(copyOnWriteArrayList, str);
        if (this.f50969b.mo43819b()) {
            mo44203m(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfalls hold too many with size=" + this.f50969b.f50464a.size()}}));
        }
        m50726a("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m50726a("Updated waterfall is empty");
        }
        mo44203m(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: l */
    private void m50732l(boolean z, Map<String, Object> map) {
        synchronized (this.f50993z) {
            Boolean bool = this.f50992y;
            if (bool == null || bool.booleanValue() != z) {
                this.f50992y = Boolean.valueOf(z);
                long time = new Date().getTime() - this.f50991x;
                this.f50991x = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
                mo44203m(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                C11270X.m50368a().mo43944a(z);
            }
        }
    }

    /* renamed from: n */
    private static void m50733n(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 3);
    }

    /* renamed from: o */
    private static boolean m50734o(int i) {
        return i == 1003 || i == 1302 || i == 1301;
    }

    /* renamed from: p */
    private void m50735p(int i) {
        m50728g(i, (Map<String, Object>) null, true, true);
    }

    /* renamed from: q */
    private void m50736q(int i, Map<String, Object> map) {
        m50728g(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: r */
    private static void m50737r(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: t */
    private void m50738t() {
        List<C11291c> u = m50739u();
        m50731k(u, "fallback_" + System.currentTimeMillis(), this.f50975h);
    }

    /* renamed from: u */
    private List<C11291c> m50739u() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C11236G next : this.f50983p.values()) {
            if (!next.mo43923h() && !this.f50984q.mo44565b(next) && this.f50969b.mo43820b(next)) {
                copyOnWriteArrayList.add(new C11291c(next.mo43926k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: v */
    private void m50740v(C11236G g) {
        String b = this.f50970c.get(g.mo43926k()).mo44005b();
        g.mo43922b(b);
        g.mo43786a(b);
    }

    /* renamed from: w */
    private void m50741w() {
        if (this.f50969b.mo43816a().isEmpty()) {
            m50726a("loadSmashes -  waterfall is empty");
            mo44203m(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo44204s();
            return;
        }
        mo44202i(C11358c.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f50969b.mo43816a().size() && i < this.f50987t; i2++) {
            C11236G g = this.f50969b.mo43816a().get(i2);
            if (g.f50600c) {
                if (!this.f50988u || !g.mo43923h()) {
                    m50740v(g);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + g.mo43926k() + ". No other instances will be loaded at the same time.";
                    m50726a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m50740v(g);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + g.mo43926k() + " as a non bidder is being loaded";
                    m50726a(str2);
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
        m50726a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f50980m = i2;
        this.f50979l = str2;
        this.f50975h = null;
        m50738t();
        if (TextUtils.isEmpty(str)) {
            map = C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            map = C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        mo44203m(IronSourceConstants.RV_AUCTION_FAILED, map);
        m50741w();
    }

    /* renamed from: a */
    public final void mo44197a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f50982o = z;
            if (z) {
                if (this.f50981n == null) {
                    this.f50981n = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f50981n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f50981n != null) {
                context.getApplicationContext().unregisterReceiver(this.f50981n);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x010a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43807a(com.ironsource.mediationsdk.C11236G r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f50993z
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            java.lang.String r2 = "onLoadSuccess mState="
            r1.<init>(r2)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.b0$c r2 = r12.f50990w     // Catch:{ all -> 0x015c }
            r1.append(r2)     // Catch:{ all -> 0x015c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x015c }
            m50730j(r13, r1)     // Catch:{ all -> 0x015c }
            java.lang.String r1 = r13.f50448p     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.I r2 = r12.f50969b     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r2.f50465b     // Catch:{ all -> 0x015c }
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 != r2) goto L_0x010b
            com.ironsource.mediationsdk.b0$c r1 = r12.f50990w     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.b0$c r2 = com.ironsource.mediationsdk.C11355b0.C11358c.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x015c }
            if (r1 != r2) goto L_0x0029
            goto L_0x010b
        L_0x0029:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r1 = r12.f50971d     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r13.mo43926k()     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.i$a r6 = com.ironsource.mediationsdk.C11392i.C11393a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x015c }
            r1.put(r2, r6)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.b0$c r1 = r12.f50990w     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.b0$c r2 = com.ironsource.mediationsdk.C11355b0.C11358c.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x015c }
            if (r1 != r2) goto L_0x0109
            r1 = 0
            r12.m50732l(r5, r1)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.b0$c r1 = com.ironsource.mediationsdk.C11355b0.C11358c.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x015c }
            r12.mo44202i(r1)     // Catch:{ all -> 0x015c }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x015c }
            r1.<init>()     // Catch:{ all -> 0x015c }
            long r6 = r1.getTime()     // Catch:{ all -> 0x015c }
            long r8 = r12.f50978k     // Catch:{ all -> 0x015c }
            long r6 = r6 - r8
            r1 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r8 = new java.lang.Object[r5][]     // Catch:{ all -> 0x015c }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x015c }
            java.lang.String r10 = "duration"
            r9[r3] = r10     // Catch:{ all -> 0x015c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x015c }
            r9[r5] = r6     // Catch:{ all -> 0x015c }
            r8[r3] = r9     // Catch:{ all -> 0x015c }
            java.util.Map r6 = com.ironsource.environment.C4952a.C49531.m22720a((java.lang.Object[][]) r8)     // Catch:{ all -> 0x015c }
            r12.mo44203m(r1, r6)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.w r1 = r12.f50968A     // Catch:{ all -> 0x015c }
            r6 = 0
            r1.mo44584a(r6)     // Catch:{ all -> 0x015c }
            boolean r1 = r12.f50977j     // Catch:{ all -> 0x015c }
            if (r1 == 0) goto L_0x0109
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.a.c> r1 = r12.f50970c     // Catch:{ all -> 0x015c }
            java.lang.String r6 = r13.mo43926k()     // Catch:{ all -> 0x015c }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x015c }
            r11 = r1
            com.ironsource.mediationsdk.a.c r11 = (com.ironsource.mediationsdk.p276a.C11291c) r11     // Catch:{ all -> 0x015c }
            if (r11 == 0) goto L_0x009f
            int r1 = r13.mo43924i()     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.a.c r2 = r12.f50972e     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.C11389h.m50958a(r11, r1, r2)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.h r6 = r12.f50974g     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.I r1 = r12.f50969b     // Catch:{ all -> 0x015c }
            java.util.concurrent.CopyOnWriteArrayList r7 = r1.mo43816a()     // Catch:{ all -> 0x015c }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.a.c> r8 = r12.f50970c     // Catch:{ all -> 0x015c }
            int r9 = r13.mo43924i()     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.a.c r10 = r12.f50972e     // Catch:{ all -> 0x015c }
            r6.mo44288a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C11261V>) r7, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.p276a.C11291c>) r8, (int) r9, (com.ironsource.mediationsdk.p276a.C11291c) r10, (com.ironsource.mediationsdk.p276a.C11291c) r11)     // Catch:{ all -> 0x015c }
            goto L_0x0109
        L_0x009f:
            java.lang.String r1 = r13.mo43926k()     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            java.lang.String r7 = "onLoadSuccess winner instance "
            r6.<init>(r7)     // Catch:{ all -> 0x015c }
            r6.append(r1)     // Catch:{ all -> 0x015c }
            java.lang.String r7 = " missing from waterfall. auctionId: "
            r6.append(r7)     // Catch:{ all -> 0x015c }
            java.lang.String r13 = r13.f50448p     // Catch:{ all -> 0x015c }
            r6.append(r13)     // Catch:{ all -> 0x015c }
            java.lang.String r13 = " and the current id is "
            r6.append(r13)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.I r13 = r12.f50969b     // Catch:{ all -> 0x015c }
            java.lang.String r13 = r13.f50465b     // Catch:{ all -> 0x015c }
            r6.append(r13)     // Catch:{ all -> 0x015c }
            java.lang.String r13 = r6.toString()     // Catch:{ all -> 0x015c }
            m50733n(r13)     // Catch:{ all -> 0x015c }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r6 = 3
            java.lang.Object[][] r6 = new java.lang.Object[r6][]     // Catch:{ all -> 0x015c }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x015c }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x015c }
            r8 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x015c }
            r7[r5] = r8     // Catch:{ all -> 0x015c }
            r6[r3] = r7     // Catch:{ all -> 0x015c }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x015c }
            java.lang.String r8 = "reason"
            r7[r3] = r8     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            java.lang.String r9 = "Loaded missing "
            r8.<init>(r9)     // Catch:{ all -> 0x015c }
            r8.append(r2)     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x015c }
            r7[r5] = r2     // Catch:{ all -> 0x015c }
            r6[r5] = r7     // Catch:{ all -> 0x015c }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x015c }
            java.lang.String r7 = "ext1"
            r2[r3] = r7     // Catch:{ all -> 0x015c }
            r2[r5] = r1     // Catch:{ all -> 0x015c }
            r6[r4] = r2     // Catch:{ all -> 0x015c }
            java.util.Map r1 = com.ironsource.environment.C4952a.C49531.m22720a((java.lang.Object[][]) r6)     // Catch:{ all -> 0x015c }
            r12.mo44203m(r13, r1)     // Catch:{ all -> 0x015c }
        L_0x0109:
            monitor-exit(r0)     // Catch:{ all -> 0x015c }
            return
        L_0x010b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            java.lang.String r2 = "onLoadSuccess was invoked with auctionId: "
            r1.<init>(r2)     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r13.f50448p     // Catch:{ all -> 0x015c }
            r1.append(r2)     // Catch:{ all -> 0x015c }
            java.lang.String r2 = " and the current id is "
            r1.append(r2)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.I r2 = r12.f50969b     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r2.f50465b     // Catch:{ all -> 0x015c }
            r1.append(r2)     // Catch:{ all -> 0x015c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x015c }
            m50726a((java.lang.String) r1)     // Catch:{ all -> 0x015c }
            r1 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r2 = new java.lang.Object[r4][]     // Catch:{ all -> 0x015c }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x015c }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x015c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x015c }
            r6[r5] = r7     // Catch:{ all -> 0x015c }
            r2[r3] = r6     // Catch:{ all -> 0x015c }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x015c }
            java.lang.String r6 = "reason"
            r4[r3] = r6     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            java.lang.String r6 = "onLoadSuccess wrong auction ID "
            r3.<init>(r6)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.b0$c r6 = r12.f50990w     // Catch:{ all -> 0x015c }
            r3.append(r6)     // Catch:{ all -> 0x015c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x015c }
            r4[r5] = r3     // Catch:{ all -> 0x015c }
            r2[r5] = r4     // Catch:{ all -> 0x015c }
            r13.mo43788b(r1, r2)     // Catch:{ all -> 0x015c }
            monitor-exit(r0)     // Catch:{ all -> 0x015c }
            return
        L_0x015c:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x015c }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11355b0.mo43807a(com.ironsource.mediationsdk.G):void");
    }

    /* renamed from: a */
    public final void mo43808a(C11236G g, Placement placement) {
        m50730j(g, "onRewardedVideoAdRewarded");
        C11270X.m50368a().mo43942a(placement);
    }

    /* renamed from: a */
    public final void mo43809a(IronSourceError ironSourceError, C11236G g) {
        m50730j(g, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f50989v = false;
        m50736q(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
        C11270X.m50368a().mo43946b(ironSourceError);
        this.f50971d.put(g.mo43926k(), C11392i.C11393a.ISAuctionPerformanceFailedToShow);
        if (this.f50990w != C11358c.RV_STATE_READY_TO_SHOW) {
            m50732l(false, (Map<String, Object>) null);
        }
        this.f50976i.mo44031c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01d4, code lost:
        m50726a("showVideo()");
        r9.f50984q.mo44563a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01e4, code lost:
        if (r9.f50984q.mo44565b(r6) == false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01e6, code lost:
        r6.mo43790b_();
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6.mo43926k() + " rewarded video is now session capped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0201, code lost:
        com.ironsource.mediationsdk.utils.C11484c.m51248e(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r10.getPlacementName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0220, code lost:
        if (com.ironsource.mediationsdk.utils.C11484c.m51245c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r10.getPlacementName()) == false) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0222, code lost:
        m50735p(com.ironsource.mediationsdk.utils.IronSourceConstants.RV_CAP_PLACEMENT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0227, code lost:
        r9.f50968A.mo44583a();
        r6.mo43785a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x022f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44198a(com.ironsource.mediationsdk.model.Placement r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f50993z
            monitor-enter(r0)
            r1 = 1113(0x459, float:1.56E-42)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r10 != 0) goto L_0x0040
            java.lang.String r10 = "showRewardedVideo error: empty default placement"
            m50737r(r10)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0230 }
            r6 = 1021(0x3fd, float:1.431E-42)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.X r7 = com.ironsource.mediationsdk.C11270X.m50368a()     // Catch:{ all -> 0x0230 }
            r7.mo43946b((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0230 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0230 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0230 }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x0230 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0230 }
            r7[r4] = r6     // Catch:{ all -> 0x0230 }
            r5[r3] = r7     // Catch:{ all -> 0x0230 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0230 }
            java.lang.String r6 = "reason"
            r2[r3] = r6     // Catch:{ all -> 0x0230 }
            r2[r4] = r10     // Catch:{ all -> 0x0230 }
            r5[r4] = r2     // Catch:{ all -> 0x0230 }
            java.util.Map r10 = com.ironsource.environment.C4952a.C49531.m22720a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0230 }
            r9.m50728g(r1, r10, r3, r4)     // Catch:{ all -> 0x0230 }
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            return
        L_0x0040:
            java.lang.String r5 = r10.getPlacementName()     // Catch:{ all -> 0x0230 }
            r9.f50986s = r5     // Catch:{ all -> 0x0230 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0230 }
            java.lang.String r6 = "showRewardedVideo("
            r5.<init>(r6)     // Catch:{ all -> 0x0230 }
            r5.append(r10)     // Catch:{ all -> 0x0230 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0230 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0230 }
            r6.log(r7, r5, r4)     // Catch:{ all -> 0x0230 }
            r5 = 1100(0x44c, float:1.541E-42)
            r9.m50735p(r5)     // Catch:{ all -> 0x0230 }
            boolean r5 = r9.f50989v     // Catch:{ all -> 0x0230 }
            if (r5 == 0) goto L_0x00a1
            java.lang.String r10 = "showRewardedVideo error: can't show ad while an ad is already showing"
            m50737r(r10)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0230 }
            r6 = 1022(0x3fe, float:1.432E-42)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.X r7 = com.ironsource.mediationsdk.C11270X.m50368a()     // Catch:{ all -> 0x0230 }
            r7.mo43946b((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0230 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0230 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0230 }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x0230 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0230 }
            r7[r4] = r6     // Catch:{ all -> 0x0230 }
            r5[r3] = r7     // Catch:{ all -> 0x0230 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0230 }
            java.lang.String r6 = "reason"
            r2[r3] = r6     // Catch:{ all -> 0x0230 }
            r2[r4] = r10     // Catch:{ all -> 0x0230 }
            r5[r4] = r2     // Catch:{ all -> 0x0230 }
            java.util.Map r10 = com.ironsource.environment.C4952a.C49531.m22720a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0230 }
            r9.m50736q(r1, r10)     // Catch:{ all -> 0x0230 }
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            return
        L_0x00a1:
            com.ironsource.mediationsdk.b0$c r5 = r9.f50990w     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.b0$c r6 = com.ironsource.mediationsdk.C11355b0.C11358c.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0230 }
            if (r5 == r6) goto L_0x00dd
            java.lang.String r10 = "showRewardedVideo error: show called while no ads are available"
            m50737r(r10)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0230 }
            r6 = 1023(0x3ff, float:1.434E-42)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.X r7 = com.ironsource.mediationsdk.C11270X.m50368a()     // Catch:{ all -> 0x0230 }
            r7.mo43946b((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0230 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0230 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0230 }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x0230 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0230 }
            r7[r4] = r6     // Catch:{ all -> 0x0230 }
            r5[r3] = r7     // Catch:{ all -> 0x0230 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0230 }
            java.lang.String r6 = "reason"
            r2[r3] = r6     // Catch:{ all -> 0x0230 }
            r2[r4] = r10     // Catch:{ all -> 0x0230 }
            r5[r4] = r2     // Catch:{ all -> 0x0230 }
            java.util.Map r10 = com.ironsource.environment.C4952a.C49531.m22720a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0230 }
            r9.m50736q(r1, r10)     // Catch:{ all -> 0x0230 }
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            return
        L_0x00dd:
            com.ironsource.environment.ContextProvider r5 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0230 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0230 }
            java.lang.String r6 = r9.f50986s     // Catch:{ all -> 0x0230 }
            boolean r5 = com.ironsource.mediationsdk.utils.C11484c.m51245c((android.content.Context) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0230 }
            if (r5 == 0) goto L_0x0136
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0230 }
            java.lang.String r5 = "showRewardedVideo error: placement "
            r10.<init>(r5)     // Catch:{ all -> 0x0230 }
            java.lang.String r5 = r9.f50986s     // Catch:{ all -> 0x0230 }
            r10.append(r5)     // Catch:{ all -> 0x0230 }
            java.lang.String r5 = " is capped"
            r10.append(r5)     // Catch:{ all -> 0x0230 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0230 }
            m50737r(r10)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0230 }
            r6 = 524(0x20c, float:7.34E-43)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.X r7 = com.ironsource.mediationsdk.C11270X.m50368a()     // Catch:{ all -> 0x0230 }
            r7.mo43946b((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0230 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0230 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0230 }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x0230 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0230 }
            r7[r4] = r6     // Catch:{ all -> 0x0230 }
            r5[r3] = r7     // Catch:{ all -> 0x0230 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0230 }
            java.lang.String r6 = "reason"
            r2[r3] = r6     // Catch:{ all -> 0x0230 }
            r2[r4] = r10     // Catch:{ all -> 0x0230 }
            r5[r4] = r2     // Catch:{ all -> 0x0230 }
            java.util.Map r10 = com.ironsource.environment.C4952a.C49531.m22720a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0230 }
            r9.m50736q(r1, r10)     // Catch:{ all -> 0x0230 }
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            return
        L_0x0136:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ all -> 0x0230 }
            r2.<init>()     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.I r5 = r9.f50969b     // Catch:{ all -> 0x0230 }
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.mo43816a()     // Catch:{ all -> 0x0230 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0230 }
        L_0x0145:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0230 }
            if (r6 == 0) goto L_0x0190
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.G r6 = (com.ironsource.mediationsdk.C11236G) r6     // Catch:{ all -> 0x0230 }
            boolean r7 = r6.mo43789b()     // Catch:{ all -> 0x0230 }
            if (r7 == 0) goto L_0x0162
            r9.f50989v = r4     // Catch:{ all -> 0x0230 }
            r6.mo43787a((boolean) r4)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.b0$c r3 = com.ironsource.mediationsdk.C11355b0.C11358c.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0230 }
            r9.mo44202i(r3)     // Catch:{ all -> 0x0230 }
            goto L_0x0191
        L_0x0162:
            java.lang.Long r7 = r6.mo43930o()     // Catch:{ all -> 0x0230 }
            if (r7 == 0) goto L_0x018c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0230 }
            r7.<init>()     // Catch:{ all -> 0x0230 }
            java.lang.String r8 = r6.mo43926k()     // Catch:{ all -> 0x0230 }
            r7.append(r8)     // Catch:{ all -> 0x0230 }
            java.lang.String r8 = ":"
            r7.append(r8)     // Catch:{ all -> 0x0230 }
            java.lang.Long r8 = r6.mo43930o()     // Catch:{ all -> 0x0230 }
            r7.append(r8)     // Catch:{ all -> 0x0230 }
            java.lang.String r8 = ","
            r7.append(r8)     // Catch:{ all -> 0x0230 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0230 }
            r2.append(r7)     // Catch:{ all -> 0x0230 }
        L_0x018c:
            r6.mo43787a((boolean) r3)     // Catch:{ all -> 0x0230 }
            goto L_0x0145
        L_0x0190:
            r6 = 0
        L_0x0191:
            if (r6 != 0) goto L_0x01d3
            java.lang.String r10 = "showRewardedVideo(): No ads to show"
            m50726a((java.lang.String) r10)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.X r3 = com.ironsource.mediationsdk.C11270X.m50368a()     // Catch:{ all -> 0x0230 }
            java.lang.String r4 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r4 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r4)     // Catch:{ all -> 0x0230 }
            r3.mo43946b((com.ironsource.mediationsdk.logger.IronSourceError) r4)     // Catch:{ all -> 0x0230 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0230 }
            r3.<init>()     // Catch:{ all -> 0x0230 }
            java.lang.String r4 = "errorCode"
            r5 = 509(0x1fd, float:7.13E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0230 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0230 }
            java.lang.String r4 = "reason"
            r3.put(r4, r10)     // Catch:{ all -> 0x0230 }
            int r10 = r2.length()     // Catch:{ all -> 0x0230 }
            if (r10 == 0) goto L_0x01c9
            java.lang.String r10 = "ext1"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0230 }
            r3.put(r10, r2)     // Catch:{ all -> 0x0230 }
        L_0x01c9:
            r9.m50736q(r1, r3)     // Catch:{ all -> 0x0230 }
            com.ironsource.mediationsdk.aa r10 = r9.f50976i     // Catch:{ all -> 0x0230 }
            r10.mo44031c()     // Catch:{ all -> 0x0230 }
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            return
        L_0x01d3:
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "showVideo()"
            m50726a((java.lang.String) r0)
            com.ironsource.mediationsdk.utils.m r0 = r9.f50984q
            r0.mo44563a(r6)
            com.ironsource.mediationsdk.utils.m r0 = r9.f50984q
            boolean r0 = r0.mo44565b(r6)
            if (r0 == 0) goto L_0x0201
            r6.mo43790b_()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.mo43926k()
            r0.append(r1)
            java.lang.String r1 = " rewarded video is now session capped"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
        L_0x0201:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r10.getPlacementName()
            com.ironsource.mediationsdk.utils.C11484c.m51248e(r0, r1)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r10.getPlacementName()
            boolean r0 = com.ironsource.mediationsdk.utils.C11484c.m51245c((android.content.Context) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x0227
            r0 = 1400(0x578, float:1.962E-42)
            r9.m50735p(r0)
        L_0x0227:
            com.ironsource.mediationsdk.w r0 = r9.f50968A
            r0.mo44583a()
            r6.mo43785a((com.ironsource.mediationsdk.model.Placement) r10)
            return
        L_0x0230:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            goto L_0x0234
        L_0x0233:
            throw r10
        L_0x0234:
            goto L_0x0233
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11355b0.mo44198a(com.ironsource.mediationsdk.model.Placement):void");
    }

    /* renamed from: a */
    public final void mo43855a(List<C11291c> list, String str, C11291c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        m50726a("makeAuction(): success");
        this.f50972e = cVar;
        this.f50980m = i;
        this.f50975h = jSONObject;
        this.f50979l = "";
        m50731k(list, str, jSONObject);
        mo44203m(IronSourceConstants.RV_AUCTION_SUCCESS, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        if (!TextUtils.isEmpty(str2)) {
            mo44203m(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        m50741w();
    }

    /* renamed from: a */
    public final void mo20593a(boolean z) {
        if (this.f50982o) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z2 = true;
            logger.log(ironSourceTag, "Network Availability Changed To: " + z, 1);
            Boolean bool = this.f50992y;
            boolean z3 = false;
            if (bool != null) {
                if ((!z || bool.booleanValue() || !mo44199a_()) && (z || !this.f50992y.booleanValue())) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (z3) {
                m50732l(z, (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: a_ */
    public final boolean mo44199a_() {
        if ((!this.f50982o || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f50990w == C11358c.RV_STATE_READY_TO_SHOW && !this.f50989v) {
            Iterator<C11236G> it = this.f50969b.mo43816a().iterator();
            while (it.hasNext()) {
                if (it.next().mo43789b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011b, code lost:
        r11 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0123, code lost:
        if (r11.hasNext() == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0125, code lost:
        m50740v((com.ironsource.mediationsdk.C11236G) r11.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012f, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f0  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43810b(com.ironsource.mediationsdk.C11236G r11) {
        /*
            r10 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r1 = r10.f50993z
            monitor-enter(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            java.lang.String r3 = "onLoadError mState="
            r2.<init>(r3)     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.b0$c r3 = r10.f50990w     // Catch:{ all -> 0x0183 }
            r2.append(r3)     // Catch:{ all -> 0x0183 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0183 }
            m50730j(r11, r2)     // Catch:{ all -> 0x0183 }
            java.lang.String r2 = r11.f50448p     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.I r3 = r10.f50969b     // Catch:{ all -> 0x0183 }
            java.lang.String r3 = r3.f50465b     // Catch:{ all -> 0x0183 }
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x0130
            com.ironsource.mediationsdk.b0$c r2 = r10.f50990w     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.b0$c r3 = com.ironsource.mediationsdk.C11355b0.C11358c.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0183 }
            if (r2 != r3) goto L_0x002d
            goto L_0x0130
        L_0x002d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r10.f50971d     // Catch:{ all -> 0x0183 }
            java.lang.String r3 = r11.mo43926k()     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.i$a r6 = com.ironsource.mediationsdk.C11392i.C11393a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0183 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.b0$c r2 = r10.f50990w     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.b0$c r3 = com.ironsource.mediationsdk.C11355b0.C11358c.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0183 }
            if (r2 == r3) goto L_0x0044
            com.ironsource.mediationsdk.b0$c r3 = com.ironsource.mediationsdk.C11355b0.C11358c.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0183 }
            if (r2 == r3) goto L_0x0044
            monitor-exit(r1)     // Catch:{ all -> 0x0183 }
            return
        L_0x0044:
            com.ironsource.mediationsdk.I r2 = r10.f50969b     // Catch:{ all -> 0x0183 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.mo43816a()     // Catch:{ all -> 0x0183 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0183 }
            r3 = 0
            r6 = 0
        L_0x0050:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0183 }
            if (r7 == 0) goto L_0x00f9
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.G r7 = (com.ironsource.mediationsdk.C11236G) r7     // Catch:{ all -> 0x0183 }
            boolean r8 = r7.f50600c     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x00dd
            boolean r8 = r10.f50988u     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x00b5
            boolean r8 = r7.mo43923h()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x00b5
            if (r3 != 0) goto L_0x008d
            if (r6 == 0) goto L_0x006f
            goto L_0x008d
        L_0x006f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            java.lang.String r9 = "Advanced Loading: Starting to load bidder "
            r8.<init>(r9)     // Catch:{ all -> 0x0183 }
            java.lang.String r9 = r7.mo43926k()     // Catch:{ all -> 0x0183 }
            r8.append(r9)     // Catch:{ all -> 0x0183 }
            java.lang.String r9 = ". No other instances will be loaded at the same time."
            r8.append(r9)     // Catch:{ all -> 0x0183 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0183 }
            m50726a((java.lang.String) r8)     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r8)     // Catch:{ all -> 0x0183 }
            goto L_0x00b5
        L_0x008d:
            if (r3 == 0) goto L_0x0092
            java.lang.String r11 = "a non bidder is being loaded"
            goto L_0x0094
        L_0x0092:
            java.lang.String r11 = "a non bidder was already loaded successfully"
        L_0x0094:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            java.lang.String r4 = "Advanced Loading: Won't start loading bidder "
            r2.<init>(r4)     // Catch:{ all -> 0x0183 }
            java.lang.String r4 = r7.mo43926k()     // Catch:{ all -> 0x0183 }
            r2.append(r4)     // Catch:{ all -> 0x0183 }
            java.lang.String r4 = " as "
            r2.append(r4)     // Catch:{ all -> 0x0183 }
            r2.append(r11)     // Catch:{ all -> 0x0183 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x0183 }
            m50726a((java.lang.String) r11)     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r11)     // Catch:{ all -> 0x0183 }
            goto L_0x00f9
        L_0x00b5:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.a.c> r8 = r10.f50970c     // Catch:{ all -> 0x0183 }
            java.lang.String r9 = r7.mo43926k()     // Catch:{ all -> 0x0183 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0050
            r0.add(r7)     // Catch:{ all -> 0x0183 }
            boolean r8 = r10.f50988u     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x00f9
            boolean r8 = r11.mo43923h()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x00f9
            boolean r7 = r7.mo43923h()     // Catch:{ all -> 0x0183 }
            if (r7 != 0) goto L_0x00f9
            int r7 = r0.size()     // Catch:{ all -> 0x0183 }
            int r8 = r10.f50987t     // Catch:{ all -> 0x0183 }
            if (r7 >= r8) goto L_0x00f9
            goto L_0x00ed
        L_0x00dd:
            com.ironsource.mediationsdk.G$a r8 = r7.f50440h     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.G$a r9 = com.ironsource.mediationsdk.C11236G.C11237a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0183 }
            if (r8 == r9) goto L_0x00ea
            com.ironsource.mediationsdk.G$a r9 = com.ironsource.mediationsdk.C11236G.C11237a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0183 }
            if (r8 != r9) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            r8 = 0
            goto L_0x00eb
        L_0x00ea:
            r8 = 1
        L_0x00eb:
            if (r8 == 0) goto L_0x00f0
        L_0x00ed:
            r3 = 1
            goto L_0x0050
        L_0x00f0:
            boolean r7 = r7.mo43789b()     // Catch:{ all -> 0x0183 }
            if (r7 == 0) goto L_0x0050
            r6 = 1
            goto L_0x0050
        L_0x00f9:
            int r11 = r0.size()     // Catch:{ all -> 0x0183 }
            if (r11 != 0) goto L_0x011a
            if (r6 != 0) goto L_0x011a
            if (r3 != 0) goto L_0x011a
            java.lang.String r11 = "onLoadError(): No other available smashes"
            m50726a((java.lang.String) r11)     // Catch:{ all -> 0x0183 }
            boolean r11 = r10.f50989v     // Catch:{ all -> 0x0183 }
            if (r11 != 0) goto L_0x0110
            r11 = 0
            r10.m50732l(r5, r11)     // Catch:{ all -> 0x0183 }
        L_0x0110:
            com.ironsource.mediationsdk.b0$c r11 = com.ironsource.mediationsdk.C11355b0.C11358c.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0183 }
            r10.mo44202i(r11)     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.aa r11 = r10.f50976i     // Catch:{ all -> 0x0183 }
            r11.mo44032d()     // Catch:{ all -> 0x0183 }
        L_0x011a:
            monitor-exit(r1)     // Catch:{ all -> 0x0183 }
            java.util.Iterator r11 = r0.iterator()
        L_0x011f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r11.next()
            com.ironsource.mediationsdk.G r0 = (com.ironsource.mediationsdk.C11236G) r0
            r10.m50740v(r0)
            goto L_0x011f
        L_0x012f:
            return
        L_0x0130:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            java.lang.String r2 = "onLoadError was invoked with auctionId:"
            r0.<init>(r2)     // Catch:{ all -> 0x0183 }
            java.lang.String r2 = r11.f50448p     // Catch:{ all -> 0x0183 }
            r0.append(r2)     // Catch:{ all -> 0x0183 }
            java.lang.String r2 = " and the current id is "
            r0.append(r2)     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.I r2 = r10.f50969b     // Catch:{ all -> 0x0183 }
            java.lang.String r2 = r2.f50465b     // Catch:{ all -> 0x0183 }
            r0.append(r2)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0183 }
            m50726a((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
            r0 = 81315(0x13da3, float:1.13947E-40)
            r2 = 2
            java.lang.Object[][] r3 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0183 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0183 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x0183 }
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0183 }
            r6[r4] = r7     // Catch:{ all -> 0x0183 }
            r3[r5] = r6     // Catch:{ all -> 0x0183 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0183 }
            java.lang.String r6 = "reason"
            r2[r5] = r6     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            java.lang.String r6 = "loadError wrong auction ID "
            r5.<init>(r6)     // Catch:{ all -> 0x0183 }
            com.ironsource.mediationsdk.b0$c r6 = r10.f50990w     // Catch:{ all -> 0x0183 }
            r5.append(r6)     // Catch:{ all -> 0x0183 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0183 }
            r2[r4] = r5     // Catch:{ all -> 0x0183 }
            r3[r4] = r2     // Catch:{ all -> 0x0183 }
            r11.mo43788b(r0, r3)     // Catch:{ all -> 0x0183 }
            monitor-exit(r1)     // Catch:{ all -> 0x0183 }
            return
        L_0x0183:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0183 }
            goto L_0x0187
        L_0x0186:
            throw r11
        L_0x0187:
            goto L_0x0186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11355b0.mo43810b(com.ironsource.mediationsdk.G):void");
    }

    /* renamed from: b */
    public final void mo43811b(C11236G g, Placement placement) {
        m50730j(g, "onRewardedVideoAdClicked");
        C11270X.m50368a().mo43947b(placement);
    }

    /* renamed from: c */
    public final void mo43812c(C11236G g) {
        this.f50969b.mo43817a(g);
        this.f50985r++;
        m50730j(g, "onRewardedVideoAdOpened");
        C11270X.m50368a().mo43948c();
        m50732l(false, (Map<String, Object>) null);
        if (this.f50977j) {
            C11291c cVar = this.f50970c.get(g.mo43926k());
            if (cVar != null) {
                C11389h.m50959a(cVar, g.mo43924i(), this.f50972e, this.f50986s);
                this.f50971d.put(g.mo43926k(), C11392i.C11393a.ISAuctionPerformanceShowedSuccessfully);
                mo44447a(cVar, this.f50986s);
            } else {
                String k = g.mo43926k();
                m50733n("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                mo44203m(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f50990w}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
            }
        }
        this.f50976i.mo44029a();
    }

    /* renamed from: c_ */
    public final void mo44142c_() {
        mo44202i(C11358c.RV_STATE_NOT_LOADED);
        m50732l(false, C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m50729h(0);
    }

    /* renamed from: d */
    public final void mo44036d() {
        m50726a("onLoadTriggered: RV load was triggered in " + this.f50990w + " state");
        m50729h(0);
    }

    /* renamed from: d */
    public final void mo43813d(C11236G g) {
        String str;
        m50730j(g, "onRewardedVideoAdClosed, mediation state: " + this.f50990w.name());
        C11270X.m50368a().mo43949d();
        this.f50989v = false;
        boolean z = this.f50990w == C11358c.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z) {
            Iterator<C11236G> it = this.f50969b.mo43816a().iterator();
            while (it.hasNext()) {
                C11236G next = it.next();
                if (next.f50440h == C11236G.C11237a.LOADED) {
                    sb.append(next.mo43926k() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + sb;
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[0] = objArr2;
        g.mo43784a(IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (g.equals(this.f50969b.f50467d)) {
            this.f50969b.mo43817a((C11236G) null);
            if (this.f50990w != C11358c.RV_STATE_READY_TO_SHOW) {
                m50732l(false, (Map<String, Object>) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo44200e(int i) {
        m50728g(i, (Map<String, Object>) null, false, false);
    }

    /* renamed from: e */
    public final void mo43814e(C11236G g) {
        m50730j(g, "onRewardedVideoAdStarted");
        C11270X.m50368a().mo43950e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo44201f(int i, Map<String, Object> map) {
        m50728g(i, map, false, false);
    }

    /* renamed from: f */
    public final void mo43815f(C11236G g) {
        m50730j(g, "onRewardedVideoAdEnded");
        C11270X.m50368a().mo43951f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo44202i(C11358c cVar) {
        m50726a("current state=" + this.f50990w + ", new state=" + cVar);
        this.f50990w = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo44203m(int i, Map<String, Object> map) {
        m50728g(i, map, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo44204s() {
        mo44202i(C11358c.RV_STATE_NOT_LOADED);
        if (!this.f50989v) {
            m50732l(false, (Map<String, Object>) null);
        }
        this.f50976i.mo44032d();
    }
}
