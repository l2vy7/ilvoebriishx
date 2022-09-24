package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8361y8 extends kp3<C8361y8, C8325x8> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8361y8 zzb;
    private int zze;
    private eo3 zzf;
    private eo3 zzg;
    private eo3 zzh;
    private eo3 zzi;

    static {
        C8361y8 y8Var = new C8361y8();
        zzb = y8Var;
        kp3.m34067t(C8361y8.class, y8Var);
    }

    private C8361y8() {
        eo3 eo3 = eo3.f31444c;
        this.zzf = eo3;
        this.zzg = eo3;
        this.zzh = eo3;
        this.zzi = eo3;
    }

    /* renamed from: E */
    public static C8325x8 m39793E() {
        return (C8325x8) zzb.mo33147w();
    }

    /* renamed from: H */
    public static C8361y8 m39795H(byte[] bArr, wo3 wo3) throws wp3 {
        return (C8361y8) kp3.m34057C(zzb, bArr, wo3);
    }

    /* renamed from: M */
    static /* synthetic */ void m39796M(C8361y8 y8Var, eo3 eo3) {
        y8Var.zze |= 1;
        y8Var.zzf = eo3;
    }

    /* renamed from: N */
    static /* synthetic */ void m39797N(C8361y8 y8Var, eo3 eo3) {
        y8Var.zze |= 2;
        y8Var.zzg = eo3;
    }

    /* renamed from: O */
    static /* synthetic */ void m39798O(C8361y8 y8Var, eo3 eo3) {
        y8Var.zze |= 4;
        y8Var.zzh = eo3;
    }

    /* renamed from: P */
    static /* synthetic */ void m39799P(C8361y8 y8Var, eo3 eo3) {
        y8Var.zze |= 8;
        y8Var.zzi = eo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C8361y8();
        } else {
            if (i2 == 4) {
                return new C8325x8((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final eo3 mo35887I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final eo3 mo35888J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final eo3 mo35889K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final eo3 mo35890L() {
        return this.zzh;
    }
}
