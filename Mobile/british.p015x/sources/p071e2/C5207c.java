package p071e2;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.io.OutputStream;
import p087h2.C5382b;

/* renamed from: e2.c */
/* compiled from: BufferedOutputStream */
public final class C5207c extends OutputStream {

    /* renamed from: b */
    private final OutputStream f22720b;

    /* renamed from: c */
    private byte[] f22721c;

    /* renamed from: d */
    private C5382b f22722d;

    /* renamed from: e */
    private int f22723e;

    public C5207c(OutputStream outputStream, C5382b bVar) {
        this(outputStream, bVar, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    /* renamed from: c */
    private void m23645c() throws IOException {
        int i = this.f22723e;
        if (i > 0) {
            this.f22720b.write(this.f22721c, 0, i);
            this.f22723e = 0;
        }
    }

    /* renamed from: d */
    private void m23646d() throws IOException {
        if (this.f22723e == this.f22721c.length) {
            m23645c();
        }
    }

    /* renamed from: e */
    private void m23647e() {
        byte[] bArr = this.f22721c;
        if (bArr != null) {
            this.f22722d.put(bArr);
            this.f22721c = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f22720b.close();
            m23647e();
        } catch (Throwable th) {
            this.f22720b.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        m23645c();
        this.f22720b.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f22721c;
        int i2 = this.f22723e;
        this.f22723e = i2 + 1;
        bArr[i2] = (byte) i;
        m23646d();
    }

    C5207c(OutputStream outputStream, C5382b bVar, int i) {
        this.f22720b = outputStream;
        this.f22722d = bVar;
        this.f22721c = (byte[]) bVar.mo21806d(i, byte[].class);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f22723e;
            if (i6 != 0 || i4 < this.f22721c.length) {
                int min = Math.min(i4, this.f22721c.length - i6);
                System.arraycopy(bArr, i5, this.f22721c, this.f22723e, min);
                this.f22723e += min;
                i3 += min;
                m23646d();
            } else {
                this.f22720b.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
