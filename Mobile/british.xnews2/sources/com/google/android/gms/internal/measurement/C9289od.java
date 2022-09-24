package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.od */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9289od implements C9273nd {

    /* renamed from: a */
    public static final C4659n6 f45349a;

    /* renamed from: b */
    public static final C4659n6 f45350b;

    /* renamed from: c */
    public static final C4659n6 f45351c;

    /* renamed from: d */
    public static final C4659n6 f45352d;

    /* renamed from: e */
    public static final C4659n6 f45353e;

    static {
        C4657k6 k6Var = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement"));
        f45349a = k6Var.mo19205e("measurement.test.boolean_flag", false);
        f45350b = k6Var.mo19202b("measurement.test.double_flag", -3.0d);
        f45351c = k6Var.mo19203c("measurement.test.int_flag", -2);
        f45352d = k6Var.mo19203c("measurement.test.long_flag", -1);
        f45353e = k6Var.mo19204d("measurement.test.string_flag", "---");
    }

    public final double zza() {
        return ((Double) f45350b.mo19208b()).doubleValue();
    }

    public final long zzb() {
        return ((Long) f45351c.mo19208b()).longValue();
    }

    public final long zzc() {
        return ((Long) f45352d.mo19208b()).longValue();
    }

    public final String zzd() {
        return (String) f45353e.mo19208b();
    }

    public final boolean zze() {
        return ((Boolean) f45349a.mo19208b()).booleanValue();
    }
}
