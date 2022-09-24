package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ay0 implements pn2 {

    /* renamed from: a */
    private final uz0 f29820a;

    /* renamed from: b */
    private Context f29821b;

    /* renamed from: c */
    private String f29822c;

    /* renamed from: d */
    private zzbfi f29823d;

    /* synthetic */ ay0(uz0 uz0, zx0 zx0) {
        this.f29820a = uz0;
    }

    /* renamed from: a */
    public final /* synthetic */ pn2 mo30568a(String str) {
        Objects.requireNonNull(str);
        this.f29822c = str;
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ pn2 mo30569b(Context context) {
        Objects.requireNonNull(context);
        this.f29821b = context;
        return this;
    }

    /* renamed from: c */
    public final /* synthetic */ pn2 mo30570c(zzbfi zzbfi) {
        Objects.requireNonNull(zzbfi);
        this.f29823d = zzbfi;
        return this;
    }

    public final sn2 zzd() {
        cv3.m31157c(this.f29821b, Context.class);
        cv3.m31157c(this.f29822c, String.class);
        cv3.m31157c(this.f29823d, zzbfi.class);
        return new cy0(this.f29820a, this.f29821b, this.f29822c, this.f29823d, (by0) null);
    }
}
