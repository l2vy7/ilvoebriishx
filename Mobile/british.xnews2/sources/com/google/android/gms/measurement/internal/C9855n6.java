package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.n6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9855n6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Bundle f46511b;

    /* renamed from: c */
    final /* synthetic */ C9844m6 f46512c;

    /* renamed from: d */
    final /* synthetic */ C9844m6 f46513d;

    /* renamed from: e */
    final /* synthetic */ long f46514e;

    /* renamed from: f */
    final /* synthetic */ C9917t6 f46515f;

    C9855n6(C9917t6 t6Var, Bundle bundle, C9844m6 m6Var, C9844m6 m6Var2, long j) {
        this.f46515f = t6Var;
        this.f46511b = bundle;
        this.f46512c = m6Var;
        this.f46513d = m6Var2;
        this.f46514e = j;
    }

    public final void run() {
        C9917t6.m45367x(this.f46515f, this.f46511b, this.f46512c, this.f46513d, this.f46514e);
    }
}
