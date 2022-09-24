package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pk3 extends kp3<pk3, ok3> implements vq3 {
    /* access modifiers changed from: private */
    public static final pk3 zzb;
    private String zze = "";
    private int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        pk3 pk3 = new pk3();
        zzb = pk3;
        kp3.m34067t(pk3.class, pk3);
    }

    private pk3() {
    }

    /* renamed from: E */
    public static ok3 m36118E() {
        return (ok3) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m36120H(pk3 pk3, String str) {
        str.getClass();
        pk3.zze = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m36123K(pk3 pk3, int i) {
        if (i != 1) {
            pk3.zzf = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new pk3();
        } else {
            if (i2 == 4) {
                return new ok3((mk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
