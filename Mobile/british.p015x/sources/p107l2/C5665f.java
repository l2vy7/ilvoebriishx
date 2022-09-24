package p107l2;

import java.io.InputStream;
import java.net.URL;
import p065d2.C5163h;
import p102k2.C5582g;
import p102k2.C5596n;
import p102k2.C5598o;
import p102k2.C5604r;

/* renamed from: l2.f */
/* compiled from: UrlLoader */
public class C5665f implements C5596n<URL, InputStream> {

    /* renamed from: a */
    private final C5596n<C5582g, InputStream> f24245a;

    /* renamed from: l2.f$a */
    /* compiled from: UrlLoader */
    public static class C5666a implements C5598o<URL, InputStream> {
        /* renamed from: a */
        public C5596n<URL, InputStream> mo22118a(C5604r rVar) {
            return new C5665f(rVar.mo22173d(C5582g.class, InputStream.class));
        }
    }

    public C5665f(C5596n<C5582g, InputStream> nVar) {
        this.f24245a = nVar;
    }

    /* renamed from: c */
    public C5596n.C5597a<InputStream> mo22113a(URL url, int i, int i2, C5163h hVar) {
        return this.f24245a.mo22113a(new C5582g(url), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo22114b(URL url) {
        return true;
    }
}
