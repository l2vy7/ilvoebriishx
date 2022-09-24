package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.C4984k;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C11347b;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.logger.C11411c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p276a.C11296h;
import com.ironsource.mediationsdk.sdk.C11450j;
import com.ironsource.mediationsdk.sdk.C11475m;
import com.ironsource.mediationsdk.utils.C11484c;
import com.ironsource.mediationsdk.utils.C11487d;
import com.ironsource.mediationsdk.utils.C11488e;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.g0 */
final class C11387g0 extends C11391h0 implements C4984k, C11359c, C11475m, C11487d {

    /* renamed from: A */
    private List<C11347b.C11348a> f51156A = Arrays.asList(new C11347b.C11348a[]{C11347b.C11348a.INIT_FAILED, C11347b.C11348a.CAPPED_PER_SESSION, C11347b.C11348a.EXHAUSTED, C11347b.C11348a.CAPPED_PER_DAY});

    /* renamed from: B */
    private boolean f51157B = false;

    /* renamed from: C */
    private long f51158C = new Date().getTime();

    /* renamed from: D */
    private boolean f51159D = false;

    /* renamed from: E */
    C11504w f51160E;

    /* renamed from: s */
    private final String f51161s = C11387g0.class.getSimpleName();

    /* renamed from: t */
    C11450j f51162t;

    /* renamed from: u */
    private boolean f51163u = false;

    /* renamed from: v */
    boolean f51164v = false;

    /* renamed from: w */
    private NetworkStateReceiver f51165w;

    /* renamed from: x */
    private Placement f51166x;

    /* renamed from: y */
    private Timer f51167y = null;

    /* renamed from: z */
    int f51168z;

    /* renamed from: com.ironsource.mediationsdk.g0$a */
    class C11388a extends TimerTask {
        C11388a() {
        }

        public final void run() {
            cancel();
            C11387g0.this.mo44285t();
            C11387g0.this.mo44277d();
        }
    }

