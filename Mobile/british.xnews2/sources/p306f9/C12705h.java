package p306f9;

import java.io.IOException;
import java.io.OutputStream;
import p308g9.C12749g;

/* renamed from: f9.h */
/* compiled from: ContentLengthOutputStream */
public class C12705h extends OutputStream {

    /* renamed from: b */
    private final C12749g f55389b;

    /* renamed from: c */
    private final long f55390c;

    /* renamed from: d */
    private long f55391d = 0;

    /* renamed from: e */
    private boolean f55392e = false;

    public C12705h(C12749g gVar, long j) {
        if (gVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        } else if (j >= 0) {
            this.f55389b = gVar;
            this.f55390c = j;
        } else {
            throw new IllegalArgumentException("Content length may not be negative");
        }
    }

    public void close() throws IOException {
        if (!this.f55392e) {
            this.f55392e = true;
            this.f55389b.flush();
        }
    }

    public void flush() throws IOException {
        this.f55389b.flush();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f55392e) {
            long j = this.f55391d;
            long j2 = this.f55390c;
            if (j < j2) {
                long j3 = j2 - j;
                if (((long) i2) > j3) {
                    i2 = (int) j3;
                }
                this.f55389b.write(bArr, i, i2);
                this.f55391d += (long) i2;
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) throws IOException {
        if (this.f55392e) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.f55391d < this.f55390c) {
            this.f55389b.mo43663c(i);
            this.f55391d++;
        }
    }
}
