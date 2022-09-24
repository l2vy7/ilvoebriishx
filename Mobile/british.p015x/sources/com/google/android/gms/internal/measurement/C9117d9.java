package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public class C9117d9 {

    /* renamed from: c */
    private static final C9132e8 f44955c = C9132e8.m42824a();

    /* renamed from: a */
    protected volatile C9409w9 f44956a;

    /* renamed from: b */
    private volatile C9329r7 f44957b;

    /* renamed from: a */
    public final int mo37503a() {
        if (this.f44957b != null) {
            return ((C9298p7) this.f44957b).f45362f.length;
        }
        if (this.f44956a != null) {
            return this.f44956a.mo37992c();
        }
        return 0;
    }

    /* renamed from: b */
    public final C9329r7 mo37504b() {
        if (this.f44957b != null) {
            return this.f44957b;
        }
        synchronized (this) {
            if (this.f44957b != null) {
                C9329r7 r7Var = this.f44957b;
                return r7Var;
            }
            if (this.f44956a == null) {
                this.f44957b = C9329r7.f45419c;
            } else {
                this.f44957b = this.f44956a.mo37402h();
            }
            C9329r7 r7Var2 = this.f44957b;
            return r7Var2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37505c(com.google.android.gms.internal.measurement.C9409w9 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.w9 r0 = r1.f44956a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.w9 r0 = r1.f44956a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f44956a = r2     // Catch:{ b9 -> 0x0011 }
            com.google.android.gms.internal.measurement.r7 r0 = com.google.android.gms.internal.measurement.C9329r7.f45419c     // Catch:{ b9 -> 0x0011 }
            r1.f44957b = r0     // Catch:{ b9 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f44956a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.r7 r2 = com.google.android.gms.internal.measurement.C9329r7.f45419c     // Catch:{ all -> 0x001b }
            r1.f44957b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9117d9.mo37505c(com.google.android.gms.internal.measurement.w9):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9117d9)) {
            return false;
        }
        C9117d9 d9Var = (C9117d9) obj;
        C9409w9 w9Var = this.f44956a;
        C9409w9 w9Var2 = d9Var.f44956a;
        if (w9Var == null && w9Var2 == null) {
            return mo37504b().equals(d9Var.mo37504b());
        }
        if (w9Var != null && w9Var2 != null) {
            return w9Var.equals(w9Var2);
        }
        if (w9Var != null) {
            d9Var.mo37505c(w9Var.mo37835g());
            return w9Var.equals(d9Var.f44956a);
        }
        mo37505c(w9Var2.mo37835g());
        return this.f44956a.equals(w9Var2);
    }

    public int hashCode() {
        return 1;
    }
}
