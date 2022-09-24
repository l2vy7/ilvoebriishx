package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9925u5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46778b;

    /* renamed from: c */
    final /* synthetic */ String f46779c;

    /* renamed from: d */
    final /* synthetic */ String f46780d;

    /* renamed from: e */
    final /* synthetic */ boolean f46781e;

    /* renamed from: f */
    final /* synthetic */ C9779g6 f46782f;

    C9925u5(C9779g6 g6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f46782f = g6Var;
        this.f46778b = atomicReference;
        this.f46779c = str2;
        this.f46780d = str3;
        this.f46781e = z;
    }

    public final void run() {
        this.f46782f.f21269a.mo19370L().mo39216W(this.f46778b, (String) null, this.f46779c, this.f46780d, this.f46781e);
    }
}
