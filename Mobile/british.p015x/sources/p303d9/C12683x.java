package p303d9;

import java.util.Locale;
import p334v8.C12917b;
import p334v8.C12918c;
import p334v8.C12920e;
import p334v8.C12922g;
import p334v8.C12926k;
import p334v8.C12928m;

/* renamed from: d9.x */
/* compiled from: RFC2109DomainHandler */
public class C12683x implements C12918c {
    /* renamed from: a */
    public void mo47647a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String a = eVar.mo48092a();
            String w = bVar.mo47673w();
            if (w == null) {
                throw new C12922g("Cookie domain may not be null");
            } else if (w.equals(a)) {
            } else {
                if (w.indexOf(46) == -1) {
                    throw new C12922g("Domain attribute \"" + w + "\" does not match the host \"" + a + "\"");
                } else if (w.startsWith(".")) {
                    int indexOf = w.indexOf(46, 1);
                    if (indexOf < 0 || indexOf == w.length() - 1) {
                        throw new C12922g("Domain attribute \"" + w + "\" violates RFC 2109: domain must contain an embedded dot");
                    }
                    String lowerCase = a.toLowerCase(Locale.ENGLISH);
                    if (!lowerCase.endsWith(w)) {
                        throw new C12922g("Illegal domain attribute \"" + w + "\". Domain of origin: \"" + lowerCase + "\"");
                    } else if (lowerCase.substring(0, lowerCase.length() - w.length()).indexOf(46) != -1) {
                        throw new C12922g("Domain attribute \"" + w + "\" violates RFC 2109: host minus domain may not contain any dots");
                    }
                } else {
                    throw new C12922g("Domain attribute \"" + w + "\" violates RFC 2109: domain must start with a dot");
                }
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
            if (a.equals(w) || (w.startsWith(".") && a.endsWith(w))) {
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
