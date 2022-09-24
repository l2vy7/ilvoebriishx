package com.startapp;

/* renamed from: com.startapp.gc */
/* compiled from: Sta */
public class C11928gc {

    /* renamed from: a */
    public final C11930b f52989a = new C11930b();

    /* renamed from: b */
    public final long f52990b;

    /* renamed from: c */
    public final double f52991c;

    /* renamed from: d */
    public final C12375ub f52992d;

    /* renamed from: e */
    public double f52993e;

    /* renamed from: f */
    public double f52994f;

    /* renamed from: g */
    public double f52995g;

    /* renamed from: h */
    public long f52996h;

    /* renamed from: i */
    public long f52997i;

    /* renamed from: j */
    public double f52998j;

    /* renamed from: k */
    public long f52999k;

    /* renamed from: l */
    public long f53000l;

    /* renamed from: m */
    public C11929a f53001m;

    /* renamed from: n */
    public C11929a f53002n;

    /* renamed from: o */
    public int f53003o;

    /* renamed from: p */
    public double f53004p;

    /* renamed from: q */
    public double f53005q;

    /* renamed from: r */
    public double f53006r;

    /* renamed from: com.startapp.gc$a */
    /* compiled from: Sta */
    public static class C11929a {

        /* renamed from: a */
        public C11929a f53007a;

        /* renamed from: b */
        public long f53008b;

        /* renamed from: c */
        public long f53009c;

        /* renamed from: d */
        public int f53010d;

        /* renamed from: e */
        public double f53011e;
    }

    /* renamed from: com.startapp.gc$b */
    /* compiled from: Sta */
    public static class C11930b {

        /* renamed from: a */
        public C11929a f53012a;
    }

    public C11928gc(double d, double d2, C12375ub ubVar) {
        this.f52990b = (long) (d * 1.0E9d);
        this.f52991c = d2;
        this.f52992d = ubVar;
    }

    /* renamed from: a */
    public void mo45385a(long j, double d) {
        C11929a aVar;
        this.f52993e = this.f52994f;
        this.f52994f = this.f52995g;
        this.f52995g = d;
        this.f52996h = this.f52997i;
        this.f52997i = j;
        long j2 = j - this.f52990b;
        while (true) {
            C11929a aVar2 = this.f53001m;
            if (aVar2 == null || aVar2.f53008b >= j2 || (aVar = aVar2.f53007a) == null || aVar.f53008b >= j2) {
                C11930b bVar = this.f52989a;
                C11929a aVar3 = bVar.f53012a;
            } else {
                this.f53001m = aVar;
                this.f53003o -= aVar2.f53010d;
                this.f53006r -= aVar2.f53011e;
                C11930b bVar2 = this.f52989a;
                aVar2.f53007a = bVar2.f53012a;
                bVar2.f53012a = aVar2;
            }
        }
        C11930b bVar3 = this.f52989a;
        C11929a aVar32 = bVar3.f53012a;
        if (aVar32 == null) {
            aVar32 = new C11929a();
        } else {
            bVar3.f53012a = aVar32.f53007a;
            aVar32.f53007a = null;
            aVar32.f53008b = 0;
            aVar32.f53009c = 0;
            aVar32.f53010d = 0;
            aVar32.f53011e = 0.0d;
        }
        aVar32.f53008b = this.f52997i;
        aVar32.f53009c = this.f53000l;
        double a = this.f52992d.mo45707a();
        double d2 = this.f52993e;
        double d3 = this.f52994f;
        if (d2 < d3 && d3 > this.f52995g) {
            double d4 = d3 - a;
            if (d4 > this.f52991c) {
                this.f52998j = d4;
                this.f52999k = this.f52996h;
            }
        }
        if (d3 > a && a > this.f52995g && this.f52999k > this.f53000l) {
            this.f53000l = this.f52997i;
            aVar32.f53010d = 1;
            aVar32.f53011e = this.f52998j;
        }
        int i = this.f53003o + aVar32.f53010d;
        this.f53003o = i;
        double d5 = this.f53006r + aVar32.f53011e;
        this.f53006r = d5;
        C11929a aVar4 = this.f53002n;
        if (aVar4 != null) {
            aVar4.f53007a = aVar32;
        }
        this.f53002n = aVar32;
        if (this.f53001m == null) {
            this.f53001m = aVar32;
        }
        long j3 = this.f53000l - this.f53001m.f53009c;
        if (j3 > 0) {
            double d6 = (double) j3;
            Double.isNaN(d6);
            double d7 = (double) i;
            Double.isNaN(d7);
            this.f53004p = d7 / (d6 / 1.0E9d);
        }
        if (i > 0) {
            double d8 = (double) i;
            Double.isNaN(d8);
            this.f53005q = d5 / d8;
            return;
        }
        this.f53005q = 0.0d;
    }
}
