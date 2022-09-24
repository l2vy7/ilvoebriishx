package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9166gc implements C9151fc {

    /* renamed from: a */
    public static final C4659n6 f45058a;

    /* renamed from: b */
    public static final C4659n6 f45059b;

    /* renamed from: c */
    public static final C4659n6 f45060c;

    /* renamed from: d */
    public static final C4659n6 f45061d;

    static {
        C4657k6 k6Var = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement"));
        f45058a = k6Var.mo19205e("measurement.client.consent_state_v1", true);
        f45059b = k6Var.mo19205e("measurement.client.3p_consent_state_v1", true);
        f45060c = k6Var.mo19205e("measurement.service.consent_state_v1_W36", true);
        f45061d = k6Var.mo19203c("measurement.service.storage_consent_support_version", 203600);
    }

    public final long zza() {
        return ((Long) f45061d.mo19208b()).longValue();
    }
}
