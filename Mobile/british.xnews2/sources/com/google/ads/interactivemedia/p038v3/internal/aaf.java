package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aaf */
/* compiled from: IMASDK */
public abstract class aaf<T> extends C4544zx {

    /* renamed from: a */
    private final HashMap<T, aae> f13925a = new HashMap<>();

    /* renamed from: b */
    private Handler f13926b;

    /* renamed from: c */
    private akp f13927c;

    protected aaf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abb mo13251A(T t, abb abb) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract void mo13252B(T t, C4171mb mbVar);

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo13253X() {
        for (aae next : this.f13925a.values()) {
            next.f13922a.mo13320o(next.f13923b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13254a(akp akp) {
        this.f13927c = akp;
        this.f13926b = amm.m14241k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13255c() {
        for (aae next : this.f13925a.values()) {
            next.f13922a.mo13321p(next.f13923b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo13256d() {
        for (aae next : this.f13925a.values()) {
            next.f13922a.mo13322q(next.f13923b);
            next.f13922a.mo13317l(next.f13924c);
        }
        this.f13925a.clear();
    }

    /* renamed from: u */
    public void mo13257u() throws IOException {
        for (aae aae : this.f13925a.values()) {
            aae.f13922a.mo13257u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo13258v(T t, abd abd) {
        aup.m14885p(!this.f13925a.containsKey(t));
        aac aac = new aac(this, t);
        aad aad = new aad(this, t);
        this.f13925a.put(t, new aae(abd, aac, aad));
        Handler handler = this.f13926b;
        aup.m14890u(handler);
        abd.mo13316k(handler, aad);
        Handler handler2 = this.f13926b;
        aup.m14890u(handler2);
        abd.mo13318m(handler2, aad);
        abd.mo13319n(aac, this.f13927c);
        if (!mo16942j()) {
            abd.mo13321p(aac);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo13259w(T t) {
        aae aae = this.f13925a.get(t);
        aup.m14890u(aae);
        aae.f13922a.mo13320o(aae.f13923b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo13260x(T t) {
        aae aae = this.f13925a.get(t);
        aup.m14890u(aae);
        aae.f13922a.mo13321p(aae.f13923b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo13261y(T t) {
        aae remove = this.f13925a.remove(t);
        aup.m14890u(remove);
        remove.f13922a.mo13322q(remove.f13923b);
        remove.f13922a.mo13317l(remove.f13924c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo13262z(T t, int i) {
        return i;
    }
}
