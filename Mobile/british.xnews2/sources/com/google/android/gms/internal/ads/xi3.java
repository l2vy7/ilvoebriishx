package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xi3 extends kp3<xi3, wi3> implements vq3 {
    /* access modifiers changed from: private */
    public static final xi3 zzb;
    private aj3 zze;

    static {
        xi3 xi3 = new xi3();
        zzb = xi3;
        kp3.m34067t(xi3.class, xi3);
    }

    private xi3() {
    }

    /* renamed from: E */
    public static wi3 m39480E() {
        return (wi3) zzb.mo33147w();
    }

    /* renamed from: H */
    public static xi3 m39482H(eo3 eo3, wo3 wo3) throws wp3 {
        return (xi3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: J */
    static /* synthetic */ void m39483J(xi3 xi3, aj3 aj3) {
        aj3.getClass();
        xi3.zze = aj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new xi3();
        } else {
            if (i2 == 4) {
                return new wi3((vi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final aj3 mo35759I() {
        aj3 aj3 = this.zze;
        return aj3 == null ? aj3.m30345I() : aj3;
    }
}
