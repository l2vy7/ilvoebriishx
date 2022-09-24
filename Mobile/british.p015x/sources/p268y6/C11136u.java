package p268y6;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p201d7.C10504a;
import p201d7.C10505b;
import p201d7.C10506c;
import p201d7.C10507d;

/* renamed from: y6.u */
/* compiled from: EventBus */
class C11136u implements C10507d, C10506c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C10505b<Object>, Executor>> f50125a = new HashMap();

    /* renamed from: b */
    private Queue<C10504a<?>> f50126b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f50127c;

    C11136u(Executor executor) {
        this.f50127c = executor;
    }

    /* renamed from: e */
    private synchronized Set<Map.Entry<C10505b<Object>, Executor>> m49707e(C10504a<?> aVar) {
        Map map;
        map = this.f50125a.get(aVar.mo42642b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* renamed from: a */
    public synchronized <T> void mo42644a(Class<T> cls, Executor executor, C10505b<? super T> bVar) {
        C11113c0.m49615b(cls);
        C11113c0.m49615b(bVar);
        C11113c0.m49615b(executor);
        if (!this.f50125a.containsKey(cls)) {
            this.f50125a.put(cls, new ConcurrentHashMap());
        }
        this.f50125a.get(cls).put(bVar, executor);
    }

    /* renamed from: b */
    public <T> void mo42645b(Class<T> cls, C10505b<? super T> bVar) {
        mo42644a(cls, this.f50127c, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo43432d() {
        Queue<C10504a<?>> queue;
        synchronized (this) {
            queue = this.f50126b;
            if (queue != null) {
                this.f50126b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C10504a g : queue) {
                mo43433g(g);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new p268y6.C12970t(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = m49707e(r5).iterator();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43433g(p201d7.C10504a<?> r5) {
        /*
            r4 = this;
            p268y6.C11113c0.m49615b(r5)
            monitor-enter(r4)
            java.util.Queue<d7.a<?>> r0 = r4.f50126b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.m49707e(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            y6.t r3 = new y6.t
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0035:
            throw r5
        L_0x0036:
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: p268y6.C11136u.mo43433g(d7.a):void");
    }
}
