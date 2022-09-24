package p303d9;

import java.util.StringTokenizer;
import p334v8.C12916a;
import p334v8.C12917b;
import p334v8.C12918c;
import p334v8.C12920e;
import p334v8.C12922g;
import p334v8.C12926k;
import p334v8.C12927l;
import p334v8.C12928m;

/* renamed from: d9.e0 */
/* compiled from: RFC2965PortAttributeHandler */
public class C12659e0 implements C12918c {
    /* renamed from: d */
    private static int[] m53899d(String str) throws C12926k {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (iArr[i] >= 0) {
                    i++;
                } else {
                    throw new C12926k("Invalid Port attribute.");
                }
            } catch (NumberFormatException e) {
                throw new C12926k("Invalid Port attribute: " + e.getMessage());
            }
        }
        return iArr;
    }

    /* renamed from: e */
    private static boolean m53900e(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo47647a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            int c = eVar.mo48094c();
            if ((bVar instanceof C12916a) && ((C12916a) bVar).mo47668i("port") && !m53900e(c, bVar.mo47656l())) {
                throw new C12922g("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
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
            int c = eVar.mo48094c();
            if (!(bVar instanceof C12916a) || !((C12916a) bVar).mo47668i("port")) {
                return true;
            }
            if (bVar.mo47656l() != null && m53900e(c, bVar.mo47656l())) {
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
        } else if (mVar instanceof C12927l) {
            C12927l lVar = (C12927l) mVar;
            if (str != null && str.trim().length() > 0) {
                lVar.mo47653B(m53899d(str));
            }
        }
    }
}
