package p081g2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p004a3.C0058e;
import p004a3.C0065j;
import p013b3.C1554a;
import p013b3.C1563c;
import p064d2.C5154a;
import p064d2.C5159f;
import p081g2.C5281h;
import p081g2.C5314p;
import p096j2.C5502a;
import p104l0.C5645e;
import p168w2.C6311g;

/* renamed from: g2.l */
/* compiled from: EngineJob */
class C5305l<R> implements C5281h.C5283b<R>, C1554a.C1560f {

    /* renamed from: z */
    private static final C5308c f23422z = new C5308c();

    /* renamed from: b */
    final C5310e f23423b;

    /* renamed from: c */
    private final C1563c f23424c;

    /* renamed from: d */
    private final C5314p.C5315a f23425d;

    /* renamed from: e */
    private final C5645e<C5305l<?>> f23426e;

    /* renamed from: f */
    private final C5308c f23427f;

    /* renamed from: g */
    private final C5311m f23428g;

    /* renamed from: h */
    private final C5502a f23429h;

    /* renamed from: i */
    private final C5502a f23430i;

    /* renamed from: j */
    private final C5502a f23431j;

    /* renamed from: k */
    private final C5502a f23432k;

    /* renamed from: l */
    private final AtomicInteger f23433l;

    /* renamed from: m */
    private C5159f f23434m;

    /* renamed from: n */
    private boolean f23435n;

    /* renamed from: o */
    private boolean f23436o;

    /* renamed from: p */
    private boolean f23437p;

    /* renamed from: q */
    private boolean f23438q;

    /* renamed from: r */
    private C5323v<?> f23439r;

    /* renamed from: s */
    C5154a f23440s;

    /* renamed from: t */
    private boolean f23441t;

    /* renamed from: u */
    C5316q f23442u;

    /* renamed from: v */
    private boolean f23443v;

    /* renamed from: w */
    C5314p<?> f23444w;

    /* renamed from: x */
    private C5281h<R> f23445x;

    /* renamed from: y */
    private volatile boolean f23446y;

    /* renamed from: g2.l$a */
    /* compiled from: EngineJob */
    private class C5306a implements Runnable {

        /* renamed from: b */
        private final C6311g f23447b;

        C5306a(C6311g gVar) {
            this.f23447b = gVar;
        }

        public void run() {
            synchronized (this.f23447b.mo24076h()) {
                synchronized (C5305l.this) {
                    if (C5305l.this.f23423b.mo21582b(this.f23447b)) {
                        C5305l.this.mo21565e(this.f23447b);
                    }
                    C5305l.this.mo21568h();
                }
            }
        }
    }

    /* renamed from: g2.l$b */
    /* compiled from: EngineJob */
    private class C5307b implements Runnable {

        /* renamed from: b */
        private final C6311g f23449b;

        C5307b(C6311g gVar) {
            this.f23449b = gVar;
        }

        public void run() {
            synchronized (this.f23449b.mo24076h()) {
                synchronized (C5305l.this) {
                    if (C5305l.this.f23423b.mo21582b(this.f23449b)) {
                        C5305l.this.f23444w.mo21594d();
                        C5305l.this.mo21566f(this.f23449b);
                        C5305l.this.mo21574r(this.f23449b);
                    }
                    C5305l.this.mo21568h();
                }
            }
        }
    }

    /* renamed from: g2.l$c */
    /* compiled from: EngineJob */
    static class C5308c {
        C5308c() {
        }

        /* renamed from: a */
        public <R> C5314p<R> mo21578a(C5323v<R> vVar, boolean z, C5159f fVar, C5314p.C5315a aVar) {
            return new C5314p(vVar, z, true, fVar, aVar);
        }
    }

    /* renamed from: g2.l$d */
    /* compiled from: EngineJob */
    static final class C5309d {

        /* renamed from: a */
        final C6311g f23451a;

        /* renamed from: b */
        final Executor f23452b;

        C5309d(C6311g gVar, Executor executor) {
            this.f23451a = gVar;
            this.f23452b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5309d) {
                return this.f23451a.equals(((C5309d) obj).f23451a);
            }
            return false;
        }

