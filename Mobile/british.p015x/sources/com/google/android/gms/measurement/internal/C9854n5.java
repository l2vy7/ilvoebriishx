package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9854n5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f46502b;

    /* renamed from: c */
    final /* synthetic */ String f46503c;

    /* renamed from: d */
    final /* synthetic */ long f46504d;

    /* renamed from: e */
    final /* synthetic */ Bundle f46505e;

    /* renamed from: f */
    final /* synthetic */ boolean f46506f;

    /* renamed from: g */
    final /* synthetic */ boolean f46507g;

    /* renamed from: h */
    final /* synthetic */ boolean f46508h;

    /* renamed from: i */
    final /* synthetic */ String f46509i;

    /* renamed from: j */
    final /* synthetic */ C9779g6 f46510j;

    C9854n5(C9779g6 g6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f46510j = g6Var;
        this.f46502b = str;
        this.f46503c = str2;
        this.f46504d = j;
        this.f46505e = bundle;
        this.f46506f = z;
        this.f46507g = z2;
        this.f46508h = z3;
        this.f46509i = str3;
    }

    public final void run() {
        this.f46510j.mo38958w(this.f46502b, this.f46503c, this.f46504d, this.f46505e, this.f46506f, this.f46507g, this.f46508h, this.f46509i);
    }
}
