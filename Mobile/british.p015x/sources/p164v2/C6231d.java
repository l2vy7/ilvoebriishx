package p164v2;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p004a3.C0064i;
import p150t.C6077a;

/* renamed from: v2.d */
/* compiled from: ModelToResourceClassCache */
public class C6231d {

    /* renamed from: a */
    private final AtomicReference<C0064i> f25669a = new AtomicReference<>();

    /* renamed from: b */
    private final C6077a<C0064i, List<Class<?>>> f25670b = new C6077a<>();

    /* renamed from: a */
    public List<Class<?>> mo23744a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C0064i andSet = this.f25669a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C0064i(cls, cls2, cls3);
        } else {
            andSet.mo194a(cls, cls2, cls3);
        }
        synchronized (this.f25670b) {
            list = this.f25670b.get(andSet);
        }
        this.f25669a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void mo23745b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f25670b) {
            this.f25670b.put(new C0064i(cls, cls2, cls3), list);
        }
    }
}
