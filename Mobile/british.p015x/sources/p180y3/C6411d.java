package p180y3;

import java.util.concurrent.Executor;
import p005a4.C0078c;
import p014b4.C1567b;
import p159u3.C6196e;
import p165v3.C6237b;
import p185z3.C6468q;
import p272b8.C11180a;

/* renamed from: y3.d */
/* compiled from: DefaultScheduler_Factory */
public final class C6411d implements C6237b<C6410c> {

    /* renamed from: a */
    private final C11180a<Executor> f26339a;

    /* renamed from: b */
    private final C11180a<C6196e> f26340b;

    /* renamed from: c */
    private final C11180a<C6468q> f26341c;

    /* renamed from: d */
    private final C11180a<C0078c> f26342d;

    /* renamed from: e */
    private final C11180a<C1567b> f26343e;

    public C6411d(C11180a<Executor> aVar, C11180a<C6196e> aVar2, C11180a<C6468q> aVar3, C11180a<C0078c> aVar4, C11180a<C1567b> aVar5) {
        this.f26339a = aVar;
        this.f26340b = aVar2;
        this.f26341c = aVar3;
        this.f26342d = aVar4;
        this.f26343e = aVar5;
    }

    /* renamed from: a */
    public static C6411d m28097a(C11180a<Executor> aVar, C11180a<C6196e> aVar2, C11180a<C6468q> aVar3, C11180a<C0078c> aVar4, C11180a<C1567b> aVar5) {
        return new C6411d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C6410c m28098c(Executor executor, C6196e eVar, C6468q qVar, C0078c cVar, C1567b bVar) {
        return new C6410c(executor, eVar, qVar, cVar, bVar);
    }

    /* renamed from: b */
    public C6410c get() {
        return m28098c(this.f26339a.get(), this.f26340b.get(), this.f26341c.get(), this.f26342d.get(), this.f26343e.get());
    }
}
