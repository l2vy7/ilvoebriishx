package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.gms.internal.ads.w1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4629w1 extends C4607b2 {

    /* renamed from: o */
    private static final byte[] f20945o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    private boolean f20946n;

    C4629w1() {
    }

    /* renamed from: j */
    public static boolean m21089j(uq2 uq2) {
        if (uq2.mo35239i() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        uq2.mo35232b(bArr, 0, 8);
        return Arrays.equals(bArr, f20945o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo18108a(uq2 uq2) {
        byte[] h = uq2.mo35238h();
        byte b = h[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = h[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo18113f(((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18109b(boolean z) {
        super.mo18109b(z);
        if (z) {
            this.f20946n = false;
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo18110c(uq2 uq2, long j, C8318x1 x1Var) {
        boolean z = true;
        if (!this.f20946n) {
            byte[] copyOf = Arrays.copyOf(uq2.mo35238h(), uq2.mo35242l());
            byte b = copyOf[9];
            List<byte[]> a = sc4.m37375a(copyOf);
            ge4 ge4 = new ge4();
            ge4.mo32093s(MimeTypes.AUDIO_OPUS);
            ge4.mo32076e0(b & 255);
            ge4.mo32094t(OpusUtil.SAMPLE_RATE);
            ge4.mo32083i(a);
            x1Var.f40980a = ge4.mo32099y();
            this.f20946n = true;
            return true;
        }
        Objects.requireNonNull(x1Var.f40980a);
        if (uq2.mo35243m() != 1332770163) {
            z = false;
        }
        uq2.mo35236f(0);
        return z;
    }
}
