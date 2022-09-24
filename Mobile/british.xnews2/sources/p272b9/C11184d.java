package p272b9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import p313j8.C12797e;
import p333v8.C12917b;
import p333v8.C12919d;

/* renamed from: b9.d */
/* compiled from: BasicCookieStore */
public class C11184d implements C12797e, Serializable {

    /* renamed from: b */
    private final TreeSet<C12917b> f50255b = new TreeSet<>(new C12919d());

    /* renamed from: a */
    public synchronized void mo43547a(C12917b bVar) {
        if (bVar != null) {
            this.f50255b.remove(bVar);
            if (!bVar.mo47658s(new Date())) {
                this.f50255b.add(bVar);
            }
        }
    }

    public synchronized List<C12917b> getCookies() {
        return new ArrayList(this.f50255b);
    }

    public synchronized String toString() {
        return this.f50255b.toString();
    }
}
