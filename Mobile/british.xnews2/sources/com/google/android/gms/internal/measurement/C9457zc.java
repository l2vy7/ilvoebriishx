package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.zc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9457zc implements C9442yc {

    /* renamed from: a */
    public static final C4659n6 f45568a;

    /* renamed from: b */
    public static final C4659n6 f45569b;

    /* renamed from: c */
    public static final C4659n6 f45570c;

    /* renamed from: d */
    public static final C4659n6 f45571d;

    static {
        C4657k6 k6Var = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement"));
        f45568a = k6Var.mo19205e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f45569b = k6Var.mo19205e("measurement.audience.refresh_event_count_filters_timestamp", false);
        f45570c = k6Var.mo19205e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f45571d = k6Var.mo19205e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f45569b.mo19208b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f45570c.mo19208b()).booleanValue();
    }

    public final boolean zzd() {
        return ((Boolean) f45571d.mo19208b()).booleanValue();
    }
}
