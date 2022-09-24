package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ft3 extends kp3<ft3, et3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ft3 zzb;
    private int zze;
    private eo3 zzf;
    private eo3 zzg;
    private byte zzh = 2;

    static {
        ft3 ft3 = new ft3();
        zzb = ft3;
        kp3.m34067t(ft3.class, ft3);
    }

    private ft3() {
        eo3 eo3 = eo3.f31444c;
        this.zzf = eo3;
        this.zzg = eo3;
    }

    /* renamed from: E */
    public static et3 m32249E() {
        return (et3) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m32251H(ft3 ft3, eo3 eo3) {
        ft3.zze |= 1;
        ft3.zzf = eo3;
    }

    /* renamed from: I */
    static /* synthetic */ void m32252I(ft3 ft3, eo3 eo3) {
        ft3.zze |= 2;
        ft3.zzg = eo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new ft3();
        } else {
            if (i2 == 4) {
                return new et3((ys3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
