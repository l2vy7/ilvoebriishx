package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gh3 extends kp3<gh3, fh3> implements vq3 {
    /* access modifiers changed from: private */
    public static final gh3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        gh3 gh3 = new gh3();
        zzb = gh3;
        kp3.m34067t(gh3.class, gh3);
    }

    private gh3() {
    }

    /* renamed from: F */
    public static fh3 m32519F() {
        return (fh3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static gh3 m32521I() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new gh3();
        } else {
            if (i2 == 4) {
                return new fh3((eh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo32129E() {
        return this.zze;
    }
}
