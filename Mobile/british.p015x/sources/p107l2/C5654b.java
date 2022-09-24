package p107l2;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p065d2.C5163h;
import p102k2.C5582g;
import p102k2.C5596n;
import p102k2.C5598o;
import p102k2.C5604r;

/* renamed from: l2.b */
/* compiled from: HttpUriLoader */
public class C5654b implements C5596n<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f24222b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C5596n<C5582g, InputStream> f24223a;

    /* renamed from: l2.b$a */
    /* compiled from: HttpUriLoader */
    public static class C5655a implements C5598o<Uri, InputStream> {
        /* renamed from: a */
        public C5596n<Uri, InputStream> mo22118a(C5604r rVar) {
            return new C5654b(rVar.mo22173d(C5582g.class, InputStream.class));
        }
    }

    public C5654b(C5596n<C5582g, InputStream> nVar) {
        this.f24223a = nVar;
    }

    /* renamed from: c */
    public C5596n.C5597a<InputStream> mo22113a(Uri uri, int i, int i2, C5163h hVar) {
        return this.f24223a.mo22113a(new C5582g(uri.toString()), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo22114b(Uri uri) {
        return f24222b.contains(uri.getScheme());
    }
}
