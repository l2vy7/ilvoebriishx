package com.ironsource.mediationsdk;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11392i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11423i;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p276a.C11284b;
import com.ironsource.mediationsdk.p276a.C11291c;
import com.ironsource.mediationsdk.p276a.C11292d;
import com.ironsource.mediationsdk.utils.C11483b;
import com.ironsource.mediationsdk.utils.C11497m;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.e0 */
final class C11373e0 extends C11433n implements C11253Q, C11386g, C11506x {

    /* renamed from: b */
    C11497m f51074b;

    /* renamed from: c */
    private C11376b f51075c;

    /* renamed from: d */
    final ConcurrentHashMap<String, C11254R> f51076d;

    /* renamed from: e */
    private CopyOnWriteArrayList<C11254R> f51077e;

    /* renamed from: f */
    private ConcurrentHashMap<String, C11291c> f51078f;

    /* renamed from: g */
    private ConcurrentHashMap<String, C11392i.C11393a> f51079g;

    /* renamed from: h */
    private C11291c f51080h;

    /* renamed from: i */
    private String f51081i;

    /* renamed from: j */
    String f51082j;

    /* renamed from: k */
    JSONObject f51083k;

    /* renamed from: l */
    private int f51084l;

    /* renamed from: m */
    private boolean f51085m;

    /* renamed from: n */
    private boolean f51086n;

    /* renamed from: o */
    C11389h f51087o;

    /* renamed from: p */
    C11392i f51088p;

    /* renamed from: q */
    long f51089q;

    /* renamed from: r */
    long f51090r;

    /* renamed from: s */
    private long f51091s;

    /* renamed from: t */
    private int f51092t;

    /* renamed from: u */
    private String f51093u = "";

    /* renamed from: v */
    private boolean f51094v = false;

    /* renamed from: com.ironsource.mediationsdk.e0$a */
    class C11374a implements Runnable {

        /* renamed from: com.ironsource.mediationsdk.e0$a$a */
        class C11375a implements Runnable {
            C11375a() {
            }

            public final void run() {
                C11373e0.this.mo44246a();
            }
        }

        C11374a() {
        }

