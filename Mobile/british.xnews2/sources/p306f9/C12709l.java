package p306f9;

import java.io.IOException;
import java.io.OutputStream;
import p308g9.C12749g;

/* renamed from: f9.l */
/* compiled from: IdentityOutputStream */
public class C12709l extends OutputStream {

    /* renamed from: b */
    private final C12749g f55396b;

    /* renamed from: c */
    private boolean f55397c = false;

    public C12709l(C12749g gVar) {
        if (gVar != null) {
            this.f55396b = gVar;
            return;
        }
        throw new IllegalArgumentException("Session output buffer may not be null");
    }

    public void close() throws IOException {
        if (!this.f55397c) {
            this.f55397c = true;
            this.f55396b.flush();
        }
    }

    public void flush() throws IOException {
        this.f55396b.flush();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f55397c) {
            this.f55396b.write(bArr, i, i2);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) throws IOException {
        if (!this.f55397c) {
            this.f55396b.mo43663c(i);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
