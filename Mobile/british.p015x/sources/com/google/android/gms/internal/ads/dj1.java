package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dj1 implements xc1 {

    /* renamed from: a */
    private final jq1 f30806a = new jq1();

    /* renamed from: b */
    private mt1 f30807b;

    /* renamed from: c */
    private String f30808c;

    /* renamed from: d */
    private int f30809d = 8000;

    /* renamed from: e */
    private int f30810e = 8000;

    /* renamed from: f */
    private boolean f30811f;

    /* renamed from: a */
    public final dj1 mo31259a(boolean z) {
        this.f30811f = true;
        return this;
    }

    /* renamed from: b */
    public final dj1 mo31260b(int i) {
        this.f30809d = i;
        return this;
    }

    /* renamed from: c */
    public final dj1 mo31261c(int i) {
        this.f30810e = i;
        return this;
    }

    /* renamed from: d */
    public final dj1 mo31262d(mt1 mt1) {
        this.f30807b = mt1;
        return this;
    }

    /* renamed from: e */
    public final dj1 mo31263e(String str) {
        this.f30808c = str;
        return this;
    }

    /* renamed from: f */
    public final fl1 zza() {
        fl1 fl1 = new fl1(this.f30808c, this.f30809d, this.f30810e, this.f30811f, this.f30806a, (c43) null, false, (ek1) null);
        mt1 mt1 = this.f30807b;
        if (mt1 != null) {
            fl1.mo30796h(mt1);
        }
        return fl1;
    }
}
