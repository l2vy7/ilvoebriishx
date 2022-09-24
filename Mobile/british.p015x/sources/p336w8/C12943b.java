package p336w8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: w8.b */
/* compiled from: BasicHttpEntity */
public class C12943b extends C12942a {

    /* renamed from: e */
    private InputStream f55651e;

    /* renamed from: f */
    private long f55652f = -1;

    /* renamed from: a */
    public void mo43576a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            InputStream k = mo43577k();
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = k.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        return;
                    }
                }
            } finally {
                k.close();
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    /* renamed from: b */
    public long mo47776b() {
        return this.f55652f;
    }

    /* renamed from: i */
    public boolean mo47778i() {
        return false;
    }

    /* renamed from: k */
    public InputStream mo43577k() throws IllegalStateException {
        InputStream inputStream = this.f55651e;
        if (inputStream != null) {
            return inputStream;
        }
        throw new IllegalStateException("Content has not been provided");
    }

    /* renamed from: m */
    public void mo48112m(InputStream inputStream) {
        this.f55651e = inputStream;
    }

    /* renamed from: n */
    public void mo48113n(long j) {
        this.f55652f = j;
    }

    /* renamed from: p */
    public boolean mo47781p() {
        return this.f55651e != null;
    }

    /* renamed from: s */
    public void mo43578s() throws IOException {
        InputStream inputStream = this.f55651e;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
