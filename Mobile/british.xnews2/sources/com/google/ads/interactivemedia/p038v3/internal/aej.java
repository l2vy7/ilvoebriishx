package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aej */
/* compiled from: IMASDK */
final class aej implements ach {

    /* renamed from: a */
    private final C4120ke f14406a;

    /* renamed from: b */
    private final C4512ys f14407b = new C4512ys();

    /* renamed from: c */
    private long[] f14408c;

    /* renamed from: d */
    private boolean f14409d;

    /* renamed from: e */
    private aet f14410e;

    /* renamed from: f */
    private boolean f14411f;

    /* renamed from: g */
    private int f14412g;

    /* renamed from: h */
    private long f14413h = C6540C.TIME_UNSET;

    public aej(aet aet, C4120ke keVar, boolean z) {
        this.f14406a = keVar;
        this.f14410e = aet;
        this.f14408c = aet.f14466b;
        mo13552f(aet, z);
    }

    /* renamed from: a */
    public final String mo13551a() {
        return this.f14410e.mo13577a();
    }

    /* renamed from: b */
    public final boolean mo13224b() {
        return true;
    }

    /* renamed from: c */
    public final void mo13225c() throws IOException {
    }

    /* renamed from: d */
    public final int mo13226d(C4121kf kfVar, C4269ps psVar, int i) {
        if ((i & 2) != 0 || !this.f14411f) {
            kfVar.f17697b = this.f14406a;
            this.f14411f = true;
            return -5;
        }
        int i2 = this.f14412g;
        if (i2 != this.f14408c.length) {
            this.f14412g = i2 + 1;
            byte[] a = this.f14407b.mo16850a(this.f14410e.f14465a[i2]);
            psVar.mo16520i(a.length);
            psVar.f18397b.put(a);
            psVar.f18399d = this.f14408c[i2];
            psVar.mo16513f(1);
            return -4;
        } else if (this.f14409d) {
            return -3;
        } else {
            psVar.mo16513f(4);
            return -4;
        }
    }

    /* renamed from: e */
    public final int mo13227e(long j) {
        int max = Math.max(this.f14412g, amm.m14220aj(this.f14408c, j, true));
        int i = this.f14412g;
        this.f14412g = max;
        return max - i;
    }

    /* renamed from: f */
    public final void mo13552f(aet aet, boolean z) {
        long j;
        int i = this.f14412g;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.f14408c[i - 1];
        }
        this.f14409d = z;
        this.f14410e = aet;
        long[] jArr = aet.f14466b;
        this.f14408c = jArr;
        long j2 = this.f14413h;
        if (j2 != C6540C.TIME_UNSET) {
            mo13553g(j2);
        } else if (j != C6540C.TIME_UNSET) {
            this.f14412g = amm.m14220aj(jArr, j, false);
        }
    }

    /* renamed from: g */
    public final void mo13553g(long j) {
        int aj = amm.m14220aj(this.f14408c, j, true);
        this.f14412g = aj;
        if (!this.f14409d || aj != this.f14408c.length) {
            j = -9223372036854775807L;
        }
        this.f14413h = j;
    }
}
