package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tk3 extends kp3<tk3, sk3> implements vq3 {
    /* access modifiers changed from: private */
    public static final tk3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private xk3 zzf;

    static {
        tk3 tk3 = new tk3();
        zzb = tk3;
        kp3.m34067t(tk3.class, tk3);
    }

    private tk3() {
    }

    /* renamed from: F */
    public static sk3 m37888F() {
        return (sk3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static tk3 m37890I(eo3 eo3, wo3 wo3) throws wp3 {
        return (tk3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: L */
    static /* synthetic */ void m37892L(tk3 tk3, xk3 xk3) {
        xk3.getClass();
        tk3.zzf = xk3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new tk3();
        } else {
            if (i2 == 4) {
                return new sk3((rk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo34976E() {
        return this.zze;
    }

    /* renamed from: J */
    public final xk3 mo34977J() {
        xk3 xk3 = this.zzf;
        return xk3 == null ? xk3.m39501F() : xk3;
    }
}
