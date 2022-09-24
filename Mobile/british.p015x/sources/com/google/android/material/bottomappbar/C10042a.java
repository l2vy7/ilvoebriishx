package com.google.android.material.bottomappbar;

import p243p6.C10887f;
import p243p6.C10905o;

/* renamed from: com.google.android.material.bottomappbar.a */
/* compiled from: BottomAppBarTopEdgeTreatment */
public class C10042a extends C10887f implements Cloneable {

    /* renamed from: b */
    private float f47334b;

    /* renamed from: c */
    private float f47335c;

    /* renamed from: d */
    private float f47336d;

    /* renamed from: e */
    private float f47337e;

    /* renamed from: f */
    private float f47338f;

    /* renamed from: g */
    private float f47339g = -1.0f;

    public C10042a(float f, float f2, float f3) {
        this.f47335c = f;
        this.f47334b = f2;
        mo39789l(f3);
        this.f47338f = 0.0f;
    }

    /* renamed from: b */
    public void mo39782b(float f, float f2, float f3, C10905o oVar) {
        float f4;
        float f5;
        float f6 = f;
        C10905o oVar2 = oVar;
        float f7 = this.f47336d;
        if (f7 == 0.0f) {
            oVar2.mo43177m(f6, 0.0f);
            return;
        }
        float f8 = ((this.f47335c * 2.0f) + f7) / 2.0f;
        float f9 = f3 * this.f47334b;
        float f10 = f2 + this.f47338f;
        float f11 = (this.f47337e * f3) + ((1.0f - f3) * f8);
        if (f11 / f8 >= 1.0f) {
            oVar2.mo43177m(f6, 0.0f);
            return;
        }
        float f12 = this.f47339g;
        float f13 = f12 * f3;
        boolean z = f12 == -1.0f || Math.abs((f12 * 2.0f) - f7) < 0.1f;
        if (!z) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f11;
            f5 = 0.0f;
        }
        float f14 = f8 + f9;
        float f15 = f4 + f9;
        float sqrt = (float) Math.sqrt((double) ((f14 * f14) - (f15 * f15)));
        float f16 = f10 - sqrt;
        float f17 = f10 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f15)));
        float f18 = (90.0f - degrees) + f5;
        oVar2.mo43177m(f16, 0.0f);
        float f19 = f9 * 2.0f;
        float f20 = degrees;
        oVar.mo43169a(f16 - f9, 0.0f, f16 + f9, f19, 270.0f, degrees);
        if (z) {
            oVar.mo43169a(f10 - f8, (-f8) - f4, f10 + f8, f8 - f4, 180.0f - f18, (f18 * 2.0f) - 180.0f);
        } else {
            float f21 = this.f47335c;
            float f22 = f13 * 2.0f;
            float f23 = f10 - f8;
            oVar.mo43169a(f23, -(f13 + f21), f23 + f21 + f22, f21 + f13, 180.0f - f18, ((f18 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f10 + f8;
            float f25 = this.f47335c;
            oVar2.mo43177m(f24 - ((f25 / 2.0f) + f13), f25 + f13);
            float f26 = this.f47335c;
            oVar.mo43169a(f24 - (f22 + f26), -(f13 + f26), f24, f26 + f13, 90.0f, f18 - 0.049804688f);
        }
        oVar.mo43169a(f17 - f9, 0.0f, f17 + f9, f19, 270.0f - f20, f20);
        oVar2.mo43177m(f6, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo39783c() {
        return this.f47337e;
    }

    /* renamed from: d */
    public float mo39784d() {
        return this.f47339g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo39785g() {
        return this.f47335c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo39786h() {
        return this.f47334b;
    }

    /* renamed from: i */
    public float mo39787i() {
        return this.f47336d;
    }

    /* renamed from: k */
    public float mo39788k() {
        return this.f47338f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo39789l(float f) {
        if (f >= 0.0f) {
            this.f47337e = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: m */
    public void mo39790m(float f) {
        this.f47339g = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo39791n(float f) {
        this.f47335c = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo39792o(float f) {
        this.f47334b = f;
    }

    /* renamed from: p */
    public void mo39793p(float f) {
        this.f47336d = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo39794s(float f) {
        this.f47338f = f;
    }
}
