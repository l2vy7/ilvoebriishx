package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nx2 extends kp3<nx2, mx2> implements vq3 {
    /* access modifiers changed from: private */
    public static final nx2 zzb;
    private jx2 zze;

    static {
        nx2 nx2 = new nx2();
        zzb = nx2;
        kp3.m34067t(nx2.class, nx2);
    }

    private nx2() {
    }

    /* renamed from: E */
    public static mx2 m35449E() {
        return (mx2) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m35451H(nx2 nx2, jx2 jx2) {
        jx2.getClass();
        nx2.zze = jx2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new nx2();
        } else {
            if (i2 == 4) {
                return new mx2((kx2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
