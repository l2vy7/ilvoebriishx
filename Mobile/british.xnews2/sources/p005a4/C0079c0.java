package p005a4;

import p020c4.C2657a;
import p164v3.C6237b;
import p271b8.C11180a;

/* renamed from: a4.c0 */
/* compiled from: SQLiteEventStore_Factory */
public final class C0079c0 implements C6237b<C0073b0> {

    /* renamed from: a */
    private final C11180a<C2657a> f216a;

    /* renamed from: b */
    private final C11180a<C2657a> f217b;

    /* renamed from: c */
    private final C11180a<C0080d> f218c;

    /* renamed from: d */
    private final C11180a<C0093h0> f219d;

    public C0079c0(C11180a<C2657a> aVar, C11180a<C2657a> aVar2, C11180a<C0080d> aVar3, C11180a<C0093h0> aVar4) {
        this.f216a = aVar;
        this.f217b = aVar2;
        this.f218c = aVar3;
        this.f219d = aVar4;
    }

    /* renamed from: a */
    public static C0079c0 m337a(C11180a<C2657a> aVar, C11180a<C2657a> aVar2, C11180a<C0080d> aVar3, C11180a<C0093h0> aVar4) {
        return new C0079c0(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C0073b0 m338c(C2657a aVar, C2657a aVar2, Object obj, Object obj2) {
        return new C0073b0(aVar, aVar2, (C0080d) obj, (C0093h0) obj2);
    }

    /* renamed from: b */
    public C0073b0 get() {
        return m338c(this.f216a.get(), this.f217b.get(), this.f218c.get(), this.f219d.get());
    }
}
