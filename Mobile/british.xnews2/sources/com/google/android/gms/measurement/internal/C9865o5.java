package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9865o5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f46548b;

    /* renamed from: c */
    final /* synthetic */ String f46549c;

    /* renamed from: d */
    final /* synthetic */ Object f46550d;

    /* renamed from: e */
    final /* synthetic */ long f46551e;

    /* renamed from: f */
    final /* synthetic */ C9779g6 f46552f;

    C9865o5(C9779g6 g6Var, String str, String str2, Object obj, long j) {
        this.f46552f = g6Var;
        this.f46548b = str;
        this.f46549c = str2;
        this.f46550d = obj;
        this.f46551e = j;
    }

    public final void run() {
        this.f46552f.mo38935N(this.f46548b, this.f46549c, this.f46550d, this.f46551e);
    }
}
