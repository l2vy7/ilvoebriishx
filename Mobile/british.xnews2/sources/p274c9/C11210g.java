package p274c9;

import java.net.InetAddress;
import p307g8.C12727k;
import p307g8.C12728l;
import p307g8.C12731o;
import p314j9.C12811e;
import p323q8.C12867a;
import p325r8.C12871b;
import p325r8.C12873d;
import p327s8.C12887e;

/* renamed from: c9.g */
/* compiled from: DefaultHttpRoutePlanner */
public class C11210g implements C12873d {

    /* renamed from: a */
    protected final C12887e f50326a;

    public C11210g(C12887e eVar) {
        if (eVar != null) {
            this.f50326a = eVar;
            return;
        }
        throw new IllegalArgumentException("SchemeRegistry must not be null.");
    }

    /* renamed from: a */
    public C12871b mo43653a(C12728l lVar, C12731o oVar, C12811e eVar) throws C12727k {
        if (oVar != null) {
            C12871b b = C12867a.m54483b(oVar.mo47801s());
            if (b != null) {
                return b;
            }
            if (lVar != null) {
                InetAddress c = C12867a.m54484c(oVar.mo47801s());
                C12728l a = C12867a.m54482a(oVar.mo47801s());
                boolean d = this.f50326a.mo48057c(lVar.mo47784c()).mo48050d();
                if (a == null) {
                    return new C12871b(lVar, c, d);
                }
                return new C12871b(lVar, c, a, d);
            }
            throw new IllegalStateException("Target host must not be null.");
        }
        throw new IllegalStateException("Request must not be null.");
    }
}