        public int hashCode() {
            return this.f23451a.hashCode();
        }
    }

    /* renamed from: g2.l$e */
    /* compiled from: EngineJob */
    static final class C5310e implements Iterable<C5309d> {

        /* renamed from: b */
        private final List<C5309d> f23453b;

        C5310e() {
            this(new ArrayList(2));
        }

        /* renamed from: e */
        private static C5309d m23950e(C6311g gVar) {
            return new C5309d(gVar, C0058e.m228a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo21581a(C6311g gVar, Executor executor) {
            this.f23453b.add(new C5309d(gVar, executor));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo21582b(C6311g gVar) {
            return this.f23453b.contains(m23950e(gVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5310e mo21583c() {
            return new C5310e(new ArrayList(this.f23453b));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f23453b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo21585f(C6311g gVar) {
            this.f23453b.remove(m23950e(gVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f23453b.isEmpty();
        }

        public Iterator<C5309d> iterator() {
            return this.f23453b.iterator();
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f23453b.size();
        }

        C5310e(List<C5309d> list) {
            this.f23453b = list;
        }
    }

    C5305l(C5502a aVar, C5502a aVar2, C5502a aVar3, C5502a aVar4, C5311m mVar, C5314p.C5315a aVar5, C5645e<C5305l<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f23422z);
    }

    /* renamed from: i */
    private C5502a m23930i() {
        if (this.f23436o) {
            return this.f23431j;
        }
        return this.f23437p ? this.f23432k : this.f23430i;
    }

    /* renamed from: m */
    private boolean m23931m() {
        return this.f23443v || this.f23441t || this.f23446y;
    }

    /* renamed from: q */
    private synchronized void m23932q() {
        if (this.f23434m != null) {
            this.f23423b.clear();
            this.f23434m = null;
            this.f23444w = null;
            this.f23439r = null;
            this.f23443v = false;
            this.f23446y = false;
            this.f23441t = false;
            this.f23445x.mo21527G(false);
            this.f23445x = null;
            this.f23442u = null;
            this.f23440s = null;
            this.f23426e.mo7110a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo21534a(C5323v<R> vVar, C5154a aVar) {
        synchronized (this) {
            this.f23439r = vVar;
            this.f23440s = aVar;
        }
        mo21572o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo21564b(C6311g gVar, Executor executor) {
        this.f23424c.mo7114c();
        this.f23423b.mo21581a(gVar, executor);
        boolean z = true;
        if (this.f23441t) {
            mo21569j(1);
            executor.execute(new C5307b(gVar));
        } else if (this.f23443v) {
            mo21569j(1);
            executor.execute(new C5306a(gVar));
        } else {
            if (this.f23446y) {
                z = false;
            }
            C0065j.m244a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* renamed from: c */
    public void mo21535c(C5316q qVar) {
        synchronized (this) {
            this.f23442u = qVar;
        }
        mo21571n();
    }

    /* renamed from: d */
    public void mo21536d(C5281h<?> hVar) {
        m23930i().execute(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo21565e(C6311g gVar) {
        try {
            gVar.mo24075c(this.f23442u);
        } catch (Throwable th) {
            throw new C5274b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo21566f(C6311g gVar) {
        try {
            gVar.mo24074a(this.f23444w, this.f23440s);
        } catch (Throwable th) {
            throw new C5274b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo21567g() {
        if (!m23931m()) {
            this.f23446y = true;
            this.f23445x.mo21530l();
            this.f23428g.mo21555c(this, this.f23434m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo21568h() {
        C5314p<?> pVar;
        synchronized (this) {
            this.f23424c.mo7114c();
            C0065j.m244a(m23931m(), "Not yet complete!");
            int decrementAndGet = this.f23433l.decrementAndGet();
            C0065j.m244a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f23444w;
                m23932q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.mo21597g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized void mo21569j(int i) {
        C5314p<?> pVar;
        C0065j.m244a(m23931m(), "Not yet complete!");
        if (this.f23433l.getAndAdd(i) == 0 && (pVar = this.f23444w) != null) {
            pVar.mo21594d();
        }
    }

    /* renamed from: k */
    public C1563c mo7112k() {
        return this.f23424c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized C5305l<R> mo21570l(C5159f fVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f23434m = fVar;
        this.f23435n = z;
        this.f23436o = z2;
        this.f23437p = z3;
        this.f23438q = z4;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f23428g.mo21556d(r4, r1, (p081g2.C5314p<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f23452b.execute(new p081g2.C5305l.C5306a(r4, r1.f23451a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo21568h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21571n() {
        /*
            r4 = this;
            monitor-enter(r4)
            b3.c r0 = r4.f23424c     // Catch:{ all -> 0x0066 }
            r0.mo7114c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f23446y     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m23932q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            g2.l$e r0 = r4.f23423b     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f23443v     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f23443v = r0     // Catch:{ all -> 0x0066 }
            d2.f r1 = r4.f23434m     // Catch:{ all -> 0x0066 }
            g2.l$e r2 = r4.f23423b     // Catch:{ all -> 0x0066 }
            g2.l$e r2 = r2.mo21583c()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo21569j(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            g2.m r0 = r4.f23428g
            r3 = 0
            r0.mo21556d(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            g2.l$d r1 = (p081g2.C5305l.C5309d) r1
            java.util.concurrent.Executor r2 = r1.f23452b
            g2.l$a r3 = new g2.l$a
            w2.g r1 = r1.f23451a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo21568h()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r0
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: p081g2.C5305l.mo21571n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f23428g.mo21556d(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f23452b.execute(new p081g2.C5305l.C5307b(r5, r1.f23451a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo21568h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21572o() {
        /*
            r5 = this;
            monitor-enter(r5)
            b3.c r0 = r5.f23424c     // Catch:{ all -> 0x007c }
            r0.mo7114c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f23446y     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            g2.v<?> r0 = r5.f23439r     // Catch:{ all -> 0x007c }
            r0.mo21591a()     // Catch:{ all -> 0x007c }
            r5.m23932q()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            g2.l$e r0 = r5.f23423b     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f23441t     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            g2.l$c r0 = r5.f23427f     // Catch:{ all -> 0x007c }
            g2.v<?> r1 = r5.f23439r     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f23435n     // Catch:{ all -> 0x007c }
            d2.f r3 = r5.f23434m     // Catch:{ all -> 0x007c }
            g2.p$a r4 = r5.f23425d     // Catch:{ all -> 0x007c }
            g2.p r0 = r0.mo21578a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f23444w = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f23441t = r0     // Catch:{ all -> 0x007c }
            g2.l$e r1 = r5.f23423b     // Catch:{ all -> 0x007c }
            g2.l$e r1 = r1.mo21583c()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo21569j(r2)     // Catch:{ all -> 0x007c }
            d2.f r0 = r5.f23434m     // Catch:{ all -> 0x007c }
            g2.p<?> r2 = r5.f23444w     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            g2.m r3 = r5.f23428g
            r3.mo21556d(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            g2.l$d r1 = (p081g2.C5305l.C5309d) r1
            java.util.concurrent.Executor r2 = r1.f23452b
            g2.l$b r3 = new g2.l$b
            w2.g r1 = r1.f23451a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo21568h()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007f:
            throw r0
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: p081g2.C5305l.mo21572o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo21573p() {
        return this.f23438q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo21574r(C6311g gVar) {
        boolean z;
        this.f23424c.mo7114c();
        this.f23423b.mo21585f(gVar);
        if (this.f23423b.isEmpty()) {
            mo21567g();
            if (!this.f23441t) {
                if (!this.f23443v) {
                    z = false;
                    if (z && this.f23433l.get() == 0) {
                        m23932q();
                    }
                }
            }
            z = true;
            m23932q();
        }
    }

    /* renamed from: s */
    public synchronized void mo21575s(C5281h<R> hVar) {
        this.f23445x = hVar;
        (hVar.mo21528M() ? this.f23429h : m23930i()).execute(hVar);
    }

    C5305l(C5502a aVar, C5502a aVar2, C5502a aVar3, C5502a aVar4, C5311m mVar, C5314p.C5315a aVar5, C5645e<C5305l<?>> eVar, C5308c cVar) {
        this.f23423b = new C5310e();
        this.f23424c = C1563c.m7996a();
        this.f23433l = new AtomicInteger();
        this.f23429h = aVar;
        this.f23430i = aVar2;
        this.f23431j = aVar3;
        this.f23432k = aVar4;
        this.f23428g = mVar;
        this.f23425d = aVar5;
        this.f23426e = eVar;
        this.f23427f = cVar;
    }
}