        public final void run() {
            StringBuilder sb;
            C11373e0 e0Var = C11373e0.this;
            e0Var.f51082j = "";
            e0Var.f51083k = null;
            StringBuilder sb2 = new StringBuilder();
            long time = new Date().getTime();
            C11373e0 e0Var2 = C11373e0.this;
            long j = e0Var2.f51090r - (time - e0Var2.f51089q);
            if (j > 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new C11375a(), j);
                return;
            }
            e0Var2.m50822j(2000, (Object[][]) null, false);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (C11254R next : C11373e0.this.f51076d.values()) {
                if (!C11373e0.this.f51074b.mo44565b(next)) {
                    if (next.mo43923h()) {
                        Map<String, Object> a = next.mo43896a();
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
            if (hashMap.size() == 0 && arrayList.size() == 0) {
                C11373e0.this.m50822j(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}, false);
                C11373e0.m50830s("makeAuction() failed - No candidates available for auctioning");
                C11434o.m51097a().mo44452a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
                C11373e0.this.m50822j(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
                C11373e0.this.mo44251k(C11376b.STATE_READY_TO_LOAD);
                return;
            }
            C11373e0.this.m50822j(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}, false);
            int b = C11499n.m51312a().mo44568b(2);
            C11389h hVar = C11373e0.this.f51087o;
            if (hVar != null) {
                hVar.mo44287a(ContextProvider.getInstance().getApplicationContext(), (Map<String, Object>) hashMap, (List<String>) arrayList, C11373e0.this.f51088p, b);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.e0$b */
    enum C11376b {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11373e0(List<NetworkSettings> list, C11423i iVar, String str, String str2, int i, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        C11423i iVar2 = iVar;
        long time = new Date().getTime();
        m50817e((int) IronSourceConstants.IS_MANAGER_INIT_STARTED);
        mo44251k(C11376b.STATE_NOT_INITIALIZED);
        this.f51076d = new ConcurrentHashMap<>();
        this.f51077e = new CopyOnWriteArrayList<>();
        this.f51078f = new ConcurrentHashMap<>();
        this.f51079g = new ConcurrentHashMap<>();
        this.f51081i = "";
        this.f51082j = "";
        this.f51083k = null;
        this.f51084l = iVar2.f51384c;
        this.f51085m = iVar2.f51385d;
        C11434o.m51097a().mo44451a(IronSource.AD_UNIT.INTERSTITIAL, i);
        C11483b bVar = iVar2.f51390i;
        this.f51090r = bVar.f51540i;
        boolean z = bVar.f51536e > 0;
        this.f51086n = z;
        if (z) {
            this.f51087o = new C11389h(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, bVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C11369d.m50788a().mo44228a(next, next.getInterstitialSettings(), false, false);
            if (a != null) {
                C11372e a2 = C11372e.m50812a();
                if (a2.mo44245b(a, a2.f51072a, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE)) {
                    C11254R r = r0;
                    C11254R r2 = new C11254R(str, str2, next, this, iVar2.f51386e, a);
                    String k = r.mo43926k();
                    this.f51076d.put(k, r);
                    arrayList.add(k);
                }
            }
        }
        this.f51088p = new C11392i(arrayList, bVar.f51537f);
        this.f51074b = new C11497m(new ArrayList(this.f51076d.values()));
        for (C11254R next2 : this.f51076d.values()) {
            if (next2.mo43923h()) {
                next2.mo43898b();
            }
        }
        this.f51089q = new Date().getTime();
        mo44251k(C11376b.STATE_READY_TO_LOAD);
        m50821i(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: d */
    private String m50816d(C11291c cVar) {
        C11254R r = this.f51076d.get(cVar.mo44004a());
        String num = r != null ? Integer.toString(r.mo43924i()) : TextUtils.isEmpty(cVar.mo44005b()) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "2";
        return num + cVar.mo44004a();
    }

    /* renamed from: e */
    private void m50817e(int i) {
        m50822j(i, (Object[][]) null, false);
    }

    /* renamed from: f */
    private void m50818f(int i, C11254R r) {
        m50820h(i, r, (Object[][]) null, false);
    }

    /* renamed from: g */
    private void m50819g(int i, C11254R r, Object[][] objArr) {
        m50820h(i, r, objArr, false);
    }

    /* renamed from: h */
    private void m50820h(int i, C11254R r, Object[][] objArr, boolean z) {
        Map<String, Object> n = r.mo43929n();
        if (!TextUtils.isEmpty(this.f51082j)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f51082j);
        }
        JSONObject jSONObject = this.f51083k;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f51083k);
        }
        if (z && !TextUtils.isEmpty(this.f51081i)) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f51081i);
        }
        if (m50832u(i)) {
            C11292d.m50446e();
            C11284b.m50398a(n, this.f51092t, this.f51093u);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11292d.m50446e().mo43979b(new C11308a(i, new JSONObject(n)));
    }

    /* renamed from: i */
    private void m50821i(int i, Object[][] objArr) {
        m50822j(i, objArr, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m50822j(int i, Object[][] objArr, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f51082j)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f51082j);
        }
        JSONObject jSONObject = this.f51083k;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f51083k);
        }
        if (z && !TextUtils.isEmpty(this.f51081i)) {
            hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f51081i);
        }
        if (m50832u(i)) {
            C11292d.m50446e();
            C11284b.m50398a(hashMap, this.f51092t, this.f51093u);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                m50830s("sendMediationEvent " + e.getMessage());
            }
        }
        C11292d.m50446e().mo43979b(new C11308a(i, new JSONObject(hashMap)));
    }

    /* renamed from: m */
    private static void m50824m(C11254R r, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + r.mo43926k() + " : " + str, 0);
    }

    /* renamed from: n */
    private void m50825n(List<C11291c> list) {
        this.f51077e.clear();
        this.f51078f.clear();
        this.f51079g.clear();
        StringBuilder sb = new StringBuilder();
        for (C11291c next : list) {
            sb.append(m50816d(next) + ",");
            C11254R r = this.f51076d.get(next.mo44004a());
            if (r != null) {
                r.f50600c = true;
                this.f51077e.add(r);
                this.f51078f.put(r.mo43926k(), next);
                this.f51079g.put(next.mo44004a(), C11392i.C11393a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m50830s("updateWaterfall() - could not find matching smash for auction response item " + next.mo44004a());
            }
        }
        m50830s("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m50830s("Updated waterfall is empty");
        }
        m50821i(IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
    }

    /* renamed from: o */
    private void m50826o(int i) {
        m50822j(i, (Object[][]) null, true);
    }

    /* renamed from: p */
    private void m50827p(int i, C11254R r) {
        m50820h(i, r, (Object[][]) null, true);
    }

    /* renamed from: q */
    private void m50828q(int i, C11254R r, Object[][] objArr) {
        m50820h(i, r, objArr, true);
    }

    /* renamed from: r */
    private void m50829r(int i, Object[][] objArr) {
        m50822j(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, objArr, true);
    }

    /* renamed from: s */
    static void m50830s(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgIsManager " + str, 0);
    }

    /* renamed from: t */
    private static void m50831t(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: u */
    private static boolean m50832u(int i) {
        return i == 2002 || i == 2003 || i == 2200 || i == 2213 || i == 2005 || i == 2204 || i == 2201 || i == 2203 || i == 2006 || i == 2004 || i == 2110 || i == 2301 || i == 2300;
    }

    /* renamed from: v */
    private void m50833v() {
        List<C11291c> w = m50834w();
        this.f51082j = C11433n.m51092c();
        m50825n(w);
    }

    /* renamed from: w */
    private List<C11291c> m50834w() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C11254R next : this.f51076d.values()) {
            if (!next.mo43923h() && !this.f51074b.mo44565b(next)) {
                copyOnWriteArrayList.add(new C11291c(next.mo43926k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: x */
    private void m50835x(C11254R r) {
        String b = this.f51078f.get(r.mo43926k()).mo44005b();
        r.mo43922b(b);
        m50818f(2002, r);
        r.mo43897a(b);
    }

    /* renamed from: y */
    private void m50836y() {
        if (this.f51077e.isEmpty()) {
            mo44251k(C11376b.STATE_READY_TO_LOAD);
            m50822j(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1035}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Empty waterfall"}}, false);
            C11434o.m51097a().mo44452a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1035, "Empty waterfall"));
            return;
        }
        mo44251k(C11376b.STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f51077e.size() && i < this.f51084l; i2++) {
            C11254R r = this.f51077e.get(i2);
            if (r.f50600c) {
                if (!this.f51085m || !r.mo43923h()) {
                    m50835x(r);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + r.mo43926k() + ". No other instances will be loaded at the same time.";
                    m50830s(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m50835x(r);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + r.mo43926k() + " as a non bidder is being loaded";
                    m50830s(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44246a() {
        mo44251k(C11376b.STATE_AUCTION);
        AsyncTask.execute(new C11374a());
    }

    /* renamed from: a */
    public final void mo43850a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m50830s(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.f51092t = i2;
        this.f51093u = str2;
        this.f51083k = null;
        m50833v();
        if (TextUtils.isEmpty(str)) {
            m50821i(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            m50821i(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        m50836y();
    }

    /* renamed from: a */
    public final void mo43886a(C11254R r) {
        synchronized (this) {
            m50824m(r, "onInterstitialAdOpened");
            C11220A.m50068a().mo43691c();
            m50827p(IronSourceConstants.IS_INSTANCE_OPENED, r);
            if (this.f51086n) {
                C11291c cVar = this.f51078f.get(r.mo43926k());
                if (cVar != null) {
                    C11389h.m50959a(cVar, r.mo43924i(), this.f51080h, this.f51081i);
                    this.f51079g.put(r.mo43926k(), C11392i.C11393a.ISAuctionPerformanceShowedSuccessfully);
                    mo44447a(cVar, this.f51081i);
                } else {
                    String k = r.mo43926k();
                    m50830s("onInterstitialAdOpened showing instance " + k + " missing from waterfall");
                    Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1011};
                    m50821i(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f51075c}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo43887a(C11254R r, long j) {
        C11254R r2 = r;
        synchronized (this) {
            m50824m(r2, "onInterstitialAdReady");
            m50819g(2003, r2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            if (this.f51079g.containsKey(r.mo43926k())) {
                this.f51079g.put(r.mo43926k(), C11392i.C11393a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.f51075c == C11376b.STATE_LOADING_SMASHES) {
                mo44251k(C11376b.STATE_READY_TO_SHOW);
                C11220A.m50068a().mo43689b();
                m50821i(2004, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.f51091s)}});
                if (this.f51086n) {
                    C11291c cVar = this.f51078f.get(r.mo43926k());
                    if (cVar != null) {
                        C11389h.m50958a(cVar, r.mo43924i(), this.f51080h);
                        this.f51087o.mo44288a((CopyOnWriteArrayList<C11261V>) this.f51077e, this.f51078f, r.mo43924i(), this.f51080h, cVar);
                    } else {
                        String k = r.mo43926k();
                        m50830s("onInterstitialAdReady winner instance " + k + " missing from waterfall");
                        m50821i(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo43888a(IronSourceError ironSourceError, C11254R r) {
        synchronized (this) {
            m50824m(r, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            C11220A.m50068a().mo43690b(ironSourceError);
            m50828q(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, r, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            this.f51079g.put(r.mo43926k(), C11392i.C11393a.ISAuctionPerformanceFailedToShow);
            mo44251k(C11376b.STATE_READY_TO_LOAD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f0, code lost:
        if (r11 == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f2, code lost:
        r9 = "a non bidder is being loaded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f5, code lost:
        r9 = "a non bidder was already loaded successfully";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f7, code lost:
        r9 = "Advanced Loading: Won't start loading bidder " + r1.mo43926k() + " as " + r9;
        m50830s(r9);
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0147  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43889a(com.ironsource.mediationsdk.logger.IronSourceError r9, com.ironsource.mediationsdk.C11254R r10, long r11) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = "onInterstitialAdLoadFailed error="
            r1.<init>(r2)     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = r9.getErrorMessage()     // Catch:{ all -> 0x01b7 }
            r1.append(r2)     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = " state="
            r1.append(r2)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.e0$b r2 = r8.f51075c     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x01b7 }
            r1.append(r2)     // Catch:{ all -> 0x01b7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01b7 }
            m50824m(r10, r1)     // Catch:{ all -> 0x01b7 }
            int r1 = r9.getErrorCode()     // Catch:{ all -> 0x01b7 }
            r2 = 1158(0x486, float:1.623E-42)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != r2) goto L_0x005c
            r1 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b7 }
            int r9 = r9.getErrorCode()     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b7 }
            r6[r5] = r9     // Catch:{ all -> 0x01b7 }
            r2[r4] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b7 }
            r9[r5] = r11     // Catch:{ all -> 0x01b7 }
            r2[r5] = r9     // Catch:{ all -> 0x01b7 }
            r8.m50819g(r1, r10, r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x0092
        L_0x005c:
            r1 = 2200(0x898, float:3.083E-42)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b7 }
            int r7 = r9.getErrorCode()     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01b7 }
            r6[r5] = r7     // Catch:{ all -> 0x01b7 }
            r2[r4] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = "reason"
            r6[r4] = r7     // Catch:{ all -> 0x01b7 }
            java.lang.String r9 = r9.getErrorMessage()     // Catch:{ all -> 0x01b7 }
            r6[r5] = r9     // Catch:{ all -> 0x01b7 }
            r2[r5] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b7 }
            r9[r5] = r11     // Catch:{ all -> 0x01b7 }
            r2[r3] = r9     // Catch:{ all -> 0x01b7 }
            r8.m50819g(r1, r10, r2)     // Catch:{ all -> 0x01b7 }
        L_0x0092:
            if (r10 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r9 = r8.f51079g     // Catch:{ all -> 0x01b7 }
            java.lang.String r11 = r10.mo43926k()     // Catch:{ all -> 0x01b7 }
            boolean r9 = r9.containsKey(r11)     // Catch:{ all -> 0x01b7 }
            if (r9 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r9 = r8.f51079g     // Catch:{ all -> 0x01b7 }
            java.lang.String r11 = r10.mo43926k()     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.i$a r12 = com.ironsource.mediationsdk.C11392i.C11393a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x01b7 }
            r9.put(r11, r12)     // Catch:{ all -> 0x01b7 }
        L_0x00ab:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.R> r9 = r8.f51077e     // Catch:{ all -> 0x01b7 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01b7 }
            r11 = 0
            r12 = 0
        L_0x00b3:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x0150
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.R r1 = (com.ironsource.mediationsdk.C11254R) r1     // Catch:{ all -> 0x01b7 }
            boolean r2 = r1.f50600c     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0134
            boolean r2 = r8.f51085m     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0118
            boolean r2 = r1.mo43923h()     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0118
            if (r11 != 0) goto L_0x00f0
            if (r12 == 0) goto L_0x00d2
            goto L_0x00f0
        L_0x00d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = "Advanced Loading: Starting to load bidder "
            r2.<init>(r6)     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = r1.mo43926k()     // Catch:{ all -> 0x01b7 }
            r2.append(r6)     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = ". No other instances will be loaded at the same time."
            r2.append(r6)     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b7 }
            m50830s(r2)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x0118
        L_0x00f0:
            if (r11 == 0) goto L_0x00f5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00f7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            java.lang.String r12 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r12)     // Catch:{ all -> 0x01b7 }
            java.lang.String r12 = r1.mo43926k()     // Catch:{ all -> 0x01b7 }
            r10.append(r12)     // Catch:{ all -> 0x01b7 }
            java.lang.String r12 = " as "
            r10.append(r12)     // Catch:{ all -> 0x01b7 }
            r10.append(r9)     // Catch:{ all -> 0x01b7 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x01b7 }
            m50830s(r9)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x01b7 }
            goto L_0x0150
        L_0x0118:
            r0.add(r1)     // Catch:{ all -> 0x01b7 }
            boolean r2 = r8.f51085m     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0150
            boolean r2 = r10.mo43923h()     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0150
            boolean r1 = r1.mo43923h()     // Catch:{ all -> 0x01b7 }
            if (r1 != 0) goto L_0x0150
            int r1 = r0.size()     // Catch:{ all -> 0x01b7 }
            int r2 = r8.f51084l     // Catch:{ all -> 0x01b7 }
            if (r1 >= r2) goto L_0x0150
            goto L_0x0144
        L_0x0134:
            com.ironsource.mediationsdk.R$a r2 = r1.f50551h     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.R$a r6 = com.ironsource.mediationsdk.C11254R.C11255a.INIT_IN_PROGRESS     // Catch:{ all -> 0x01b7 }
            if (r2 == r6) goto L_0x0141
            com.ironsource.mediationsdk.R$a r6 = com.ironsource.mediationsdk.C11254R.C11255a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x01b7 }
            if (r2 != r6) goto L_0x013f
            goto L_0x0141
        L_0x013f:
            r2 = 0
            goto L_0x0142
        L_0x0141:
            r2 = 1
        L_0x0142:
            if (r2 == 0) goto L_0x0147
        L_0x0144:
            r11 = 1
            goto L_0x00b3
        L_0x0147:
            boolean r1 = r1.mo43901g()     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x00b3
            r12 = 1
            goto L_0x00b3
        L_0x0150:
            int r9 = r0.size()     // Catch:{ all -> 0x01b7 }
            if (r9 != 0) goto L_0x018a
            com.ironsource.mediationsdk.e0$b r9 = r8.f51075c     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.e0$b r10 = com.ironsource.mediationsdk.C11373e0.C11376b.STATE_LOADING_SMASHES     // Catch:{ all -> 0x01b7 }
            if (r9 != r10) goto L_0x018a
            if (r11 != 0) goto L_0x018a
            com.ironsource.mediationsdk.o r9 = com.ironsource.mediationsdk.C11434o.m51097a()     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01b7 }
            java.lang.String r12 = "No ads to show"
            r1 = 509(0x1fd, float:7.13E-43)
            r11.<init>(r1, r12)     // Catch:{ all -> 0x01b7 }
            r9.mo44452a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r10, (com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x01b7 }
            r9 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r10 = new java.lang.Object[r5][]     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r12 = "errorCode"
            r11[r4] = r12     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01b7 }
            r11[r5] = r12     // Catch:{ all -> 0x01b7 }
            r10[r4] = r11     // Catch:{ all -> 0x01b7 }
            r8.m50821i(r9, r10)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.e0$b r9 = com.ironsource.mediationsdk.C11373e0.C11376b.STATE_READY_TO_LOAD     // Catch:{ all -> 0x01b7 }
            r8.mo44251k(r9)     // Catch:{ all -> 0x01b7 }
        L_0x018a:
            monitor-exit(r8)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "smashesToLoad.size() = "
            r10.<init>(r11)
            int r11 = r0.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.verbose(r10)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01b6
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.R r10 = (com.ironsource.mediationsdk.C11254R) r10
            r8.m50835x(r10)
            goto L_0x01a6
        L_0x01b6:
            return
        L_0x01b7:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01b7 }
            goto L_0x01bb
        L_0x01ba:
            throw r9
        L_0x01bb:
            goto L_0x01ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11373e0.mo43889a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.R, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x018e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44247a(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.e0$b r0 = r8.f51075c     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.e0$b r1 = com.ironsource.mediationsdk.C11373e0.C11376b.STATE_SHOWING     // Catch:{ all -> 0x01d9 }
            r2 = 2111(0x83f, float:2.958E-42)
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 != r1) goto L_0x003e
            java.lang.String r9 = "showInterstitial error: can't show ad while an ad is already showing"
            m50831t(r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01d9 }
            r1 = 1036(0x40c, float:1.452E-42)
            r0.<init>(r1, r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.A r6 = com.ironsource.mediationsdk.C11220A.m50068a()     // Catch:{ all -> 0x01d9 }
            r6.mo43690b((com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x01d9 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01d9 }
            r6[r3] = r1     // Catch:{ all -> 0x01d9 }
            r0[r5] = r6     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01d9 }
            r1[r3] = r9     // Catch:{ all -> 0x01d9 }
            r0[r3] = r1     // Catch:{ all -> 0x01d9 }
            r8.m50822j(r2, r0, r5)     // Catch:{ all -> 0x01d9 }
            monitor-exit(r8)
            return
        L_0x003e:
            com.ironsource.mediationsdk.e0$b r1 = com.ironsource.mediationsdk.C11373e0.C11376b.STATE_READY_TO_SHOW     // Catch:{ all -> 0x01d9 }
            r6 = 509(0x1fd, float:7.13E-43)
            if (r0 == r1) goto L_0x008b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "showInterstitial() error state="
            r9.<init>(r0)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.e0$b r0 = r8.f51075c     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01d9 }
            r9.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01d9 }
            m50830s(r9)     // Catch:{ all -> 0x01d9 }
            java.lang.String r9 = "showInterstitial error: show called while no ads are available"
            m50831t(r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01d9 }
            r0.<init>(r6, r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.A r1 = com.ironsource.mediationsdk.C11220A.m50068a()     // Catch:{ all -> 0x01d9 }
            r1.mo43690b((com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x01d9 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r7 = "errorCode"
            r1[r5] = r7     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01d9 }
            r1[r3] = r6     // Catch:{ all -> 0x01d9 }
            r0[r5] = r1     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01d9 }
            r1[r3] = r9     // Catch:{ all -> 0x01d9 }
            r0[r3] = r1     // Catch:{ all -> 0x01d9 }
            r8.m50821i(r2, r0)     // Catch:{ all -> 0x01d9 }
            monitor-exit(r8)
            return
        L_0x008b:
            if (r9 != 0) goto L_0x00bf
            java.lang.String r9 = "showInterstitial error: empty default placement"
            m50831t(r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01d9 }
            r1 = 1020(0x3fc, float:1.43E-42)
            r0.<init>(r1, r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.A r6 = com.ironsource.mediationsdk.C11220A.m50068a()     // Catch:{ all -> 0x01d9 }
            r6.mo43690b((com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x01d9 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01d9 }
            r6[r3] = r1     // Catch:{ all -> 0x01d9 }
            r0[r5] = r6     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01d9 }
            r1[r3] = r9     // Catch:{ all -> 0x01d9 }
            r0[r3] = r1     // Catch:{ all -> 0x01d9 }
            r8.m50821i(r2, r0)     // Catch:{ all -> 0x01d9 }
            monitor-exit(r8)
            return
        L_0x00bf:
            r8.f51081i = r9     // Catch:{ all -> 0x01d9 }
            r9 = 2100(0x834, float:2.943E-42)
            r8.m50826o(r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.environment.ContextProvider r9 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01d9 }
            android.content.Context r9 = r9.getApplicationContext()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r8.f51081i     // Catch:{ all -> 0x01d9 }
            boolean r9 = com.ironsource.mediationsdk.utils.C11484c.m51235a((android.content.Context) r9, (java.lang.String) r0)     // Catch:{ all -> 0x01d9 }
            if (r9 == 0) goto L_0x011b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "placement "
            r9.<init>(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r8.f51081i     // Catch:{ all -> 0x01d9 }
            r9.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = " is capped"
            r9.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01d9 }
            m50831t(r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01d9 }
            r1 = 524(0x20c, float:7.34E-43)
            r0.<init>(r1, r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.A r6 = com.ironsource.mediationsdk.C11220A.m50068a()     // Catch:{ all -> 0x01d9 }
            r6.mo43690b((com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x01d9 }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01d9 }
            r6[r3] = r1     // Catch:{ all -> 0x01d9 }
            r0[r5] = r6     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01d9 }
            r1[r3] = r9     // Catch:{ all -> 0x01d9 }
            r0[r3] = r1     // Catch:{ all -> 0x01d9 }
            r8.m50829r(r2, r0)     // Catch:{ all -> 0x01d9 }
            monitor-exit(r8)
            return
        L_0x011b:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.R> r9 = r8.f51077e     // Catch:{ all -> 0x01d9 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01d9 }
        L_0x0121:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.R r0 = (com.ironsource.mediationsdk.C11254R) r0     // Catch:{ all -> 0x01d9 }
            boolean r1 = r0.mo43901g()     // Catch:{ all -> 0x01d9 }
            if (r1 == 0) goto L_0x018f
            java.lang.String r9 = r8.f51081i     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.e0$b r1 = com.ironsource.mediationsdk.C11373e0.C11376b.STATE_SHOWING     // Catch:{ all -> 0x01d9 }
            r8.mo44251k(r1)     // Catch:{ all -> 0x01d9 }
            r0.mo43899c()     // Catch:{ all -> 0x01d9 }
            r1 = 2201(0x899, float:3.084E-42)
            r8.m50827p(r1, r0)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.utils.m r1 = r8.f51074b     // Catch:{ all -> 0x01d9 }
            r1.mo44563a(r0)     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.utils.m r1 = r8.f51074b     // Catch:{ all -> 0x01d9 }
            boolean r1 = r1.mo44565b(r0)     // Catch:{ all -> 0x01d9 }
            if (r1 == 0) goto L_0x016f
            r0.mo43900f()     // Catch:{ all -> 0x01d9 }
            r1 = 2401(0x961, float:3.365E-42)
            r8.m50818f(r1, r0)     // Catch:{ all -> 0x01d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r1.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r0.mo43926k()     // Catch:{ all -> 0x01d9 }
            r1.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = " was session capped"
            r1.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x01d9 }
        L_0x016f:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01d9 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01d9 }
            com.ironsource.mediationsdk.utils.C11484c.m51247d(r0, r9)     // Catch:{ all -> 0x01d9 }
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01d9 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01d9 }
            boolean r9 = com.ironsource.mediationsdk.utils.C11484c.m51235a((android.content.Context) r0, (java.lang.String) r9)     // Catch:{ all -> 0x01d9 }
            if (r9 == 0) goto L_0x018d
            r9 = 2400(0x960, float:3.363E-42)
            r8.m50826o(r9)     // Catch:{ all -> 0x01d9 }
        L_0x018d:
            monitor-exit(r8)
            return
        L_0x018f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            java.lang.String r7 = "showInterstitial "
            r1.<init>(r7)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r0.mo43926k()     // Catch:{ all -> 0x01d9 }
            r1.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = " isReadyToShow() == false"
            r1.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d9 }
            m50830s(r0)     // Catch:{ all -> 0x01d9 }
            goto L_0x0121
        L_0x01ab:
            com.ironsource.mediationsdk.A r9 = com.ironsource.mediationsdk.C11220A.m50068a()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r0)     // Catch:{ all -> 0x01d9 }
            r9.mo43690b((com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x01d9 }
            java.lang.Object[][] r9 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r1 = "errorCode"
            r0[r5] = r1     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01d9 }
            r0[r3] = r1     // Catch:{ all -> 0x01d9 }
            r9[r5] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d9 }
            java.lang.String r1 = "reason"
            r0[r5] = r1     // Catch:{ all -> 0x01d9 }
            java.lang.String r1 = "Show Fail - No ads to show"
            r0[r3] = r1     // Catch:{ all -> 0x01d9 }
            r9[r3] = r0     // Catch:{ all -> 0x01d9 }
            r8.m50829r(r2, r9)     // Catch:{ all -> 0x01d9 }
            monitor-exit(r8)
            return
        L_0x01d9:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x01dd
        L_0x01dc:
            throw r9
        L_0x01dd:
            goto L_0x01dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11373e0.mo44247a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo43855a(List<C11291c> list, String str, C11291c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        this.f51082j = str;
        this.f51080h = cVar;
        this.f51083k = jSONObject;
        this.f51092t = i;
        this.f51093u = "";
        m50822j(IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}, false);
        if (!TextUtils.isEmpty(str2)) {
            m50822j(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}, false);
        }
        m50825n(list);
        m50836y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44248a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Should Track Network State: " + z, 0);
        this.f51094v = z;
    }

    /* renamed from: b */
    public final void mo43890b(C11254R r) {
        synchronized (this) {
            m50824m(r, "onInterstitialAdClosed");
            m50828q(IronSourceConstants.IS_INSTANCE_CLOSED, r, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C11499n.m51312a().mo44568b(2))}});
            C11499n.m51312a().mo44566a(2);
            C11220A.m50068a().mo43692d();
            mo44251k(C11376b.STATE_READY_TO_LOAD);
        }
    }

    /* renamed from: b */
    public final void mo43891b(IronSourceError ironSourceError, C11254R r) {
        m50819g(IronSourceConstants.IS_INSTANCE_INIT_FAILED, r, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
    }

    /* renamed from: c */
    public final void mo43892c(C11254R r) {
        m50824m(r, "onInterstitialAdShowSucceeded");
        C11220A.m50068a().mo43693e();
        m50827p(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, r);
    }

    /* renamed from: d */
    public final synchronized void mo44249d() {
        C11376b bVar = this.f51075c;
        if (bVar == C11376b.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            C11220A.m50068a().mo43687a(new IronSourceError(1037, "loadInterstitial: load cannot be invoked while showing an ad"));
        } else if ((bVar == C11376b.STATE_READY_TO_LOAD || bVar == C11376b.STATE_READY_TO_SHOW) && !C11434o.m51097a().mo44453a(IronSource.AD_UNIT.INTERSTITIAL)) {
            this.f51082j = "";
            this.f51081i = "";
            this.f51083k = null;
            m50822j(2001, (Object[][]) null, false);
            this.f51091s = new Date().getTime();
            if (this.f51086n) {
                if (!this.f51079g.isEmpty()) {
                    this.f51088p.mo44295a(this.f51079g);
                    this.f51079g.clear();
                }
                mo44246a();
                return;
            }
            m50833v();
            m50836y();
        } else {
            m50830s("loadInterstitial: load is already in progress");
        }
    }

    /* renamed from: d */
    public final void mo43893d(C11254R r) {
        m50824m(r, "onInterstitialAdClicked");
        C11220A.m50068a().mo43694f();
        m50827p(2006, r);
    }

    /* renamed from: e */
    public final void mo43894e(C11254R r) {
        m50824m(r, "onInterstitialAdVisible");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo44250e() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f51094v     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0039 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0039 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x001a
        L_0x0014:
            com.ironsource.mediationsdk.e0$b r0 = r3.f51075c     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.e0$b r2 = com.ironsource.mediationsdk.C11373e0.C11376b.STATE_READY_TO_SHOW     // Catch:{ all -> 0x0039 }
            if (r0 == r2) goto L_0x001c
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.R> r0 = r3.f51077e     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x0022:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.R r2 = (com.ironsource.mediationsdk.C11254R) r2     // Catch:{ all -> 0x0039 }
            boolean r2 = r2.mo43901g()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0022
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x0037:
            monitor-exit(r3)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x003d
        L_0x003c:
            throw r0
        L_0x003d:
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11373e0.mo44250e():boolean");
    }

    /* renamed from: f */
    public final void mo43895f(C11254R r) {
        m50818f(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo44251k(C11376b bVar) {
        this.f51075c = bVar;
        m50830s("state=" + bVar);
    }
}
