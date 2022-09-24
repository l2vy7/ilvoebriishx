package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7887l0 {

    /* renamed from: a */
    public final int f34755a;

    /* renamed from: b */
    public int f34756b;

    /* renamed from: c */
    public int f34757c;

    /* renamed from: d */
    public long f34758d;

    /* renamed from: e */
    private final boolean f34759e;

    /* renamed from: f */
    private final uq2 f34760f;

    /* renamed from: g */
    private final uq2 f34761g;

    /* renamed from: h */
    private int f34762h;

    /* renamed from: i */
    private int f34763i;

    public C7887l0(uq2 uq2, uq2 uq22, boolean z) throws C7811iy {
        this.f34761g = uq2;
        this.f34760f = uq22;
        this.f34759e = z;
        uq22.mo35236f(12);
        this.f34755a = uq22.mo35252v();
        uq2.mo35236f(12);
        this.f34763i = uq2.mo35252v();
        zb4.m21283b(uq2.mo35243m() != 1 ? false : true, "first_chunk must be 1");
        this.f34756b = -1;
    }

    /* renamed from: a */
    public final boolean mo33218a() {
        long j;
        int i = this.f34756b + 1;
        this.f34756b = i;
        if (i == this.f34755a) {
            return false;
        }
        if (this.f34759e) {
            j = this.f34760f.mo35224B();
        } else {
            j = this.f34760f.mo35223A();
        }
        this.f34758d = j;
        if (this.f34756b == this.f34762h) {
            this.f34757c = this.f34761g.mo35252v();
            this.f34761g.mo35237g(4);
            int i2 = -1;
            int i3 = this.f34763i - 1;
            this.f34763i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f34761g.mo35252v();
            }
            this.f34762h = i2;
        }
        return true;
    }
}
