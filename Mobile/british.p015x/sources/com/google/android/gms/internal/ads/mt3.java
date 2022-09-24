package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mt3 extends kp3<mt3, lt3> implements vq3 {
    /* access modifiers changed from: private */
    public static final mt3 zzb;
    private int zze;
    private int zzf;
    private eo3 zzg;
    private eo3 zzh;

    static {
        mt3 mt3 = new mt3();
        zzb = mt3;
        kp3.m34067t(mt3.class, mt3);
    }

    private mt3() {
        eo3 eo3 = eo3.f31444c;
        this.zzg = eo3;
        this.zzh = eo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new mt3();
        } else {
            if (i2 == 4) {
                return new lt3((ys3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
