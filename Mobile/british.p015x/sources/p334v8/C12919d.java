package p334v8;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: v8.d */
/* compiled from: CookieIdentityComparator */
public class C12919d implements Serializable, Comparator<C12917b> {
    /* renamed from: a */
    public int compare(C12917b bVar, C12917b bVar2) {
        int compareTo = bVar.getName().compareTo(bVar2.getName());
        if (compareTo == 0) {
            String w = bVar.mo47673w();
            String str = "";
            if (w == null) {
                w = str;
            } else if (w.indexOf(46) == -1) {
                w = w + ".local";
            }
            String w2 = bVar2.mo47673w();
            if (w2 != null) {
                if (w2.indexOf(46) == -1) {
                    str = w2 + ".local";
                } else {
                    str = w2;
                }
            }
            compareTo = w.compareToIgnoreCase(str);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        String y = bVar.mo47674y();
        String str2 = "/";
        if (y == null) {
            y = str2;
        }
        String y2 = bVar2.mo47674y();
        if (y2 != null) {
            str2 = y2;
        }
        return y.compareTo(str2);
    }
}
