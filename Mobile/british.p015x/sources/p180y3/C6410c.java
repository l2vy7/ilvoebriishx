package p180y3;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p005a4.C0078c;
import p014b4.C1567b;
import p143r3.C6002h;
import p154t3.C6141h;
import p154t3.C6150m;
import p154t3.C6156r;
import p159u3.C6196e;
import p159u3.C6207m;
import p185z3.C6468q;

/* renamed from: y3.c */
/* compiled from: DefaultScheduler */
public class C6410c implements C6412e {

    /* renamed from: f */
    private static final Logger f26333f = Logger.getLogger(C6156r.class.getName());

    /* renamed from: a */
    private final C6468q f26334a;

    /* renamed from: b */
    private final Executor f26335b;

    /* renamed from: c */
    private final C6196e f26336c;

    /* renamed from: d */
    private final C0078c f26337d;

    /* renamed from: e */
    private final C1567b f26338e;

    public C6410c(Executor executor, C6196e eVar, C6468q qVar, C0078c cVar, C1567b bVar) {
        this.f26335b = executor;
        this.f26336c = eVar;
        this.f26334a = qVar;
        this.f26337d = cVar;
        this.f26338e = bVar;
    }

    /* renamed from: b */
    static /* synthetic */ Object m28094b(C6410c cVar, C6150m mVar, C6141h hVar) {
        cVar.f26337d.mo224b(mVar, hVar);
        cVar.f26334a.mo24267a(mVar, 1);
        return null;
    }

    /* renamed from: c */
    static /* synthetic */ void m28095c(C6410c cVar, C6150m mVar, C6002h hVar, C6141h hVar2) {
        try {
            C6207m mVar2 = cVar.f26336c.get(mVar.mo23503b());
            if (mVar2 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{mVar.mo23503b()});
                f26333f.warning(format);
                hVar.mo23102a(new IllegalArgumentException(format));
                return;
            }
            cVar.f26338e.mo225c(C6409b.m28092b(cVar, mVar, mVar2.mo16999b(hVar2)));
            hVar.mo23102a((Exception) null);
        } catch (Exception e) {
            Logger logger = f26333f;
            logger.warning("Error scheduling event " + e.getMessage());
            hVar.mo23102a(e);
        }
    }

    /* renamed from: a */
    public void mo24240a(C6150m mVar, C6141h hVar, C6002h hVar2) {
        this.f26335b.execute(C6408a.m28091a(this, mVar, hVar2, hVar));
    }
}
