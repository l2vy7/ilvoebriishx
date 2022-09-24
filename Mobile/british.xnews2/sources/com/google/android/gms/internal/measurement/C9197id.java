package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.id */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9197id implements C9182hd {

    /* renamed from: a */
    public static final C4659n6 f45087a;

    /* renamed from: b */
    public static final C4659n6 f45088b;

    /* renamed from: c */
    public static final C4659n6 f45089c;

    /* renamed from: d */
    public static final C4659n6 f45090d;

    static {
        C4657k6 k6Var = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement"));
        f45087a = k6Var.mo19203c("measurement.id.lifecycle.app_in_background_parameter", 0);
        f45088b = k6Var.mo19205e("measurement.lifecycle.app_backgrounded_tracking", true);
        f45089c = k6Var.mo19205e("measurement.lifecycle.app_in_background_parameter", false);
        f45090d = k6Var.mo19203c("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean zza() {
        return ((Boolean) f45089c.mo19208b()).booleanValue();
    }
}
