package p169w2;

import p169w2.C6307d;

/* renamed from: w2.i */
/* compiled from: ThumbnailRequestCoordinator */
public class C6314i implements C6307d, C6306c {

    /* renamed from: a */
    private final C6307d f26071a;

    /* renamed from: b */
    private final Object f26072b;

    /* renamed from: c */
    private volatile C6306c f26073c;

    /* renamed from: d */
    private volatile C6306c f26074d;

    /* renamed from: e */
    private C6307d.C6308a f26075e;

    /* renamed from: f */
    private C6307d.C6308a f26076f;

    /* renamed from: g */
    private boolean f26077g;

    public C6314i(Object obj, C6307d dVar) {
        C6307d.C6308a aVar = C6307d.C6308a.CLEARED;
        this.f26075e = aVar;
        this.f26076f = aVar;
        this.f26072b = obj;
        this.f26071a = dVar;
    }

    /* renamed from: l */
    private boolean m27805l() {
        C6307d dVar = this.f26071a;
        return dVar == null || dVar.mo24069j(this);
    }

    /* renamed from: m */
    private boolean m27806m() {
        C6307d dVar = this.f26071a;
        return dVar == null || dVar.mo24064f(this);
    }

    /* renamed from: n */
    private boolean m27807n() {
        C6307d dVar = this.f26071a;
        return dVar == null || dVar.mo24066h(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24058a(p169w2.C6306c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f26072b
            monitor-enter(r0)
            w2.c r1 = r2.f26073c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            w2.d$a r3 = p169w2.C6307d.C6308a.FAILED     // Catch:{ all -> 0x001e }
            r2.f26076f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            w2.d$a r3 = p169w2.C6307d.C6308a.FAILED     // Catch:{ all -> 0x001e }
            r2.f26075e = r3     // Catch:{ all -> 0x001e }
            w2.d r3 = r2.f26071a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo24058a(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p169w2.C6314i.mo24058a(w2.c):void");
    }

    /* renamed from: b */
    public boolean mo24059b() {
        boolean z;
        synchronized (this.f26072b) {
            if (!this.f26074d.mo24059b()) {
                if (!this.f26073c.mo24059b()) {
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
        synchronized (this.f26072b) {
            C6307d dVar = this.f26071a;
            c = dVar != null ? dVar.mo24060c() : this;
        }
        return c;
    }

    public void clear() {
        synchronized (this.f26072b) {
            this.f26077g = false;
            C6307d.C6308a aVar = C6307d.C6308a.CLEARED;
            this.f26075e = aVar;
            this.f26076f = aVar;
            this.f26074d.clear();
            this.f26073c.clear();
        }
    }

    /* renamed from: d */
    public boolean mo24062d() {
        boolean z;
        synchronized (this.f26072b) {
            z = this.f26075e == C6307d.C6308a.SUCCESS;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24063e(p169w2.C6306c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof p169w2.C6314i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            w2.i r4 = (p169w2.C6314i) r4
            w2.c r0 = r3.f26073c
            if (r0 != 0) goto L_0x0010
            w2.c r0 = r4.f26073c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            w2.c r0 = r3.f26073c
            w2.c r2 = r4.f26073c
            boolean r0 = r0.mo24063e(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            w2.c r0 = r3.f26074d
            if (r0 != 0) goto L_0x0023
            w2.c r4 = r4.f26074d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            w2.c r0 = r3.f26074d
            w2.c r4 = r4.f26074d
            boolean r4 = r0.mo24063e(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p169w2.C6314i.mo24063e(w2.c):boolean");
    }

    /* renamed from: f */
    public boolean mo24064f(C6306c cVar) {
        boolean z;
        synchronized (this.f26072b) {
            z = m27806m() && cVar.equals(this.f26073c) && !mo24059b();
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo24065g() {
        boolean z;
        synchronized (this.f26072b) {
            z = this.f26075e == C6307d.C6308a.CLEARED;
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo24066h(C6306c cVar) {
        boolean z;
        synchronized (this.f26072b) {
            z = m27807n() && (cVar.equals(this.f26073c) || this.f26075e != C6307d.C6308a.SUCCESS);
        }
        return z;
    }

    /* renamed from: i */
    public void mo24067i() {
        C6307d.C6308a aVar;
        C6307d.C6308a aVar2;
        synchronized (this.f26072b) {
            this.f26077g = true;
            try {
                if (!(this.f26075e == C6307d.C6308a.SUCCESS || this.f26076f == (aVar2 = C6307d.C6308a.RUNNING))) {
                    this.f26076f = aVar2;
                    this.f26074d.mo24067i();
                }
                if (this.f26077g && this.f26075e != (aVar = C6307d.C6308a.RUNNING)) {
                    this.f26075e = aVar;
                    this.f26073c.mo24067i();
                }
            } finally {
                this.f26077g = false;
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f26072b) {
            z = this.f26075e == C6307d.C6308a.RUNNING;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo24069j(C6306c cVar) {
        boolean z;
        synchronized (this.f26072b) {
            z = m27805l() && cVar.equals(this.f26073c) && this.f26075e != C6307d.C6308a.PAUSED;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24070k(p169w2.C6306c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f26072b
            monitor-enter(r0)
            w2.c r1 = r2.f26074d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            w2.d$a r3 = p169w2.C6307d.C6308a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f26076f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            w2.d$a r3 = p169w2.C6307d.C6308a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f26075e = r3     // Catch:{ all -> 0x002b }
            w2.d r3 = r2.f26071a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo24070k(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            w2.d$a r3 = r2.f26076f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.mo24073d()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            w2.c r3 = r2.f26074d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p169w2.C6314i.mo24070k(w2.c):void");
    }

    /* renamed from: o */
    public void mo24078o(C6306c cVar, C6306c cVar2) {
        this.f26073c = cVar;
        this.f26074d = cVar2;
    }

    public void pause() {
        synchronized (this.f26072b) {
            if (!this.f26076f.mo24073d()) {
                this.f26076f = C6307d.C6308a.PAUSED;
                this.f26074d.pause();
            }
            if (!this.f26075e.mo24073d()) {
                this.f26075e = C6307d.C6308a.PAUSED;
                this.f26073c.pause();
            }
        }
    }
}
