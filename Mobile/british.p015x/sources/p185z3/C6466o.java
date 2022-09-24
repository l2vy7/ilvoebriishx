package p185z3;

import java.util.concurrent.Executor;
import p005a4.C0078c;
import p014b4.C1567b;
import p154t3.C6150m;

/* renamed from: z3.o */
/* compiled from: WorkInitializer */
public class C6466o {

    /* renamed from: a */
    private final Executor f26543a;

    /* renamed from: b */
    private final C0078c f26544b;

    /* renamed from: c */
    private final C6468q f26545c;

    /* renamed from: d */
    private final C1567b f26546d;

    C6466o(Executor executor, C0078c cVar, C6468q qVar, C1567b bVar) {
        this.f26543a = executor;
        this.f26544b = cVar;
        this.f26545c = qVar;
        this.f26546d = bVar;
    }

    /* renamed from: b */
    static /* synthetic */ Object m28192b(C6466o oVar) {
        for (C6150m a : oVar.f26544b.mo222L()) {
            oVar.f26545c.mo24267a(a, 1);
        }
        return null;
    }

    /* renamed from: a */
    public void mo24296a() {
        this.f26543a.execute(C6464m.m28189a(this));
    }
}
