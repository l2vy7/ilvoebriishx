package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.p286a.C11521e;

/* renamed from: com.ironsource.mediationsdk.utils.n */
public final class C11499n {

    /* renamed from: f */
    private static C11499n f51738f;

    /* renamed from: a */
    private int f51739a = 1;

    /* renamed from: b */
    private int f51740b = 1;

    /* renamed from: c */
    private int f51741c = 1;

    /* renamed from: d */
    private int f51742d = 1;

    /* renamed from: e */
    private C11521e f51743e = new C11521e();

    /* renamed from: com.ironsource.mediationsdk.utils.n$a */
    static /* synthetic */ class C11500a {

        /* renamed from: a */
        static final /* synthetic */ int[] f51744a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51744a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f51744a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f51744a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f51744a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C11499n.C11500a.<clinit>():void");
        }
    }

    private C11499n() {
        m51314d(this.f51739a);
        m51315e(this.f51740b);
        m51316f(this.f51742d);
    }

    /* renamed from: a */
    public static synchronized C11499n m51312a() {
        C11499n nVar;
        synchronized (C11499n.class) {
            if (f51738f == null) {
                f51738f = new C11499n();
            }
            nVar = f51738f;
        }
        return nVar;
    }

    /* renamed from: c */
    private static IronSource.AD_UNIT m51313c(int i) {
        if (i == 0) {
            return IronSource.AD_UNIT.OFFERWALL;
        }
        if (i == 1) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i != 3) {
            return null;
        }
        return IronSource.AD_UNIT.BANNER;
    }

    /* renamed from: d */
    private void m51314d(int i) {
        this.f51739a = i;
        this.f51743e.mo44600b(i);
    }

    /* renamed from: e */
    private void m51315e(int i) {
        this.f51740b = i;
        this.f51743e.mo44599a(i);
    }

    /* renamed from: f */
    private void m51316f(int i) {
        this.f51742d = i;
        this.f51743e.mo44601c(i);
    }

    /* renamed from: a */
    public final synchronized void mo44566a(int i) {
        mo44567a(m51313c(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44567a(com.ironsource.mediationsdk.IronSource.AD_UNIT r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            int[] r0 = com.ironsource.mediationsdk.utils.C11499n.C11500a.f51744a     // Catch:{ all -> 0x0039 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0039 }
            r3 = r0[r3]     // Catch:{ all -> 0x0039 }
            r0 = 1
            if (r3 == r0) goto L_0x0032
            r1 = 2
            if (r3 == r1) goto L_0x002a
            r1 = 3
            if (r3 == r1) goto L_0x0022
            r1 = 4
            if (r3 == r1) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            int r3 = r2.f51742d     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m51316f(r3)     // Catch:{ all -> 0x0039 }
        L_0x0020:
            monitor-exit(r2)
            return
        L_0x0022:
            int r3 = r2.f51740b     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m51315e(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x002a:
            int r3 = r2.f51739a     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m51314d(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0032:
            int r3 = r2.f51741c     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.f51741c = r3     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0039:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C11499n.mo44567a(com.ironsource.mediationsdk.IronSource$AD_UNIT):void");
    }

    /* renamed from: b */
    public final synchronized int mo44568b(int i) {
        return mo44569b(m51313c(i));
    }

    /* renamed from: b */
    public final synchronized int mo44569b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        int i = C11500a.f51744a[ad_unit.ordinal()];
        if (i == 1) {
            return this.f51741c;
        } else if (i == 2) {
            return this.f51739a;
        } else if (i == 3) {
            return this.f51740b;
        } else if (i != 4) {
            return -1;
        } else {
            return this.f51742d;
        }
    }
}
