package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qd */
/* compiled from: IMASDK */
public final class C4281qd {

    /* renamed from: a */
    public final int f18423a;

    /* renamed from: b */
    public final abb f18424b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<C4280qc> f18425c;

    public C4281qd() {
        this(new CopyOnWriteArrayList(), 0, (abb) null);
    }

    private C4281qd(CopyOnWriteArrayList<C4280qc> copyOnWriteArrayList, int i, abb abb) {
        this.f18425c = copyOnWriteArrayList;
        this.f18423a = i;
        this.f18424b = abb;
    }

    /* renamed from: a */
    public final C4281qd mo16572a(int i, abb abb) {
        return new C4281qd(this.f18425c, i, abb);
    }

    /* renamed from: b */
    public final void mo16573b(Handler handler, C4282qe qeVar) {
        aup.m14890u(handler);
        aup.m14890u(qeVar);
        this.f18425c.add(new C4280qc(handler, qeVar));
    }
}
