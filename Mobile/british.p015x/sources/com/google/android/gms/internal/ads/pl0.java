package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Objects;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pl0 {

    /* renamed from: a */
    private Context f37703a;

    /* renamed from: b */
    private C6483e f37704b;

    /* renamed from: c */
    private zzg f37705c;

    /* renamed from: d */
    private km0 f37706d;

    /* synthetic */ pl0(ol0 ol0) {
    }

    /* renamed from: a */
    public final pl0 mo34147a(zzg zzg) {
        this.f37705c = zzg;
        return this;
    }

    /* renamed from: b */
    public final pl0 mo34148b(Context context) {
        Objects.requireNonNull(context);
        this.f37703a = context;
        return this;
    }

    /* renamed from: c */
    public final pl0 mo34149c(C6483e eVar) {
        Objects.requireNonNull(eVar);
        this.f37704b = eVar;
        return this;
    }

    /* renamed from: d */
    public final pl0 mo34150d(km0 km0) {
        this.f37706d = km0;
        return this;
    }

    /* renamed from: e */
    public final lm0 mo34151e() {
        cv3.m31157c(this.f37703a, Context.class);
        cv3.m31157c(this.f37704b, C6483e.class);
        cv3.m31157c(this.f37705c, zzg.class);
        cv3.m31157c(this.f37706d, km0.class);
        return new rl0(this.f37703a, this.f37704b, this.f37705c, this.f37706d, (ql0) null);
    }
}
