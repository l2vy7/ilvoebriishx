package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qt3 extends kp3<qt3, ot3> implements vq3 {
    /* access modifiers changed from: private */
    public static final qt3 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private eo3 zzh = eo3.f31444c;

    static {
        qt3 qt3 = new qt3();
        zzb = qt3;
        kp3.m34067t(qt3.class, qt3);
    }

    private qt3() {
    }

    /* renamed from: E */
    public static ot3 m36738E() {
        return (ot3) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m36740H(qt3 qt3, String str) {
        qt3.zze |= 2;
        qt3.zzg = "image/png";
    }

    /* renamed from: I */
    static /* synthetic */ void m36741I(qt3 qt3, eo3 eo3) {
        eo3.getClass();
        qt3.zze |= 4;
        qt3.zzh = eo3;
    }

    /* renamed from: J */
    static /* synthetic */ void m36742J(qt3 qt3, int i) {
        qt3.zzf = 1;
        qt3.zze = 1 | qt3.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", pt3.f37767a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new qt3();
        } else {
            if (i2 == 4) {
                return new ot3((ys3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
