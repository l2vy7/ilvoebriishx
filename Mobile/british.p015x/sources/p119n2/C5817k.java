package p119n2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p004a3.C0065j;
import p087h2.C5382b;

/* renamed from: n2.k */
/* compiled from: DefaultImageHeaderParser */
public final class C5817k implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f24535a = "Exif\u0000\u0000".getBytes(Charset.forName(C6540C.UTF8_NAME));

    /* renamed from: b */
    private static final int[] f24536b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: n2.k$a */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C5818a implements C5820c {

        /* renamed from: a */
        private final ByteBuffer f24537a;

        C5818a(ByteBuffer byteBuffer) {
            this.f24537a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo22714a() throws C5820c.C5821a {
            return (mo22716c() << 8) | mo22716c();
        }

        /* renamed from: b */
        public int mo22715b(byte[] bArr, int i) {
            int min = Math.min(i, this.f24537a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f24537a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public short mo22716c() throws C5820c.C5821a {
            if (this.f24537a.remaining() >= 1) {
                return (short) (this.f24537a.get() & 255);
            }
            throw new C5820c.C5821a();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f24537a.remaining(), j);
            ByteBuffer byteBuffer = this.f24537a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: n2.k$b */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C5819b {

        /* renamed from: a */
        private final ByteBuffer f24538a;

        C5819b(byte[] bArr, int i) {
            this.f24538a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m25729c(int i, int i2) {
            return this.f24538a.remaining() - i >= i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public short mo22718a(int i) {
            if (m25729c(i, 2)) {
                return this.f24538a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo22719b(int i) {
            if (m25729c(i, 4)) {
                return this.f24538a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo22720d() {
            return this.f24538a.remaining();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo22721e(ByteOrder byteOrder) {
            this.f24538a.order(byteOrder);
        }
    }

    /* renamed from: n2.k$c */
    /* compiled from: DefaultImageHeaderParser */
    private interface C5820c {

        /* renamed from: n2.k$c$a */
        /* compiled from: DefaultImageHeaderParser */
        public static final class C5821a extends IOException {
            C5821a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo22714a() throws IOException;

        /* renamed from: b */
        int mo22715b(byte[] bArr, int i) throws IOException;

        /* renamed from: c */
        short mo22716c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: n2.k$d */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C5822d implements C5820c {

        /* renamed from: a */
        private final InputStream f24539a;

        C5822d(InputStream inputStream) {
            this.f24539a = inputStream;
        }

        /* renamed from: a */
        public int mo22714a() throws IOException {
            return (mo22716c() << 8) | mo22716c();
        }

        /* renamed from: b */
        public int mo22715b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f24539a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new C5820c.C5821a();
        }

        /* renamed from: c */
        public short mo22716c() throws IOException {
            int read = this.f24539a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new C5820c.C5821a();
        }

        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f24539a.skip(j2);
                if (skip <= 0) {
                    if (this.f24539a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: d */
    private static int m25715d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    private int m25716e(C5820c cVar, C5382b bVar) throws IOException {
        byte[] bArr;
        try {
            int a = cVar.mo22714a();
            if (!m25718g(a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a);
                }
                return -1;
            }
            int i = m25720i(cVar);
            if (i == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.mo21806d(i, byte[].class);
            int k = m25722k(cVar, bArr, i);
            bVar.put(bArr);
            return k;
        } catch (C5820c.C5821a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.put(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser.ImageType m25717f(p119n2.C5817k.C5820c r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.mo22714a()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo22716c()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo22716c()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo22716c()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.mo22714a()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo22714a()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.mo22714a()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo22714a()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo22716c()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo22716c()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p119n2.C5817k.m25717f(n2.k$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: g */
    private static boolean m25718g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: h */
    private boolean m25719h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f24535a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f24535a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private int m25720i(C5820c cVar) throws IOException {
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = cVar.mo22716c();
            if (c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + c2);
                }
                return -1;
            }
            c = cVar.mo22716c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = cVar.mo22714a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + c + ", wanted to skip: " + a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: j */
    private static int m25721j(C5819b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo22718a(6);
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo22721e(byteOrder);
        int b = bVar.mo22719b(10) + 6;
        short a2 = bVar.mo22718a(b);
        for (int i = 0; i < a2; i++) {
            int d = m25715d(b, i);
            short a3 = bVar.mo22718a(d);
            if (a3 == 274) {
                short a4 = bVar.mo22718a(d + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo22719b(d + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + a3 + " formatCode=" + a4 + " componentCount=" + b2);
                        }
                        int i2 = b2 + f24536b[a4];
                        if (i2 <= 4) {
                            int i3 = d + 8;
                            if (i3 < 0 || i3 > bVar.mo22720d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + a3);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo22720d()) {
                                return bVar.mo22718a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a3);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a4);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + a4);
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m25722k(C5820c cVar, byte[] bArr, int i) throws IOException {
        int b = cVar.mo22715b(bArr, i);
        if (b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + b);
            }
            return -1;
        } else if (m25719h(bArr, i)) {
            return m25721j(new C5819b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: a */
    public ImageHeaderParser.ImageType mo11173a(ByteBuffer byteBuffer) throws IOException {
        return m25717f(new C5818a((ByteBuffer) C0065j.m247d(byteBuffer)));
    }

    /* renamed from: b */
    public ImageHeaderParser.ImageType mo11174b(InputStream inputStream) throws IOException {
        return m25717f(new C5822d((InputStream) C0065j.m247d(inputStream)));
    }

    /* renamed from: c */
    public int mo11175c(InputStream inputStream, C5382b bVar) throws IOException {
        return m25716e(new C5822d((InputStream) C0065j.m247d(inputStream)), (C5382b) C0065j.m247d(bVar));
    }
}
