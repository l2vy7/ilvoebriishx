package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class py0 implements yw1 {

    /* renamed from: a */
    private final uz0 f37807a;

    /* renamed from: b */
    private Context f37808b;

    /* renamed from: c */
    private a80 f37809c;

    /* synthetic */ py0(uz0 uz0, oy0 oy0) {
        this.f37807a = uz0;
    }

    /* renamed from: a */
    public final /* synthetic */ yw1 mo34218a(Context context) {
        Objects.requireNonNull(context);
        this.f37808b = context;
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ yw1 mo34219b(a80 a80) {
        Objects.requireNonNull(a80);
        this.f37809c = a80;
        return this;
    }

    public final zw1 zzc() {
        cv3.m31157c(this.f37808b, Context.class);
        cv3.m31157c(this.f37809c, a80.class);
        return new ry0(this.f37807a, this.f37808b, this.f37809c, (qy0) null);
    }
}
