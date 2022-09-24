package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ji2 implements zi2<ki2> {

    /* renamed from: a */
    private final km0 f33899a;

    /* renamed from: b */
    private final nb3 f33900b;

    /* renamed from: c */
    private final Context f33901c;

    public ji2(km0 km0, nb3 nb3, Context context) {
        this.f33899a = km0;
        this.f33900b = nb3;
        this.f33901c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ki2 mo32896a() throws Exception {
        String str;
        String str2;
        String str3;
        if (!this.f33899a.mo18501z(this.f33901c)) {
            return new ki2((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String j = this.f33899a.mo18485j(this.f33901c);
        String str4 = j == null ? "" : j;
        String h = this.f33899a.mo18483h(this.f33901c);
        if (h == null) {
            str = "";
        } else {
            str = h;
        }
        String f = this.f33899a.mo18481f(this.f33901c);
        if (f == null) {
            str2 = "";
        } else {
            str2 = f;
        }
        String g = this.f33899a.mo18482g(this.f33901c);
        if (g == null) {
            str3 = "";
        } else {
            str3 = g;
        }
        return new ki2(str4, str, str2, str3, "TIME_OUT".equals(str) ? (Long) C8311wv.m39277c().mo18570b(p00.f37040a0) : null);
    }

    public final mb3<ki2> zzb() {
        return this.f33900b.mo33675b(new ii2(this));
    }
}
