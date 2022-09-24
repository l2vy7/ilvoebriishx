package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.rg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8121rg {

    /* renamed from: g */
    private static final byte[] f38656g = new byte[4096];

    /* renamed from: a */
    private final C7613dl f38657a;

    /* renamed from: b */
    private final long f38658b;

    /* renamed from: c */
    private long f38659c;

    /* renamed from: d */
    private byte[] f38660d = new byte[C6540C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* renamed from: e */
    private int f38661e;

    /* renamed from: f */
    private int f38662f;

    public C8121rg(C7613dl dlVar, long j, long j2) {
        this.f38657a = dlVar;
        this.f38659c = j;
        this.f38658b = j2;
    }

    /* renamed from: j */
    private final int m37070j(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f38657a.mo30699a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: k */
    private final int m37071k(byte[] bArr, int i, int i2) {
        int i3 = this.f38662f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f38660d, 0, bArr, i, min);
        m37074n(min);
        return min;
    }

    /* renamed from: l */
    private final int m37072l(int i) {
        int min = Math.min(this.f38662f, i);
        m37074n(min);
        return min;
    }

    /* renamed from: m */
    private final void m37073m(int i) {
        if (i != -1) {
            this.f38659c += (long) i;
        }
    }

    /* renamed from: n */
    private final void m37074n(int i) {
        int i2 = this.f38662f - i;
        this.f38662f = i2;
        this.f38661e = 0;
        byte[] bArr = this.f38660d;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f38660d = bArr2;
    }

    /* renamed from: a */
    public final int mo34531a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int k = m37071k(bArr, i, i2);
        if (k == 0) {
            k = m37070j(bArr, i, i2, 0, true);
        }
        m37073m(k);
        return k;
    }

    /* renamed from: b */
    public final int mo34532b(int i) throws IOException, InterruptedException {
        int l = m37072l(i);
        if (l == 0) {
            l = m37070j(f38656g, 0, Math.min(i, 4096), 0, true);
        }
        m37073m(l);
        return l;
    }

    /* renamed from: c */
    public final long mo34533c() {
        return this.f38658b;
    }

    /* renamed from: d */
    public final long mo34534d() {
        return this.f38659c;
    }

    /* renamed from: e */
    public final void mo34535e() {
        this.f38661e = 0;
    }

    /* renamed from: f */
    public final boolean mo34536f(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f38661e + i;
        int length = this.f38660d.length;
        if (i2 > length) {
            this.f38660d = Arrays.copyOf(this.f38660d, C7836jm.m33643e(length + length, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE + i2, i2 + 524288));
        }
        int min = Math.min(this.f38662f - this.f38661e, i);
        while (min < i) {
            min = m37070j(this.f38660d, this.f38661e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f38661e + i;
        this.f38661e = i3;
        this.f38662f = Math.max(this.f38662f, i3);
        return true;
    }

    /* renamed from: g */
    public final boolean mo34537g(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo34536f(i2, false)) {
            return false;
        }
        System.arraycopy(this.f38660d, this.f38661e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: h */
    public final boolean mo34538h(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int k = m37071k(bArr, i, i2);
        while (k < i2 && k != -1) {
            k = m37070j(bArr, i, i2, k, z);
        }
        m37073m(k);
        return k != -1;
    }

    /* renamed from: i */
    public final boolean mo34539i(int i, boolean z) throws IOException, InterruptedException {
        int l = m37072l(i);
        while (l < i && l != -1) {
            l = m37070j(f38656g, -l, Math.min(i, l + 4096), l, false);
        }
        m37073m(l);
        return l != -1;
    }
}
