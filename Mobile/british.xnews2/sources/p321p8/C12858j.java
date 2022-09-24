package p321p8;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: p8.j */
/* compiled from: EofSensorInputStream */
public class C12858j extends InputStream implements C12857i {

    /* renamed from: b */
    protected InputStream f55520b;

    /* renamed from: c */
    private boolean f55521c;

    /* renamed from: d */
    private final C12859k f55522d;

    public C12858j(InputStream inputStream, C12859k kVar) {
        if (inputStream != null) {
            this.f55520b = inputStream;
            this.f55521c = false;
            this.f55522d = kVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped stream may not be null.");
    }

    public int available() throws IOException {
        if (!mo48002l()) {
            return 0;
        }
        try {
            return this.f55520b.available();
        } catch (IOException e) {
            mo47999e();
            throw e;
        }
    }

    public void close() throws IOException {
        this.f55521c = true;
        mo48000f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo47999e() throws IOException {
        InputStream inputStream = this.f55520b;
        if (inputStream != null) {
            boolean z = true;
            try {
                C12859k kVar = this.f55522d;
                if (kVar != null) {
                    z = kVar.mo47994q(inputStream);
                }
                if (z) {
                    this.f55520b.close();
                }
            } finally {
                this.f55520b = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo48000f() throws IOException {
        InputStream inputStream = this.f55520b;
        if (inputStream != null) {
            boolean z = true;
            try {
                C12859k kVar = this.f55522d;
                if (kVar != null) {
                    z = kVar.mo47993f(inputStream);
                }
                if (z) {
                    this.f55520b.close();
                }
            } finally {
                this.f55520b = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo48001k(int i) throws IOException {
        InputStream inputStream = this.f55520b;
        if (inputStream != null && i < 0) {
            boolean z = true;
            try {
                C12859k kVar = this.f55522d;
                if (kVar != null) {
                    z = kVar.mo47992e(inputStream);
                }
                if (z) {
                    this.f55520b.close();
                }
            } finally {
                this.f55520b = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo48002l() throws IOException {
        if (!this.f55521c) {
            return this.f55520b != null;
        }
        throw new IOException("Attempted read on closed stream.");
    }

    public int read() throws IOException {
        if (!mo48002l()) {
            return -1;
        }
        try {
            int read = this.f55520b.read();
            mo48001k(read);
            return read;
        } catch (IOException e) {
            mo47999e();
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!mo48002l()) {
            return -1;
        }
        try {
            int read = this.f55520b.read(bArr, i, i2);
            mo48001k(read);
            return read;
        } catch (IOException e) {
            mo47999e();
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        if (!mo48002l()) {
            return -1;
        }
        try {
            int read = this.f55520b.read(bArr);
            mo48001k(read);
            return read;
        } catch (IOException e) {
            mo47999e();
            throw e;
        }
    }
}
