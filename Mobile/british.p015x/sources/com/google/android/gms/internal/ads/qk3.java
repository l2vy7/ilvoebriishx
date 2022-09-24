package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qk3 extends kp3<qk3, nk3> implements vq3 {
    /* access modifiers changed from: private */
    public static final qk3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private tp3<pk3> zzf = kp3.m34063p();

    static {
        qk3 qk3 = new qk3();
        zzb = qk3;
        kp3.m34067t(qk3.class, qk3);
    }

    private qk3() {
    }

    /* renamed from: E */
    public static nk3 m36499E() {
        return (nk3) zzb.mo33147w();
    }

    /* renamed from: I */
    static /* synthetic */ void m36502I(qk3 qk3, pk3 pk3) {
        pk3.getClass();
        tp3<pk3> tp3 = qk3.zzf;
        if (!tp3.zzc()) {
            qk3.zzf = kp3.m34064q(tp3);
        }
        qk3.zzf.add(pk3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", pk3.class});
        } else if (i2 == 3) {
            return new qk3();
        } else {
            if (i2 == 4) {
                return new nk3((mk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
