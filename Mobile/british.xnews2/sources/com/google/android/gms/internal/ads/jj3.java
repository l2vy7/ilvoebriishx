package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jj3 extends kp3<jj3, ij3> implements vq3 {
    /* access modifiers changed from: private */
    public static final jj3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public eo3 zzg = eo3.f31444c;

    static {
        jj3 jj3 = new jj3();
        zzb = jj3;
        kp3.m34067t(jj3.class, jj3);
    }

    private jj3() {
    }

    /* renamed from: E */
    public static ij3 m33624E() {
        return (ij3) zzb.mo33147w();
    }

    /* renamed from: H */
    public static jj3 m33626H() {
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
            return kp3.m34066s(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new jj3();
        } else {
            if (i2 == 4) {
                return new ij3((hj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final eo3 mo32899I() {
        return this.zzg;
    }

    /* renamed from: K */
    public final int mo32900K() {
        int i = this.zze;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: L */
    public final int mo32901L() {
        int b = nj3.m35192b(this.zzf);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
