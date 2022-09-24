package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ug3 extends kp3<ug3, tg3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ug3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private ah3 zzf;
    private qj3 zzg;

    static {
        ug3 ug3 = new ug3();
        zzb = ug3;
        kp3.m34067t(ug3.class, ug3);
    }

    private ug3() {
    }

    /* renamed from: F */
    public static tg3 m38324F() {
        return (tg3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static ug3 m38326I(eo3 eo3, wo3 wo3) throws wp3 {
        return (ug3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: M */
    static /* synthetic */ void m38328M(ug3 ug3, ah3 ah3) {
        ah3.getClass();
        ug3.zzf = ah3;
    }

    /* renamed from: N */
    static /* synthetic */ void m38329N(ug3 ug3, qj3 qj3) {
        qj3.getClass();
        ug3.zzg = qj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new ug3();
        } else {
            if (i2 == 4) {
                return new tg3((sg3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo35189E() {
        return this.zze;
    }

    /* renamed from: J */
    public final ah3 mo35190J() {
        ah3 ah3 = this.zzf;
        return ah3 == null ? ah3.m30324I() : ah3;
    }

    /* renamed from: K */
    public final qj3 mo35191K() {
        qj3 qj3 = this.zzg;
        return qj3 == null ? qj3.m36486I() : qj3;
    }
}
