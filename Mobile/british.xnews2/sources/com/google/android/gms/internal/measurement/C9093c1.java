package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9093c1 {

    /* renamed from: a */
    final C9310q3 f44913a;

    /* renamed from: b */
    C9326r4 f44914b;

    /* renamed from: c */
    final C9091c f44915c = new C9091c();

    /* renamed from: d */
    private final C9429xe f44916d = new C9429xe();

    public C9093c1() {
        C9310q3 q3Var = new C9310q3();
        this.f44913a = q3Var;
        this.f44914b = q3Var.f45388b.mo37976a();
        q3Var.f45390d.mo38096a("internal.registerCallback", new C9061a(this));
        q3Var.f45390d.mo38096a("internal.eventLogger", new C9077b0(this));
    }

    /* renamed from: a */
    public final C9091c mo37438a() {
        return this.f44915c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C9199j mo37439b() throws Exception {
        return new C9368te(this.f44916d);
    }

    /* renamed from: c */
    public final void mo37440c(C9160g5 g5Var) throws C9402w1 {
        C9199j jVar;
        String str;
        String str2;
        try {
            this.f44914b = this.f44913a.f45388b.mo37976a();
            if (!(this.f44913a.mo37952a(this.f44914b, (C9235l5[]) g5Var.mo37594B().toArray(new C9235l5[0])) instanceof C9169h)) {
                for (C9129e5 e5Var : g5Var.mo37595z().mo37447C()) {
                    List B = e5Var.mo37539B();
                    String A = e5Var.mo37538A();
                    Iterator it = B.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C9306q a = this.f44913a.mo37952a(this.f44914b, (C9235l5) it.next());
                            if (a instanceof C9260n) {
                                C9326r4 r4Var = this.f44914b;
                                if (!r4Var.mo37983h(A)) {
                                    jVar = null;
                                } else {
                                    C9306q d = r4Var.mo37979d(A);
                                    if (!(d instanceof C9199j)) {
                                        String valueOf = String.valueOf(A);
                                        if (valueOf.length() != 0) {
                                            str2 = "Invalid function name: ".concat(valueOf);
                                        } else {
                                            str2 = new String("Invalid function name: ");
                                        }
                                        throw new IllegalStateException(str2);
                                    }
                                    jVar = (C9199j) d;
                                }
                                if (jVar == null) {
                                    String valueOf2 = String.valueOf(A);
                                    if (valueOf2.length() != 0) {
                                        str = "Rule function is undefined: ".concat(valueOf2);
                                    } else {
                                        str = new String("Rule function is undefined: ");
                                    }
                                    throw new IllegalStateException(str);
                                }
                                jVar.mo37655d(this.f44914b, Collections.singletonList(a));
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new C9402w1(th);
        }
    }

    /* renamed from: d */
    public final void mo37441d(String str, Callable callable) {
        this.f44913a.f45390d.mo38096a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo37442e(C9076b bVar) throws C9402w1 {
        try {
            this.f44915c.mo37434d(bVar);
            this.f44913a.f45389c.mo37982g("runtime.counter", new C9184i(Double.valueOf(0.0d)));
            this.f44916d.mo38177b(this.f44914b.mo37976a(), this.f44915c);
            return mo37444g() || mo37443f();
        } catch (Throwable th) {
            throw new C9402w1(th);
        }
    }

    /* renamed from: f */
    public final boolean mo37443f() {
        return !this.f44915c.mo37432c().isEmpty();
    }

    /* renamed from: g */
    public final boolean mo37444g() {
        C9091c cVar = this.f44915c;
        return !cVar.mo37431b().equals(cVar.mo37430a());
    }
}
