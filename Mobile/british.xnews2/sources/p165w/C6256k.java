package p165w;

import p160v.C6213d;
import p165w.C6246e;

/* renamed from: w.k */
/* compiled from: Optimizer */
public class C6256k {

    /* renamed from: a */
    static boolean[] f25893a = new boolean[3];

    /* renamed from: a */
    static void m27553a(C6249f fVar, C6213d dVar, C6246e eVar) {
        eVar.f25777j = -1;
        eVar.f25779k = -1;
        C6246e.C6248b bVar = fVar.f25747O[0];
        C6246e.C6248b bVar2 = C6246e.C6248b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f25747O[0] == C6246e.C6248b.MATCH_PARENT) {
            int i = eVar.f25734D.f25713e;
            int Q = fVar.mo23808Q() - eVar.f25738F.f25713e;
            C6243d dVar2 = eVar.f25734D;
            dVar2.f25715g = dVar.mo23709q(dVar2);
            C6243d dVar3 = eVar.f25738F;
            dVar3.f25715g = dVar.mo23709q(dVar3);
            dVar.mo23700f(eVar.f25734D.f25715g, i);
            dVar.mo23700f(eVar.f25738F.f25715g, Q);
            eVar.f25777j = 2;
            eVar.mo23832l0(i, Q);
        }
        if (fVar.f25747O[1] != bVar2 && eVar.f25747O[1] == C6246e.C6248b.MATCH_PARENT) {
            int i2 = eVar.f25736E.f25713e;
            int w = fVar.mo23853w() - eVar.f25739G.f25713e;
            C6243d dVar4 = eVar.f25736E;
            dVar4.f25715g = dVar.mo23709q(dVar4);
            C6243d dVar5 = eVar.f25739G;
            dVar5.f25715g = dVar.mo23709q(dVar5);
            dVar.mo23700f(eVar.f25736E.f25715g, i2);
            dVar.mo23700f(eVar.f25739G.f25715g, w);
            if (eVar.f25760a0 > 0 || eVar.mo23807P() == 8) {
                C6243d dVar6 = eVar.f25740H;
                dVar6.f25715g = dVar.mo23709q(dVar6);
                dVar.mo23700f(eVar.f25740H.f25715g, eVar.f25760a0 + i2);
            }
            eVar.f25779k = 2;
            eVar.mo23782A0(i2, w);
        }
    }

    /* renamed from: b */
    public static final boolean m27554b(int i, int i2) {
        return (i & i2) == i2;
    }
}
