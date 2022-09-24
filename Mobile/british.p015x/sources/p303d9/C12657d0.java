package p303d9;

import java.util.Locale;
import p334v8.C12916a;
import p334v8.C12917b;
import p334v8.C12918c;
import p334v8.C12920e;
import p334v8.C12922g;
import p334v8.C12926k;
import p334v8.C12928m;

/* renamed from: d9.d0 */
/* compiled from: RFC2965DomainAttributeHandler */
public class C12657d0 implements C12918c {
    /* renamed from: a */
    public void mo47647a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String a = eVar.mo48092a();
            Locale locale = Locale.ENGLISH;
            String lowerCase = a.toLowerCase(locale);
            if (bVar.mo47673w() != null) {
                String lowerCase2 = bVar.mo47673w().toLowerCase(locale);
                if (!(bVar instanceof C12916a) || !((C12916a) bVar).mo47668i("domain")) {
                    if (!bVar.mo47673w().equals(lowerCase)) {
                        throw new C12922g("Illegal domain attribute: \"" + bVar.mo47673w() + "\"." + "Domain of origin: \"" + lowerCase + "\"");
                    }
                } else if (lowerCase2.startsWith(".")) {
                    int indexOf = lowerCase2.indexOf(46, 1);
                    if ((indexOf < 0 || indexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                        throw new C12922g("Domain attribute \"" + bVar.mo47673w() + "\" violates RFC 2965: the value contains no embedded dots " + "and the value is not .local");
                    } else if (!mo47675d(lowerCase, lowerCase2)) {
                        throw new C12922g("Domain attribute \"" + bVar.mo47673w() + "\" violates RFC 2965: effective host name does not " + "domain-match domain attribute.");
                    } else if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) != -1) {
                        throw new C12922g("Domain attribute \"" + bVar.mo47673w() + "\" violates RFC 2965: " + "effective host minus domain may not contain any dots");
                    }
                } else {
                    throw new C12922g("Domain attribute \"" + bVar.mo47673w() + "\" violates RFC 2109: domain must start with a dot");
                }
            } else {
                throw new C12922g("Invalid cookie state: domain not specified");
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
            String lowerCase = eVar.mo48092a().toLowerCase(Locale.ENGLISH);
            String w = bVar.mo47673w();
            if (mo47675d(lowerCase, w) && lowerCase.substring(0, lowerCase.length() - w.length()).indexOf(46) == -1) {
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
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (!lowerCase.startsWith(".")) {
                lowerCase = '.' + lowerCase;
            }
            mVar.mo47671p(lowerCase);
        } else {
            throw new C12926k("Blank value for domain attribute");
        }
    }

    /* renamed from: d */
    public boolean mo47675d(String str, String str2) {
        return str.equals(str2) || (str2.startsWith(".") && str.endsWith(str2));
    }
}
