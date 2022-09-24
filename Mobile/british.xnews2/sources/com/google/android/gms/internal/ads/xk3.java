package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xk3 extends kp3<xk3, wk3> implements vq3 {
    /* access modifiers changed from: private */
    public static final xk3 zzb;
    private String zze = "";

    static {
        xk3 xk3 = new xk3();
        zzb = xk3;
        kp3.m34067t(xk3.class, xk3);
    }

    private xk3() {
    }

    /* renamed from: F */
    public static xk3 m39501F() {
        return zzb;
    }

    /* renamed from: H */
    public static xk3 m39502H(eo3 eo3, wo3 wo3) throws wp3 {
        return (xk3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new xk3();
        } else {
            if (i2 == 4) {
                return new wk3((uk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final String mo35766I() {
        return this.zze;
    }
}
