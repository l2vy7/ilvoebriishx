package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p004a3.C0066k;
import p082g2.C5292j;
import p142r2.C5982c;
import p153t2.C6106c;
import p153t2.C6108d;
import p153t2.C6113h;
import p153t2.C6114i;
import p153t2.C6121m;
import p153t2.C6122n;
import p153t2.C6125p;
import p169w2.C6306c;
import p169w2.C6309e;
import p169w2.C6310f;
import p174x2.C6386h;

/* renamed from: com.bumptech.glide.j */
/* compiled from: RequestManager */
public class C3335j implements ComponentCallbacks2, C6114i {

    /* renamed from: n */
    private static final C6310f f12679n = ((C6310f) C6310f.m27772r0(Bitmap.class).mo24026X());

    /* renamed from: o */
    private static final C6310f f12680o = ((C6310f) C6310f.m27772r0(C5982c.class).mo24026X());

    /* renamed from: p */
    private static final C6310f f12681p = ((C6310f) ((C6310f) C6310f.m27773s0(C5292j.f23393c).mo24034e0(C3325f.LOW)).mo24045l0(true));

    /* renamed from: b */
    protected final C3319b f12682b;

    /* renamed from: c */
    protected final Context f12683c;

    /* renamed from: d */
    final C6113h f12684d;

    /* renamed from: e */
    private final C6122n f12685e;

    /* renamed from: f */
    private final C6121m f12686f;

    /* renamed from: g */
    private final C6125p f12687g;

    /* renamed from: h */
    private final Runnable f12688h;

    /* renamed from: i */
    private final Handler f12689i;

    /* renamed from: j */
    private final C6106c f12690j;

    /* renamed from: k */
    private final CopyOnWriteArrayList<C6309e<Object>> f12691k;

    /* renamed from: l */
    private C6310f f12692l;

    /* renamed from: m */
    private boolean f12693m;

    /* renamed from: com.bumptech.glide.j$a */
    /* compiled from: RequestManager */
    class C3336a implements Runnable {
        C3336a() {
        }

        public void run() {
            C3335j jVar = C3335j.this;
            jVar.f12684d.mo23424a(jVar);
        }
    }

    /* renamed from: com.bumptech.glide.j$b */
    /* compiled from: RequestManager */
    private class C3337b implements C6106c.C6107a {

        /* renamed from: a */
        private final C6122n f12695a;

        C3337b(C6122n nVar) {
            this.f12695a = nVar;
        }

        /* renamed from: a */
        public void mo11169a(boolean z) {
            if (z) {
                synchronized (C3335j.this) {
                    this.f12695a.mo23457e();
                }
            }
        }
    }

    public C3335j(C3319b bVar, C6113h hVar, C6121m mVar, Context context) {
        this(bVar, hVar, mVar, new C6122n(), bVar.mo11094g(), context);
    }

    /* renamed from: x */
    private void m11164x(C6386h<?> hVar) {
        boolean w = mo11167w(hVar);
        C6306c g = hVar.mo24216g();
        if (!w && !this.f12682b.mo11103p(hVar) && g != null) {
            hVar.mo24214c((C6306c) null);
            g.clear();
        }
    }

    /* renamed from: i */
    public <ResourceType> C3333i<ResourceType> mo11146i(Class<ResourceType> cls) {
        return new C3333i<>(this.f12682b, this, cls, this.f12683c);
    }

    /* renamed from: j */
    public C3333i<Bitmap> mo11147j() {
        return mo11146i(Bitmap.class).mo11139a(f12679n);
    }

    /* renamed from: k */
    public C3333i<Drawable> mo11148k() {
        return mo11146i(Drawable.class);
    }

    /* renamed from: l */
    public void mo11149l(C6386h<?> hVar) {
        if (hVar != null) {
            m11164x(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<C6309e<Object>> mo11150m() {
        return this.f12691k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public synchronized C6310f mo11151n() {
        return this.f12692l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public <T> C3338k<?, T> mo11152o(Class<T> cls) {
        return this.f12682b.mo11096i().mo11113e(cls);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public synchronized void onDestroy() {
        this.f12687g.onDestroy();
        for (C6386h<?> l : this.f12687g.mo23469j()) {
            mo11149l(l);
        }
        this.f12687g.mo23468i();
        this.f12685e.mo23454b();
        this.f12684d.mo23425b(this);
        this.f12684d.mo23425b(this.f12690j);
        this.f12689i.removeCallbacks(this.f12688h);
        this.f12682b.mo11105s(this);
    }

    public void onLowMemory() {
    }

    public synchronized void onStart() {
        mo11163t();
        this.f12687g.onStart();
    }

    public synchronized void onStop() {
        mo11162s();
        this.f12687g.onStop();
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f12693m) {
            mo11161r();
        }
    }

    /* renamed from: p */
    public C3333i<Drawable> mo11159p(String str) {
        return mo11148k().mo11138F0(str);
    }

    /* renamed from: q */
    public synchronized void mo11160q() {
        this.f12685e.mo23455c();
    }

    /* renamed from: r */
    public synchronized void mo11161r() {
        mo11160q();
        for (C3335j q : this.f12686f.mo23432a()) {
            q.mo11160q();
        }
    }

    /* renamed from: s */
    public synchronized void mo11162s() {
        this.f12685e.mo23456d();
    }

    /* renamed from: t */
    public synchronized void mo11163t() {
        this.f12685e.mo23458f();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f12685e + ", treeNode=" + this.f12686f + "}";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public synchronized void mo11165u(C6310f fVar) {
        this.f12692l = (C6310f) ((C6310f) fVar.clone()).mo24030b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public synchronized void mo11166v(C6386h<?> hVar, C6306c cVar) {
        this.f12687g.mo23470k(hVar);
        this.f12685e.mo23459g(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public synchronized boolean mo11167w(C6386h<?> hVar) {
        C6306c g = hVar.mo24216g();
        if (g == null) {
            return true;
        }
        if (!this.f12685e.mo23453a(g)) {
            return false;
        }
        this.f12687g.mo23471l(hVar);
        hVar.mo24214c((C6306c) null);
        return true;
    }

    C3335j(C3319b bVar, C6113h hVar, C6121m mVar, C6122n nVar, C6108d dVar, Context context) {
        this.f12687g = new C6125p();
        C3336a aVar = new C3336a();
        this.f12688h = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f12689i = handler;
        this.f12682b = bVar;
        this.f12684d = hVar;
        this.f12686f = mVar;
        this.f12685e = nVar;
        this.f12683c = context;
        C6106c a = dVar.mo23429a(context.getApplicationContext(), new C3337b(nVar));
        this.f12690j = a;
        if (C0066k.m264p()) {
            handler.post(aVar);
        } else {
            hVar.mo23424a(this);
        }
        hVar.mo23424a(a);
        this.f12691k = new CopyOnWriteArrayList<>(bVar.mo11096i().mo11111c());
        mo11165u(bVar.mo11096i().mo11112d());
        bVar.mo11099o(this);
    }
}
