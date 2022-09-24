package p140r0;

import p140r0.C5953b;

/* renamed from: r0.e */
/* compiled from: SpringForce */
public final class C5974e {

    /* renamed from: a */
    double f24912a = Math.sqrt(1500.0d);

    /* renamed from: b */
    double f24913b = 0.5d;

    /* renamed from: c */
    private boolean f24914c = false;

    /* renamed from: d */
    private double f24915d;

    /* renamed from: e */
    private double f24916e;

    /* renamed from: f */
    private double f24917f;

    /* renamed from: g */
    private double f24918g;

    /* renamed from: h */
    private double f24919h;

    /* renamed from: i */
    private double f24920i = Double.MAX_VALUE;

    /* renamed from: j */
    private final C5953b.C5968o f24921j = new C5953b.C5968o();

    public C5974e() {
    }

    /* renamed from: b */
    private void m26330b() {
        if (!this.f24914c) {
            if (this.f24920i != Double.MAX_VALUE) {
                double d = this.f24913b;
                if (d > 1.0d) {
                    double d2 = this.f24912a;
                    this.f24917f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.f24913b;
                    double d4 = this.f24912a;
                    this.f24918g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.f24919h = this.f24912a * Math.sqrt(1.0d - (d * d));
                }
                this.f24914c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: a */
    public float mo23028a() {
        return (float) this.f24920i;
    }

    /* renamed from: c */
    public boolean mo23029c(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f24916e && ((double) Math.abs(f - mo23028a())) < this.f24915d;
    }

    /* renamed from: d */
    public C5974e mo23030d(float f) {
        if (f >= 0.0f) {
            this.f24913b = (double) f;
            this.f24914c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C5974e mo23031e(float f) {
        this.f24920i = (double) f;
        return this;
    }

    /* renamed from: f */
    public C5974e mo23032f(float f) {
        if (f > 0.0f) {
            this.f24912a = Math.sqrt((double) f);
            this.f24914c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo23033g(double d) {
        double abs = Math.abs(d);
        this.f24915d = abs;
        this.f24916e = abs * 62.5d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5953b.C5968o mo23034h(double d, double d2, long j) {
        double d3;
        double d4;
        m26330b();
        double d5 = (double) j;
        Double.isNaN(d5);
        double d6 = d5 / 1000.0d;
        double d7 = d - this.f24920i;
        double d8 = this.f24913b;
        if (d8 > 1.0d) {
            double d9 = this.f24918g;
            double d10 = this.f24917f;
            double d11 = d7 - (((d9 * d7) - d2) / (d9 - d10));
            double d12 = ((d7 * d9) - d2) / (d9 - d10);
            d4 = (Math.pow(2.718281828459045d, d9 * d6) * d11) + (Math.pow(2.718281828459045d, this.f24917f * d6) * d12);
            double d13 = this.f24918g;
            double pow = d11 * d13 * Math.pow(2.718281828459045d, d13 * d6);
            double d14 = this.f24917f;
            d3 = pow + (d12 * d14 * Math.pow(2.718281828459045d, d14 * d6));
        } else if (d8 == 1.0d) {
            double d15 = this.f24912a;
            double d16 = d2 + (d15 * d7);
            double d17 = d7 + (d16 * d6);
            d4 = Math.pow(2.718281828459045d, (-d15) * d6) * d17;
            double pow2 = d17 * Math.pow(2.718281828459045d, (-this.f24912a) * d6);
            double d18 = this.f24912a;
            d3 = (d16 * Math.pow(2.718281828459045d, (-d18) * d6)) + (pow2 * (-d18));
        } else {
            double d19 = 1.0d / this.f24919h;
            double d20 = this.f24912a;
            double d21 = d19 * ((d8 * d20 * d7) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d8) * d20 * d6) * ((Math.cos(this.f24919h * d6) * d7) + (Math.sin(this.f24919h * d6) * d21));
            double d22 = this.f24912a;
            double d23 = this.f24913b;
            double d24 = (-d22) * pow3 * d23;
            double pow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d6);
            double d25 = this.f24919h;
            double d26 = pow3;
            double sin = (-d25) * d7 * Math.sin(d25 * d6);
            double d27 = this.f24919h;
            d3 = d24 + (pow4 * (sin + (d21 * d27 * Math.cos(d27 * d6))));
            d4 = d26;
        }
        C5953b.C5968o oVar = this.f24921j;
        oVar.f24906a = (float) (d4 + this.f24920i);
        oVar.f24907b = (float) d3;
        return oVar;
    }

    public C5974e(float f) {
        this.f24920i = (double) f;
    }
}
