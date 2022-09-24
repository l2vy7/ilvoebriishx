package p272b9;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: b9.p */
/* compiled from: RedirectLocations */
public class C11197p {

    /* renamed from: a */
    private final Set<URI> f50288a = new HashSet();

    /* renamed from: b */
    private final List<URI> f50289b = new ArrayList();

    /* renamed from: a */
    public void mo43579a(URI uri) {
        this.f50288a.add(uri);
        this.f50289b.add(uri);
    }

    /* renamed from: b */
    public boolean mo43580b(URI uri) {
        return this.f50288a.contains(uri);
    }
}
