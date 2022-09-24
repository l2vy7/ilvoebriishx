package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9853n4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f46498a;

    /* renamed from: b */
    final /* synthetic */ String f46499b;

    /* renamed from: c */
    final /* synthetic */ String f46500c;

    /* renamed from: d */
    final /* synthetic */ C9716a5 f46501d;

    C9853n4(C9716a5 a5Var, String str, String str2, String str3) {
        this.f46501d = a5Var;
        this.f46498a = str;
        this.f46499b = str2;
        this.f46500c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.f46501d.f46149b.mo39285a();
        return this.f46501d.f46149b.mo39280V().mo38997a0(this.f46498a, this.f46499b, this.f46500c);
    }
}
