package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p013b3.C1554a;
import p065d2.C5157d;
import p065d2.C5165j;
import p065d2.C5166k;
import p071e2.C5210e;
import p071e2.C5212f;
import p082g2.C5290i;
import p082g2.C5320t;
import p082g2.C5323v;
import p102k2.C5596n;
import p102k2.C5598o;
import p102k2.C5599p;
import p105l0.C5645e;
import p147s2.C6021e;
import p147s2.C6022f;
import p164v2.C6227a;
import p164v2.C6229b;
import p164v2.C6230c;
import p164v2.C6231d;
import p164v2.C6232e;
import p164v2.C6234f;

/* renamed from: com.bumptech.glide.h */
/* compiled from: Registry */
public class C3327h {

    /* renamed from: a */
    private final C5599p f12652a;

    /* renamed from: b */
    private final C6227a f12653b;

    /* renamed from: c */
    private final C6232e f12654c;

    /* renamed from: d */
    private final C6234f f12655d;

    /* renamed from: e */
    private final C5212f f12656e;

    /* renamed from: f */
    private final C6022f f12657f;

    /* renamed from: g */
    private final C6229b f12658g;

    /* renamed from: h */
    private final C6231d f12659h = new C6231d();

    /* renamed from: i */
    private final C6230c f12660i = new C6230c();

    /* renamed from: j */
    private final C5645e<List<Throwable>> f12661j;

    /* renamed from: com.bumptech.glide.h$a */
    /* compiled from: Registry */
    public static class C3328a extends RuntimeException {
        public C3328a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.h$b */
    /* compiled from: Registry */
    public static final class C3329b extends C3328a {
        public C3329b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.h$c */
    /* compiled from: Registry */
    public static class C3330c extends C3328a {
        public C3330c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> C3330c(M m, List<C5596n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public C3330c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* renamed from: com.bumptech.glide.h$d */
    /* compiled from: Registry */
    public static class C3331d extends C3328a {
        public C3331d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: com.bumptech.glide.h$e */
    /* compiled from: Registry */
    public static class C3332e extends C3328a {
        public C3332e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C3327h() {
        C5645e<List<Throwable>> e = C1554a.m7981e();
        this.f12661j = e;
        this.f12652a = new C5599p(e);
        this.f12653b = new C6227a();
        this.f12654c = new C6232e();
        this.f12655d = new C6234f();
        this.f12656e = new C5212f();
        this.f12657f = new C6022f();
        this.f12658g = new C6229b();
        mo11134r(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<C5290i<Data, TResource, Transcode>> m11127f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f12654c.mo23748d(cls, cls2)) {
            for (Class next2 : this.f12657f.mo23150b(next, cls3)) {
                arrayList.add(new C5290i(cls, next, next2, this.f12654c.mo23747b(cls, next), this.f12657f.mo23149a(next, next2), this.f12661j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> C3327h mo11118a(Class<Data> cls, C5157d<Data> dVar) {
        this.f12653b.mo23736a(cls, dVar);
        return this;
    }

    /* renamed from: b */
    public <TResource> C3327h mo11119b(Class<TResource> cls, C5166k<TResource> kVar) {
        this.f12655d.mo23751a(cls, kVar);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> C3327h mo11120c(Class<Data> cls, Class<TResource> cls2, C5165j<Data, TResource> jVar) {
        mo11122e("legacy_append", cls, cls2, jVar);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> C3327h mo11121d(Class<Model> cls, Class<Data> cls2, C5598o<Model, Data> oVar) {
        this.f12652a.mo22164a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> C3327h mo11122e(String str, Class<Data> cls, Class<TResource> cls2, C5165j<Data, TResource> jVar) {
        this.f12654c.mo23746a(str, jVar, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> mo11123g() {
        List<ImageHeaderParser> b = this.f12658g.mo23740b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new C3329b();
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C5320t<Data, TResource, Transcode> mo11124h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C5320t<Data, TResource, Transcode> a = this.f12660i.mo23741a(cls, cls2, cls3);
        if (this.f12660i.mo23742c(a)) {
            return null;
        }
        if (a == null) {
            List<C5290i<Data, TResource, Transcode>> f = m11127f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new C5320t<>(cls, cls2, cls3, f, this.f12661j);
            }
            this.f12660i.mo23743d(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: i */
    public <Model> List<C5596n<Model, ?>> mo11125i(Model model) {
        return this.f12652a.mo22166d(model);
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo11126j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f12659h.mo23744a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> d : this.f12652a.mo22165c(cls)) {
                for (Class next : this.f12654c.mo23748d(d, cls2)) {
                    if (!this.f12657f.mo23150b(next, cls3).isEmpty() && !a.contains(next)) {
                        a.add(next);
                    }
                }
            }
            this.f12659h.mo23745b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: k */
    public <X> C5166k<X> mo11127k(C5323v<X> vVar) throws C3331d {
        C5166k<X> b = this.f12655d.mo23752b(vVar.mo21593c());
        if (b != null) {
            return b;
        }
        throw new C3331d(vVar.mo21593c());
    }

    /* renamed from: l */
    public <X> C5210e<X> mo11128l(X x) {
        return this.f12656e.mo21444a(x);
    }

    /* renamed from: m */
    public <X> C5157d<X> mo11129m(X x) throws C3332e {
        C5157d<X> b = this.f12653b.mo23737b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new C3332e(x.getClass());
    }

    /* renamed from: n */
    public boolean mo11130n(C5323v<?> vVar) {
        return this.f12655d.mo23752b(vVar.mo21593c()) != null;
    }

    /* renamed from: o */
    public C3327h mo11131o(ImageHeaderParser imageHeaderParser) {
        this.f12658g.mo23739a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public C3327h mo11132p(C5210e.C5211a<?> aVar) {
        this.f12656e.mo21445b(aVar);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> C3327h mo11133q(Class<TResource> cls, Class<Transcode> cls2, C6021e<TResource, Transcode> eVar) {
        this.f12657f.mo23151c(cls, cls2, eVar);
        return this;
    }

    /* renamed from: r */
    public final C3327h mo11134r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f12654c.mo23749e(arrayList);
        return this;
    }
}
