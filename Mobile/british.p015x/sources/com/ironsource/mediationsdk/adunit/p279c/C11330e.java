package com.ironsource.mediationsdk.adunit.p279c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.environment.C4984k;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11220A;
import com.ironsource.mediationsdk.C11270X;
import com.ironsource.mediationsdk.C11304ab;
import com.ironsource.mediationsdk.C11359c;
import com.ironsource.mediationsdk.C11369d;
import com.ironsource.mediationsdk.C11386g;
import com.ironsource.mediationsdk.C11389h;
import com.ironsource.mediationsdk.C11392i;
import com.ironsource.mediationsdk.C11434o;
import com.ironsource.mediationsdk.C11504w;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p278b.C11310b;
import com.ironsource.mediationsdk.adunit.p278b.C11311c;
import com.ironsource.mediationsdk.adunit.p278b.C11312d;
import com.ironsource.mediationsdk.adunit.p278b.C11319i;
import com.ironsource.mediationsdk.adunit.p279c.p280a.C11322b;
import com.ironsource.mediationsdk.adunit.p279c.p281b.C11325a;
import com.ironsource.mediationsdk.adunit.p282d.p283a.C11340c;
import com.ironsource.mediationsdk.adunit.p284e.C11344a;
import com.ironsource.mediationsdk.adunit.p284e.C11346b;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p276a.C11291c;
import com.ironsource.mediationsdk.p286c.C11361b;
import com.ironsource.mediationsdk.utils.C11483b;
import com.ironsource.mediationsdk.utils.C11490f;
import com.ironsource.mediationsdk.utils.C11496l;
import com.ironsource.mediationsdk.utils.C11497m;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.c.e */
public abstract class C11330e<Smash extends C11340c<?>, Adapter extends BaseAdAdapter<?, ? extends AdapterAdListener>> implements C4984k, C11304ab, C11311c, C11322b, C11346b, C11359c, C11386g {

    /* renamed from: a */
    protected C11344a<Smash> f50853a;

    /* renamed from: b */
    protected ConcurrentHashMap<String, C11291c> f50854b;

    /* renamed from: c */
    protected ConcurrentHashMap<String, C11392i.C11393a> f50855c;

    /* renamed from: d */
    protected C11389h f50856d;

    /* renamed from: e */
    protected C11392i f50857e;

    /* renamed from: f */
    protected int f50858f;

    /* renamed from: g */
    protected String f50859g = "";

    /* renamed from: h */
    protected JSONObject f50860h;

    /* renamed from: i */
    protected C11291c f50861i;

    /* renamed from: j */
    protected Placement f50862j;

    /* renamed from: k */
    protected boolean f50863k = false;

    /* renamed from: l */
    protected C11497m f50864l;

    /* renamed from: m */
    private C11490f f50865m;

    /* renamed from: n */
    private C11490f f50866n;

    /* renamed from: o */
    protected C11320a f50867o;

    /* renamed from: p */
    protected C11331a f50868p;

    /* renamed from: q */
    protected C11327c f50869q;

    /* renamed from: r */
    protected C11504w f50870r;

    /* renamed from: s */
    protected C11312d f50871s;

    /* renamed from: t */
    public Set<ImpressionDataListener> f50872t = new HashSet();

    /* renamed from: u */
    protected C11324b f50873u;

    /* renamed from: v */
    protected final Object f50874v = new Object();

    /* renamed from: w */
    private long f50875w = 0;

    /* renamed from: x */
    private Boolean f50876x;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.e$a */
    public enum C11331a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    /* renamed from: com.ironsource.mediationsdk.adunit.c.e$b */
    class C11332b extends TimerTask {
        C11332b() {
        }

