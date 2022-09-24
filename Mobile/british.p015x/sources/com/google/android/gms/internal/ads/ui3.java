package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ui3 extends kp3<ui3, si3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ui3 zzb;
    private dk3 zze;

    static {
        ui3 ui3 = new ui3();
        zzb = ui3;
        kp3.m34067t(ui3.class, ui3);
    }

    private ui3() {
    }

    /* renamed from: E */
    public static si3 m38334E() {
        return (si3) zzb.mo33147w();
    }

    /* renamed from: H */
    public static ui3 m38336H() {
        return zzb;
    }

    /* renamed from: J */
    static /* synthetic */ void m38337J(ui3 ui3, dk3 dk3) {
        dk3.getClass();
        ui3.zze = dk3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new ui3();
        } else {
            if (i2 == 4) {
                return new si3((ri3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final dk3 mo35194I() {
        dk3 dk3 = this.zze;
        return dk3 == null ? dk3.m31455H() : dk3;
    }
}
