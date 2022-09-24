package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dt3 extends kp3<dt3, ct3> implements vq3 {
    /* access modifiers changed from: private */
    public static final dt3 zzb;
    private int zze;
    private String zzf = "";

    static {
        dt3 dt3 = new dt3();
        zzb = dt3;
        kp3.m34067t(dt3.class, dt3);
    }

    private dt3() {
    }

    /* renamed from: E */
    public static ct3 m31612E() {
        return (ct3) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m31614H(dt3 dt3, String str) {
        dt3.zze |= 1;
        dt3.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new dt3();
        } else {
            if (i2 == 4) {
                return new ct3((ys3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
