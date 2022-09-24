package p153t2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C3319b;
import com.bumptech.glide.C3335j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: t2.k */
/* compiled from: RequestManagerFragment */
public class C6116k extends Fragment {

    /* renamed from: b */
    private final C6104a f25354b;

    /* renamed from: c */
    private final C6121m f25355c;

    /* renamed from: d */
    private final Set<C6116k> f25356d;

    /* renamed from: e */
    private C3335j f25357e;

    /* renamed from: f */
    private C6116k f25358f;

    /* renamed from: g */
    private Fragment f25359g;

    /* renamed from: t2.k$a */
    /* compiled from: RequestManagerFragment */
    private class C6117a implements C6121m {
        C6117a() {
        }

        /* renamed from: a */
        public Set<C3335j> mo23432a() {
            Set<C6116k> b = C6116k.this.mo23433b();
            HashSet hashSet = new HashSet(b.size());
            for (C6116k next : b) {
                if (next.mo23435e() != null) {
                    hashSet.add(next.mo23435e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C6116k.this + "}";
        }
    }

    public C6116k() {
        this(new C6104a());
    }

    /* renamed from: a */
    private void m26850a(C6116k kVar) {
        this.f25356d.add(kVar);
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m26851d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f25359g;
    }

    @TargetApi(17)
    /* renamed from: g */
    private boolean m26852g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    private void m26853h(Activity activity) {
        m26855l();
        C6116k h = C3319b.m11097c(activity).mo11098k().mo23449h(activity);
        this.f25358f = h;
        if (!equals(h)) {
            this.f25358f.m26850a(this);
        }
    }

    /* renamed from: i */
    private void m26854i(C6116k kVar) {
        this.f25356d.remove(kVar);
    }

    /* renamed from: l */
    private void m26855l() {
        C6116k kVar = this.f25358f;
        if (kVar != null) {
            kVar.m26854i(this);
            this.f25358f = null;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(17)
    /* renamed from: b */
    public Set<C6116k> mo23433b() {
        if (equals(this.f25358f)) {
            return Collections.unmodifiableSet(this.f25356d);
        }
        if (this.f25358f == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C6116k next : this.f25358f.mo23433b()) {
            if (m26852g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6104a mo23434c() {
        return this.f25354b;
    }

    /* renamed from: e */
    public C3335j mo23435e() {
        return this.f25357e;
    }

    /* renamed from: f */
    public C6121m mo23436f() {
        return this.f25355c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo23437j(Fragment fragment) {
        this.f25359g = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m26853h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo23438k(C3335j jVar) {
        this.f25357e = jVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m26853h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f25354b.mo23426c();
        m26855l();
    }

    public void onDetach() {
        super.onDetach();
        m26855l();
    }

    public void onStart() {
        super.onStart();
        this.f25354b.mo23427d();
    }

    public void onStop() {
        super.onStop();
        this.f25354b.mo23428e();
    }

    public String toString() {
        return super.toString() + "{parent=" + m26851d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    C6116k(C6104a aVar) {
        this.f25355c = new C6117a();
        this.f25356d = new HashSet();
        this.f25354b = aVar;
    }
}
