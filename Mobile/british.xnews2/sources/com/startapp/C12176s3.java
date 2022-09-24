package com.startapp;

/* renamed from: com.startapp.s3 */
/* compiled from: Sta */
public class C12176s3 implements C12375ub {

    /* renamed from: a */
    public final double f54137a;

    /* renamed from: b */
    public final double f54138b;

    /* renamed from: c */
    public double f54139c;

    public C12176s3(double d) {
        double d2 = d + 1.0d;
        this.f54137a = d / d2;
        this.f54138b = 1.0d / d2;
    }

    /* renamed from: a */
    public void mo45744a(double d) {
        this.f54139c = (d * this.f54138b) + (this.f54137a * this.f54139c);
    }

    /* renamed from: a */
    public double mo45707a() {
        return this.f54139c;
    }
}