        public final void run() {
            C11330e.this.m50620D();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.adunit.c.e$c */
    class C11333c implements Runnable {
        C11333c() {
        }

        public final void run() {
            int i;
            C11319i iVar;
            String str;
            C11330e.this.f50860h = new JSONObject();
            C11330e.this.f50871s.f50814c.mo44082a();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (NetworkSettings next : C11330e.this.f50867o.f50833c) {
                if (!C11330e.this.f50864l.mo44565b(new C11496l(next.getProviderInstanceName(), next.getMaxAdsPerSession(C11330e.this.f50867o.f50831a))) && C11330e.this.m50630o(next)) {
                    if (next.isBidder(C11330e.this.f50867o.f50831a)) {
                        AdapterBaseInterface a = C11369d.m50788a().mo44229a(next, C11330e.this.f50867o.f50831a);
                        if (a instanceof AdapterBidderInterface) {
                            try {
                                Map<String, Object> biddingData = ((AdapterBidderInterface) a).getBiddingData(ContextProvider.getInstance().getApplicationContext());
                                if (biddingData != null) {
                                    hashMap.put(next.getProviderInstanceName(), biddingData);
                                    sb.append(next.getInstanceType(C11330e.this.f50867o.f50831a) + next.getProviderInstanceName() + ",");
                                } else {
                                    C11330e.this.f50871s.f50816e.mo44103d("missing bidding data for " + next.getProviderInstanceName());
                                }
                            } catch (Exception e) {
                                iVar = C11330e.this.f50871s.f50816e;
                                str = "exception while calling networkAdapter.getBiddingData - " + e;
                            }
                        } else {
                            str = a == null ? "could not load network adapter" : "network adapter does not implementing AdapterBidderInterface";
                            iVar = C11330e.this.f50871s.f50816e;
                            iVar.mo44100a(str);
                        }
                    } else {
                        arrayList.add(next.getProviderInstanceName());
                        sb.append(next.getInstanceType(C11330e.this.f50867o.f50831a) + next.getProviderInstanceName() + ",");
                    }
                }
            }
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(C11330e.this.mo44143d("auction waterfallString = " + sb));
            if (hashMap.size() == 0 && arrayList.size() == 0) {
                ironLog.verbose(C11330e.this.mo44143d("auction failed - no candidates"));
                C11330e.this.f50871s.f50814c.mo44084a(0, 1005, "No candidates available for auctioning");
                C11330e eVar = C11330e.this;
                IronSource.AD_UNIT ad_unit = eVar.f50867o.f50831a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = 1035;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1024;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit);
                    i = IronSourceError.ERROR_CODE_GENERIC;
                }
                eVar.m50624f(i, "Empty waterfall");
                return;
            }
            C11330e.this.f50871s.f50814c.mo44085a(sb.toString());
            C11330e eVar2 = C11330e.this;
            if (eVar2.f50856d != null) {
                C11330e.this.f50856d.mo44287a(ContextProvider.getInstance().getApplicationContext(), (Map<String, Object>) hashMap, (List<String>) arrayList, C11330e.this.f50857e, C11499n.m51312a().mo44569b(C11330e.this.f50867o.f50831a));
            } else {
                ironLog.error(eVar2.mo44143d("mAuctionHandler is null"));
            }
        }
    }

