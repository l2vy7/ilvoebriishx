package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9864o4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f46544a;

    /* renamed from: b */
    final /* synthetic */ String f46545b;

    /* renamed from: c */
    final /* synthetic */ String f46546c;

    /* renamed from: d */
    final /* synthetic */ C9716a5 f46547d;

    C9864o4(C9716a5 a5Var, String str, String str2, String str3) {
        this.f46547d = a5Var;
        this.f46544a = str;
        this.f46545b = str2;
        this.f46546c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.f46547d.f46149b.mo39285a();
        return this.f46547d.f46149b.mo39280V().mo38997a0(this.f46544a, this.f46545b, this.f46546c);
    }
}
