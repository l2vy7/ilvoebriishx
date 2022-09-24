package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.va */
/* compiled from: IMASDK */
final class C4413va extends C4416vd {

    /* renamed from: a */
    private static final byte[] f19130a = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: b */
    private boolean f19131b;

    C4413va() {
    }

    /* renamed from: d */
    public static boolean m19196d(alw alw) {
        if (alw.mo13947e() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        alw.mo13956n(bArr, 0, 8);
        return Arrays.equals(bArr, f19130a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16689a(boolean z) {
        super.mo16689a(z);
        if (z) {
            this.f19131b = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo16690b(alw alw) {
        byte[] j = alw.mo13952j();
        byte b = j[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = j[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo16705i(((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16691c(alw alw, long j, C4414vb vbVar) {
        boolean z = true;
        if (!this.f19131b) {
            byte[] copyOf = Arrays.copyOf(alw.mo13952j(), alw.mo13948f());
            byte b = copyOf[9];
            List<byte[]> a = C4257pg.m18522a(copyOf);
            C4119kd kdVar = new C4119kd();
            kdVar.mo16120ae(MimeTypes.AUDIO_OPUS);
            kdVar.mo16096H(b & 255);
            kdVar.mo16121af(OpusUtil.SAMPLE_RATE);
            kdVar.mo16108T(a);
            vbVar.f19132a = kdVar.mo16115a();
            this.f19131b = true;
            return true;
        }
        aup.m14890u(vbVar.f19132a);
        if (alw.mo13965w() != 1332770163) {
            z = false;
        }
        alw.mo13951i(0);
        return z;
    }
}
