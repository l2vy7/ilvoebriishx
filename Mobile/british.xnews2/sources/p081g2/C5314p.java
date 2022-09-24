package p081g2;

import p004a3.C0065j;
import p064d2.C5159f;

/* renamed from: g2.p */
/* compiled from: EngineResource */
class C5314p<Z> implements C5323v<Z> {

    /* renamed from: b */
    private final boolean f23463b;

    /* renamed from: c */
    private final boolean f23464c;

    /* renamed from: d */
    private final C5323v<Z> f23465d;

    /* renamed from: e */
    private final C5315a f23466e;

    /* renamed from: f */
    private final C5159f f23467f;

    /* renamed from: g */
    private int f23468g;

    /* renamed from: h */
    private boolean f23469h;

    /* renamed from: g2.p$a */
    /* compiled from: EngineResource */
    interface C5315a {
        /* renamed from: a */
        void mo21553a(C5159f fVar, C5314p<?> pVar);
    }

    C5314p(C5323v<Z> vVar, boolean z, boolean z2, C5159f fVar, C5315a aVar) {
        this.f23465d = (C5323v) C0065j.m247d(vVar);
        this.f23463b = z;
        this.f23464c = z2;
        this.f23467f = fVar;
        this.f23466e = (C5315a) C0065j.m247d(aVar);
    }

    /* renamed from: a */
    public synchronized void mo21591a() {
        if (this.f23468g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f23469h) {
            this.f23469h = true;
            if (this.f23464c) {
                this.f23465d.mo21591a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* renamed from: b */
    public int mo21592b() {
        return this.f23465d.mo21592b();
    }

    /* renamed from: c */
    public Class<Z> mo21593c() {
        return this.f23465d.mo21593c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo21594d() {
        if (!this.f23469h) {
            this.f23468g++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5323v<Z> mo21595e() {
        return this.f23465d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo21596f() {
        return this.f23463b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo21597g() {
        boolean z;
        synchronized (this) {
            int i = this.f23468g;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f23468g = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f23466e.mo21553a(this.f23467f, this);
        }
    }

    public Z get() {
        return this.f23465d.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f23463b + ", listener=" + this.f23466e + ", key=" + this.f23467f + ", acquired=" + this.f23468g + ", isRecycled=" + this.f23469h + ", resource=" + this.f23465d + '}';
    }
}
