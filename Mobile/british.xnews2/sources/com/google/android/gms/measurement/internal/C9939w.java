package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9939w implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f46819b;

    /* renamed from: c */
    final /* synthetic */ long f46820c;

    /* renamed from: d */
    final /* synthetic */ C9961y1 f46821d;

    C9939w(C9961y1 y1Var, String str, long j) {
        this.f46821d = y1Var;
        this.f46819b = str;
        this.f46820c = j;
    }

    public final void run() {
        C9961y1.m45507h(this.f46821d, this.f46819b, this.f46820c);
    }
}
