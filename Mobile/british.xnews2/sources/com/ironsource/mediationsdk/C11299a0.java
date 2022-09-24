package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11347b;
import com.ironsource.mediationsdk.C11362c0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11422h;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.p275a.C11292d;
import com.ironsource.mediationsdk.sdk.C11449i;
import com.ironsource.mediationsdk.sdk.C11450j;
import com.ironsource.mediationsdk.utils.C11484c;
import com.ironsource.mediationsdk.utils.C11487d;
import com.ironsource.mediationsdk.utils.C11488e;
import com.ironsource.mediationsdk.utils.C11493i;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a0 */
final class C11299a0 extends C11391h0 implements C11449i, C11487d, C11493i {

    /* renamed from: A */
    private Map<String, C11228C> f50734A = new ConcurrentHashMap();

    /* renamed from: B */
    private CopyOnWriteArraySet<String> f50735B = new CopyOnWriteArraySet<>();

    /* renamed from: C */
    private long f50736C;

    /* renamed from: D */
    private boolean f50737D;

    /* renamed from: s */
    private final String f50738s = C11299a0.class.getName();

    /* renamed from: t */
    C11450j f50739t;

    /* renamed from: u */
    private boolean f50740u = false;

    /* renamed from: v */
    private boolean f50741v = false;

    /* renamed from: w */
    private boolean f50742w;

    /* renamed from: x */
    private InterstitialPlacement f50743x;

    /* renamed from: y */
    C11434o f50744y = C11434o.m51097a();

    /* renamed from: z */
    private boolean f50745z = false;

    C11299a0() {
        this.f51200g = new C11488e(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, this);
        this.f50737D = false;
    }

