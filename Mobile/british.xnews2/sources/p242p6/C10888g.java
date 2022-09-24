package p242p6;

/* renamed from: p6.g */
/* compiled from: MarkerEdgeTreatment */
public final class C10888g extends C10887f {

    /* renamed from: a */
    private final float f49667a;

    public C10888g(float f) {
        this.f49667a = f - 0.001f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo43072a() {
        return true;
    }

    /* renamed from: b */
    public void mo39782b(float f, float f2, float f3, C10905o oVar) {
        double d = (double) this.f49667a;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float f4 = (float) ((d * sqrt) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f49667a, 2.0d) - Math.pow((double) f4, 2.0d));
        double d2 = (double) this.f49667a;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt3;
        double d4 = (double) this.f49667a;
        Double.isNaN(d4);
        oVar.mo43178n(f2 - f4, ((float) (-(d3 - d4))) + sqrt2);
        double d5 = (double) this.f49667a;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt4;
        double d7 = (double) this.f49667a;
        Double.isNaN(d7);
        oVar.mo43177m(f2, (float) (-(d6 - d7)));
        double d8 = (double) this.f49667a;
        double sqrt5 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt5;
        double d10 = (double) this.f49667a;
        Double.isNaN(d10);
        oVar.mo43177m(f2 + f4, ((float) (-(d9 - d10))) + sqrt2);
    }
}
