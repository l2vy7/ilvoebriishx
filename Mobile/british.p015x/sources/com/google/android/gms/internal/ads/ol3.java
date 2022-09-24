package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ol3 extends kp3<ol3, nl3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ol3 zzb;
    private int zze;

    static {
        ol3 ol3 = new ol3();
        zzb = ol3;
        kp3.m34067t(ol3.class, ol3);
    }

    private ol3() {
    }

    /* renamed from: F */
    public static ol3 m35757F() {
        return zzb;
    }

    /* renamed from: H */
    public static ol3 m35758H(eo3 eo3, wo3 wo3) throws wp3 {
        return (ol3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new ol3();
        } else {
            if (i2 == 4) {
                return new nl3((ml3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
