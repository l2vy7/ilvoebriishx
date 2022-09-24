package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gj3 extends kp3<gj3, fj3> implements vq3 {
    /* access modifiers changed from: private */
    public static final gj3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private aj3 zzf;
    /* access modifiers changed from: private */
    public eo3 zzg;
    /* access modifiers changed from: private */
    public eo3 zzh;

    static {
        gj3 gj3 = new gj3();
        zzb = gj3;
        kp3.m34067t(gj3.class, gj3);
    }

    private gj3() {
        eo3 eo3 = eo3.f31444c;
        this.zzg = eo3;
        this.zzh = eo3;
    }

    /* renamed from: H */
    public static fj3 m32551H() {
        return (fj3) zzb.mo33147w();
    }

    /* renamed from: J */
    public static gj3 m32553J() {
        return zzb;
    }

    /* renamed from: K */
    public static gj3 m32554K(eo3 eo3, wo3 wo3) throws wp3 {
        return (gj3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: O */
    static /* synthetic */ void m32556O(gj3 gj3, aj3 aj3) {
        aj3.getClass();
        gj3.zzf = aj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new gj3();
        } else {
            if (i2 == 4) {
                return new fj3((ej3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo32150E() {
        return this.zze;
    }

    /* renamed from: F */
    public final aj3 mo32151F() {
        aj3 aj3 = this.zzf;
        return aj3 == null ? aj3.m30345I() : aj3;
    }

    /* renamed from: L */
    public final eo3 mo32152L() {
        return this.zzg;
    }

    /* renamed from: M */
    public final eo3 mo32153M() {
        return this.zzh;
    }
}
