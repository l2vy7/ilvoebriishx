package p004a3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a3.h */
/* compiled from: MarkEnforcingInputStream */
public class C0063h extends FilterInputStream {

    /* renamed from: b */
    private int f187b = Integer.MIN_VALUE;

    public C0063h(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: c */
    private long m241c(long j) {
        int i = this.f187b;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    /* renamed from: d */
    private void m242d(long j) {
        int i = this.f187b;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f187b = (int) (((long) i) - j);
        }
    }

    public int available() throws IOException {
        int i = this.f187b;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f187b = i;
    }

    public int read() throws IOException {
        if (m241c(1) == -1) {
            return -1;
        }
        int read = super.read();
        m242d(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f187b = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long c = m241c(j);
        if (c == -1) {
            return 0;
        }
        long skip = super.skip(c);
        m242d(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int c = (int) m241c((long) i2);
        if (c == -1) {
            return -1;
        }
        int read = super.read(bArr, i, c);
        m242d((long) read);
        return read;
    }
}
