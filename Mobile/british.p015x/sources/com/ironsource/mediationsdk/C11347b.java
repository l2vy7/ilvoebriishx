package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Timer;

/* renamed from: com.ironsource.mediationsdk.b */
public abstract class C11347b {

    /* renamed from: a */
    C11348a f50929a;

    /* renamed from: b */
    public AbstractAdapter f50930b;

    /* renamed from: c */
    NetworkSettings f50931c;

    /* renamed from: d */
    private String f50932d;

    /* renamed from: e */
    String f50933e;

    /* renamed from: f */
    public String f50934f;

    /* renamed from: g */
    public String f50935g;

    /* renamed from: h */
    boolean f50936h;

    /* renamed from: i */
    private int f50937i;

    /* renamed from: j */
    int f50938j;

    /* renamed from: k */
    Timer f50939k;

    /* renamed from: l */
    Timer f50940l;

    /* renamed from: m */
    public int f50941m;

    /* renamed from: n */
    public int f50942n;

    /* renamed from: o */
    int f50943o;

    /* renamed from: p */
    int f50944p;

    /* renamed from: q */
    protected Long f50945q;

    /* renamed from: r */
    protected Long f50946r;

    /* renamed from: s */
    IronSourceLoggerManager f50947s;

    /* renamed from: t */
    private String f50948t = "maxAdsPerSession";

    /* renamed from: u */
    private String f50949u = "maxAdsPerIteration";

    /* renamed from: v */
    private String f50950v = "maxAdsPerDay";

    /* renamed from: com.ironsource.mediationsdk.b$a */
    public enum C11348a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);
        

        /* renamed from: l */
        public int f50963l;

        private C11348a(int i) {
            this.f50963l = i;
        }
    }

    C11347b(NetworkSettings networkSettings) {
        this.f50932d = networkSettings.getProviderTypeForReflection();
        this.f50933e = networkSettings.getProviderInstanceName();
        this.f50936h = networkSettings.isMultipleInstances();
        this.f50931c = networkSettings;
        this.f50934f = networkSettings.getSubProviderId();
        this.f50935g = networkSettings.getAdSourceNameForEvents();
        this.f50938j = 0;
        this.f50937i = 0;
        this.f50929a = C11348a.NOT_INITIATED;
        this.f50947s = IronSourceLoggerManager.getLogger();
        this.f50945q = null;
        this.f50946r = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44177a(com.ironsource.mediationsdk.C11347b.C11348a r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.b$a r0 = r4.f50929a     // Catch:{ all -> 0x0042 }
            if (r0 != r5) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r4.f50929a = r5     // Catch:{ all -> 0x0042 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f50947s     // Catch:{ all -> 0x0042 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "Smart Loading - "
            r2.<init>(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = r4.f50933e     // Catch:{ all -> 0x0042 }
            r2.append(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = " state changed to "
            r2.append(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0042 }
            r2.append(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0042 }
            r3 = 0
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0042 }
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f50930b     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0040
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C11347b.C11348a.CAPPED_PER_SESSION     // Catch:{ all -> 0x0042 }
            if (r5 == r1) goto L_0x0039
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C11347b.C11348a.CAPPED_PER_DAY     // Catch:{ all -> 0x0042 }
            if (r5 != r1) goto L_0x0040
        L_0x0039:
            java.lang.String r1 = r4.mo43723k()     // Catch:{ all -> 0x0042 }
            r0.setMediationState(r5, r1)     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r4)
            return
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11347b.mo44177a(com.ironsource.mediationsdk.b$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo44178b(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f50947s;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, str + " exception: " + this.f50933e + " | " + str2, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo44179c() {
        return this.f50938j >= this.f50943o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo44180d() {
        return this.f50937i >= this.f50944p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo44181e() {
        if (!mo44179c() && !mo44180d()) {
            if (!(this.f50929a == C11348a.CAPPED_PER_DAY)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo44182f() {
        this.f50938j++;
        this.f50937i++;
        if (mo44180d()) {
            mo44177a(C11348a.CAPPED_PER_SESSION);
        } else if (mo44179c()) {
            mo44177a(C11348a.EXHAUSTED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo44183g() {
        try {
            Timer timer = this.f50939k;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            mo44178b("stopInitTimer", e.getLocalizedMessage());
        } finally {
            this.f50939k = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo44184h() {
        try {
            Timer timer = this.f50940l;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            mo44178b("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f50940l = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo43722i();

    /* renamed from: j */
    public final String mo44185j() {
        return this.f50936h ? this.f50932d : this.f50933e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo43723k();

    /* renamed from: l */
    public final Long mo44186l() {
        return this.f50945q;
    }

    /* renamed from: m */
    public final Long mo44187m() {
        return this.f50946r;
    }
}
