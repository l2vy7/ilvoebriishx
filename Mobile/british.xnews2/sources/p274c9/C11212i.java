package p274c9;

import java.io.IOException;
import p308g9.C12744b;
import p308g9.C12747e;
import p308g9.C12748f;
import p316k9.C12821b;

/* renamed from: c9.i */
/* compiled from: LoggingSessionInputBuffer */
public class C11212i implements C12748f, C12744b {

    /* renamed from: a */
    private final C12748f f50331a;

    /* renamed from: b */
    private final C12744b f50332b;

    /* renamed from: c */
    private final C11219m f50333c;

    /* renamed from: d */
    private final String f50334d;

    public C11212i(C12748f fVar, C11219m mVar, String str) {
        this.f50331a = fVar;
        this.f50332b = fVar instanceof C12744b ? (C12744b) fVar : null;
        this.f50333c = mVar;
        this.f50334d = str == null ? "ASCII" : str;
    }

    /* renamed from: a */
    public int mo43655a(C12821b bVar) throws IOException {
        int a = this.f50331a.mo43655a(bVar);
        if (this.f50333c.mo43680a() && a >= 0) {
            String str = new String(bVar.mo47971h(), bVar.mo47978p() - a, a);
            this.f50333c.mo43682c((str + "\r\n").getBytes(this.f50334d));
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo43656b() {
        C12744b bVar = this.f50332b;
        if (bVar != null) {
            return bVar.mo43656b();
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo43657c(int i) throws IOException {
        return this.f50331a.mo43657c(i);
    }

    public C12747e getMetrics() {
        return this.f50331a.getMetrics();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f50331a.read(bArr, i, i2);
        if (this.f50333c.mo43680a() && read > 0) {
            this.f50333c.mo43683d(bArr, i, read);
        }
        return read;
    }

    public int read() throws IOException {
        int read = this.f50331a.read();
        if (this.f50333c.mo43680a() && read != -1) {
            this.f50333c.mo43681b(read);
        }
        return read;
    }
}
