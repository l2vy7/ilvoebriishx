package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oo */
/* compiled from: IMASDK */
public abstract class C4238oo implements C4215ns {

    /* renamed from: b */
    protected C4213nq f18203b;

    /* renamed from: c */
    protected C4213nq f18204c;

    /* renamed from: d */
    private C4213nq f18205d;

    /* renamed from: e */
    private C4213nq f18206e;

    /* renamed from: f */
    private ByteBuffer f18207f;

    /* renamed from: g */
    private ByteBuffer f18208g;

    /* renamed from: h */
    private boolean f18209h;

    public C4238oo() {
        ByteBuffer byteBuffer = C4215ns.f18100a;
        this.f18207f = byteBuffer;
        this.f18208g = byteBuffer;
        C4213nq nqVar = C4213nq.f18095a;
        this.f18205d = nqVar;
        this.f18206e = nqVar;
        this.f18203b = nqVar;
        this.f18204c = nqVar;
    }

    /* renamed from: a */
    public final C4213nq mo16373a(C4213nq nqVar) throws C4214nr {
        this.f18205d = nqVar;
        this.f18206e = mo16467k(nqVar);
        return mo16374b() ? this.f18206e : C4213nq.f18095a;
    }

    /* renamed from: b */
    public boolean mo16374b() {
        return this.f18206e != C4213nq.f18095a;
    }

    /* renamed from: d */
    public final void mo16376d() {
        this.f18209h = true;
        mo16468l();
    }

    /* renamed from: e */
    public ByteBuffer mo16377e() {
        ByteBuffer byteBuffer = this.f18208g;
        this.f18208g = C4215ns.f18100a;
        return byteBuffer;
    }

    /* renamed from: f */
    public boolean mo16378f() {
        return this.f18209h && this.f18208g == C4215ns.f18100a;
    }

    /* renamed from: g */
    public final void mo16379g() {
        this.f18208g = C4215ns.f18100a;
        this.f18209h = false;
        this.f18203b = this.f18205d;
        this.f18204c = this.f18206e;
        mo16469m();
    }

    /* renamed from: h */
    public final void mo16380h() {
        mo16379g();
        this.f18207f = C4215ns.f18100a;
        C4213nq nqVar = C4213nq.f18095a;
        this.f18205d = nqVar;
        this.f18206e = nqVar;
        this.f18203b = nqVar;
        this.f18204c = nqVar;
        mo16470n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final ByteBuffer mo16465i(int i) {
        if (this.f18207f.capacity() < i) {
            this.f18207f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f18207f.clear();
        }
        ByteBuffer byteBuffer = this.f18207f;
        this.f18208g = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo16466j() {
        return this.f18208g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C4213nq mo16467k(C4213nq nqVar) throws C4214nr {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo16468l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo16469m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo16470n() {
    }
}
