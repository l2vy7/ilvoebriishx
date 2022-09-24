package p184z3;

import java.util.concurrent.Executor;
import p005a4.C0078c;
import p014b4.C1567b;
import p164v3.C6237b;
import p271b8.C11180a;

/* renamed from: z3.p */
/* compiled from: WorkInitializer_Factory */
public final class C6467p implements C6237b<C6466o> {

    /* renamed from: a */
    private final C11180a<Executor> f26547a;

    /* renamed from: b */
    private final C11180a<C0078c> f26548b;

    /* renamed from: c */
    private final C11180a<C6468q> f26549c;

    /* renamed from: d */
    private final C11180a<C1567b> f26550d;

    public C6467p(C11180a<Executor> aVar, C11180a<C0078c> aVar2, C11180a<C6468q> aVar3, C11180a<C1567b> aVar4) {
        this.f26547a = aVar;
        this.f26548b = aVar2;
        this.f26549c = aVar3;
        this.f26550d = aVar4;
    }

    /* renamed from: a */
    public static C6467p m28195a(C11180a<Executor> aVar, C11180a<C0078c> aVar2, C11180a<C6468q> aVar3, C11180a<C1567b> aVar4) {
        return new C6467p(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C6466o m28196c(Executor executor, C0078c cVar, C6468q qVar, C1567b bVar) {
        return new C6466o(executor, cVar, qVar, bVar);
    }

    /* renamed from: b */
    public C6466o get() {
        return m28196c(this.f26547a.get(), this.f26548b.get(), this.f26549c.get(), this.f26550d.get());
    }
}
