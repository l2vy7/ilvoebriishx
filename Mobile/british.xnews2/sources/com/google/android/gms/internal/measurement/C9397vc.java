package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.vc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9397vc implements C9381uc {

    /* renamed from: a */
    public static final C4659n6 f45504a;

    /* renamed from: b */
    public static final C4659n6 f45505b;

    static {
        C4657k6 k6Var = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement"));
        f45504a = k6Var.mo19205e("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f45505b = k6Var.mo19205e("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f45505b.mo19208b()).booleanValue();
    }
}
