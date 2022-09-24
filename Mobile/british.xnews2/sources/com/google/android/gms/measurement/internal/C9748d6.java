package com.google.android.gms.measurement.internal;

import p255u5.C11027b;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9748d6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C11027b f46211b;

    /* renamed from: c */
    final /* synthetic */ int f46212c;

    /* renamed from: d */
    final /* synthetic */ long f46213d;

    /* renamed from: e */
    final /* synthetic */ boolean f46214e;

    /* renamed from: f */
    final /* synthetic */ C9779g6 f46215f;

    C9748d6(C9779g6 g6Var, C11027b bVar, int i, long j, boolean z) {
        this.f46215f = g6Var;
        this.f46211b = bVar;
        this.f46212c = i;
        this.f46213d = j;
        this.f46214e = z;
    }

    public final void run() {
        this.f46215f.mo38932K(this.f46211b);
        C9779g6.m45075d0(this.f46215f, this.f46211b, this.f46212c, this.f46213d, false, this.f46214e);
    }
}