    public C11330e(C11320a aVar, Set<ImpressionDataListener> set) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + aVar.f50831a + ", loading mode = " + aVar.f50838h.f50841a);
        C11490f fVar = new C11490f();
        this.f50867o = aVar;
        this.f50871s = new C11312d(aVar.f50831a, C11312d.C11314b.MEDIATION, this);
        this.f50873u = new C11324b(this.f50867o.f50831a);
        this.f50869q = new C11327c(this.f50867o.f50838h, this);
        mo44146h(C11331a.NONE);
        this.f50872t = set;
        C11483b bVar = this.f50867o.f50834d;
        this.f50853a = new C11344a<>(bVar.f51546o, bVar.f51538g, this);
        this.f50871s.f50812a.mo44090a();
        this.f50854b = new ConcurrentHashMap<>();
        this.f50855c = new ConcurrentHashMap<>();
        this.f50862j = null;
        C11434o a = C11434o.m51097a();
        C11320a aVar2 = this.f50867o;
        a.mo44451a(aVar2.f50831a, aVar2.f50836f);
        this.f50860h = new JSONObject();
        if (this.f50867o.mo44115a()) {
            this.f50856d = new C11389h(this.f50867o.f50831a.toString(), this.f50867o.f50834d, this);
        }
        C11320a aVar3 = this.f50867o;
        m50627k(aVar3.f50833c, aVar3.f50834d.f51537f);
        m50636w();
        m50637x();
        this.f50865m = new C11490f();
        mo44146h(C11331a.READY_TO_LOAD);
        this.f50871s.f50812a.mo44091a(C11490f.m51271a(fVar));
        this.f50870r = new C11504w(aVar.f50839i, this);
        if (this.f50867o.f50838h.mo44131b()) {
            ironLog.verbose("first automatic load");
            mo44144e();
        }
    }

    /* renamed from: A */
    private void m50617A() {
        Iterator it = m50618B().iterator();
        while (it.hasNext()) {
            m50632q((C11340c) it.next());
        }
    }

    /* renamed from: B */
    private ArrayList<Smash> m50618B() {
        StringBuilder sb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d("mWaterfall.size() = " + this.f50853a.mo44172a().size()));
        ArrayList<Smash> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.f50853a.mo44172a().size() || i2 >= this.f50867o.f50835e) {
                break;
            }
            C11340c cVar = (C11340c) this.f50853a.mo44172a().get(i);
            if (cVar.mo44161e()) {
                if (cVar.mo44159c() || cVar.mo44160d()) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("smash = " + cVar.mo44166l());
                } else if (!cVar.mo44164h()) {
                    arrayList.add(cVar);
                } else if (i2 == 0) {
                    sb.append(cVar.mo43926k());
                    sb.append(". No other instances will be loaded at the same time.");
                    String sb2 = sb.toString();
                    IronLog.INTERNAL.verbose(mo44143d(sb2));
                    IronSourceUtils.sendAutomationLog(sb2);
                    arrayList.add(cVar);
                    i2++;
                } else {
                    sb = new StringBuilder("Advanced Loading: Won't start loading bidder ");
                    sb.append(cVar.mo43926k());
                    sb.append(" as a non bidder is being loaded");
                    String sb3 = sb.toString();
                    IronLog.INTERNAL.verbose(mo44143d(sb3));
                    IronSourceUtils.sendAutomationLog(sb3);
                }
                i2++;
            }
            i++;
        }
        if (i2 == 0) {
            m50624f(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r2 <= 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        new java.util.Timer().schedule(new com.ironsource.mediationsdk.adunit.p279c.C11330e.C11332b(r5), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        m50620D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = r5.f50867o.f50834d.f51540i - com.ironsource.mediationsdk.utils.C11490f.m51271a(r5.f50865m);
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50619C() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r5.mo44143d(r1)
            r0.verbose(r1)
            java.lang.Object r0 = r5.f50874v
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f50868p     // Catch:{ all -> 0x003f }
            com.ironsource.mediationsdk.adunit.c.e$a r2 = com.ironsource.mediationsdk.adunit.p279c.C11330e.C11331a.AUCTION     // Catch:{ all -> 0x003f }
            if (r1 != r2) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r5.mo44146h(r2)     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            com.ironsource.mediationsdk.utils.f r0 = r5.f50865m
            long r0 = com.ironsource.mediationsdk.utils.C11490f.m51271a(r0)
            com.ironsource.mediationsdk.adunit.c.a r2 = r5.f50867o
            com.ironsource.mediationsdk.utils.b r2 = r2.f50834d
            long r2 = r2.f51540i
            long r2 = r2 - r0
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x003b
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.ironsource.mediationsdk.adunit.c.e$b r1 = new com.ironsource.mediationsdk.adunit.c.e$b
            r1.<init>()
            r0.schedule(r1, r2)
            return
        L_0x003b:
            r5.m50620D()
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p279c.C11330e.m50619C():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m50620D() {
        IronLog.INTERNAL.verbose(mo44143d(""));
        AsyncTask.execute(new C11333c());
    }

    /* renamed from: E */
    private static String m50621E() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* renamed from: c */
    private static String m50622c(C11291c cVar, int i) {
        return String.format("%s%s", new Object[]{Integer.valueOf(i), cVar.mo44004a()});
    }

    /* renamed from: e */
    private String m50623e(List<C11291c> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d("waterfall.size() = " + list.size()));
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            C11291c cVar = list.get(i);
            C11340c p = m50631p(cVar, str);
            if (p != null) {
                copyOnWriteArrayList.add(p);
                sb.append(m50622c(cVar, p.mo44165i()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f50853a.mo44173a(this.f50867o.f50838h.f50841a, copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(mo44143d("updateWaterfall() - next waterfall is " + sb.toString()));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m50624f(int i, String str) {
        mo44146h(C11331a.READY_TO_LOAD);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d("errorCode = " + i + ", errorReason = " + str));
        if (this.f50867o.f50838h.mo44130a()) {
            this.f50871s.f50813b.mo44093a(C11490f.m51271a(this.f50866n), i, str);
            C11434o.m51097a().mo44452a(this.f50867o.f50831a, new IronSourceError(i, str));
        } else {
            this.f50871s.f50816e.mo44098a(i, str);
            mo44147l(false, false);
        }
        this.f50869q.mo44132a();
    }

    /* renamed from: k */
    private void m50627k(List<NetworkSettings> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f50857e = new C11392i(arrayList, i);
    }

    /* renamed from: m */
    private boolean m50628m(C11331a aVar, C11331a aVar2) {
        boolean z;
        synchronized (this.f50874v) {
            if (this.f50868p == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(mo44143d("set state from '" + this.f50868p + "' to '" + aVar2 + "'"));
                z = true;
                this.f50868p = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m50630o(NetworkSettings networkSettings) {
        AdapterBaseInterface a = C11369d.m50788a().mo44229a(networkSettings, this.f50867o.f50831a);
        return (a instanceof AdapterSettingsInterface) && this.f50853a.mo44175a(this.f50867o.f50838h.f50841a, networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) a).getLoadWhileShowSupportedState(networkSettings));
    }

    /* renamed from: p */
    private Smash m50631p(C11291c cVar, String str) {
        NetworkSettings a = this.f50867o.mo44114a(cVar.mo44004a());
        if (a != null) {
            BaseAdAdapter a2 = mo44138a(a, this.f50867o.f50831a);
            if (a2 != null) {
                Smash b = mo44140b(a, a2, C11499n.m51312a().mo44569b(this.f50867o.f50831a), str);
                this.f50854b.put(b.mo43926k(), cVar);
                this.f50855c.put(cVar.mo44004a(), C11392i.C11393a.ISAuctionPerformanceDidntAttemptToLoad);
                return b;
            }
            String str2 = "addSmashToWaterfall - could not load ad adapter for " + a.getProviderInstanceName();
            IronLog.INTERNAL.error(mo44143d(str2));
            this.f50871s.f50816e.mo44101b(str2);
        } else {
            String str3 = "could not find matching provider settings for auction response item - item = " + cVar.mo44004a();
            IronLog.INTERNAL.error(mo44143d(str3));
            this.f50871s.f50816e.mo44102c(str3);
        }
        return null;
    }

    /* renamed from: q */
    private void m50632q(Smash smash) {
        IronLog.INTERNAL.verbose(mo44143d(""));
        String b = this.f50854b.get(smash.mo43926k()).mo44005b();
        smash.mo44157b(b);
        smash.mo44155a(b);
    }

    /* renamed from: r */
    private boolean m50633r(boolean z) {
        boolean z2;
        synchronized (this.f50874v) {
            Boolean bool = this.f50876x;
            if (bool != null) {
                if (bool.booleanValue() == z) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    /* renamed from: u */
    private boolean m50634u() {
        boolean z;
        synchronized (this.f50874v) {
            z = this.f50868p == C11331a.LOADING;
        }
        return z;
    }

    /* renamed from: v */
    private boolean m50635v() {
        boolean z;
        synchronized (this.f50874v) {
            z = this.f50868p == C11331a.AUCTION;
        }
        return z;
    }

    /* renamed from: w */
    private void m50636w() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : this.f50867o.f50833c) {
            arrayList.add(new C11496l(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f50867o.f50831a)));
        }
        this.f50864l = new C11497m(arrayList);
    }

    /* renamed from: x */
    private void m50637x() {
        JSONObject jSONObject;
        IronLog.INTERNAL.verbose(mo44143d(""));
        for (NetworkSettings next : this.f50867o.f50833c) {
            if (next.isIronSource() || next.isBidder(this.f50867o.f50831a)) {
                HashMap hashMap = new HashMap();
                hashMap.put(DataKeys.USER_ID, this.f50867o.f50832b);
                IronSource.AD_UNIT ad_unit = this.f50867o.f50831a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    jSONObject = next.getInterstitialSettings();
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    jSONObject = next.getRewardedVideoSettings();
                } else {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("ad unit not supported - " + this.f50867o.f50831a);
                    jSONObject = new JSONObject();
                }
                hashMap.putAll(C11361b.m50767a(jSONObject));
                AdData adData = new AdData((String) null, hashMap);
                AdapterBaseInterface a = C11369d.m50788a().mo44229a(next, this.f50867o.f50831a);
                if (a != null) {
                    try {
                        a.init(adData, ContextProvider.getInstance().getApplicationContext(), (NetworkInitializationListener) null);
                    } catch (Exception e) {
                        C11319i iVar = this.f50871s.f50816e;
                        iVar.mo44100a("initNetworks - exception while calling networkAdapter.init - " + e);
                    }
                } else {
                    this.f50871s.f50816e.mo44100a("initNetworks - could not load network adapter");
                }
            }
        }
    }

    /* renamed from: y */
    private void m50638y() {
        IronLog.INTERNAL.verbose(mo44143d(""));
        m50623e(m50639z(), m50621E());
    }

    /* renamed from: z */
    private List<C11291c> m50639z() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings next : this.f50867o.f50833c) {
            C11496l lVar = new C11496l(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f50867o.f50831a));
            if (!next.isBidder(this.f50867o.f50831a) && !this.f50864l.mo44565b(lVar) && m50630o(next)) {
                copyOnWriteArrayList.add(new C11291c(lVar.mo43926k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Adapter mo44138a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit);

    /* renamed from: a */
    public final Map<String, Object> mo44077a(C11310b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f50853a.f50919b)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f50853a.f50919b);
        }
        JSONObject jSONObject = this.f50860h;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f50860h);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C11499n.m51312a().mo44569b(this.f50867o.f50831a)));
        if (!(bVar == C11310b.LOAD_AD_SUCCESS || bVar == C11310b.LOAD_AD_FAILED || bVar == C11310b.AUCTION_SUCCESS || bVar == C11310b.AUCTION_FAILED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f50858f));
            if (!TextUtils.isEmpty(this.f50859g)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f50859g);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo44139a(int i) {
        C11319i iVar = this.f50871s.f50816e;
        iVar.mo44113n("waterfalls hold too many with size = " + i);
    }

    /* renamed from: a */
    public final void mo43850a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        String str3 = "";
        ironLog.verbose(mo44143d(str3));
        if (m50635v()) {
            String str4 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
            ironLog.verbose(mo44143d(str4));
            StringBuilder sb = new StringBuilder();
            IronSource.AD_UNIT ad_unit = this.f50867o.f50831a;
            if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                str3 = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                str3 = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                str3 = "BN";
            }
            sb.append(str3);
            sb.append(": ");
            sb.append(str4);
            IronSourceUtils.sendAutomationLog(sb.toString());
            this.f50858f = i2;
            this.f50859g = str2;
            this.f50860h = new JSONObject();
            m50638y();
            this.f50871s.f50814c.mo44084a(j, i, str);
            mo44146h(C11331a.LOADING);
            m50617A();
            return;
        }
        this.f50871s.f50816e.mo44107h("unexpected auction fail - error = " + i + ", " + str);
    }

    /* renamed from: a */
    public final void mo44117a(C11340c<?> cVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d(cVar.mo44166l()));
        if (cVar.mo44168n() != this.f50853a.f50919b) {
            String str = "onLoadSuccess was invoked with state = " + this.f50868p + " auctionId: " + cVar.mo44168n() + " and the current id is " + this.f50853a.f50919b;
            ironLog.verbose(str);
            this.f50871s.f50816e.mo44108i(str);
            return;
        }
        this.f50855c.put(cVar.mo43926k(), C11392i.C11393a.ISAuctionPerformanceLoadedSuccessfully);
        if (m50628m(C11331a.LOADING, C11331a.READY_TO_SHOW)) {
            boolean z = false;
            if (this.f50867o.f50838h.mo44130a()) {
                C11324b bVar = this.f50873u;
                IronSource.AD_UNIT ad_unit = bVar.f50840a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    C11220A.m50068a().mo43689b();
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    C11270X.m50368a().mo43945b();
                } else {
                    ironLog.warning("ad unit not supported - " + bVar.f50840a);
                }
            } else {
                mo44147l(true, false);
            }
            long a = C11490f.m51271a(this.f50866n);
            C11320a aVar = this.f50867o;
            if (aVar.f50831a == IronSource.AD_UNIT.REWARDED_VIDEO && aVar.f50838h.f50841a == C11325a.C11326a.MANUAL) {
                z = true;
            }
            this.f50871s.f50813b.mo44094a(a, z);
            if (this.f50867o.f50838h.mo44131b()) {
                this.f50870r.mo44584a(0);
            }
            if (this.f50867o.mo44115a()) {
                C11291c cVar2 = this.f50854b.get(cVar.mo43926k());
                if (cVar2 != null) {
                    C11389h.m50958a(cVar2, cVar.mo44165i(), this.f50861i);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Smash> it = this.f50853a.mo44172a().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C11340c) it.next()).mo43926k());
                    }
                    C11389h.m50960a((ArrayList<String>) arrayList, this.f50854b, cVar.mo44165i(), this.f50861i, cVar2);
                    return;
                }
                String k = cVar.mo43926k();
                String str2 = "winner instance missing from waterfall - " + k;
                ironLog.verbose(mo44143d(str2));
                this.f50871s.f50816e.mo44099a(1010, str2, k);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r6 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r6.hasNext() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        m50632q((com.ironsource.mediationsdk.adunit.p282d.p283a.C11340c) r6.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44119a(com.ironsource.mediationsdk.logger.IronSourceError r6, com.ironsource.mediationsdk.adunit.p282d.p283a.C11340c<?> r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.f50874v
            monitor-enter(r1)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00cc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            r3.<init>()     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = r7.mo44166l()     // Catch:{ all -> 0x00cc }
            r3.append(r4)     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = " - error = "
            r3.append(r4)     // Catch:{ all -> 0x00cc }
            r3.append(r6)     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = r5.mo44143d(r3)     // Catch:{ all -> 0x00cc }
            r2.verbose(r3)     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = r7.mo44168n()     // Catch:{ all -> 0x00cc }
            com.ironsource.mediationsdk.adunit.e.a<Smash> r4 = r5.f50853a     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = r4.f50919b     // Catch:{ all -> 0x00cc }
            if (r3 != r4) goto L_0x0098
            com.ironsource.mediationsdk.adunit.c.e$a r3 = r5.f50868p     // Catch:{ all -> 0x00cc }
            com.ironsource.mediationsdk.adunit.c.e$a r4 = com.ironsource.mediationsdk.adunit.p279c.C11330e.C11331a.AUCTION     // Catch:{ all -> 0x00cc }
            if (r3 != r4) goto L_0x003a
            goto L_0x0098
        L_0x003a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r5.f50855c     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = r7.mo43926k()     // Catch:{ all -> 0x00cc }
            com.ironsource.mediationsdk.i$a r4 = com.ironsource.mediationsdk.C11392i.C11393a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x00cc }
            r2.put(r3, r4)     // Catch:{ all -> 0x00cc }
            boolean r2 = r5.m50634u()     // Catch:{ all -> 0x00cc }
            if (r2 != 0) goto L_0x007e
            boolean r2 = r5.mo44148s()     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x0052
            goto L_0x007e
        L_0x0052:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.f50871s     // Catch:{ all -> 0x00cc }
            com.ironsource.mediationsdk.adunit.b.i r2 = r2.f50816e     // Catch:{ all -> 0x00cc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = "unexpected load failed for state - "
            r3.<init>(r4)     // Catch:{ all -> 0x00cc }
            com.ironsource.mediationsdk.adunit.c.e$a r4 = r5.f50868p     // Catch:{ all -> 0x00cc }
            r3.append(r4)     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = " smash - "
            r3.append(r4)     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = r7.mo44166l()     // Catch:{ all -> 0x00cc }
            r3.append(r7)     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = ", error - "
            r3.append(r7)     // Catch:{ all -> 0x00cc }
            r3.append(r6)     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00cc }
            r2.mo44109j(r6)     // Catch:{ all -> 0x00cc }
            goto L_0x0082
        L_0x007e:
            java.util.ArrayList r0 = r5.m50618B()     // Catch:{ all -> 0x00cc }
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x00cc }
            java.util.Iterator r6 = r0.iterator()
        L_0x0087:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r6.next()
            com.ironsource.mediationsdk.adunit.d.a.c r7 = (com.ironsource.mediationsdk.adunit.p282d.p283a.C11340c) r7
            r5.m50632q(r7)
            goto L_0x0087
        L_0x0097:
            return
        L_0x0098:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "onAdLoadFailed was invoked with state ="
            r6.<init>(r0)     // Catch:{ all -> 0x00cc }
            com.ironsource.mediationsdk.adunit.c.e$a r0 = r5.f50868p     // Catch:{ all -> 0x00cc }
            r6.append(r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = " auctionId: "
            r6.append(r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = r7.mo44168n()     // Catch:{ all -> 0x00cc }
            r6.append(r7)     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = " and the current id is "
            r6.append(r7)     // Catch:{ all -> 0x00cc }
            com.ironsource.mediationsdk.adunit.e.a<Smash> r7 = r5.f50853a     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = r7.f50919b     // Catch:{ all -> 0x00cc }
            r6.append(r7)     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00cc }
            r2.verbose(r6)     // Catch:{ all -> 0x00cc }
            com.ironsource.mediationsdk.adunit.b.d r7 = r5.f50871s     // Catch:{ all -> 0x00cc }
            com.ironsource.mediationsdk.adunit.b.i r7 = r7.f50816e     // Catch:{ all -> 0x00cc }
            r7.mo44109j(r6)     // Catch:{ all -> 0x00cc }
            monitor-exit(r1)     // Catch:{ all -> 0x00cc }
            return
        L_0x00cc:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cc }
            goto L_0x00d0
        L_0x00cf:
            throw r6
        L_0x00d0:
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p279c.C11330e.mo44119a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.adunit.d.a.c):void");
    }

    /* renamed from: a */
    public final void mo43855a(List<C11291c> list, String str, C11291c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.verbose(mo44143d(""));
        if (m50635v()) {
            this.f50859g = "";
            this.f50858f = i;
            this.f50861i = cVar;
            this.f50860h = jSONObject;
            String e = m50623e(list, str);
            this.f50871s.f50814c.mo44083a(j);
            this.f50871s.f50814c.mo44086b(e);
            mo44146h(C11331a.LOADING);
            m50617A();
            return;
        }
        C11319i iVar = this.f50871s.f50816e;
        iVar.mo44106g("unexpected auction success for auctionId - " + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (mo44137b() != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r3.f50876x.booleanValue() != false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20593a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.f50863k
            if (r0 == 0) goto L_0x0048
            com.ironsource.mediationsdk.adunit.c.a r0 = r3.f50867o
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.f50838h
            boolean r0 = r0.mo44130a()
            if (r0 == 0) goto L_0x000f
            goto L_0x0048
        L_0x000f:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "network availability changed to - "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            java.lang.Boolean r0 = r3.f50876x
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x0043
        L_0x0029:
            r2 = 1
            if (r4 == 0) goto L_0x0039
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0039
            boolean r0 = r3.mo44137b()
            if (r0 == 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            if (r4 != 0) goto L_0x0027
            java.lang.Boolean r0 = r3.f50876x
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0027
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r3.mo44147l(r4, r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p279c.C11330e.mo20593a(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Smash mo44140b(NetworkSettings networkSettings, Adapter adapter, int i, String str);

    /* renamed from: b */
    public final void mo44121b(C11340c<?> cVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d(cVar.mo44166l()));
        C11324b bVar = this.f50873u;
        Placement placement = this.f50862j;
        IronSource.AD_UNIT ad_unit = bVar.f50840a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C11220A.m50068a().mo43694f();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C11270X.m50368a().mo43947b(placement);
        } else {
            ironLog.warning("ad unit not supported - " + bVar.f50840a);
        }
    }

    /* renamed from: b */
    public final void mo44141b(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d("track = " + z));
        this.f50863k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo44137b();

    /* renamed from: c_ */
    public final void mo44142c_() {
        if (this.f50867o.f50838h.mo44131b()) {
            mo44146h(C11331a.READY_TO_LOAD);
            mo44147l(false, true);
            mo44144e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo44143d(String str) {
        String name = this.f50867o.f50831a.name();
        if (TextUtils.isEmpty(str)) {
            return name;
        }
        return name + " - " + str;
    }

    /* renamed from: d */
    public final void mo44036d() {
        IronLog.INTERNAL.verbose(mo44143d(""));
        mo44144e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
        if (r6.f50867o.mo44115a() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ec, code lost:
        m50638y();
        m50617A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44144e() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r6.mo44143d(r1)
            r0.verbose(r1)
            java.lang.Object r1 = r6.f50874v
            monitor-enter(r1)
            com.ironsource.mediationsdk.adunit.c.a r2 = r6.f50867o     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.b.a r2 = r2.f50838h     // Catch:{ all -> 0x00f3 }
            boolean r2 = r2.mo44131b()     // Catch:{ all -> 0x00f3 }
            if (r2 == 0) goto L_0x0031
            com.ironsource.mediationsdk.utils.m r2 = r6.f50864l     // Catch:{ all -> 0x00f3 }
            boolean r2 = r2.mo44564a()     // Catch:{ all -> 0x00f3 }
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = "all smashes are capped"
            java.lang.String r3 = r6.mo44143d(r2)     // Catch:{ all -> 0x00f3 }
            r0.verbose(r3)     // Catch:{ all -> 0x00f3 }
            r0 = 80001(0x13881, float:1.12105E-40)
            r6.m50624f(r0, r2)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            return
        L_0x0031:
            com.ironsource.mediationsdk.adunit.c.a r0 = r6.f50867o     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.f50838h     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = r0.f50841a     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r2 = com.ironsource.mediationsdk.adunit.p279c.p281b.C11325a.C11326a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x00f3 }
            r3 = 0
            if (r0 == r2) goto L_0x0071
            com.ironsource.mediationsdk.adunit.c.e$a r4 = r6.f50868p     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.e$a r5 = com.ironsource.mediationsdk.adunit.p279c.C11330e.C11331a.SHOWING     // Catch:{ all -> 0x00f3 }
            if (r4 != r5) goto L_0x0071
            java.lang.String r0 = "load cannot be invoked while showing an ad"
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = r6.mo44143d(r0)     // Catch:{ all -> 0x00f3 }
            r2.error(r4)     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.a r4 = r6.f50867o     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = r4.f50831a     // Catch:{ all -> 0x00f3 }
            int r4 = com.ironsource.mediationsdk.adunit.p277a.C11308a.m50514b(r4)     // Catch:{ all -> 0x00f3 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.a r0 = r6.f50867o     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.f50838h     // Catch:{ all -> 0x00f3 }
            boolean r0 = r0.mo44130a()     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x006a
            com.ironsource.mediationsdk.adunit.c.b r0 = r6.f50873u     // Catch:{ all -> 0x00f3 }
            r0.mo44127a(r2)     // Catch:{ all -> 0x00f3 }
            goto L_0x006f
        L_0x006a:
            com.ironsource.mediationsdk.adunit.c.b r0 = r6.f50873u     // Catch:{ all -> 0x00f3 }
            r0.mo44128b(r3)     // Catch:{ all -> 0x00f3 }
        L_0x006f:
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            return
        L_0x0071:
            if (r0 == r2) goto L_0x0098
            com.ironsource.mediationsdk.adunit.c.e$a r0 = r6.f50868p     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.e$a r2 = com.ironsource.mediationsdk.adunit.p279c.C11330e.C11331a.READY_TO_LOAD     // Catch:{ all -> 0x00f3 }
            if (r0 == r2) goto L_0x007d
            com.ironsource.mediationsdk.adunit.c.e$a r2 = com.ironsource.mediationsdk.adunit.p279c.C11330e.C11331a.READY_TO_SHOW     // Catch:{ all -> 0x00f3 }
            if (r0 != r2) goto L_0x008b
        L_0x007d:
            com.ironsource.mediationsdk.o r0 = com.ironsource.mediationsdk.C11434o.m51097a()     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.a r2 = r6.f50867o     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r2.f50831a     // Catch:{ all -> 0x00f3 }
            boolean r0 = r0.mo44453a(r2)     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x0098
        L_0x008b:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x00f3 }
            java.lang.String r2 = "load is already in progress"
            java.lang.String r2 = r6.mo44143d(r2)     // Catch:{ all -> 0x00f3 }
            r0.error(r2)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            return
        L_0x0098:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00f3 }
            r0.<init>()     // Catch:{ all -> 0x00f3 }
            r6.f50860h = r0     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.a r0 = r6.f50867o     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r0.f50831a     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f3 }
            if (r2 != r4) goto L_0x00b0
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.f50838h     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = r0.f50841a     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r2 = com.ironsource.mediationsdk.adunit.p279c.p281b.C11325a.C11326a.MANUAL     // Catch:{ all -> 0x00f3 }
            if (r0 != r2) goto L_0x00b0
            r3 = 1
        L_0x00b0:
            com.ironsource.mediationsdk.adunit.b.d r0 = r6.f50871s     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.b.h r0 = r0.f50813b     // Catch:{ all -> 0x00f3 }
            r0.mo44095a(r3)     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.utils.f r0 = new com.ironsource.mediationsdk.utils.f     // Catch:{ all -> 0x00f3 }
            r0.<init>()     // Catch:{ all -> 0x00f3 }
            r6.f50866n = r0     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.a r0 = r6.f50867o     // Catch:{ all -> 0x00f3 }
            boolean r0 = r0.mo44115a()     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00de
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r0 = r6.f50855c     // Catch:{ all -> 0x00f3 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00f3 }
            if (r0 != 0) goto L_0x00da
            com.ironsource.mediationsdk.i r0 = r6.f50857e     // Catch:{ all -> 0x00f3 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r6.f50855c     // Catch:{ all -> 0x00f3 }
            r0.mo44295a((java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.C11392i.C11393a>) r2)     // Catch:{ all -> 0x00f3 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r0 = r6.f50855c     // Catch:{ all -> 0x00f3 }
            r0.clear()     // Catch:{ all -> 0x00f3 }
        L_0x00da:
            r6.m50619C()     // Catch:{ all -> 0x00f3 }
            goto L_0x00e3
        L_0x00de:
            com.ironsource.mediationsdk.adunit.c.e$a r0 = com.ironsource.mediationsdk.adunit.p279c.C11330e.C11331a.LOADING     // Catch:{ all -> 0x00f3 }
            r6.mo44146h(r0)     // Catch:{ all -> 0x00f3 }
        L_0x00e3:
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            com.ironsource.mediationsdk.adunit.c.a r0 = r6.f50867o
            boolean r0 = r0.mo44115a()
            if (r0 != 0) goto L_0x00f2
            r6.m50638y()
            r6.m50617A()
        L_0x00f2:
            return
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p279c.C11330e.mo44144e():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo44145g(C11291c cVar, String str) {
        if (cVar != null) {
            ImpressionData a = cVar.mo44003a(str);
            if (a != null) {
                for (ImpressionDataListener next : this.f50872t) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info(mo44143d("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a));
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(mo44143d("no auctionResponseItem or listener"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo44146h(C11331a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d("from " + this.f50868p + " to " + aVar));
        synchronized (this.f50874v) {
            this.f50868p = aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo44147l(boolean z, boolean z2) {
        if (m50633r(z)) {
            this.f50876x = Boolean.valueOf(z);
            long j = 0;
            if (this.f50875w != 0) {
                j = new Date().getTime() - this.f50875w;
            }
            this.f50875w = new Date().getTime();
            this.f50871s.f50813b.mo44096a(z, j, z2);
            this.f50873u.mo44128b(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo44148s() {
        boolean z;
        synchronized (this.f50874v) {
            z = this.f50868p == C11331a.READY_TO_SHOW;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final String mo44149t() {
        Placement placement = this.f50862j;
        return placement == null ? "" : placement.getPlacementName();
    }
}
