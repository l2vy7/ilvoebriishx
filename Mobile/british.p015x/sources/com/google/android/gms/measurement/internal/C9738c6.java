package com.google.android.gms.measurement.internal;

import p256u5.C11027b;

/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9738c6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C11027b f46196b;

    /* renamed from: c */
    final /* synthetic */ int f46197c;

    /* renamed from: d */
    final /* synthetic */ long f46198d;

    /* renamed from: e */
    final /* synthetic */ boolean f46199e;

    /* renamed from: f */
    final /* synthetic */ C9779g6 f46200f;

    C9738c6(C9779g6 g6Var, C11027b bVar, int i, long j, boolean z) {
        this.f46200f = g6Var;
        this.f46196b = bVar;
        this.f46197c = i;
        this.f46198d = j;
        this.f46199e = z;
    }

    public final void run() {
        this.f46200f.mo38932K(this.f46196b);
        C9779g6.m45075d0(this.f46200f, this.f46196b, this.f46197c, this.f46198d, false, this.f46199e);
    }
}
