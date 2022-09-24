package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class li3 extends kp3<li3, ki3> implements vq3 {
    /* access modifiers changed from: private */
    public static final li3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public eo3 zzf = eo3.f31444c;

    static {
        li3 li3 = new li3();
        zzb = li3;
        kp3.m34067t(li3.class, li3);
    }

    private li3() {
    }

    /* renamed from: F */
    public static ki3 m34474F() {
        return (ki3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static li3 m34476I(eo3 eo3, wo3 wo3) throws wp3 {
        return (li3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new li3();
        } else {
            if (i2 == 4) {
                return new ki3((ji3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo33341E() {
        return this.zze;
    }

    /* renamed from: J */
    public final eo3 mo33342J() {
        return this.zzf;
    }
}
