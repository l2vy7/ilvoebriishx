package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0773e;
import androidx.lifecycle.C0775g;
import androidx.lifecycle.C0776h;
import androidx.lifecycle.C0781l;
import androidx.lifecycle.C0794s;
import androidx.lifecycle.C0795t;
import androidx.lifecycle.C0796u;
import androidx.lifecycle.C0797v;
import androidx.lifecycle.LiveData;
import androidx.loader.app.C0798a;
import androidx.savedstate.C1219b;
import androidx.savedstate.C1220c;
import androidx.savedstate.C1221d;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0047o;
import p111m0.C5708f;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C0775g, C0795t, C1220c {

    /* renamed from: l0 */
    static final Object f3336l0 = new Object();

    /* renamed from: A */
    boolean f3337A;

    /* renamed from: B */
    boolean f3338B;

    /* renamed from: C */
    boolean f3339C;

    /* renamed from: D */
    boolean f3340D;

    /* renamed from: E */
    boolean f3341E;

    /* renamed from: F */
    boolean f3342F = true;

    /* renamed from: G */
    private boolean f3343G;

    /* renamed from: H */
    ViewGroup f3344H;

    /* renamed from: I */
    View f3345I;

    /* renamed from: J */
    boolean f3346J;

    /* renamed from: K */
    boolean f3347K = true;

    /* renamed from: L */
    C0645e f3348L;

    /* renamed from: M */
    Runnable f3349M = new C0641a();

    /* renamed from: N */
    boolean f3350N;

    /* renamed from: O */
    boolean f3351O;

    /* renamed from: P */
    float f3352P;

    /* renamed from: Q */
    LayoutInflater f3353Q;

    /* renamed from: R */
    boolean f3354R;

    /* renamed from: S */
    C0769d.C0772c f3355S = C0769d.C0772c.RESUMED;

    /* renamed from: T */
    C0776h f3356T;

    /* renamed from: U */
    C0741u f3357U;

    /* renamed from: V */
    C0781l<C0775g> f3358V = new C0781l<>();

    /* renamed from: W */
    C1219b f3359W;

    /* renamed from: X */
    private int f3360X;

    /* renamed from: Y */
    private final AtomicInteger f3361Y = new AtomicInteger();

    /* renamed from: Z */
    private final ArrayList<C0647g> f3362Z = new ArrayList<>();

    /* renamed from: b */
    int f3363b = -1;

    /* renamed from: c */
    Bundle f3364c;

    /* renamed from: d */
    SparseArray<Parcelable> f3365d;

    /* renamed from: e */
    Bundle f3366e;

    /* renamed from: f */
    Boolean f3367f;

    /* renamed from: g */
    String f3368g = UUID.randomUUID().toString();

    /* renamed from: h */
    Bundle f3369h;

    /* renamed from: i */
    Fragment f3370i;

    /* renamed from: j */
    String f3371j = null;

    /* renamed from: k */
    int f3372k;

    /* renamed from: l */
    private Boolean f3373l = null;

    /* renamed from: m */
    boolean f3374m;

    /* renamed from: n */
    boolean f3375n;

    /* renamed from: o */
    boolean f3376o;

    /* renamed from: p */
    boolean f3377p;

    /* renamed from: q */
    boolean f3378q;

    /* renamed from: r */
    boolean f3379r;

    /* renamed from: s */
    int f3380s;

    /* renamed from: t */
    FragmentManager f3381t;

    /* renamed from: u */
    C0707h<?> f3382u;

    /* renamed from: v */
    FragmentManager f3383v = new C0711k();

    /* renamed from: w */
    Fragment f3384w;

    /* renamed from: x */
    int f3385x;

    /* renamed from: y */
    int f3386y;

    /* renamed from: z */
    String f3387z;

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0640a();

        /* renamed from: b */
        final Bundle f3389b;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        class C0640a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0640a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3389b = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f3389b);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0641a implements Runnable {
        C0641a() {
        }

        public void run() {
            Fragment.this.mo3379M1();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0642b implements Runnable {
        C0642b() {
        }

        public void run() {
            Fragment.this.mo3426k(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0643c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0746x f3392b;

        C0643c(C0746x xVar) {
            this.f3392b = xVar;
        }

        public void run() {
            this.f3392b.mo3929g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    class C0644d extends C0704e {
        C0644d() {
        }

        /* renamed from: f */
        public View mo3487f(int i) {
            View view = Fragment.this.f3345I;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: h */
        public boolean mo3488h() {
            return Fragment.this.f3345I != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    static class C0645e {

        /* renamed from: a */
        View f3395a;

        /* renamed from: b */
        Animator f3396b;

        /* renamed from: c */
        int f3397c;

        /* renamed from: d */
        int f3398d;

        /* renamed from: e */
        ArrayList<String> f3399e;

        /* renamed from: f */
        ArrayList<String> f3400f;

        /* renamed from: g */
        Object f3401g = null;

        /* renamed from: h */
        Object f3402h;

        /* renamed from: i */
        Object f3403i;

        /* renamed from: j */
        Object f3404j;

        /* renamed from: k */
        Object f3405k;

        /* renamed from: l */
        Object f3406l;

        /* renamed from: m */
        Boolean f3407m;

        /* renamed from: n */
        Boolean f3408n;

        /* renamed from: o */
        C0047o f3409o;

        /* renamed from: p */
        C0047o f3410p;

        /* renamed from: q */
        int f3411q;

        /* renamed from: r */
        View f3412r;

        /* renamed from: s */
        boolean f3413s;

        /* renamed from: t */
        C0648h f3414t;

        /* renamed from: u */
        boolean f3415u;

        C0645e() {
            Object obj = Fragment.f3336l0;
            this.f3402h = obj;
            this.f3403i = null;
            this.f3404j = obj;
            this.f3405k = null;
            this.f3406l = obj;
            this.f3411q = 0;
            this.f3412r = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public static class C0646f extends RuntimeException {
        public C0646f(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    private static abstract class C0647g {
        private C0647g() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo3489a();
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    interface C0648h {
        /* renamed from: a */
        void mo3490a();

        /* renamed from: b */
        void mo3491b();
    }

    public Fragment() {
        m3558Y();
    }

    /* renamed from: Y */
    private void m3558Y() {
        this.f3356T = new C0776h(this);
        this.f3359W = C1219b.m6649a(this);
    }

    @Deprecated
    /* renamed from: a0 */
    public static Fragment m3559a0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0706g.m3990d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo3343A1(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0646f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0646f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0646f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0646f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: n */
    private C0645e m3560n() {
        if (this.f3348L == null) {
            this.f3348L = new C0645e();
        }
        return this.f3348L;
    }

    /* renamed from: w1 */
    private void m3561w1() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f3345I != null) {
            mo3469x1(this.f3364c);
        }
        this.f3364c = null;
    }

    /* renamed from: A */
    public Object mo3341A() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3403i;
    }

    /* renamed from: A0 */
    public void mo3342A0() {
        this.f3343G = true;
    }

    /* renamed from: A1 */
    public void mo3343A1(Bundle bundle) {
        if (this.f3381t == null || !mo3430l0()) {
            this.f3369h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C0047o mo3344B() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3410p;
    }

    /* renamed from: B0 */
    public void mo3345B0() {
        this.f3343G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void mo3346B1(View view) {
        m3560n().f3412r = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public View mo3347C() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3412r;
    }

    /* renamed from: C0 */
    public LayoutInflater mo3348C0(Bundle bundle) {
        return mo3356F(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C1 */
    public void mo3349C1(boolean z) {
        m3560n().f3415u = z;
    }

    @Deprecated
    /* renamed from: D */
    public final FragmentManager mo3350D() {
        return this.f3381t;
    }

    /* renamed from: D0 */
    public void mo3351D0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D1 */
    public void mo3352D1(int i) {
        if (this.f3348L != null || i != 0) {
            m3560n().f3397c = i;
        }
    }

    /* renamed from: E */
    public final Object mo3353E() {
        C0707h<?> hVar = this.f3382u;
        if (hVar == null) {
            return null;
        }
        return hVar.mo3512m();
    }

    @Deprecated
    /* renamed from: E0 */
    public void mo3354E0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f3343G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E1 */
    public void mo3355E1(int i) {
        if (this.f3348L != null || i != 0) {
            m3560n();
            this.f3348L.f3398d = i;
        }
    }

    @Deprecated
    /* renamed from: F */
    public LayoutInflater mo3356F(Bundle bundle) {
        C0707h<?> hVar = this.f3382u;
        if (hVar != null) {
            LayoutInflater n = hVar.mo3513n();
            C5708f.m25215b(n, this.f3383v.mo3609v0());
            return n;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: F0 */
    public void mo3357F0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f3343G = true;
        C0707h<?> hVar = this.f3382u;
        Activity j = hVar == null ? null : hVar.mo3769j();
        if (j != null) {
            this.f3343G = false;
            mo3354E0(j, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public void mo3358F1(C0648h hVar) {
        m3560n();
        C0645e eVar = this.f3348L;
        C0648h hVar2 = eVar.f3414t;
        if (hVar != hVar2) {
            if (hVar == null || hVar2 == null) {
                if (eVar.f3413s) {
                    eVar.f3414t = hVar;
                }
                if (hVar != null) {
                    hVar.mo3490a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    @Deprecated
    /* renamed from: G */
    public C0798a mo3359G() {
        return C0798a.m4332b(this);
    }

    /* renamed from: G0 */
    public void mo3360G0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public void mo3361G1(int i) {
        m3560n().f3411q = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public int mo3362H() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3397c;
    }

    /* renamed from: H0 */
    public boolean mo3363H0(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    /* renamed from: H1 */
    public void mo3364H1(boolean z) {
        this.f3339C = z;
        FragmentManager fragmentManager = this.f3381t;
        if (fragmentManager == null) {
            this.f3340D = true;
        } else if (z) {
            fragmentManager.mo3588i(this);
        } else {
            fragmentManager.mo3576b1(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public int mo3365I() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3398d;
    }

    /* renamed from: I0 */
    public void mo3366I0(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public void mo3367I1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m3560n();
        C0645e eVar = this.f3348L;
        eVar.f3399e = arrayList;
        eVar.f3400f = arrayList2;
    }

    /* renamed from: J */
    public final Fragment mo3368J() {
        return this.f3384w;
    }

    /* renamed from: J0 */
    public void mo3369J0() {
        this.f3343G = true;
    }

    /* renamed from: J1 */
    public void mo3370J1(@SuppressLint({"UnknownNullness"}) Intent intent) {
        mo3373K1(intent, (Bundle) null);
    }

    /* renamed from: K */
    public final FragmentManager mo3371K() {
        FragmentManager fragmentManager = this.f3381t;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: K0 */
    public void mo3372K0(boolean z) {
    }

    /* renamed from: K1 */
    public void mo3373K1(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0707h<?> hVar = this.f3382u;
        if (hVar != null) {
            hVar.mo3772p(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo3374L() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3411q;
    }

    /* renamed from: L0 */
    public void mo3375L0(Menu menu) {
    }

    @Deprecated
    /* renamed from: L1 */
    public void mo3376L1(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f3382u != null) {
            mo3371K().mo3553L0(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: M */
    public Object mo3377M() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3404j;
        return obj == f3336l0 ? mo3341A() : obj;
    }

    /* renamed from: M0 */
    public void mo3378M0(boolean z) {
    }

    /* renamed from: M1 */
    public void mo3379M1() {
        if (this.f3348L != null && m3560n().f3413s) {
            if (this.f3382u == null) {
                m3560n().f3413s = false;
            } else if (Looper.myLooper() != this.f3382u.mo3771l().getLooper()) {
                this.f3382u.mo3771l().postAtFrontOfQueue(new C0642b());
            } else {
                mo3426k(true);
            }
        }
    }

    /* renamed from: N */
    public final Resources mo3380N() {
        return mo3458t1().getResources();
    }

    @Deprecated
    /* renamed from: N0 */
    public void mo3381N0(int i, String[] strArr, int[] iArr) {
    }

    @Deprecated
    /* renamed from: O */
    public final boolean mo3382O() {
        return this.f3339C;
    }

    /* renamed from: O0 */
    public void mo3383O0() {
        this.f3343G = true;
    }

    /* renamed from: P */
    public Object mo3384P() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3402h;
        return obj == f3336l0 ? mo3470y() : obj;
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
    }

    /* renamed from: Q */
    public Object mo3386Q() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3405k;
    }

    /* renamed from: Q0 */
    public void mo3387Q0() {
        this.f3343G = true;
    }

    /* renamed from: R */
    public Object mo3388R() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3406l;
        return obj == f3336l0 ? mo3386Q() : obj;
    }

    /* renamed from: R0 */
    public void mo3389R0() {
        this.f3343G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public ArrayList<String> mo3390S() {
        ArrayList<String> arrayList;
        C0645e eVar = this.f3348L;
        if (eVar == null || (arrayList = eVar.f3399e) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* renamed from: S0 */
    public void mo3391S0(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public ArrayList<String> mo3392T() {
        ArrayList<String> arrayList;
        C0645e eVar = this.f3348L;
        if (eVar == null || (arrayList = eVar.f3400f) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* renamed from: T0 */
    public void mo3393T0(Bundle bundle) {
        this.f3343G = true;
    }

    /* renamed from: U */
    public final String mo3394U(int i) {
        return mo3380N().getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo3395U0(Bundle bundle) {
        this.f3383v.mo3563R0();
        this.f3363b = 3;
        this.f3343G = false;
        mo3435n0(bundle);
        if (this.f3343G) {
            m3561w1();
            this.f3383v.mo3615z();
            return;
        }
        throw new C0757z("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    @Deprecated
    /* renamed from: V */
    public final Fragment mo3396V() {
        String str;
        Fragment fragment = this.f3370i;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f3381t;
        if (fragmentManager == null || (str = this.f3371j) == null) {
            return null;
        }
        return fragmentManager.mo3586h0(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo3397V0() {
        Iterator<C0647g> it = this.f3362Z.iterator();
        while (it.hasNext()) {
            it.next().mo3489a();
        }
        this.f3362Z.clear();
        this.f3383v.mo3594k(this.f3382u, mo3429l(), this);
        this.f3363b = 0;
        this.f3343G = false;
        mo3447q0(this.f3382u.mo3770k());
        if (this.f3343G) {
            this.f3381t.mo3548J(this);
            this.f3383v.mo3533A();
            return;
        }
        throw new C0757z("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* renamed from: W */
    public View mo3398W() {
        return this.f3345I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo3399W0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f3383v.mo3534B(configuration);
    }

    /* renamed from: X */
    public LiveData<C0775g> mo3400X() {
        return this.f3358V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public boolean mo3401X0(MenuItem menuItem) {
        if (this.f3337A) {
            return false;
        }
        if (mo3453s0(menuItem)) {
            return true;
        }
        return this.f3383v.mo3536C(menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3402Y0(Bundle bundle) {
        this.f3383v.mo3563R0();
        this.f3363b = 1;
        this.f3343G = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3356T.mo3984a(new C0773e() {
                /* renamed from: c */
                public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
                    View view;
                    if (bVar == C0769d.C0771b.ON_STOP && (view = Fragment.this.f3345I) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
        this.f3359W.mo5974c(bundle);
        mo3457t0(bundle);
        this.f3354R = true;
        if (this.f3343G) {
            this.f3356T.mo3989h(C0769d.C0771b.ON_CREATE);
            return;
        }
        throw new C0757z("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo3403Z() {
        m3558Y();
        this.f3368g = UUID.randomUUID().toString();
        this.f3374m = false;
        this.f3375n = false;
        this.f3376o = false;
        this.f3377p = false;
        this.f3378q = false;
        this.f3380s = 0;
        this.f3381t = null;
        this.f3383v = new C0711k();
        this.f3382u = null;
        this.f3385x = 0;
        this.f3386y = 0;
        this.f3387z = null;
        this.f3337A = false;
        this.f3338B = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public boolean mo3404Z0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f3337A) {
            return false;
        }
        if (this.f3341E && this.f3342F) {
            z = true;
            mo3467w0(menu, menuInflater);
        }
        return z | this.f3383v.mo3540E(menu, menuInflater);
    }

    /* renamed from: a */
    public C0769d mo639a() {
        return this.f3356T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void mo3405a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3383v.mo3563R0();
        this.f3379r = true;
        this.f3357U = new C0741u();
        View x0 = mo3468x0(layoutInflater, viewGroup, bundle);
        this.f3345I = x0;
        if (x0 != null) {
            this.f3357U.mo3910d();
            C0796u.m4330a(this.f3345I, this.f3357U);
            C0797v.m4331a(this.f3345I, this);
            C1221d.m6654a(this.f3345I, this.f3357U);
            this.f3358V.mo3962n(this.f3357U);
        } else if (!this.f3357U.mo3911e()) {
            this.f3357U = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: b0 */
    public final boolean mo3406b0() {
        return this.f3382u != null && this.f3374m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo3407b1() {
        this.f3383v.mo3542F();
        this.f3356T.mo3989h(C0769d.C0771b.ON_DESTROY);
        this.f3363b = 0;
        this.f3343G = false;
        this.f3354R = false;
        mo3471y0();
        if (!this.f3343G) {
            throw new C0757z("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* renamed from: c0 */
    public final boolean mo3408c0() {
        return this.f3338B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo3409c1() {
        this.f3383v.mo3543G();
        if (this.f3345I != null) {
            this.f3357U.mo3909b(C0769d.C0771b.ON_DESTROY);
        }
        this.f3363b = 1;
        this.f3343G = false;
        mo3342A0();
        if (this.f3343G) {
            C0798a.m4332b(this).mo4034d();
            this.f3379r = false;
            return;
        }
        throw new C0757z("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public boolean mo3410d0() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return false;
        }
        return eVar.f3415u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3411d1() {
        this.f3363b = -1;
        this.f3343G = false;
        mo3345B0();
        this.f3353Q = null;
        if (!this.f3343G) {
            throw new C0757z("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f3383v.mo3541E0()) {
            this.f3383v.mo3542F();
            this.f3383v = new C0711k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final boolean mo3412e0() {
        return this.f3380s > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public LayoutInflater mo3413e1(Bundle bundle) {
        LayoutInflater C0 = mo3348C0(bundle);
        this.f3353Q = C0;
        return C0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public final boolean mo3415f0() {
        return this.f3377p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo3416f1() {
        onLowMemory();
        this.f3383v.mo3544H();
    }

    /* renamed from: g */
    public C0794s mo643g() {
        FragmentManager fragmentManager = this.f3381t;
        if (fragmentManager != null) {
            return fragmentManager.mo3535B0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f3381t;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3417g0() {
        /*
            r2 = this;
            boolean r0 = r2.f3342F
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.FragmentManager r0 = r2.f3381t
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.f3384w
            boolean r0 = r0.mo3545H0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3417g0():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3418g1(boolean z) {
        mo3360G0(z);
        this.f3383v.mo3546I(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public boolean mo3419h0() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return false;
        }
        return eVar.f3413s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public boolean mo3420h1(MenuItem menuItem) {
        if (this.f3337A) {
            return false;
        }
        if (!this.f3341E || !this.f3342F || !mo3363H0(menuItem)) {
            return this.f3383v.mo3550K(menuItem);
        }
        return true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final SavedStateRegistry mo644i() {
        return this.f3359W.mo5973b();
    }

    /* renamed from: i0 */
    public final boolean mo3422i0() {
        return this.f3375n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo3423i1(Menu menu) {
        if (!this.f3337A) {
            if (this.f3341E && this.f3342F) {
                mo3366I0(menu);
            }
            this.f3383v.mo3552L(menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final boolean mo3424j0() {
        Fragment J = mo3368J();
        return J != null && (J.mo3422i0() || J.mo3424j0());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3425j1() {
        this.f3383v.mo3554N();
        if (this.f3345I != null) {
            this.f3357U.mo3909b(C0769d.C0771b.ON_PAUSE);
        }
        this.f3356T.mo3989h(C0769d.C0771b.ON_PAUSE);
        this.f3363b = 6;
        this.f3343G = false;
        mo3369J0();
        if (!this.f3343G) {
            throw new C0757z("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3426k(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0645e eVar = this.f3348L;
        C0648h hVar = null;
        if (eVar != null) {
            eVar.f3413s = false;
            C0648h hVar2 = eVar.f3414t;
            eVar.f3414t = null;
            hVar = hVar2;
        }
        if (hVar != null) {
            hVar.mo3491b();
        } else if (FragmentManager.f3428P && this.f3345I != null && (viewGroup = this.f3344H) != null && (fragmentManager = this.f3381t) != null) {
            C0746x l = C0746x.m4187l(viewGroup, fragmentManager);
            l.mo3934n();
            if (z) {
                this.f3382u.mo3771l().post(new C0643c(l));
            } else {
                l.mo3929g();
            }
        }
    }

    /* renamed from: k0 */
    public final boolean mo3427k0() {
        return this.f3363b >= 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo3428k1(boolean z) {
        mo3372K0(z);
        this.f3383v.mo3556O(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0704e mo3429l() {
        return new C0644d();
    }

    /* renamed from: l0 */
    public final boolean mo3430l0() {
        FragmentManager fragmentManager = this.f3381t;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo3551K0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public boolean mo3431l1(Menu menu) {
        boolean z = false;
        if (this.f3337A) {
            return false;
        }
        if (this.f3341E && this.f3342F) {
            z = true;
            mo3375L0(menu);
        }
        return z | this.f3383v.mo3558P(menu);
    }

    /* renamed from: m */
    public void mo3432m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3385x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3386y));
        printWriter.print(" mTag=");
        printWriter.println(this.f3387z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3363b);
        printWriter.print(" mWho=");
        printWriter.print(this.f3368g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3380s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3374m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3375n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3376o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3377p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3337A);
        printWriter.print(" mDetached=");
        printWriter.print(this.f3338B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f3342F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f3341E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f3339C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f3347K);
        if (this.f3381t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3381t);
        }
        if (this.f3382u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3382u);
        }
        if (this.f3384w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3384w);
        }
        if (this.f3369h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3369h);
        }
        if (this.f3364c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3364c);
        }
        if (this.f3365d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3365d);
        }
        if (this.f3366e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3366e);
        }
        Fragment V = mo3396V();
        if (V != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(V);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3372k);
        }
        if (mo3362H() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo3362H());
        }
        if (this.f3344H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f3344H);
        }
        if (this.f3345I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f3345I);
        }
        if (mo3452s() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo3452s());
        }
        if (mo3466w() != null) {
            C0798a.m4332b(this).mo4032a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3383v + ":");
        FragmentManager fragmentManager = this.f3383v;
        fragmentManager.mo3571X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo3433m0() {
        this.f3383v.mo3563R0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void mo3434m1() {
        boolean I0 = this.f3381t.mo3547I0(this);
        Boolean bool = this.f3373l;
        if (bool == null || bool.booleanValue() != I0) {
            this.f3373l = Boolean.valueOf(I0);
            mo3378M0(I0);
            this.f3383v.mo3560Q();
        }
    }

    @Deprecated
    /* renamed from: n0 */
    public void mo3435n0(Bundle bundle) {
        this.f3343G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void mo3436n1() {
        this.f3383v.mo3563R0();
        this.f3383v.mo3575b0(true);
        this.f3363b = 7;
        this.f3343G = false;
        mo3383O0();
        if (this.f3343G) {
            C0776h hVar = this.f3356T;
            C0769d.C0771b bVar = C0769d.C0771b.ON_RESUME;
            hVar.mo3989h(bVar);
            if (this.f3345I != null) {
                this.f3357U.mo3909b(bVar);
            }
            this.f3383v.mo3562R();
            return;
        }
        throw new C0757z("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Fragment mo3437o(String str) {
        if (str.equals(this.f3368g)) {
            return this;
        }
        return this.f3383v.mo3595k0(str);
    }

    @Deprecated
    /* renamed from: o0 */
    public void mo3438o0(int i, int i2, Intent intent) {
        if (FragmentManager.m3729F0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void mo3439o1(Bundle bundle) {
        mo3385P0(bundle);
        this.f3359W.mo5975d(bundle);
        Parcelable f1 = this.f3383v.mo3582f1();
        if (f1 != null) {
            bundle.putParcelable("android:support:fragments", f1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f3343G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo3454s1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f3343G = true;
    }

    /* renamed from: p */
    public final FragmentActivity mo3443p() {
        C0707h<?> hVar = this.f3382u;
        if (hVar == null) {
            return null;
        }
        return (FragmentActivity) hVar.mo3769j();
    }

    @Deprecated
    /* renamed from: p0 */
    public void mo3444p0(Activity activity) {
        this.f3343G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void mo3445p1() {
        this.f3383v.mo3563R0();
        this.f3383v.mo3575b0(true);
        this.f3363b = 5;
        this.f3343G = false;
        mo3387Q0();
        if (this.f3343G) {
            C0776h hVar = this.f3356T;
            C0769d.C0771b bVar = C0769d.C0771b.ON_START;
            hVar.mo3989h(bVar);
            if (this.f3345I != null) {
                this.f3357U.mo3909b(bVar);
            }
            this.f3383v.mo3564S();
            return;
        }
        throw new C0757z("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: q */
    public boolean mo3446q() {
        Boolean bool;
        C0645e eVar = this.f3348L;
        if (eVar == null || (bool = eVar.f3408n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: q0 */
    public void mo3447q0(Context context) {
        this.f3343G = true;
        C0707h<?> hVar = this.f3382u;
        Activity j = hVar == null ? null : hVar.mo3769j();
        if (j != null) {
            this.f3343G = false;
            mo3444p0(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void mo3448q1() {
        this.f3383v.mo3567U();
        if (this.f3345I != null) {
            this.f3357U.mo3909b(C0769d.C0771b.ON_STOP);
        }
        this.f3356T.mo3989h(C0769d.C0771b.ON_STOP);
        this.f3363b = 4;
        this.f3343G = false;
        mo3389R0();
        if (!this.f3343G) {
            throw new C0757z("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: r */
    public boolean mo3449r() {
        Boolean bool;
        C0645e eVar = this.f3348L;
        if (eVar == null || (bool = eVar.f3407m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    /* renamed from: r0 */
    public void mo3450r0(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo3451r1() {
        mo3391S0(this.f3345I, this.f3364c);
        this.f3383v.mo3569V();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public View mo3452s() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3395a;
    }

    /* renamed from: s0 */
    public boolean mo3453s0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: s1 */
    public final FragmentActivity mo3454s1() {
        FragmentActivity p = mo3443p();
        if (p != null) {
            return p;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo3376L1(intent, i, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Animator mo3456t() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3396b;
    }

    /* renamed from: t0 */
    public void mo3457t0(Bundle bundle) {
        this.f3343G = true;
        mo3465v1(bundle);
        if (!this.f3383v.mo3549J0(1)) {
            this.f3383v.mo3538D();
        }
    }

    /* renamed from: t1 */
    public final Context mo3458t1() {
        Context w = mo3466w();
        if (w != null) {
            return w;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f3368g);
        sb.append(")");
        if (this.f3385x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3385x));
        }
        if (this.f3387z != null) {
            sb.append(" ");
            sb.append(this.f3387z);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final Bundle mo3460u() {
        return this.f3369h;
    }

    /* renamed from: u0 */
    public Animation mo3461u0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: u1 */
    public final View mo3462u1() {
        View W = mo3398W();
        if (W != null) {
            return W;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: v */
    public final FragmentManager mo3463v() {
        if (this.f3382u != null) {
            return this.f3383v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: v0 */
    public Animator mo3464v0(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo3465v1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f3383v.mo3578d1(parcelable);
            this.f3383v.mo3538D();
        }
    }

    /* renamed from: w */
    public Context mo3466w() {
        C0707h<?> hVar = this.f3382u;
        if (hVar == null) {
            return null;
        }
        return hVar.mo3770k();
    }

    /* renamed from: w0 */
    public void mo3467w0(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f3360X;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public final void mo3469x1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3365d;
        if (sparseArray != null) {
            this.f3345I.restoreHierarchyState(sparseArray);
            this.f3365d = null;
        }
        if (this.f3345I != null) {
            this.f3357U.mo3912f(this.f3366e);
            this.f3366e = null;
        }
        this.f3343G = false;
        mo3393T0(bundle);
        if (!this.f3343G) {
            throw new C0757z("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f3345I != null) {
            this.f3357U.mo3909b(C0769d.C0771b.ON_CREATE);
        }
    }

    /* renamed from: y */
    public Object mo3470y() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3401g;
    }

    /* renamed from: y0 */
    public void mo3471y0() {
        this.f3343G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void mo3472y1(View view) {
        m3560n().f3395a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C0047o mo3473z() {
        C0645e eVar = this.f3348L;
        if (eVar == null) {
            return null;
        }
        return eVar.f3409o;
    }

    /* renamed from: z0 */
    public void mo3474z0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo3475z1(Animator animator) {
        m3560n().f3396b = animator;
    }
}
