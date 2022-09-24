package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abj */
/* compiled from: IMASDK */
public final class abj {

    /* renamed from: a */
    public final int f14023a;

    /* renamed from: b */
    public final abb f14024b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<abi> f14025c;

    /* renamed from: d */
    private final long f14026d;

    public abj() {
        this(new CopyOnWriteArrayList(), 0, (abb) null, 0);
    }

    private abj(CopyOnWriteArrayList<abi> copyOnWriteArrayList, int i, abb abb, long j) {
        this.f14025c = copyOnWriteArrayList;
        this.f14023a = i;
        this.f14024b = abb;
        this.f14026d = j;
    }

    /* renamed from: t */
    private final long m12887t(long j) {
        long a = C4083iv.m17451a(j);
        return a == C6540C.TIME_UNSET ? C6540C.TIME_UNSET : this.f14026d + a;
    }

    /* renamed from: a */
    public final abj mo13327a(int i, abb abb, long j) {
        return new abj(this.f14025c, i, abb, j);
    }

    /* renamed from: b */
    public final void mo13328b(Handler handler, abk abk) {
        aup.m14890u(handler);
        aup.m14890u(abk);
        this.f14025c.add(new abi(handler, abk));
    }

    /* renamed from: c */
    public final void mo13329c(abk abk) {
        Iterator<abi> it = this.f14025c.iterator();
        while (it.hasNext()) {
            abi next = it.next();
            if (next.f14022b == abk) {
                this.f14025c.remove(next);
            }
        }
    }

    /* renamed from: d */
    public final void mo13330d(aas aas, int i) {
        mo13345s(aas, i, -1, (C4120ke) null, 0, C6540C.TIME_UNSET, C6540C.TIME_UNSET);
    }

    /* renamed from: e */
    public final void mo13331e(aas aas, aax aax) {
        Iterator<abi> it = this.f14025c.iterator();
        while (it.hasNext()) {
            abi next = it.next();
            amm.m14227aq(next.f14021a, new abe(this, next.f14022b, aas, aax, (byte[]) null));
        }
    }

    /* renamed from: f */
    public final void mo13332f(aas aas, int i) {
        mo13343q(aas, i, -1, (C4120ke) null, 0, C6540C.TIME_UNSET, C6540C.TIME_UNSET);
    }

    /* renamed from: g */
    public final void mo13333g(aas aas, aax aax) {
        Iterator<abi> it = this.f14025c.iterator();
        while (it.hasNext()) {
            abi next = it.next();
            amm.m14227aq(next.f14021a, new abe(this, next.f14022b, aas, aax));
        }
    }

    /* renamed from: h */
    public final void mo13334h(aas aas, int i) {
        mo13342p(aas, i, -1, (C4120ke) null, 0, C6540C.TIME_UNSET, C6540C.TIME_UNSET);
    }

    /* renamed from: i */
    public final void mo13335i(aas aas, aax aax) {
        Iterator<abi> it = this.f14025c.iterator();
        while (it.hasNext()) {
            abi next = it.next();
            amm.m14227aq(next.f14021a, new abe(this, next.f14022b, aas, aax, (char[]) null));
        }
    }

    /* renamed from: j */
    public final void mo13336j(aas aas, int i, IOException iOException, boolean z) {
        mo13344r(aas, i, -1, (C4120ke) null, 0, C6540C.TIME_UNSET, C6540C.TIME_UNSET, iOException, z);
    }

    /* renamed from: k */
    public final void mo13337k(aas aas, aax aax, IOException iOException, boolean z) {
        Iterator<abi> it = this.f14025c.iterator();
        while (it.hasNext()) {
            abi next = it.next();
            amm.m14227aq(next.f14021a, new abf(this, next.f14022b, aas, aax, iOException, z));
        }
    }

    /* renamed from: l */
    public final void mo13338l(int i, long j, long j2) {
        mo13339m(new aax(1, i, (C4120ke) null, 3, m12887t(j), m12887t(j2)));
    }

    /* renamed from: m */
    public final void mo13339m(aax aax) {
        abb abb = this.f14024b;
        aup.m14890u(abb);
        Iterator<abi> it = this.f14025c.iterator();
        while (it.hasNext()) {
            abi next = it.next();
            amm.m14227aq(next.f14021a, new abg(this, next.f14022b, abb, aax));
        }
    }

    /* renamed from: n */
    public final void mo13340n(aax aax) {
        Iterator<abi> it = this.f14025c.iterator();
        while (it.hasNext()) {
            abi next = it.next();
            amm.m14227aq(next.f14021a, new abh(this, next.f14022b, aax));
        }
    }

    /* renamed from: o */
    public final void mo13341o(int i, C4120ke keVar, int i2, long j) {
        mo13340n(new aax(1, i, keVar, i2, m12887t(j), C6540C.TIME_UNSET));
    }

    /* renamed from: p */
    public final void mo13342p(aas aas, int i, int i2, C4120ke keVar, int i3, long j, long j2) {
        aas aas2 = aas;
        mo13335i(aas, new aax(i, i2, keVar, i3, m12887t(j), m12887t(j2)));
    }

    /* renamed from: q */
    public final void mo13343q(aas aas, int i, int i2, C4120ke keVar, int i3, long j, long j2) {
        aas aas2 = aas;
        mo13333g(aas, new aax(i, i2, keVar, i3, m12887t(j), m12887t(j2)));
    }

    /* renamed from: r */
    public final void mo13344r(aas aas, int i, int i2, C4120ke keVar, int i3, long j, long j2, IOException iOException, boolean z) {
        aas aas2 = aas;
        mo13337k(aas, new aax(i, i2, keVar, i3, m12887t(j), m12887t(j2)), iOException, z);
    }

    /* renamed from: s */
    public final void mo13345s(aas aas, int i, int i2, C4120ke keVar, int i3, long j, long j2) {
        aas aas2 = aas;
        mo13331e(aas, new aax(i, i2, keVar, i3, m12887t(j), m12887t(j2)));
    }
}
