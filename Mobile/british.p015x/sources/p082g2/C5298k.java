package p082g2;

import android.util.Log;
import com.bumptech.glide.C3323d;
import com.bumptech.glide.C3325f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.Executor;
import p004a3.C0061f;
import p004a3.C0065j;
import p013b3.C1554a;
import p065d2.C5154a;
import p065d2.C5159f;
import p065d2.C5163h;
import p065d2.C5167l;
import p082g2.C5281h;
import p082g2.C5314p;
import p092i2.C5445a;
import p092i2.C5448b;
import p092i2.C5458h;
import p097j2.C5502a;
import p105l0.C5645e;
import p169w2.C6311g;

/* renamed from: g2.k */
/* compiled from: Engine */
public class C5298k implements C5311m, C5458h.C5459a, C5314p.C5315a {

    /* renamed from: i */
    private static final boolean f23396i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C5319s f23397a;

    /* renamed from: b */
    private final C5313o f23398b;

    /* renamed from: c */
    private final C5458h f23399c;

    /* renamed from: d */
    private final C5301b f23400d;

    /* renamed from: e */
    private final C5326y f23401e;

    /* renamed from: f */
    private final C5303c f23402f;

    /* renamed from: g */
    private final C5299a f23403g;

    /* renamed from: h */
    private final C5268a f23404h;

    /* renamed from: g2.k$a */
    /* compiled from: Engine */
    static class C5299a {

        /* renamed from: a */
        final C5281h.C5286e f23405a;

        /* renamed from: b */
        final C5645e<C5281h<?>> f23406b = C1554a.m7980d(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, new C5300a());

        /* renamed from: c */
        private int f23407c;

        /* renamed from: g2.k$a$a */
        /* compiled from: Engine */
        class C5300a implements C1554a.C1558d<C5281h<?>> {
            C5300a() {
            }

            /* renamed from: b */
            public C5281h<?> mo7107a() {
                C5299a aVar = C5299a.this;
                return new C5281h<>(aVar.f23405a, aVar.f23406b);
            }
        }

        C5299a(C5281h.C5286e eVar) {
            this.f23405a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C5281h<R> mo21559a(C3323d dVar, Object obj, C5312n nVar, C5159f fVar, int i, int i2, Class<?> cls, Class<R> cls2, C3325f fVar2, C5292j jVar, Map<Class<?>, C5167l<?>> map, boolean z, boolean z2, boolean z3, C5163h hVar, C5281h.C5283b<R> bVar) {
            C5281h hVar2 = (C5281h) C0065j.m247d(this.f23406b.acquire());
            int i3 = this.f23407c;
            int i4 = i3;
            this.f23407c = i3 + 1;
            return hVar2.mo21533x(dVar, obj, nVar, fVar, i, i2, cls, cls2, fVar2, jVar, map, z, z2, z3, hVar, bVar, i4);
        }
    }

    /* renamed from: g2.k$b */
    /* compiled from: Engine */
    static class C5301b {

        /* renamed from: a */
        final C5502a f23409a;

        /* renamed from: b */
        final C5502a f23410b;

        /* renamed from: c */
        final C5502a f23411c;

        /* renamed from: d */
        final C5502a f23412d;

        /* renamed from: e */
        final C5311m f23413e;

        /* renamed from: f */
        final C5314p.C5315a f23414f;

        /* renamed from: g */
        final C5645e<C5305l<?>> f23415g = C1554a.m7980d(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, new C5302a());

        /* renamed from: g2.k$b$a */
        /* compiled from: Engine */
        class C5302a implements C1554a.C1558d<C5305l<?>> {
            C5302a() {
            }

            /* renamed from: b */
            public C5305l<?> mo7107a() {
                C5301b bVar = C5301b.this;
                return new C5305l(bVar.f23409a, bVar.f23410b, bVar.f23411c, bVar.f23412d, bVar.f23413e, bVar.f23414f, bVar.f23415g);
            }
        }

