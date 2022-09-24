package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lk3 extends kp3<lk3, ik3> implements vq3 {
    /* access modifiers changed from: private */
    public static final lk3 zzb;
    private int zze;
    private tp3<kk3> zzf = kp3.m34063p();

    static {
        lk3 lk3 = new lk3();
        zzb = lk3;
        kp3.m34067t(lk3.class, lk3);
    }

    private lk3() {
    }

    /* renamed from: I */
    public static lk3 m34487I(byte[] bArr, wo3 wo3) throws wp3 {
        return (lk3) kp3.m34057C(zzb, bArr, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", kk3.class});
        } else if (i2 == 3) {
            return new lk3();
        } else {
            if (i2 == 4) {
                return new ik3((hk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo33348E() {
        return this.zzf.size();
    }

    /* renamed from: F */
    public final int mo33349F() {
        return this.zze;
    }

    /* renamed from: J */
    public final List<kk3> mo33350J() {
        return this.zzf;
    }
}
