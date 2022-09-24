package p154t3;

import p021c4.C2657a;
import p165v3.C6237b;
import p180y3.C6412e;
import p185z3.C6462k;
import p185z3.C6466o;
import p272b8.C11180a;

/* renamed from: t3.t */
/* compiled from: TransportRuntime_Factory */
public final class C6159t implements C6237b<C6156r> {

    /* renamed from: a */
    private final C11180a<C2657a> f25441a;

    /* renamed from: b */
    private final C11180a<C2657a> f25442b;

    /* renamed from: c */
    private final C11180a<C6412e> f25443c;

    /* renamed from: d */
    private final C11180a<C6462k> f25444d;

    /* renamed from: e */
    private final C11180a<C6466o> f25445e;

    public C6159t(C11180a<C2657a> aVar, C11180a<C2657a> aVar2, C11180a<C6412e> aVar3, C11180a<C6462k> aVar4, C11180a<C6466o> aVar5) {
        this.f25441a = aVar;
        this.f25442b = aVar2;
        this.f25443c = aVar3;
        this.f25444d = aVar4;
        this.f25445e = aVar5;
    }

    /* renamed from: a */
    public static C6159t m27019a(C11180a<C2657a> aVar, C11180a<C2657a> aVar2, C11180a<C6412e> aVar3, C11180a<C6462k> aVar4, C11180a<C6466o> aVar5) {
        return new C6159t(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C6156r m27020c(C2657a aVar, C2657a aVar2, C6412e eVar, C6462k kVar, C6466o oVar) {
        return new C6156r(aVar, aVar2, eVar, kVar, oVar);
    }

    /* renamed from: b */
    public C6156r get() {
        return m27020c(this.f25441a.get(), this.f25442b.get(), this.f25443c.get(), this.f25444d.get(), this.f25445e.get());
    }
}
