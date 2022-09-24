package p101k2;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p064d2.C5163h;
import p101k2.C5596n;

/* renamed from: k2.x */
/* compiled from: UrlUriLoader */
public class C5626x<Data> implements C5596n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f24168b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C5596n<C5582g, Data> f24169a;

    /* renamed from: k2.x$a */
    /* compiled from: UrlUriLoader */
    public static class C5627a implements C5598o<Uri, InputStream> {
        /* renamed from: a */
        public C5596n<Uri, InputStream> mo22118a(C5604r rVar) {
            return new C5626x(rVar.mo22173d(C5582g.class, InputStream.class));
        }
    }

    public C5626x(C5596n<C5582g, Data> nVar) {
        this.f24169a = nVar;
    }

    /* renamed from: c */
    public C5596n.C5597a<Data> mo22113a(Uri uri, int i, int i2, C5163h hVar) {
        return this.f24169a.mo22113a(new C5582g(uri.toString()), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo22114b(Uri uri) {
        return f24168b.contains(uri.getScheme());
    }
}
