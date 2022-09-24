package p082g2;

import android.util.Log;
import java.util.Collections;
import java.util.List;
import p004a3.C0061f;
import p065d2.C5154a;
import p065d2.C5157d;
import p065d2.C5159f;
import p071e2.C5208d;
import p082g2.C5278f;
import p102k2.C5596n;

/* renamed from: g2.z */
/* compiled from: SourceGenerator */
class C5328z implements C5278f, C5278f.C5279a {

    /* renamed from: b */
    private final C5280g<?> f23511b;

    /* renamed from: c */
    private final C5278f.C5279a f23512c;

    /* renamed from: d */
    private int f23513d;

    /* renamed from: e */
    private C5275c f23514e;

    /* renamed from: f */
    private Object f23515f;

    /* renamed from: g */
    private volatile C5596n.C5597a<?> f23516g;

    /* renamed from: h */
    private C5276d f23517h;

    /* renamed from: g2.z$a */
    /* compiled from: SourceGenerator */
    class C5329a implements C5208d.C5209a<Object> {

        /* renamed from: b */
        final /* synthetic */ C5596n.C5597a f23518b;

        C5329a(C5596n.C5597a aVar) {
            this.f23518b = aVar;
        }

        /* renamed from: c */
        public void mo21438c(Exception exc) {
            if (C5328z.this.mo21625e(this.f23518b)) {
                C5328z.this.mo21627g(this.f23518b, exc);
            }
        }

        /* renamed from: f */
        public void mo21439f(Object obj) {
            if (C5328z.this.mo21625e(this.f23518b)) {
                C5328z.this.mo21626f(this.f23518b, obj);
            }
        }
    }

    C5328z(C5280g<?> gVar, C5278f.C5279a aVar) {
        this.f23511b = gVar;
        this.f23512c = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private void m24005b(Object obj) {
        long b = C0061f.m231b();
        try {
            C5157d<X> p = this.f23511b.mo21517p(obj);
            C5277e eVar = new C5277e(p, obj, this.f23511b.mo21512k());
            this.f23517h = new C5276d(this.f23516g.f24127a, this.f23511b.mo21516o());
            this.f23511b.mo21505d().mo21910b(this.f23517h, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f23517h + ", data: " + obj + ", encoder: " + p + ", duration: " + C0061f.m230a(b));
            }
            this.f23516g.f24129c.mo21427b();
            this.f23514e = new C5275c(Collections.singletonList(this.f23516g.f24127a), this.f23511b, this);
        } catch (Throwable th) {
            this.f23516g.f24129c.mo21427b();
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m24006c() {
        return this.f23513d < this.f23511b.mo21508g().size();
    }

    /* renamed from: h */
    private void m24007h(C5596n.C5597a<?> aVar) {
        this.f23516g.f24129c.mo21431e(this.f23511b.mo21513l(), new C5329a(aVar));
    }

    /* renamed from: a */
    public boolean mo21495a() {
        Object obj = this.f23515f;
        if (obj != null) {
            this.f23515f = null;
            m24005b(obj);
        }
        C5275c cVar = this.f23514e;
        if (cVar != null && cVar.mo21495a()) {
            return true;
        }
        this.f23514e = null;
        this.f23516g = null;
        boolean z = false;
        while (!z && m24006c()) {
            List<C5596n.C5597a<?>> g = this.f23511b.mo21508g();
            int i = this.f23513d;
            this.f23513d = i + 1;
            this.f23516g = g.get(i);
            if (this.f23516g != null && (this.f23511b.mo21506e().mo21551c(this.f23516g.f24129c.mo21430d()) || this.f23511b.mo21521t(this.f23516g.f24129c.mo21422a()))) {
                m24007h(this.f23516g);
                z = true;
            }
        }
        return z;
    }

    public void cancel() {
        C5596n.C5597a<?> aVar = this.f23516g;
        if (aVar != null) {
            aVar.f24129c.cancel();
        }
    }

    /* renamed from: d */
    public void mo21499d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo21625e(C5596n.C5597a<?> aVar) {
        C5596n.C5597a<?> aVar2 = this.f23516g;
        return aVar2 != null && aVar2 == aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo21626f(C5596n.C5597a<?> aVar, Object obj) {
        C5292j e = this.f23511b.mo21506e();
        if (obj == null || !e.mo21551c(aVar.f24129c.mo21430d())) {
            C5278f.C5279a aVar2 = this.f23512c;
            C5159f fVar = aVar.f24127a;
            C5208d<Data> dVar = aVar.f24129c;
            aVar2.mo21500i(fVar, obj, dVar, dVar.mo21430d(), this.f23517h);
            return;
        }
        this.f23515f = obj;
        this.f23512c.mo21499d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo21627g(C5596n.C5597a<?> aVar, Exception exc) {
        C5278f.C5279a aVar2 = this.f23512c;
        C5276d dVar = this.f23517h;
        C5208d<Data> dVar2 = aVar.f24129c;
        aVar2.mo21501j(dVar, exc, dVar2, dVar2.mo21430d());
    }

    /* renamed from: i */
    public void mo21500i(C5159f fVar, Object obj, C5208d<?> dVar, C5154a aVar, C5159f fVar2) {
        this.f23512c.mo21500i(fVar, obj, dVar, this.f23516g.f24129c.mo21430d(), fVar);
    }

    /* renamed from: j */
    public void mo21501j(C5159f fVar, Exception exc, C5208d<?> dVar, C5154a aVar) {
        this.f23512c.mo21501j(fVar, exc, dVar, this.f23516g.f24129c.mo21430d());
    }
}
