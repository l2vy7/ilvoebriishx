package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.work.d */
/* compiled from: ContentUriTriggers */
public final class C1425d {

    /* renamed from: a */
    private final Set<C1426a> f6327a = new HashSet();

    /* renamed from: androidx.work.d$a */
    /* compiled from: ContentUriTriggers */
    public static final class C1426a {

        /* renamed from: a */
        private final Uri f6328a;

        /* renamed from: b */
        private final boolean f6329b;

        C1426a(Uri uri, boolean z) {
            this.f6328a = uri;
            this.f6329b = z;
        }

        /* renamed from: a */
        public Uri mo6895a() {
            return this.f6328a;
        }

        /* renamed from: b */
        public boolean mo6896b() {
            return this.f6329b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1426a.class != obj.getClass()) {
                return false;
            }
            C1426a aVar = (C1426a) obj;
            if (this.f6329b != aVar.f6329b || !this.f6328a.equals(aVar.f6328a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f6328a.hashCode() * 31) + (this.f6329b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void mo6890a(Uri uri, boolean z) {
        this.f6327a.add(new C1426a(uri, z));
    }

    /* renamed from: b */
    public Set<C1426a> mo6891b() {
        return this.f6327a;
    }

    /* renamed from: c */
    public int mo6892c() {
        return this.f6327a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1425d.class != obj.getClass()) {
            return false;
        }
        return this.f6327a.equals(((C1425d) obj).f6327a);
    }

    public int hashCode() {
        return this.f6327a.hashCode();
    }
}
