package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xg3 extends kp3<xg3, wg3> implements vq3 {
    /* access modifiers changed from: private */
    public static final xg3 zzb;
    private dh3 zze;
    private tj3 zzf;

    static {
        xg3 xg3 = new xg3();
        zzb = xg3;
        kp3.m34067t(xg3.class, xg3);
    }

    private xg3() {
    }

    /* renamed from: E */
    public static wg3 m39460E() {
        return (wg3) zzb.mo33147w();
    }

    /* renamed from: H */
    public static xg3 m39462H(eo3 eo3, wo3 wo3) throws wp3 {
        return (xg3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: K */
    static /* synthetic */ void m39463K(xg3 xg3, dh3 dh3) {
        dh3.getClass();
        xg3.zze = dh3;
    }

    /* renamed from: L */
    static /* synthetic */ void m39464L(xg3 xg3, tj3 tj3) {
        tj3.getClass();
        xg3.zzf = tj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new xg3();
        } else {
            if (i2 == 4) {
                return new wg3((vg3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final dh3 mo35754I() {
        dh3 dh3 = this.zze;
        return dh3 == null ? dh3.m31401I() : dh3;
    }

    /* renamed from: J */
    public final tj3 mo35755J() {
        tj3 tj3 = this.zzf;
        return tj3 == null ? tj3.m37872I() : tj3;
    }
}
