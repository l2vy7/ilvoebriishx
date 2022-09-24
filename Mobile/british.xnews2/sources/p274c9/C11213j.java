package p274c9;

import java.io.IOException;
import p308g9.C12747e;
import p308g9.C12749g;
import p316k9.C12821b;

/* renamed from: c9.j */
/* compiled from: LoggingSessionOutputBuffer */
public class C11213j implements C12749g {

    /* renamed from: a */
    private final C12749g f50335a;

    /* renamed from: b */
    private final C11219m f50336b;

    /* renamed from: c */
    private final String f50337c;

    public C11213j(C12749g gVar, C11219m mVar, String str) {
        this.f50335a = gVar;
        this.f50336b = mVar;
        this.f50337c = str == null ? "ASCII" : str;
    }

    /* renamed from: a */
    public void mo43661a(String str) throws IOException {
        this.f50335a.mo43661a(str);
        if (this.f50336b.mo43680a()) {
            this.f50336b.mo43685f((str + "\r\n").getBytes(this.f50337c));
        }
    }

    /* renamed from: b */
    public void mo43662b(C12821b bVar) throws IOException {
        this.f50335a.mo43662b(bVar);
        if (this.f50336b.mo43680a()) {
            String str = new String(bVar.mo47971h(), 0, bVar.mo47978p());
            this.f50336b.mo43685f((str + "\r\n").getBytes(this.f50337c));
        }
    }

    /* renamed from: c */
    public void mo43663c(int i) throws IOException {
        this.f50335a.mo43663c(i);
        if (this.f50336b.mo43680a()) {
            this.f50336b.mo43684e(i);
        }
    }

    public void flush() throws IOException {
        this.f50335a.flush();
    }

    public C12747e getMetrics() {
        return this.f50335a.getMetrics();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f50335a.write(bArr, i, i2);
        if (this.f50336b.mo43680a()) {
            this.f50336b.mo43686g(bArr, i, i2);
        }
    }
}
