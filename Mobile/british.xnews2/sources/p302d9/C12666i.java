package p302d9;

import p333v8.C12917b;
import p333v8.C12918c;
import p333v8.C12920e;
import p333v8.C12922g;
import p333v8.C12926k;
import p333v8.C12928m;

/* renamed from: d9.i */
/* compiled from: BasicPathHandler */
public class C12666i implements C12918c {
    /* renamed from: a */
    public void mo47647a(C12917b bVar, C12920e eVar) throws C12926k {
        if (!mo47648b(bVar, eVar)) {
            throw new C12922g("Illegal path attribute \"" + bVar.mo47674y() + "\". Path of origin: \"" + eVar.mo48093b() + "\"");
        }
    }

    /* renamed from: b */
    public boolean mo47648b(C12917b bVar, C12920e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String b = eVar.mo48093b();
            String y = bVar.mo47674y();
            if (y == null) {
                y = "/";
            }
            boolean z = false;
            if (y.length() > 1 && y.endsWith("/")) {
                y = y.substring(0, y.length() - 1);
            }
            boolean startsWith = b.startsWith(y);
            if (!startsWith || b.length() == y.length() || y.endsWith("/")) {
                return startsWith;
            }
            if (b.charAt(y.length()) == '/') {
                z = true;
            }
            return z;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: c */
    public void mo47649c(C12928m mVar, String str) throws C12926k {
        if (mVar != null) {
            if (str == null || str.trim().length() == 0) {
                str = "/";
            }
            mVar.mo47667h(str);
            return;
        }
        throw new IllegalArgumentException("Cookie may not be null");
    }
}
