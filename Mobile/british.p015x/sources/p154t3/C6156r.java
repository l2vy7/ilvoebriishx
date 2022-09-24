package p154t3;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p021c4.C2657a;
import p143r3.C5996b;
import p143r3.C6001g;
import p143r3.C6002h;
import p180y3.C6412e;
import p185z3.C6462k;
import p185z3.C6466o;

/* renamed from: t3.r */
/* compiled from: TransportRuntime */
public class C6156r implements C6155q {

    /* renamed from: e */
    private static volatile C6157s f25436e;

    /* renamed from: a */
    private final C2657a f25437a;

    /* renamed from: b */
    private final C2657a f25438b;

    /* renamed from: c */
    private final C6412e f25439c;

    /* renamed from: d */
    private final C6462k f25440d;

    C6156r(C2657a aVar, C2657a aVar2, C6412e eVar, C6462k kVar, C6466o oVar) {
        this.f25437a = aVar;
        this.f25438b = aVar2;
        this.f25439c = eVar;
        this.f25440d = kVar;
        oVar.mo24296a();
    }

    /* renamed from: b */
    private C6141h m27009b(C6148l lVar) {
        return C6141h.m26951a().mo23486i(this.f25437a.mo9336a()).mo23488k(this.f25438b.mo9336a()).mo23487j(lVar.mo23494g()).mo23485h(new C6140g(lVar.mo23489b(), lVar.mo23533d())).mo23484g(lVar.mo23490c().mo23089a()).mo23481d();
    }

    /* renamed from: c */
    public static C6156r m27010c() {
        C6157s sVar = f25436e;
        if (sVar != null) {
            return sVar.mo23513d();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C5996b> m27011d(C6138e eVar) {
        if (eVar instanceof C6139f) {
            return Collections.unmodifiableSet(((C6139f) eVar).mo16991a());
        }
        return Collections.singleton(C5996b.m26427b("proto"));
    }

    /* renamed from: f */
    public static void m27012f(Context context) {
        if (f25436e == null) {
            synchronized (C6156r.class) {
                if (f25436e == null) {
                    f25436e = C6135d.m26941e().mo23514a(context).build();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23538a(C6148l lVar, C6002h hVar) {
        this.f25439c.mo24240a(lVar.mo23493f().mo23534e(lVar.mo23490c().mo23091c()), m27009b(lVar), hVar);
    }

    /* renamed from: e */
    public C6462k mo23539e() {
        return this.f25440d;
    }

    /* renamed from: g */
    public C6001g mo23540g(C6138e eVar) {
        return new C6152n(m27011d(eVar), C6150m.m26992a().mo23509b(eVar.getName()).mo23510c(eVar.mo16990Z()).mo23508a(), this);
    }
}
