package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qb4 implements wb4 {

    /* renamed from: a */
    private final byte[] f37958a = new byte[4096];

    /* renamed from: b */
    private final wb1 f37959b;

    /* renamed from: c */
    private final long f37960c;

    /* renamed from: d */
    private long f37961d;

    /* renamed from: e */
    private byte[] f37962e = new byte[C6540C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* renamed from: f */
    private int f37963f;

    /* renamed from: g */
    private int f37964g;

    public qb4(wb1 wb1, long j, long j2) {
        this.f37959b = wb1;
        this.f37961d = j;
        this.f37960c = j2;
    }

    /* renamed from: l */
    private final int m36403l(byte[] bArr, int i, int i2) {
        int i3 = this.f37964g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f37962e, 0, bArr, i, min);
        m36408q(min);
        return min;
    }

    /* renamed from: m */
    private final int m36404m(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int b = this.f37959b.mo30477b(bArr, i + i3, i2 - i3);
            if (b != -1) {
                return i3 + b;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: n */
    private final int m36405n(int i) {
        int min = Math.min(this.f37964g, i);
        m36408q(min);
        return min;
    }

    /* renamed from: o */
    private final void m36406o(int i) {
        if (i != -1) {
            this.f37961d += (long) i;
        }
    }

    /* renamed from: p */
    private final void m36407p(int i) {
        int i2 = this.f37963f + i;
        int length = this.f37962e.length;
        if (i2 > length) {
            this.f37962e = Arrays.copyOf(this.f37962e, d13.m20281L(length + length, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE + i2, i2 + 524288));
        }
    }

    /* renamed from: q */
    private final void m36408q(int i) {
        int i2 = this.f37964g - i;
        this.f37964g = i2;
        this.f37963f = 0;
        byte[] bArr = this.f37962e;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f37962e = bArr2;
    }

    /* renamed from: a */
    public final int mo33308a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m36407p(i2);
        int i4 = this.f37964g;
        int i5 = this.f37963f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m36404m(this.f37962e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f37964g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f37962e, this.f37963f, bArr, i, i3);
        this.f37963f += i3;
        return i3;
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws IOException {
        int l = m36403l(bArr, i, i2);
        if (l == 0) {
            l = m36404m(bArr, i, i2, 0, true);
        }
        m36406o(l);
        return l;
    }

    /* renamed from: c */
    public final void mo33309c(int i) throws IOException {
        mo34305k(i, false);
    }

    /* renamed from: d */
    public final boolean mo33310d(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int l = m36403l(bArr, i, i2);
        while (l < i2 && l != -1) {
            l = m36404m(bArr, i, i2, l, z);
        }
        m36406o(l);
        return l != -1;
    }

    /* renamed from: e */
    public final boolean mo33311e(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo34304j(i2, z)) {
            return false;
        }
        System.arraycopy(this.f37962e, this.f37963f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: f */
    public final void mo33312f(byte[] bArr, int i, int i2) throws IOException {
        mo33310d(bArr, i, i2, false);
    }

    /* renamed from: g */
    public final void mo33313g(byte[] bArr, int i, int i2) throws IOException {
        mo33311e(bArr, i, i2, false);
    }

    /* renamed from: j */
    public final boolean mo34304j(int i, boolean z) throws IOException {
        m36407p(i);
        int i2 = this.f37964g - this.f37963f;
        while (i2 < i) {
            i2 = m36404m(this.f37962e, this.f37963f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f37964g = this.f37963f + i2;
        }
        this.f37963f += i;
        return true;
    }

    /* renamed from: k */
    public final boolean mo34305k(int i, boolean z) throws IOException {
        int n = m36405n(i);
        while (n < i && n != -1) {
            n = m36404m(this.f37958a, -n, Math.min(i, n + 4096), n, false);
        }
        m36406o(n);
        return n != -1;
    }

    public final int zzb(int i) throws IOException {
        int n = m36405n(1);
        if (n == 0) {
            n = m36404m(this.f37958a, 0, Math.min(1, 4096), 0, true);
        }
        m36406o(n);
        return n;
    }

    public final long zzc() {
        return this.f37960c;
    }

    public final long zzd() {
        return this.f37961d + ((long) this.f37963f);
    }

    public final long zze() {
        return this.f37961d;
    }

    public final void zzf(int i) throws IOException {
        mo34304j(i, false);
    }

    public final void zzj() {
        this.f37963f = 0;
    }
}
