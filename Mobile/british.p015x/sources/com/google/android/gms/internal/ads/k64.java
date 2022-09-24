package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.startapp.C12425x3;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class k64 {

    /* renamed from: a */
    private final uq2 f34175a = new uq2(32);

    /* renamed from: b */
    private j64 f34176b;

    /* renamed from: c */
    private j64 f34177c;

    /* renamed from: d */
    private j64 f34178d;

    /* renamed from: e */
    private long f34179e;

    /* renamed from: f */
    private final o84 f34180f;

    public k64(o84 o84, byte[] bArr) {
        this.f34180f = o84;
        j64 j64 = new j64(0, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f34176b = j64;
        this.f34177c = j64;
        this.f34178d = j64;
    }

    /* renamed from: i */
    private final int m33855i(int i) {
        j64 j64 = this.f34178d;
        if (!j64.f33789c) {
            a84 b = this.f34180f.mo33852b();
            j64 j642 = new j64(this.f34178d.f33788b, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
            j64.f33790d = b;
            j64.f33791e = j642;
            j64.f33789c = true;
        }
        return Math.min(i, (int) (this.f34178d.f33788b - this.f34179e));
    }

    /* renamed from: j */
    private static j64 m33856j(j64 j64, long j) {
        while (j >= j64.f33788b) {
            j64 = j64.f33791e;
        }
        return j64;
    }

    /* renamed from: k */
    private static j64 m33857k(j64 j64, long j, ByteBuffer byteBuffer, int i) {
        j64 j2 = m33856j(j64, j);
        while (i > 0) {
            int min = Math.min(i, (int) (j2.f33788b - j));
            byteBuffer.put(j2.f33790d.f29562a, j2.mo32861a(j), min);
            i -= min;
            j += (long) min;
            if (j == j2.f33788b) {
                j2 = j2.f33791e;
            }
        }
        return j2;
    }

    /* renamed from: l */
    private static j64 m33858l(j64 j64, long j, byte[] bArr, int i) {
        j64 j2 = m33856j(j64, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (j2.f33788b - j));
            System.arraycopy(j2.f33790d.f29562a, j2.mo32861a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == j2.f33788b) {
                j2 = j2.f33791e;
            }
        }
        return j2;
    }

    /* renamed from: m */
    private static j64 m33859m(j64 j64, s51 s51, m64 m64, uq2 uq2) {
        j64 j642;
        int i;
        s51 s512 = s51;
        m64 m642 = m64;
        uq2 uq22 = uq2;
        if (s51.mo18827k()) {
            long j = m642.f35420b;
            uq22.mo35233c(1);
            j64 l = m33858l(j64, j, uq2.mo35238h(), 1);
            long j2 = j + 1;
            byte b = uq2.mo35238h()[0];
            byte b2 = b & C12425x3.f55111d;
            byte b3 = b & Byte.MAX_VALUE;
            o21 o21 = s512.f20809b;
            byte[] bArr = o21.f36246a;
            if (bArr == null) {
                o21.f36246a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            j642 = m33858l(l, j2, o21.f36246a, b3);
            long j3 = j2 + ((long) b3);
            if (b2 != 0) {
                uq22.mo35233c(2);
                j642 = m33858l(j642, j3, uq2.mo35238h(), 2);
                j3 += 2;
                i = uq2.mo35253w();
            } else {
                i = 1;
            }
            int[] iArr = o21.f36249d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = o21.f36250e;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (b2 != 0) {
                int i2 = i * 6;
                uq22.mo35233c(i2);
                j642 = m33858l(j642, j3, uq2.mo35238h(), i2);
                j3 += (long) i2;
                uq22.mo35236f(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = uq2.mo35253w();
                    iArr4[i3] = uq2.mo35252v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = m642.f35419a - ((int) (j3 - m642.f35420b));
            }
            zc4 zc4 = m642.f35421c;
            int i4 = d13.f20195a;
            o21.mo33829c(i, iArr2, iArr4, zc4.f42425b, o21.f36246a, zc4.f42424a, zc4.f42426c, zc4.f42427d);
            long j4 = m642.f35420b;
            int i5 = (int) (j3 - j4);
            m642.f35420b = j4 + ((long) i5);
            m642.f35419a -= i5;
        } else {
            j642 = j64;
        }
        if (s51.mo33439e()) {
            uq22.mo35233c(4);
            j64 l2 = m33858l(j642, m642.f35420b, uq2.mo35238h(), 4);
            int v = uq2.mo35252v();
            m642.f35420b += 4;
            m642.f35419a -= 4;
            s512.mo18825i(v);
            j64 k = m33857k(l2, m642.f35420b, s512.f20810c, v);
            m642.f35420b += (long) v;
            int i6 = m642.f35419a - v;
            m642.f35419a = i6;
            ByteBuffer byteBuffer = s512.f20813f;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                s512.f20813f = ByteBuffer.allocate(i6);
            } else {
                s512.f20813f.clear();
            }
            return m33857k(k, m642.f35420b, s512.f20813f, m642.f35419a);
        }
        s512.mo18825i(m642.f35419a);
        return m33857k(j642, m642.f35420b, s512.f20810c, m642.f35419a);
    }

    /* renamed from: n */
    private final void m33860n(int i) {
        long j = this.f34179e + ((long) i);
        this.f34179e = j;
        j64 j64 = this.f34178d;
        if (j == j64.f33788b) {
            this.f34178d = j64.f33791e;
        }
    }

    /* renamed from: a */
    public final int mo33040a(wb1 wb1, int i, boolean z) throws IOException {
        int i2 = m33855i(i);
        j64 j64 = this.f34178d;
        int b = wb1.mo30477b(j64.f33790d.f29562a, j64.mo32861a(this.f34179e), i2);
        if (b != -1) {
            m33860n(b);
            return b;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final long mo33041b() {
        return this.f34179e;
    }

    /* renamed from: c */
    public final void mo33042c(long j) {
        j64 j64;
        if (j != -1) {
            while (true) {
                j64 = this.f34176b;
                if (j < j64.f33788b) {
                    break;
                }
                this.f34180f.mo33853c(j64.f33790d);
                this.f34176b = this.f34176b.mo32862b();
            }
            if (this.f34177c.f33787a < j64.f33787a) {
                this.f34177c = j64;
            }
        }
    }

    /* renamed from: d */
    public final void mo33043d(s51 s51, m64 m64) {
        m33859m(this.f34177c, s51, m64, this.f34175a);
    }

    /* renamed from: e */
    public final void mo33044e(s51 s51, m64 m64) {
        this.f34177c = m33859m(this.f34177c, s51, m64, this.f34175a);
    }

    /* renamed from: f */
    public final void mo33045f() {
        j64 j64 = this.f34176b;
        if (j64.f33789c) {
            j64 j642 = this.f34178d;
            boolean z = j642.f33789c;
            int i = (z ? 1 : 0) + (((int) (j642.f33787a - j64.f33787a)) / C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
            a84[] a84Arr = new a84[i];
            for (int i2 = 0; i2 < i; i2++) {
                a84Arr[i2] = j64.f33790d;
                j64 = j64.mo32862b();
            }
            this.f34180f.mo33854d(a84Arr);
        }
        j64 j643 = new j64(0, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f34176b = j643;
        this.f34177c = j643;
        this.f34178d = j643;
        this.f34179e = 0;
        this.f34180f.mo33857g();
    }

    /* renamed from: g */
    public final void mo33046g() {
        this.f34177c = this.f34176b;
    }

    /* renamed from: h */
    public final void mo33047h(uq2 uq2, int i) {
        while (i > 0) {
            int i2 = m33855i(i);
            j64 j64 = this.f34178d;
            uq2.mo35232b(j64.f33790d.f29562a, j64.mo32861a(this.f34179e), i2);
            i -= i2;
            m33860n(i2);
        }
    }
}
