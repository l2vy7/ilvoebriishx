package p336w8;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p308g8.C12725i;
import p317k9.C12823d;

/* renamed from: w8.c */
/* compiled from: BufferedHttpEntity */
public class C12944c extends C12946e {

    /* renamed from: c */
    private final byte[] f55653c;

    public C12944c(C12725i iVar) throws IOException {
        super(iVar);
        if (!iVar.mo47778i() || iVar.mo47776b() < 0) {
            this.f55653c = C12823d.m54371c(iVar);
        } else {
            this.f55653c = null;
        }
    }

    /* renamed from: a */
    public void mo43576a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            byte[] bArr = this.f55653c;
            if (bArr != null) {
                outputStream.write(bArr);
            } else {
                this.f55654b.mo43576a(outputStream);
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    /* renamed from: b */
    public long mo47776b() {
        byte[] bArr = this.f55653c;
        if (bArr != null) {
            return (long) bArr.length;
        }
        return this.f55654b.mo47776b();
    }

    /* renamed from: i */
    public boolean mo47778i() {
        return true;
    }

    /* renamed from: k */
    public InputStream mo43577k() throws IOException {
        if (this.f55653c != null) {
            return new ByteArrayInputStream(this.f55653c);
        }
        return this.f55654b.mo43577k();
    }

    /* renamed from: o */
    public boolean mo47780o() {
        return this.f55653c == null && this.f55654b.mo47780o();
    }

    /* renamed from: p */
    public boolean mo47781p() {
        return this.f55653c == null && this.f55654b.mo47781p();
    }
}
