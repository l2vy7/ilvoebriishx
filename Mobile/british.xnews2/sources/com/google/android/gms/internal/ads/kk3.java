package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kk3 extends kp3<kk3, jk3> implements vq3 {
    /* access modifiers changed from: private */
    public static final kk3 zzb;
    private ak3 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        kk3 kk3 = new kk3();
        zzb = kk3;
        kp3.m34067t(kk3.class, kk3);
    }

    private kk3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new kk3();
        } else {
            if (i2 == 4) {
                return new jk3((hk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo33104E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final ak3 mo33105F() {
        ak3 ak3 = this.zze;
        return ak3 == null ? ak3.m30370H() : ak3;
    }

    /* renamed from: I */
    public final boolean mo33106I() {
        return this.zze != null;
    }

    /* renamed from: J */
    public final int mo33107J() {
        int i = this.zzf;
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

    /* renamed from: K */
    public final int mo33108K() {
        int b = fl3.m32202b(this.zzh);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
