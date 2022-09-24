package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v03 {

    /* renamed from: a */
    private final Context f40232a;

    /* renamed from: b */
    private final Looper f40233b;

    public v03(Context context, Looper looper) {
        this.f40232a = context;
        this.f40233b = looper;
    }

    /* renamed from: a */
    public final void mo35344a(String str) {
        k13 E = m13.m34642E();
        E.mo33015y(this.f40232a.getPackageName());
        E.mo33014C(2);
        h13 E2 = i13.m33014E();
        E2.mo32316y(str);
        E2.mo32315B(2);
        E.mo33013B(E2);
        new w03(this.f40232a, this.f40233b, (m13) E.mo32424p()).mo35536a();
    }
}
