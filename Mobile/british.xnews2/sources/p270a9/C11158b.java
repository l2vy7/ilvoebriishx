package p270a9;

import p305f8.C12696a;
import p307g8.C12716c;
import p307g8.C12731o;
import p309h8.C12755f;
import p309h8.C12757h;
import p309h8.C12759j;
import p310h9.C12777p;
import p311i8.C12786a;
import p316k9.C12821b;
import p316k9.C12822c;

/* renamed from: a9.b */
/* compiled from: BasicScheme */
public class C11158b extends C11177m {

    /* renamed from: c */
    private boolean f50175c = false;

    /* renamed from: l */
    public static C12716c m49768l(C12757h hVar, String str, boolean z) {
        if (hVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(hVar.mo47837a().getName());
            sb.append(":");
            sb.append(hVar.mo47838b() == null ? "null" : hVar.mo47838b());
            byte[] h = C12696a.m53997h(C12822c.m54368d(sb.toString(), str));
            C12821b bVar = new C12821b(32);
            if (z) {
                bVar.mo47966c("Proxy-Authorization");
            } else {
                bVar.mo47966c(RtspHeaders.AUTHORIZATION);
            }
            bVar.mo47966c(": Basic ");
            bVar.mo47969f(h, 0, h.length);
            return new C12777p(bVar);
        } else {
            throw new IllegalArgumentException("charset may not be null");
        }
    }

    /* renamed from: d */
    public boolean mo43466d() {
        return this.f50175c;
    }

    /* renamed from: e */
    public C12716c mo43467e(C12757h hVar, C12731o oVar) throws C12755f {
        if (hVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (oVar != null) {
            return m49768l(hVar, C12786a.m54249a(oVar.mo47801s()), mo43462b());
        } else {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
    }

    /* renamed from: f */
    public void mo43464f(C12716c cVar) throws C12759j {
        super.mo43464f(cVar);
        this.f50175c = true;
    }

    /* renamed from: h */
    public boolean mo43468h() {
        return false;
    }

    /* renamed from: i */
    public String mo43469i() {
        return "basic";
    }
}
