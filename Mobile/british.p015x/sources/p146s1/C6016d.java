package p146s1;

import android.content.Context;
import androidx.work.C1483m;
import java.util.ArrayList;
import java.util.List;
import p152t1.C6095a;
import p152t1.C6096b;
import p152t1.C6097c;
import p152t1.C6099d;
import p152t1.C6100e;
import p152t1.C6101f;
import p152t1.C6102g;
import p152t1.C6103h;
import p168w1.C6283p;
import p178y1.C6400a;

/* renamed from: s1.d */
/* compiled from: WorkConstraintsTracker */
public class C6016d implements C6097c.C6098a {

    /* renamed from: d */
    private static final String f25076d = C1483m.m7773f("WorkConstraintsTracker");

    /* renamed from: a */
    private final C6015c f25077a;

    /* renamed from: b */
    private final C6097c<?>[] f25078b;

    /* renamed from: c */
    private final Object f25079c = new Object();

    public C6016d(Context context, C6400a aVar, C6015c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f25077a = cVar;
        this.f25078b = new C6097c[]{new C6095a(applicationContext, aVar), new C6096b(applicationContext, aVar), new C6103h(applicationContext, aVar), new C6099d(applicationContext, aVar), new C6102g(applicationContext, aVar), new C6101f(applicationContext, aVar), new C6100e(applicationContext, aVar)};
    }

    /* renamed from: a */
    public void mo23143a(List<String> list) {
        synchronized (this.f25079c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (mo23145c(next)) {
                    C1483m.m7771c().mo7013a(f25076d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            C6015c cVar = this.f25077a;
            if (cVar != null) {
                cVar.mo6939f(arrayList);
            }
        }
    }

    /* renamed from: b */
    public void mo23144b(List<String> list) {
        synchronized (this.f25079c) {
            C6015c cVar = this.f25077a;
            if (cVar != null) {
                cVar.mo6937b(list);
            }
        }
    }

    /* renamed from: c */
    public boolean mo23145c(String str) {
        synchronized (this.f25079c) {
            for (C6097c<?> cVar : this.f25078b) {
                if (cVar.mo23415d(str)) {
                    C1483m.m7771c().mo7013a(f25076d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void mo23146d(Iterable<C6283p> iterable) {
        synchronized (this.f25079c) {
            for (C6097c<?> g : this.f25078b) {
                g.mo23418g((C6097c.C6098a) null);
            }
            for (C6097c<?> e : this.f25078b) {
                e.mo23416e(iterable);
            }
            for (C6097c<?> g2 : this.f25078b) {
                g2.mo23418g(this);
            }
        }
    }

    /* renamed from: e */
    public void mo23147e() {
        synchronized (this.f25079c) {
            for (C6097c<?> f : this.f25078b) {
                f.mo23417f();
            }
        }
    }
}
