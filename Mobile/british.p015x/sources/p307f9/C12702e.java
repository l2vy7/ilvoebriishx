package p307f9;

import java.io.IOException;
import java.io.InputStream;
import p308g8.C12716c;
import p308g8.C12721e0;
import p308g8.C12727k;
import p308g8.C12737u;
import p309g9.C12743a;
import p309g9.C12748f;
import p311h9.C12781t;
import p317k9.C12821b;
import p317k9.C12824e;

/* renamed from: f9.e */
/* compiled from: ChunkedInputStream */
public class C12702e extends InputStream {

    /* renamed from: b */
    private final C12748f f55372b;

    /* renamed from: c */
    private final C12821b f55373c;

    /* renamed from: d */
    private int f55374d;

    /* renamed from: e */
    private int f55375e;

    /* renamed from: f */
    private int f55376f;

    /* renamed from: g */
    private boolean f55377g = false;

    /* renamed from: h */
    private boolean f55378h = false;

    /* renamed from: i */
    private C12716c[] f55379i = new C12716c[0];

    public C12702e(C12748f fVar) {
        if (fVar != null) {
            this.f55372b = fVar;
            this.f55376f = 0;
            this.f55373c = new C12821b(16);
            this.f55374d = 1;
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    /* renamed from: c */
    private int m54037c() throws IOException {
        int i = this.f55374d;
        if (i != 1) {
            if (i == 3) {
                this.f55373c.mo47973j();
                if (this.f55372b.mo43655a(this.f55373c) == -1) {
                    return 0;
                }
                if (this.f55373c.mo47977o()) {
                    this.f55374d = 1;
                } else {
                    throw new C12737u("Unexpected content at the end of chunk");
                }
            } else {
                throw new IllegalStateException("Inconsistent codec state");
            }
        }
        this.f55373c.mo47973j();
        if (this.f55372b.mo43655a(this.f55373c) == -1) {
            return 0;
        }
        int m = this.f55373c.mo47975m(59);
        if (m < 0) {
            m = this.f55373c.mo47978p();
        }
        try {
            return Integer.parseInt(this.f55373c.mo47980r(0, m), 16);
        } catch (NumberFormatException unused) {
            throw new C12737u("Bad chunk header");
        }
    }

    /* renamed from: d */
    private void m54038d() throws IOException {
        int c = m54037c();
        this.f55375e = c;
        if (c >= 0) {
            this.f55374d = 2;
            this.f55376f = 0;
            if (c == 0) {
                this.f55377g = true;
                m54039e();
                return;
            }
            return;
        }
        throw new C12737u("Negative chunk size");
    }

    /* renamed from: e */
    private void m54039e() throws IOException {
        try {
            this.f55379i = C12698a.m54016c(this.f55372b, -1, -1, (C12781t) null);
        } catch (C12727k e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid footer: ");
            stringBuffer.append(e.getMessage());
            C12737u uVar = new C12737u(stringBuffer.toString());
            C12824e.m54376c(uVar, e);
            throw uVar;
        }
    }

    public int available() throws IOException {
        C12748f fVar = this.f55372b;
        if (fVar instanceof C12743a) {
            return Math.min(((C12743a) fVar).length(), this.f55375e - this.f55376f);
        }
        return 0;
    }

    public void close() throws IOException {
        if (!this.f55378h) {
            try {
                if (!this.f55377g) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.f55377g = true;
                this.f55378h = true;
            }
        }
    }

    public int read() throws IOException {
        if (this.f55378h) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f55377g) {
            return -1;
        } else {
            if (this.f55374d != 2) {
                m54038d();
                if (this.f55377g) {
                    return -1;
                }
            }
            int read = this.f55372b.read();
            if (read != -1) {
                int i = this.f55376f + 1;
                this.f55376f = i;
                if (i >= this.f55375e) {
                    this.f55374d = 3;
                }
            }
            return read;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f55378h) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f55377g) {
            return -1;
        } else {
            if (this.f55374d != 2) {
                m54038d();
                if (this.f55377g) {
                    return -1;
                }
            }
            int read = this.f55372b.read(bArr, i, Math.min(i2, this.f55375e - this.f55376f));
            if (read != -1) {
                int i3 = this.f55376f + read;
                this.f55376f = i3;
                if (i3 >= this.f55375e) {
                    this.f55374d = 3;
                }
                return read;
            }
            this.f55377g = true;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Truncated chunk ( expected size: ");
            stringBuffer.append(this.f55375e);
            stringBuffer.append("; actual size: ");
            stringBuffer.append(this.f55376f);
            stringBuffer.append(")");
            throw new C12721e0(stringBuffer.toString());
        }
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
