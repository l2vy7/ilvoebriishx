package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ak3 extends kp3<ak3, zj3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ak3 zzb;
    /* access modifiers changed from: private */
    public String zze = "";
    /* access modifiers changed from: private */
    public eo3 zzf = eo3.f31444c;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        ak3 ak3 = new ak3();
        zzb = ak3;
        kp3.m34067t(ak3.class, ak3);
    }

    private ak3() {
    }

    /* renamed from: E */
    public static zj3 m30368E() {
        return (zj3) zzb.mo33147w();
    }

    /* renamed from: H */
    public static ak3 m30370H() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new ak3();
        } else {
            if (i2 == 4) {
                return new zj3((yj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final eo3 mo30408I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String mo30409J() {
        return this.zze;
    }

    /* renamed from: M */
    public final int mo30410M() {
        int i = this.zzg;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