        C5301b(C5502a aVar, C5502a aVar2, C5502a aVar3, C5502a aVar4, C5311m mVar, C5314p.C5315a aVar5) {
            this.f23409a = aVar;
            this.f23410b = aVar2;
            this.f23411c = aVar3;
            this.f23412d = aVar4;
            this.f23413e = mVar;
            this.f23414f = aVar5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C5305l<R> mo21561a(C5159f fVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C5305l) C0065j.m247d(this.f23415g.acquire())).mo21570l(fVar, z, z2, z3, z4);
        }
    }

    /* renamed from: g2.k$c */
    /* compiled from: Engine */
    private static class C5303c implements C5281h.C5286e {

        /* renamed from: a */
        private final C5445a.C5446a f23417a;

        /* renamed from: b */
        private volatile C5445a f23418b;

        C5303c(C5445a.C5446a aVar) {
            this.f23417a = aVar;
        }

        /* renamed from: a */
        public C5445a mo21542a() {
            if (this.f23418b == null) {
                synchronized (this) {
                    if (this.f23418b == null) {
                        this.f23418b = this.f23417a.build();
                    }
                    if (this.f23418b == null) {
                        this.f23418b = new C5448b();
                    }
                }
            }
            return this.f23418b;
        }
    }

    /* renamed from: g2.k$d */
    /* compiled from: Engine */
    public class C5304d {

        /* renamed from: a */
        private final C5305l<?> f23419a;

        /* renamed from: b */
        private final C6311g f23420b;

        C5304d(C6311g gVar, C5305l<?> lVar) {
            this.f23420b = gVar;
            this.f23419a = lVar;
        }

        /* renamed from: a */
        public void mo21563a() {
            synchronized (C5298k.this) {
                this.f23419a.mo21574r(this.f23420b);
            }
        }
    }

