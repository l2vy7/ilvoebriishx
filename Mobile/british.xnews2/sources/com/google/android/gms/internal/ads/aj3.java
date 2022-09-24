package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class aj3 extends kp3<aj3, zi3> implements vq3 {
    /* access modifiers changed from: private */
    public static final aj3 zzb;
    private jj3 zze;
    private ui3 zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        aj3 aj3 = new aj3();
        zzb = aj3;
        kp3.m34067t(aj3.class, aj3);
    }

    private aj3() {
    }

    /* renamed from: F */
    public static zi3 m30343F() {
        return (zi3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static aj3 m30345I() {
        return zzb;
    }

    /* renamed from: K */
    static /* synthetic */ void m30346K(aj3 aj3, jj3 jj3) {
        jj3.getClass();
        aj3.zze = jj3;
    }

    /* renamed from: L */
    static /* synthetic */ void m30347L(aj3 aj3, ui3 ui3) {
        ui3.getClass();
        aj3.zzf = ui3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new aj3();
        } else {
            if (i2 == 4) {
                return new zi3((yi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final ui3 mo30393E() {
        ui3 ui3 = this.zzf;
        return ui3 == null ? ui3.m38336H() : ui3;
    }

    /* renamed from: J */
    public final jj3 mo30394J() {
        jj3 jj3 = this.zze;
        return jj3 == null ? jj3.m33626H() : jj3;
    }

    /* renamed from: M */
    public final int mo30395M() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
