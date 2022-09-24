package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.o6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9866o6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9844m6 f46553b;

    /* renamed from: c */
    final /* synthetic */ C9844m6 f46554c;

    /* renamed from: d */
    final /* synthetic */ long f46555d;

    /* renamed from: e */
    final /* synthetic */ boolean f46556e;

    /* renamed from: f */
    final /* synthetic */ C9917t6 f46557f;

    C9866o6(C9917t6 t6Var, C9844m6 m6Var, C9844m6 m6Var2, long j, boolean z) {
        this.f46557f = t6Var;
        this.f46553b = m6Var;
        this.f46554c = m6Var2;
        this.f46555d = j;
        this.f46556e = z;
    }

    public final void run() {
        this.f46557f.m45362o(this.f46553b, this.f46554c, this.f46555d, this.f46556e, (Bundle) null);
    }
}
