package p082g2;

import com.bumptech.glide.C3323d;
import com.bumptech.glide.C3325f;
import com.bumptech.glide.C3327h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p065d2.C5157d;
import p065d2.C5159f;
import p065d2.C5163h;
import p065d2.C5166k;
import p065d2.C5167l;
import p082g2.C5281h;
import p087h2.C5382b;
import p092i2.C5445a;
import p102k2.C5596n;
import p113m2.C5754c;

/* renamed from: g2.g */
/* compiled from: DecodeHelper */
final class C5280g<Transcode> {

    /* renamed from: a */
    private final List<C5596n.C5597a<?>> f23315a = new ArrayList();

    /* renamed from: b */
    private final List<C5159f> f23316b = new ArrayList();

    /* renamed from: c */
    private C3323d f23317c;

    /* renamed from: d */
    private Object f23318d;

    /* renamed from: e */
    private int f23319e;

    /* renamed from: f */
    private int f23320f;

    /* renamed from: g */
    private Class<?> f23321g;

    /* renamed from: h */
    private C5281h.C5286e f23322h;

    /* renamed from: i */
    private C5163h f23323i;

    /* renamed from: j */
    private Map<Class<?>, C5167l<?>> f23324j;

    /* renamed from: k */
    private Class<Transcode> f23325k;

    /* renamed from: l */
    private boolean f23326l;

    /* renamed from: m */
    private boolean f23327m;

    /* renamed from: n */
    private C5159f f23328n;

    /* renamed from: o */
    private C3325f f23329o;

    /* renamed from: p */
    private C5292j f23330p;

    /* renamed from: q */
    private boolean f23331q;

    /* renamed from: r */
    private boolean f23332r;

    C5280g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21502a() {
        this.f23317c = null;
        this.f23318d = null;
        this.f23328n = null;
        this.f23321g = null;
        this.f23325k = null;
        this.f23323i = null;
        this.f23329o = null;
        this.f23324j = null;
        this.f23330p = null;
        this.f23315a.clear();
        this.f23326l = false;
        this.f23316b.clear();
        this.f23327m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5382b mo21503b() {
        return this.f23317c.mo11110b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C5159f> mo21504c() {
        if (!this.f23327m) {
            this.f23327m = true;
            this.f23316b.clear();
            List<C5596n.C5597a<?>> g = mo21508g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C5596n.C5597a aVar = g.get(i);
                if (!this.f23316b.contains(aVar.f24127a)) {
                    this.f23316b.add(aVar.f24127a);
                }
                for (int i2 = 0; i2 < aVar.f24128b.size(); i2++) {
                    if (!this.f23316b.contains(aVar.f24128b.get(i2))) {
                        this.f23316b.add(aVar.f24128b.get(i2));
                    }
                }
            }
        }
        return this.f23316b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5445a mo21505d() {
        return this.f23322h.mo21542a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5292j mo21506e() {
        return this.f23330p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo21507f() {
        return this.f23320f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C5596n.C5597a<?>> mo21508g() {
        if (!this.f23326l) {
            this.f23326l = true;
            this.f23315a.clear();
            List i = this.f23317c.mo11116h().mo11125i(this.f23318d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5596n.C5597a a = ((C5596n) i.get(i2)).mo22113a(this.f23318d, this.f23319e, this.f23320f, this.f23323i);
                if (a != null) {
                    this.f23315a.add(a);
                }
            }
        }
        return this.f23315a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C5320t<Data, ?, Transcode> mo21509h(Class<Data> cls) {
        return this.f23317c.mo11116h().mo11124h(cls, this.f23321g, this.f23325k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Class<?> mo21510i() {
        return this.f23318d.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C5596n<File, ?>> mo21511j(File file) throws C3327h.C3330c {
        return this.f23317c.mo11116h().mo11125i(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C5163h mo21512k() {
        return this.f23323i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C3325f mo21513l() {
        return this.f23329o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Class<?>> mo21514m() {
        return this.f23317c.mo11116h().mo11126j(this.f23318d.getClass(), this.f23321g, this.f23325k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public <Z> C5166k<Z> mo21515n(C5323v<Z> vVar) {
        return this.f23317c.mo11116h().mo11127k(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C5159f mo21516o() {
        return this.f23328n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public <X> C5157d<X> mo21517p(X x) throws C3327h.C3332e {
        return this.f23317c.mo11116h().mo11129m(x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Class<?> mo21518q() {
        return this.f23325k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <Z> C5167l<Z> mo21519r(Class<Z> cls) {
        C5167l<Z> lVar = this.f23324j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, C5167l<?>>> it = this.f23324j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    lVar = (C5167l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f23324j.isEmpty() || !this.f23331q) {
            return C5754c.m25455c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo21520s() {
        return this.f23319e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo21521t(Class<?> cls) {
        return mo21509h(cls) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public <R> void mo21522u(C3323d dVar, Object obj, C5159f fVar, int i, int i2, C5292j jVar, Class<?> cls, Class<R> cls2, C3325f fVar2, C5163h hVar, Map<Class<?>, C5167l<?>> map, boolean z, boolean z2, C5281h.C5286e eVar) {
        this.f23317c = dVar;
        this.f23318d = obj;
        this.f23328n = fVar;
        this.f23319e = i;
        this.f23320f = i2;
        this.f23330p = jVar;
        this.f23321g = cls;
        this.f23322h = eVar;
        this.f23325k = cls2;
        this.f23329o = fVar2;
        this.f23323i = hVar;
        this.f23324j = map;
        this.f23331q = z;
        this.f23332r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo21523v(C5323v<?> vVar) {
        return this.f23317c.mo11116h().mo11130n(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo21524w() {
        return this.f23332r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo21525x(C5159f fVar) {
        List<C5596n.C5597a<?>> g = mo21508g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f24127a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
