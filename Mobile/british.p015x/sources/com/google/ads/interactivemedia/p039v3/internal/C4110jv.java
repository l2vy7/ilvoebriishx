package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jv */
/* compiled from: IMASDK */
public final class C4110jv {

    /* renamed from: a */
    public C4145lc f17577a;

    /* renamed from: b */
    public int f17578b;

    /* renamed from: c */
    public boolean f17579c;

    /* renamed from: d */
    public int f17580d;

    /* renamed from: e */
    public boolean f17581e;

    /* renamed from: f */
    public int f17582f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f17583g;

    public C4110jv(C4145lc lcVar) {
        this.f17577a = lcVar;
    }

    /* renamed from: a */
    public final void mo16027a(int i) {
        boolean z = true;
        if (true != (this.f17583g | i)) {
            z = false;
        }
        this.f17583g = z;
        this.f17578b += i;
    }

    /* renamed from: b */
    public final void mo16028b(C4145lc lcVar) {
        this.f17583g |= this.f17577a != lcVar;
        this.f17577a = lcVar;
    }

    /* renamed from: c */
    public final void mo16029c(int i) {
        boolean z = true;
        if (!this.f17579c || this.f17580d == 4) {
            this.f17583g = true;
            this.f17579c = true;
            this.f17580d = i;
            return;
        }
        if (i != 4) {
            z = false;
        }
        aup.m14885p(z);
    }

    /* renamed from: d */
    public final void mo16030d(int i) {
        this.f17583g = true;
        this.f17581e = true;
        this.f17582f = i;
    }
}
