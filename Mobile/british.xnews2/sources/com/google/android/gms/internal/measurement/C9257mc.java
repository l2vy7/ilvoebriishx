package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.mc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9257mc implements C9241lc {

    /* renamed from: a */
    public static final C4659n6 f45222a;

    /* renamed from: b */
    public static final C4659n6 f45223b;

    /* renamed from: c */
    public static final C4659n6 f45224c;

    /* renamed from: d */
    public static final C4659n6 f45225d;

    static {
        C4657k6 a = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement")).mo19201a();
        f45222a = a.mo19205e("measurement.collection.event_safelist", true);
        f45223b = a.mo19205e("measurement.service.store_null_safelist", false);
        f45224c = a.mo19205e("measurement.service.store_safelist", false);
        f45225d = a.mo19203c("measurement.id.service.store_safelist", 0);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f45223b.mo19208b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f45224c.mo19208b()).booleanValue();
    }
}
