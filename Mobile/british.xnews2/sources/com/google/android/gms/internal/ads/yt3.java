package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yt3 extends kp3<yt3, xt3> implements vq3 {
    /* access modifiers changed from: private */
    public static final yt3 zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;

    static {
        yt3 yt3 = new yt3();
        zzb = yt3;
        kp3.m34067t(yt3.class, yt3);
    }

    private yt3() {
    }

    /* renamed from: E */
    public static xt3 m40015E() {
        return (xt3) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m40017H(yt3 yt3, String str) {
        yt3.zze |= 1;
        yt3.zzf = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m40018I(yt3 yt3, long j) {
        yt3.zze |= 2;
        yt3.zzg = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m40019J(yt3 yt3, boolean z) {
        yt3.zze |= 4;
        yt3.zzh = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new yt3();
        } else {
            if (i2 == 4) {
                return new xt3((ys3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
