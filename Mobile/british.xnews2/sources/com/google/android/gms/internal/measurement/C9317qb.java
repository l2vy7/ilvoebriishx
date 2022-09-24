package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.qb */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9317qb implements C9302pb {

    /* renamed from: a */
    public static final C4659n6 f45393a;

    /* renamed from: b */
    public static final C4659n6 f45394b;

    /* renamed from: c */
    public static final C4659n6 f45395c;

    /* renamed from: d */
    public static final C4659n6 f45396d;

    /* renamed from: e */
    public static final C4659n6 f45397e;

    /* renamed from: f */
    public static final C4659n6 f45398f;

    /* renamed from: g */
    public static final C4659n6 f45399g;

    static {
        C4657k6 a = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement")).mo19201a();
        f45393a = a.mo19205e("measurement.adid_zero.app_instance_id_fix", true);
        f45394b = a.mo19205e("measurement.adid_zero.service", true);
        f45395c = a.mo19205e("measurement.adid_zero.adid_uid", false);
        f45396d = a.mo19203c("measurement.id.adid_zero.service", 0);
        f45397e = a.mo19205e("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f45398f = a.mo19205e("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        f45399g = a.mo19205e("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f45393a.mo19208b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f45394b.mo19208b()).booleanValue();
    }

    public final boolean zzd() {
        return ((Boolean) f45395c.mo19208b()).booleanValue();
    }

    public final boolean zze() {
        return ((Boolean) f45397e.mo19208b()).booleanValue();
    }

    public final boolean zzf() {
        return ((Boolean) f45398f.mo19208b()).booleanValue();
    }

    public final boolean zzg() {
        return ((Boolean) f45399g.mo19208b()).booleanValue();
    }
}
