package p071e2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: e2.g */
/* compiled from: ExifOrientationStream */
public final class C5215g extends FilterInputStream {

    /* renamed from: d */
    private static final byte[] f22727d;

    /* renamed from: e */
    private static final int f22728e;

    /* renamed from: f */
    private static final int f22729f;

    /* renamed from: b */
    private final byte f22730b;

    /* renamed from: c */
    private int f22731c;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f22727d = bArr;
        int length = bArr.length;
        f22728e = length;
        f22729f = length + 2;
    }

    public C5215g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f22730b = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f22731c;
        if (i3 < 2 || i3 > (i2 = f22729f)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f22730b;
        } else {
            i = f22727d[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f22731c++;
        }
        return i;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f22731c = (int) (((long) this.f22731c) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f22731c;
        int i5 = f22729f;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f22730b;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f22727d, this.f22731c - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f22731c += i3;
        }
        return i3;
    }
}
