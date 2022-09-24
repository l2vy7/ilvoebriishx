package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alg */
/* compiled from: IMASDK */
final class alg<T> {

    /* renamed from: a */
    public final T f15196a;

    /* renamed from: b */
    private aky f15197b = new aky();

    /* renamed from: c */
    private boolean f15198c;

    /* renamed from: d */
    private boolean f15199d;

    public alg(T t) {
        this.f15196a = t;
    }

    /* renamed from: a */
    public final void mo13895a(alf<T> alf) {
        this.f15199d = true;
        if (this.f15198c) {
            alf.mo13894a(this.f15196a, this.f15197b.mo13868a());
        }
    }

    /* renamed from: b */
    public final void mo13896b(int i, ale<T> ale) {
        if (!this.f15199d) {
            if (i != -1) {
                this.f15197b.mo13869b(i);
            }
            this.f15198c = true;
            ale.mo13893a(this.f15196a);
        }
    }

    /* renamed from: c */
    public final void mo13897c(alf<T> alf) {
        if (!this.f15199d && this.f15198c) {
            akz a = this.f15197b.mo13868a();
            this.f15197b = new aky();
            this.f15198c = false;
            alf.mo13894a(this.f15196a, a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || alg.class != obj.getClass()) {
            return false;
        }
        return this.f15196a.equals(((alg) obj).f15196a);
    }

    public final int hashCode() {
        return this.f15196a.hashCode();
    }
}
