package p154u;

import androidx.constraintlayout.motion.widget.C0482g;
import androidx.constraintlayout.motion.widget.C0515r;

/* renamed from: u.h */
/* compiled from: VelocityMatrix */
public class C6170h {

    /* renamed from: a */
    float f25504a;

    /* renamed from: b */
    float f25505b;

    /* renamed from: c */
    float f25506c;

    /* renamed from: d */
    float f25507d;

    /* renamed from: e */
    float f25508e;

    /* renamed from: f */
    float f25509f;

    /* renamed from: a */
    public void mo23573a(float f, float f2, int i, int i2, float[] fArr) {
        int i3 = i;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f25506c;
        float f8 = f4 + this.f25507d;
        float f9 = f7 + (this.f25504a * f5);
        float f10 = f8 + (this.f25505b * f6);
        float radians = (float) Math.toRadians((double) this.f25508e);
        double d = (double) (((float) (-i3)) * f5);
        double radians2 = (double) ((float) Math.toRadians((double) this.f25509f));
        double sin = Math.sin(radians2);
        Double.isNaN(d);
        double d2 = d * sin;
        double d3 = (double) (((float) i2) * f6);
        double cos = Math.cos(radians2);
        Double.isNaN(d3);
        float f11 = f9 + (((float) (d2 - (cos * d3))) * radians);
        double d4 = (double) (((float) i3) * f5);
        double cos2 = Math.cos(radians2);
        Double.isNaN(d4);
        double d5 = d4 * cos2;
        double sin2 = Math.sin(radians2);
        Double.isNaN(d3);
        fArr[0] = f11;
        fArr[1] = f10 + (radians * ((float) (d5 - (d3 * sin2))));
    }

    /* renamed from: b */
    public void mo23574b() {
        this.f25508e = 0.0f;
        this.f25507d = 0.0f;
        this.f25506c = 0.0f;
        this.f25505b = 0.0f;
        this.f25504a = 0.0f;
    }

    /* renamed from: c */
    public void mo23575c(C0482g gVar, float f) {
        if (gVar != null) {
            this.f25508e = gVar.mo2625b(f);
        }
    }

    /* renamed from: d */
    public void mo23576d(C0515r rVar, float f) {
        if (rVar != null) {
            this.f25508e = rVar.mo2733b(f);
            this.f25509f = rVar.mo2732a(f);
        }
    }

    /* renamed from: e */
    public void mo23577e(C0482g gVar, C0482g gVar2, float f) {
        if (gVar != null || gVar2 != null) {
            if (gVar == null) {
                this.f25504a = gVar.mo2625b(f);
            }
            if (gVar2 == null) {
                this.f25505b = gVar2.mo2625b(f);
            }
        }
    }

    /* renamed from: f */
    public void mo23578f(C0515r rVar, C0515r rVar2, float f) {
        if (rVar != null) {
            this.f25504a = rVar.mo2733b(f);
        }
        if (rVar2 != null) {
            this.f25505b = rVar2.mo2733b(f);
        }
    }

    /* renamed from: g */
    public void mo23579g(C0482g gVar, C0482g gVar2, float f) {
        if (gVar != null) {
            this.f25506c = gVar.mo2625b(f);
        }
        if (gVar2 != null) {
            this.f25507d = gVar2.mo2625b(f);
        }
    }

    /* renamed from: h */
    public void mo23580h(C0515r rVar, C0515r rVar2, float f) {
        if (rVar != null) {
            this.f25506c = rVar.mo2733b(f);
        }
        if (rVar2 != null) {
            this.f25507d = rVar2.mo2733b(f);
        }
    }
}
