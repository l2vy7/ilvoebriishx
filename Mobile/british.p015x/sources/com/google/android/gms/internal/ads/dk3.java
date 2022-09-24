package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dk3 extends kp3<dk3, ck3> implements vq3 {
    /* access modifiers changed from: private */
    public static final dk3 zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public eo3 zzf = eo3.f31444c;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        dk3 dk3 = new dk3();
        zzb = dk3;
        kp3.m34067t(dk3.class, dk3);
    }

    private dk3() {
    }

    /* renamed from: E */
    public static ck3 m31453E() {
        return (ck3) zzb.mo33147w();
    }

    /* renamed from: H */
    public static dk3 m31455H() {
        return zzb;
    }

    /* renamed from: K */
    static /* synthetic */ void m31456K(dk3 dk3, String str) {
        str.getClass();
        dk3.zze = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new dk3();
        } else {
            if (i2 == 4) {
                return new ck3((bk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final eo3 mo31286I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String mo31287J() {
        return this.zze;
    }

    /* renamed from: M */
    public final int mo31288M() {
        int b = fl3.m32202b(this.zzg);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
