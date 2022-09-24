package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.od */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8011od extends kp3<C8011od, C7975nd> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8011od zzb;
    private int zze;
    private C8118rd zzf;
    private eo3 zzg;
    private eo3 zzh;

    static {
        C8011od odVar = new C8011od();
        zzb = odVar;
        kp3.m34067t(C8011od.class, odVar);
    }

    private C8011od() {
        eo3 eo3 = eo3.f31444c;
        this.zzg = eo3;
        this.zzh = eo3;
    }

    /* renamed from: F */
    public static C8011od m35624F(eo3 eo3, wo3 wo3) throws wp3 {
        return (C8011od) kp3.m34056B(zzb, eo3, wo3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C8011od();
        } else {
            if (i2 == 4) {
                return new C7975nd((C7937md) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: H */
    public final C8118rd mo33868H() {
        C8118rd rdVar = this.zzf;
        return rdVar == null ? C8118rd.m37036K() : rdVar;
    }

    /* renamed from: I */
    public final eo3 mo33869I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final eo3 mo33870J() {
        return this.zzg;
    }
}
