package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.blq */
/* compiled from: IMASDK */
final class blq<T> implements bly<T> {

    /* renamed from: a */
    private final bln f16657a;

    /* renamed from: b */
    private final bmm<?, ?> f16658b;

    /* renamed from: c */
    private final boolean f16659c;

    /* renamed from: d */
    private final bmw f16660d;

    private blq(bmm bmm, bmw bmw, bln bln, byte[] bArr, byte[] bArr2) {
        this.f16658b = bmm;
        this.f16659c = bmw.m16763l(bln);
        this.f16660d = bmw;
        this.f16657a = bln;
    }

    /* renamed from: h */
    static <T> blq<T> m16485h(bmm<?, ?> bmm, bmw bmw, bln bln) {
        return new blq(bmm, bmw, bln, (byte[]) null, (byte[]) null);
    }

    /* renamed from: a */
    public final T mo15447a() {
        return this.f16657a.mo15170aU().mo15386af();
    }

    /* renamed from: b */
    public final boolean mo15448b(T t, T t2) {
        if (!this.f16658b.mo15505e(t).equals(this.f16658b.mo15505e(t2))) {
            return false;
        }
        if (!this.f16659c) {
            return true;
        }
        bmw.m16761j(t);
        bmw.m16761j(t2);
        throw null;
    }

    /* renamed from: c */
    public final int mo15449c(T t) {
        int hashCode = this.f16658b.mo15505e(t).hashCode();
        if (!this.f16659c) {
            return hashCode;
        }
        bmw.m16761j(t);
        throw null;
    }

    /* renamed from: d */
    public final void mo15450d(T t, T t2) {
        bma.m16584M(this.f16658b, t, t2);
        if (this.f16659c) {
            bma.m16599aa(this.f16660d, t2);
        }
    }

    /* renamed from: e */
    public final int mo15451e(T t) {
        int n = ((bmn) this.f16658b.mo15505e(t)).mo15510f();
        if (!this.f16659c) {
            return n;
        }
        bmw.m16761j(t);
        throw null;
    }

    /* renamed from: f */
    public final void mo15452f(T t, bne bne) throws IOException {
        bmw.m16761j(t);
        throw null;
    }

    /* renamed from: g */
    public final void mo15453g(T t, blx blx, bka bka) throws IOException {
        boolean z;
        bmm<?, ?> bmm = this.f16658b;
        Object d = bmm.mo15504d(t);
        bmw.m16762k(t);
        while (blx.mo15269b() != Integer.MAX_VALUE) {
            int c = blx.mo15270c();
            if (c != bnd.f16753a) {
                if (bnd.m16787a(c) == 2) {
                    Object i = bmw.m16760i(bka, this.f16657a, bnd.m16788b(c));
                    if (i != null) {
                        bmw.m16765n(i);
                    } else {
                        z = bmm.mo15501a(d, blx);
                    }
                } else {
                    z = blx.mo15271d();
                }
                if (!z) {
                    bmm.mo15503c(t, d);
                    return;
                }
            } else {
                int i2 = 0;
                Object obj = null;
                bjq bjq = null;
                while (true) {
                    try {
                        if (blx.mo15269b() == Integer.MAX_VALUE) {
                            break;
                        }
                        int c2 = blx.mo15270c();
                        if (c2 == bnd.f16755c) {
                            i2 = blx.mo15285r();
                            obj = bmw.m16760i(bka, this.f16657a, i2);
                        } else if (c2 == bnd.f16756d) {
                            if (obj != null) {
                                bmw.m16765n(obj);
                            } else {
                                bjq = blx.mo15284q();
                            }
                        } else if (!blx.mo15271d()) {
                            break;
                        }
                    } catch (Throwable th) {
                        bmm.mo15503c(t, d);
                        throw th;
                    }
                }
                if (blx.mo15270c() != bnd.f16754b) {
                    throw bkt.m16352e();
                } else if (bjq != null) {
                    if (obj != null) {
                        bmw.m16766o(obj);
                    } else {
                        ((bmn) d).mo15514i(bnd.m16789c(i2, 2), bjq);
                    }
                }
            }
        }
        bmm.mo15503c(t, d);
    }

    /* renamed from: j */
    public final void mo15455j(T t, byte[] bArr, int i, int i2, bjg bjg) throws IOException {
        bkl bkl = (bkl) t;
        if (bkl.f16594c == bmn.m16671a()) {
            bkl.f16594c = bmn.m16672b();
        }
        bkk bkk = (bkk) t;
        throw null;
    }

    /* renamed from: k */
    public final void mo15456k(T t) {
        this.f16658b.mo15502b(t);
        this.f16660d.mo15550h(t);
    }

    /* renamed from: l */
    public final boolean mo15457l(T t) {
        bmw.m16761j(t);
        throw null;
    }
}
