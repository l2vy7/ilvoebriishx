package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9105cd implements C9089bd {

    /* renamed from: a */
    public static final C4659n6 f44941a;

    /* renamed from: b */
    public static final C4659n6 f44942b;

    /* renamed from: c */
    public static final C4659n6 f44943c;

    static {
        C4657k6 k6Var = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement"));
        f44941a = k6Var.mo19205e("measurement.client.sessions.check_on_reset_and_enable2", true);
        f44942b = k6Var.mo19205e("measurement.client.sessions.check_on_startup", true);
        f44943c = k6Var.mo19205e("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f44941a.mo19208b()).booleanValue();
    }
}
