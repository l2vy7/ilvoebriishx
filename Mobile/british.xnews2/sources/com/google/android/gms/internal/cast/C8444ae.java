package com.google.android.gms.internal.cast;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.cast.ae */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8444ae<T> implements C8561he<T> {

    /* renamed from: a */
    private final C8782vd f43269a;

    /* renamed from: b */
    private final C8783ve<?, ?> f43270b;

    /* renamed from: c */
    private final boolean f43271c;

    /* renamed from: d */
    private final C8559hc<?> f43272d;

    private C8444ae(C8783ve<?, ?> veVar, C8559hc<?> hcVar, C8782vd vdVar) {
        this.f43270b = veVar;
        this.f43271c = hcVar.mo36548a(vdVar);
        this.f43272d = hcVar;
        this.f43269a = vdVar;
    }

    /* renamed from: g */
    static <T> C8444ae<T> m40698g(C8783ve<?, ?> veVar, C8559hc<?> hcVar, C8782vd vdVar) {
        return new C8444ae<>(veVar, hcVar, vdVar);
    }

    /* renamed from: a */
    public final boolean mo36370a(T t) {
        this.f43272d.mo36549b(t);
        throw null;
    }

    /* renamed from: b */
    public final void mo36371b(T t, T t2) {
        C8594je.m41065f(this.f43270b, t, t2);
        if (this.f43271c) {
            C8594je.m41064e(this.f43272d, t, t2);
        }
    }

    /* renamed from: c */
    public final int mo36372c(T t) {
        C8783ve<?, ?> veVar = this.f43270b;
        int e = veVar.mo36751e(veVar.mo36748b(t));
        if (!this.f43271c) {
            return e;
        }
        this.f43272d.mo36549b(t);
        throw null;
    }

    /* renamed from: d */
    public final void mo36373d(T t) {
        this.f43270b.mo36749c(t);
        this.f43272d.mo36550c(t);
    }

    /* renamed from: e */
    public final void mo36374e(T t, C8526fc fcVar) throws IOException {
        this.f43272d.mo36549b(t);
        throw null;
    }

    /* renamed from: f */
    public final boolean mo36375f(T t, T t2) {
        if (!this.f43270b.mo36748b(t).equals(this.f43270b.mo36748b(t2))) {
            return false;
        }
        if (!this.f43271c) {
            return true;
        }
        this.f43272d.mo36549b(t);
        this.f43272d.mo36549b(t2);
        throw null;
    }

    public final int zzb(T t) {
        int hashCode = this.f43270b.mo36748b(t).hashCode();
        if (!this.f43271c) {
            return hashCode;
        }
        this.f43272d.mo36549b(t);
        throw null;
    }
}
