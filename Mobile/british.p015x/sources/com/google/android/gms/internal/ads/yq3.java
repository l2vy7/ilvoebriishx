package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yq3<T> implements or3<T> {

    /* renamed from: a */
    private final uq3 f41969a;

    /* renamed from: b */
    private final gs3<?, ?> f41970b;

    /* renamed from: c */
    private final boolean f41971c;

    /* renamed from: d */
    private final xo3<?> f41972d;

    private yq3(gs3<?, ?> gs3, xo3<?> xo3, uq3 uq3) {
        this.f41970b = gs3;
        this.f41971c = xo3.mo35782h(uq3);
        this.f41972d = xo3;
        this.f41969a = uq3;
    }

    /* renamed from: b */
    static <T> yq3<T> m39988b(gs3<?, ?> gs3, xo3<?> xo3, uq3 uq3) {
        return new yq3<>(gs3, xo3, uq3);
    }

    /* renamed from: a */
    public final void mo33996a(T t) {
        this.f41970b.mo32277m(t);
        this.f41972d.mo35779e(t);
    }

    /* renamed from: c */
    public final boolean mo33997c(T t) {
        this.f41972d.mo35775a(t);
        throw null;
    }

    /* renamed from: d */
    public final void mo33998d(T t, T t2) {
        qr3.m36647f(this.f41970b, t, t2);
        if (this.f41971c) {
            qr3.m36646e(this.f41972d, t, t2);
        }
    }

    /* renamed from: e */
    public final void mo33999e(T t, gr3 gr3, wo3 wo3) throws IOException {
        boolean z;
        gs3<?, ?> gs3 = this.f41970b;
        xo3<?> xo3 = this.f41972d;
        Object c = gs3.mo32267c(t);
        cp3<?> b = xo3.mo35776b(t);
        while (gr3.zzc() != Integer.MAX_VALUE) {
            int zzd = gr3.zzd();
            if (zzd != 11) {
                if ((zzd & 7) == 2) {
                    Object c2 = xo3.mo35777c(wo3, this.f41969a, zzd >>> 3);
                    if (c2 != null) {
                        xo3.mo35780f(gr3, c2, wo3, b);
                    } else {
                        z = gs3.mo32280p(c, gr3);
                    }
                } else {
                    z = gr3.mo32232i();
                }
                if (!z) {
                    gs3.mo32278n(t, c);
                    return;
                }
            } else {
                int i = 0;
                Object obj = null;
                eo3 eo3 = null;
                while (true) {
                    try {
                        if (gr3.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd2 = gr3.zzd();
                        if (zzd2 == 16) {
                            i = gr3.zzj();
                            obj = xo3.mo35777c(wo3, this.f41969a, i);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                xo3.mo35780f(gr3, obj, wo3, b);
                            } else {
                                eo3 = gr3.zzp();
                            }
                        } else if (!gr3.mo32232i()) {
                            break;
                        }
                    } catch (Throwable th) {
                        gs3.mo32278n(t, c);
                        throw th;
                    }
                }
                if (gr3.zzd() != 12) {
                    throw wp3.m39223b();
                } else if (eo3 != null) {
                    if (obj != null) {
                        xo3.mo35781g(eo3, obj, wo3, b);
                    } else {
                        gs3.mo32275k(c, i, eo3);
                    }
                }
            }
        }
        gs3.mo32278n(t, c);
    }

    /* renamed from: f */
    public final void mo34000f(T t, so3 so3) throws IOException {
        this.f41972d.mo35775a(t);
        throw null;
    }

    /* renamed from: g */
    public final void mo34001g(T t, byte[] bArr, int i, int i2, on3 on3) throws IOException {
        kp3 kp3 = (kp3) t;
        if (kp3.zzc == hs3.m32931c()) {
            kp3.zzc = hs3.m32933e();
        }
        ip3 ip3 = (ip3) t;
        throw null;
    }

    /* renamed from: h */
    public final boolean mo34002h(T t, T t2) {
        if (!this.f41970b.mo32268d(t).equals(this.f41970b.mo32268d(t2))) {
            return false;
        }
        if (!this.f41971c) {
            return true;
        }
        this.f41972d.mo35775a(t);
        this.f41972d.mo35775a(t2);
        throw null;
    }

    public final int zza(T t) {
        gs3<?, ?> gs3 = this.f41970b;
        int b = gs3.mo32266b(gs3.mo32268d(t));
        if (!this.f41971c) {
            return b;
        }
        this.f41972d.mo35775a(t);
        throw null;
    }

    public final int zzb(T t) {
        int hashCode = this.f41970b.mo32268d(t).hashCode();
        if (!this.f41971c) {
            return hashCode;
        }
        this.f41972d.mo35775a(t);
        throw null;
    }

    public final T zze() {
        return this.f41969a.mo33141h().mo32426v();
    }
}
