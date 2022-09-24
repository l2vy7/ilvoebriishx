package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9831l4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f46433a;

    /* renamed from: b */
    final /* synthetic */ String f46434b;

    /* renamed from: c */
    final /* synthetic */ String f46435c;

    /* renamed from: d */
    final /* synthetic */ C9716a5 f46436d;

    C9831l4(C9716a5 a5Var, String str, String str2, String str3) {
        this.f46436d = a5Var;
        this.f46433a = str;
        this.f46434b = str2;
        this.f46435c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.f46436d.f46149b.mo39285a();
        return this.f46436d.f46149b.mo39280V().mo39000d0(this.f46433a, this.f46434b, this.f46435c);
    }
}
