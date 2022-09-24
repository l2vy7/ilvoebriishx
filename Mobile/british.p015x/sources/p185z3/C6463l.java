package p185z3;

import android.content.Context;
import java.util.concurrent.Executor;
import p005a4.C0078c;
import p014b4.C1567b;
import p021c4.C2657a;
import p159u3.C6196e;
import p165v3.C6237b;
import p272b8.C11180a;

/* renamed from: z3.l */
/* compiled from: Uploader_Factory */
public final class C6463l implements C6237b<C6462k> {

    /* renamed from: a */
    private final C11180a<Context> f26534a;

    /* renamed from: b */
    private final C11180a<C6196e> f26535b;

    /* renamed from: c */
    private final C11180a<C0078c> f26536c;

    /* renamed from: d */
    private final C11180a<C6468q> f26537d;

    /* renamed from: e */
    private final C11180a<Executor> f26538e;

    /* renamed from: f */
    private final C11180a<C1567b> f26539f;

    /* renamed from: g */
    private final C11180a<C2657a> f26540g;

    public C6463l(C11180a<Context> aVar, C11180a<C6196e> aVar2, C11180a<C0078c> aVar3, C11180a<C6468q> aVar4, C11180a<Executor> aVar5, C11180a<C1567b> aVar6, C11180a<C2657a> aVar7) {
        this.f26534a = aVar;
        this.f26535b = aVar2;
        this.f26536c = aVar3;
        this.f26537d = aVar4;
        this.f26538e = aVar5;
        this.f26539f = aVar6;
        this.f26540g = aVar7;
    }

    /* renamed from: a */
    public static C6463l m28186a(C11180a<Context> aVar, C11180a<C6196e> aVar2, C11180a<C0078c> aVar3, C11180a<C6468q> aVar4, C11180a<Executor> aVar5, C11180a<C1567b> aVar6, C11180a<C2657a> aVar7) {
        return new C6463l(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* renamed from: c */
    public static C6462k m28187c(Context context, C6196e eVar, C0078c cVar, C6468q qVar, Executor executor, C1567b bVar, C2657a aVar) {
        return new C6462k(context, eVar, cVar, qVar, executor, bVar, aVar);
    }

    /* renamed from: b */
    public C6462k get() {
        return m28187c(this.f26534a.get(), this.f26535b.get(), this.f26536c.get(), this.f26537d.get(), this.f26538e.get(), this.f26539f.get(), this.f26540g.get());
    }
}
