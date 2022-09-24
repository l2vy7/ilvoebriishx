package com.google.android.gms.measurement.internal;

import p255u5.C11027b;

/* renamed from: com.google.android.gms.measurement.internal.b6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9727b6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C11027b f46173b;

    /* renamed from: c */
    final /* synthetic */ long f46174c;

    /* renamed from: d */
    final /* synthetic */ int f46175d;

    /* renamed from: e */
    final /* synthetic */ long f46176e;

    /* renamed from: f */
    final /* synthetic */ boolean f46177f;

    /* renamed from: g */
    final /* synthetic */ C9779g6 f46178g;

    C9727b6(C9779g6 g6Var, C11027b bVar, long j, int i, long j2, boolean z) {
        this.f46178g = g6Var;
        this.f46173b = bVar;
        this.f46174c = j;
        this.f46175d = i;
        this.f46176e = j2;
        this.f46177f = z;
    }

    public final void run() {
        this.f46178g.mo38932K(this.f46173b);
        this.f46178g.mo38961z(this.f46174c, false);
        C9779g6.m45075d0(this.f46178g, this.f46173b, this.f46175d, this.f46176e, true, this.f46177f);
    }
}
