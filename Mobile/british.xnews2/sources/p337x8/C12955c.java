package p337x8;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p316k9.C12820a;

/* renamed from: x8.c */
/* compiled from: HttpMultipart */
public class C12955c {

    /* renamed from: f */
    private static final C12820a f55670f;

    /* renamed from: g */
    private static final C12820a f55671g;

    /* renamed from: h */
    private static final C12820a f55672h;

    /* renamed from: a */
    private final String f55673a;

    /* renamed from: b */
    private final Charset f55674b;

    /* renamed from: c */
    private final String f55675c;

    /* renamed from: d */
    private final List<C12953a> f55676d;

    /* renamed from: e */
    private final C12957d f55677e;

    /* renamed from: x8.c$a */
    /* compiled from: HttpMultipart */
    static /* synthetic */ class C12956a {

        /* renamed from: a */
        static final /* synthetic */ int[] f55678a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                x8.d[] r0 = p337x8.C12957d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55678a = r0
                x8.d r1 = p337x8.C12957d.STRICT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55678a     // Catch:{ NoSuchFieldError -> 0x001d }
                x8.d r1 = p337x8.C12957d.BROWSER_COMPATIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p337x8.C12955c.C12956a.<clinit>():void");
        }
    }

    static {
        Charset charset = C12958e.f55682a;
        f55670f = m54709c(charset, ": ");
        f55671g = m54709c(charset, "\r\n");
        f55672h = m54709c(charset, "--");
    }

    public C12955c(String str, Charset charset, String str2, C12957d dVar) {
        if (str == null) {
            throw new IllegalArgumentException("Multipart subtype may not be null");
        } else if (str2 != null) {
            this.f55673a = str;
            this.f55674b = charset == null ? C12958e.f55682a : charset;
            this.f55675c = str2;
            this.f55676d = new ArrayList();
            this.f55677e = dVar;
        } else {
            throw new IllegalArgumentException("Multipart boundary may not be null");
        }
    }

    /* renamed from: b */
    private void m54708b(C12957d dVar, OutputStream outputStream, boolean z) throws IOException {
        C12820a c = m54709c(this.f55674b, mo48138e());
        for (C12953a next : this.f55676d) {
            m54712i(f55672h, outputStream);
            m54712i(c, outputStream);
            m54712i(f55671g, outputStream);
            C12954b f = next.mo48130f();
            int i = C12956a.f55678a[dVar.ordinal()];
            if (i == 1) {
                Iterator<C12959f> it = f.iterator();
                while (it.hasNext()) {
                    m54713j(it.next(), outputStream);
                }
            } else if (i == 2) {
                m54714k(next.mo48130f().mo48133b("Content-Disposition"), this.f55674b, outputStream);
                if (next.mo48129e().mo48158f() != null) {
                    m54714k(next.mo48130f().mo48133b(RtspHeaders.CONTENT_TYPE), this.f55674b, outputStream);
                }
            }
            C12820a aVar = f55671g;
            m54712i(aVar, outputStream);
            if (z) {
                next.mo48129e().mo48154a(outputStream);
            }
            m54712i(aVar, outputStream);
        }
        C12820a aVar2 = f55672h;
        m54712i(aVar2, outputStream);
        m54712i(c, outputStream);
        m54712i(aVar2, outputStream);
        m54712i(f55671g, outputStream);
    }

    /* renamed from: c */
    private static C12820a m54709c(Charset charset, String str) {
        ByteBuffer encode = charset.encode(CharBuffer.wrap(str));
        C12820a aVar = new C12820a(encode.remaining());
        aVar.mo47953c(encode.array(), encode.position(), encode.remaining());
        return aVar;
    }

    /* renamed from: g */
    private static void m54710g(String str, OutputStream outputStream) throws IOException {
        m54712i(m54709c(C12958e.f55682a, str), outputStream);
    }

    /* renamed from: h */
    private static void m54711h(String str, Charset charset, OutputStream outputStream) throws IOException {
        m54712i(m54709c(charset, str), outputStream);
    }

    /* renamed from: i */
    private static void m54712i(C12820a aVar, OutputStream outputStream) throws IOException {
        outputStream.write(aVar.mo47955e(), 0, aVar.mo47961l());
    }

    /* renamed from: j */
    private static void m54713j(C12959f fVar, OutputStream outputStream) throws IOException {
        m54710g(fVar.mo48142b(), outputStream);
        m54712i(f55670f, outputStream);
        m54710g(fVar.mo48141a(), outputStream);
        m54712i(f55671g, outputStream);
    }

    /* renamed from: k */
    private static void m54714k(C12959f fVar, Charset charset, OutputStream outputStream) throws IOException {
        m54711h(fVar.mo48142b(), charset, outputStream);
        m54712i(f55670f, outputStream);
        m54711h(fVar.mo48141a(), charset, outputStream);
        m54712i(f55671g, outputStream);
    }

    /* renamed from: a */
    public void mo48136a(C12953a aVar) {
        if (aVar != null) {
            this.f55676d.add(aVar);
        }
    }

    /* renamed from: d */
    public List<C12953a> mo48137d() {
        return this.f55676d;
    }

    /* renamed from: e */
    public String mo48138e() {
        return this.f55675c;
    }

    /* renamed from: f */
    public long mo48139f() {
        long j = 0;
        for (C12953a e : this.f55676d) {
            long b = e.mo48129e().mo48155b();
            if (b < 0) {
                return -1;
            }
            j += b;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m54708b(this.f55677e, byteArrayOutputStream, false);
            return j + ((long) byteArrayOutputStream.toByteArray().length);
        } catch (IOException unused) {
            return -1;
        }
    }

    /* renamed from: l */
    public void mo48140l(OutputStream outputStream) throws IOException {
        m54708b(this.f55677e, outputStream, true);
    }
}
