package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9152fd implements C9137ed {

    /* renamed from: a */
    public static final C4659n6 f45031a;

    /* renamed from: b */
    public static final C4659n6 f45032b;

    /* renamed from: c */
    public static final C4659n6 f45033c;

    /* renamed from: d */
    public static final C4659n6 f45034d;

    static {
        C4657k6 k6Var = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement"));
        f45031a = k6Var.mo19205e("measurement.sdk.collection.enable_extend_user_property_size", true);
        f45032b = k6Var.mo19205e("measurement.sdk.collection.last_deep_link_referrer2", true);
        f45033c = k6Var.mo19205e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f45034d = k6Var.mo19203c("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return ((Boolean) f45033c.mo19208b()).booleanValue();
    }
}