    /* renamed from: j */
    private int m50474j(C11347b.C11348a... aVarArr) {
        Iterator<C11347b> it = this.f51202i.iterator();
        int i = 0;
        while (it.hasNext()) {
            C11347b next = it.next();
            for (C11347b.C11348a aVar : aVarArr) {
                if (next.f50929a == aVar) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: k */
    private void m50475k(int i, C11347b bVar, Object[][] objArr) {
        m50476l(i, bVar, objArr, false);
    }

    /* renamed from: l */
    private void m50476l(int i, C11347b bVar, Object[][] objArr, boolean z) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (z) {
            try {
                InterstitialPlacement interstitialPlacement = this.f50743x;
                if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                    providerAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f50743x.getPlacementName());
                }
            } catch (Exception e) {
                this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C11292d.m50446e().mo43979b(new C11308a(i, providerAdditionalData));
    }

    /* renamed from: m */
    private void m50477m(int i, Object[][] objArr) {
        m50478n(i, objArr, false);
    }

    /* renamed from: n */
    private void m50478n(int i, Object[][] objArr, boolean z) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (z) {
            try {
                InterstitialPlacement interstitialPlacement = this.f50743x;
                if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f50743x.getPlacementName());
                }
            } catch (Exception e) {
                this.f51207n.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C11292d.m50446e().mo43979b(new C11308a(i, mediationAdditionalData));
    }

    /* renamed from: q */
    private void m50479q(int i, C11347b bVar, Object[][] objArr) {
        m50476l(i, bVar, objArr, true);
    }

    /* renamed from: r */
    private void m50480r(C11347b bVar) {
        if (!bVar.mo44181e()) {
            m50484v();
            m50482t();
            return;
        }
        bVar.mo44177a(C11347b.C11348a.INITIATED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        return r0;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m50481s(com.ironsource.mediationsdk.C11228C r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f51207n     // Catch:{ all -> 0x00c0 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r2.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = r9.f50738s     // Catch:{ all -> 0x00c0 }
            r2.append(r3)     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = r10.mo44185j()     // Catch:{ all -> 0x00c0 }
            r2.append(r3)     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c0 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00c0 }
            com.ironsource.mediationsdk.d r0 = com.ironsource.mediationsdk.C11369d.m50788a()     // Catch:{ all -> 0x00c0 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f50931c     // Catch:{ all -> 0x00c0 }
            org.json.JSONObject r2 = r1.getInterstitialSettings()     // Catch:{ all -> 0x00c0 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo44228a(r1, r2, r4, r4)     // Catch:{ all -> 0x00c0 }
            r1 = 0
            if (r0 != 0) goto L_0x0057
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f51207n     // Catch:{ all -> 0x00c0 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r3.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r10 = r10.f50933e     // Catch:{ all -> 0x00c0 }
            r3.append(r10)     // Catch:{ all -> 0x00c0 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00c0 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00c0 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00c0 }
            monitor-exit(r9)
            return r1
        L_0x0057:
            r10.f50930b = r0     // Catch:{ all -> 0x00c0 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C11347b.C11348a.INIT_PENDING     // Catch:{ all -> 0x00c0 }
            r10.mo44177a(r2)     // Catch:{ all -> 0x00c0 }
            r9.mo44293i(r10)     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = r9.f51206m     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = r9.f51205l     // Catch:{ all -> 0x0092 }
            r10.mo43734p()     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f50930b     // Catch:{ all -> 0x0092 }
            if (r5 == 0) goto L_0x0090
            r5.addInterstitialListener(r10)     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f50947s     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r7.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r8 = r10.f50933e     // Catch:{ all -> 0x0092 }
            r7.append(r8)     // Catch:{ all -> 0x0092 }
            java.lang.String r8 = ":initInterstitial()"
            r7.append(r8)     // Catch:{ all -> 0x0092 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0092 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f50930b     // Catch:{ all -> 0x0092 }
            org.json.JSONObject r5 = r10.f50365x     // Catch:{ all -> 0x0092 }
            r3.initInterstitial(r2, r4, r5, r10)     // Catch:{ all -> 0x0092 }
        L_0x0090:
            monitor-exit(r9)
            return r0
        L_0x0092:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f51207n     // Catch:{ all -> 0x00c0 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r4.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = r9.f50738s     // Catch:{ all -> 0x00c0 }
            r4.append(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = r10.mo44185j()     // Catch:{ all -> 0x00c0 }
            r4.append(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c0 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00c0 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C11347b.C11348a.INIT_FAILED     // Catch:{ all -> 0x00c0 }
            r10.mo44177a(r0)     // Catch:{ all -> 0x00c0 }
            monitor-exit(r9)
            return r1
        L_0x00c0:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11299a0.m50481s(com.ironsource.mediationsdk.C):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x002b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50482t() {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r5.f51202i
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C11347b) r1
            com.ironsource.mediationsdk.b$a r1 = r1.f50929a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C11347b.C11348a.NOT_INITIATED
            if (r1 == r3) goto L_0x0029
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C11347b.C11348a.INIT_PENDING
            if (r1 == r3) goto L_0x0029
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C11347b.C11348a.INITIATED
            if (r1 == r3) goto L_0x0029
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C11347b.C11348a.LOAD_PENDING
            if (r1 == r3) goto L_0x0029
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C11347b.C11348a.AVAILABLE
            if (r1 != r3) goto L_0x0006
        L_0x0029:
            r0 = 0
            goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            if (r0 == 0) goto L_0x005c
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f51207n
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "Reset Iteration"
            r0.log(r1, r3, r2)
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r5.f51202i
            java.util.Iterator r0 = r0.iterator()
        L_0x003d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C11347b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f50929a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C11347b.C11348a.EXHAUSTED
            if (r3 != r4) goto L_0x003d
            r1.mo43722i()
            goto L_0x003d
        L_0x0053:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f51207n
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "End of Reset Iteration"
            r0.log(r1, r3, r2)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11299a0.m50482t():void");
    }

    /* renamed from: u */
    private synchronized void m50483u(C11228C c) {
        m50475k(2002, c, (Object[][]) null);
        c.mo43735q();
        if (c.f50930b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = c.f50947s;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":loadInterstitial()", 1);
            c.f50367z = new Date().getTime();
            c.f50930b.loadInterstitial(c.f50365x, c);
        }
    }

    /* renamed from: v */
    private AbstractAdapter m50484v() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f51202i.size() && abstractAdapter == null; i2++) {
            if (this.f51202i.get(i2).f50929a == C11347b.C11348a.AVAILABLE || this.f51202i.get(i2).f50929a == C11347b.C11348a.INITIATED || this.f51202i.get(i2).f50929a == C11347b.C11348a.INIT_PENDING || this.f51202i.get(i2).f50929a == C11347b.C11348a.LOAD_PENDING) {
                i++;
                if (i >= this.f51201h) {
                    break;
                }
            } else if (this.f51202i.get(i2).f50929a == C11347b.C11348a.NOT_INITIATED && (abstractAdapter = m50481s((C11228C) this.f51202i.get(i2))) == null) {
                this.f51202i.get(i2).mo44177a(C11347b.C11348a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* renamed from: w */
    private synchronized void m50485w() {
        Iterator<C11347b> it = this.f51202i.iterator();
        while (it.hasNext()) {
            C11347b next = it.next();
            C11347b.C11348a aVar = next.f50929a;
            if (aVar == C11347b.C11348a.AVAILABLE || aVar == C11347b.C11348a.LOAD_PENDING || aVar == C11347b.C11348a.NOT_AVAILABLE) {
                next.mo44177a(C11347b.C11348a.INITIATED);
            }
        }
    }

    /* renamed from: x */
    private void m50486x() {
        for (int i = 0; i < this.f51202i.size(); i++) {
            String providerTypeForReflection = this.f51202i.get(i).f50931c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C11369d.m50788a().mo44228a(this.f51202i.get(i).f50931c, this.f51202i.get(i).f50931c.getInterstitialSettings(), false, false);
                return;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo44012a(C11228C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f50933e + " :onInterstitialInitSuccess()", 1);
        m50475k(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, c, (Object[][]) null);
        this.f50742w = true;
        if (this.f50740u) {
            C11347b.C11348a aVar = C11347b.C11348a.LOAD_PENDING;
            if (m50474j(C11347b.C11348a.AVAILABLE, aVar) < this.f51201h) {
                c.mo44177a(aVar);
                m50483u(c);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo44013a(C11228C c, long j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":onInterstitialAdReady()", 1);
        m50475k(2003, c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        long time = new Date().getTime() - this.f50736C;
        c.mo44177a(C11347b.C11348a.AVAILABLE);
        this.f50741v = false;
        if (this.f50745z) {
            this.f50745z = false;
            this.f50739t.onInterstitialAdReady();
            m50477m(2004, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
        }
    }

    /* renamed from: a */
    public final synchronized void mo44014a(IronSourceError ironSourceError, C11228C c) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":onInterstitialInitFailed(" + ironSourceError + ")", 1);
            m50475k(IronSourceConstants.IS_INSTANCE_INIT_FAILED, c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            C11347b.C11348a aVar = C11347b.C11348a.INIT_FAILED;
            if (m50474j(aVar) >= this.f51202i.size()) {
                IronSourceLoggerManager ironSourceLoggerManager2 = this.f51207n;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
                ironSourceLoggerManager2.log(ironSourceTag2, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + ironSourceError.getErrorMessage(), 2);
                if (this.f50740u) {
                    this.f50744y.mo44452a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildGenericError("no ads to show"));
                    m50477m(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_GENERIC)}});
                    this.f50745z = false;
                }
                this.f50742w = true;
            } else {
                if (m50484v() == null && this.f50740u) {
                    if (m50474j(aVar, C11347b.C11348a.NOT_AVAILABLE, C11347b.C11348a.CAPPED_PER_SESSION, C11347b.C11348a.CAPPED_PER_DAY, C11347b.C11348a.EXHAUSTED) >= this.f51202i.size()) {
                        this.f50744y.mo44452a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
                        m50477m(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}});
                        this.f50745z = false;
                    }
                }
                m50482t();
                return;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager3 = this.f51207n;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager3.logException(ironSourceTag3, "onInterstitialInitFailed(error:" + ironSourceError + ", provider:" + c.mo44185j() + ")", e);
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44015a(com.ironsource.mediationsdk.logger.IronSourceError r8, com.ironsource.mediationsdk.C11228C r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f51207n     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r2.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r9.f50933e     // Catch:{ all -> 0x012c }
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ":onInterstitialAdLoadFailed("
            r2.append(r3)     // Catch:{ all -> 0x012c }
            r2.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x012c }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r0.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r9.f50933e     // Catch:{ all -> 0x012c }
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ":onInterstitialAdLoadFailed("
            r0.append(r1)     // Catch:{ all -> 0x012c }
            r0.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x012c }
            int r0 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            r1 = 1158(0x486, float:1.623E-42)
            r2 = 2
            r4 = 0
            if (r0 != r1) goto L_0x0074
            r0 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r8 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r3] = r8     // Catch:{ all -> 0x012c }
            r7.m50475k(r0, r9, r1)     // Catch:{ all -> 0x012c }
            goto L_0x00aa
        L_0x0074:
            r0 = 2200(0x898, float:3.083E-42)
            r1 = 3
            java.lang.Object[][] r1 = new java.lang.Object[r1][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r6 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x012c }
            r5[r3] = r6     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "reason"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            java.lang.String r8 = r8.getErrorMessage()     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r3] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r2] = r8     // Catch:{ all -> 0x012c }
            r7.m50475k(r0, r9, r1)     // Catch:{ all -> 0x012c }
        L_0x00aa:
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C11347b.C11348a.NOT_AVAILABLE     // Catch:{ all -> 0x012c }
            r9.mo44177a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a[] r8 = new com.ironsource.mediationsdk.C11347b.C11348a[r2]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C11347b.C11348a.AVAILABLE     // Catch:{ all -> 0x012c }
            r8[r4] = r9     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C11347b.C11348a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r8[r3] = r9     // Catch:{ all -> 0x012c }
            int r8 = r7.m50474j(r8)     // Catch:{ all -> 0x012c }
            int r9 = r7.f51201h     // Catch:{ all -> 0x012c }
            if (r8 < r9) goto L_0x00c3
            monitor-exit(r7)
            return
        L_0x00c3:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r9 = r7.f51202i     // Catch:{ all -> 0x012c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x012c }
        L_0x00c9:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x012c }
            if (r10 == 0) goto L_0x00e7
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b r10 = (com.ironsource.mediationsdk.C11347b) r10     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r11 = r10.f50929a     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C11347b.C11348a.INITIATED     // Catch:{ all -> 0x012c }
            if (r11 != r0) goto L_0x00c9
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C11347b.C11348a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r10.mo44177a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.C r10 = (com.ironsource.mediationsdk.C11228C) r10     // Catch:{ all -> 0x012c }
            r7.m50483u(r10)     // Catch:{ all -> 0x012c }
            monitor-exit(r7)
            return
        L_0x00e7:
            com.ironsource.mediationsdk.AbstractAdapter r9 = r7.m50484v()     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x00ef
            monitor-exit(r7)
            return
        L_0x00ef:
            boolean r9 = r7.f50740u     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x012a
            com.ironsource.mediationsdk.b$a[] r9 = new com.ironsource.mediationsdk.C11347b.C11348a[r3]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C11347b.C11348a.INIT_PENDING     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            int r9 = r7.m50474j(r9)     // Catch:{ all -> 0x012c }
            int r8 = r8 + r9
            if (r8 != 0) goto L_0x012a
            r7.m50482t()     // Catch:{ all -> 0x012c }
            r7.f50741v = r4     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.o r8 = r7.f50744y     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r9 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "No ads to show"
            r0 = 509(0x1fd, float:7.13E-43)
            r10.<init>(r0, r11)     // Catch:{ all -> 0x012c }
            r8.mo44452a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r9, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x012c }
            r8 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r9 = new java.lang.Object[r3][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "errorCode"
            r10[r4] = r11     // Catch:{ all -> 0x012c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x012c }
            r10[r3] = r11     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            r7.m50477m(r8, r9)     // Catch:{ all -> 0x012c }
        L_0x012a:
            monitor-exit(r7)
            return
        L_0x012c:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0130
        L_0x012f:
            throw r8
        L_0x0130:
            goto L_0x012f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11299a0.mo44015a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.C, long):void");
    }

    /* renamed from: a */
    public final void mo43754a(String str) {
        if (this.f50740u) {
            this.f50744y.mo44452a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            this.f50740u = false;
            this.f50741v = false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo44016a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager.log(ironSourceTag, this.f50738s + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        m50477m(IronSourceConstants.IS_MANAGER_INIT_STARTED, (Object[][]) null);
        this.f51206m = str;
        this.f51205l = str2;
        Iterator<C11347b> it = this.f51202i.iterator();
        int i = 0;
        while (it.hasNext()) {
            C11347b next = it.next();
            if (this.f51200g.mo44548b(next)) {
                m50475k(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, next, new Object[][]{new Object[]{IronSourceConstants.EVENTS_STATUS, "false"}});
            }
            if (this.f51200g.mo44549c(next)) {
                next.mo44177a(C11347b.C11348a.CAPPED_PER_DAY);
                i++;
            }
        }
        if (i == this.f51202i.size()) {
            this.f50742w = true;
        }
        m50486x();
        for (int i2 = 0; i2 < this.f51201h && m50484v() != null; i2++) {
        }
        m50477m(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: a */
    public final void mo43756a(List<IronSource.AD_UNIT> list, boolean z, C11422h hVar) {
    }

    /* renamed from: b */
    public final void mo44017b(C11228C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":onInterstitialAdOpened()", 1);
        m50479q(IronSourceConstants.IS_INSTANCE_OPENED, c, (Object[][]) null);
        this.f50739t.onInterstitialAdOpened();
    }

    /* renamed from: b */
    public final void mo44018b(IronSourceError ironSourceError, C11228C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        m50479q(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        this.f50737D = false;
        m50480r(c);
        Iterator<C11347b> it = this.f51202i.iterator();
        while (it.hasNext()) {
            if (it.next().f50929a == C11347b.C11348a.AVAILABLE) {
                this.f50740u = true;
                InterstitialPlacement interstitialPlacement = this.f50743x;
                if (interstitialPlacement != null) {
                    interstitialPlacement.getPlacementName();
                }
                mo44021d();
                return;
            }
        }
        this.f50739t.onInterstitialAdShowFailed(ironSourceError);
    }

    /* renamed from: c */
    public final synchronized void mo44019c() {
        try {
            if (this.f50737D) {
                this.f51207n.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial cannot be invoked while showing an ad", 3);
                C11220A.m50068a().mo43687a(new IronSourceError(1037, "loadInterstitial cannot be invoked while showing an ad"));
                return;
            }
            this.f50743x = null;
            this.f50739t.f51470e = null;
            if (!this.f50741v) {
                C11434o oVar = this.f50744y;
                IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                if (!oVar.mo44453a(ad_unit)) {
                    C11362c0.C11366c b = C11362c0.m50779a().mo44215b();
                    if (b == C11362c0.C11366c.NOT_INIT) {
                        this.f51207n.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                        return;
                    } else if (b == C11362c0.C11366c.INIT_IN_PROGRESS) {
                        if (C11362c0.m50779a().mo44218c()) {
                            this.f51207n.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                            this.f50744y.mo44452a(ad_unit, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                            return;
                        }
                        this.f50736C = new Date().getTime();
                        m50477m(2001, (Object[][]) null);
                        this.f50740u = true;
                        this.f50745z = true;
                        return;
                    } else if (b == C11362c0.C11366c.INIT_FAILED) {
                        this.f51207n.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        this.f50744y.mo44452a(ad_unit, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else if (this.f51202i.size() == 0) {
                        this.f51207n.log(IronSourceLogger.IronSourceTag.API, "the server response does not contain interstitial data", 3);
                        this.f50744y.mo44452a(ad_unit, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else {
                        this.f50736C = new Date().getTime();
                        m50477m(2001, (Object[][]) null);
                        this.f50745z = true;
                        m50485w();
                        if (m50474j(C11347b.C11348a.INITIATED) != 0) {
                            this.f50740u = true;
                            this.f50741v = true;
                            Iterator<C11347b> it = this.f51202i.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                C11347b next = it.next();
                                if (next.f50929a == C11347b.C11348a.INITIATED) {
                                    next.mo44177a(C11347b.C11348a.LOAD_PENDING);
                                    m50483u((C11228C) next);
                                    i++;
                                    if (i >= this.f51201h) {
                                        return;
                                    }
                                }
                            }
                            return;
                        } else if (!this.f50742w) {
                            this.f50740u = true;
                            return;
                        } else {
                            IronSourceError buildGenericError = ErrorBuilder.buildGenericError("no ads to load");
                            this.f51207n.log(IronSourceLogger.IronSourceTag.API, buildGenericError.getErrorMessage(), 1);
                            this.f50744y.mo44452a(ad_unit, buildGenericError);
                            m50477m(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildGenericError.getErrorCode())}});
                            this.f50745z = false;
                            return;
                        }
                    }
                }
            }
            this.f51207n.log(IronSourceLogger.IronSourceTag.API, "Load Interstitial is already in progress", 3);
        } catch (Exception e) {
            e.printStackTrace();
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e.getMessage());
            this.f51207n.log(IronSourceLogger.IronSourceTag.API, buildLoadFailedError.getErrorMessage(), 3);
            this.f50744y.mo44452a(IronSource.AD_UNIT.INTERSTITIAL, buildLoadFailedError);
            if (this.f50745z) {
                this.f50745z = false;
                m50477m(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildLoadFailedError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
            }
        }
    }

    /* renamed from: c */
    public final void mo44020c(C11228C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":onInterstitialAdClosed()", 1);
        this.f50737D = false;
        m50479q(IronSourceConstants.IS_INSTANCE_CLOSED, c, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C11499n.m51312a().mo44568b(2))}});
        C11499n.m51312a().mo44566a(2);
        this.f50739t.onInterstitialAdClosed();
    }

    /* renamed from: d */
    public final void mo44021d() {
        if (this.f50737D) {
            this.f51207n.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            this.f50739t.onInterstitialAdShowFailed(new IronSourceError(1036, "showInterstitial error: can't show ad while an ad is already showing"));
        } else if (!this.f50740u) {
            this.f51207n.log(IronSourceLogger.IronSourceTag.API, "showInterstitial failed - You need to load interstitial before showing it", 3);
            this.f50739t.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - You need to load interstitial before showing it"));
        } else if (!this.f51208o || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            for (int i = 0; i < this.f51202i.size(); i++) {
                C11347b bVar = this.f51202i.get(i);
                if (bVar.f50929a == C11347b.C11348a.AVAILABLE) {
                    C11484c.m51243c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f50743x);
                    if (C11484c.m51237b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f50743x) != C11484c.C11485a.f51556d) {
                        m50478n(IronSourceConstants.IS_CAP_PLACEMENT, (Object[][]) null, true);
                    }
                    m50479q(IronSourceConstants.IS_INSTANCE_SHOW, bVar, (Object[][]) null);
                    this.f50737D = true;
                    C11228C c = (C11228C) bVar;
                    if (c.f50930b != null) {
                        IronSourceLoggerManager ironSourceLoggerManager = c.f50947s;
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                        ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":showInterstitial()", 1);
                        c.mo44182f();
                        c.f50930b.showInterstitial(c.f50365x, c);
                    }
                    if (bVar.mo44180d()) {
                        m50475k(IronSourceConstants.IS_CAP_SESSION, bVar, (Object[][]) null);
                    }
                    this.f51200g.mo44546a(bVar);
                    if (this.f51200g.mo44549c(bVar)) {
                        bVar.mo44177a(C11347b.C11348a.CAPPED_PER_DAY);
                        m50475k(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, bVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_STATUS, "true"}});
                    }
                    this.f50740u = false;
                    if (!bVar.mo44181e()) {
                        m50484v();
                        return;
                    }
                    return;
                }
            }
            this.f50739t.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - No adapters ready to show"));
        } else {
            this.f51207n.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad when there's no internet connection", 3);
            this.f50739t.onInterstitialAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    /* renamed from: d */
    public final void mo44022d(C11228C c) {
        C11347b.C11348a aVar;
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":onInterstitialAdShowSucceeded()", 1);
        m50479q(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, c, (Object[][]) null);
        Iterator<C11347b> it = this.f51202i.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C11347b next = it.next();
            if (next.f50929a == C11347b.C11348a.AVAILABLE) {
                m50480r(next);
                z = true;
            }
        }
        if (!z && ((aVar = c.f50929a) == C11347b.C11348a.CAPPED_PER_SESSION || aVar == C11347b.C11348a.EXHAUSTED || aVar == C11347b.C11348a.CAPPED_PER_DAY)) {
            m50482t();
        }
        m50485w();
        this.f50739t.onInterstitialAdShowSucceeded();
    }

    /* renamed from: e */
    public final void mo44023e(C11228C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":onInterstitialAdClicked()", 1);
        m50479q(2006, c, (Object[][]) null);
        this.f50739t.onInterstitialAdClicked();
    }

    /* renamed from: e */
    public final synchronized boolean mo44024e() {
        boolean z;
        if (this.f51208o && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator<C11347b> it = this.f51202i.iterator();
        while (it.hasNext()) {
            C11347b next = it.next();
            if (next.f50929a == C11347b.C11348a.AVAILABLE) {
                C11228C c = (C11228C) next;
                if (c.f50930b != null) {
                    IronSourceLoggerManager ironSourceLoggerManager = c.f50947s;
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                    ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":isInterstitialReady()", 1);
                    z = c.f50930b.isInterstitialReady(c.f50365x);
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo43765f() {
        if (this.f50740u) {
            IronSourceError buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            this.f50744y.mo44452a(IronSource.AD_UNIT.INTERSTITIAL, buildInitFailedError);
            this.f50740u = false;
            this.f50741v = false;
            if (this.f50745z) {
                m50478n(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildInitFailedError.getErrorCode())}}, false);
                this.f50745z = false;
            }
        }
    }

    /* renamed from: f */
    public final void mo44025f(C11228C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f50933e + ":onInterstitialAdVisible()", 1);
    }

    /* renamed from: g */
    public final void mo44026g() {
        Iterator<C11347b> it = this.f51202i.iterator();
        while (it.hasNext()) {
            C11347b next = it.next();
            if (next.f50929a == C11347b.C11348a.CAPPED_PER_DAY) {
                m50475k(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, next, new Object[][]{new Object[]{IronSourceConstants.EVENTS_STATUS, "false"}});
                next.mo44177a(next.mo44180d() ? C11347b.C11348a.CAPPED_PER_SESSION : next.mo44179c() ? C11347b.C11348a.EXHAUSTED : C11347b.C11348a.INITIATED);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo44027o(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f51207n;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f50738s + " Should Track Network State: " + z, 0);
        this.f51208o = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo44028p(InterstitialPlacement interstitialPlacement) {
        this.f50743x = interstitialPlacement;
        this.f50739t.f51470e = interstitialPlacement;
    }
}
