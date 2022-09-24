package p004a3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a3.g */
/* compiled from: LruCache */
public class C0062g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f183a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f184b;

    /* renamed from: c */
    private long f185c;

    /* renamed from: d */
    private long f186d;

    public C0062g(long j) {
        this.f184b = j;
        this.f185c = j;
    }

    /* renamed from: f */
    private void m232f() {
        mo187m(this.f185c);
    }

    /* renamed from: b */
    public void mo180b() {
        mo187m(0);
    }

    /* renamed from: g */
    public synchronized Y mo181g(T t) {
        return this.f183a.get(t);
    }

    /* renamed from: h */
    public synchronized long mo182h() {
        return this.f185c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo183i(Y y) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo184j(T t, Y y) {
    }

    /* renamed from: k */
    public synchronized Y mo185k(T t, Y y) {
        long i = (long) mo183i(y);
        if (i >= this.f185c) {
            mo184j(t, y);
            return null;
        }
        if (y != null) {
            this.f186d += i;
        }
        Y put = this.f183a.put(t, y);
        if (put != null) {
            this.f186d -= (long) mo183i(put);
            if (!put.equals(y)) {
                mo184j(t, put);
            }
        }
        m232f();
        return put;
    }

    /* renamed from: l */
    public synchronized Y mo186l(T t) {
        Y remove;
        remove = this.f183a.remove(t);
        if (remove != null) {
            this.f186d -= (long) mo183i(remove);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void mo187m(long j) {
        while (this.f186d > j) {
            Iterator<Map.Entry<T, Y>> it = this.f183a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f186d -= (long) mo183i(value);
            Object key = next.getKey();
            it.remove();
            mo184j(key, value);
        }
    }
}
