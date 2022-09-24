package p307f9;

import java.io.IOException;
import java.io.OutputStream;
import p309g9.C12749g;

/* renamed from: f9.f */
/* compiled from: ChunkedOutputStream */
public class C12703f extends OutputStream {

    /* renamed from: b */
    private final C12749g f55380b;

    /* renamed from: c */
    private byte[] f55381c;

    /* renamed from: d */
    private int f55382d;

    /* renamed from: e */
    private boolean f55383e;

    /* renamed from: f */
    private boolean f55384f;

    public C12703f(C12749g gVar, int i) throws IOException {
        this.f55382d = 0;
        this.f55383e = false;
        this.f55384f = false;
        this.f55381c = new byte[i];
        this.f55380b = gVar;
    }

    /* renamed from: c */
    public void mo47724c() throws IOException {
        if (!this.f55383e) {
            mo47726d();
            mo47728f();
            this.f55383e = true;
        }
    }

    public void close() throws IOException {
        if (!this.f55384f) {
            this.f55384f = true;
            mo47724c();
            this.f55380b.flush();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo47726d() throws IOException {
        int i = this.f55382d;
        if (i > 0) {
            this.f55380b.mo43661a(Integer.toHexString(i));
            this.f55380b.write(this.f55381c, 0, this.f55382d);
            this.f55380b.mo43661a("");
            this.f55382d = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo47727e(byte[] bArr, int i, int i2) throws IOException {
        this.f55380b.mo43661a(Integer.toHexString(this.f55382d + i2));
        this.f55380b.write(this.f55381c, 0, this.f55382d);
        this.f55380b.write(bArr, i, i2);
        this.f55380b.mo43661a("");
        this.f55382d = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo47728f() throws IOException {
        this.f55380b.mo43661a(SessionDescription.SUPPORTED_SDP_VERSION);
        this.f55380b.mo43661a("");
    }

    public void flush() throws IOException {
        mo47726d();
        this.f55380b.flush();
    }

    public void write(int i) throws IOException {
        if (!this.f55384f) {
            byte[] bArr = this.f55381c;
            int i2 = this.f55382d;
            bArr[i2] = (byte) i;
            int i3 = i2 + 1;
            this.f55382d = i3;
            if (i3 == bArr.length) {
                mo47726d();
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public C12703f(C12749g gVar) throws IOException {
        this(gVar, 2048);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f55384f) {
            byte[] bArr2 = this.f55381c;
            int length = bArr2.length;
            int i3 = this.f55382d;
            if (i2 >= length - i3) {
                mo47727e(bArr, i, i2);
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f55382d += i2;
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
