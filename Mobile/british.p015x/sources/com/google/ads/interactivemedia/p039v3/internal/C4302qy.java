package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qy */
/* compiled from: IMASDK */
public final class C4302qy implements C4307rc {

    /* renamed from: a */
    private final byte[] f18468a = new byte[4096];

    /* renamed from: b */
    private final ajd f18469b;

    /* renamed from: c */
    private final long f18470c;

    /* renamed from: d */
    private long f18471d;

    /* renamed from: e */
    private byte[] f18472e = new byte[C6540C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* renamed from: f */
    private int f18473f;

    /* renamed from: g */
    private int f18474g;

    public C4302qy(ajd ajd, long j, long j2) {
        this.f18469b = ajd;
        this.f18471d = j;
        this.f18470c = j2;
    }

    /* renamed from: o */
    private final void m18698o(int i) {
        int i2 = this.f18473f + i;
        int length = this.f18472e.length;
        if (i2 > length) {
            this.f18472e = Arrays.copyOf(this.f18472e, amm.m14191H(length + length, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE + i2, i2 + 524288));
        }
    }

    /* renamed from: p */
    private final int m18699p(int i) {
        int min = Math.min(this.f18474g, i);
        m18701r(min);
        return min;
    }

    /* renamed from: q */
    private final int m18700q(byte[] bArr, int i, int i2) {
        int i3 = this.f18474g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f18472e, 0, bArr, i, min);
        m18701r(min);
        return min;
    }

    /* renamed from: r */
    private final void m18701r(int i) {
        int i2 = this.f18474g - i;
        this.f18474g = i2;
        this.f18473f = 0;
        byte[] bArr = this.f18472e;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f18472e = bArr2;
    }

    /* renamed from: s */
    private final int m18702s(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int a = this.f18469b.mo13294a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: t */
    private final void m18703t(int i) {
        if (i != -1) {
            this.f18471d += (long) i;
        }
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws IOException {
        int q = m18700q(bArr, i, i2);
        if (q == 0) {
            q = m18702s(bArr, i, i2, 0, true);
        }
        m18703t(q);
        return q;
    }

    /* renamed from: b */
    public final boolean mo16595b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int q = m18700q(bArr, i, i2);
        while (q < i2 && q != -1) {
            q = m18702s(bArr, i, i2, q, z);
        }
        m18703t(q);
        return q != -1;
    }

    /* renamed from: c */
    public final void mo16596c(byte[] bArr, int i, int i2) throws IOException {
        mo16595b(bArr, i, i2, false);
    }

    /* renamed from: d */
    public final void mo16597d(int i) throws IOException {
        int p = m18699p(i);
        while (p < i && p != -1) {
            p = m18702s(this.f18468a, -p, Math.min(i, p + 4096), p, false);
        }
        m18703t(p);
    }

    /* renamed from: e */
    public final int mo16598e(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m18698o(i2);
        int i4 = this.f18474g;
        int i5 = this.f18473f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m18702s(this.f18472e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f18474g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f18472e, this.f18473f, bArr, i, i3);
        this.f18473f += i3;
        return i3;
    }

    /* renamed from: f */
    public final boolean mo16599f(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo16601h(i2, z)) {
            return false;
        }
        System.arraycopy(this.f18472e, this.f18473f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: g */
    public final void mo16600g(byte[] bArr, int i, int i2) throws IOException {
        mo16599f(bArr, i, i2, false);
    }

    /* renamed from: h */
    public final boolean mo16601h(int i, boolean z) throws IOException {
        m18698o(i);
        int i2 = this.f18474g - this.f18473f;
        while (i2 < i) {
            i2 = m18702s(this.f18472e, this.f18473f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f18474g = this.f18473f + i2;
        }
        this.f18473f += i;
        return true;
    }

    /* renamed from: i */
    public final void mo16602i(int i) throws IOException {
        mo16601h(i, false);
    }

    /* renamed from: j */
    public final void mo16603j() {
        this.f18473f = 0;
    }

    /* renamed from: k */
    public final long mo16604k() {
        return this.f18471d + ((long) this.f18473f);
    }

    /* renamed from: l */
    public final long mo16605l() {
        return this.f18471d;
    }

    /* renamed from: m */
    public final long mo16606m() {
        return this.f18470c;
    }

    /* renamed from: n */
    public final int mo16607n() throws IOException {
        int p = m18699p(1);
        if (p == 0) {
            p = m18702s(this.f18468a, 0, Math.min(1, 4096), 0, true);
        }
        m18703t(p);
        return p;
    }
}
