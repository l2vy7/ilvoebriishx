package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11392i;
import com.ironsource.mediationsdk.C11412m;
import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C11421g;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p275a.C11291c;
import com.ironsource.mediationsdk.p275a.C11292d;
import com.ironsource.mediationsdk.p284b.C11351b;
import com.ironsource.mediationsdk.server.C11478b;
import com.ironsource.mediationsdk.utils.C11484c;
import com.ironsource.mediationsdk.utils.C11490f;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.M */
public final class C11243M extends C11433n implements C11250N, C11351b.C11352a, C11386g {

    /* renamed from: b */
    C11478b f50491b;

    /* renamed from: c */
    private C11249e f50492c = C11249e.NONE;

    /* renamed from: d */
    C11351b f50493d;

    /* renamed from: e */
    IronSourceBannerLayout f50494e;

    /* renamed from: f */
    C11421g f50495f;

    /* renamed from: g */
    private int f50496g;

    /* renamed from: h */
    C11251O f50497h;

    /* renamed from: i */
    int f50498i;

    /* renamed from: j */
    final ConcurrentHashMap<String, C11251O> f50499j;

    /* renamed from: k */
    private CopyOnWriteArrayList<C11251O> f50500k;

    /* renamed from: l */
    private String f50501l;

    /* renamed from: m */
    private JSONObject f50502m;

    /* renamed from: n */
    private String f50503n = "";

    /* renamed from: o */
    private int f50504o;

    /* renamed from: p */
    C11389h f50505p;

    /* renamed from: q */
    private C11291c f50506q;

    /* renamed from: r */
    C11392i f50507r;

    /* renamed from: s */
    private ConcurrentHashMap<String, C11291c> f50508s;

    /* renamed from: t */
    ConcurrentHashMap<String, C11392i.C11393a> f50509t;

    /* renamed from: u */
    long f50510u;

    /* renamed from: v */
    private final Object f50511v = new Object();

    /* renamed from: w */
    private C11490f f50512w;

    /* renamed from: com.ironsource.mediationsdk.M$a */
    class C11244a implements C11412m.C11414g {

        /* renamed from: a */
        private /* synthetic */ C11421g f50513a;

        /* renamed from: b */
        private /* synthetic */ IronSourceBannerLayout f50514b;

        C11244a(C11421g gVar, IronSourceBannerLayout ironSourceBannerLayout) {
            this.f50513a = gVar;
            this.f50514b = ironSourceBannerLayout;
        }

