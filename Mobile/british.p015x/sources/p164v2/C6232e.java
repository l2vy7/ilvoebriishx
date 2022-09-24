package p164v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p065d2.C5165j;

/* renamed from: v2.e */
/* compiled from: ResourceDecoderRegistry */
public class C6232e {

    /* renamed from: a */
    private final List<String> f25671a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C6233a<?, ?>>> f25672b = new HashMap();

    /* renamed from: v2.e$a */
    /* compiled from: ResourceDecoderRegistry */
    private static class C6233a<T, R> {

        /* renamed from: a */
        private final Class<T> f25673a;

        /* renamed from: b */
        final Class<R> f25674b;

        /* renamed from: c */
        final C5165j<T, R> f25675c;

        public C6233a(Class<T> cls, Class<R> cls2, C5165j<T, R> jVar) {
            this.f25673a = cls;
            this.f25674b = cls2;
            this.f25675c = jVar;
        }

        /* renamed from: a */
        public boolean mo23750a(Class<?> cls, Class<?> cls2) {
            return this.f25673a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f25674b);
        }
    }

    /* renamed from: c */
    private synchronized List<C6233a<?, ?>> m27319c(String str) {
        List<C6233a<?, ?>> list;
        if (!this.f25671a.contains(str)) {
            this.f25671a.add(str);
        }
        list = this.f25672b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f25672b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo23746a(String str, C5165j<T, R> jVar, Class<T> cls, Class<R> cls2) {
        m27319c(str).add(new C6233a(cls, cls2, jVar));
    }

    /* renamed from: b */
    public synchronized <T, R> List<C5165j<T, R>> mo23747b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f25671a) {
            List<C6233a> list = this.f25672b.get(str);
            if (list != null) {
                for (C6233a aVar : list) {
                    if (aVar.mo23750a(cls, cls2)) {
                        arrayList.add(aVar.f25675c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo23748d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f25671a) {
            List<C6233a> list = this.f25672b.get(str);
            if (list != null) {
                for (C6233a aVar : list) {
                    if (aVar.mo23750a(cls, cls2) && !arrayList.contains(aVar.f25674b)) {
                        arrayList.add(aVar.f25674b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo23749e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f25671a);
        this.f25671a.clear();
        for (String add : list) {
            this.f25671a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f25671a.add(str);
            }
        }
    }
}
