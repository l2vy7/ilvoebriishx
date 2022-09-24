package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rr */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8131rr extends kp3<C8131rr, C8060pr> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8131rr zzb;
    private int zze;
    private int zzf;
    private C7769ht zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        C8131rr rrVar = new C8131rr();
        zzb = rrVar;
        kp3.m34067t(C8131rr.class, rrVar);
    }

    private C8131rr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", C8096qr.f38257a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C8131rr();
        } else {
            if (i2 == 4) {
                return new C8060pr((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