    C11387g0() {
        this.f51200g = new C11488e("rewarded_video", this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        return;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m50917A() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.AbstractAdapter r0 = r9.m50931u()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r9)
            return
        L_0x0009:
            r0 = 4
            com.ironsource.mediationsdk.b$a[] r1 = new com.ironsource.mediationsdk.C11347b.C11348a[r0]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.NOT_AVAILABLE     // Catch:{ all -> 0x005a }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.NEEDS_RELOAD     // Catch:{ all -> 0x005a }
            r4 = 1
            r1[r4] = r2     // Catch:{ all -> 0x005a }
            r2 = 2
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C11347b.C11348a.CAPPED_PER_SESSION     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            r2 = 3
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C11347b.C11348a.CAPPED_PER_DAY     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r2 = r9.f51202i     // Catch:{ all -> 0x005a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005a }
            r4 = 0
        L_0x0027:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b r5 = (com.ironsource.mediationsdk.C11347b) r5     // Catch:{ all -> 0x005a }
            r6 = 0
        L_0x0034:
            if (r6 >= r0) goto L_0x0027
            r7 = r1[r6]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r8 = r5.f50929a     // Catch:{ all -> 0x005a }
            if (r8 != r7) goto L_0x003e
            int r4 = r4 + 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0034
        L_0x0041:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r9.f51202i     // Catch:{ all -> 0x005a }
            int r0 = r0.size()     // Catch:{ all -> 0x005a }
            if (r4 >= r0) goto L_0x004e
            r9.m50918B()     // Catch:{ all -> 0x005a }
            monitor-exit(r9)
            return
        L_0x004e:
            boolean r0 = r9.m50929r(r3, r3)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0058
            r0 = 0
            r9.m50928q(r0)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r9)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x005e
        L_0x005d:
            throw r0
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11387g0.m50917A():void");
    }

    /* renamed from: B */
    private synchronized void m50918B() {
        if (m50919C()) {
            this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "Reset Iteration", 0);
            Iterator<C11347b> it = this.f51202i.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C11347b next = it.next();
                if (next.f50929a == C11347b.C11348a.EXHAUSTED) {
                    next.mo43722i();
                }
                if (next.f50929a == C11347b.C11348a.AVAILABLE) {
                    z = true;
                }
            }
            this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "End of Reset Iteration", 0);
            if (m50929r(z, false)) {
                this.f51162t.onRewardedVideoAvailabilityChanged(this.f51209p.booleanValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0024 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m50919C() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r3.f51202i     // Catch:{ all -> 0x0026 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0026 }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0026 }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C11347b) r1     // Catch:{ all -> 0x0026 }
            com.ironsource.mediationsdk.b$a r1 = r1.f50929a     // Catch:{ all -> 0x0026 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.NOT_INITIATED     // Catch:{ all -> 0x0026 }
            if (r1 == r2) goto L_0x0021
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.INITIATED     // Catch:{ all -> 0x0026 }
            if (r1 == r2) goto L_0x0021
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.AVAILABLE     // Catch:{ all -> 0x0026 }
            if (r1 != r2) goto L_0x0007
        L_0x0021:
            r0 = 0
        L_0x0022:
            monitor-exit(r3)
            return r0
        L_0x0024:
            r0 = 1
            goto L_0x0022
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x002a
        L_0x0029:
            throw r0
        L_0x002a:
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11387g0.m50919C():boolean");
    }

    /* renamed from: D */
    private void m50920D() {
        for (int i = 0; i < this.f51202i.size(); i++) {
            String providerTypeForReflection = this.f51202i.get(i).f50931c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C11369d.m50788a().mo44228a(this.f51202i.get(i).f50931c, this.f51202i.get(i).f50931c.getRewardedVideoSettings(), false, false);
                return;
            }
        }
    }

    /* renamed from: E */
    private String m50921E() {
        Placement placement = this.f51166x;
        return placement == null ? "" : placement.getPlacementName();
    }

    /* renamed from: F */
    private void m50922F() {
        Iterator<C11347b> it = this.f51202i.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            C11347b next = it.next();
            if (next.f50929a == C11347b.C11348a.AVAILABLE && next.mo44186l() != null && next.mo44186l().longValue() < j) {
                j = next.mo44186l().longValue();
            }
        }
        if (j != Long.MAX_VALUE) {
            this.f51160E.mo44584a(System.currentTimeMillis() - j);
        }
    }

    /* renamed from: j */
    private void m50923j(int i) {
        m50925l(i, (Object[][]) null);
    }

    /* renamed from: k */
    private void m50924k(int i, C11347b bVar, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11296h.m50466e().mo43979b(new C11308a(i, providerAdditionalData));
    }

    /* renamed from: l */
    private void m50925l(int i, Object[][] objArr) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C11296h.m50466e().mo43979b(new C11308a(i, mediationAdditionalData));
    }

    /* renamed from: n */
    private synchronized void m50926n(C11347b bVar, int i) {
        Object[][] objArr;
        C11484c.m51244c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f51166x);
        if (C11484c.m51245c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), m50921E())) {
            m50925l(IronSourceConstants.RV_CAP_PLACEMENT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E()}});
        }
        this.f51200g.mo44546a(bVar);
        Placement placement = this.f51166x;
        if (placement != null) {
            if (this.f51164v) {
                m50927p(((C11281Z) bVar).f50641B, true, placement.getPlacementId());
                int placementId = this.f51166x.getPlacementId();
                int i2 = 0;
                while (i2 < i && i2 < this.f51202i.size()) {
                    if (!this.f51156A.contains(this.f51202i.get(i2).f50929a)) {
                        m50927p(((C11281Z) this.f51202i.get(i2)).f50641B, false, placementId);
                    }
                    i2++;
                }
            }
            String E = m50921E();
            m50924k(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, E}, new Object[]{IronSourceConstants.EVENTS_STATUS, "true"}});
            int i3 = 0;
            while (i3 < this.f51202i.size() && i3 < i) {
                C11347b bVar2 = this.f51202i.get(i3);
                C11347b.C11348a aVar = bVar2.f50929a;
                if (aVar == C11347b.C11348a.NOT_AVAILABLE || aVar == C11347b.C11348a.NEEDS_RELOAD) {
                    m50924k(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, E}, new Object[]{IronSourceConstants.EVENTS_STATUS, "false"}});
                }
                i3++;
            }
        } else {
            this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
        if (this.f51166x != null) {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E()}};
        } else {
            objArr = null;
        }
        m50924k(IronSourceConstants.RV_INSTANCE_SHOW, bVar, objArr);
        this.f51159D = true;
        this.f51160E.mo44583a();
        ((C11281Z) bVar).f50644w = C11499n.m51312a().mo44568b(1);
        C11281Z z = (C11281Z) bVar;
        if (z.f50930b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = z.f50947s;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, z.f50933e + ":showRewardedVideo()", 1);
            z.mo44182f();
            z.f50930b.showRewardedVideo(z.f50645x, z);
        }
    }

    /* renamed from: p */
    private synchronized void m50927p(String str, boolean z, int i) {
        String str2 = "";
        try {
            str2 = (str2 + str) + "&sdkVersion=" + IronSourceUtils.getSDKVersion();
            Thread thread = new Thread(new Runnable(str2, z, i) {

                /* renamed from: b */
                private /* synthetic */ String f51518b;

                /* renamed from: c */
                private /* synthetic */ boolean f51519c;

                /* renamed from: d */
                private /* synthetic */ int f51520d;

                {
                    this.f51518b = r1;
                    this.f51519c = r2;
                    this.f51520d = r3;
                }

                public final void run() {
                    String str = this.f51518b;
                    boolean z = this.f51519c;
                    try {
                        new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z, this.f51520d)));
                        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NETWORK;
                        logger.log(ironSourceTag, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
                        if (str == null) {
                            sb.append("null");
                        } else {
                            sb.append(str);
                        }
                        sb.append(", hit:");
                        sb.append(z);
                        sb.append(")");
                        IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NETWORK;
                        logger2.log(ironSourceTag2, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
                    }
                }
            }, "callAsyncRequestURL");
            thread.setUncaughtExceptionHandler(new C11411c());
            thread.start();
        } catch (Throwable th) {
            this.f51207n.logException(IronSourceLogger.IronSourceTag.NETWORK, "reportImpression:(providerURL:" + str2 + ", hit:" + z + ")", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m50928q(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.b r0 = r3.f51203j     // Catch:{ all -> 0x0048 }
            r1 = 1
            if (r0 == 0) goto L_0x0021
            boolean r2 = r3.f51210q     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x0021
            r3.f51210q = r1     // Catch:{ all -> 0x0048 }
            com.ironsource.mediationsdk.Z r0 = (com.ironsource.mediationsdk.C11281Z) r0     // Catch:{ all -> 0x0048 }
            com.ironsource.mediationsdk.AbstractAdapter r4 = r3.m50932v(r0)     // Catch:{ all -> 0x0048 }
            if (r4 != 0) goto L_0x001f
            com.ironsource.mediationsdk.sdk.j r4 = r3.f51162t     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r0 = r3.f51209p     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0048 }
            r4.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x0048 }
        L_0x001f:
            monitor-exit(r3)
            return
        L_0x0021:
            boolean r0 = r3.m50936z()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003b
            r4 = 0
            boolean r4 = r3.m50929r(r1, r4)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0046
            com.ironsource.mediationsdk.sdk.j r4 = r3.f51162t     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r0 = r3.f51209p     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0048 }
            r4.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x0048 }
            monitor-exit(r3)
            return
        L_0x003b:
            com.ironsource.mediationsdk.sdk.j r0 = r3.f51162t     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r1 = r3.f51209p     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0048 }
            r0.mo44501a((boolean) r1, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r3)
            return
        L_0x0048:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11387g0.m50928q(java.util.Map):void");
    }

    /* renamed from: r */
    private synchronized boolean m50929r(boolean z, boolean z2) {
        boolean z3;
        Boolean bool;
        z3 = false;
        Boolean bool2 = this.f51209p;
        if (bool2 == null) {
            mo44277d();
            if (z) {
                bool = Boolean.TRUE;
            } else if (!m50936z() && m50933w()) {
                bool = Boolean.FALSE;
            }
        } else if (z && !bool2.booleanValue()) {
            bool = Boolean.TRUE;
        } else if (!z && this.f51209p.booleanValue() && ((!m50935y() || z2) && !m50936z())) {
            bool = Boolean.FALSE;
        }
        this.f51209p = bool;
        z3 = true;
        return z3;
    }

    /* renamed from: s */
    private void m50930s(boolean z) {
        if (!z && mo44276c()) {
            m50925l(1000, (Object[][]) null);
            m50925l(1003, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
            this.f51157B = false;
        } else if (m50934x()) {
            m50925l(1000, (Object[][]) null);
            this.f51157B = true;
            this.f51158C = new Date().getTime();
        }
    }

    /* renamed from: u */
    private AbstractAdapter m50931u() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f51202i.size() && abstractAdapter == null; i2++) {
            if (this.f51202i.get(i2).f50929a == C11347b.C11348a.AVAILABLE || this.f51202i.get(i2).f50929a == C11347b.C11348a.INITIATED) {
                i++;
                if (i >= this.f51201h) {
                    break;
                }
            } else if (this.f51202i.get(i2).f50929a == C11347b.C11348a.NOT_INITIATED && (abstractAdapter = m50932v((C11281Z) this.f51202i.get(i2))) == null) {
                this.f51202i.get(i2).mo44177a(C11347b.C11348a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a6, code lost:
        return r0;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m50932v(com.ironsource.mediationsdk.C11281Z r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f51207n     // Catch:{ all -> 0x00d5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r2.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = r9.f51161s     // Catch:{ all -> 0x00d5 }
            r2.append(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = r10.f50933e     // Catch:{ all -> 0x00d5 }
            r2.append(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d5 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00d5 }
            com.ironsource.mediationsdk.d r0 = com.ironsource.mediationsdk.C11369d.m50788a()     // Catch:{ all -> 0x00d5 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f50931c     // Catch:{ all -> 0x00d5 }
            org.json.JSONObject r2 = r1.getRewardedVideoSettings()     // Catch:{ all -> 0x00d5 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo44228a(r1, r2, r4, r4)     // Catch:{ all -> 0x00d5 }
            r1 = 0
            if (r0 != 0) goto L_0x0055
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f51207n     // Catch:{ all -> 0x00d5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r3.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r10 = r10.f50933e     // Catch:{ all -> 0x00d5 }
            r3.append(r10)     // Catch:{ all -> 0x00d5 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00d5 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00d5 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r9)
            return r1
        L_0x0055:
            r10.f50930b = r0     // Catch:{ all -> 0x00d5 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.INITIATED     // Catch:{ all -> 0x00d5 }
            r10.mo44177a(r2)     // Catch:{ all -> 0x00d5 }
            r9.mo44293i(r10)     // Catch:{ all -> 0x00d5 }
            r2 = 1001(0x3e9, float:1.403E-42)
            r9.m50924k(r2, r10, r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = r9.f51206m     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r9.f51205l     // Catch:{ all -> 0x00a7 }
            r10.mo43964s()     // Catch:{ all -> 0x00a7 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f50930b     // Catch:{ all -> 0x00a7 }
            if (r5 == 0) goto L_0x00a5
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.f50647z     // Catch:{ all -> 0x00a7 }
            r5.set(r3)     // Catch:{ all -> 0x00a7 }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x00a7 }
            r5.<init>()     // Catch:{ all -> 0x00a7 }
            long r5 = r5.getTime()     // Catch:{ all -> 0x00a7 }
            r10.f50640A = r5     // Catch:{ all -> 0x00a7 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f50930b     // Catch:{ all -> 0x00a7 }
            r5.addRewardedVideoListener(r10)     // Catch:{ all -> 0x00a7 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f50947s     // Catch:{ all -> 0x00a7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r7.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = r10.f50933e     // Catch:{ all -> 0x00a7 }
            r7.append(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = ":initRewardedVideo()"
            r7.append(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00a7 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x00a7 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f50930b     // Catch:{ all -> 0x00a7 }
            org.json.JSONObject r5 = r10.f50645x     // Catch:{ all -> 0x00a7 }
            r3.initRewardedVideo(r2, r4, r5, r10)     // Catch:{ all -> 0x00a7 }
        L_0x00a5:
            monitor-exit(r9)
            return r0
        L_0x00a7:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f51207n     // Catch:{ all -> 0x00d5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r4.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = r9.f51161s     // Catch:{ all -> 0x00d5 }
            r4.append(r5)     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = r10.mo44185j()     // Catch:{ all -> 0x00d5 }
            r4.append(r5)     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00d5 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00d5 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C11347b.C11348a.INIT_FAILED     // Catch:{ all -> 0x00d5 }
            r10.mo44177a(r0)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r9)
            return r1
        L_0x00d5:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11387g0.m50932v(com.ironsource.mediationsdk.Z):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* renamed from: w */
    private synchronized boolean m50933w() {
        int i;
        Iterator<C11347b> it = this.f51202i.iterator();
        i = 0;
        while (it.hasNext()) {
            C11347b.C11348a aVar = it.next().f50929a;
            if (aVar == C11347b.C11348a.INIT_FAILED || aVar == C11347b.C11348a.CAPPED_PER_DAY || aVar == C11347b.C11348a.CAPPED_PER_SESSION || aVar == C11347b.C11348a.NOT_AVAILABLE || aVar == C11347b.C11348a.NEEDS_RELOAD || aVar == C11347b.C11348a.EXHAUSTED) {
                i++;
            }
        }
        return this.f51202i.size() == i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0030 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m50934x() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r3.f51202i     // Catch:{ all -> 0x0032 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0032 }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0032 }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C11347b) r1     // Catch:{ all -> 0x0032 }
            com.ironsource.mediationsdk.b$a r1 = r1.f50929a     // Catch:{ all -> 0x0032 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.NOT_AVAILABLE     // Catch:{ all -> 0x0032 }
            if (r1 == r2) goto L_0x002d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.NEEDS_RELOAD     // Catch:{ all -> 0x0032 }
            if (r1 == r2) goto L_0x002d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.AVAILABLE     // Catch:{ all -> 0x0032 }
            if (r1 == r2) goto L_0x002d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.INITIATED     // Catch:{ all -> 0x0032 }
            if (r1 == r2) goto L_0x002d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.INIT_PENDING     // Catch:{ all -> 0x0032 }
            if (r1 == r2) goto L_0x002d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.LOAD_PENDING     // Catch:{ all -> 0x0032 }
            if (r1 != r2) goto L_0x0007
        L_0x002d:
            r0 = 1
        L_0x002e:
            monitor-exit(r3)
            return r0
        L_0x0030:
            r0 = 0
            goto L_0x002e
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x0036
        L_0x0035:
            throw r0
        L_0x0036:
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11387g0.m50934x():boolean");
    }

    /* renamed from: y */
    private synchronized boolean m50935y() {
        boolean z;
        z = false;
        Iterator<C11347b> it = this.f51202i.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f50929a == C11347b.C11348a.AVAILABLE) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: z */
    private synchronized boolean m50936z() {
        C11347b bVar = this.f51203j;
        if (bVar == null) {
            return false;
        }
        return ((C11281Z) bVar).mo43963o();
    }

    /* renamed from: a */
    public final void mo44269a(C11281Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.f50933e + ":onRewardedVideoAdOpened()", 1);
        m50924k(1005, z, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.f50644w)}});
        this.f51162t.onRewardedVideoAdOpened();
    }

    /* renamed from: a */
    public final void mo44270a(IronSourceError ironSourceError, C11281Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.f50933e + ":onRewardedVideoAdShowFailed(" + ironSourceError + ")", 1);
        this.f51159D = false;
        int i = z.f50644w;
        m50924k(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, z, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E()}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(i)}});
        m50930s(false);
        this.f51162t.onRewardedVideoAdShowFailed(ironSourceError);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44271a(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f51207n     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x019b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x019b }
            r2.<init>()     // Catch:{ all -> 0x019b }
            java.lang.String r3 = r9.f51161s     // Catch:{ all -> 0x019b }
            r2.append(r3)     // Catch:{ all -> 0x019b }
            java.lang.String r3 = ":showRewardedVideo(placementName: "
            r2.append(r3)     // Catch:{ all -> 0x019b }
            r2.append(r10)     // Catch:{ all -> 0x019b }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x019b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x019b }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.sdk.j r0 = r9.f51162t     // Catch:{ all -> 0x019b }
            r0.f51471f = r10     // Catch:{ all -> 0x019b }
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x019b }
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x019b }
            java.lang.String r6 = "placement"
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x019b }
            r5[r3] = r10     // Catch:{ all -> 0x019b }
            r2[r7] = r5     // Catch:{ all -> 0x019b }
            r9.m50925l(r0, r2)     // Catch:{ all -> 0x019b }
            boolean r10 = r9.f51159D     // Catch:{ all -> 0x019b }
            r0 = 3
            if (r10 == 0) goto L_0x0055
            java.lang.String r10 = "showRewardedVideo error: can't show ad while an ad is already showing"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f51207n     // Catch:{ all -> 0x019b }
            r2.log(r1, r10, r0)     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x019b }
            r1 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.sdk.j r10 = r9.f51162t     // Catch:{ all -> 0x019b }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x019b }
            monitor-exit(r9)
            return
        L_0x0055:
            boolean r10 = r9.f51208o     // Catch:{ all -> 0x019b }
            if (r10 == 0) goto L_0x007b
            com.ironsource.environment.ContextProvider r10 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x019b }
            android.app.Activity r10 = r10.getCurrentActiveActivity()     // Catch:{ all -> 0x019b }
            boolean r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r10)     // Catch:{ all -> 0x019b }
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = "showRewardedVideo error: can't show ad when there's no internet connection"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f51207n     // Catch:{ all -> 0x019b }
            r2.log(r1, r10, r0)     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.sdk.j r10 = r9.f51162t     // Catch:{ all -> 0x019b }
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoInternetConnectionShowFailError(r0)     // Catch:{ all -> 0x019b }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x019b }
            monitor-exit(r9)
            return
        L_0x007b:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ all -> 0x019b }
            r10.<init>()     // Catch:{ all -> 0x019b }
            r0 = 0
        L_0x0081:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r1 = r9.f51202i     // Catch:{ all -> 0x019b }
            int r1 = r1.size()     // Catch:{ all -> 0x019b }
            if (r0 >= r1) goto L_0x016d
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r1 = r9.f51202i     // Catch:{ all -> 0x019b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C11347b) r1     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f51207n     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x019b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x019b }
            java.lang.String r8 = "showRewardedVideo, iterating on: "
            r6.<init>(r8)     // Catch:{ all -> 0x019b }
            java.lang.String r8 = r1.f50933e     // Catch:{ all -> 0x019b }
            r6.append(r8)     // Catch:{ all -> 0x019b }
            java.lang.String r8 = ", Status: "
            r6.append(r8)     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.b$a r8 = r1.f50929a     // Catch:{ all -> 0x019b }
            r6.append(r8)     // Catch:{ all -> 0x019b }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x019b }
            r2.log(r5, r6, r7)     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.b$a r2 = r1.f50929a     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.b$a r6 = com.ironsource.mediationsdk.C11347b.C11348a.AVAILABLE     // Catch:{ all -> 0x019b }
            if (r2 != r6) goto L_0x0169
            r2 = r1
            com.ironsource.mediationsdk.Z r2 = (com.ironsource.mediationsdk.C11281Z) r2     // Catch:{ all -> 0x019b }
            boolean r2 = r2.mo43963o()     // Catch:{ all -> 0x019b }
            if (r2 == 0) goto L_0x011c
            r9.m50926n(r1, r0)     // Catch:{ all -> 0x019b }
            boolean r10 = r9.f51211r     // Catch:{ all -> 0x019b }
            if (r10 == 0) goto L_0x00d3
            com.ironsource.mediationsdk.b r10 = r9.f51204k     // Catch:{ all -> 0x019b }
            boolean r10 = r1.equals(r10)     // Catch:{ all -> 0x019b }
            if (r10 != 0) goto L_0x00d3
            r9.mo44282h()     // Catch:{ all -> 0x019b }
        L_0x00d3:
            boolean r10 = r1.mo44180d()     // Catch:{ all -> 0x019b }
            if (r10 == 0) goto L_0x00e9
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C11347b.C11348a.CAPPED_PER_SESSION     // Catch:{ all -> 0x019b }
            r1.mo44177a(r10)     // Catch:{ all -> 0x019b }
            r10 = 1401(0x579, float:1.963E-42)
            r0 = 0
            r9.m50924k(r10, r1, r0)     // Catch:{ all -> 0x019b }
            r9.m50917A()     // Catch:{ all -> 0x019b }
            monitor-exit(r9)
            return
        L_0x00e9:
            com.ironsource.mediationsdk.utils.e r10 = r9.f51200g     // Catch:{ all -> 0x019b }
            boolean r10 = r10.mo44549c(r1)     // Catch:{ all -> 0x019b }
            if (r10 == 0) goto L_0x010e
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C11347b.C11348a.CAPPED_PER_DAY     // Catch:{ all -> 0x019b }
            r1.mo44177a(r10)     // Catch:{ all -> 0x019b }
            r10 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x019b }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x019b }
            java.lang.String r4 = "status"
            r2[r7] = r4     // Catch:{ all -> 0x019b }
            java.lang.String r4 = "true"
            r2[r3] = r4     // Catch:{ all -> 0x019b }
            r0[r7] = r2     // Catch:{ all -> 0x019b }
            r9.m50924k(r10, r1, r0)     // Catch:{ all -> 0x019b }
            r9.m50917A()     // Catch:{ all -> 0x019b }
            monitor-exit(r9)
            return
        L_0x010e:
            boolean r10 = r1.mo44179c()     // Catch:{ all -> 0x019b }
            if (r10 == 0) goto L_0x011a
            r9.m50931u()     // Catch:{ all -> 0x019b }
            r9.m50918B()     // Catch:{ all -> 0x019b }
        L_0x011a:
            monitor-exit(r9)
            return
        L_0x011c:
            java.lang.Long r2 = r1.mo44187m()     // Catch:{ all -> 0x019b }
            if (r2 == 0) goto L_0x0144
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x019b }
            r2.<init>()     // Catch:{ all -> 0x019b }
            java.lang.String r6 = r1.f50933e     // Catch:{ all -> 0x019b }
            r2.append(r6)     // Catch:{ all -> 0x019b }
            java.lang.String r6 = ":"
            r2.append(r6)     // Catch:{ all -> 0x019b }
            java.lang.Long r6 = r1.mo44187m()     // Catch:{ all -> 0x019b }
            r2.append(r6)     // Catch:{ all -> 0x019b }
            java.lang.String r6 = ","
            r2.append(r6)     // Catch:{ all -> 0x019b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x019b }
            r10.append(r2)     // Catch:{ all -> 0x019b }
        L_0x0144:
            r2 = r1
            com.ironsource.mediationsdk.Z r2 = (com.ironsource.mediationsdk.C11281Z) r2     // Catch:{ all -> 0x019b }
            r9.mo44273a((boolean) r7, (com.ironsource.mediationsdk.C11281Z) r2)     // Catch:{ all -> 0x019b }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ all -> 0x019b }
            java.lang.String r6 = "FailedToShowVideoException"
            r2.<init>(r6)     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r9.f51207n     // Catch:{ all -> 0x019b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x019b }
            r8.<init>()     // Catch:{ all -> 0x019b }
            java.lang.String r1 = r1.f50933e     // Catch:{ all -> 0x019b }
            r8.append(r1)     // Catch:{ all -> 0x019b }
            java.lang.String r1 = " Failed to show video"
            r8.append(r1)     // Catch:{ all -> 0x019b }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x019b }
            r6.logException(r5, r1, r2)     // Catch:{ all -> 0x019b }
        L_0x0169:
            int r0 = r0 + 1
            goto L_0x0081
        L_0x016d:
            boolean r0 = r9.m50936z()     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0180
            com.ironsource.mediationsdk.b r10 = r9.f51203j     // Catch:{ all -> 0x019b }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r9.f51202i     // Catch:{ all -> 0x019b }
            int r0 = r0.size()     // Catch:{ all -> 0x019b }
            r9.m50926n(r10, r0)     // Catch:{ all -> 0x019b }
            monitor-exit(r9)
            return
        L_0x0180:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x019b }
            r0.<init>()     // Catch:{ all -> 0x019b }
            java.lang.String r1 = "ext1"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x019b }
            r0.put(r1, r10)     // Catch:{ all -> 0x019b }
            com.ironsource.mediationsdk.sdk.j r10 = r9.f51162t     // Catch:{ all -> 0x019b }
            java.lang.String r1 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r1)     // Catch:{ all -> 0x019b }
            r10.mo44500a((com.ironsource.mediationsdk.logger.IronSourceError) r1, (java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x019b }
            monitor-exit(r9)
            return
        L_0x019b:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x019f
        L_0x019e:
            throw r10
        L_0x019f:
            goto L_0x019e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11387g0.mo44271a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44272a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f51207n     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r9.f51161s     // Catch:{ all -> 0x00df }
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ":initRewardedVideo(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r10)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r11)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00df }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00df }
            r0.<init>()     // Catch:{ all -> 0x00df }
            long r0 = r0.getTime()     // Catch:{ all -> 0x00df }
            r2 = 81312(0x13da0, float:1.13942E-40)
            r9.m50923j(r2)     // Catch:{ all -> 0x00df }
            r9.f51206m = r10     // Catch:{ all -> 0x00df }
            r9.f51205l = r11     // Catch:{ all -> 0x00df }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r10 = r9.f51202i     // Catch:{ all -> 0x00df }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x00df }
            r11 = 0
            r2 = 0
        L_0x0047:
            boolean r4 = r10.hasNext()     // Catch:{ all -> 0x00df }
            r5 = 2
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.b r4 = (com.ironsource.mediationsdk.C11347b) r4     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.utils.e r6 = r9.f51200g     // Catch:{ all -> 0x00df }
            boolean r6 = r6.mo44548b((com.ironsource.mediationsdk.C11347b) r4)     // Catch:{ all -> 0x00df }
            if (r6 == 0) goto L_0x006f
            r6 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "status"
            r5[r11] = r8     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "false"
            r5[r3] = r8     // Catch:{ all -> 0x00df }
            r7[r11] = r5     // Catch:{ all -> 0x00df }
            r9.m50924k(r6, r4, r7)     // Catch:{ all -> 0x00df }
        L_0x006f:
            com.ironsource.mediationsdk.utils.e r5 = r9.f51200g     // Catch:{ all -> 0x00df }
            boolean r5 = r5.mo44549c(r4)     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0047
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C11347b.C11348a.CAPPED_PER_DAY     // Catch:{ all -> 0x00df }
            r4.mo44177a(r5)     // Catch:{ all -> 0x00df }
            int r2 = r2 + 1
            goto L_0x0047
        L_0x007f:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r10 = r9.f51202i     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r2 != r10) goto L_0x008e
            com.ironsource.mediationsdk.sdk.j r10 = r9.f51162t     // Catch:{ all -> 0x00df }
            r10.onRewardedVideoAvailabilityChanged(r11)     // Catch:{ all -> 0x00df }
            monitor-exit(r9)
            return
        L_0x008e:
            r10 = 1000(0x3e8, float:1.401E-42)
            r9.m50923j(r10)     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.sdk.j r10 = r9.f51162t     // Catch:{ all -> 0x00df }
            r2 = 0
            r10.f51471f = r2     // Catch:{ all -> 0x00df }
            r9.f51157B = r3     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            r9.f51158C = r6     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            long r6 = r6 - r0
            r10 = 81313(0x13da1, float:1.13944E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "duration"
            r1[r11] = r2     // Catch:{ all -> 0x00df }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00df }
            r1[r3] = r2     // Catch:{ all -> 0x00df }
            r0[r11] = r1     // Catch:{ all -> 0x00df }
            r9.m50925l(r10, r0)     // Catch:{ all -> 0x00df }
            r9.m50920D()     // Catch:{ all -> 0x00df }
        L_0x00c8:
            int r10 = r9.f51201h     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r10 = r9.f51202i     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            com.ironsource.mediationsdk.AbstractAdapter r10 = r9.m50931u()     // Catch:{ all -> 0x00df }
            if (r10 == 0) goto L_0x00dd
            int r11 = r11 + 1
            goto L_0x00c8
        L_0x00dd:
            monitor-exit(r9)
            return
        L_0x00df:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x00e3
        L_0x00e2:
            throw r10
        L_0x00e3:
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11387g0.mo44272a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo20593a(boolean z) {
        Boolean bool;
        if (this.f51208o) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z2 = false;
            ironSourceLoggerManager.log(ironSourceTag, "Network Availability Changed To: " + z, 0);
            Boolean bool2 = this.f51209p;
            if (bool2 != null) {
                if (z && !bool2.booleanValue() && m50935y()) {
                    bool = Boolean.TRUE;
                } else if (!z && this.f51209p.booleanValue()) {
                    bool = Boolean.FALSE;
                }
                this.f51209p = bool;
                z2 = true;
            }
            if (z2) {
                this.f51163u = !z;
                this.f51162t.onRewardedVideoAvailabilityChanged(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00eb, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44273a(boolean r10, com.ironsource.mediationsdk.C11281Z r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f51207n     // Catch:{ all -> 0x0115 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0115 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r2.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r11.f50933e     // Catch:{ all -> 0x0115 }
            r2.append(r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = ": onRewardedVideoAvailabilityChanged(available:"
            r2.append(r3)     // Catch:{ all -> 0x0115 }
            r2.append(r10)     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0115 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0115 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0115 }
            boolean r0 = r9.f51163u     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x002a
            monitor-exit(r9)
            return
        L_0x002a:
            r0 = 0
            if (r10 == 0) goto L_0x0058
            boolean r2 = r9.f51157B     // Catch:{ all -> 0x0115 }
            if (r2 == 0) goto L_0x0058
            r9.f51157B = r0     // Catch:{ all -> 0x0115 }
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x0115 }
            r2.<init>()     // Catch:{ all -> 0x0115 }
            long r4 = r2.getTime()     // Catch:{ all -> 0x0115 }
            long r6 = r9.f51158C     // Catch:{ all -> 0x0115 }
            long r4 = r4 - r6
            r2 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r6 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0115 }
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = "duration"
            r7[r0] = r8     // Catch:{ all -> 0x0115 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0115 }
            r7[r3] = r4     // Catch:{ all -> 0x0115 }
            r6[r0] = r7     // Catch:{ all -> 0x0115 }
            r9.m50925l(r2, r6)     // Catch:{ all -> 0x0115 }
            r9.m50922F()     // Catch:{ all -> 0x0115 }
        L_0x0058:
            com.ironsource.mediationsdk.b r2 = r9.f51203j     // Catch:{ all -> 0x00ec }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x00ec }
            if (r2 == 0) goto L_0x0073
            boolean r0 = r9.m50929r(r10, r0)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x0071
            com.ironsource.mediationsdk.sdk.j r0 = r9.f51162t     // Catch:{ all -> 0x00ec }
            java.lang.Boolean r1 = r9.f51209p     // Catch:{ all -> 0x00ec }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ec }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ec }
        L_0x0071:
            monitor-exit(r9)
            return
        L_0x0073:
            com.ironsource.mediationsdk.b r2 = r9.f51204k     // Catch:{ all -> 0x00ec }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x00ec }
            if (r2 == 0) goto L_0x00b8
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f51207n     // Catch:{ all -> 0x00ec }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r4.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = r11.f50933e     // Catch:{ all -> 0x00ec }
            r4.append(r5)     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = " is a premium adapter, canShowPremium: "
            r4.append(r5)     // Catch:{ all -> 0x00ec }
            boolean r5 = r9.mo44292b()     // Catch:{ all -> 0x00ec }
            r4.append(r5)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ec }
            r2.log(r1, r4, r3)     // Catch:{ all -> 0x00ec }
            boolean r1 = r9.mo44292b()     // Catch:{ all -> 0x00ec }
            if (r1 != 0) goto L_0x00b8
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C11347b.C11348a.CAPPED_PER_SESSION     // Catch:{ all -> 0x00ec }
            r11.mo44177a(r1)     // Catch:{ all -> 0x00ec }
            boolean r0 = r9.m50929r(r0, r0)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00b6
            com.ironsource.mediationsdk.sdk.j r0 = r9.f51162t     // Catch:{ all -> 0x00ec }
            java.lang.Boolean r1 = r9.f51209p     // Catch:{ all -> 0x00ec }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ec }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ec }
        L_0x00b6:
            monitor-exit(r9)
            return
        L_0x00b8:
            com.ironsource.mediationsdk.utils.e r1 = r9.f51200g     // Catch:{ all -> 0x00ec }
            boolean r1 = r1.mo44549c(r11)     // Catch:{ all -> 0x00ec }
            if (r1 != 0) goto L_0x00ea
            if (r10 == 0) goto L_0x00da
            boolean r1 = r11.mo44181e()     // Catch:{ all -> 0x00ec }
            if (r1 == 0) goto L_0x00da
            boolean r0 = r9.m50929r(r3, r0)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00ea
            com.ironsource.mediationsdk.sdk.j r0 = r9.f51162t     // Catch:{ all -> 0x00ec }
            java.lang.Boolean r1 = r9.f51209p     // Catch:{ all -> 0x00ec }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ec }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ec }
            goto L_0x0113
        L_0x00da:
            boolean r0 = r9.m50929r(r0, r0)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00e4
            r0 = 0
            r9.m50928q(r0)     // Catch:{ all -> 0x00ec }
        L_0x00e4:
            r9.m50931u()     // Catch:{ all -> 0x00ec }
            r9.m50918B()     // Catch:{ all -> 0x00ec }
        L_0x00ea:
            monitor-exit(r9)
            return
        L_0x00ec:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f51207n     // Catch:{ all -> 0x0115 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0115 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            java.lang.String r4 = "onRewardedVideoAvailabilityChanged(available:"
            r3.<init>(r4)     // Catch:{ all -> 0x0115 }
            r3.append(r10)     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = ", provider:"
            r3.append(r10)     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = r11.mo44185j()     // Catch:{ all -> 0x0115 }
            r3.append(r10)     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = ")"
            r3.append(r10)     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x0115 }
            r1.logException(r2, r10, r0)     // Catch:{ all -> 0x0115 }
        L_0x0113:
            monitor-exit(r9)
            return
        L_0x0115:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11387g0.mo44273a(boolean, com.ironsource.mediationsdk.Z):void");
    }

    /* renamed from: b */
    public final void mo44274b(C11281Z z) {
        String str;
        this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, z.f50933e + ":onRewardedVideoAdClosed()", 1);
        this.f51159D = false;
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<C11347b> it = this.f51202i.iterator();
            while (it.hasNext()) {
                C11347b next = it.next();
                if (((C11281Z) next).mo43963o()) {
                    sb.append(next.f50933e + ";");
                }
            }
        } catch (Throwable unused) {
            this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "Failed to check RV availability", 0);
        }
        Object[][] objArr = new Object[3][];
        objArr[0] = new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E()};
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
        objArr[1] = objArr2;
        objArr[2] = new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.f50644w)};
        m50924k(IronSourceConstants.RV_INSTANCE_CLOSED, z, objArr);
        C11499n.m51312a().mo44566a(1);
        if (!z.mo44180d() && !this.f51200g.mo44549c(z)) {
            m50924k(1001, z, (Object[][]) null);
        }
        m50930s(false);
        this.f51162t.onRewardedVideoAdClosed();
        m50922F();
        Iterator<C11347b> it2 = this.f51202i.iterator();
        while (it2.hasNext()) {
            C11347b next2 = it2.next();
            IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "Fetch on ad closed, iterating on: " + next2.f50933e + ", Status: " + next2.f50929a, 0);
            C11347b.C11348a aVar = next2.f50929a;
            if (aVar == C11347b.C11348a.NOT_AVAILABLE || aVar == C11347b.C11348a.NEEDS_RELOAD) {
                try {
                    if (!next2.f50933e.equals(z.f50933e)) {
                        this.f51207n.log(ironSourceTag, next2.f50933e + ":reload smash", 1);
                        ((C11281Z) next2).mo43962n();
                        m50924k(1001, next2, (Object[][]) null);
                    }
                } catch (Throwable th) {
                    this.f51207n.log(IronSourceLogger.IronSourceTag.NATIVE, next2.f50933e + " Failed to call fetchVideo(), " + th.getLocalizedMessage(), 1);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo44275c(C11281Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.f50933e + ":onRewardedVideoAdStarted()", 1);
        m50924k(IronSourceConstants.RV_INSTANCE_STARTED, z, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.f50644w)}});
        this.f51162t.onRewardedVideoAdStarted();
    }

    /* renamed from: c */
    public final synchronized boolean mo44276c() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.f51161s + ":isRewardedVideoAvailable()", 1);
        if (this.f51208o && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator<C11347b> it = this.f51202i.iterator();
        while (it.hasNext()) {
            C11347b next = it.next();
            if (next.mo44181e() && ((C11281Z) next).mo43963o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c_ */
    public final void mo44142c_() {
        if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext()) || this.f51209p == null) {
            IronLog.INTERNAL.info("while reloading mediation due to expiration, internet loss occurred");
            m50925l(IronSourceConstants.TROUBLESHOOTING_RV_TRADITIONAL_RELOAD_FAILED_INTERNET_LOSS, (Object[][]) null);
            return;
        }
        if (m50929r(false, true)) {
            m50928q(C4952a.C49531.m22720a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        }
        m50930s(true);
        Iterator<C11347b> it = this.f51202i.iterator();
        while (it.hasNext()) {
            C11347b next = it.next();
            C11347b.C11348a aVar = next.f50929a;
            if (aVar == C11347b.C11348a.AVAILABLE || aVar == C11347b.C11348a.NOT_AVAILABLE) {
                next.mo44177a(C11347b.C11348a.NEEDS_RELOAD);
            }
        }
        Iterator<C11347b> it2 = this.f51202i.iterator();
        while (it2.hasNext()) {
            C11347b next2 = it2.next();
            if (next2.f50929a == C11347b.C11348a.NEEDS_RELOAD) {
                try {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.info(next2.f50933e + ":reload smash");
                    m50924k(1001, next2, (Object[][]) null);
                    ((C11281Z) next2).mo43962n();
                } catch (Throwable th) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error(next2.f50933e + " Failed to call fetchVideo(), " + th.getLocalizedMessage());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo44277d() {
        if (this.f51168z <= 0) {
            this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "load interval is not set, ignoring", 1);
            return;
        }
        Timer timer = this.f51167y;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f51167y = timer2;
        timer2.schedule(new C11388a(), (long) (this.f51168z * 1000));
    }

    /* renamed from: d */
    public final void mo44278d(C11281Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.f50933e + ":onRewardedVideoAdEnded()", 1);
        m50924k(IronSourceConstants.RV_INSTANCE_ENDED, z, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.f50644w)}});
        this.f51162t.onRewardedVideoAdEnded();
    }

    /* renamed from: e */
    public final void mo44279e(C11281Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.f50933e + ":onRewardedVideoAdRewarded()", 1);
        if (this.f51166x == null) {
            this.f51166x = C11232E.m50103a().f50430t.f51666c.f51377a.mo44446a();
        }
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData((C11347b) z);
        try {
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, z.f50644w);
            if (this.f51166x != null) {
                providerAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f51166x.getRewardName());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.f51166x.getRewardAmount());
            } else {
                this.f51207n.log(ironSourceTag, "mCurrentPlacement is null", 3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C11308a aVar = new C11308a(1010, providerAdditionalData);
        if (!TextUtils.isEmpty(this.f51206m)) {
            aVar.mo44039a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.mo44040b(), z.mo44185j()));
            if (!TextUtils.isEmpty(C11232E.m50103a().f50423m)) {
                aVar.mo44039a(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C11232E.m50103a().f50423m);
            }
            Map<String, String> map = C11232E.m50103a().f50424n;
            if (map != null) {
                for (String next : map.keySet()) {
                    aVar.mo44039a(ContentMetadata.KEY_CUSTOM_PREFIX + next, map.get(next));
                }
            }
        }
        C11296h.m50466e().mo43979b(aVar);
        Placement placement = this.f51166x;
        if (placement != null) {
            this.f51162t.onRewardedVideoAdRewarded(placement);
        } else {
            this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
    }

    /* renamed from: f */
    public final void mo44280f(C11281Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.f50933e + ":onRewardedVideoAdClicked()", 1);
        if (this.f51166x == null) {
            this.f51166x = C11232E.m50103a().f50430t.f51666c.f51377a.mo44446a();
        }
        if (this.f51166x == null) {
            this.f51207n.log(ironSourceTag, "mCurrentPlacement is null", 3);
            return;
        }
        m50924k(1006, z, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.f50644w)}});
        this.f51162t.onRewardedVideoAdClicked(this.f51166x);
    }

    /* renamed from: g */
    public final void mo44026g() {
        Iterator<C11347b> it = this.f51202i.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C11347b next = it.next();
            if (next.f50929a == C11347b.C11348a.CAPPED_PER_DAY) {
                m50924k(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, next, new Object[][]{new Object[]{IronSourceConstants.EVENTS_STATUS, "false"}});
                next.mo44177a(C11347b.C11348a.NOT_AVAILABLE);
                if (((C11281Z) next).mo43963o() && next.mo44181e()) {
                    next.mo44177a(C11347b.C11348a.AVAILABLE);
                    z = true;
                }
            }
        }
        if (z && m50929r(true, false)) {
            this.f51162t.onRewardedVideoAvailabilityChanged(true);
        }
    }

    /* renamed from: g */
    public final void mo44281g(C11281Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.f50933e + ":onRewardedVideoAdVisible()", 1);
        if (this.f51166x != null) {
            m50924k(IronSourceConstants.RV_INSTANCE_VISIBLE, z, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m50921E()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.f50644w)}});
            return;
        }
        this.f51207n.log(ironSourceTag, "mCurrentPlacement is null", 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final synchronized void mo44282h() {
        super.mo44282h();
        Iterator<C11347b> it = this.f51202i.iterator();
        while (it.hasNext()) {
            C11347b next = it.next();
            if (next.equals(this.f51204k)) {
                next.mo44177a(C11347b.C11348a.CAPPED_PER_SESSION);
                m50931u();
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo44283m(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f51161s + " Should Track Network State: " + z, 0);
        try {
            this.f51208o = z;
            if (z) {
                if (this.f51165w == null) {
                    this.f51165w = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f51165w, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f51165w != null) {
                context.getApplicationContext().unregisterReceiver(this.f51165w);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo44284o(Placement placement) {
        this.f51166x = placement;
        this.f51162t.f51471f = placement.getPlacementName();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo44285t() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0090 }
            android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ all -> 0x0090 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008e
            java.lang.Boolean r0 = r8.f51209p     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0015
            goto L_0x008e
        L_0x0015:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x008c
            r0 = 102(0x66, float:1.43E-43)
            r1 = 0
            r8.m50925l(r0, r1)     // Catch:{ all -> 0x0090 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.m50925l(r0, r1)     // Catch:{ all -> 0x0090 }
            r0 = 1
            r8.f51157B = r0     // Catch:{ all -> 0x0090 }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r2 = r8.f51202i     // Catch:{ all -> 0x0090 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0090 }
        L_0x002f:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x008c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0090 }
            com.ironsource.mediationsdk.b r3 = (com.ironsource.mediationsdk.C11347b) r3     // Catch:{ all -> 0x0090 }
            com.ironsource.mediationsdk.b$a r4 = r3.f50929a     // Catch:{ all -> 0x0090 }
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C11347b.C11348a.NOT_AVAILABLE     // Catch:{ all -> 0x0090 }
            if (r4 != r5) goto L_0x002f
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r8.f51207n     // Catch:{ all -> 0x0069 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0069 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            java.lang.String r7 = "Fetch from timer: "
            r6.<init>(r7)     // Catch:{ all -> 0x0069 }
            java.lang.String r7 = r3.f50933e     // Catch:{ all -> 0x0069 }
            r6.append(r7)     // Catch:{ all -> 0x0069 }
            java.lang.String r7 = ":reload smash"
            r6.append(r7)     // Catch:{ all -> 0x0069 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0069 }
            r4.log(r5, r6, r0)     // Catch:{ all -> 0x0069 }
            r4 = 1001(0x3e9, float:1.403E-42)
            r8.m50924k(r4, r3, r1)     // Catch:{ all -> 0x0069 }
            r4 = r3
            com.ironsource.mediationsdk.Z r4 = (com.ironsource.mediationsdk.C11281Z) r4     // Catch:{ all -> 0x0069 }
            r4.mo43962n()     // Catch:{ all -> 0x0069 }
            goto L_0x002f
        L_0x0069:
            r4 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r8.f51207n     // Catch:{ all -> 0x0090 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x0090 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            r7.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = r3.f50933e     // Catch:{ all -> 0x0090 }
            r7.append(r3)     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = " Failed to call fetchVideo(), "
            r7.append(r3)     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = r4.getLocalizedMessage()     // Catch:{ all -> 0x0090 }
            r7.append(r3)     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0090 }
            r5.log(r6, r3, r0)     // Catch:{ all -> 0x0090 }
            goto L_0x002f
        L_0x008c:
            monitor-exit(r8)
            return
        L_0x008e:
            monitor-exit(r8)
            return
        L_0x0090:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0094
        L_0x0093:
            throw r0
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11387g0.mo44285t():void");
    }
}
