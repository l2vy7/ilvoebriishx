package com.startapp;

/* renamed from: com.startapp.r3 */
/* compiled from: Sta */
public class C12158r3 implements C12375ub {

    /* renamed from: a */
    public final C12176s3 f54095a;

    /* renamed from: b */
    public final C12176s3 f54096b;

    /* renamed from: c */
    public final C12176s3 f54097c;

    /* renamed from: d */
    public double f54098d;

    public C12158r3(C12176s3 s3Var, C12176s3 s3Var2, C12176s3 s3Var3) {
        this.f54095a = s3Var;
        this.f54096b = s3Var2;
        this.f54097c = s3Var3;
    }

    /* renamed from: a */
    public void mo45708a(double d, double d2, double d3) {
        this.f54095a.mo45744a(d);
        this.f54096b.mo45744a(d2);
        this.f54097c.mo45744a(d3);
        double d4 = this.f54095a.f54139c;
        double d5 = this.f54096b.f54139c;
        double d6 = (d5 * d5) + (d4 * d4);
        double d7 = this.f54097c.f54139c;
        this.f54098d = Math.sqrt((d7 * d7) + d6);
    }

    /* renamed from: b */
    public C12176s3 mo45709b() {
        return this.f54095a;
    }

    /* renamed from: c */
    public C12176s3 mo45710c() {
        return this.f54096b;
    }

    /* renamed from: d */
    public C12176s3 mo45711d() {
        return this.f54097c;
    }

    /* renamed from: a */
    public double mo45707a() {
        return this.f54098d;
    }
}
