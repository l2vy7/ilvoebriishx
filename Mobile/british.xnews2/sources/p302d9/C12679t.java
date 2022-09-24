package p302d9;

import java.util.Locale;
import java.util.StringTokenizer;
import p333v8.C12917b;
import p333v8.C12920e;
import p333v8.C12922g;
import p333v8.C12926k;

/* renamed from: d9.t */
/* compiled from: NetscapeDomainHandler */
public class C12679t extends C12660f {
    /* renamed from: d */
    private static boolean m53956d(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        return upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT");
    }

    /* renamed from: a */
    public void mo47647a(C12917b bVar, C12920e eVar) throws C12926k {
        super.mo47647a(bVar, eVar);
        String a = eVar.mo48092a();
        String w = bVar.mo47673w();
        if (a.contains(".")) {
            int countTokens = new StringTokenizer(w, ".").countTokens();
            if (m53956d(w)) {
                if (countTokens < 2) {
                    throw new C12922g("Domain attribute \"" + w + "\" violates the Netscape cookie specification for " + "special domains");
                }
            } else if (countTokens < 3) {
                throw new C12922g("Domain attribute \"" + w + "\" violates the Netscape cookie specification");
            }
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
            return a.endsWith(w);
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
