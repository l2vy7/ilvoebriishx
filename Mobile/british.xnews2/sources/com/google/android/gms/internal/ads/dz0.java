package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class dz0 implements br2 {

    /* renamed from: a */
    private final uz0 f31127a;

    /* renamed from: b */
    private Context f31128b;

    /* renamed from: c */
    private String f31129c;

    /* synthetic */ dz0(uz0 uz0, cz0 cz0) {
        this.f31127a = uz0;
    }

    /* renamed from: a */
    public final /* synthetic */ br2 mo30791a(Context context) {
        Objects.requireNonNull(context);
        this.f31128b = context;
        return this;
    }

    public final /* synthetic */ br2 zza(String str) {
        this.f31129c = str;
        return this;
    }

    public final cr2 zzc() {
        cv3.m31157c(this.f31128b, Context.class);
        return new fz0(this.f31127a, this.f31128b, this.f31129c, (ez0) null);
    }
}
