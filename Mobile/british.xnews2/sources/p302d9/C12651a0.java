package p302d9;

import p333v8.C12917b;
import p333v8.C12920e;
import p333v8.C12922g;
import p333v8.C12926k;
import p333v8.C12928m;

/* renamed from: d9.a0 */
/* compiled from: RFC2109VersionHandler */
public class C12651a0 extends C12650a {
    /* renamed from: a */
    public void mo47647a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (bVar.mo47662c() < 0) {
            throw new C12922g("Cookie version may not be negative");
        }
    }

    /* renamed from: c */
    public void mo47649c(C12928m mVar, String str) throws C12926k {
        if (mVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new C12926k("Missing value for version attribute");
        } else if (str.trim().length() != 0) {
            try {
                mVar.mo47663d(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                throw new C12926k("Invalid version: " + e.getMessage());
            }
        } else {
            throw new C12926k("Blank value for version attribute");
        }
    }
}
