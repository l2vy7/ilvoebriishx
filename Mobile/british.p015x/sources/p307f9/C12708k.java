package p307f9;

import java.io.IOException;
import java.io.InputStream;
import p309g9.C12743a;
import p309g9.C12748f;

/* renamed from: f9.k */
/* compiled from: IdentityInputStream */
public class C12708k extends InputStream {

    /* renamed from: b */
    private final C12748f f55394b;

    /* renamed from: c */
    private boolean f55395c = false;

    public C12708k(C12748f fVar) {
        if (fVar != null) {
            this.f55394b = fVar;
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    public int available() throws IOException {
        C12748f fVar = this.f55394b;
        if (fVar instanceof C12743a) {
            return ((C12743a) fVar).length();
        }
        return 0;
    }

    public void close() throws IOException {
        this.f55395c = true;
    }

    public int read() throws IOException {
        if (this.f55395c) {
            return -1;
        }
        return this.f55394b.read();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f55395c) {
            return -1;
        }
        return this.f55394b.read(bArr, i, i2);
    }
}
