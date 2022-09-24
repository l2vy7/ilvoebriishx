package p012b2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: b2.b */
/* compiled from: StrictLineReader */
class C1551b implements Closeable {

    /* renamed from: b */
    private final InputStream f6643b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Charset f6644c;

    /* renamed from: d */
    private byte[] f6645d;

    /* renamed from: e */
    private int f6646e;

    /* renamed from: f */
    private int f6647f;

    /* renamed from: b2.b$a */
    /* compiled from: StrictLineReader */
    class C1552a extends ByteArrayOutputStream {
        C1552a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C1551b.this.f6644c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C1551b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: d */
    private void m7972d() throws IOException {
        InputStream inputStream = this.f6643b;
        byte[] bArr = this.f6645d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f6646e = 0;
            this.f6647f = read;
            return;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        synchronized (this.f6643b) {
            if (this.f6645d != null) {
                this.f6645d = null;
                this.f6643b.close();
            }
        }
    }

    /* renamed from: e */
    public boolean mo7103e() {
        return this.f6647f == -1;
    }

    /* renamed from: f */
    public String mo7104f() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f6643b) {
            if (this.f6645d != null) {
                if (this.f6646e >= this.f6647f) {
                    m7972d();
                }
                for (int i3 = this.f6646e; i3 != this.f6647f; i3++) {
                    byte[] bArr2 = this.f6645d;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f6646e;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f6644c.name());
                                this.f6646e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f6644c.name());
                        this.f6646e = i3 + 1;
                        return str2;
                    }
                }
                C1552a aVar = new C1552a((this.f6647f - this.f6646e) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f6645d;
                    int i5 = this.f6646e;
                    aVar.write(bArr3, i5, this.f6647f - i5);
                    this.f6647f = -1;
                    m7972d();
                    i = this.f6646e;
                    while (true) {
                        if (i != this.f6647f) {
                            bArr = this.f6645d;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f6646e;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f6646e = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C1551b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C1553c.f6649a)) {
            this.f6643b = inputStream;
            this.f6644c = charset;
            this.f6645d = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
