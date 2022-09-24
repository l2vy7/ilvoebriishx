package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ox2 extends kp3<ox2, lx2> implements vq3 {
    /* access modifiers changed from: private */
    public static final ox2 zzb;
    /* access modifiers changed from: private */
    public tp3<nx2> zze = kp3.m34063p();

    static {
        ox2 ox2 = new ox2();
        zzb = ox2;
        kp3.m34067t(ox2.class, ox2);
    }

    private ox2() {
    }

    /* renamed from: F */
    public static lx2 m35895F() {
        return (lx2) zzb.mo33147w();
    }

    /* renamed from: J */
    static /* synthetic */ void m35898J(ox2 ox2, nx2 nx2) {
        nx2.getClass();
        tp3<nx2> tp3 = ox2.zze;
        if (!tp3.zzc()) {
            ox2.zze = kp3.m34064q(tp3);
        }
        ox2.zze.add(nx2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", nx2.class});
        } else if (i2 == 3) {
            return new ox2();
        } else {
            if (i2 == 4) {
                return new lx2((kx2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo34021E() {
        return this.zze.size();
    }
}
