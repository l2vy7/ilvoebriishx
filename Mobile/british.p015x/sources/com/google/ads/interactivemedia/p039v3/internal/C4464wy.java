package com.google.ads.interactivemedia.p039v3.internal;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wy */
/* compiled from: IMASDK */
public final class C4464wy implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f19500a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f19501b;

    /* renamed from: c */
    private final int f19502c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<amk> f19503d;

    /* renamed from: e */
    private final alw f19504e;

    /* renamed from: f */
    private final SparseIntArray f19505f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4468xb f19506g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray<C4470xd> f19507h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final SparseBooleanArray f19508i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final SparseBooleanArray f19509j;

    /* renamed from: k */
    private final C4460wu f19510k;

    /* renamed from: l */
    private C4459wt f19511l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C4309re f19512m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f19513n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f19514o;

    /* renamed from: p */
    private boolean f19515p;

    /* renamed from: q */
    private boolean f19516q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C4470xd f19517r;

    /* renamed from: s */
    private int f19518s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f19519t;

    static {
        int i = C4461wv.f19492b;
    }

    public C4464wy() {
        this(1, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    /* renamed from: r */
    static /* synthetic */ void m19418r(C4464wy wyVar) {
        wyVar.f19513n++;
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        byte[] j = this.f19504e.mo13952j();
        rcVar.mo16600g(j, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (j[(i2 * TsExtractor.TS_PACKET_SIZE) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            rcVar.mo16597d(i);
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f19512m = reVar;
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        boolean z;
        int i;
        C4307rc rcVar2 = rcVar;
        C4321rq rqVar2 = rqVar;
        long m = rcVar.mo16606m();
        if (!this.f19514o) {
            i = 2;
            z = false;
        } else if (m != -1 && this.f19501b != 2 && !this.f19510k.mo16759a()) {
            return this.f19510k.mo16760b(rcVar2, rqVar2, this.f19519t);
        } else {
            if (!this.f19515p) {
                this.f19515p = true;
                if (this.f19510k.mo16761c() != C6540C.TIME_UNSET) {
                    C4459wt wtVar = r3;
                    z = false;
                    i = 2;
                    C4459wt wtVar2 = new C4459wt(this.f19510k.mo16762d(), this.f19510k.mo16761c(), m, this.f19519t, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
                    this.f19511l = wtVar;
                    this.f19512m.mo13364bc(wtVar.mo16587a());
                } else {
                    i = 2;
                    z = false;
                    this.f19512m.mo13364bc(new C4323rs(this.f19510k.mo16761c()));
                }
            } else {
                i = 2;
                z = false;
            }
            if (this.f19516q) {
                this.f19516q = z;
                mo13692g(0, 0);
                if (rcVar.mo16605l() != 0) {
                    rqVar2.f18533a = 0;
                    return 1;
                }
            }
            C4459wt wtVar3 = this.f19511l;
            if (wtVar3 != null && wtVar3.mo16589c()) {
                return this.f19511l.mo16590d(rcVar2, rqVar2);
            }
        }
        byte[] j = this.f19504e.mo13952j();
        if (9400 - this.f19504e.mo13950h() < 188) {
            int e = this.f19504e.mo13947e();
            if (e > 0) {
                System.arraycopy(j, this.f19504e.mo13950h(), j, z, e);
            }
            this.f19504e.mo13945c(j, e);
        }
        while (this.f19504e.mo13947e() < 188) {
            int f = this.f19504e.mo13948f();
            int a = rcVar2.mo13294a(j, f, 9400 - f);
            if (a == -1) {
                return -1;
            }
            this.f19504e.mo13949g(f + a);
        }
        int h = this.f19504e.mo13950h();
        int f2 = this.f19504e.mo13948f();
        int e2 = C4396uk.m19136e(this.f19504e.mo13952j(), h, f2);
        this.f19504e.mo13951i(e2);
        int i2 = e2 + TsExtractor.TS_PACKET_SIZE;
        if (i2 > f2) {
            int i3 = this.f19518s + (e2 - h);
            this.f19518s = i3;
            if (this.f19501b == i && i3 > 376) {
                throw new C4144lb("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f19518s = z;
        }
        int f3 = this.f19504e.mo13948f();
        if (i2 > f3) {
            return z;
        }
        int w = this.f19504e.mo13965w();
        if ((8388608 & w) != 0) {
            this.f19504e.mo13951i(i2);
            return z;
        }
        int i4 = (4194304 & w) != 0 ? 1 : 0;
        int i5 = (w >> 8) & 8191;
        int i6 = w & 32;
        C4470xd xdVar = (w & 16) != 0 ? this.f19507h.get(i5) : null;
        if (xdVar == null) {
            this.f19504e.mo13951i(i2);
            return z;
        }
        if (this.f19501b != i) {
            int i7 = w & 15;
            int i8 = this.f19505f.get(i5, i7 - 1);
            this.f19505f.put(i5, i7);
            if (i8 == i7) {
                this.f19504e.mo13951i(i2);
                return z;
            } else if (i7 != ((i8 + 1) & 15)) {
                xdVar.mo16749b();
            }
        }
        if (i6 != 0) {
            int o = this.f19504e.mo13957o();
            i4 |= (this.f19504e.mo13957o() & 64) != 0 ? 2 : 0;
            this.f19504e.mo13954l(o - 1);
        }
        boolean z2 = this.f19514o;
        if (this.f19501b == i || z2 || !this.f19509j.get(i5, z)) {
            this.f19504e.mo13949g(i2);
            xdVar.mo16750c(this.f19504e, i4);
            this.f19504e.mo13949g(f3);
        }
        if (this.f19501b != i && !z2 && this.f19514o && m != -1) {
            this.f19516q = true;
        }
        this.f19504e.mo13951i(i2);
        return z ? 1 : 0;
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        C4459wt wtVar;
        aup.m14887r(this.f19501b != 2);
        int size = this.f19503d.size();
        for (int i = 0; i < size; i++) {
            amk amk = this.f19503d.get(i);
            if (amk.mo13996d() == C6540C.TIME_UNSET || !(amk.mo13996d() == 0 || amk.mo13994b() == j2)) {
                amk.mo13997e(j2);
            }
        }
        if (!(j2 == 0 || (wtVar = this.f19511l) == null)) {
            wtVar.mo16588b(j2);
        }
        this.f19504e.mo13943a(0);
        this.f19505f.clear();
        for (int i2 = 0; i2 < this.f19507h.size(); i2++) {
            this.f19507h.valueAt(i2).mo16749b();
        }
        this.f19518s = 0;
    }

    /* renamed from: h */
    public final void mo13693h() {
    }

    public C4464wy(int i, int i2) {
        this(1, new amk(0), new C4429vq((byte[]) null), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public C4464wy(int i, amk amk, C4468xb xbVar, int i2) {
        this.f19506g = xbVar;
        this.f19502c = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;
        this.f19501b = i;
        this.f19503d = Collections.singletonList(amk);
        this.f19504e = new alw(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f19508i = sparseBooleanArray;
        this.f19509j = new SparseBooleanArray();
        SparseArray<C4470xd> sparseArray = new SparseArray<>();
        this.f19507h = sparseArray;
        this.f19505f = new SparseIntArray();
        this.f19510k = new C4460wu(TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
        this.f19519t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<C4470xd> a = xbVar.mo16712a();
        int size = a.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f19507h.put(a.keyAt(i3), a.valueAt(i3));
        }
        this.f19507h.put(0, new C4456wq(new C4462ww(this)));
        this.f19517r = null;
    }
}
