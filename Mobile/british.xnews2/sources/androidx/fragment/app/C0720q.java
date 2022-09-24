package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C0769d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.q */
/* compiled from: FragmentTransaction */
public abstract class C0720q {

    /* renamed from: a */
    private final C0706g f3648a;

    /* renamed from: b */
    private final ClassLoader f3649b;

    /* renamed from: c */
    ArrayList<C0721a> f3650c = new ArrayList<>();

    /* renamed from: d */
    int f3651d;

    /* renamed from: e */
    int f3652e;

    /* renamed from: f */
    int f3653f;

    /* renamed from: g */
    int f3654g;

    /* renamed from: h */
    int f3655h;

    /* renamed from: i */
    boolean f3656i;

    /* renamed from: j */
    boolean f3657j = true;

    /* renamed from: k */
    String f3658k;

    /* renamed from: l */
    int f3659l;

    /* renamed from: m */
    CharSequence f3660m;

    /* renamed from: n */
    int f3661n;

    /* renamed from: o */
    CharSequence f3662o;

    /* renamed from: p */
    ArrayList<String> f3663p;

    /* renamed from: q */
    ArrayList<String> f3664q;

    /* renamed from: r */
    boolean f3665r = false;

    /* renamed from: s */
    ArrayList<Runnable> f3666s;

    /* renamed from: androidx.fragment.app.q$a */
    /* compiled from: FragmentTransaction */
    static final class C0721a {

        /* renamed from: a */
        int f3667a;

        /* renamed from: b */
        Fragment f3668b;

        /* renamed from: c */
        int f3669c;

        /* renamed from: d */
        int f3670d;

        /* renamed from: e */
        int f3671e;

        /* renamed from: f */
        int f3672f;

        /* renamed from: g */
        C0769d.C0772c f3673g;

        /* renamed from: h */
        C0769d.C0772c f3674h;

        C0721a() {
        }

        C0721a(int i, Fragment fragment) {
            this.f3667a = i;
            this.f3668b = fragment;
            C0769d.C0772c cVar = C0769d.C0772c.RESUMED;
            this.f3673g = cVar;
            this.f3674h = cVar;
        }
    }

    C0720q(C0706g gVar, ClassLoader classLoader) {
        this.f3648a = gVar;
        this.f3649b = classLoader;
    }

    /* renamed from: b */
    public C0720q mo3850b(int i, Fragment fragment, String str) {
        mo3677m(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0720q mo3851c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f3344H = viewGroup;
        return mo3850b(viewGroup.getId(), fragment, str);
    }

    /* renamed from: d */
    public C0720q mo3852d(Fragment fragment, String str) {
        mo3677m(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3853e(C0721a aVar) {
        this.f3650c.add(aVar);
        aVar.f3669c = this.f3651d;
        aVar.f3670d = this.f3652e;
        aVar.f3671e = this.f3653f;
        aVar.f3672f = this.f3654g;
    }

    /* renamed from: f */
    public C0720q mo3854f(Fragment fragment) {
        mo3853e(new C0721a(7, fragment));
        return this;
    }

    /* renamed from: g */
    public abstract int mo3672g();

    /* renamed from: h */
    public abstract int mo3673h();

    /* renamed from: i */
    public abstract void mo3674i();

    /* renamed from: j */
    public abstract void mo3675j();

    /* renamed from: k */
    public C0720q mo3676k(Fragment fragment) {
        mo3853e(new C0721a(6, fragment));
        return this;
    }

    /* renamed from: l */
    public C0720q mo3855l() {
        if (!this.f3656i) {
            this.f3657j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3677m(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f3387z;
            if (str2 == null || str.equals(str2)) {
                fragment.f3387z = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f3387z + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f3385x;
                if (i3 == 0 || i3 == i) {
                    fragment.f3385x = i;
                    fragment.f3386y = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f3385x + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo3853e(new C0721a(i2, fragment));
    }

    /* renamed from: n */
    public C0720q mo3678n(Fragment fragment) {
        mo3853e(new C0721a(3, fragment));
        return this;
    }

    /* renamed from: o */
    public C0720q mo3856o(int i, Fragment fragment) {
        return mo3857p(i, fragment, (String) null);
    }

    /* renamed from: p */
    public C0720q mo3857p(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo3677m(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: q */
    public C0720q mo3858q(boolean z) {
        this.f3665r = z;
        return this;
    }
}
