package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.jc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9211jc implements C9196ic {

    /* renamed from: a */
    public static final C4659n6 f45111a;

    /* renamed from: b */
    public static final C4659n6 f45112b;

    static {
        C4657k6 a = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement")).mo19201a();
        f45111a = a.mo19205e("measurement.enhanced_campaign.client", false);
        f45112b = a.mo19205e("measurement.enhanced_campaign.service", false);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f45111a.mo19208b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f45112b.mo19208b()).booleanValue();
    }
}
