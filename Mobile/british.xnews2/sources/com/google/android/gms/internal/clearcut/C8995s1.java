package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.s1 */
public class C8995s1 {

    /* renamed from: d */
    private static final C8987r0 f44735d = C8987r0.m42317b();

    /* renamed from: a */
    private C8847a0 f44736a;

    /* renamed from: b */
    private volatile C8942l2 f44737b;

    /* renamed from: c */
    private volatile C8847a0 f44738c;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.clearcut.C8942l2 m42332b(com.google.android.gms.internal.clearcut.C8942l2 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.clearcut.l2 r0 = r1.f44737b
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.clearcut.l2 r0 = r1.f44737b     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f44737b = r2     // Catch:{ l1 -> 0x0012 }
            com.google.android.gms.internal.clearcut.a0 r0 = com.google.android.gms.internal.clearcut.C8847a0.f44287c     // Catch:{ l1 -> 0x0012 }
            r1.f44738c = r0     // Catch:{ l1 -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f44737b = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.clearcut.a0 r2 = com.google.android.gms.internal.clearcut.C8847a0.f44287c     // Catch:{ all -> 0x0019 }
            r1.f44738c = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.clearcut.l2 r2 = r1.f44737b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8995s1.m42332b(com.google.android.gms.internal.clearcut.l2):com.google.android.gms.internal.clearcut.l2");
    }

    /* renamed from: a */
    public final int mo37144a() {
        if (this.f44738c != null) {
            return this.f44738c.size();
        }
        if (this.f44737b != null) {
            return this.f44737b.mo36891a();
        }
        return 0;
    }

    /* renamed from: c */
    public final C8942l2 mo37145c(C8942l2 l2Var) {
        C8942l2 l2Var2 = this.f44737b;
        this.f44736a = null;
        this.f44738c = null;
        this.f44737b = l2Var;
        return l2Var2;
    }

    /* renamed from: d */
    public final C8847a0 mo37146d() {
        if (this.f44738c != null) {
            return this.f44738c;
        }
        synchronized (this) {
            if (this.f44738c != null) {
                C8847a0 a0Var = this.f44738c;
                return a0Var;
            }
            this.f44738c = this.f44737b == null ? C8847a0.f44287c : this.f44737b.zzr();
            C8847a0 a0Var2 = this.f44738c;
            return a0Var2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8995s1)) {
            return false;
        }
        C8995s1 s1Var = (C8995s1) obj;
        C8942l2 l2Var = this.f44737b;
        C8942l2 l2Var2 = s1Var.f44737b;
        return (l2Var == null && l2Var2 == null) ? mo37146d().equals(s1Var.mo37146d()) : (l2Var == null || l2Var2 == null) ? l2Var != null ? l2Var.equals(s1Var.m42332b(l2Var.mo36897g())) : m42332b(l2Var2.mo36897g()).equals(l2Var2) : l2Var.equals(l2Var2);
    }

    public int hashCode() {
        return 1;
    }
}
