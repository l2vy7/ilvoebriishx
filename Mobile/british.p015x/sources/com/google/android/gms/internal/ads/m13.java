package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m13 extends kp3<m13, k13> implements vq3 {
    /* access modifiers changed from: private */
    public static final m13 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private i13 zzi;

    static {
        m13 m13 = new m13();
        zzb = m13;
        kp3.m34067t(m13.class, m13);
    }

    private m13() {
    }

    /* renamed from: E */
    public static k13 m34642E() {
        return (k13) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m34644H(m13 m13, String str) {
        str.getClass();
        m13.zze |= 2;
        m13.zzg = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m34645I(m13 m13, i13 i13) {
        i13.getClass();
        m13.zzi = i13;
        m13.zze |= 8;
    }

    /* renamed from: J */
    static /* synthetic */ void m34646J(m13 m13, int i) {
        m13.zzf = 1;
        m13.zze = 1 | m13.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", l13.f34787a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new m13();
        } else {
            if (i2 == 4) {
                return new k13((j13) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
