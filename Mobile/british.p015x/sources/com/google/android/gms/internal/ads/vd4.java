package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vd4 extends ud4 {

    /* renamed from: b */
    private final uq2 f40399b = new uq2(kh2.f34333a);

    /* renamed from: c */
    private final uq2 f40400c = new uq2(4);

    /* renamed from: d */
    private int f40401d;

    /* renamed from: e */
    private boolean f40402e;

    /* renamed from: f */
    private boolean f40403f;

    /* renamed from: g */
    private int f40404g;

    public vd4(ad4 ad4) {
        super(ad4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo34112a(uq2 uq2) throws td4 {
        int s = uq2.mo35249s();
        int i = s >> 4;
        int i2 = s & 15;
        if (i2 == 7) {
            this.f40404g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new td4(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo34113b(uq2 uq2, long j) throws C7811iy {
        int s = uq2.mo35249s();
        long n = j + (((long) uq2.mo35244n()) * 1000);
        if (s == 0) {
            if (!this.f40402e) {
                uq2 uq22 = new uq2(new byte[uq2.mo35239i()]);
                uq2.mo35232b(uq22.mo35238h(), 0, uq2.mo35239i());
                eb4 a = eb4.m31766a(uq22);
                this.f40401d = a.f31300b;
                ge4 ge4 = new ge4();
                ge4.mo32093s(MimeTypes.VIDEO_H264);
                ge4.mo32078f0(a.f31304f);
                ge4.mo32098x(a.f31301c);
                ge4.mo32077f(a.f31302d);
                ge4.mo32090p(a.f31303e);
                ge4.mo32083i(a.f31299a);
                this.f39830a.mo30354a(ge4.mo32099y());
                this.f40402e = true;
                return false;
            }
        } else if (s == 1 && this.f40402e) {
            int i = this.f40404g == 1 ? 1 : 0;
            if (!this.f40403f && i == 0) {
                return false;
            }
            byte[] h = this.f40400c.mo35238h();
            h[0] = 0;
            h[1] = 0;
            h[2] = 0;
            int i2 = 4 - this.f40401d;
            int i3 = 0;
            while (uq2.mo35239i() > 0) {
                uq2.mo35232b(this.f40400c.mo35238h(), i2, this.f40401d);
                this.f40400c.mo35236f(0);
                int v = this.f40400c.mo35252v();
                this.f40399b.mo35236f(0);
                this.f39830a.mo30357d(this.f40399b, 4);
                this.f39830a.mo30357d(uq2, v);
                i3 = i3 + 4 + v;
            }
            this.f39830a.mo30358e(n, i, i3, 0, (zc4) null);
            this.f40403f = true;
            return true;
        }
        return false;
    }
}
