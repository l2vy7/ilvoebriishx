package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jt3 extends kp3<jt3, gt3> implements vq3 {
    /* access modifiers changed from: private */
    public static final jt3 zzb;
    private int zze;
    private it3 zzf;
    private tp3<ft3> zzg = kp3.m34063p();
    private eo3 zzh;
    private eo3 zzi;
    private int zzj;
    private byte zzk = 2;

    static {
        jt3 jt3 = new jt3();
        zzb = jt3;
        kp3.m34067t(jt3.class, jt3);
    }

    private jt3() {
        eo3 eo3 = eo3.f31444c;
        this.zzh = eo3;
        this.zzi = eo3;
    }

    /* renamed from: E */
    public static gt3 m33755E() {
        return (gt3) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m33757H(jt3 jt3, ft3 ft3) {
        ft3.getClass();
        tp3<ft3> tp3 = jt3.zzg;
        if (!tp3.zzc()) {
            jt3.zzg = kp3.m34064q(tp3);
        }
        jt3.zzg.add(ft3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b = 1;
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", ft3.class, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new jt3();
        } else {
            if (i2 == 4) {
                return new gt3((ys3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzk = b;
            return null;
        }
    }
}
