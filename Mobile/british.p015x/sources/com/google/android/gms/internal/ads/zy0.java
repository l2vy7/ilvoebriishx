package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zy0 implements lp2 {

    /* renamed from: a */
    private final uz0 f42829a;

    /* renamed from: b */
    private Context f42830b;

    /* renamed from: c */
    private String f42831c;

    /* renamed from: d */
    private zzbfi f42832d;

    /* synthetic */ zy0(uz0 uz0, yy0 yy0) {
        this.f42829a = uz0;
    }

    /* renamed from: a */
    public final /* synthetic */ lp2 mo33372a(String str) {
        Objects.requireNonNull(str);
        this.f42831c = str;
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ lp2 mo33373b(Context context) {
        Objects.requireNonNull(context);
        this.f42830b = context;
        return this;
    }

    /* renamed from: c */
    public final /* synthetic */ lp2 mo33374c(zzbfi zzbfi) {
        Objects.requireNonNull(zzbfi);
        this.f42832d = zzbfi;
        return this;
    }

    public final mp2 zzd() {
        cv3.m31157c(this.f42830b, Context.class);
        cv3.m31157c(this.f42831c, String.class);
        cv3.m31157c(this.f42832d, zzbfi.class);
        return new bz0(this.f42829a, this.f42830b, this.f42831c, this.f42832d, (az0) null);
    }
}
