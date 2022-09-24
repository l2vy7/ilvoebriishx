package com.google.android.gms.internal.clearcut;

import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.clearcut.q4 */
public final class C8984q4 {

    /* renamed from: a */
    private final ByteBuffer f44726a;

    /* renamed from: b */
    private C8947m0 f44727b;

    /* renamed from: c */
    private int f44728c;

    private C8984q4(ByteBuffer byteBuffer) {
        this.f44726a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private C8984q4(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: A */
    private static int m42287A(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: a */
    private static int m42288a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: e */
    private final void m42289e(int i) throws IOException {
        byte b = (byte) i;
        if (this.f44726a.hasRemaining()) {
            this.f44726a.put(b);
            return;
        }
        throw new C8991r4(this.f44726a.position(), this.f44726a.limit());
    }

    /* renamed from: f */
    private final void m42290f(int i) throws IOException {
        while ((i & -128) != 0) {
            m42289e((i & 127) | 128);
            i >>>= 7;
        }
        m42289e(i);
    }

    /* renamed from: g */
    public static int m42291g(int i, C9033x4 x4Var) {
        int y = m42302y(i);
        int c = x4Var.mo37228c();
        return y + m42287A(c) + c;
    }

    /* renamed from: h */
    public static int m42292h(int i, String str) {
        return m42302y(i) + m42297r(str);
    }

    /* renamed from: i */
    public static int m42293i(int i, byte[] bArr) {
        return m42302y(i) + m42298s(bArr);
    }

    /* renamed from: m */
    public static int m42294m(int i, long j) {
        return m42302y(i) + m42301x(j);
    }

    /* renamed from: n */
    private static void m42295n(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i4 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i5 = remaining + arrayOffset;
                    while (i4 < length) {
                        int i6 = i4 + arrayOffset;
                        if (i6 >= i5 || (charAt = charSequence.charAt(i4)) >= 128) {
                            break;
                        }
                        array[i6] = (byte) charAt;
                        i4++;
                    }
                    if (i4 == length) {
                        i2 = arrayOffset + length;
                    } else {
                        i2 = arrayOffset + i4;
                        while (i4 < length) {
                            char charAt2 = charSequence.charAt(i4);
                            if (charAt2 < 128 && i2 < i5) {
                                i3 = i2 + 1;
                                array[i2] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i2 <= i5 - 2) {
                                int i7 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 6) | 960);
                                i2 = i7 + 1;
                                array[i7] = (byte) ((charAt2 & '?') | 128);
                                i4++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i2 <= i5 - 3) {
                                int i8 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 12) | 480);
                                int i9 = i8 + 1;
                                array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 = i9 + 1;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i2 <= i5 - 4) {
                                int i10 = i4 + 1;
                                if (i10 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i10);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i11 = i2 + 1;
                                        array[i2] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i13 = i12 + 1;
                                        array[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i13 + 1;
                                        array[i13] = (byte) ((codePoint & 63) | 128);
                                        i4 = i10;
                                        i4++;
                                    } else {
                                        i4 = i10;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i4 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i2);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i2 = i3;
                            i4++;
                        }
                    }
                    byteBuffer.position(i2 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                            i = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i14 = i4 + 1;
                            if (i14 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i4 = i14;
                                    i4++;
                                } else {
                                    i4 = i14;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i4 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) i);
                        charAt4 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put((byte) charAt4);
                    i4++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: q */
    public static C8984q4 m42296q(byte[] bArr) {
        return m42299t(bArr, 0, bArr.length);
    }

    /* renamed from: r */
    public static int m42297r(String str) {
        int a = m42288a(str);
        return m42287A(a) + a;
    }

    /* renamed from: s */
    public static int m42298s(byte[] bArr) {
        return m42287A(bArr.length) + bArr.length;
    }

    /* renamed from: t */
    public static C8984q4 m42299t(byte[] bArr, int i, int i2) {
        return new C8984q4(bArr, 0, i2);
    }

    /* renamed from: v */
    public static long m42300v(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: x */
    public static int m42301x(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: y */
    public static int m42302y(int i) {
        return m42287A(i << 3);
    }

    /* renamed from: z */
    public static int m42303z(int i) {
        if (i >= 0) {
            return m42287A(i);
        }
        return 10;
    }

    /* renamed from: b */
    public final void mo37121b(int i, C9033x4 x4Var) throws IOException {
        mo37124j(i, 2);
        if (x4Var.f44796b < 0) {
            x4Var.mo37228c();
        }
        m42290f(x4Var.f44796b);
        x4Var.mo36988a(this);
    }

    /* renamed from: c */
    public final void mo37122c(int i, String str) throws IOException {
        mo37124j(i, 2);
        try {
            int A = m42287A(str.length());
            if (A == m42287A(str.length() * 3)) {
                int position = this.f44726a.position();
                if (this.f44726a.remaining() >= A) {
                    this.f44726a.position(position + A);
                    m42295n(str, this.f44726a);
                    int position2 = this.f44726a.position();
                    this.f44726a.position(position);
                    m42290f((position2 - position) - A);
                    this.f44726a.position(position2);
                    return;
                }
                throw new C8991r4(position + A, this.f44726a.limit());
            }
            m42290f(m42288a(str));
            m42295n(str, this.f44726a);
        } catch (BufferOverflowException e) {
            C8991r4 r4Var = new C8991r4(this.f44726a.position(), this.f44726a.limit());
            r4Var.initCause(e);
            throw r4Var;
        }
    }

    /* renamed from: d */
    public final void mo37123d(int i, byte[] bArr) throws IOException {
        mo37124j(i, 2);
        m42290f(bArr.length);
        int length = bArr.length;
        if (this.f44726a.remaining() >= length) {
            this.f44726a.put(bArr, 0, length);
            return;
        }
        throw new C8991r4(this.f44726a.position(), this.f44726a.limit());
    }

    /* renamed from: j */
    public final void mo37124j(int i, int i2) throws IOException {
        m42290f((i << 3) | i2);
    }

    /* renamed from: k */
    public final void mo37125k(int i, boolean z) throws IOException {
        mo37124j(25, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f44726a.hasRemaining()) {
            this.f44726a.put(b);
            return;
        }
        throw new C8991r4(this.f44726a.position(), this.f44726a.limit());
    }

    /* renamed from: l */
    public final void mo37126l(int i, int i2) throws IOException {
        mo37124j(i, 0);
        if (i2 >= 0) {
            m42290f(i2);
        } else {
            mo37130w((long) i2);
        }
    }

    /* renamed from: o */
    public final void mo37127o(int i, C8942l2 l2Var) throws IOException {
        if (this.f44727b == null) {
            this.f44727b = C8947m0.m41956f(this.f44726a);
        } else {
            if (this.f44728c != this.f44726a.position()) {
                this.f44727b.mo37013c(this.f44726a.array(), this.f44728c, this.f44726a.position() - this.f44728c);
            }
            C8947m0 m0Var = this.f44727b;
            m0Var.mo37025n(i, l2Var);
            m0Var.mo37011b();
            this.f44728c = this.f44726a.position();
        }
        this.f44728c = this.f44726a.position();
        C8947m0 m0Var2 = this.f44727b;
        m0Var2.mo37025n(i, l2Var);
        m0Var2.mo37011b();
        this.f44728c = this.f44726a.position();
    }

    /* renamed from: p */
    public final void mo37128p() {
        if (this.f44726a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f44726a.remaining())}));
        }
    }

    /* renamed from: u */
    public final void mo37129u(int i, long j) throws IOException {
        mo37124j(i, 0);
        mo37130w(j);
    }

    /* renamed from: w */
    public final void mo37130w(long j) throws IOException {
        while ((-128 & j) != 0) {
            m42289e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m42289e((int) j);
    }
}
