package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ah3 extends kp3<ah3, zg3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ah3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private gh3 zzf;
    /* access modifiers changed from: private */
    public eo3 zzg = eo3.f31444c;

    static {
        ah3 ah3 = new ah3();
        zzb = ah3;
        kp3.m34067t(ah3.class, ah3);
    }

    private ah3() {
    }

    /* renamed from: F */
    public static zg3 m30322F() {
        return (zg3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static ah3 m30324I() {
        return zzb;
    }

    /* renamed from: J */
    public static ah3 m30325J(eo3 eo3, wo3 wo3) throws wp3 {
        return (ah3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: N */
    static /* synthetic */ void m30327N(ah3 ah3, gh3 gh3) {
        gh3.getClass();
        ah3.zzf = gh3;
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
            return new ah3();
        } else {
            if (i2 == 4) {
                return new zg3((yg3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo30380E() {
        return this.zze;
    }

    /* renamed from: K */
    public final gh3 mo30381K() {
        gh3 gh3 = this.zzf;
        return gh3 == null ? gh3.m32521I() : gh3;
    }

    /* renamed from: L */
    public final eo3 mo30382L() {
        return this.zzg;
    }
}
