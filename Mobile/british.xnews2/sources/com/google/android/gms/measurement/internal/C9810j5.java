package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9810j5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ boolean f46378b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46379c;

    C9810j5(C9779g6 g6Var, boolean z) {
        this.f46379c = g6Var;
        this.f46378b = z;
    }

    public final void run() {
        boolean n = this.f46379c.f21269a.mo19385n();
        boolean m = this.f46379c.f21269a.mo19384m();
        this.f46379c.f21269a.mo19381i(this.f46378b);
        if (m == this.f46378b) {
            this.f46379c.f21269a.mo19276j().mo19286v().mo38857b("Default data collection state already set to", Boolean.valueOf(this.f46378b));
        }
        if (this.f46379c.f21269a.mo19385n() == n || this.f46379c.f21269a.mo19385n() != this.f46379c.f21269a.mo19384m()) {
            this.f46379c.f21269a.mo19276j().mo19288x().mo38858c("Default data collection is different than actual status", Boolean.valueOf(this.f46378b), Boolean.valueOf(n));
        }
        this.f46379c.m45074R();
    }
}
