package com.startapp;

/* renamed from: com.startapp.ya */
/* compiled from: Sta */
public class C12452ya {

    /* renamed from: a */
    public final C12158r3 f55158a;

    /* renamed from: b */
    public final C12158r3 f55159b;

    /* renamed from: c */
    public final C12176s3 f55160c;

    /* renamed from: d */
    public final C11908fc f55161d;

    /* renamed from: e */
    public final C12434xb f55162e = new C12434xb();

    /* renamed from: f */
    public final C12176s3 f55163f;

    /* renamed from: g */
    public final C12352u f55164g;

    /* renamed from: h */
    public final C12416wb f55165h;

    /* renamed from: i */
    public final C12352u f55166i;

    /* renamed from: j */
    public final C11941h8 f55167j;

    /* renamed from: k */
    public final C12352u f55168k;

    /* renamed from: l */
    public long f55169l;

    /* renamed from: m */
    public long f55170m;

    public C12452ya(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d;
        double d18 = d2;
        C12158r3 r3Var = new C12158r3(new C12176s3(d), new C12176s3(d), new C12176s3(d));
        this.f55158a = r3Var;
        this.f55159b = new C12158r3(new C12176s3(d2), new C12176s3(d2), new C12176s3(d2));
        double d19 = d3;
        this.f55160c = new C12176s3(d3);
        double d20 = d5;
        double d21 = d6;
        this.f55161d = new C11908fc(new C11928gc(d20, d21, r3Var.mo45709b()), new C11928gc(d20, d21, r3Var.mo45710c()), new C11928gc(d20, d21, r3Var.mo45711d()));
        this.f55163f = new C12176s3(d4);
        double d22 = d12;
        double d23 = d13;
        double d24 = d14;
        double d25 = d15;
        double d26 = d16;
        this.f55164g = new C12352u(d22, d23, d24, d25, d26);
        this.f55165h = new C12416wb();
        this.f55166i = new C12352u(d22, d23, d24, d25, d26);
        this.f55167j = new C11941h8(5.0d, false);
        this.f55168k = new C12352u(d7, d8, d9, d10, d11);
    }

    /* renamed from: a */
    public void mo46837a(double d, long j) {
        this.f55168k.f54788g = Math.min(Math.max(0.0d, d), 1.0d);
        this.f55168k.f54789h = j;
    }

