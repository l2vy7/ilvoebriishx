package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dj3 extends kp3<dj3, cj3> implements vq3 {
    /* access modifiers changed from: private */
    public static final dj3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private gj3 zzf;
    /* access modifiers changed from: private */
    public eo3 zzg = eo3.f31444c;

    static {
        dj3 dj3 = new dj3();
        zzb = dj3;
        kp3.m34067t(dj3.class, dj3);
    }

    private dj3() {
    }

    /* renamed from: F */
    public static cj3 m31420F() {
        return (cj3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static dj3 m31422I(eo3 eo3, wo3 wo3) throws wp3 {
        return (dj3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: M */
    static /* synthetic */ void m31424M(dj3 dj3, gj3 gj3) {
        gj3.getClass();
        dj3.zzf = gj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new dj3();
        } else {
            if (i2 == 4) {
                return new cj3((bj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo31266E() {
        return this.zze;
    }

    /* renamed from: J */
    public final gj3 mo31267J() {
        gj3 gj3 = this.zzf;
        return gj3 == null ? gj3.m32553J() : gj3;
    }

    /* renamed from: K */
    public final eo3 mo31268K() {
        return this.zzg;
    }
}
