package p337x8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: x8.b */
/* compiled from: Header */
public class C12954b implements Iterable<C12959f> {

    /* renamed from: b */
    private final List<C12959f> f55668b = new LinkedList();

    /* renamed from: c */
    private final Map<String, List<C12959f>> f55669c = new HashMap();

    /* renamed from: a */
    public void mo48132a(C12959f fVar) {
        if (fVar != null) {
            String lowerCase = fVar.mo48142b().toLowerCase(Locale.US);
            List list = this.f55669c.get(lowerCase);
            if (list == null) {
                list = new LinkedList();
                this.f55669c.put(lowerCase, list);
            }
            list.add(fVar);
            this.f55668b.add(fVar);
        }
    }

    /* renamed from: b */
    public C12959f mo48133b(String str) {
        List list;
        if (str == null || (list = this.f55669c.get(str.toLowerCase(Locale.US))) == null || list.isEmpty()) {
            return null;
        }
        return (C12959f) list.get(0);
    }

    public Iterator<C12959f> iterator() {
        return Collections.unmodifiableList(this.f55668b).iterator();
    }

    public String toString() {
        return this.f55668b.toString();
    }
}
