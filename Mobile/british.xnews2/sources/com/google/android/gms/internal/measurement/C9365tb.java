package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.tb */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9365tb implements C9349sb {

    /* renamed from: a */
    public static final C4659n6 f45472a;

    /* renamed from: b */
    public static final C4659n6 f45473b;

    static {
        C4657k6 k6Var = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement"));
        f45472a = k6Var.mo19205e("measurement.androidId.delete_feature", true);
        f45473b = k6Var.mo19205e("measurement.log_androidId_enabled", false);
    }

    public final boolean zza() {
        return ((Boolean) f45472a.mo19208b()).booleanValue();
    }
}
