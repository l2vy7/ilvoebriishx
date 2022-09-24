package p336w8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p308g8.C12716c;
import p308g8.C12725i;

/* renamed from: w8.e */
/* compiled from: HttpEntityWrapper */
public class C12946e implements C12725i {

    /* renamed from: b */
    protected C12725i f55654b;

    public C12946e(C12725i iVar) {
        if (iVar != null) {
            this.f55654b = iVar;
            return;
        }
        throw new IllegalArgumentException("wrapped entity must not be null");
    }

    /* renamed from: a */
    public void mo43576a(OutputStream outputStream) throws IOException {
        this.f55654b.mo43576a(outputStream);
    }

    /* renamed from: b */
    public long mo47776b() {
        return this.f55654b.mo47776b();
    }

    public C12716c getContentType() {
        return this.f55654b.getContentType();
    }

    /* renamed from: i */
    public boolean mo47778i() {
        return this.f55654b.mo47778i();
    }

    /* renamed from: k */
    public InputStream mo43577k() throws IOException {
        return this.f55654b.mo43577k();
    }

    /* renamed from: l */
    public C12716c mo47779l() {
        return this.f55654b.mo47779l();
    }

    /* renamed from: o */
    public boolean mo47780o() {
        return this.f55654b.mo47780o();
    }

    /* renamed from: p */
    public boolean mo47781p() {
        return this.f55654b.mo47781p();
    }

    /* renamed from: s */
    public void mo43578s() throws IOException {
        this.f55654b.mo43578s();
    }
}
