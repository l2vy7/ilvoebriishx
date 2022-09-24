package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9310q3 {

    /* renamed from: a */
    final C9430y f45387a;

    /* renamed from: b */
    final C9326r4 f45388b;

    /* renamed from: c */
    final C9326r4 f45389c;

    /* renamed from: d */
    final C9376u7 f45390d;

    public C9310q3() {
        C9430y yVar = new C9430y();
        this.f45387a = yVar;
        C9326r4 r4Var = new C9326r4((C9326r4) null, yVar);
        this.f45389c = r4Var;
        this.f45388b = r4Var.mo37976a();
        C9376u7 u7Var = new C9376u7();
        this.f45390d = u7Var;
        r4Var.mo37982g("require", new C9383ue(u7Var));
        u7Var.mo38096a("internal.platform", C9294p2.f45361a);
        r4Var.mo37982g("runtime.counter", new C9184i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final C9306q mo37952a(C9326r4 r4Var, C9235l5... l5VarArr) {
        C9306q qVar = C9306q.f45372d0;
        for (C9235l5 a : l5VarArr) {
            qVar = C9360t6.m43659a(a);
            C9343s5.m43606c(this.f45389c);
            if ((qVar instanceof C9321r) || (qVar instanceof C9291p)) {
                qVar = this.f45387a.mo38178a(r4Var, qVar);
            }
        }
        return qVar;
    }
}
