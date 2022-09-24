package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.C3319b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p082g2.C5298k;
import p087h2.C5382b;
import p087h2.C5387e;
import p087h2.C5388f;
import p087h2.C5393j;
import p087h2.C5396k;
import p092i2.C5445a;
import p092i2.C5455f;
import p092i2.C5457g;
import p092i2.C5458h;
import p092i2.C5460i;
import p097j2.C5502a;
import p150t.C6077a;
import p153t2.C6108d;
import p153t2.C6111f;
import p153t2.C6118l;
import p169w2.C6309e;
import p169w2.C6310f;

/* renamed from: com.bumptech.glide.c */
/* compiled from: GlideBuilder */
public final class C3321c {

    /* renamed from: a */
    private final Map<Class<?>, C3338k<?, ?>> f12611a = new C6077a();

    /* renamed from: b */
    private C5298k f12612b;

    /* renamed from: c */
    private C5387e f12613c;

    /* renamed from: d */
    private C5382b f12614d;

    /* renamed from: e */
    private C5458h f12615e;

    /* renamed from: f */
    private C5502a f12616f;

    /* renamed from: g */
    private C5502a f12617g;

    /* renamed from: h */
    private C5445a.C5446a f12618h;

    /* renamed from: i */
    private C5460i f12619i;

    /* renamed from: j */
    private C6108d f12620j;

    /* renamed from: k */
    private int f12621k = 4;

    /* renamed from: l */
    private C3319b.C3320a f12622l = new C3322a();

    /* renamed from: m */
    private C6118l.C6120b f12623m;

    /* renamed from: n */
    private C5502a f12624n;

    /* renamed from: o */
    private boolean f12625o;

    /* renamed from: p */
    private List<C6309e<Object>> f12626p;

    /* renamed from: q */
    private boolean f12627q;

    /* renamed from: r */
    private boolean f12628r;

    /* renamed from: com.bumptech.glide.c$a */
    /* compiled from: GlideBuilder */
    class C3322a implements C3319b.C3320a {
        C3322a() {
        }

        public C6310f build() {
            return new C6310f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3319b mo11107a(Context context) {
        Context context2 = context;
        if (this.f12616f == null) {
            this.f12616f = C5502a.m24557i();
        }
        if (this.f12617g == null) {
            this.f12617g = C5502a.m24555g();
        }
        if (this.f12624n == null) {
            this.f12624n = C5502a.m24553e();
        }
        if (this.f12619i == null) {
            this.f12619i = new C5460i.C5461a(context2).mo21927a();
        }
        if (this.f12620j == null) {
            this.f12620j = new C6111f();
        }
        if (this.f12613c == null) {
            int b = this.f12619i.mo21925b();
            if (b > 0) {
                this.f12613c = new C5396k((long) b);
            } else {
                this.f12613c = new C5388f();
            }
        }
        if (this.f12614d == null) {
            this.f12614d = new C5393j(this.f12619i.mo21924a());
        }
        if (this.f12615e == null) {
            this.f12615e = new C5457g((long) this.f12619i.mo21926d());
        }
        if (this.f12618h == null) {
            this.f12618h = new C5455f(context2);
        }
        if (this.f12612b == null) {
            this.f12612b = new C5298k(this.f12615e, this.f12618h, this.f12617g, this.f12616f, C5502a.m24558j(), this.f12624n, this.f12625o);
        }
        List<C6309e<Object>> list = this.f12626p;
        if (list == null) {
            this.f12626p = Collections.emptyList();
        } else {
            this.f12626p = Collections.unmodifiableList(list);
        }
        return new C3319b(context, this.f12612b, this.f12615e, this.f12613c, this.f12614d, new C6118l(this.f12623m), this.f12620j, this.f12621k, this.f12622l, this.f12611a, this.f12626p, this.f12627q, this.f12628r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11108b(C6118l.C6120b bVar) {
        this.f12623m = bVar;
    }
}
