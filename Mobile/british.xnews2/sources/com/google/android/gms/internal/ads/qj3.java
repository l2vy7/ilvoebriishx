package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qj3 extends kp3<qj3, pj3> implements vq3 {
    /* access modifiers changed from: private */
    public static final qj3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private xj3 zzf;
    /* access modifiers changed from: private */
    public eo3 zzg = eo3.f31444c;

    static {
        qj3 qj3 = new qj3();
        zzb = qj3;
        kp3.m34067t(qj3.class, qj3);
    }

    private qj3() {
    }

    /* renamed from: F */
    public static pj3 m36484F() {
        return (pj3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static qj3 m36486I() {
        return zzb;
    }

    /* renamed from: J */
    public static qj3 m36487J(eo3 eo3, wo3 wo3) throws wp3 {
        return (qj3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: N */
    static /* synthetic */ void m36489N(qj3 qj3, xj3 xj3) {
        xj3.getClass();
        qj3.zzf = xj3;
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
            return new qj3();
        } else {
            if (i2 == 4) {
                return new pj3((oj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo34349E() {
        return this.zze;
    }

    /* renamed from: K */
    public final xj3 mo34350K() {
        xj3 xj3 = this.zzf;
        return xj3 == null ? xj3.m39493I() : xj3;
    }

    /* renamed from: L */
    public final eo3 mo34351L() {
        return this.zzg;
    }
}
