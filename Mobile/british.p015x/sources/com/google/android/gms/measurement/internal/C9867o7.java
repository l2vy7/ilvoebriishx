package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9867o7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ ComponentName f46558b;

    /* renamed from: c */
    final /* synthetic */ C9908s7 f46559c;

    C9867o7(C9908s7 s7Var, ComponentName componentName) {
        this.f46559c = s7Var;
        this.f46558b = componentName;
    }

    public final void run() {
        C9918t7.m45390M(this.f46559c.f46737d, this.f46558b);
    }
}
