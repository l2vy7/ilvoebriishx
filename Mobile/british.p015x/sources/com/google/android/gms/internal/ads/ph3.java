package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ph3 extends kp3<ph3, oh3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ph3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        ph3 ph3 = new ph3();
        zzb = ph3;
        kp3.m34067t(ph3.class, ph3);
    }

    private ph3() {
    }

    /* renamed from: F */
    public static oh3 m36076F() {
        return (oh3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static ph3 m36078I() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new ph3();
        } else {
            if (i2 == 4) {
                return new oh3((nh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo34126E() {
        return this.zze;
    }
}
