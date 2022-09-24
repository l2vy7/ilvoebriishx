package p307f9;

import java.io.IOException;
import java.io.InputStream;
import p309g9.C12743a;
import p309g9.C12748f;

/* renamed from: f9.g */
/* compiled from: ContentLengthInputStream */
public class C12704g extends InputStream {

    /* renamed from: b */
    private long f55385b;

    /* renamed from: c */
    private long f55386c = 0;

    /* renamed from: d */
    private boolean f55387d = false;

    /* renamed from: e */
    private C12748f f55388e = null;

    public C12704g(C12748f fVar, long j) {
        if (fVar == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (j >= 0) {
            this.f55388e = fVar;
            this.f55385b = j;
        } else {
            throw new IllegalArgumentException("Content length may not be negative");
        }
    }

    public int available() throws IOException {
        C12748f fVar = this.f55388e;
        if (fVar instanceof C12743a) {
            return Math.min(((C12743a) fVar).length(), (int) (this.f55385b - this.f55386c));
        }
        return 0;
    }

    public void close() throws IOException {
        if (!this.f55387d) {
            try {
                do {
                } while (read(new byte[2048]) >= 0);
            } finally {
                this.f55387d = true;
            }
        }
    }

    public int read() throws IOException {
        if (!this.f55387d) {
            long j = this.f55386c;
            if (j >= this.f55385b) {
                return -1;
            }
            this.f55386c = j + 1;
            return this.f55388e.read();
        }
        throw new IOException("Attempted read from closed stream.");
    }

    public long skip(long j) throws IOException {
        int read;
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.f55385b - this.f55386c);
        long j2 = 0;
        while (min > 0 && (read = read(bArr, 0, (int) Math.min(2048, min))) != -1) {
            long j3 = (long) read;
            j2 += j3;
            min -= j3;
        }
        return j2;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f55387d) {
            long j = this.f55386c;
            long j2 = this.f55385b;
            if (j >= j2) {
                return -1;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            int read = this.f55388e.read(bArr, i, i2);
            this.f55386c += (long) read;
            return read;
        }
        throw new IOException("Attempted read from closed stream.");
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
