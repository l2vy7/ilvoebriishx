package p179y3;

import android.content.Context;
import p005a4.C0078c;
import p020c4.C2657a;
import p164v3.C6237b;
import p164v3.C6239d;
import p184z3.C6452e;
import p184z3.C6468q;
import p271b8.C11180a;

/* renamed from: y3.i */
/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class C6416i implements C6237b<C6468q> {

    /* renamed from: a */
    private final C11180a<Context> f26345a;

    /* renamed from: b */
    private final C11180a<C0078c> f26346b;

    /* renamed from: c */
    private final C11180a<C6452e> f26347c;

    /* renamed from: d */
    private final C11180a<C2657a> f26348d;

    public C6416i(C11180a<Context> aVar, C11180a<C0078c> aVar2, C11180a<C6452e> aVar3, C11180a<C2657a> aVar4) {
        this.f26345a = aVar;
        this.f26346b = aVar2;
        this.f26347c = aVar3;
        this.f26348d = aVar4;
    }

    /* renamed from: a */
    public static C6416i m28106a(C11180a<Context> aVar, C11180a<C0078c> aVar2, C11180a<C6452e> aVar3, C11180a<C2657a> aVar4) {
        return new C6416i(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C6468q m28107c(Context context, C0078c cVar, C6452e eVar, C2657a aVar) {
        return (C6468q) C6239d.m27333c(C6415h.m28105a(context, cVar, eVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C6468q get() {
        return m28107c(this.f26345a.get(), this.f26346b.get(), this.f26347c.get(), this.f26348d.get());
    }
}
