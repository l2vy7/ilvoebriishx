package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dh3 extends kp3<dh3, ch3> implements vq3 {
    /* access modifiers changed from: private */
    public static final dh3 zzb;
    private gh3 zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        dh3 dh3 = new dh3();
        zzb = dh3;
        kp3.m34067t(dh3.class, dh3);
    }

    private dh3() {
    }

    /* renamed from: F */
    public static ch3 m31399F() {
        return (ch3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static dh3 m31401I() {
        return zzb;
    }

    /* renamed from: J */
    public static dh3 m31402J(eo3 eo3, wo3 wo3) throws wp3 {
        return (dh3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: L */
    static /* synthetic */ void m31403L(dh3 dh3, gh3 gh3) {
        gh3.getClass();
        dh3.zze = gh3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new dh3();
        } else {
            if (i2 == 4) {
                return new ch3((bh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo31256E() {
        return this.zzf;
    }

    /* renamed from: K */
    public final gh3 mo31257K() {
        gh3 gh3 = this.zze;
        return gh3 == null ? gh3.m32521I() : gh3;
    }
}
