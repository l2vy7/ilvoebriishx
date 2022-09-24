package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bju */
/* compiled from: IMASDK */
final class bju implements blx {

    /* renamed from: a */
    private final bjs f16496a;

    /* renamed from: b */
    private int f16497b;

    /* renamed from: c */
    private int f16498c;

    /* renamed from: d */
    private int f16499d = 0;

    private bju(bjs bjs) {
        bkr.m16347j(bjs, "input");
        this.f16496a = bjs;
        bjs.f16486c = this;
    }

    /* renamed from: S */
    private final void m16123S(int i) throws IOException {
        if (bnd.m16787a(this.f16497b) != i) {
            throw bkt.m16353f();
        }
    }

    /* renamed from: T */
    private final <T> T m16124T(bly<T> bly, bka bka) throws IOException {
        int r = this.f16496a.mo15242r();
        bjs bjs = this.f16496a;
        if (bjs.f16484a < bjs.f16485b) {
            int C = bjs.mo15222C(r);
            T a = bly.mo15447a();
            this.f16496a.f16484a++;
            bly.mo15453g(a, this, bka);
            bly.mo15456k(a);
            this.f16496a.mo15229e(0);
            bjs bjs2 = this.f16496a;
            bjs2.f16484a--;
            bjs2.mo15223D(C);
            return a;
        }
        throw new bkt("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: U */
    private final <T> T m16125U(bly<T> bly, bka bka) throws IOException {
        int i = this.f16498c;
        this.f16498c = bnd.m16789c(bnd.m16788b(this.f16497b), 4);
        try {
            T a = bly.mo15447a();
            bly.mo15453g(a, this, bka);
            bly.mo15456k(a);
            if (this.f16497b == this.f16498c) {
                return a;
            }
            throw bkt.m16354g();
        } finally {
            this.f16498c = i;
        }
    }

    /* renamed from: V */
    private final void m16126V(int i) throws IOException {
        if (this.f16496a.mo15225F() != i) {
            throw bkt.m16348a();
        }
    }

    /* renamed from: W */
    private static final void m16127W(int i) throws IOException {
        if ((i & 3) != 0) {
            throw bkt.m16354g();
        }
    }

    /* renamed from: X */
    private static final void m16128X(int i) throws IOException {
        if ((i & 7) != 0) {
            throw bkt.m16354g();
        }
    }

    /* renamed from: a */
    public static bju m16129a(bjs bjs) {
        bju bju = bjs.f16486c;
        return bju != null ? bju : new bju(bjs);
    }

    /* renamed from: A */
    public final void mo15251A(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof blc) {
            blc blc = (blc) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 0) {
                do {
                    blc.mo15425f(this.f16496a.mo15234j());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int F = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    blc.mo15425f(this.f16496a.mo15234j());
                } while (this.f16496a.mo15225F() < F);
                m16126V(F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 0) {
                do {
                    list.add(Long.valueOf(this.f16496a.mo15234j()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int F2 = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    list.add(Long.valueOf(this.f16496a.mo15234j()));
                } while (this.f16496a.mo15225F() < F2);
                m16126V(F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: B */
    public final void mo15252B(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 0) {
                do {
                    bkm.mo15399g(this.f16496a.mo15235k());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int F = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    bkm.mo15399g(this.f16496a.mo15235k());
                } while (this.f16496a.mo15225F() < F);
                m16126V(F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15235k()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int F2 = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15235k()));
                } while (this.f16496a.mo15225F() < F2);
                m16126V(F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: C */
    public final void mo15253C(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof blc) {
            blc blc = (blc) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 1) {
                do {
                    blc.mo15425f(this.f16496a.mo15236l());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int r = this.f16496a.mo15242r();
                m16128X(r);
                int F = this.f16496a.mo15225F() + r;
                do {
                    blc.mo15425f(this.f16496a.mo15236l());
                } while (this.f16496a.mo15225F() < F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 1) {
                do {
                    list.add(Long.valueOf(this.f16496a.mo15236l()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int r2 = this.f16496a.mo15242r();
                m16128X(r2);
                int F2 = this.f16496a.mo15225F() + r2;
                do {
                    list.add(Long.valueOf(this.f16496a.mo15236l()));
                } while (this.f16496a.mo15225F() < F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: D */
    public final void mo15254D(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 2) {
                int r = this.f16496a.mo15242r();
                m16127W(r);
                int F = this.f16496a.mo15225F() + r;
                do {
                    bkm.mo15399g(this.f16496a.mo15237m());
                } while (this.f16496a.mo15225F() < F);
            } else if (a == 5) {
                do {
                    bkm.mo15399g(this.f16496a.mo15237m());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 2) {
                int r2 = this.f16496a.mo15242r();
                m16127W(r2);
                int F2 = this.f16496a.mo15225F() + r2;
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15237m()));
                } while (this.f16496a.mo15225F() < F2);
            } else if (a2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15237m()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: E */
    public final void mo15255E(List<Boolean> list) throws IOException {
        int d;
        int d2;
        if (list instanceof bji) {
            bji bji = (bji) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 0) {
                do {
                    bji.mo15189d(this.f16496a.mo15238n());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int F = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    bji.mo15189d(this.f16496a.mo15238n());
                } while (this.f16496a.mo15225F() < F);
                m16126V(F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f16496a.mo15238n()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int F2 = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    list.add(Boolean.valueOf(this.f16496a.mo15238n()));
                } while (this.f16496a.mo15225F() < F2);
                m16126V(F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: F */
    public final void mo15256F(List<String> list) throws IOException {
        mo15258H(list, false);
    }

    /* renamed from: G */
    public final void mo15257G(List<String> list) throws IOException {
        mo15258H(list, true);
    }

    /* renamed from: H */
    public final void mo15258H(List<String> list, boolean z) throws IOException {
        int d;
        int d2;
        if (bnd.m16787a(this.f16497b) != 2) {
            throw bkt.m16353f();
        } else if ((list instanceof bky) && !z) {
            bky bky = (bky) list;
            do {
                bky.mo15413f(mo15284q());
                if (!this.f16496a.mo15224E()) {
                    d2 = this.f16496a.mo15228d();
                } else {
                    return;
                }
            } while (d2 == this.f16497b);
            this.f16499d = d2;
        } else {
            do {
                list.add(z ? mo15281n() : mo15280m());
                if (!this.f16496a.mo15224E()) {
                    d = this.f16496a.mo15228d();
                } else {
                    return;
                }
            } while (d == this.f16497b);
            this.f16499d = d;
        }
    }

    /* renamed from: I */
    public final <T> void mo15259I(List<T> list, bly<T> bly, bka bka) throws IOException {
        int d;
        if (bnd.m16787a(this.f16497b) == 2) {
            int i = this.f16497b;
            do {
                list.add(m16124T(bly, bka));
                if (!this.f16496a.mo15224E() && this.f16499d == 0) {
                    d = this.f16496a.mo15228d();
                } else {
                    return;
                }
            } while (d == i);
            this.f16499d = d;
            return;
        }
        throw bkt.m16353f();
    }

    /* renamed from: J */
    public final <T> void mo15260J(List<T> list, bly<T> bly, bka bka) throws IOException {
        int d;
        if (bnd.m16787a(this.f16497b) == 3) {
            int i = this.f16497b;
            do {
                list.add(m16125U(bly, bka));
                if (!this.f16496a.mo15224E() && this.f16499d == 0) {
                    d = this.f16496a.mo15228d();
                } else {
                    return;
                }
            } while (d == i);
            this.f16499d = d;
            return;
        }
        throw bkt.m16353f();
    }

    /* renamed from: K */
    public final void mo15261K(List<bjq> list) throws IOException {
        int d;
        if (bnd.m16787a(this.f16497b) == 2) {
            do {
                list.add(mo15284q());
                if (!this.f16496a.mo15224E()) {
                    d = this.f16496a.mo15228d();
                } else {
                    return;
                }
            } while (d == this.f16497b);
            this.f16499d = d;
            return;
        }
        throw bkt.m16353f();
    }

    /* renamed from: L */
    public final void mo15262L(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 0) {
                do {
                    bkm.mo15399g(this.f16496a.mo15242r());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int F = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    bkm.mo15399g(this.f16496a.mo15242r());
                } while (this.f16496a.mo15225F() < F);
                m16126V(F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15242r()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int F2 = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15242r()));
                } while (this.f16496a.mo15225F() < F2);
                m16126V(F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: M */
    public final void mo15263M(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 0) {
                do {
                    bkm.mo15399g(this.f16496a.mo15243s());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int F = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    bkm.mo15399g(this.f16496a.mo15243s());
                } while (this.f16496a.mo15225F() < F);
                m16126V(F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15243s()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int F2 = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15243s()));
                } while (this.f16496a.mo15225F() < F2);
                m16126V(F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: N */
    public final void mo15264N(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 2) {
                int r = this.f16496a.mo15242r();
                m16127W(r);
                int F = this.f16496a.mo15225F() + r;
                do {
                    bkm.mo15399g(this.f16496a.mo15244t());
                } while (this.f16496a.mo15225F() < F);
            } else if (a == 5) {
                do {
                    bkm.mo15399g(this.f16496a.mo15244t());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 2) {
                int r2 = this.f16496a.mo15242r();
                m16127W(r2);
                int F2 = this.f16496a.mo15225F() + r2;
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15244t()));
                } while (this.f16496a.mo15225F() < F2);
            } else if (a2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15244t()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: O */
    public final void mo15265O(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof blc) {
            blc blc = (blc) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 1) {
                do {
                    blc.mo15425f(this.f16496a.mo15245u());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int r = this.f16496a.mo15242r();
                m16128X(r);
                int F = this.f16496a.mo15225F() + r;
                do {
                    blc.mo15425f(this.f16496a.mo15245u());
                } while (this.f16496a.mo15225F() < F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 1) {
                do {
                    list.add(Long.valueOf(this.f16496a.mo15245u()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int r2 = this.f16496a.mo15242r();
                m16128X(r2);
                int F2 = this.f16496a.mo15225F() + r2;
                do {
                    list.add(Long.valueOf(this.f16496a.mo15245u()));
                } while (this.f16496a.mo15225F() < F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: P */
    public final void mo15266P(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 0) {
                do {
                    bkm.mo15399g(this.f16496a.mo15246v());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int F = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    bkm.mo15399g(this.f16496a.mo15246v());
                } while (this.f16496a.mo15225F() < F);
                m16126V(F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15246v()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int F2 = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    list.add(Integer.valueOf(this.f16496a.mo15246v()));
                } while (this.f16496a.mo15225F() < F2);
                m16126V(F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: Q */
    public final void mo15267Q(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof blc) {
            blc blc = (blc) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 0) {
                do {
                    blc.mo15425f(this.f16496a.mo15247w());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int F = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    blc.mo15425f(this.f16496a.mo15247w());
                } while (this.f16496a.mo15225F() < F);
                m16126V(F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 0) {
                do {
                    list.add(Long.valueOf(this.f16496a.mo15247w()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int F2 = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    list.add(Long.valueOf(this.f16496a.mo15247w()));
                } while (this.f16496a.mo15225F() < F2);
                m16126V(F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (mo15271d() != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        throw new com.google.ads.interactivemedia.p038v3.internal.bkt("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003d */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo15268R(java.util.Map<K, V> r6, com.google.ads.interactivemedia.p038v3.internal.blg<K, V> r7) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.m16123S(r0)
            com.google.ads.interactivemedia.v3.internal.bjs r1 = r5.f16496a
            int r1 = r1.mo15242r()
            com.google.ads.interactivemedia.v3.internal.bjs r2 = r5.f16496a
            int r1 = r2.mo15222C(r1)
            K r7 = r7.f16631b
        L_0x0012:
            int r7 = r5.mo15269b()     // Catch:{ all -> 0x0053 }
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r7 == r2) goto L_0x004a
            com.google.ads.interactivemedia.v3.internal.bjs r2 = r5.f16496a     // Catch:{ all -> 0x0053 }
            boolean r2 = r2.mo15224E()     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0025
            goto L_0x004a
        L_0x0025:
            r2 = 1
            java.lang.String r4 = "Unable to parse map entry."
            if (r7 == r2) goto L_0x003a
            if (r7 == r0) goto L_0x0039
            boolean r7 = r5.mo15271d()     // Catch:{ bks -> 0x003d }
            if (r7 == 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            com.google.ads.interactivemedia.v3.internal.bkt r7 = new com.google.ads.interactivemedia.v3.internal.bkt     // Catch:{ bks -> 0x003d }
            r7.<init>((java.lang.String) r4)     // Catch:{ bks -> 0x003d }
            throw r7     // Catch:{ bks -> 0x003d }
        L_0x0039:
            throw r3     // Catch:{ bks -> 0x003d }
        L_0x003a:
            int r7 = com.google.ads.interactivemedia.p038v3.internal.bjt.f16495b     // Catch:{ bks -> 0x003d }
            throw r3     // Catch:{ bks -> 0x003d }
        L_0x003d:
            boolean r7 = r5.mo15271d()     // Catch:{ all -> 0x0053 }
            if (r7 == 0) goto L_0x0044
            goto L_0x0012
        L_0x0044:
            com.google.ads.interactivemedia.v3.internal.bkt r6 = new com.google.ads.interactivemedia.v3.internal.bkt     // Catch:{ all -> 0x0053 }
            r6.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0053 }
            throw r6     // Catch:{ all -> 0x0053 }
        L_0x004a:
            r6.put(r3, r3)     // Catch:{ all -> 0x0053 }
            com.google.ads.interactivemedia.v3.internal.bjs r6 = r5.f16496a
            r6.mo15223D(r1)
            return
        L_0x0053:
            r6 = move-exception
            com.google.ads.interactivemedia.v3.internal.bjs r7 = r5.f16496a
            r7.mo15223D(r1)
            goto L_0x005b
        L_0x005a:
            throw r6
        L_0x005b:
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.bju.mo15268R(java.util.Map, com.google.ads.interactivemedia.v3.internal.blg):void");
    }

    /* renamed from: b */
    public final int mo15269b() throws IOException {
        int i = this.f16499d;
        if (i != 0) {
            this.f16497b = i;
            this.f16499d = 0;
        } else {
            i = this.f16496a.mo15228d();
            this.f16497b = i;
        }
        if (i == 0 || i == this.f16498c) {
            return Integer.MAX_VALUE;
        }
        return bnd.m16788b(i);
    }

    /* renamed from: c */
    public final int mo15270c() {
        return this.f16497b;
    }

    /* renamed from: d */
    public final boolean mo15271d() throws IOException {
        int i;
        if (this.f16496a.mo15224E() || (i = this.f16497b) == this.f16498c) {
            return false;
        }
        return this.f16496a.mo15230f(i);
    }

    /* renamed from: e */
    public final double mo15272e() throws IOException {
        m16123S(1);
        return this.f16496a.mo15231g();
    }

    /* renamed from: f */
    public final float mo15273f() throws IOException {
        m16123S(5);
        return this.f16496a.mo15232h();
    }

    /* renamed from: g */
    public final long mo15274g() throws IOException {
        m16123S(0);
        return this.f16496a.mo15233i();
    }

    /* renamed from: h */
    public final long mo15275h() throws IOException {
        m16123S(0);
        return this.f16496a.mo15234j();
    }

    /* renamed from: i */
    public final int mo15276i() throws IOException {
        m16123S(0);
        return this.f16496a.mo15235k();
    }

    /* renamed from: j */
    public final long mo15277j() throws IOException {
        m16123S(1);
        return this.f16496a.mo15236l();
    }

    /* renamed from: k */
    public final int mo15278k() throws IOException {
        m16123S(5);
        return this.f16496a.mo15237m();
    }

    /* renamed from: l */
    public final boolean mo15279l() throws IOException {
        m16123S(0);
        return this.f16496a.mo15238n();
    }

    /* renamed from: m */
    public final String mo15280m() throws IOException {
        m16123S(2);
        return this.f16496a.mo15239o();
    }

    /* renamed from: n */
    public final String mo15281n() throws IOException {
        m16123S(2);
        return this.f16496a.mo15240p();
    }

    /* renamed from: o */
    public final <T> T mo15282o(bly<T> bly, bka bka) throws IOException {
        m16123S(2);
        return m16124T(bly, bka);
    }

    /* renamed from: p */
    public final <T> T mo15283p(bly<T> bly, bka bka) throws IOException {
        m16123S(3);
        return m16125U(bly, bka);
    }

    /* renamed from: q */
    public final bjq mo15284q() throws IOException {
        m16123S(2);
        return this.f16496a.mo15241q();
    }

    /* renamed from: r */
    public final int mo15285r() throws IOException {
        m16123S(0);
        return this.f16496a.mo15242r();
    }

    /* renamed from: s */
    public final int mo15286s() throws IOException {
        m16123S(0);
        return this.f16496a.mo15243s();
    }

    /* renamed from: t */
    public final int mo15287t() throws IOException {
        m16123S(5);
        return this.f16496a.mo15244t();
    }

    /* renamed from: u */
    public final long mo15288u() throws IOException {
        m16123S(1);
        return this.f16496a.mo15245u();
    }

    /* renamed from: v */
    public final int mo15289v() throws IOException {
        m16123S(0);
        return this.f16496a.mo15246v();
    }

    /* renamed from: w */
    public final long mo15290w() throws IOException {
        m16123S(0);
        return this.f16496a.mo15247w();
    }

    /* renamed from: x */
    public final void mo15291x(List<Double> list) throws IOException {
        int d;
        int d2;
        if (list instanceof bjy) {
            bjy bjy = (bjy) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 1) {
                do {
                    bjy.mo15359d(this.f16496a.mo15231g());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int r = this.f16496a.mo15242r();
                m16128X(r);
                int F = this.f16496a.mo15225F() + r;
                do {
                    bjy.mo15359d(this.f16496a.mo15231g());
                } while (this.f16496a.mo15225F() < F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 1) {
                do {
                    list.add(Double.valueOf(this.f16496a.mo15231g()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int r2 = this.f16496a.mo15242r();
                m16128X(r2);
                int F2 = this.f16496a.mo15225F() + r2;
                do {
                    list.add(Double.valueOf(this.f16496a.mo15231g()));
                } while (this.f16496a.mo15225F() < F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: y */
    public final void mo15292y(List<Float> list) throws IOException {
        int d;
        int d2;
        if (list instanceof bkh) {
            bkh bkh = (bkh) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 2) {
                int r = this.f16496a.mo15242r();
                m16127W(r);
                int F = this.f16496a.mo15225F() + r;
                do {
                    bkh.mo15377d(this.f16496a.mo15232h());
                } while (this.f16496a.mo15225F() < F);
            } else if (a == 5) {
                do {
                    bkh.mo15377d(this.f16496a.mo15232h());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 2) {
                int r2 = this.f16496a.mo15242r();
                m16127W(r2);
                int F2 = this.f16496a.mo15225F() + r2;
                do {
                    list.add(Float.valueOf(this.f16496a.mo15232h()));
                } while (this.f16496a.mo15225F() < F2);
            } else if (a2 == 5) {
                do {
                    list.add(Float.valueOf(this.f16496a.mo15232h()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else {
                throw bkt.m16353f();
            }
        }
    }

    /* renamed from: z */
    public final void mo15293z(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof blc) {
            blc blc = (blc) list;
            int a = bnd.m16787a(this.f16497b);
            if (a == 0) {
                do {
                    blc.mo15425f(this.f16496a.mo15233i());
                    if (!this.f16496a.mo15224E()) {
                        d2 = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16497b);
                this.f16499d = d2;
            } else if (a == 2) {
                int F = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    blc.mo15425f(this.f16496a.mo15233i());
                } while (this.f16496a.mo15225F() < F);
                m16126V(F);
            } else {
                throw bkt.m16353f();
            }
        } else {
            int a2 = bnd.m16787a(this.f16497b);
            if (a2 == 0) {
                do {
                    list.add(Long.valueOf(this.f16496a.mo15233i()));
                    if (!this.f16496a.mo15224E()) {
                        d = this.f16496a.mo15228d();
                    } else {
                        return;
                    }
                } while (d == this.f16497b);
                this.f16499d = d;
            } else if (a2 == 2) {
                int F2 = this.f16496a.mo15225F() + this.f16496a.mo15242r();
                do {
                    list.add(Long.valueOf(this.f16496a.mo15233i()));
                } while (this.f16496a.mo15225F() < F2);
                m16126V(F2);
            } else {
                throw bkt.m16353f();
            }
        }
    }
}
