package p146s2;

import java.util.ArrayList;
import java.util.List;

/* renamed from: s2.f */
/* compiled from: TranscoderRegistry */
public class C6022f {

    /* renamed from: a */
    private final List<C6023a<?, ?>> f25086a = new ArrayList();

    /* renamed from: s2.f$a */
    /* compiled from: TranscoderRegistry */
    private static final class C6023a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f25087a;

        /* renamed from: b */
        private final Class<R> f25088b;

        /* renamed from: c */
        final C6021e<Z, R> f25089c;

        C6023a(Class<Z> cls, Class<R> cls2, C6021e<Z, R> eVar) {
            this.f25087a = cls;
            this.f25088b = cls2;
            this.f25089c = eVar;
        }

        /* renamed from: a */
        public boolean mo23152a(Class<?> cls, Class<?> cls2) {
            return this.f25087a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f25088b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> C6021e<Z, R> mo23149a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C6024g.m26505b();
        }
        for (C6023a next : this.f25086a) {
            if (next.mo23152a(cls, cls2)) {
                return next.f25089c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo23150b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C6023a<?, ?> a : this.f25086a) {
            if (a.mo23152a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo23151c(Class<Z> cls, Class<R> cls2, C6021e<Z, R> eVar) {
        this.f25086a.add(new C6023a(cls, cls2, eVar));
    }
}
