package p163v2;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p004a3.C0064i;
import p081g2.C5290i;
import p081g2.C5320t;
import p104l0.C5645e;
import p146s2.C6024g;
import p149t.C6077a;

/* renamed from: v2.c */
/* compiled from: LoadPathCache */
public class C6230c {

    /* renamed from: c */
    private static final C5320t<?, ?, ?> f25666c = new C5320t(Object.class, Object.class, Object.class, Collections.singletonList(new C5290i(Object.class, Object.class, Object.class, Collections.emptyList(), new C6024g(), (C5645e<List<Throwable>>) null)), (C5645e<List<Throwable>>) null);

    /* renamed from: a */
    private final C6077a<C0064i, C5320t<?, ?, ?>> f25667a = new C6077a<>();

    /* renamed from: b */
    private final AtomicReference<C0064i> f25668b = new AtomicReference<>();

    /* renamed from: b */
    private C0064i m27313b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C0064i andSet = this.f25668b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C0064i();
        }
        andSet.mo194a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C5320t<Data, TResource, Transcode> mo23741a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C5320t<Data, TResource, Transcode> tVar;
        C0064i b = m27313b(cls, cls2, cls3);
        synchronized (this.f25667a) {
            tVar = this.f25667a.get(b);
        }
        this.f25668b.set(b);
        return tVar;
    }

    /* renamed from: c */
    public boolean mo23742c(C5320t<?, ?, ?> tVar) {
        return f25666c.equals(tVar);
    }

    /* renamed from: d */
    public void mo23743d(Class<?> cls, Class<?> cls2, Class<?> cls3, C5320t<?, ?, ?> tVar) {
        synchronized (this.f25667a) {
            C6077a<C0064i, C5320t<?, ?, ?>> aVar = this.f25667a;
            C0064i iVar = new C0064i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f25666c;
            }
            aVar.put(iVar, tVar);
        }
    }
}