    public C5298k(C5458h hVar, C5445a.C5446a aVar, C5502a aVar2, C5502a aVar3, C5502a aVar4, C5502a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (C5319s) null, (C5313o) null, (C5268a) null, (C5301b) null, (C5299a) null, (C5326y) null, z);
    }

    /* renamed from: e */
    private C5314p<?> m23910e(C5159f fVar) {
        C5323v<?> c = this.f23399c.mo21918c(fVar);
        if (c == null) {
            return null;
        }
        if (c instanceof C5314p) {
            return (C5314p) c;
        }
        return new C5314p<>(c, true, true, fVar, this);
    }

    /* renamed from: g */
    private C5314p<?> m23911g(C5159f fVar) {
        C5314p<?> e = this.f23404h.mo21488e(fVar);
        if (e != null) {
            e.mo21594d();
        }
        return e;
    }

    /* renamed from: h */
    private C5314p<?> m23912h(C5159f fVar) {
        C5314p<?> e = m23910e(fVar);
        if (e != null) {
            e.mo21594d();
            this.f23404h.mo21484a(fVar, e);
        }
        return e;
    }

    /* renamed from: i */
    private C5314p<?> m23913i(C5312n nVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C5314p<?> g = m23911g(nVar);
        if (g != null) {
            if (f23396i) {
                m23914j("Loaded resource from active resources", j, nVar);
            }
            return g;
        }
        C5314p<?> h = m23912h(nVar);
        if (h == null) {
            return null;
        }
        if (f23396i) {
            m23914j("Loaded resource from cache", j, nVar);
        }
        return h;
    }

    /* renamed from: j */
    private static void m23914j(String str, long j, C5159f fVar) {
        Log.v("Engine", str + " in " + C0061f.m230a(j) + "ms, key: " + fVar);
    }

    /* renamed from: l */
    private <R> C5304d m23915l(C3323d dVar, Object obj, C5159f fVar, int i, int i2, Class<?> cls, Class<R> cls2, C3325f fVar2, C5292j jVar, Map<Class<?>, C5167l<?>> map, boolean z, boolean z2, C5163h hVar, boolean z3, boolean z4, boolean z5, boolean z6, C6311g gVar, Executor executor, C5312n nVar, long j) {
        C6311g gVar2 = gVar;
        Executor executor2 = executor;
        C5312n nVar2 = nVar;
        long j2 = j;
        C5305l<?> a = this.f23397a.mo21615a(nVar2, z6);
        if (a != null) {
            a.mo21564b(gVar2, executor2);
            if (f23396i) {
                m23914j("Added to existing load", j2, nVar2);
            }
            return new C5304d(gVar2, a);
        }
        C5305l a2 = this.f23400d.mo21561a(nVar, z3, z4, z5, z6);
        C5305l lVar = a2;
        C5312n nVar3 = nVar2;
        C5281h<R> a3 = this.f23403g.mo21559a(dVar, obj, nVar, fVar, i, i2, cls, cls2, fVar2, jVar, map, z, z2, z6, hVar, a2);
        this.f23397a.mo21616c(nVar3, lVar);
        C5305l lVar2 = lVar;
        C5312n nVar4 = nVar3;
        C6311g gVar3 = gVar;
        lVar2.mo21564b(gVar3, executor);
        lVar2.mo21575s(a3);
        if (f23396i) {
            m23914j("Started new load", j, nVar4);
        }
        return new C5304d(gVar3, lVar2);
    }

    /* renamed from: a */
    public void mo21553a(C5159f fVar, C5314p<?> pVar) {
        this.f23404h.mo21487d(fVar);
        if (pVar.mo21596f()) {
            this.f23399c.mo21919d(fVar, pVar);
        } else {
            this.f23401e.mo21623a(pVar, false);
        }
    }

    /* renamed from: b */
    public void mo21554b(C5323v<?> vVar) {
        this.f23401e.mo21623a(vVar, true);
    }

    /* renamed from: c */
    public synchronized void mo21555c(C5305l<?> lVar, C5159f fVar) {
        this.f23397a.mo21617d(fVar, lVar);
    }

    /* renamed from: d */
    public synchronized void mo21556d(C5305l<?> lVar, C5159f fVar, C5314p<?> pVar) {
        if (pVar != null) {
            if (pVar.mo21596f()) {
                this.f23404h.mo21484a(fVar, pVar);
            }
        }
        this.f23397a.mo21617d(fVar, lVar);
    }

    /* renamed from: f */
    public <R> C5304d mo21557f(C3323d dVar, Object obj, C5159f fVar, int i, int i2, Class<?> cls, Class<R> cls2, C3325f fVar2, C5292j jVar, Map<Class<?>, C5167l<?>> map, boolean z, boolean z2, C5163h hVar, boolean z3, boolean z4, boolean z5, boolean z6, C6311g gVar, Executor executor) {
        long b = f23396i ? C0061f.m231b() : 0;
        C5312n a = this.f23398b.mo21590a(obj, fVar, i, i2, map, cls, cls2, hVar);
        synchronized (this) {
            C5314p<?> i3 = m23913i(a, z3, b);
            if (i3 == null) {
                C5304d l = m23915l(dVar, obj, fVar, i, i2, cls, cls2, fVar2, jVar, map, z, z2, hVar, z3, z4, z5, z6, gVar, executor, a, b);
                return l;
            }
            gVar.mo24074a(i3, C5154a.MEMORY_CACHE);
            return null;
        }
    }

    /* renamed from: k */
    public void mo21558k(C5323v<?> vVar) {
        if (vVar instanceof C5314p) {
            ((C5314p) vVar).mo21597g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    C5298k(C5458h hVar, C5445a.C5446a aVar, C5502a aVar2, C5502a aVar3, C5502a aVar4, C5502a aVar5, C5319s sVar, C5313o oVar, C5268a aVar6, C5301b bVar, C5299a aVar7, C5326y yVar, boolean z) {
        this.f23399c = hVar;
        C5445a.C5446a aVar8 = aVar;
        C5303c cVar = new C5303c(aVar);
        this.f23402f = cVar;
        C5268a aVar9 = aVar6 == null ? new C5268a(z) : aVar6;
        this.f23404h = aVar9;
        aVar9.mo21489f(this);
        this.f23398b = oVar == null ? new C5313o() : oVar;
        this.f23397a = sVar == null ? new C5319s() : sVar;
        this.f23400d = bVar == null ? new C5301b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f23403g = aVar7 == null ? new C5299a(cVar) : aVar7;
        this.f23401e = yVar == null ? new C5326y() : yVar;
        hVar.mo21920e(this);
    }
}
