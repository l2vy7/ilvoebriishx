package p307f9;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.io.OutputStream;
import p309g9.C12743a;
import p309g9.C12747e;
import p309g9.C12749g;
import p313i9.C12790d;
import p313i9.C12791e;
import p317k9.C12820a;
import p317k9.C12821b;

/* renamed from: f9.d */
/* compiled from: AbstractSessionOutputBuffer */
public abstract class C12701d implements C12749g, C12743a {

    /* renamed from: g */
    private static final byte[] f55365g = {13, 10};

    /* renamed from: a */
    private OutputStream f55366a;

    /* renamed from: b */
    private C12820a f55367b;

    /* renamed from: c */
    private String f55368c = C6540C.ASCII_NAME;

    /* renamed from: d */
    private boolean f55369d = true;

    /* renamed from: e */
    private int f55370e = 512;

    /* renamed from: f */
    private C12707j f55371f;

    /* renamed from: a */
    public void mo43661a(String str) throws IOException {
        if (str != null) {
            if (str.length() > 0) {
                mo47718g(str.getBytes(this.f55368c));
            }
            mo47718g(f55365g);
        }
    }

    /* renamed from: b */
    public void mo43662b(C12821b bVar) throws IOException {
        if (bVar != null) {
            if (this.f55369d) {
                int i = 0;
                int p = bVar.mo47978p();
                while (p > 0) {
                    int min = Math.min(this.f55367b.mo47957g() - this.f55367b.mo47961l(), p);
                    if (min > 0) {
                        this.f55367b.mo47952b(bVar, i, min);
                    }
                    if (this.f55367b.mo47960k()) {
                        mo47716e();
                    }
                    i += min;
                    p -= min;
                }
            } else {
                mo47718g(bVar.toString().getBytes(this.f55368c));
            }
            mo47718g(f55365g);
        }
    }

    /* renamed from: c */
    public void mo43663c(int i) throws IOException {
        if (this.f55367b.mo47960k()) {
            mo47716e();
        }
        this.f55367b.mo47951a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C12707j mo47715d() {
        return new C12707j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo47716e() throws IOException {
        int l = this.f55367b.mo47961l();
        if (l > 0) {
            this.f55366a.write(this.f55367b.mo47955e(), 0, l);
            this.f55367b.mo47958h();
            this.f55371f.mo47744a((long) l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo47717f(OutputStream outputStream, int i, C12790d dVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (dVar != null) {
            this.f55366a = outputStream;
            this.f55367b = new C12820a(i);
            String a = C12791e.m54278a(dVar);
            this.f55368c = a;
            this.f55369d = a.equalsIgnoreCase(C6540C.ASCII_NAME) || this.f55368c.equalsIgnoreCase("ASCII");
            this.f55370e = dVar.mo47928b("http.connection.min-chunk-limit", 512);
            this.f55371f = mo47715d();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public void flush() throws IOException {
        mo47716e();
        this.f55366a.flush();
    }

    /* renamed from: g */
    public void mo47718g(byte[] bArr) throws IOException {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
        }
    }

    public C12747e getMetrics() {
        return this.f55371f;
    }

    public int length() {
        return this.f55367b.mo47961l();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            if (i2 > this.f55370e || i2 > this.f55367b.mo47957g()) {
                mo47716e();
                this.f55366a.write(bArr, i, i2);
                this.f55371f.mo47744a((long) i2);
                return;
            }
            if (i2 > this.f55367b.mo47957g() - this.f55367b.mo47961l()) {
                mo47716e();
            }
            this.f55367b.mo47953c(bArr, i, i2);
        }
    }
}
