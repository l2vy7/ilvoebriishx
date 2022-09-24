package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ci3 extends kp3<ci3, bi3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ci3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        ci3 ci3 = new ci3();
        zzb = ci3;
        kp3.m34067t(ci3.class, ci3);
    }

    private ci3() {
    }

    /* renamed from: F */
    public static bi3 m31034F() {
        return (bi3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static ci3 m31036I(eo3 eo3, wo3 wo3) throws wp3 {
        return (ci3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        } else if (i2 == 3) {
            return new ci3();
        } else {
            if (i2 == 4) {
                return new bi3((ai3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo30934E() {
        return this.zze;
    }
}
