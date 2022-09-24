package p333v8;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: v8.f */
/* compiled from: CookiePathComparator */
public class C12921f implements Serializable, Comparator<C12917b> {
    /* renamed from: b */
    private String m54615b(C12917b bVar) {
        String y = bVar.mo47674y();
        if (y == null) {
            y = "/";
        }
        if (y.endsWith("/")) {
            return y;
        }
        return y + '/';
    }

    /* renamed from: a */
    public int compare(C12917b bVar, C12917b bVar2) {
        String b = m54615b(bVar);
        String b2 = m54615b(bVar2);
        if (b.equals(b2)) {
            return 0;
        }
        if (b.startsWith(b2)) {
            return -1;
        }
        if (b2.startsWith(b)) {
            return 1;
        }
        return 0;
    }
}
