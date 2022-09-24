package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ll3 extends kp3<ll3, kl3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ll3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public eo3 zzf = eo3.f31444c;

    static {
        ll3 ll3 = new ll3();
        zzb = ll3;
        kp3.m34067t(ll3.class, ll3);
    }

    private ll3() {
    }

    /* renamed from: F */
    public static kl3 m34493F() {
        return (kl3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static ll3 m34495I(eo3 eo3, wo3 wo3) throws wp3 {
        return (ll3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ll3();
        } else {
            if (i2 == 4) {
                return new kl3((jl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo33352E() {
        return this.zze;
    }

    /* renamed from: J */
    public final eo3 mo33353J() {
        return this.zzf;
    }
}
