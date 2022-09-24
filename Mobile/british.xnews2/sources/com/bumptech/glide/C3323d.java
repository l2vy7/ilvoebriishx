package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.C3319b;
import java.util.List;
import java.util.Map;
import p081g2.C5298k;
import p086h2.C5382b;
import p168w2.C6309e;
import p168w2.C6310f;
import p173x2.C6384f;
import p173x2.C6387i;

/* renamed from: com.bumptech.glide.d */
/* compiled from: GlideContext */
public class C3323d extends ContextWrapper {

    /* renamed from: k */
    static final C3338k<?, ?> f12630k = new C3318a();

    /* renamed from: a */
    private final C5382b f12631a;

    /* renamed from: b */
    private final C3327h f12632b;

    /* renamed from: c */
    private final C6384f f12633c;

    /* renamed from: d */
    private final C3319b.C3320a f12634d;

    /* renamed from: e */
    private final List<C6309e<Object>> f12635e;

    /* renamed from: f */
    private final Map<Class<?>, C3338k<?, ?>> f12636f;

    /* renamed from: g */
    private final C5298k f12637g;

    /* renamed from: h */
    private final boolean f12638h;

    /* renamed from: i */
    private final int f12639i;

    /* renamed from: j */
    private C6310f f12640j;

    public C3323d(Context context, C5382b bVar, C3327h hVar, C6384f fVar, C3319b.C3320a aVar, Map<Class<?>, C3338k<?, ?>> map, List<C6309e<Object>> list, C5298k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f12631a = bVar;
        this.f12632b = hVar;
        this.f12633c = fVar;
        this.f12634d = aVar;
        this.f12635e = list;
        this.f12636f = map;
        this.f12637g = kVar;
        this.f12638h = z;
        this.f12639i = i;
    }

    /* renamed from: a */
    public <X> C6387i<ImageView, X> mo11109a(ImageView imageView, Class<X> cls) {
        return this.f12633c.mo24219a(imageView, cls);
    }

    /* renamed from: b */
    public C5382b mo11110b() {
        return this.f12631a;
    }

    /* renamed from: c */
    public List<C6309e<Object>> mo11111c() {
        return this.f12635e;
    }

    /* renamed from: d */
    public synchronized C6310f mo11112d() {
        if (this.f12640j == null) {
            this.f12640j = (C6310f) this.f12634d.build().mo24026X();
        }
        return this.f12640j;
    }

    /* renamed from: e */
    public <T> C3338k<?, T> mo11113e(Class<T> cls) {
        C3338k<?, T> kVar = this.f12636f.get(cls);
        if (kVar == null) {
            for (Map.Entry next : this.f12636f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (C3338k) next.getValue();
                }
            }
        }
        return kVar == null ? f12630k : kVar;
    }

    /* renamed from: f */
    public C5298k mo11114f() {
        return this.f12637g;
    }

    /* renamed from: g */
    public int mo11115g() {
        return this.f12639i;
    }

    /* renamed from: h */
    public C3327h mo11116h() {
        return this.f12632b;
    }

    /* renamed from: i */
    public boolean mo11117i() {
        return this.f12638h;
    }
}
