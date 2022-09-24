package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class f44 implements f54 {

    /* renamed from: a */
    private final ArrayList<e54> f31626a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<e54> f31627b = new HashSet<>(1);

    /* renamed from: c */
    private final m54 f31628c = new m54();

    /* renamed from: d */
    private final f24 f31629d = new f24();

    /* renamed from: e */
    private Looper f31630e;

    /* renamed from: f */
    private gi0 f31631f;

    /* renamed from: a */
    public final void mo31754a(Handler handler, g24 g24) {
        Objects.requireNonNull(g24);
        this.f31629d.mo31715b(handler, g24);
    }

    /* renamed from: b */
    public final /* synthetic */ gi0 mo31755b() {
        return null;
    }

    /* renamed from: c */
    public final void mo31756c(e54 e54) {
        Objects.requireNonNull(this.f31630e);
        boolean isEmpty = this.f31627b.isEmpty();
        this.f31627b.add(e54);
        if (isEmpty) {
            mo31768s();
        }
    }

    /* renamed from: e */
    public final void mo31757e(n54 n54) {
        this.f31628c.mo33493m(n54);
    }

    /* renamed from: h */
    public final void mo31758h(e54 e54) {
        this.f31626a.remove(e54);
        if (this.f31626a.isEmpty()) {
            this.f31630e = null;
            this.f31631f = null;
            this.f31627b.clear();
            mo18990v();
            return;
        }
        mo31762m(e54);
    }

    /* renamed from: i */
    public final void mo31759i(Handler handler, n54 n54) {
        Objects.requireNonNull(n54);
        this.f31628c.mo33482b(handler, n54);
    }

    /* renamed from: j */
    public final void mo31760j(g24 g24) {
        this.f31629d.mo31716c(g24);
    }

    /* renamed from: l */
    public final void mo31761l(e54 e54, mt1 mt1) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f31630e;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        nu1.m20745d(z);
        gi0 gi0 = this.f31631f;
        this.f31626a.add(e54);
        if (this.f31630e == null) {
            this.f31630e = myLooper;
            this.f31627b.add(e54);
            mo18989t(mt1);
        } else if (gi0 != null) {
            mo31756c(e54);
            e54.mo31482a(this, gi0);
        }
    }

    /* renamed from: m */
    public final void mo31762m(e54 e54) {
        boolean isEmpty = this.f31627b.isEmpty();
        this.f31627b.remove(e54);
        if ((!isEmpty) && this.f31627b.isEmpty()) {
            mo31767r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final f24 mo31763n(c54 c54) {
        return this.f31629d.mo31714a(0, c54);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final f24 mo31764o(int i, c54 c54) {
        return this.f31629d.mo31714a(i, c54);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final m54 mo31765p(c54 c54) {
        return this.f31628c.mo33481a(0, c54, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final m54 mo31766q(int i, c54 c54, long j) {
        return this.f31628c.mo33481a(i, c54, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo31767r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo31768s() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo18989t(mt1 mt1);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo31769u(gi0 gi0) {
        this.f31631f = gi0;
        ArrayList<e54> arrayList = this.f31626a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo31482a(this, gi0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo18990v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo31770w() {
        return !this.f31627b.isEmpty();
    }

    public final /* synthetic */ boolean zzt() {
        return true;
    }
}
