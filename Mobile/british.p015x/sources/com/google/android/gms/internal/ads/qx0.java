package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qx0 implements am2 {

    /* renamed from: a */
    private final uz0 f38310a;

    /* renamed from: b */
    private Context f38311b;

    /* renamed from: c */
    private String f38312c;

    /* synthetic */ qx0(uz0 uz0, px0 px0) {
        this.f38310a = uz0;
    }

    /* renamed from: a */
    public final /* synthetic */ am2 mo30423a(Context context) {
        Objects.requireNonNull(context);
        this.f38311b = context;
        return this;
    }

    public final /* synthetic */ am2 zza(String str) {
        Objects.requireNonNull(str);
        this.f38312c = str;
        return this;
    }

    public final bm2 zzc() {
        cv3.m31157c(this.f38311b, Context.class);
        cv3.m31157c(this.f38312c, String.class);
        return new sx0(this.f38310a, this.f38311b, this.f38312c, (rx0) null);
    }
}
