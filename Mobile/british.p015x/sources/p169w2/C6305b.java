package p169w2;

import p169w2.C6307d;

/* renamed from: w2.b */
/* compiled from: ErrorRequestCoordinator */
public final class C6305b implements C6307d, C6306c {

    /* renamed from: a */
    private final Object f26021a;

    /* renamed from: b */
    private final C6307d f26022b;

    /* renamed from: c */
    private volatile C6306c f26023c;

    /* renamed from: d */
    private volatile C6306c f26024d;

    /* renamed from: e */
    private C6307d.C6308a f26025e;

    /* renamed from: f */
    private C6307d.C6308a f26026f;

    public C6305b(Object obj, C6307d dVar) {
        C6307d.C6308a aVar = C6307d.C6308a.CLEARED;
        this.f26025e = aVar;
        this.f26026f = aVar;
        this.f26021a = obj;
        this.f26022b = dVar;
    }

    /* renamed from: l */
    private boolean m27743l(C6306c cVar) {
        return cVar.equals(this.f26023c) || (this.f26025e == C6307d.C6308a.FAILED && cVar.equals(this.f26024d));
    }

    /* renamed from: m */
    private boolean m27744m() {
        C6307d dVar = this.f26022b;
        return dVar == null || dVar.mo24069j(this);
    }

    /* renamed from: n */
    private boolean m27745n() {
        C6307d dVar = this.f26022b;
        return dVar == null || dVar.mo24064f(this);
    }

    /* renamed from: o */
    private boolean m27746o() {
        C6307d dVar = this.f26022b;
        return dVar == null || dVar.mo24066h(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24058a(p169w2.C6306c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f26021a
            monitor-enter(r0)
            w2.c r1 = r2.f26024d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            w2.d$a r3 = p169w2.C6307d.C6308a.FAILED     // Catch:{ all -> 0x002b }
            r2.f26025e = r3     // Catch:{ all -> 0x002b }
            w2.d$a r3 = r2.f26026f     // Catch:{ all -> 0x002b }
            w2.d$a r1 = p169w2.C6307d.C6308a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f26026f = r1     // Catch:{ all -> 0x002b }
            w2.c r3 = r2.f26024d     // Catch:{ all -> 0x002b }
            r3.mo24067i()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            w2.d$a r3 = p169w2.C6307d.C6308a.FAILED     // Catch:{ all -> 0x002b }
            r2.f26026f = r3     // Catch:{ all -> 0x002b }
            w2.d r3 = r2.f26022b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo24058a(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p169w2.C6305b.mo24058a(w2.c):void");
    }

    /* renamed from: b */
    public boolean mo24059b() {
        boolean z;
        synchronized (this.f26021a) {
            if (!this.f26023c.mo24059b()) {
                if (!this.f26024d.mo24059b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public C6307d mo24060c() {
        C6307d c;
        synchronized (this.f26021a) {
            C6307d dVar = this.f26022b;
            c = dVar != null ? dVar.mo24060c() : this;
        }
        return c;
    }

    public void clear() {
        synchronized (this.f26021a) {
            C6307d.C6308a aVar = C6307d.C6308a.CLEARED;
            this.f26025e = aVar;
            this.f26023c.clear();
            if (this.f26026f != aVar) {
                this.f26026f = aVar;
                this.f26024d.clear();
            }
        }
    }

    /* renamed from: d */
    public boolean mo24062d() {
        boolean z;
        synchronized (this.f26021a) {
            C6307d.C6308a aVar = this.f26025e;
            C6307d.C6308a aVar2 = C6307d.C6308a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f26026f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo24063e(C6306c cVar) {
        if (!(cVar instanceof C6305b)) {
            return false;
        }
        C6305b bVar = (C6305b) cVar;
        if (!this.f26023c.mo24063e(bVar.f26023c) || !this.f26024d.mo24063e(bVar.f26024d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo24064f(C6306c cVar) {
        boolean z;
        synchronized (this.f26021a) {
            z = m27745n() && m27743l(cVar);
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo24065g() {
        boolean z;
        synchronized (this.f26021a) {
            C6307d.C6308a aVar = this.f26025e;
            C6307d.C6308a aVar2 = C6307d.C6308a.CLEARED;
            z = aVar == aVar2 && this.f26026f == aVar2;
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo24066h(C6306c cVar) {
        boolean z;
        synchronized (this.f26021a) {
            z = m27746o() && m27743l(cVar);
        }
        return z;
    }

    /* renamed from: i */
    public void mo24067i() {
        synchronized (this.f26021a) {
            C6307d.C6308a aVar = this.f26025e;
            C6307d.C6308a aVar2 = C6307d.C6308a.RUNNING;
            if (aVar != aVar2) {
                this.f26025e = aVar2;
                this.f26023c.mo24067i();
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f26021a) {
            C6307d.C6308a aVar = this.f26025e;
            C6307d.C6308a aVar2 = C6307d.C6308a.RUNNING;
            if (aVar != aVar2) {
                if (this.f26026f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo24069j(C6306c cVar) {
        boolean z;
        synchronized (this.f26021a) {
            z = m27744m() && m27743l(cVar);
        }
        return z;
    }

    /* renamed from: k */
    public void mo24070k(C6306c cVar) {
        synchronized (this.f26021a) {
            if (cVar.equals(this.f26023c)) {
                this.f26025e = C6307d.C6308a.SUCCESS;
            } else if (cVar.equals(this.f26024d)) {
                this.f26026f = C6307d.C6308a.SUCCESS;
            }
            C6307d dVar = this.f26022b;
            if (dVar != null) {
                dVar.mo24070k(this);
            }
        }
    }

    /* renamed from: p */
    public void mo24071p(C6306c cVar, C6306c cVar2) {
        this.f26023c = cVar;
        this.f26024d = cVar2;
    }

    public void pause() {
        synchronized (this.f26021a) {
            C6307d.C6308a aVar = this.f26025e;
            C6307d.C6308a aVar2 = C6307d.C6308a.RUNNING;
            if (aVar == aVar2) {
                this.f26025e = C6307d.C6308a.PAUSED;
                this.f26023c.pause();
            }
            if (this.f26026f == aVar2) {
                this.f26026f = C6307d.C6308a.PAUSED;
                this.f26024d.pause();
            }
        }
    }
}
