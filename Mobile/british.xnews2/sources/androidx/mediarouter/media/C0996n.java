package androidx.mediarouter.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.mediarouter.media.n */
/* compiled from: MediaRouteProviderDescriptor */
public final class C0996n {

    /* renamed from: a */
    Bundle f4545a;

    /* renamed from: b */
    final List<C0983l> f4546b;

    /* renamed from: c */
    final boolean f4547c;

    C0996n(List<C0983l> list, boolean z) {
        this.f4546b = list == null ? Collections.emptyList() : list;
        this.f4547c = z;
    }

    /* renamed from: b */
    public static C0996n m5106b(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(C0983l.m5016e((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new C0996n(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    /* renamed from: a */
    public Bundle mo4677a() {
        Bundle bundle = this.f4545a;
        if (bundle != null) {
            return bundle;
        }
        this.f4545a = new Bundle();
        List<C0983l> list = this.f4546b;
        if (list != null && !list.isEmpty()) {
            int size = this.f4546b.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(this.f4546b.get(i).mo4602a());
            }
            this.f4545a.putParcelableArrayList("routes", arrayList);
        }
        this.f4545a.putBoolean("supportsDynamicGroupRoute", this.f4547c);
        return this.f4545a;
    }

    /* renamed from: c */
    public List<C0983l> mo4678c() {
        return this.f4546b;
    }

    /* renamed from: d */
    public boolean mo4679d() {
        int size = mo4678c().size();
        for (int i = 0; i < size; i++) {
            C0983l lVar = this.f4546b.get(i);
            if (lVar == null || !lVar.mo4626y()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo4680e() {
        return this.f4547c;
    }

    public String toString() {
        return "MediaRouteProviderDescriptor{ " + "routes=" + Arrays.toString(mo4678c().toArray()) + ", isValid=" + mo4679d() + " }";
    }

    /* renamed from: androidx.mediarouter.media.n$a */
    /* compiled from: MediaRouteProviderDescriptor */
    public static final class C0997a {

        /* renamed from: a */
        private List<C0983l> f4548a;

        /* renamed from: b */
        private boolean f4549b = false;

        public C0997a() {
        }

        /* renamed from: a */
        public C0997a mo4682a(C0983l lVar) {
            if (lVar != null) {
                List<C0983l> list = this.f4548a;
                if (list == null) {
                    this.f4548a = new ArrayList();
                } else if (list.contains(lVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                this.f4548a.add(lVar);
                return this;
            }
            throw new IllegalArgumentException("route must not be null");
        }

        /* renamed from: b */
        public C0997a mo4683b(Collection<C0983l> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (C0983l a : collection) {
                        mo4682a(a);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("routes must not be null");
        }

        /* renamed from: c */
        public C0996n mo4684c() {
            return new C0996n(this.f4548a, this.f4549b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0997a mo4685d(Collection<C0983l> collection) {
            if (collection == null || collection.isEmpty()) {
                this.f4548a = null;
            } else {
                this.f4548a = new ArrayList(collection);
            }
            return this;
        }

        /* renamed from: e */
        public C0997a mo4686e(boolean z) {
            this.f4549b = z;
            return this;
        }

        public C0997a(C0996n nVar) {
            if (nVar != null) {
                this.f4548a = nVar.f4546b;
                this.f4549b = nVar.f4547c;
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
