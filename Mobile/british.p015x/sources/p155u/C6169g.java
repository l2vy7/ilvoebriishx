package p155u;

import androidx.constraintlayout.motion.widget.C0509o;

/* renamed from: u.g */
/* compiled from: StopLogic */
public class C6169g extends C0509o {

    /* renamed from: a */
    private float f25490a;

    /* renamed from: b */
    private float f25491b;

    /* renamed from: c */
    private float f25492c;

    /* renamed from: d */
    private float f25493d;

    /* renamed from: e */
    private float f25494e;

    /* renamed from: f */
    private float f25495f;

    /* renamed from: g */
    private float f25496g;

    /* renamed from: h */
    private float f25497h;

    /* renamed from: i */
    private float f25498i;

    /* renamed from: j */
    private int f25499j;

    /* renamed from: k */
    private String f25500k;

    /* renamed from: l */
    private boolean f25501l = false;

    /* renamed from: m */
    private float f25502m;

    /* renamed from: n */
    private float f25503n;

    /* renamed from: b */
    private float m27081b(float f) {
        float f2 = this.f25493d;
        if (f <= f2) {
            float f3 = this.f25490a;
            return (f3 * f) + ((((this.f25491b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f25499j;
        if (i == 1) {
            return this.f25496g;
        }
        float f4 = f - f2;
        float f5 = this.f25494e;
        if (f4 < f5) {
            float f6 = this.f25496g;
            float f7 = this.f25491b;
            return f6 + (f7 * f4) + ((((this.f25492c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f25497h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f25495f;
            if (f8 >= f9) {
                return this.f25498i;
            }
            float f10 = this.f25497h;
            float f11 = this.f25492c;
            return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
        }
    }

    /* renamed from: e */
    private void m27082e(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f25490a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f25500k = "backward accelerate, decelerate";
                this.f25499j = 2;
                this.f25490a = f;
                this.f25491b = sqrt;
                this.f25492c = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f25493d = f8;
                this.f25494e = sqrt / f3;
                this.f25496g = ((f + sqrt) * f8) / 2.0f;
                this.f25497h = f2;
                this.f25498i = f2;
                return;
            }
            this.f25500k = "backward accelerate cruse decelerate";
            this.f25499j = 3;
            this.f25490a = f;
            this.f25491b = f4;
            this.f25492c = f4;
            float f9 = (f4 - f) / f3;
            this.f25493d = f9;
            float f10 = f4 / f3;
            this.f25495f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f25494e = ((f2 - f11) - f12) / f4;
            this.f25496g = f11;
            this.f25497h = f2 - f12;
            this.f25498i = f2;
        } else if (f7 >= f2) {
            this.f25500k = "hard stop";
            this.f25499j = 1;
            this.f25490a = f;
            this.f25491b = 0.0f;
            this.f25496g = f2;
            this.f25493d = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f25500k = "cruse decelerate";
                this.f25499j = 2;
                this.f25490a = f;
                this.f25491b = f;
                this.f25492c = 0.0f;
                this.f25496g = f13;
                this.f25497h = f2;
                this.f25493d = f14;
                this.f25494e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f15 = (sqrt2 - f) / f3;
            this.f25493d = f15;
            float f16 = sqrt2 / f3;
            this.f25494e = f16;
            if (sqrt2 < f4) {
                this.f25500k = "accelerate decelerate";
                this.f25499j = 2;
                this.f25490a = f;
                this.f25491b = sqrt2;
                this.f25492c = 0.0f;
                this.f25493d = f15;
                this.f25494e = f16;
                this.f25496g = ((f + sqrt2) * f15) / 2.0f;
                this.f25497h = f2;
                return;
            }
            this.f25500k = "accelerate cruse decelerate";
            this.f25499j = 3;
            this.f25490a = f;
            this.f25491b = f4;
            this.f25492c = f4;
            float f17 = (f4 - f) / f3;
            this.f25493d = f17;
            float f18 = f4 / f3;
            this.f25495f = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f25494e = ((f2 - f19) - f20) / f4;
            this.f25496g = f19;
            this.f25497h = f2 - f20;
            this.f25498i = f2;
        }
    }

    /* renamed from: a */
    public float mo2588a() {
        return this.f25501l ? -mo23571d(this.f25503n) : mo23571d(this.f25503n);
    }

    /* renamed from: c */
    public void mo23570c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f25502m = f;
        boolean z = f > f2;
        this.f25501l = z;
        if (z) {
            m27082e(-f3, f - f2, f5, f6, f4);
        } else {
            m27082e(f3, f2 - f, f5, f6, f4);
        }
    }

    /* renamed from: d */
    public float mo23571d(float f) {
        float f2 = this.f25493d;
        if (f <= f2) {
            float f3 = this.f25490a;
            return f3 + (((this.f25491b - f3) * f) / f2);
        }
        int i = this.f25499j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f25494e;
        if (f4 < f5) {
            float f6 = this.f25491b;
            return f6 + (((this.f25492c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f25497h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f25495f;
            if (f7 >= f8) {
                return this.f25498i;
            }
            float f9 = this.f25492c;
            return f9 - ((f7 * f9) / f8);
        }
    }

    public float getInterpolation(float f) {
        float b = m27081b(f);
        this.f25503n = f;
        return this.f25501l ? this.f25502m - b : this.f25502m + b;
    }
}
