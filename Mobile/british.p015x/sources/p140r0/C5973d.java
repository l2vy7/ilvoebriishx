package p140r0;

import p140r0.C5953b;

/* renamed from: r0.d */
/* compiled from: SpringAnimation */
public final class C5973d extends C5953b<C5973d> {

    /* renamed from: A */
    private C5974e f24909A = null;

    /* renamed from: B */
    private float f24910B = Float.MAX_VALUE;

    /* renamed from: C */
    private boolean f24911C = false;

    public <K> C5973d(K k, C5972c<K> cVar) {
        super(k, cVar);
    }

    /* renamed from: o */
    private void m26324o() {
        C5974e eVar = this.f24909A;
        if (eVar != null) {
            double a = (double) eVar.mo23028a();
            if (a > ((double) this.f24900g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a < ((double) this.f24901h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: j */
    public void mo22991j() {
        m26324o();
        this.f24909A.mo23033g((double) mo22987e());
        super.mo22991j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo22992l(long j) {
        if (this.f24911C) {
            float f = this.f24910B;
            if (f != Float.MAX_VALUE) {
                this.f24909A.mo23031e(f);
                this.f24910B = Float.MAX_VALUE;
            }
            this.f24895b = this.f24909A.mo23028a();
            this.f24894a = 0.0f;
            this.f24911C = false;
            return true;
        }
        if (this.f24910B != Float.MAX_VALUE) {
            this.f24909A.mo23028a();
            long j2 = j / 2;
            C5953b.C5968o h = this.f24909A.mo23034h((double) this.f24895b, (double) this.f24894a, j2);
            this.f24909A.mo23031e(this.f24910B);
            this.f24910B = Float.MAX_VALUE;
            C5953b.C5968o h2 = this.f24909A.mo23034h((double) h.f24906a, (double) h.f24907b, j2);
            this.f24895b = h2.f24906a;
            this.f24894a = h2.f24907b;
        } else {
            C5953b.C5968o h3 = this.f24909A.mo23034h((double) this.f24895b, (double) this.f24894a, j);
            this.f24895b = h3.f24906a;
            this.f24894a = h3.f24907b;
        }
        float max = Math.max(this.f24895b, this.f24901h);
        this.f24895b = max;
        float min = Math.min(max, this.f24900g);
        this.f24895b = min;
        if (!mo23026n(min, this.f24894a)) {
            return false;
        }
        this.f24895b = this.f24909A.mo23028a();
        this.f24894a = 0.0f;
        return true;
    }

    /* renamed from: m */
    public void mo23025m(float f) {
        if (mo22988f()) {
            this.f24910B = f;
            return;
        }
        if (this.f24909A == null) {
            this.f24909A = new C5974e(f);
        }
        this.f24909A.mo23031e(f);
        mo22991j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo23026n(float f, float f2) {
        return this.f24909A.mo23029c(f, f2);
    }

    /* renamed from: p */
    public C5973d mo23027p(C5974e eVar) {
        this.f24909A = eVar;
        return this;
    }
}
