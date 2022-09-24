package com.startapp;

/* renamed from: com.startapp.u */
/* compiled from: Sta */
public class C12352u implements C12375ub {

    /* renamed from: a */
    public final double f54782a;

    /* renamed from: b */
    public final double f54783b;

    /* renamed from: c */
    public final double f54784c;

    /* renamed from: d */
    public final double f54785d;

    /* renamed from: e */
    public final double f54786e;

    /* renamed from: f */
    public final double f54787f;

    /* renamed from: g */
    public double f54788g;

    /* renamed from: h */
    public long f54789h;

    /* renamed from: i */
    public double f54790i;

    public C12352u(double d, double d2, double d3, double d4, double d5) {
        double d6 = d + d2;
        this.f54782a = d / d6;
        this.f54783b = d2 / d6;
        this.f54784c = d3;
        this.f54785d = d4;
        this.f54786e = d5;
        this.f54787f = C12114ob.m52723a(0.0d, d4, d5);
    }

    /* renamed from: a */
    public static double m53511a(long j, long j2, double d, double d2, double d3, double d4) {
        double max = (double) Math.max(0, j - j2);
        Double.isNaN(max);
        double d5 = max / d;
        if (d3 > 0.0d) {
            return C12114ob.m52724a(d5, d2, d3, d4);
        }
        if (d3 < 0.0d) {
            return C12114ob.m52723a(d5, d2, d3) / d4;
        }
        return C12114ob.m52723a(d5, d2, d3);
    }

    /* renamed from: a */
    public void mo46643a(long j, double d) {
        double a = this.f54788g * m53511a(j, this.f54789h, this.f54784c, this.f54785d, this.f54786e, this.f54787f);
        double d2 = (this.f54783b * d) + (this.f54782a * a);
        this.f54790i = d2;
        if (a < d2) {
            this.f54788g = d2;
            this.f54789h = j;
        }
    }

    /* renamed from: a */
    public double mo45707a() {
        return this.f54790i;
    }
}
