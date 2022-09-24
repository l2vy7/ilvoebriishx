package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.clearcut.m0 */
public abstract class C8947m0 extends C9042z {

    /* renamed from: b */
    private static final Logger f44609b = Logger.getLogger(C8947m0.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f44610c = C8859b4.m41584x();

    /* renamed from: a */
    C8966o0 f44611a;

    /* renamed from: com.google.android.gms.internal.clearcut.m0$a */
    static class C8948a extends C8947m0 {

        /* renamed from: d */
        private final byte[] f44612d;

        /* renamed from: e */
        private final int f44613e;

        /* renamed from: f */
        private final int f44614f;

        /* renamed from: g */
        private int f44615g;

        C8948a(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) >= 0) {
                this.f44612d = bArr;
                this.f44613e = i;
                this.f44615g = i;
                this.f44614f = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: A0 */
        public final void mo37000A0(int i) throws IOException {
            try {
                byte[] bArr = this.f44612d;
                int i2 = this.f44615g;
                int i3 = i2 + 1;
                this.f44615g = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.f44615g = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.f44615g = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f44615g = i5 + 1;
                bArr[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f44615g), Integer.valueOf(this.f44614f), 1}), e);
            }
        }

        /* renamed from: G */
        public final void mo37001G(int i, int i2) throws IOException {
            mo37034y0((i << 3) | i2);
        }

        /* renamed from: I */
        public final void mo37003I(int i, C8847a0 a0Var) throws IOException {
            mo37001G(1, 3);
            mo37012b0(2, i);
            mo37023m(3, a0Var);
            mo37001G(1, 4);
        }

        /* renamed from: J */
        public final void mo37004J(int i, C8942l2 l2Var) throws IOException {
            mo37001G(1, 3);
            mo37012b0(2, i);
            mo37025n(3, l2Var);
            mo37001G(1, 4);
        }

        /* renamed from: K */
        public final void mo37005K(int i, boolean z) throws IOException {
            mo37001G(i, 0);
            mo37016g(z ? (byte) 1 : 0);
        }

        /* renamed from: K0 */
        public final int mo37036K0() {
            return this.f44615g - this.f44613e;
        }

        /* renamed from: L */
        public final void mo37006L(long j) throws IOException {
            if (!C8947m0.f44610c || mo37032u() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f44612d;
                    int i = this.f44615g;
                    this.f44615g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f44612d;
                    int i2 = this.f44615g;
                    this.f44615g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f44615g), Integer.valueOf(this.f44614f), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f44612d;
                    int i3 = this.f44615g;
                    this.f44615g = i3 + 1;
                    C8859b4.m41571k(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f44612d;
                int i4 = this.f44615g;
                this.f44615g = i4 + 1;
                C8859b4.m41571k(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: M */
        public final void mo37007M(C8942l2 l2Var) throws IOException {
            mo37034y0(l2Var.mo36891a());
            l2Var.mo36893c(this);
        }

        /* renamed from: T */
        public final void mo37008T(int i, int i2) throws IOException {
            mo37001G(i, 0);
            mo37033x0(i2);
        }

        /* renamed from: U */
        public final void mo37009U(int i, long j) throws IOException {
            mo37001G(i, 1);
            mo37014c0(j);
        }

        /* renamed from: a */
        public final void mo37037a(byte[] bArr, int i, int i2) throws IOException {
            mo37013c(bArr, i, i2);
        }

        /* renamed from: b */
        public void mo37011b() {
        }

        /* renamed from: b0 */
        public final void mo37012b0(int i, int i2) throws IOException {
            mo37001G(i, 0);
            mo37034y0(i2);
        }

        /* renamed from: c */
        public final void mo37013c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f44612d, this.f44615g, i2);
                this.f44615g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f44615g), Integer.valueOf(this.f44614f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: c0 */
        public final void mo37014c0(long j) throws IOException {
            try {
                byte[] bArr = this.f44612d;
                int i = this.f44615g;
                int i2 = i + 1;
                this.f44615g = i2;
                bArr[i] = (byte) ((int) j);
                int i3 = i2 + 1;
                this.f44615g = i3;
                bArr[i2] = (byte) ((int) (j >> 8));
                int i4 = i3 + 1;
                this.f44615g = i4;
                bArr[i3] = (byte) ((int) (j >> 16));
                int i5 = i4 + 1;
                this.f44615g = i5;
                bArr[i4] = (byte) ((int) (j >> 24));
                int i6 = i5 + 1;
                this.f44615g = i6;
                bArr[i5] = (byte) ((int) (j >> 32));
                int i7 = i6 + 1;
                this.f44615g = i7;
                bArr[i6] = (byte) ((int) (j >> 40));
                int i8 = i7 + 1;
                this.f44615g = i8;
                bArr[i7] = (byte) ((int) (j >> 48));
                this.f44615g = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f44615g), Integer.valueOf(this.f44614f), 1}), e);
            }
        }

        /* renamed from: g */
        public final void mo37016g(byte b) throws IOException {
            try {
                byte[] bArr = this.f44612d;
                int i = this.f44615g;
                this.f44615g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f44615g), Integer.valueOf(this.f44614f), 1}), e);
            }
        }

        /* renamed from: i0 */
        public final void mo37019i0(int i, int i2) throws IOException {
            mo37001G(i, 5);
            mo37000A0(i2);
        }

        /* renamed from: l */
        public final void mo37022l(int i, long j) throws IOException {
            mo37001G(i, 0);
            mo37006L(j);
        }

        /* renamed from: m */
        public final void mo37023m(int i, C8847a0 a0Var) throws IOException {
            mo37001G(i, 2);
            mo37028q(a0Var);
        }

        /* renamed from: m0 */
        public final void mo37024m0(String str) throws IOException {
            int i = this.f44615g;
            try {
                int D0 = C8947m0.m41932D0(str.length() * 3);
                int D02 = C8947m0.m41932D0(str.length());
                if (D02 == D0) {
                    int i2 = i + D02;
                    this.f44615g = i2;
                    int b = C8881d4.m41669b(str, this.f44612d, i2, mo37032u());
                    this.f44615g = i;
                    mo37034y0((b - i) - D02);
                    this.f44615g = b;
                    return;
                }
                mo37034y0(C8881d4.m41668a(str));
                this.f44615g = C8881d4.m41669b(str, this.f44612d, this.f44615g, mo37032u());
            } catch (C8906g4 e) {
                this.f44615g = i;
                mo37030s(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C8950c((Throwable) e2);
            }
        }

        /* renamed from: n */
        public final void mo37025n(int i, C8942l2 l2Var) throws IOException {
            mo37001G(i, 2);
            mo37007M(l2Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public final void mo37026o(int i, C8942l2 l2Var, C8870c3 c3Var) throws IOException {
            mo37001G(i, 2);
            C8979q qVar = (C8979q) l2Var;
            int h = qVar.mo36898h();
            if (h == -1) {
                h = c3Var.mo36865h(qVar);
                qVar.mo36895e(h);
            }
            mo37034y0(h);
            c3Var.mo36864g(l2Var, this.f44611a);
        }

        /* renamed from: p */
        public final void mo37027p(int i, String str) throws IOException {
            mo37001G(i, 2);
            mo37024m0(str);
        }

        /* renamed from: q */
        public final void mo37028q(C8847a0 a0Var) throws IOException {
            mo37034y0(a0Var.size());
            a0Var.mo36802e(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public final void mo37029r(C8942l2 l2Var, C8870c3 c3Var) throws IOException {
            C8979q qVar = (C8979q) l2Var;
            int h = qVar.mo36898h();
            if (h == -1) {
                h = c3Var.mo36865h(qVar);
                qVar.mo36895e(h);
            }
            mo37034y0(h);
            c3Var.mo36864g(l2Var, this.f44611a);
        }

        /* renamed from: u */
        public final int mo37032u() {
            return this.f44614f - this.f44615g;
        }

        /* renamed from: x0 */
        public final void mo37033x0(int i) throws IOException {
            if (i >= 0) {
                mo37034y0(i);
            } else {
                mo37006L((long) i);
            }
        }

        /* renamed from: y0 */
        public final void mo37034y0(int i) throws IOException {
            if (!C8947m0.f44610c || mo37032u() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f44612d;
                    int i2 = this.f44615g;
                    this.f44615g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f44612d;
                    int i3 = this.f44615g;
                    this.f44615g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f44615g), Integer.valueOf(this.f44614f), 1}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f44612d;
                    int i4 = this.f44615g;
                    this.f44615g = i4 + 1;
                    C8859b4.m41571k(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f44612d;
                int i5 = this.f44615g;
                this.f44615g = i5 + 1;
                C8859b4.m41571k(bArr4, (long) i5, (byte) i);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.m0$b */
    static final class C8949b extends C8948a {

        /* renamed from: h */
        private final ByteBuffer f44616h;

        /* renamed from: i */
        private int f44617i;

        C8949b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f44616h = byteBuffer;
            this.f44617i = byteBuffer.position();
        }

        /* renamed from: b */
        public final void mo37011b() {
            this.f44616h.position(this.f44617i + mo37036K0());
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.m0$c */
    public static class C8950c extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C8950c(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0011
                java.lang.String r3 = r0.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x0016:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8947m0.C8950c.<init>(java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C8950c(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0011
                java.lang.String r3 = r0.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8947m0.C8950c.<init>(java.lang.String, java.lang.Throwable):void");
        }

        C8950c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.m0$d */
    static final class C8951d extends C8947m0 {

        /* renamed from: d */
        private final ByteBuffer f44618d;

        /* renamed from: e */
        private final ByteBuffer f44619e;

        /* renamed from: f */
        private final int f44620f;

        C8951d(ByteBuffer byteBuffer) {
            super();
            this.f44618d = byteBuffer;
            this.f44619e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f44620f = byteBuffer.position();
        }

        /* renamed from: K0 */
        private final void m42042K0(String str) throws IOException {
            try {
                C8881d4.m41670c(str, this.f44619e);
            } catch (IndexOutOfBoundsException e) {
                throw new C8950c((Throwable) e);
            }
        }

        /* renamed from: A0 */
        public final void mo37000A0(int i) throws IOException {
            try {
                this.f44619e.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C8950c((Throwable) e);
            }
        }

        /* renamed from: G */
        public final void mo37001G(int i, int i2) throws IOException {
            mo37034y0((i << 3) | i2);
        }

        /* renamed from: I */
        public final void mo37003I(int i, C8847a0 a0Var) throws IOException {
            mo37001G(1, 3);
            mo37012b0(2, i);
            mo37023m(3, a0Var);
            mo37001G(1, 4);
        }

        /* renamed from: J */
        public final void mo37004J(int i, C8942l2 l2Var) throws IOException {
            mo37001G(1, 3);
            mo37012b0(2, i);
            mo37025n(3, l2Var);
            mo37001G(1, 4);
        }

        /* renamed from: K */
        public final void mo37005K(int i, boolean z) throws IOException {
            mo37001G(i, 0);
            mo37016g(z ? (byte) 1 : 0);
        }

        /* renamed from: L */
        public final void mo37006L(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f44619e.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f44619e.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new C8950c((Throwable) e);
            }
        }

        /* renamed from: M */
        public final void mo37007M(C8942l2 l2Var) throws IOException {
            mo37034y0(l2Var.mo36891a());
            l2Var.mo36893c(this);
        }

        /* renamed from: T */
        public final void mo37008T(int i, int i2) throws IOException {
            mo37001G(i, 0);
            mo37033x0(i2);
        }

        /* renamed from: U */
        public final void mo37009U(int i, long j) throws IOException {
            mo37001G(i, 1);
            mo37014c0(j);
        }

        /* renamed from: a */
        public final void mo37037a(byte[] bArr, int i, int i2) throws IOException {
            mo37013c(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo37011b() {
            this.f44618d.position(this.f44619e.position());
        }

        /* renamed from: b0 */
        public final void mo37012b0(int i, int i2) throws IOException {
            mo37001G(i, 0);
            mo37034y0(i2);
        }

        /* renamed from: c */
        public final void mo37013c(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f44619e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C8950c((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C8950c((Throwable) e2);
            }
        }

        /* renamed from: c0 */
        public final void mo37014c0(long j) throws IOException {
            try {
                this.f44619e.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C8950c((Throwable) e);
            }
        }

        /* renamed from: g */
        public final void mo37016g(byte b) throws IOException {
            try {
                this.f44619e.put(b);
            } catch (BufferOverflowException e) {
                throw new C8950c((Throwable) e);
            }
        }

        /* renamed from: i0 */
        public final void mo37019i0(int i, int i2) throws IOException {
            mo37001G(i, 5);
            mo37000A0(i2);
        }

        /* renamed from: l */
        public final void mo37022l(int i, long j) throws IOException {
            mo37001G(i, 0);
            mo37006L(j);
        }

        /* renamed from: m */
        public final void mo37023m(int i, C8847a0 a0Var) throws IOException {
            mo37001G(i, 2);
            mo37028q(a0Var);
        }

        /* renamed from: m0 */
        public final void mo37024m0(String str) throws IOException {
            int position = this.f44619e.position();
            try {
                int D0 = C8947m0.m41932D0(str.length() * 3);
                int D02 = C8947m0.m41932D0(str.length());
                if (D02 == D0) {
                    int position2 = this.f44619e.position() + D02;
                    this.f44619e.position(position2);
                    m42042K0(str);
                    int position3 = this.f44619e.position();
                    this.f44619e.position(position);
                    mo37034y0(position3 - position2);
                    this.f44619e.position(position3);
                    return;
                }
                mo37034y0(C8881d4.m41668a(str));
                m42042K0(str);
            } catch (C8906g4 e) {
                this.f44619e.position(position);
                mo37030s(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C8950c((Throwable) e2);
            }
        }

        /* renamed from: n */
        public final void mo37025n(int i, C8942l2 l2Var) throws IOException {
            mo37001G(i, 2);
            mo37007M(l2Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public final void mo37026o(int i, C8942l2 l2Var, C8870c3 c3Var) throws IOException {
            mo37001G(i, 2);
            mo37029r(l2Var, c3Var);
        }

        /* renamed from: p */
        public final void mo37027p(int i, String str) throws IOException {
            mo37001G(i, 2);
            mo37024m0(str);
        }

        /* renamed from: q */
        public final void mo37028q(C8847a0 a0Var) throws IOException {
            mo37034y0(a0Var.size());
            a0Var.mo36802e(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public final void mo37029r(C8942l2 l2Var, C8870c3 c3Var) throws IOException {
            C8979q qVar = (C8979q) l2Var;
            int h = qVar.mo36898h();
            if (h == -1) {
                h = c3Var.mo36865h(qVar);
                qVar.mo36895e(h);
            }
            mo37034y0(h);
            c3Var.mo36864g(l2Var, this.f44611a);
        }

        /* renamed from: u */
        public final int mo37032u() {
            return this.f44619e.remaining();
        }

        /* renamed from: x0 */
        public final void mo37033x0(int i) throws IOException {
            if (i >= 0) {
                mo37034y0(i);
            } else {
                mo37006L((long) i);
            }
        }

        /* renamed from: y0 */
        public final void mo37034y0(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f44619e.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f44619e.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new C8950c((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.m0$e */
    static final class C8952e extends C8947m0 {

        /* renamed from: d */
        private final ByteBuffer f44621d;

        /* renamed from: e */
        private final ByteBuffer f44622e;

        /* renamed from: f */
        private final long f44623f;

        /* renamed from: g */
        private final long f44624g;

        /* renamed from: h */
        private final long f44625h;

        /* renamed from: i */
        private final long f44626i;

        /* renamed from: j */
        private long f44627j;

        C8952e(ByteBuffer byteBuffer) {
            super();
            this.f44621d = byteBuffer;
            this.f44622e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long o = C8859b4.m41575o(byteBuffer);
            this.f44623f = o;
            long position = ((long) byteBuffer.position()) + o;
            this.f44624g = position;
            long limit = o + ((long) byteBuffer.limit());
            this.f44625h = limit;
            this.f44626i = limit - 10;
            this.f44627j = position;
        }

        /* renamed from: K0 */
        private final void m42070K0(long j) {
            this.f44622e.position((int) (j - this.f44623f));
        }

        /* renamed from: A0 */
        public final void mo37000A0(int i) throws IOException {
            this.f44622e.putInt((int) (this.f44627j - this.f44623f), i);
            this.f44627j += 4;
        }

        /* renamed from: G */
        public final void mo37001G(int i, int i2) throws IOException {
            mo37034y0((i << 3) | i2);
        }

        /* renamed from: I */
        public final void mo37003I(int i, C8847a0 a0Var) throws IOException {
            mo37001G(1, 3);
            mo37012b0(2, i);
            mo37023m(3, a0Var);
            mo37001G(1, 4);
        }

        /* renamed from: J */
        public final void mo37004J(int i, C8942l2 l2Var) throws IOException {
            mo37001G(1, 3);
            mo37012b0(2, i);
            mo37025n(3, l2Var);
            mo37001G(1, 4);
        }

        /* renamed from: K */
        public final void mo37005K(int i, boolean z) throws IOException {
            mo37001G(i, 0);
            mo37016g(z ? (byte) 1 : 0);
        }

        /* renamed from: L */
        public final void mo37006L(long j) throws IOException {
            long j2;
            if (this.f44627j <= this.f44626i) {
                while (true) {
                    int i = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                    j2 = this.f44627j;
                    if (i == 0) {
                        break;
                    }
                    this.f44627j = j2 + 1;
                    C8859b4.m41563c(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                while (true) {
                    j2 = this.f44627j;
                    if (j2 >= this.f44625h) {
                        throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f44627j), Long.valueOf(this.f44625h), 1}));
                    } else if ((j & -128) == 0) {
                        break;
                    } else {
                        this.f44627j = j2 + 1;
                        C8859b4.m41563c(j2, (byte) ((((int) j) & 127) | 128));
                        j >>>= 7;
                    }
                }
            }
            this.f44627j = 1 + j2;
            C8859b4.m41563c(j2, (byte) ((int) j));
        }

        /* renamed from: M */
        public final void mo37007M(C8942l2 l2Var) throws IOException {
            mo37034y0(l2Var.mo36891a());
            l2Var.mo36893c(this);
        }

        /* renamed from: T */
        public final void mo37008T(int i, int i2) throws IOException {
            mo37001G(i, 0);
            mo37033x0(i2);
        }

        /* renamed from: U */
        public final void mo37009U(int i, long j) throws IOException {
            mo37001G(i, 1);
            mo37014c0(j);
        }

        /* renamed from: a */
        public final void mo37037a(byte[] bArr, int i, int i2) throws IOException {
            mo37013c(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo37011b() {
            this.f44621d.position((int) (this.f44627j - this.f44623f));
        }

        /* renamed from: b0 */
        public final void mo37012b0(int i, int i2) throws IOException {
            mo37001G(i, 0);
            mo37034y0(i2);
        }

        /* renamed from: c */
        public final void mo37013c(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.f44627j;
                if (this.f44625h - j >= j2) {
                    C8859b4.m41572l(bArr, (long) i, j2, j);
                    this.f44627j += j;
                    return;
                }
            }
            Objects.requireNonNull(bArr, "value");
            throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f44627j), Long.valueOf(this.f44625h), Integer.valueOf(i2)}));
        }

        /* renamed from: c0 */
        public final void mo37014c0(long j) throws IOException {
            this.f44622e.putLong((int) (this.f44627j - this.f44623f), j);
            this.f44627j += 8;
        }

        /* renamed from: g */
        public final void mo37016g(byte b) throws IOException {
            long j = this.f44627j;
            if (j < this.f44625h) {
                this.f44627j = 1 + j;
                C8859b4.m41563c(j, b);
                return;
            }
            throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f44627j), Long.valueOf(this.f44625h), 1}));
        }

        /* renamed from: i0 */
        public final void mo37019i0(int i, int i2) throws IOException {
            mo37001G(i, 5);
            mo37000A0(i2);
        }

        /* renamed from: l */
        public final void mo37022l(int i, long j) throws IOException {
            mo37001G(i, 0);
            mo37006L(j);
        }

        /* renamed from: m */
        public final void mo37023m(int i, C8847a0 a0Var) throws IOException {
            mo37001G(i, 2);
            mo37028q(a0Var);
        }

        /* renamed from: m0 */
        public final void mo37024m0(String str) throws IOException {
            long j = this.f44627j;
            try {
                int D0 = C8947m0.m41932D0(str.length() * 3);
                int D02 = C8947m0.m41932D0(str.length());
                if (D02 == D0) {
                    int i = ((int) (this.f44627j - this.f44623f)) + D02;
                    this.f44622e.position(i);
                    C8881d4.m41670c(str, this.f44622e);
                    int position = this.f44622e.position() - i;
                    mo37034y0(position);
                    this.f44627j += (long) position;
                    return;
                }
                int a = C8881d4.m41668a(str);
                mo37034y0(a);
                m42070K0(this.f44627j);
                C8881d4.m41670c(str, this.f44622e);
                this.f44627j += (long) a;
            } catch (C8906g4 e) {
                this.f44627j = j;
                m42070K0(j);
                mo37030s(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C8950c((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C8950c((Throwable) e3);
            }
        }

        /* renamed from: n */
        public final void mo37025n(int i, C8942l2 l2Var) throws IOException {
            mo37001G(i, 2);
            mo37007M(l2Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public final void mo37026o(int i, C8942l2 l2Var, C8870c3 c3Var) throws IOException {
            mo37001G(i, 2);
            mo37029r(l2Var, c3Var);
        }

        /* renamed from: p */
        public final void mo37027p(int i, String str) throws IOException {
            mo37001G(i, 2);
            mo37024m0(str);
        }

        /* renamed from: q */
        public final void mo37028q(C8847a0 a0Var) throws IOException {
            mo37034y0(a0Var.size());
            a0Var.mo36802e(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public final void mo37029r(C8942l2 l2Var, C8870c3 c3Var) throws IOException {
            C8979q qVar = (C8979q) l2Var;
            int h = qVar.mo36898h();
            if (h == -1) {
                h = c3Var.mo36865h(qVar);
                qVar.mo36895e(h);
            }
            mo37034y0(h);
            c3Var.mo36864g(l2Var, this.f44611a);
        }

        /* renamed from: u */
        public final int mo37032u() {
            return (int) (this.f44625h - this.f44627j);
        }

        /* renamed from: x0 */
        public final void mo37033x0(int i) throws IOException {
            if (i >= 0) {
                mo37034y0(i);
            } else {
                mo37006L((long) i);
            }
        }

        /* renamed from: y0 */
        public final void mo37034y0(int i) throws IOException {
            long j;
            if (this.f44627j <= this.f44626i) {
                while ((i & -128) != 0) {
                    long j2 = this.f44627j;
                    this.f44627j = j2 + 1;
                    C8859b4.m41563c(j2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                j = this.f44627j;
            } else {
                while (true) {
                    j = this.f44627j;
                    if (j >= this.f44625h) {
                        throw new C8950c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f44627j), Long.valueOf(this.f44625h), 1}));
                    } else if ((i & -128) == 0) {
                        break;
                    } else {
                        this.f44627j = j + 1;
                        C8859b4.m41563c(j, (byte) ((i & 127) | 128));
                        i >>>= 7;
                    }
                }
            }
            this.f44627j = 1 + j;
            C8859b4.m41563c(j, (byte) i);
        }
    }

    private C8947m0() {
    }

    /* renamed from: A */
    public static int m41926A(int i, C8995s1 s1Var) {
        return (m41928B0(1) << 1) + m41962n0(2, i) + m41952d(3, s1Var);
    }

    /* renamed from: B */
    static int m41927B(int i, C8942l2 l2Var, C8870c3 c3Var) {
        return m41928B0(i) + m41933E(l2Var, c3Var);
    }

    /* renamed from: B0 */
    public static int m41928B0(int i) {
        return m41932D0(i << 3);
    }

    /* renamed from: C */
    public static int m41929C(int i, String str) {
        return m41928B0(i) + m41965q0(str);
    }

    /* renamed from: C0 */
    public static int m41930C0(int i) {
        if (i >= 0) {
            return m41932D0(i);
        }
        return 10;
    }

    /* renamed from: D */
    public static int m41931D(C8847a0 a0Var) {
        int size = a0Var.size();
        return m41932D0(size) + size;
    }

    /* renamed from: D0 */
    public static int m41932D0(int i) {
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

    /* renamed from: E */
    static int m41933E(C8942l2 l2Var, C8870c3 c3Var) {
        C8979q qVar = (C8979q) l2Var;
        int h = qVar.mo36898h();
        if (h == -1) {
            h = c3Var.mo36865h(qVar);
            qVar.mo36895e(h);
        }
        return m41932D0(h) + h;
    }

    /* renamed from: E0 */
    public static int m41934E0(int i) {
        return m41932D0(m41939I0(i));
    }

    /* renamed from: F */
    public static int m41935F(boolean z) {
        return 1;
    }

    /* renamed from: F0 */
    public static int m41936F0(int i) {
        return 4;
    }

    /* renamed from: G0 */
    public static int m41937G0(int i) {
        return 4;
    }

    /* renamed from: H0 */
    public static int m41938H0(int i) {
        return m41930C0(i);
    }

    /* renamed from: I0 */
    private static int m41939I0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: J0 */
    public static int m41940J0(int i) {
        return m41932D0(i);
    }

    /* renamed from: N */
    public static int m41941N(int i, C8847a0 a0Var) {
        int B0 = m41928B0(i);
        int size = a0Var.size();
        return B0 + m41932D0(size) + size;
    }

    /* renamed from: O */
    public static int m41942O(int i, C8942l2 l2Var) {
        return m41928B0(i) + m41945R(l2Var);
    }

    @Deprecated
    /* renamed from: P */
    static int m41943P(int i, C8942l2 l2Var, C8870c3 c3Var) {
        int B0 = m41928B0(i) << 1;
        C8979q qVar = (C8979q) l2Var;
        int h = qVar.mo36898h();
        if (h == -1) {
            h = c3Var.mo36865h(qVar);
            qVar.mo36895e(h);
        }
        return B0 + h;
    }

    /* renamed from: Q */
    public static int m41944Q(int i, boolean z) {
        return m41928B0(i) + 1;
    }

    /* renamed from: R */
    public static int m41945R(C8942l2 l2Var) {
        int a = l2Var.mo36891a();
        return m41932D0(a) + a;
    }

    /* renamed from: S */
    public static C8947m0 m41946S(byte[] bArr) {
        return new C8948a(bArr, 0, bArr.length);
    }

    /* renamed from: W */
    public static int m41947W(int i, long j) {
        return m41928B0(i) + m41958h0(j);
    }

    /* renamed from: X */
    public static int m41948X(int i, C8847a0 a0Var) {
        return (m41928B0(1) << 1) + m41962n0(2, i) + m41941N(3, a0Var);
    }

    /* renamed from: Y */
    public static int m41949Y(int i, C8942l2 l2Var) {
        return (m41928B0(1) << 1) + m41962n0(2, i) + m41942O(3, l2Var);
    }

    @Deprecated
    /* renamed from: Z */
    public static int m41950Z(C8942l2 l2Var) {
        return l2Var.mo36891a();
    }

    /* renamed from: a0 */
    public static int m41951a0(byte[] bArr) {
        int length = bArr.length;
        return m41932D0(length) + length;
    }

    /* renamed from: d */
    public static int m41952d(int i, C8995s1 s1Var) {
        int B0 = m41928B0(i);
        int a = s1Var.mo37144a();
        return B0 + m41932D0(a) + a;
    }

    /* renamed from: d0 */
    public static int m41953d0(int i, long j) {
        return m41928B0(i) + m41958h0(j);
    }

    /* renamed from: e */
    public static int m41954e(C8995s1 s1Var) {
        int a = s1Var.mo37144a();
        return m41932D0(a) + a;
    }

    /* renamed from: e0 */
    public static int m41955e0(long j) {
        return m41958h0(j);
    }

    /* renamed from: f */
    public static C8947m0 m41956f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C8949b(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return C8859b4.m41585y() ? new C8952e(byteBuffer) : new C8951d(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    /* renamed from: g0 */
    public static int m41957g0(int i, long j) {
        return m41928B0(i) + m41958h0(m41969u0(j));
    }

    /* renamed from: h0 */
    public static int m41958h0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: j0 */
    public static int m41959j0(int i, int i2) {
        return m41928B0(i) + m41930C0(i2);
    }

    /* renamed from: k0 */
    public static int m41960k0(int i, long j) {
        return m41928B0(i) + 8;
    }

    /* renamed from: l0 */
    public static int m41961l0(long j) {
        return m41958h0(m41969u0(j));
    }

    /* renamed from: n0 */
    public static int m41962n0(int i, int i2) {
        return m41928B0(i) + m41932D0(i2);
    }

    /* renamed from: o0 */
    public static int m41963o0(int i, long j) {
        return m41928B0(i) + 8;
    }

    /* renamed from: p0 */
    public static int m41964p0(long j) {
        return 8;
    }

    /* renamed from: q0 */
    public static int m41965q0(String str) {
        int i;
        try {
            i = C8881d4.m41668a(str);
        } catch (C8906g4 unused) {
            i = str.getBytes(C8910h1.f44548a).length;
        }
        return m41932D0(i) + i;
    }

    /* renamed from: r0 */
    public static int m41966r0(int i, int i2) {
        return m41928B0(i) + m41932D0(m41939I0(i2));
    }

    /* renamed from: s0 */
    public static int m41967s0(long j) {
        return 8;
    }

    /* renamed from: t0 */
    public static int m41968t0(int i, int i2) {
        return m41928B0(i) + 4;
    }

    /* renamed from: u0 */
    private static long m41969u0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: v0 */
    public static int m41971v0(int i, int i2) {
        return m41928B0(i) + 4;
    }

    /* renamed from: w */
    public static int m41972w(double d) {
        return 8;
    }

    /* renamed from: w0 */
    public static int m41973w0(int i, int i2) {
        return m41928B0(i) + m41930C0(i2);
    }

    /* renamed from: x */
    public static int m41974x(float f) {
        return 4;
    }

    /* renamed from: y */
    public static int m41975y(int i, double d) {
        return m41928B0(i) + 8;
    }

    /* renamed from: z */
    public static int m41976z(int i, float f) {
        return m41928B0(i) + 4;
    }

    /* renamed from: A0 */
    public abstract void mo37000A0(int i) throws IOException;

    /* renamed from: G */
    public abstract void mo37001G(int i, int i2) throws IOException;

    /* renamed from: H */
    public final void mo37002H(int i, long j) throws IOException {
        mo37022l(i, m41969u0(j));
    }

    /* renamed from: I */
    public abstract void mo37003I(int i, C8847a0 a0Var) throws IOException;

    /* renamed from: J */
    public abstract void mo37004J(int i, C8942l2 l2Var) throws IOException;

    /* renamed from: K */
    public abstract void mo37005K(int i, boolean z) throws IOException;

    /* renamed from: L */
    public abstract void mo37006L(long j) throws IOException;

    /* renamed from: M */
    public abstract void mo37007M(C8942l2 l2Var) throws IOException;

    /* renamed from: T */
    public abstract void mo37008T(int i, int i2) throws IOException;

    /* renamed from: U */
    public abstract void mo37009U(int i, long j) throws IOException;

    /* renamed from: V */
    public final void mo37010V(long j) throws IOException {
        mo37006L(m41969u0(j));
    }

    /* renamed from: b */
    public abstract void mo37011b() throws IOException;

    /* renamed from: b0 */
    public abstract void mo37012b0(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo37013c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c0 */
    public abstract void mo37014c0(long j) throws IOException;

    /* renamed from: f0 */
    public final void mo37015f0(int i, int i2) throws IOException {
        mo37012b0(i, m41939I0(i2));
    }

    /* renamed from: g */
    public abstract void mo37016g(byte b) throws IOException;

    /* renamed from: h */
    public final void mo37017h(double d) throws IOException {
        mo37014c0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: i */
    public final void mo37018i(float f) throws IOException {
        mo37000A0(Float.floatToRawIntBits(f));
    }

    /* renamed from: i0 */
    public abstract void mo37019i0(int i, int i2) throws IOException;

    /* renamed from: j */
    public final void mo37020j(int i, double d) throws IOException {
        mo37009U(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: k */
    public final void mo37021k(int i, float f) throws IOException {
        mo37019i0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: l */
    public abstract void mo37022l(int i, long j) throws IOException;

    /* renamed from: m */
    public abstract void mo37023m(int i, C8847a0 a0Var) throws IOException;

    /* renamed from: m0 */
    public abstract void mo37024m0(String str) throws IOException;

    /* renamed from: n */
    public abstract void mo37025n(int i, C8942l2 l2Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo37026o(int i, C8942l2 l2Var, C8870c3 c3Var) throws IOException;

    /* renamed from: p */
    public abstract void mo37027p(int i, String str) throws IOException;

    /* renamed from: q */
    public abstract void mo37028q(C8847a0 a0Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract void mo37029r(C8942l2 l2Var, C8870c3 c3Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo37030s(String str, C8906g4 g4Var) throws IOException {
        f44609b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", g4Var);
        byte[] bytes = str.getBytes(C8910h1.f44548a);
        try {
            mo37034y0(bytes.length);
            mo37037a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C8950c((Throwable) e);
        } catch (C8950c e2) {
            throw e2;
        }
    }

    /* renamed from: t */
    public final void mo37031t(boolean z) throws IOException {
        mo37016g(z ? (byte) 1 : 0);
    }

    /* renamed from: u */
    public abstract int mo37032u();

    /* renamed from: x0 */
    public abstract void mo37033x0(int i) throws IOException;

    /* renamed from: y0 */
    public abstract void mo37034y0(int i) throws IOException;

    /* renamed from: z0 */
    public final void mo37035z0(int i) throws IOException {
        mo37034y0(m41939I0(i));
    }
}
