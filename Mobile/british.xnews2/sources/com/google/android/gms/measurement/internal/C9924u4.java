package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9924u4 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzau f46775b;

    /* renamed from: c */
    final /* synthetic */ String f46776c;

    /* renamed from: d */
    final /* synthetic */ C9716a5 f46777d;

    C9924u4(C9716a5 a5Var, zzau zzau, String str) {
        this.f46777d = a5Var;
        this.f46775b = zzau;
        this.f46776c = str;
    }

    public final void run() {
        this.f46777d.f46149b.mo39285a();
        this.f46777d.f46149b.mo39294h(this.f46775b, this.f46776c);
    }
}
