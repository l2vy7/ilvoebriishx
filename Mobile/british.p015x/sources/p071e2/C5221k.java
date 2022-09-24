package p071e2;

import java.io.IOException;
import java.io.InputStream;
import p071e2.C5210e;
import p087h2.C5382b;
import p119n2.C5846w;

/* renamed from: e2.k */
/* compiled from: InputStreamRewinder */
public final class C5221k implements C5210e<InputStream> {

    /* renamed from: a */
    private final C5846w f22739a;

    /* renamed from: e2.k$a */
    /* compiled from: InputStreamRewinder */
    public static final class C5222a implements C5210e.C5211a<InputStream> {

        /* renamed from: a */
        private final C5382b f22740a;

        public C5222a(C5382b bVar) {
            this.f22740a = bVar;
        }

        /* renamed from: a */
        public Class<InputStream> mo21442a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public C5210e<InputStream> mo21443b(InputStream inputStream) {
            return new C5221k(inputStream, this.f22740a);
        }
    }

    public C5221k(InputStream inputStream, C5382b bVar) {
        C5846w wVar = new C5846w(inputStream, bVar);
        this.f22739a = wVar;
        wVar.mark(5242880);
    }

    /* renamed from: b */
    public void mo21441b() {
        this.f22739a.mo22747e();
    }

    /* renamed from: c */
    public void mo21457c() {
        this.f22739a.mo22746d();
    }

    /* renamed from: d */
    public InputStream mo21440a() throws IOException {
        this.f22739a.reset();
        return this.f22739a;
    }
}
