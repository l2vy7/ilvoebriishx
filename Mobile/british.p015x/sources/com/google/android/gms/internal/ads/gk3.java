package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gk3 extends kp3<gk3, fk3> implements vq3 {
    /* access modifiers changed from: private */
    public static final gk3 zzb;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        gk3 gk3 = new gk3();
        zzb = gk3;
        kp3.m34067t(gk3.class, gk3);
    }

    private gk3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new gk3();
        } else {
            if (i2 == 4) {
                return new fk3((ek3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo32155E() {
        return this.zzg;
    }

    /* renamed from: H */
    public final String mo32156H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final String mo32157I() {
        return this.zze;
    }

    /* renamed from: J */
    public final String mo32158J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final boolean mo32159K() {
        return this.zzh;
    }
}
