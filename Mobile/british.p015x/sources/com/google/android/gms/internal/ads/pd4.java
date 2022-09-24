package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pd4 extends ud4 {

    /* renamed from: e */
    private static final int[] f37601e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f37602b;

    /* renamed from: c */
    private boolean f37603c;

    /* renamed from: d */
    private int f37604d;

    public pd4(ad4 ad4) {
        super(ad4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo34112a(uq2 uq2) throws td4 {
        if (!this.f37602b) {
            int s = uq2.mo35249s();
            int i = s >> 4;
            this.f37604d = i;
            if (i == 2) {
                int i2 = f37601e[(s >> 2) & 3];
                ge4 ge4 = new ge4();
                ge4.mo32093s(MimeTypes.AUDIO_MPEG);
                ge4.mo32076e0(1);
                ge4.mo32094t(i2);
                this.f39830a.mo30354a(ge4.mo32099y());
                this.f37603c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                ge4 ge42 = new ge4();
                ge42.mo32093s(str);
                ge42.mo32076e0(1);
                ge42.mo32094t(8000);
                this.f39830a.mo30354a(ge42.mo32099y());
                this.f37603c = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new td4(sb.toString());
            }
            this.f37602b = true;
        } else {
            uq2.mo35237g(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo34113b(uq2 uq2, long j) throws C7811iy {
        if (this.f37604d == 2) {
            int i = uq2.mo35239i();
            this.f39830a.mo30357d(uq2, i);
            this.f39830a.mo30358e(j, 1, i, 0, (zc4) null);
            return true;
        }
        int s = uq2.mo35249s();
        if (s == 0 && !this.f37603c) {
            int i2 = uq2.mo35239i();
            byte[] bArr = new byte[i2];
            uq2.mo35232b(bArr, 0, i2);
            wa4 a = xa4.m39418a(bArr);
            ge4 ge4 = new ge4();
            ge4.mo32093s(MimeTypes.AUDIO_AAC);
            ge4.mo32078f0(a.f40748c);
            ge4.mo32076e0(a.f40747b);
            ge4.mo32094t(a.f40746a);
            ge4.mo32083i(Collections.singletonList(bArr));
            this.f39830a.mo30354a(ge4.mo32099y());
            this.f37603c = true;
            return false;
        } else if (this.f37604d == 10 && s != 1) {
            return false;
        } else {
            int i3 = uq2.mo35239i();
            this.f39830a.mo30357d(uq2, i3);
            this.f39830a.mo30358e(j, 1, i3, 0, (zc4) null);
            return true;
        }
    }
}
