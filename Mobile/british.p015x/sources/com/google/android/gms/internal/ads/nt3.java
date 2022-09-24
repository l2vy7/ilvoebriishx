package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nt3 extends kp3<nt3, kt3> implements vq3 {
    /* access modifiers changed from: private */
    public static final nt3 zzb;
    private int zze;
    private mt3 zzf;
    private tp3<ft3> zzg = kp3.m34063p();
    private eo3 zzh;
    private eo3 zzi;
    private int zzj;
    private eo3 zzk;
    private byte zzl = 2;

    static {
        nt3 nt3 = new nt3();
        zzb = nt3;
        kp3.m34067t(nt3.class, nt3);
    }

    private nt3() {
        eo3 eo3 = eo3.f31444c;
        this.zzh = eo3;
        this.zzi = eo3;
        this.zzk = eo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 1;
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", ft3.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new nt3();
        } else {
            if (i2 == 4) {
                return new kt3((ys3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzl = b;
            return null;
        }
    }
}
