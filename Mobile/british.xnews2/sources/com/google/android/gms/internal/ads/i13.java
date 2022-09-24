package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i13 extends kp3<i13, h13> implements vq3 {
    private static final qp3<Integer, Object> zzb = new f13();
    /* access modifiers changed from: private */
    public static final i13 zze;
    private int zzf;
    private pp3 zzg = kp3.m34060m();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        i13 i13 = new i13();
        zze = i13;
        kp3.m34067t(i13.class, i13);
    }

    private i13() {
    }

    /* renamed from: E */
    public static h13 m33014E() {
        return (h13) zze.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m33016H(i13 i13, String str) {
        str.getClass();
        i13.zzf |= 1;
        i13.zzh = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m33017I(i13 i13, int i) {
        pp3 pp3 = i13.zzg;
        if (!pp3.zzc()) {
            i13.zzg = kp3.m34061n(pp3);
        }
        i13.zzg.mo33382p(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", g13.f32097a, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new i13();
        } else {
            if (i2 == 4) {
                return new h13((f13) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
