package p171x;

import p171x.C6323f;

/* renamed from: x.g */
/* compiled from: DimensionDependency */
class C6325g extends C6323f {

    /* renamed from: m */
    public int f26123m;

    public C6325g(C6333m mVar) {
        super(mVar);
        if (mVar instanceof C6328j) {
            this.f26106e = C6323f.C6324a.HORIZONTAL_DIMENSION;
        } else {
            this.f26106e = C6323f.C6324a.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: d */
    public void mo24099d(int i) {
        if (!this.f26111j) {
            this.f26111j = true;
            this.f26108g = i;
            for (C6321d next : this.f26112k) {
                next.mo24081a(next);
            }
        }
    }
}