        /* renamed from: a */
        public final void mo43866a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f50513a.getPlacementName());
            C11243M m = C11243M.this;
            m.f50494e = this.f50514b;
            m.f50495f = this.f50513a;
            if (C11484c.m51241b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f50513a.getPlacementName())) {
                ironLog.verbose("placement is capped");
                C11399j a = C11399j.m50992a();
                IronSourceBannerLayout ironSourceBannerLayout = this.f50514b;
                a.mo44318a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + this.f50513a.getPlacementName() + " is capped"));
                C11243M.this.m50222f(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
                C11243M.this.mo43863h(C11249e.READY_TO_LOAD);
                return;
            }
            C11243M.this.m50220a(false);
        }

        /* renamed from: a */
        public final void mo43867a(String str) {
            IronLog ironLog = IronLog.API;
            ironLog.error("can't load banner - errorMessage = " + str);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.M$b */
    class C11245b implements C11412m.C11414g {

        /* renamed from: a */
        private /* synthetic */ IronSourceBannerLayout f50516a;

        C11245b(IronSourceBannerLayout ironSourceBannerLayout) {
            this.f50516a = ironSourceBannerLayout;
        }

        /* renamed from: a */
        public final void mo43866a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("destroying banner");
            C11243M.this.f50493d.mo44194d();
            C11243M m = C11243M.this;
            C11251O o = m.f50497h;
            C11243M.this.mo43862g(IronSourceConstants.BN_DESTROY, (Object[][]) null, o != null ? o.mo43928m() : m.f50498i);
            C11243M m2 = C11243M.this;
            if (m2.f50497h != null) {
                ironLog.verbose("mActiveSmash = " + m2.f50497h.mo43931p());
                m2.f50497h.mo43871a();
                m2.f50497h = null;
            }
            this.f50516a.mo20637h();
            C11243M m3 = C11243M.this;
            m3.f50494e = null;
            m3.f50495f = null;
            m3.mo43863h(C11249e.READY_TO_LOAD);
        }

        /* renamed from: a */
        public final void mo43867a(String str) {
            IronLog ironLog = IronLog.API;
            ironLog.error("destroy banner failed - errorMessage = " + str);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.M$c */
    class C11246c implements Runnable {

        /* renamed from: com.ironsource.mediationsdk.M$c$a */
        class C11247a implements C11412m.C11413f {
            C11247a() {
            }

            /* renamed from: a */
            public final void mo43869a(Map<String, Object> map, List<String> list, StringBuilder sb) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("auction waterfallString = " + sb);
                if (map.size() == 0 && list.size() == 0) {
                    C11243M.this.m50222f(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
                    if (C11243M.this.mo43864n(C11249e.AUCTION, C11249e.LOADED)) {
                        C11243M m = C11243M.this;
                        m.f50493d.mo44193a(m);
                        return;
                    }
                    C11399j.m50992a().mo44318a(C11243M.this.f50494e, new IronSourceError(1005, "No candidates available for auctioning"));
                    C11243M.this.m50222f(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
                    C11243M.this.mo43863h(C11249e.READY_TO_LOAD);
                    return;
                }
                C11243M.this.m50222f(IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
                C11389h hVar = C11243M.this.f50505p;
                if (hVar != null) {
                    Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                    C11243M m2 = C11243M.this;
                    C11392i iVar = m2.f50507r;
                    int i = m2.f50498i;
                    hVar.f51179j = C11243M.m50221d(m2);
                    hVar.mo44287a(applicationContext, map, list, iVar, i);
                    return;
                }
                ironLog.error("mAuctionHandler is null");
            }
        }

        C11246c() {
        }

        public final void run() {
            boolean z;
            C11243M m = C11243M.this;
            if (!m.f50509t.isEmpty()) {
                m.f50507r.mo44295a(m.f50509t);
                m.f50509t.clear();
            }
            C11243M m2 = C11243M.this;
            long d = m2.f50491b.mo44528d() - (new Date().getTime() - m2.f50510u);
            if (d > 0) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("waiting before auction - timeToWaitBeforeAuction = " + d);
                new Timer().schedule(new C11248d(), d);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C11243M.this.mo43860e((int) IronSourceConstants.BN_AUCTION_REQUEST);
                C11412m.m51071b(C11243M.this.mo43865r(), C11243M.this.f50499j, new C11247a());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.M$d */
    class C11248d extends TimerTask {
        C11248d() {
        }

        public final void run() {
            C11243M.this.mo43858d();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.M$e */
    enum C11249e {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public C11243M(List<NetworkSettings> list, C11478b bVar, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isAuctionEnabled = " + bVar.mo44527c());
        this.f50491b = bVar;
        this.f50493d = new C11351b(bVar.mo44531g());
        this.f50499j = new ConcurrentHashMap<>();
        this.f50500k = new CopyOnWriteArrayList<>();
        this.f50508s = new ConcurrentHashMap<>();
        this.f50509t = new ConcurrentHashMap<>();
        this.f50498i = C11499n.m51312a().mo44568b(3);
        C11399j.m50992a().f51258c = this.f50491b.mo44529e();
        if (this.f50491b.mo44527c()) {
            this.f50505p = new C11389h("banner", this.f50491b.mo44532h(), this);
        }
        m50226l(list);
        m50228o(list);
        this.f50510u = new Date().getTime();
        mo43863h(C11249e.READY_TO_LOAD);
    }

    /* renamed from: A */
    private boolean m50218A() {
        boolean z;
        synchronized (this.f50511v) {
            z = this.f50492c == C11249e.LOADED;
        }
        return z;
    }

    /* renamed from: B */
    private boolean m50219B() {
        C11249e eVar = this.f50492c;
        return eVar == C11249e.RELOADING || eVar == C11249e.AUCTION;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50220a(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f50492c);
        if (mo43864n(C11249e.STARTED_LOADING, this.f50491b.mo44527c() ? z ? C11249e.AUCTION : C11249e.FIRST_AUCTION : z ? C11249e.RELOADING : C11249e.LOADING)) {
            this.f50512w = new C11490f();
            this.f50501l = "";
            this.f50502m = null;
            this.f50496g = 0;
            this.f50498i = C11499n.m51312a().mo44568b(3);
            m50222f(z ? IronSourceConstants.BN_RELOAD : 3001, (Object[][]) null);
            if (this.f50491b.mo44527c()) {
                mo43858d();
                return;
            }
            m50233u();
            m50231s();
            return;
        }
        ironLog.error("wrong state - " + this.f50492c);
    }

    /* renamed from: d */
    static /* synthetic */ ISBannerSize m50221d(C11243M m) {
        IronSourceBannerLayout ironSourceBannerLayout = m.f50494e;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return m.f50494e.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity()) ? ISBannerSize.f22089d : ISBannerSize.BANNER : m.f50494e.getSize();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m50222f(int i, Object[][] objArr) {
        mo43862g(i, objArr, this.f50498i);
    }

    /* renamed from: k */
    private void m50225k(C11251O o, C11291c cVar) {
        C11389h.m50959a(cVar, o.mo43924i(), this.f50506q, mo43865r());
        mo44447a(this.f50508s.get(o.mo43926k()), mo43865r());
    }

    /* renamed from: l */
    private void m50226l(List<NetworkSettings> list) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f50507r = new C11392i(arrayList, this.f50491b.mo44532h().f51537f);
    }

    /* renamed from: m */
    private static void m50227m(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals(AdPreferences.TYPE_BANNER)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* renamed from: o */
    private void m50228o(List<NetworkSettings> list) {
        for (int i = 0; i < list.size(); i++) {
            NetworkSettings networkSettings = list.get(i);
            AbstractAdapter a = C11369d.m50788a().mo44228a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a != null) {
                C11251O o = new C11251O(this.f50491b, this, networkSettings, a, this.f50498i, m50219B());
                this.f50499j.put(o.mo43926k(), o);
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
            }
        }
    }

    /* renamed from: p */
    private static boolean m50229p(int i) {
        return i == 3201 || i == 3110 || i == 3111 || i == 3116 || i == 3119 || i == 3112 || i == 3115 || i == 3501 || i == 3502;
    }

    /* renamed from: q */
    private String m50230q(List<C11291c> list) {
        int i;
        int i2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("waterfall.size() = " + list.size());
        this.f50500k.clear();
        this.f50508s.clear();
        this.f50509t.clear();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < list.size()) {
            C11291c cVar = list.get(i3);
            C11251O o = this.f50499j.get(cVar.mo44004a());
            if (o != null) {
                AbstractAdapter a = C11369d.m50788a().mo44227a(o.f50599b.f51346a);
                if (a != null) {
                    C11478b bVar = this.f50491b;
                    NetworkSettings networkSettings = o.f50599b.f51346a;
                    int i4 = this.f50498i;
                    String str = this.f50501l;
                    JSONObject jSONObject = this.f50502m;
                    int i5 = this.f50504o;
                    C11251O o2 = r0;
                    String str2 = this.f50503n;
                    i = i3;
                    i2 = 1;
                    C11251O o3 = new C11251O(bVar, this, networkSettings, a, i4, str, jSONObject, i5, str2, m50219B());
                    o2.f50600c = true;
                    this.f50500k.add(o2);
                    this.f50508s.put(o2.mo43926k(), cVar);
                    this.f50509t.put(cVar.mo44004a(), C11392i.C11393a.ISAuctionPerformanceDidntAttemptToLoad);
                } else {
                    i = i3;
                    i2 = 1;
                }
            } else {
                i = i3;
                i2 = 1;
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("could not find matching smash for auction response item - item = " + cVar.mo44004a());
            }
            C11251O o4 = this.f50499j.get(cVar.mo44004a());
            String str3 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            if (o4 == null ? !TextUtils.isEmpty(cVar.mo44005b()) : o4.mo43923h()) {
                str3 = "2";
            }
            sb.append(str3 + cVar.mo44004a());
            int i6 = i;
            if (i6 != list.size() - i2) {
                sb.append(",");
            }
            i3 = i6 + 1;
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    /* renamed from: s */
    private void m50231s() {
        int i = this.f50496g;
        while (true) {
            String str = null;
            if (i < this.f50500k.size()) {
                C11251O o = this.f50500k.get(i);
                if (o.f50600c) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("loading smash - " + o.mo43931p());
                    this.f50496g = i + 1;
                    if (o.mo43923h()) {
                        str = this.f50508s.get(o.mo43926k()).mo44005b();
                        o.mo43922b(str);
                    }
                    o.mo43873a(this.f50494e.mo20628b(), this.f50495f, str);
                    return;
                }
                i++;
            } else {
                String str2 = this.f50500k.isEmpty() ? "Empty waterfall" : "Mediation No fill";
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("errorReason = " + str2);
                m50232t((C11251O) null);
                C11249e eVar = C11249e.LOADING;
                C11249e eVar2 = C11249e.READY_TO_LOAD;
                if (mo43864n(eVar, eVar2)) {
                    m50222f(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f50512w))}});
                    C11399j.m50992a().mo44318a(this.f50494e, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str2));
                    return;
                } else if (mo43864n(C11249e.RELOADING, C11249e.LOADED)) {
                    m50222f(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f50512w))}});
                    this.f50493d.mo44193a(this);
                    return;
                } else {
                    mo43863h(eVar2);
                    ironLog2.error("wrong state = " + this.f50492c);
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private void m50232t(C11251O o) {
        Iterator<C11251O> it = this.f50500k.iterator();
        while (it.hasNext()) {
            C11251O next = it.next();
            if (!next.equals(o)) {
                next.mo43876d();
            }
        }
    }

    /* renamed from: u */
    private void m50233u() {
        List<C11291c> v = m50234v();
        this.f50501l = C11433n.m51092c();
        m50230q(v);
    }

    /* renamed from: v */
    private List<C11291c> m50234v() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C11251O next : this.f50499j.values()) {
            if (!next.mo43923h() && !C11484c.m51241b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), mo43865r())) {
                copyOnWriteArrayList.add(new C11291c(next.mo43926k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: w */
    private boolean m50235w() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f50494e;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: x */
    private ISBannerSize m50236x() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f50494e;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    /* renamed from: y */
    private boolean m50237y() {
        boolean z;
        synchronized (this.f50511v) {
            C11249e eVar = this.f50492c;
            if (eVar != C11249e.LOADING) {
                if (eVar != C11249e.RELOADING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: z */
    private boolean m50238z() {
        boolean z;
        synchronized (this.f50511v) {
            C11249e eVar = this.f50492c;
            if (eVar != C11249e.FIRST_AUCTION) {
                if (eVar != C11249e.AUCTION) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43849a() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = "checking with IronsourceLifecycleManager if app in foreground"
            r0.verbose(r1)
            com.ironsource.lifecycle.d r1 = com.ironsource.lifecycle.C4991d.m22849a()
            boolean r1 = r1.mo20611b()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x007c
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r6.f50494e
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = "banner is null"
        L_0x0019:
            r0.verbose(r1)
            r1 = 0
            goto L_0x004e
        L_0x001e:
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = "banner or one of its parents are INVISIBLE or GONE"
            goto L_0x0019
        L_0x0027:
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r6.f50494e
            boolean r1 = r1.hasWindowFocus()
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = "banner has no window focus"
            goto L_0x0019
        L_0x0032:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r4 = r6.f50494e
            boolean r1 = r4.getGlobalVisibleRect(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "visible = "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.verbose(r4)
        L_0x004e:
            if (r1 == 0) goto L_0x0079
            com.ironsource.mediationsdk.M$e r1 = com.ironsource.mediationsdk.C11243M.C11249e.LOADED
            com.ironsource.mediationsdk.M$e r4 = com.ironsource.mediationsdk.C11243M.C11249e.STARTED_LOADING
            boolean r1 = r6.mo43864n(r1, r4)
            if (r1 == 0) goto L_0x0063
            java.lang.String r1 = "start loading"
            r0.verbose(r1)
            r6.m50220a((boolean) r2)
            goto L_0x0076
        L_0x0063:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "wrong state = "
            r1.<init>(r4)
            com.ironsource.mediationsdk.M$e r4 = r6.f50492c
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.error(r1)
        L_0x0076:
            r1 = 0
            r4 = 0
            goto L_0x007f
        L_0x0079:
            java.lang.String r1 = "banner is not visible - start reload timer"
            goto L_0x007e
        L_0x007c:
            java.lang.String r1 = "app in background - start reload timer"
        L_0x007e:
            r4 = 1
        L_0x007f:
            if (r4 == 0) goto L_0x00a1
            r0.verbose(r1)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            r1[r3] = r4
            r6.m50222f(r0, r1)
            com.ironsource.mediationsdk.b.b r0 = r6.f50493d
            r0.mo44193a(r6)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11243M.mo43849a():void");
    }

    /* renamed from: a */
    public final void mo43850a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (m50238z()) {
            this.f50503n = str2;
            this.f50504o = i2;
            this.f50502m = null;
            m50233u();
            m50222f(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
            mo43863h(this.f50492c == C11249e.FIRST_AUCTION ? C11249e.LOADING : C11249e.RELOADING);
            m50231s();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f50492c);
    }

    /* renamed from: a */
    public final void mo43851a(IronSourceBannerLayout ironSourceBannerLayout, C11421g gVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (!mo43864n(C11249e.READY_TO_LOAD, C11249e.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (!C11399j.m50992a().mo44320b()) {
            C11412m.m51067a(ironSourceBannerLayout, gVar, new C11244a(gVar, ironSourceBannerLayout));
        } else {
            ironLog.verbose("can't load banner - already has pending invocation");
        }
    }

    /* renamed from: a */
    public final void mo43852a(C11251O o) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(o.mo43931p());
        if (m50235w()) {
            this.f50494e.mo20639j();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo43862g(IronSourceConstants.BN_CALLBACK_CLICK, objArr, o.mo43928m());
    }

    /* renamed from: a */
    public final void mo43853a(C11251O o, View view, FrameLayout.LayoutParams layoutParams) {
        C11251O o2 = o;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + o.mo43931p());
        if (o2.f50535m != this.f50501l) {
            ironLog.error("invoked with auctionId: " + o2.f50535m + " and the current id is " + this.f50501l);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            o2.mo43872a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction id " + o2.f50535m + " State - " + this.f50492c}, new Object[]{IronSourceConstants.EVENTS_EXT1, o.mo43926k()}});
        } else if (m50237y()) {
            C11251O o3 = this.f50497h;
            if (o3 != null) {
                o3.mo43876d();
            }
            m50232t(o);
            this.f50497h = o2;
            this.f50494e.mo20629c(view, layoutParams);
            this.f50509t.put(o.mo43926k(), C11392i.C11393a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f50491b.mo44527c()) {
                C11291c cVar = this.f50508s.get(o.mo43926k());
                if (cVar != null) {
                    C11389h.m50958a(cVar, o.mo43924i(), this.f50506q);
                    this.f50505p.mo44288a((CopyOnWriteArrayList<C11261V>) this.f50500k, this.f50508s, o.mo43924i(), this.f50506q, cVar);
                    if (!this.f50491b.mo44532h().f51550s) {
                        m50225k(o2, cVar);
                    }
                } else {
                    String k = o.mo43926k();
                    ironLog.error("onLoadSuccess winner instance " + k + " missing from waterfall. auctionId = " + this.f50501l);
                    m50222f(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
            if (this.f50492c == C11249e.LOADING) {
                this.f50494e.mo20631e(o.mo43926k());
                m50222f(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f50512w))}});
            } else {
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                m50222f(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C11490f.m51271a(this.f50512w))}});
            }
            String r = mo43865r();
            C11484c.m51250f(ContextProvider.getInstance().getCurrentActiveActivity(), r);
            if (C11484c.m51241b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), r)) {
                m50222f(IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            C11499n.m51312a().mo44566a(3);
            mo43863h(C11249e.LOADED);
            this.f50493d.mo44193a(this);
        } else {
            ironLog.warning("wrong state - mCurrentState = " + this.f50492c);
        }
    }

    /* renamed from: a */
    public final void mo43854a(IronSourceError ironSourceError, C11251O o) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (o.f50535m != this.f50501l) {
            ironLog.error("invoked with auctionId: " + o.f50535m + " and the current id is " + this.f50501l);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 3};
            o.mo43872a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction " + o.f50535m + " State - " + this.f50492c}, new Object[]{IronSourceConstants.EVENTS_EXT1, o.mo43926k()}});
        } else if (m50237y()) {
            this.f50509t.put(o.mo43926k(), C11392i.C11393a.ISAuctionPerformanceFailedToLoad);
            m50231s();
        } else {
            ironLog.warning("wrong state - mCurrentState = " + this.f50492c);
        }
    }

    /* renamed from: a */
    public final void mo43855a(List<C11291c> list, String str, C11291c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (m50238z()) {
            this.f50503n = "";
            this.f50501l = str;
            this.f50504o = i;
            this.f50506q = cVar;
            this.f50502m = jSONObject;
            m50222f(IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            mo43863h(this.f50492c == C11249e.FIRST_AUCTION ? C11249e.LOADING : C11249e.RELOADING);
            m50222f(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, m50230q(list)}});
            if (!TextUtils.isEmpty(str2)) {
                m50222f(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
            }
            m50231s();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f50492c);
    }

    /* renamed from: b */
    public final void mo43856b(C11251O o) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(o.mo43931p());
        if (m50235w()) {
            this.f50494e.mo20641l();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo43862g(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, o.mo43928m());
    }

    /* renamed from: c */
    public final void mo43857c(C11251O o) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(o.mo43931p());
        if (m50235w()) {
            this.f50494e.mo20640k();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo43862g(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, o.mo43928m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo43858d() {
        IronLog.INTERNAL.verbose("");
        AsyncTask.execute(new C11246c());
    }

    /* renamed from: d */
    public final void mo43859d(C11251O o) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(o.mo43931p());
        if (m50235w()) {
            this.f50494e.mo20642m();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo43862g(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, o.mo43928m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo43860e(int i) {
        m50222f(i, (Object[][]) null);
    }

    /* renamed from: e */
    public final void mo43861e(C11251O o) {
        C11291c cVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(o.mo43931p());
        if (m50218A()) {
            if (this.f50491b.mo44527c() && this.f50491b.mo44532h().f51550s && (cVar = this.f50508s.get(o.mo43926k())) != null) {
                m50225k(o, cVar);
            }
            m50222f(IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f50492c);
        String k = o.mo43926k();
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        m50222f(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f50492c}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo43862g(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize x = m50236x();
            if (x != null) {
                m50227m(mediationAdditionalData, x);
            }
            if (this.f50495f != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, mo43865r());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (!TextUtils.isEmpty(this.f50501l)) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f50501l);
            }
            JSONObject jSONObject = this.f50502m;
            if (jSONObject != null && jSONObject.length() > 0) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f50502m);
            }
            if (m50229p(i)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.f50504o);
                if (!TextUtils.isEmpty(this.f50503n)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.f50503n);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
        C11292d.m50446e().mo43979b(new C11308a(i, mediationAdditionalData));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo43863h(C11249e eVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("from '" + this.f50492c + "' to '" + eVar + "'");
        synchronized (this.f50511v) {
            this.f50492c = eVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo43864n(C11249e eVar, C11249e eVar2) {
        boolean z;
        synchronized (this.f50511v) {
            if (this.f50492c == eVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("set state from '" + this.f50492c + "' to '" + eVar2 + "'");
                z = true;
                this.f50492c = eVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public String mo43865r() {
        C11421g gVar = this.f50495f;
        return gVar != null ? gVar.getPlacementName() : "";
    }
}
