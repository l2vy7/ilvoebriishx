package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ng3 extends kp3<ng3, mg3> implements vq3 {
    /* access modifiers changed from: private */
    public static final ng3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private qg3 zzf;

    static {
        ng3 ng3 = new ng3();
        zzb = ng3;
        kp3.m34067t(ng3.class, ng3);
    }

    private ng3() {
    }

    /* renamed from: F */
    public static mg3 m35148F() {
        return (mg3) zzb.mo33147w();
    }

    /* renamed from: I */
    public static ng3 m35150I(eo3 eo3, wo3 wo3) throws wp3 {
        return (ng3) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: L */
    static /* synthetic */ void m35152L(ng3 ng3, qg3 qg3) {
        qg3.getClass();
        ng3.zzf = qg3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ng3();
        } else {
            if (i2 == 4) {
                return new mg3((lg3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final int mo33696E() {
        return this.zze;
    }

    /* renamed from: J */
    public final qg3 mo33697J() {
        qg3 qg3 = this.zzf;
        return qg3 == null ? qg3.m36467I() : qg3;
    }
}
