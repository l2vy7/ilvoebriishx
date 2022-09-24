package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cg3 extends vc3<qj3> {
    public cg3() {
        super(qj3.class, new ag3(zc3.class));
    }

    /* renamed from: l */
    public static final void m31012l(qj3 qj3) throws GeneralSecurityException {
        gn3.m32591b(qj3.mo34349E(), 0);
        if (qj3.mo34351L().mo30457q() >= 16) {
            m31014n(qj3.mo34350K());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ sc3 m31013m(int i, int i2, int i3, int i4) {
        sj3 F = tj3.m37870F();
        wj3 F2 = xj3.m39491F();
        F2.mo35638B(i3);
        F2.mo35639y(i2);
        F.mo34713B((xj3) F2.mo32424p());
        F.mo34714y(i);
        return new sc3((tj3) F.mo32424p(), i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m31014n(xj3 xj3) throws GeneralSecurityException {
        if (xj3.mo35764E() >= 10) {
            int K = xj3.mo35765K() - 2;
            if (K != 1) {
                if (K != 2) {
                    if (K != 3) {
                        if (K != 4) {
                            if (K != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (xj3.mo35764E() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (xj3.mo35764E() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (xj3.mo35764E() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (xj3.mo35764E() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (xj3.mo35764E() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final tc3<tj3, qj3> mo30893a() {
        return new bg3(this, tj3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ uq3 mo30894b(eo3 eo3) throws wp3 {
        return qj3.m36487J(eo3, wo3.m39219a());
    }

    /* renamed from: f */
    public final String mo30895f() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo30896h(uq3 uq3) throws GeneralSecurityException {
        m31012l((qj3) uq3);
    }

    /* renamed from: i */
    public final int mo30923i() {
        return 2;
    }

    /* renamed from: j */
    public final int mo30897j() {
        return 3;
    }
}
