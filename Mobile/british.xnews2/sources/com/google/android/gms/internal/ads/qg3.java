package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qg3 extends kp3<qg3, pg3> implements vq3 {
    /* access modifiers changed from: private */
    public static final qg3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        qg3 qg3 = new qg3();
        zzb = qg3;
        kp3.m34067t(qg3.class, qg3);
    }

    private qg3() {
    }

    /* renamed from: F */
    public static pg3 m36465F() {
        return (pg3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static qg3 m36467I() {
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
            return new qg3();
        } else {
            if (i2 == 4) {
                return new pg3((og3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo34342E() {
        return this.zze;
    }
}