    /* renamed from: a */
    public void mo46838a(long j, long j2, double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7;
        double exp;
        long j3 = j;
        long j4 = j2;
        double d8 = d;
        double d9 = d2;
        double d10 = d3;
        if (this.f55170m < j4) {
            if (this.f55169l <= 0) {
                this.f55169l = j4;
            }
            C12158r3 r3Var = this.f55158a;
            double d11 = r3Var.f54095a.f54139c;
            double d12 = r3Var.f54096b.f54139c;
            double d13 = r3Var.f54097c.f54139c;
            double d14 = d10;
            r3Var.mo45708a(d, d2, d3);
            C12158r3 r3Var2 = this.f55158a;
            double d15 = r3Var2.f54095a.f54139c - d11;
            double d16 = r3Var2.f54096b.f54139c - d12;
            double d17 = r3Var2.f54097c.f54139c - d13;
            double d18 = d17 * d17;
            double d19 = d18 + (d16 * d16) + (d15 * d15);
            this.f55164g.mo46643a(j3, C12114ob.m52723a(d19, 1.5d, 4.0d));
            this.f55166i.mo46643a(j3, C12114ob.m52723a(d19, 0.01d, 1000.0d));
            C12158r3 r3Var3 = this.f55159b;
            C12158r3 r3Var4 = this.f55158a;
            r3Var3.mo45708a(d8 - r3Var4.f54095a.f54139c, d9 - r3Var4.f54096b.f54139c, d14 - r3Var4.f54097c.f54139c);
            this.f55160c.mo45744a(this.f55159b.f54098d);
            C11908fc fcVar = this.f55161d;
            double d20 = d14;
            long j5 = j2;
            fcVar.f52955a.mo45385a(j5, d8);
            fcVar.f52956b.mo45385a(j5, d9);
            fcVar.f52957c.mo45385a(j5, d20);
            C11928gc gcVar = fcVar.f52955a;
            double d21 = gcVar.f53005q;
            C11928gc gcVar2 = fcVar.f52956b;
            double d22 = gcVar2.f53005q;
            C11928gc gcVar3 = fcVar.f52957c;
            double d23 = gcVar3.f53005q;
            double d24 = d21 + d22 + d23;
            double d25 = 1.0d - this.f55164g.f54790i;
            if (d24 > 0.0d) {
                fcVar.f52958d = ((gcVar.f53004p * d21) / d24) + ((gcVar2.f53004p * d22) / d24) + ((gcVar3.f53004p * d23) / d24);
                fcVar.f52959e = d24 / 3.0d;
            } else {
                fcVar.f52958d = 0.0d;
                fcVar.f52959e = 0.0d;
            }
            double d26 = (double) (j5 - this.f55169l);
            Double.isNaN(d26);
            double a = C12114ob.m52723a(d26 / 1.0E9d, 10.0d, 1.0d);
            C12434xb xbVar = this.f55162e;
            C11908fc fcVar2 = this.f55161d;
            double d27 = fcVar2.f52958d;
            double d28 = fcVar2.f52959e;
            double d29 = this.f55160c.f54139c;
            xbVar.f55142a = (Math.min(Math.exp((-Math.pow(d27 - 7.0d, 2.0d)) / 1.0d) * 2.0d, 1.0d) * 1.0d) + (xbVar.f55142a * 0.0d);
            double d30 = xbVar.f55143b * 0.0d;
            if (d28 < 0.0d) {
                d5 = 1.0d;
                d4 = 0.0d;
            } else {
                if (d28 < 0.5d) {
                    d4 = Math.pow(d28 * 2.0d, 4.0d);
                } else if (d28 > 2.0d) {
                    d4 = Math.exp((2.0d - d28) * 6.0d);
                } else {
                    d5 = 1.0d;
                    d4 = 1.0d;
                }
                d5 = 1.0d;
            }
            xbVar.f55143b = (d4 * d5) + d30;
            double d31 = xbVar.f55144c * 0.0d;
            if (d29 < 0.0d) {
                d7 = 1.0d;
                d6 = 0.0d;
            } else {
                if (d29 < 0.5d) {
                    exp = Math.pow(d29 * 2.0d, 4.0d);
                } else if (d29 > 5.0d) {
                    exp = Math.exp((5.0d - d29) * 4.0d);
                } else {
                    d7 = 1.0d;
                    d6 = 1.0d;
                }
                d6 = exp;
                d7 = 1.0d;
            }
            double d32 = (d6 * d7) + d31;
            xbVar.f55144c = d32;
            double d33 = (d32 * 100.0d) / 270.0d;
            xbVar.f55145d = d33 + ((xbVar.f55143b * 70.0d) / 270.0d) + ((xbVar.f55142a * 100.0d) / 270.0d);
            this.f55163f.mo45744a(a * d25 * this.f55162e.f55145d);
            double d34 = this.f55163f.f54139c;
            C12416wb wbVar = this.f55165h;
            C11908fc fcVar3 = this.f55161d;
            double d35 = fcVar3.f52958d;
            double d36 = fcVar3.f52959e;
            this.f55167j.getClass();
            this.f55167j.getClass();
            wbVar.f55088a = (d35 * 0.050000000000000044d) + (wbVar.f55088a * 0.95d);
            wbVar.f55089b = (d36 * 0.050000000000000044d) + (wbVar.f55089b * 0.95d);
            wbVar.f55090c = (Math.abs(0.0d) * 0.0050000000000000044d) + (wbVar.f55090c * 0.995d);
            wbVar.f55091d = (Math.abs(0.0d) * 0.0050000000000000044d) + (wbVar.f55091d * 0.995d);
            wbVar.f55092e = ((((C12114ob.m52724a(wbVar.f55091d, 0.4d, 5.0d, C12416wb.f55087i) * 1000.0d) / 5000.0d) + ((C12114ob.m52724a(wbVar.f55090c, 0.2d, 6.0d, C12416wb.f55086h) * 1000.0d) / 5000.0d) + ((C12114ob.m52724a(wbVar.f55089b, 0.2d, 20.0d, C12416wb.f55085g) * 1000.0d) / 5000.0d) + ((C12114ob.m52724a(wbVar.f55088a, 8.0d, 2.0d, C12416wb.f55084f) * 2000.0d) / 5000.0d)) * 4.999999999999449E-4d) + (wbVar.f55092e * 0.9995d);
            C12352u uVar = this.f55168k;
            double d37 = this.f55166i.f54790i;
            double d38 = (1.0d - d37) * a * this.f55165h.f55092e;
            uVar.mo46643a(j, d38 + (d34 * d37));
            this.f55170m = j2;
        }
    }
}
