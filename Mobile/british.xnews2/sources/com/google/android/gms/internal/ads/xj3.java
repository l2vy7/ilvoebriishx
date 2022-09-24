package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xj3 extends kp3<xj3, wj3> implements vq3 {
    /* access modifiers changed from: private */
    public static final xj3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        xj3 xj3 = new xj3();
        zzb = xj3;
        kp3.m34067t(xj3.class, xj3);
    }

    private xj3() {
    }

    /* renamed from: F */
    public static wj3 m39491F() {
        return (wj3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static xj3 m39493I() {
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
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new xj3();
        } else {
            if (i2 == 4) {
                return new wj3((vj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo35764E() {
        return this.zzf;
    }

    /* renamed from: K */
    public final int mo35765K() {
        int b = nj3.m35192b(this.zze);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
