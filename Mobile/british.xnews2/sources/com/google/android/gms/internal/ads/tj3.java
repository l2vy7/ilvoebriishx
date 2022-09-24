package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tj3 extends kp3<tj3, sj3> implements vq3 {
    /* access modifiers changed from: private */
    public static final tj3 zzb;
    private xj3 zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        tj3 tj3 = new tj3();
        zzb = tj3;
        kp3.m34067t(tj3.class, tj3);
    }

    private tj3() {
    }

    /* renamed from: F */
    public static sj3 m37870F() {
        return (sj3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static tj3 m37872I() {
        return zzb;
    }

    /* renamed from: J */
    public static tj3 m37873J(eo3 eo3, wo3 wo3) throws wp3 {
        return (tj3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: L */
    static /* synthetic */ void m37874L(tj3 tj3, xj3 xj3) {
        xj3.getClass();
        tj3.zze = xj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new tj3();
        } else {
            if (i2 == 4) {
                return new sj3((rj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo34966E() {
        return this.zzf;
    }

    /* renamed from: K */
    public final xj3 mo34967K() {
        xj3 xj3 = this.zze;
        return xj3 == null ? xj3.m39493I() : xj3;
    }
}
