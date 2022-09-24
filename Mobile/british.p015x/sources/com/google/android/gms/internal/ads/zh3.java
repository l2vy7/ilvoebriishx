package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zh3 extends kp3<zh3, yh3> implements vq3 {
    /* access modifiers changed from: private */
    public static final zh3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public eo3 zzf = eo3.f31444c;

    static {
        zh3 zh3 = new zh3();
        zzb = zh3;
        kp3.m34067t(zh3.class, zh3);
    }

    private zh3() {
    }

    /* renamed from: F */
    public static yh3 m40345F() {
        return (yh3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static zh3 m40347I(eo3 eo3, wo3 wo3) throws wp3 {
        return (zh3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zh3();
        } else {
            if (i2 == 4) {
                return new yh3((xh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo36061E() {
        return this.zze;
    }

    /* renamed from: J */
    public final eo3 mo36062J() {
        return this.zzf;
    }
}
