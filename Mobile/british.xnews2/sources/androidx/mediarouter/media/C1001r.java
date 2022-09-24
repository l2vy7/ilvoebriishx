package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.mediarouter.media.r */
/* compiled from: MediaRouteSelector */
public final class C1001r {

    /* renamed from: c */
    public static final C1001r f4553c = new C1001r(new Bundle(), (List<String>) null);

    /* renamed from: a */
    private final Bundle f4554a;

    /* renamed from: b */
    List<String> f4555b;

    /* renamed from: androidx.mediarouter.media.r$a */
    /* compiled from: MediaRouteSelector */
    public static final class C1002a {

        /* renamed from: a */
        private ArrayList<String> f4556a;

        public C1002a() {
        }

        /* renamed from: a */
        public C1002a mo4698a(Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String b : collection) {
                        mo4699b(b);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("categories must not be null");
        }

        /* renamed from: b */
        public C1002a mo4699b(String str) {
            if (str != null) {
                if (this.f4556a == null) {
                    this.f4556a = new ArrayList<>();
                }
                if (!this.f4556a.contains(str)) {
                    this.f4556a.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        /* renamed from: c */
        public C1002a mo4700c(C1001r rVar) {
            if (rVar != null) {
                mo4698a(rVar.mo4691e());
                return this;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        /* renamed from: d */
        public C1001r mo4701d() {
            if (this.f4556a == null) {
                return C1001r.f4553c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.f4556a);
            return new C1001r(bundle, this.f4556a);
        }

        public C1002a(C1001r rVar) {
            if (rVar != null) {
                rVar.mo4690c();
                if (!rVar.f4555b.isEmpty()) {
                    this.f4556a = new ArrayList<>(rVar.f4555b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    C1001r(Bundle bundle, List<String> list) {
        this.f4554a = bundle;
        this.f4555b = list;
    }

    /* renamed from: d */
    public static C1001r m5118d(Bundle bundle) {
        if (bundle != null) {
            return new C1001r(bundle, (List<String>) null);
        }
        return null;
    }

    /* renamed from: a */
    public Bundle mo4688a() {
        return this.f4554a;
    }

    /* renamed from: b */
    public boolean mo4689b(C1001r rVar) {
        if (rVar == null) {
            return false;
        }
        mo4690c();
        rVar.mo4690c();
        return this.f4555b.containsAll(rVar.f4555b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4690c() {
        if (this.f4555b == null) {
            ArrayList<String> stringArrayList = this.f4554a.getStringArrayList("controlCategories");
            this.f4555b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f4555b = Collections.emptyList();
            }
        }
    }

    /* renamed from: e */
    public List<String> mo4691e() {
        mo4690c();
        return this.f4555b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1001r)) {
            return false;
        }
        C1001r rVar = (C1001r) obj;
        mo4690c();
        rVar.mo4690c();
        return this.f4555b.equals(rVar.f4555b);
    }

    /* renamed from: f */
    public boolean mo4693f() {
        mo4690c();
        return this.f4555b.isEmpty();
    }

    /* renamed from: g */
    public boolean mo4694g() {
        mo4690c();
        return !this.f4555b.contains((Object) null);
    }

    /* renamed from: h */
    public boolean mo4695h(List<IntentFilter> list) {
        if (list != null) {
            mo4690c();
            int size = this.f4555b.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory(this.f4555b.get(i2))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        mo4690c();
        return this.f4555b.hashCode();
    }

    public String toString() {
        return "MediaRouteSelector{ " + "controlCategories=" + Arrays.toString(mo4691e().toArray()) + " }";
    }
}
