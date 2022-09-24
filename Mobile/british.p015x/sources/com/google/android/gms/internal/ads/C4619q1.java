package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.gms.internal.ads.q1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4619q1 extends C4607b2 {

    /* renamed from: n */
    private kc4 f20655n;

    /* renamed from: o */
    private C8034p1 f20656o;

    C4619q1() {
    }

    /* renamed from: j */
    private static boolean m20834j(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo18108a(uq2 uq2) {
        if (!m20834j(uq2.mo35238h())) {
            return -1;
        }
        int i = (uq2.mo35238h()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int a = ec4.m31771a(uq2, i);
            uq2.mo35236f(0);
            return (long) a;
        }
        uq2.mo35237g(4);
        uq2.mo35225C();
        int a2 = ec4.m31771a(uq2, i);
        uq2.mo35236f(0);
        return (long) a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18109b(boolean z) {
        super.mo18109b(z);
        if (z) {
            this.f20655n = null;
            this.f20656o = null;
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo18110c(uq2 uq2, long j, C8318x1 x1Var) {
        byte[] h = uq2.mo35238h();
        kc4 kc4 = this.f20655n;
        if (kc4 == null) {
            kc4 kc42 = new kc4(h, 17);
            this.f20655n = kc42;
            x1Var.f40980a = kc42.mo33062c(Arrays.copyOfRange(h, 9, uq2.mo35242l()), (zzdd) null);
            return true;
        } else if ((h[0] & Byte.MAX_VALUE) == 3) {
            jc4 b = hc4.m32854b(uq2);
            kc4 f = kc4.mo33065f(b);
            this.f20655n = f;
            this.f20656o = new C8034p1(f, b);
            return true;
        } else if (!m20834j(h)) {
            return true;
        } else {
            C8034p1 p1Var = this.f20656o;
            if (p1Var != null) {
                p1Var.mo34034c(j);
                x1Var.f40981b = this.f20656o;
            }
            Objects.requireNonNull(x1Var.f40980a);
            return false;
        }
    }
}
