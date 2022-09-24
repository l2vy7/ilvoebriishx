package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ar */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7513ar extends kp3<C7513ar, C8236uq> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7513ar zzb;
    private tp3<C8200tq> zze = kp3.m34063p();

    static {
        C7513ar arVar = new C7513ar();
        zzb = arVar;
        kp3.m34067t(C7513ar.class, arVar);
    }

    private C7513ar() {
    }

    /* renamed from: E */
    public static C8236uq m30443E() {
        return (C8236uq) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m30445H(C7513ar arVar, C8200tq tqVar) {
        tqVar.getClass();
        tp3<C8200tq> tp3 = arVar.zze;
        if (!tp3.zzc()) {
            arVar.zze = kp3.m34064q(tp3);
        }
        arVar.zze.add(tqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C8200tq.class});
        } else if (i2 == 3) {
            return new C7513ar();
        } else {
            if (i2 == 4) {
                return new C8236uq((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
