package p337x8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Random;
import p307g8.C12716c;
import p307g8.C12725i;
import p310h9.C12763b;
import p339y8.C12979c;

/* renamed from: x8.g */
/* compiled from: MultipartEntity */
public class C12960g implements C12725i {

    /* renamed from: f */
    private static final char[] f55685f = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: b */
    private final C12955c f55686b;

    /* renamed from: c */
    private final C12716c f55687c;

    /* renamed from: d */
    private long f55688d;

    /* renamed from: e */
    private volatile boolean f55689e;

    public C12960g(C12957d dVar, String str, Charset charset) {
        str = str == null ? mo48146e() : str;
        this.f55686b = new C12955c("form-data", charset, str, dVar == null ? C12957d.STRICT : dVar);
        this.f55687c = new C12763b(RtspHeaders.CONTENT_TYPE, mo48147f(str, charset));
        this.f55689e = true;
    }

    /* renamed from: a */
    public void mo43576a(OutputStream outputStream) throws IOException {
        this.f55686b.mo48140l(outputStream);
    }

    /* renamed from: b */
    public long mo47776b() {
        if (this.f55689e) {
            this.f55688d = this.f55686b.mo48139f();
            this.f55689e = false;
        }
        return this.f55688d;
    }

    /* renamed from: c */
    public void mo48144c(String str, C12979c cVar) {
        mo48145d(new C12953a(str, cVar));
    }

    /* renamed from: d */
    public void mo48145d(C12953a aVar) {
        this.f55686b.mo48136a(aVar);
        this.f55689e = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo48146e() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int nextInt = random.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            char[] cArr = f55685f;
            sb.append(cArr[random.nextInt(cArr.length)]);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo48147f(String str, Charset charset) {
        StringBuilder sb = new StringBuilder();
        sb.append("multipart/form-data; boundary=");
        sb.append(str);
        if (charset != null) {
            sb.append("; charset=");
            sb.append(charset.name());
        }
        return sb.toString();
    }

    public C12716c getContentType() {
        return this.f55687c;
    }

    /* renamed from: i */
    public boolean mo47778i() {
        for (C12953a e : this.f55686b.mo48137d()) {
            if (e.mo48129e().mo48155b() < 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public InputStream mo43577k() throws IOException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    /* renamed from: l */
    public C12716c mo47779l() {
        return null;
    }

    /* renamed from: o */
    public boolean mo47780o() {
        return !mo47778i();
    }

    /* renamed from: p */
    public boolean mo47781p() {
        return !mo47778i();
    }

    /* renamed from: s */
    public void mo43578s() throws IOException, UnsupportedOperationException {
        if (mo47781p()) {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    public C12960g(C12957d dVar) {
        this(dVar, (String) null, (Charset) null);
    }

    public C12960g() {
        this(C12957d.STRICT, (String) null, (Charset) null);
    }
}
