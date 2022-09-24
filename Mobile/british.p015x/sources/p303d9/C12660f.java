package p303d9;

import p334v8.C12917b;
import p334v8.C12918c;
import p334v8.C12920e;
import p334v8.C12922g;
import p334v8.C12926k;
import p334v8.C12928m;

/* renamed from: d9.f */
/* compiled from: BasicDomainHandler */
public class C12660f implements C12918c {
    /* renamed from: a */
    public void mo47647a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String a = eVar.mo48092a();
            String w = bVar.mo47673w();
            if (w == null) {
                throw new C12922g("Cookie domain may not be null");
            } else if (a.contains(".")) {
                if (!a.endsWith(w)) {
                    if (w.startsWith(".")) {
                        w = w.substring(1, w.length());
                    }
                    if (!a.equals(w)) {
                        throw new C12922g("Illegal domain attribute \"" + w + "\". Domain of origin: \"" + a + "\"");
                    }
                }
            } else if (!a.equals(w)) {
                throw new C12922g("Illegal domain attribute \"" + w + "\". Domain of origin: \"" + a + "\"");
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: b */
    public boolean mo47648b(C12917b bVar, C12920e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String a = eVar.mo48092a();
            String w = bVar.mo47673w();
            if (w == null) {
                return false;
            }
            if (a.equals(w)) {
                return true;
            }
            if (!w.startsWith(".")) {
                w = '.' + w;
            }
            if (a.endsWith(w) || a.equals(w.substring(1))) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: c */
    public void mo47649c(C12928m mVar, String str) throws C12926k {
        if (mVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new C12926k("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            mVar.mo47671p(str);
        } else {
            throw new C12926k("Blank value for domain attribute");
        }
    }
}
