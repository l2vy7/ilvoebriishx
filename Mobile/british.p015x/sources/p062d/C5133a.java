package p062d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: d.a */
/* compiled from: ContextAwareHelper */
public final class C5133a {

    /* renamed from: a */
    private final Set<C5134b> f22544a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f22545b;

    /* renamed from: a */
    public void mo21280a(C5134b bVar) {
        if (this.f22545b != null) {
            bVar.mo799a(this.f22545b);
        }
        this.f22544a.add(bVar);
    }

    /* renamed from: b */
    public void mo21281b() {
        this.f22545b = null;
    }

    /* renamed from: c */
    public void mo21282c(Context context) {
        this.f22545b = context;
        for (C5134b a : this.f22544a) {
            a.mo799a(context);
        }
    }
}
