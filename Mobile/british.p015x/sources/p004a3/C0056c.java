package p004a3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a3.c */
/* compiled from: ContentLengthInputStream */
public final class C0056c extends FilterInputStream {

    /* renamed from: b */
    private final long f174b;

    /* renamed from: c */
    private int f175c;

    private C0056c(InputStream inputStream, long j) {
        super(inputStream);
        this.f174b = j;
    }

    /* renamed from: c */
    private int m222c(int i) throws IOException {
        if (i >= 0) {
            this.f175c += i;
        } else if (this.f174b - ((long) this.f175c) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f174b + ", but read: " + this.f175c);
        }
        return i;
    }

    /* renamed from: d */
    public static InputStream m223d(InputStream inputStream, long j) {
        return new C0056c(inputStream, j);
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f174b - ((long) this.f175c), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m222c(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m222c(super.read(bArr, i, i2));
    }
}
