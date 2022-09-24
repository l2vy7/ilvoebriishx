package com.google.android.material.appbar;

import android.view.View;
import p110m0.C5723u;

/* renamed from: com.google.android.material.appbar.a */
/* compiled from: ViewOffsetHelper */
class C10019a {

    /* renamed from: a */
    private final View f47221a;

    /* renamed from: b */
    private int f47222b;

    /* renamed from: c */
    private int f47223c;

    /* renamed from: d */
    private int f47224d;

    /* renamed from: e */
    private int f47225e;

    /* renamed from: f */
    private boolean f47226f = true;

    /* renamed from: g */
    private boolean f47227g = true;

    public C10019a(View view) {
        this.f47221a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39682a() {
        View view = this.f47221a;
        C5723u.m25300Z(view, this.f47224d - (view.getTop() - this.f47222b));
        View view2 = this.f47221a;
        C5723u.m25299Y(view2, this.f47225e - (view2.getLeft() - this.f47223c));
    }

    /* renamed from: b */
    public int mo39683b() {
        return this.f47222b;
    }

    /* renamed from: c */
    public int mo39684c() {
        return this.f47224d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo39685d() {
        this.f47222b = this.f47221a.getTop();
        this.f47223c = this.f47221a.getLeft();
    }

    /* renamed from: e */
    public boolean mo39686e(int i) {
        if (!this.f47227g || this.f47225e == i) {
            return false;
        }
        this.f47225e = i;
        mo39682a();
        return true;
    }

    /* renamed from: f */
    public boolean mo39687f(int i) {
        if (!this.f47226f || this.f47224d == i) {
            return false;
        }
        this.f47224d = i;
        mo39682a();
        return true;
    }
}
