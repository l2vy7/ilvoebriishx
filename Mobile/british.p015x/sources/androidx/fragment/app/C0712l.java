package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0789q;
import androidx.lifecycle.C0790r;
import androidx.lifecycle.C0794s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.l */
/* compiled from: FragmentManagerViewModel */
final class C0712l extends C0789q {

    /* renamed from: j */
    private static final C0790r.C0791a f3626j = new C0713a();

    /* renamed from: c */
    private final HashMap<String, Fragment> f3627c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0712l> f3628d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C0794s> f3629e = new HashMap<>();

    /* renamed from: f */
    private final boolean f3630f;

    /* renamed from: g */
    private boolean f3631g = false;

    /* renamed from: h */
    private boolean f3632h = false;

    /* renamed from: i */
    private boolean f3633i = false;

    /* renamed from: androidx.fragment.app.l$a */
    /* compiled from: FragmentManagerViewModel */
    class C0713a implements C0790r.C0791a {
        C0713a() {
        }

        /* renamed from: a */
        public <T extends C0789q> T mo3803a(Class<T> cls) {
            return new C0712l(true);
        }
    }

    C0712l(boolean z) {
        this.f3630f = z;
    }

    /* renamed from: i */
    static C0712l m4016i(C0794s sVar) {
        return (C0712l) new C0790r(sVar, f3626j).mo4024a(C0712l.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3789d() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3631g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3790e(Fragment fragment) {
        if (this.f3633i) {
            if (FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f3627c.containsKey(fragment.f3368g)) {
            this.f3627c.put(fragment.f3368g, fragment);
            if (FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0712l.class != obj.getClass()) {
            return false;
        }
        C0712l lVar = (C0712l) obj;
        if (!this.f3627c.equals(lVar.f3627c) || !this.f3628d.equals(lVar.f3628d) || !this.f3629e.equals(lVar.f3629e)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3792f(Fragment fragment) {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0712l lVar = this.f3628d.get(fragment.f3368g);
        if (lVar != null) {
            lVar.mo3789d();
            this.f3628d.remove(fragment.f3368g);
        }
        C0794s sVar = this.f3629e.get(fragment.f3368g);
        if (sVar != null) {
            sVar.mo4028a();
            this.f3629e.remove(fragment.f3368g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3793g(String str) {
        return this.f3627c.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0712l mo3794h(Fragment fragment) {
        C0712l lVar = this.f3628d.get(fragment.f3368g);
        if (lVar != null) {
            return lVar;
        }
        C0712l lVar2 = new C0712l(this.f3630f);
        this.f3628d.put(fragment.f3368g, lVar2);
        return lVar2;
    }

    public int hashCode() {
        return (((this.f3627c.hashCode() * 31) + this.f3628d.hashCode()) * 31) + this.f3629e.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection<Fragment> mo3796j() {
        return new ArrayList(this.f3627c.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0794s mo3797k(Fragment fragment) {
        C0794s sVar = this.f3629e.get(fragment.f3368g);
        if (sVar != null) {
            return sVar;
        }
        C0794s sVar2 = new C0794s();
        this.f3629e.put(fragment.f3368g, sVar2);
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo3798l() {
        return this.f3631g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3799m(Fragment fragment) {
        if (!this.f3633i) {
            if ((this.f3627c.remove(fragment.f3368g) != null) && FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (FragmentManager.m3729F0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3800n(boolean z) {
        this.f3633i = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo3801o(Fragment fragment) {
        if (!this.f3627c.containsKey(fragment.f3368g)) {
            return true;
        }
        if (this.f3630f) {
            return this.f3631g;
        }
        return !this.f3632h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3627c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3628d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3629e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
