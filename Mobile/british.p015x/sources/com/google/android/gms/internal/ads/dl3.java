package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dl3 extends kp3<dl3, cl3> implements vq3 {
    /* access modifiers changed from: private */
    public static final dl3 zzb;
    private String zze = "";
    private dk3 zzf;

    static {
        dl3 dl3 = new dl3();
        zzb = dl3;
        kp3.m34067t(dl3.class, dl3);
    }

    private dl3() {
    }

    /* renamed from: H */
    public static dl3 m31467H() {
        return zzb;
    }

    /* renamed from: I */
    public static dl3 m31468I(eo3 eo3, wo3 wo3) throws wp3 {
        return (dl3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new dl3();
        } else {
            if (i2 == 4) {
                return new cl3((bl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final dk3 mo31290E() {
        dk3 dk3 = this.zzf;
        return dk3 == null ? dk3.m31455H() : dk3;
    }

    /* renamed from: J */
    public final String mo31291J() {
        return this.zze;
    }

    /* renamed from: K */
    public final boolean mo31292K() {
        return this.zzf != null;
    }
}
