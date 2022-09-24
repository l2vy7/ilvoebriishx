package p179y3;

import p020c4.C2657a;
import p164v3.C6237b;
import p164v3.C6239d;
import p184z3.C6452e;
import p271b8.C11180a;

/* renamed from: y3.g */
/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class C6414g implements C6237b<C6452e> {

    /* renamed from: a */
    private final C11180a<C2657a> f26344a;

    public C6414g(C11180a<C2657a> aVar) {
        this.f26344a = aVar;
    }

    /* renamed from: a */
    public static C6452e m28102a(C2657a aVar) {
        return (C6452e) C6239d.m27333c(C6413f.m28101a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C6414g m28103b(C11180a<C2657a> aVar) {
        return new C6414g(aVar);
    }

    /* renamed from: c */
    public C6452e get() {
        return m28102a(this.f26344a.get());
    }
}
