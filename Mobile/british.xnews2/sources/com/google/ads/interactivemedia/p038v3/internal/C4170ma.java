package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ma */
/* compiled from: IMASDK */
public final class C4170ma {

    /* renamed from: a */
    public static final Object f17924a = new Object();

    /* renamed from: r */
    private static final C4129kn f17925r;

    /* renamed from: b */
    public Object f17926b = f17924a;

    /* renamed from: c */
    public C4129kn f17927c = f17925r;

    /* renamed from: d */
    public Object f17928d;

    /* renamed from: e */
    public long f17929e;

    /* renamed from: f */
    public long f17930f;

    /* renamed from: g */
    public long f17931g;

    /* renamed from: h */
    public boolean f17932h;

    /* renamed from: i */
    public boolean f17933i;
    @Deprecated

    /* renamed from: j */
    public boolean f17934j;

    /* renamed from: k */
    public C4127kl f17935k;

    /* renamed from: l */
    public boolean f17936l;

    /* renamed from: m */
    public long f17937m;

    /* renamed from: n */
    public long f17938n;

    /* renamed from: o */
    public int f17939o;

    /* renamed from: p */
    public int f17940p;

    /* renamed from: q */
    public long f17941q;

    static {
        C4124ki kiVar = new C4124ki();
        kiVar.mo16141c("com.google.android.exoplayer2.Timeline");
        kiVar.mo16144f(Uri.EMPTY);
        f17925r = kiVar.mo16139a();
    }

    /* renamed from: a */
    public final long mo16325a() {
        return C4083iv.m17451a(this.f17937m);
    }

    /* renamed from: b */
    public final boolean mo16326b() {
        aup.m14887r(this.f17934j == (this.f17935k != null));
        return this.f17935k != null;
    }

    /* renamed from: c */
    public final void mo16327c(Object obj, C4129kn knVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C4127kl klVar, long j4, long j5, int i, long j6) {
        C4127kl klVar2 = klVar;
        this.f17926b = obj;
        this.f17927c = knVar != null ? knVar : f17925r;
        this.f17928d = obj2;
        this.f17929e = j;
        this.f17930f = j2;
        this.f17931g = j3;
        this.f17932h = z;
        this.f17933i = z2;
        this.f17934j = klVar2 != null;
        this.f17935k = klVar2;
        this.f17937m = j4;
        this.f17938n = j5;
        this.f17939o = 0;
        this.f17940p = i;
        this.f17941q = j6;
        this.f17936l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4170ma.class.equals(obj.getClass())) {
            C4170ma maVar = (C4170ma) obj;
            return amm.m14233c(this.f17926b, maVar.f17926b) && amm.m14233c(this.f17927c, maVar.f17927c) && amm.m14233c(this.f17928d, maVar.f17928d) && amm.m14233c(this.f17935k, maVar.f17935k) && this.f17929e == maVar.f17929e && this.f17930f == maVar.f17930f && this.f17931g == maVar.f17931g && this.f17932h == maVar.f17932h && this.f17933i == maVar.f17933i && this.f17936l == maVar.f17936l && this.f17937m == maVar.f17937m && this.f17938n == maVar.f17938n && this.f17939o == maVar.f17939o && this.f17940p == maVar.f17940p && this.f17941q == maVar.f17941q;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f17926b.hashCode() + 217) * 31) + this.f17927c.hashCode()) * 31;
        Object obj = this.f17928d;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        C4127kl klVar = this.f17935k;
        if (klVar != null) {
            i2 = klVar.hashCode();
        }
        long j = this.f17929e;
        long j2 = this.f17930f;
        long j3 = this.f17931g;
        boolean z = this.f17932h;
        boolean z2 = this.f17933i;
        boolean z3 = this.f17936l;
        long j4 = this.f17937m;
        long j5 = this.f17938n;
        int i4 = this.f17939o;
        long j6 = this.f17941q;
        return ((((((((((((((((((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + i4) * 31) + this.f17940p) * 31) + ((int) ((j6 >>> 32) ^ j6));
    }
}
