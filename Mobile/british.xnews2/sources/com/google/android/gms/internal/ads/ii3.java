package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ii3 extends kp3<ii3, hi3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ii3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        ii3 ii3 = new ii3();
        zzb = ii3;
        kp3.m34067t(ii3.class, ii3);
    }

    private ii3() {
    }

    /* renamed from: F */
    public static hi3 m33223F() {
        return (hi3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static ii3 m33225I(eo3 eo3, wo3 wo3) throws wp3 {
        return (ii3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ii3();
        } else {
            if (i2 == 4) {
                return new hi3((gi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo32634E() {
        return this.zze;
    }
}
