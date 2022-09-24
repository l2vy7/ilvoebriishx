package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zx */
/* compiled from: IMASDK */
public abstract class C4544zx implements abd {

    /* renamed from: a */
    private final ArrayList<abc> f19785a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<abc> f19786b = new HashSet<>(1);

    /* renamed from: c */
    private final abj f19787c = new abj();

    /* renamed from: d */
    private final C4281qd f19788d = new C4281qd();

    /* renamed from: e */
    private Looper f19789e;

    /* renamed from: f */
    private C4171mb f19790f;

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo13253X() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13254a(akp akp);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13255c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo13256d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo16937e(C4171mb mbVar) {
        this.f19790f = mbVar;
        ArrayList<abc> arrayList = this.f19785a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo13244a(this, mbVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final abj mo16938f(abb abb) {
        return this.f19787c.mo13327a(0, abb, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final abj mo16939g(abb abb, long j) {
        return this.f19787c.mo13327a(0, abb, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C4281qd mo16940h(abb abb) {
        return this.f19788d.mo16572a(0, abb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C4281qd mo16941i(int i, abb abb) {
        return this.f19788d.mo16572a(i, abb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo16942j() {
        return !this.f19786b.isEmpty();
    }

    /* renamed from: k */
    public final void mo13316k(Handler handler, abk abk) {
        aup.m14890u(handler);
        aup.m14890u(abk);
        this.f19787c.mo13328b(handler, abk);
    }

    /* renamed from: l */
    public final void mo13317l(abk abk) {
        this.f19787c.mo13329c(abk);
    }

    /* renamed from: m */
    public final void mo13318m(Handler handler, C4282qe qeVar) {
        aup.m14890u(handler);
        aup.m14890u(qeVar);
        this.f19788d.mo16573b(handler, qeVar);
    }

    /* renamed from: n */
    public final void mo13319n(abc abc, akp akp) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f19789e;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        aup.m14885p(z);
        C4171mb mbVar = this.f19790f;
        this.f19785a.add(abc);
        if (this.f19789e == null) {
            this.f19789e = myLooper;
            this.f19786b.add(abc);
            mo13254a(akp);
        } else if (mbVar != null) {
            mo13320o(abc);
            abc.mo13244a(this, mbVar);
        }
    }

    /* renamed from: o */
    public final void mo13320o(abc abc) {
        aup.m14890u(this.f19789e);
        boolean isEmpty = this.f19786b.isEmpty();
        this.f19786b.add(abc);
        if (isEmpty) {
            mo13253X();
        }
    }

    /* renamed from: p */
    public final void mo13321p(abc abc) {
        boolean isEmpty = this.f19786b.isEmpty();
        this.f19786b.remove(abc);
        if ((!isEmpty) && this.f19786b.isEmpty()) {
            mo13255c();
        }
    }

    /* renamed from: q */
    public final void mo13322q(abc abc) {
        this.f19785a.remove(abc);
        if (this.f19785a.isEmpty()) {
            this.f19789e = null;
            this.f19790f = null;
            this.f19786b.clear();
            mo13256d();
            return;
        }
        mo13321p(abc);
    }

    /* renamed from: r */
    public C4171mb mo13283r() {
        return null;
    }

    /* renamed from: s */
    public boolean mo13284s() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final abj mo16943t(int i, abb abb) {
        return this.f19787c.mo13327a(i, abb, 0);
    }
}
