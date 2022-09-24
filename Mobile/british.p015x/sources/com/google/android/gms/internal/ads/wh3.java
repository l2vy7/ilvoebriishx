package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wh3 extends kp3<wh3, vh3> implements vq3 {
    /* access modifiers changed from: private */
    public static final wh3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        wh3 wh3 = new wh3();
        zzb = wh3;
        kp3.m34067t(wh3.class, wh3);
    }

    private wh3() {
    }

    /* renamed from: F */
    public static vh3 m39174F() {
        return (vh3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static wh3 m39176I(eo3 eo3, wo3 wo3) throws wp3 {
        return (wh3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new wh3();
        } else {
            if (i2 == 4) {
                return new vh3((uh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo35622E() {
        return this.zze;
    }
}
