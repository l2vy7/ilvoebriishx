package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.k3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class C9554k3 {

    /* renamed from: d */
    private static final C9511f2 f45722d = C9511f2.m44252b();

    /* renamed from: a */
    private C9552k1 f45723a;

    /* renamed from: b */
    private volatile C9522g4 f45724b;

    /* renamed from: c */
    private volatile C9552k1 f45725c;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.vision.C9522g4 m44436c(com.google.android.gms.internal.vision.C9522g4 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.vision.g4 r0 = r1.f45724b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.vision.g4 r0 = r1.f45724b     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f45724b = r2     // Catch:{ f3 -> 0x0012 }
            com.google.android.gms.internal.vision.k1 r0 = com.google.android.gms.internal.vision.C9552k1.f45714c     // Catch:{ f3 -> 0x0012 }
            r1.f45725c = r0     // Catch:{ f3 -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f45724b = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.vision.k1 r2 = com.google.android.gms.internal.vision.C9552k1.f45714c     // Catch:{ all -> 0x001a }
            r1.f45725c = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.vision.g4 r2 = r1.f45724b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9554k3.m44436c(com.google.android.gms.internal.vision.g4):com.google.android.gms.internal.vision.g4");
    }

    /* renamed from: a */
    public final C9552k1 mo38482a() {
        if (this.f45725c != null) {
            return this.f45725c;
        }
        synchronized (this) {
            if (this.f45725c != null) {
                C9552k1 k1Var = this.f45725c;
                return k1Var;
            }
            if (this.f45724b == null) {
                this.f45725c = C9552k1.f45714c;
            } else {
                this.f45725c = this.f45724b.mo38405h();
            }
            C9552k1 k1Var2 = this.f45725c;
            return k1Var2;
        }
    }

    /* renamed from: b */
    public final int mo38483b() {
        if (this.f45725c != null) {
            return this.f45725c.size();
        }
        if (this.f45724b != null) {
            return this.f45724b.mo38402b();
        }
        return 0;
    }

    /* renamed from: d */
    public final C9522g4 mo38484d(C9522g4 g4Var) {
        C9522g4 g4Var2 = this.f45724b;
        this.f45723a = null;
        this.f45725c = null;
        this.f45724b = g4Var;
        return g4Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9554k3)) {
            return false;
        }
        C9554k3 k3Var = (C9554k3) obj;
        C9522g4 g4Var = this.f45724b;
        C9522g4 g4Var2 = k3Var.f45724b;
        if (g4Var == null && g4Var2 == null) {
            return mo38482a().equals(k3Var.mo38482a());
        }
        if (g4Var != null && g4Var2 != null) {
            return g4Var.equals(g4Var2);
        }
        if (g4Var != null) {
            return g4Var.equals(k3Var.m44436c(g4Var.mo38425d()));
        }
        return m44436c(g4Var2.mo38425d()).equals(g4Var2);
    }

    public int hashCode() {
        return 1;
    }
}
