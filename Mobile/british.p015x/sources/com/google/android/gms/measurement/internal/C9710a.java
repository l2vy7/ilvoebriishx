package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9710a implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f46135b;

    /* renamed from: c */
    final /* synthetic */ long f46136c;

    /* renamed from: d */
    final /* synthetic */ C9961y1 f46137d;

    C9710a(C9961y1 y1Var, String str, long j) {
        this.f46137d = y1Var;
        this.f46135b = str;
        this.f46136c = j;
    }

    public final void run() {
        C9961y1.m45506d(this.f46137d, this.f46135b, this.f46136c);
    }
}
