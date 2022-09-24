package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0746x;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0795t;
import com.google.ads.interactivemedia.p038v3.impl.data.C3791bd;
import p089i0.C5421b;
import p110m0.C5723u;
import p150t0.C6093b;

/* renamed from: androidx.fragment.app.o */
/* compiled from: FragmentStateManager */
class C0716o {

    /* renamed from: a */
    private final C0709j f3634a;

    /* renamed from: b */
    private final C0719p f3635b;

    /* renamed from: c */
    private final Fragment f3636c;

    /* renamed from: d */
    private boolean f3637d = false;

    /* renamed from: e */
    private int f3638e = -1;

    /* renamed from: f */
    private C5421b f3639f;

    /* renamed from: g */
    private C5421b f3640g;

    /* renamed from: h */
    private C5421b f3641h;

    /* renamed from: androidx.fragment.app.o$a */
    /* compiled from: FragmentStateManager */
    class C0717a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        final /* synthetic */ View f3642b;

        C0717a(View view) {
            this.f3642b = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f3642b.removeOnAttachStateChangeListener(this);
            C5723u.m25324l0(this.f3642b);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.o$b */
    /* compiled from: FragmentStateManager */
    static /* synthetic */ class C0718b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3644a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.d$c[] r0 = androidx.lifecycle.C0769d.C0772c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3644a = r0
                androidx.lifecycle.d$c r1 = androidx.lifecycle.C0769d.C0772c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3644a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.d$c r1 = androidx.lifecycle.C0769d.C0772c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3644a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.d$c r1 = androidx.lifecycle.C0769d.C0772c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0716o.C0718b.<clinit>():void");
        }
    }

    C0716o(C0709j jVar, C0719p pVar, Fragment fragment) {
        this.f3634a = jVar;
        this.f3635b = pVar;
        this.f3636c = fragment;
    }

    /* renamed from: o */
    private Bundle m4031o() {
        Bundle bundle = new Bundle();
        this.f3636c.mo3439o1(bundle);
        this.f3634a.mo3784j(this.f3636c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3636c.f3345I != null) {
            mo3820q();
        }
        if (this.f3636c.f3365d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3636c.f3365d);
        }
        if (this.f3636c.f3366e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3636c.f3366e);
        }
        if (!this.f3636c.f3347K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3636c.f3347K);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3805a() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3636c);
        }
        Fragment fragment = this.f3636c;
        fragment.mo3395U0(fragment.f3364c);
        C0709j jVar = this.f3634a;
        Fragment fragment2 = this.f3636c;
        jVar.mo3775a(fragment2, fragment2.f3364c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3806b() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3636c);
        }
        Fragment fragment = this.f3636c;
        Fragment fragment2 = fragment.f3370i;
        C0716o oVar = null;
        if (fragment2 != null) {
            C0716o m = this.f3635b.mo3838m(fragment2.f3368g);
            if (m != null) {
                Fragment fragment3 = this.f3636c;
                fragment3.f3371j = fragment3.f3370i.f3368g;
                fragment3.f3370i = null;
                oVar = m;
            } else {
                throw new IllegalStateException("Fragment " + this.f3636c + " declared target fragment " + this.f3636c.f3370i + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f3371j;
            if (str != null && (oVar = this.f3635b.mo3838m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3636c + " declared target fragment " + this.f3636c.f3371j + " that does not belong to this FragmentManager!");
            }
        }
        if (oVar != null && (FragmentManager.f3428P || oVar.mo3814j().f3363b < 1)) {
            oVar.mo3815k();
        }
        Fragment fragment4 = this.f3636c;
        fragment4.f3382u = fragment4.f3381t.mo3608u0();
        Fragment fragment5 = this.f3636c;
        fragment5.f3384w = fragment5.f3381t.mo3612x0();
        this.f3634a.mo3781g(this.f3636c, false);
        this.f3636c.mo3397V0();
        this.f3634a.mo3776b(this.f3636c, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r2 = r9.f3636c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo3807c() {
        /*
            r9 = this;
            androidx.fragment.app.Fragment r0 = r9.f3636c
            androidx.fragment.app.FragmentManager r1 = r0.f3381t
            if (r1 != 0) goto L_0x0009
            int r0 = r0.f3363b
            return r0
        L_0x0009:
            int r1 = r9.f3638e
            boolean r2 = r0.f3376o
            r3 = 2
            r4 = 4
            r5 = 1
            if (r2 == 0) goto L_0x0028
            boolean r2 = r0.f3377p
            if (r2 == 0) goto L_0x001b
            int r1 = java.lang.Math.max(r1, r3)
            goto L_0x0028
        L_0x001b:
            if (r1 >= r4) goto L_0x0024
            int r0 = r0.f3363b
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0028
        L_0x0024:
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0028:
            androidx.fragment.app.Fragment r0 = r9.f3636c
            boolean r0 = r0.f3374m
            if (r0 != 0) goto L_0x0032
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0032:
            r0 = 0
            boolean r2 = androidx.fragment.app.FragmentManager.f3428P
            if (r2 == 0) goto L_0x0049
            androidx.fragment.app.Fragment r2 = r9.f3636c
            android.view.ViewGroup r6 = r2.f3344H
            if (r6 == 0) goto L_0x0049
            androidx.fragment.app.FragmentManager r0 = r2.mo3371K()
            androidx.fragment.app.x r0 = androidx.fragment.app.C0746x.m4187l(r6, r0)
            androidx.fragment.app.x$e$c r0 = r0.mo3932j(r9)
        L_0x0049:
            androidx.fragment.app.x$e$c r2 = androidx.fragment.app.C0746x.C0751e.C0754c.ADDING
            r6 = -1
            r7 = 3
            if (r0 != r2) goto L_0x0055
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0073
        L_0x0055:
            androidx.fragment.app.x$e$c r2 = androidx.fragment.app.C0746x.C0751e.C0754c.REMOVING
            if (r0 != r2) goto L_0x005e
            int r1 = java.lang.Math.max(r1, r7)
            goto L_0x0073
        L_0x005e:
            androidx.fragment.app.Fragment r0 = r9.f3636c
            boolean r2 = r0.f3375n
            if (r2 == 0) goto L_0x0073
            boolean r0 = r0.mo3412e0()
            if (r0 == 0) goto L_0x006f
            int r1 = java.lang.Math.min(r1, r5)
            goto L_0x0073
        L_0x006f:
            int r1 = java.lang.Math.min(r1, r6)
        L_0x0073:
            androidx.fragment.app.Fragment r0 = r9.f3636c
            boolean r2 = r0.f3346J
            r8 = 5
            if (r2 == 0) goto L_0x0082
            int r0 = r0.f3363b
            if (r0 >= r8) goto L_0x0082
            int r1 = java.lang.Math.min(r1, r4)
        L_0x0082:
            int[] r0 = androidx.fragment.app.C0716o.C0718b.f3644a
            androidx.fragment.app.Fragment r2 = r9.f3636c
            androidx.lifecycle.d$c r2 = r2.f3355S
            int r2 = r2.ordinal()
            r0 = r0[r2]
            if (r0 == r5) goto L_0x00a2
            if (r0 == r3) goto L_0x009e
            if (r0 == r7) goto L_0x0099
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x00a2
        L_0x0099:
            int r1 = java.lang.Math.min(r1, r5)
            goto L_0x00a2
        L_0x009e:
            int r1 = java.lang.Math.min(r1, r8)
        L_0x00a2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0716o.mo3807c():int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3808d() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3636c);
        }
        Fragment fragment = this.f3636c;
        if (!fragment.f3354R) {
            this.f3634a.mo3782h(fragment, fragment.f3364c, false);
            Fragment fragment2 = this.f3636c;
            fragment2.mo3402Y0(fragment2.f3364c);
            C0709j jVar = this.f3634a;
            Fragment fragment3 = this.f3636c;
            jVar.mo3777c(fragment3, fragment3.f3364c, false);
            return;
        }
        fragment.mo3465v1(fragment.f3364c);
        this.f3636c.f3363b = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3809e() {
        String str;
        if (!this.f3636c.f3376o) {
            if (FragmentManager.m3729F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3636c);
            }
            Fragment fragment = this.f3636c;
            LayoutInflater e1 = fragment.mo3413e1(fragment.f3364c);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f3636c;
            ViewGroup viewGroup2 = fragment2.f3344H;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.f3386y;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.f3381t.mo3601p0().mo3487f(this.f3636c.f3386y);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f3636c;
                            if (!fragment3.f3378q) {
                                try {
                                    str = fragment3.mo3380N().getResourceName(this.f3636c.f3386y);
                                } catch (Resources.NotFoundException unused) {
                                    str = C3791bd.UNKNOWN_CONTENT_TYPE;
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3636c.f3386y) + " (" + str + ") for fragment " + this.f3636c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f3636c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f3636c;
            fragment4.f3344H = viewGroup;
            fragment4.mo3405a1(e1, viewGroup, fragment4.f3364c);
            View view = this.f3636c.f3345I;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f3636c;
                fragment5.f3345I.setTag(C6093b.f25325a, fragment5);
                if (viewGroup != null) {
                    viewGroup.addView(this.f3636c.f3345I, this.f3635b.mo3835j(this.f3636c));
                }
                Fragment fragment6 = this.f3636c;
                if (fragment6.f3337A) {
                    fragment6.f3345I.setVisibility(8);
                }
                if (C5723u.m25293S(this.f3636c.f3345I)) {
                    C5723u.m25324l0(this.f3636c.f3345I);
                } else {
                    View view2 = this.f3636c.f3345I;
                    view2.addOnAttachStateChangeListener(new C0717a(view2));
                }
                this.f3636c.mo3451r1();
                C0709j jVar = this.f3634a;
                Fragment fragment7 = this.f3636c;
                jVar.mo3787m(fragment7, fragment7.f3345I, fragment7.f3364c, false);
                int visibility = this.f3636c.f3345I.getVisibility();
                if (FragmentManager.f3428P) {
                    this.f3636c.mo3361G1(visibility);
                    Fragment fragment8 = this.f3636c;
                    if (fragment8.f3344H != null && visibility == 0) {
                        fragment8.mo3346B1(fragment8.f3345I.findFocus());
                        this.f3636c.f3345I.setVisibility(4);
                    }
                } else {
                    Fragment fragment9 = this.f3636c;
                    if (visibility == 0 && fragment9.f3344H != null) {
                        z = true;
                    }
                    fragment9.f3350N = z;
                }
            }
            this.f3636c.f3363b = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3810f() {
        Fragment f;
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3636c);
        }
        Fragment fragment = this.f3636c;
        boolean z = true;
        boolean z2 = fragment.f3375n && !fragment.mo3412e0();
        if (z2 || this.f3635b.mo3840o().mo3801o(this.f3636c)) {
            C0707h<?> hVar = this.f3636c.f3382u;
            if (hVar instanceof C0795t) {
                z = this.f3635b.mo3840o().mo3798l();
            } else if (hVar.mo3770k() instanceof Activity) {
                z = true ^ ((Activity) hVar.mo3770k()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.f3635b.mo3840o().mo3792f(this.f3636c);
            }
            this.f3636c.mo3407b1();
            this.f3634a.mo3778d(this.f3636c, false);
            for (C0716o next : this.f3635b.mo3836k()) {
                if (next != null) {
                    Fragment j = next.mo3814j();
                    if (this.f3636c.f3368g.equals(j.f3371j)) {
                        j.f3370i = this.f3636c;
                        j.f3371j = null;
                    }
                }
            }
            Fragment fragment2 = this.f3636c;
            String str = fragment2.f3371j;
            if (str != null) {
                fragment2.f3370i = this.f3635b.mo3831f(str);
            }
            this.f3635b.mo3842q(this);
            return;
        }
        String str2 = this.f3636c.f3371j;
        if (!(str2 == null || (f = this.f3635b.mo3831f(str2)) == null || !f.f3339C)) {
            this.f3636c.f3370i = f;
        }
        this.f3636c.f3363b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3811g() {
        this.f3636c.mo3409c1();
        this.f3634a.mo3788n(this.f3636c, false);
        Fragment fragment = this.f3636c;
        fragment.f3344H = null;
        fragment.f3345I = null;
        fragment.f3357U = null;
        fragment.f3358V.mo3962n(null);
        this.f3636c.f3377p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3812h() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3636c);
        }
        this.f3636c.mo3411d1();
        boolean z = false;
        this.f3634a.mo3779e(this.f3636c, false);
        Fragment fragment = this.f3636c;
        fragment.f3363b = -1;
        fragment.f3382u = null;
        fragment.f3384w = null;
        fragment.f3381t = null;
        if (fragment.f3375n && !fragment.mo3412e0()) {
            z = true;
        }
        if (z || this.f3635b.mo3840o().mo3801o(this.f3636c)) {
            if (FragmentManager.m3729F0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3636c);
            }
            this.f3636c.mo3403Z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3813i() {
        Fragment fragment = this.f3636c;
        if (fragment.f3376o && fragment.f3377p && !fragment.f3379r) {
            if (FragmentManager.m3729F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3636c);
            }
            Fragment fragment2 = this.f3636c;
            fragment2.mo3405a1(fragment2.mo3413e1(fragment2.f3364c), (ViewGroup) null, this.f3636c.f3364c);
            View view = this.f3636c.f3345I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3636c;
                fragment3.f3345I.setTag(C6093b.f25325a, fragment3);
                Fragment fragment4 = this.f3636c;
                if (fragment4.f3337A) {
                    fragment4.f3345I.setVisibility(8);
                }
                this.f3636c.mo3451r1();
                C0709j jVar = this.f3634a;
                Fragment fragment5 = this.f3636c;
                jVar.mo3787m(fragment5, fragment5.f3345I, fragment5.f3364c, false);
                this.f3636c.f3363b = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Fragment mo3814j() {
        return this.f3636c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3815k() {
        ViewGroup viewGroup;
        if (!this.f3637d) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int c = mo3807c();
                    Fragment fragment = this.f3636c;
                    int i = fragment.f3363b;
                    if (c != i) {
                        if (c <= i) {
                            int i2 = i - 1;
                            C5421b bVar = this.f3639f;
                            if (bVar != null) {
                                bVar.mo21871a();
                            }
                            switch (i2) {
                                case -1:
                                    mo3812h();
                                    break;
                                case 0:
                                    mo3810f();
                                    break;
                                case 1:
                                    this.f3636c.f3363b = z ? 1 : 0;
                                    break;
                                case 2:
                                    mo3811g();
                                    this.f3636c.f3363b = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.m3729F0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3636c);
                                    }
                                    Fragment fragment2 = this.f3636c;
                                    if (fragment2.f3345I != null && fragment2.f3365d == null) {
                                        mo3820q();
                                    }
                                    Fragment fragment3 = this.f3636c;
                                    if (!(fragment3.f3345I == null || (viewGroup = fragment3.f3344H) == null || this.f3638e <= -1)) {
                                        C0746x l = C0746x.m4187l(viewGroup, fragment3.mo3371K());
                                        C5421b bVar2 = this.f3640g;
                                        if (bVar2 != null) {
                                            bVar2.mo21871a();
                                        }
                                        C5421b bVar3 = new C5421b();
                                        this.f3641h = bVar3;
                                        l.mo3927d(this, bVar3);
                                    }
                                    this.f3636c.f3363b = 3;
                                    break;
                                case 4:
                                    mo3823t();
                                    break;
                                case 5:
                                    this.f3636c.f3363b = 5;
                                    break;
                                case 6:
                                    mo3816l();
                                    break;
                            }
                        } else {
                            int i3 = i + 1;
                            C5421b bVar4 = this.f3641h;
                            if (bVar4 != null) {
                                bVar4.mo21871a();
                            }
                            switch (i3) {
                                case 0:
                                    mo3806b();
                                    break;
                                case 1:
                                    mo3808d();
                                    break;
                                case 2:
                                    mo3813i();
                                    mo3809e();
                                    break;
                                case 3:
                                    mo3805a();
                                    break;
                                case 4:
                                    Fragment fragment4 = this.f3636c;
                                    View view = fragment4.f3345I;
                                    if (!(view == null || fragment4.f3344H == null)) {
                                        if (view.getParent() == null) {
                                            int j = this.f3635b.mo3835j(this.f3636c);
                                            Fragment fragment5 = this.f3636c;
                                            fragment5.f3344H.addView(fragment5.f3345I, j);
                                        }
                                        Fragment fragment6 = this.f3636c;
                                        C0746x l2 = C0746x.m4187l(fragment6.f3344H, fragment6.mo3371K());
                                        C5421b bVar5 = this.f3640g;
                                        if (bVar5 != null) {
                                            bVar5.mo21871a();
                                        }
                                        this.f3639f = new C5421b();
                                        l2.mo3925b(C0746x.C0751e.C0755d.m4209b(this.f3636c.mo3374L()), this, this.f3639f);
                                    }
                                    this.f3636c.f3363b = 4;
                                    break;
                                case 5:
                                    mo3822s();
                                    break;
                                case 6:
                                    this.f3636c.f3363b = 6;
                                    break;
                                case 7:
                                    mo3818n();
                                    break;
                            }
                        }
                    } else {
                        if (FragmentManager.f3428P && fragment.f3351O) {
                            if (!(fragment.f3345I == null || fragment.f3344H == null)) {
                                C5421b bVar6 = this.f3640g;
                                if (bVar6 != null) {
                                    bVar6.mo21871a();
                                }
                                Fragment fragment7 = this.f3636c;
                                C0746x l3 = C0746x.m4187l(fragment7.f3344H, fragment7.mo3371K());
                                C5421b bVar7 = new C5421b();
                                this.f3640g = bVar7;
                                if (this.f3636c.f3337A) {
                                    l3.mo3926c(this, bVar7);
                                } else {
                                    l3.mo3928e(this, bVar7);
                                }
                            }
                            Fragment fragment8 = this.f3636c;
                            fragment8.f3351O = z;
                            fragment8.mo3351D0(fragment8.f3337A);
                        }
                        this.f3637d = z;
                        return;
                    }
                }
            } finally {
                this.f3637d = z;
            }
        } else if (FragmentManager.m3729F0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + mo3814j());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3816l() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3636c);
        }
        this.f3636c.mo3425j1();
        this.f3634a.mo3780f(this.f3636c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3817m(ClassLoader classLoader) {
        Bundle bundle = this.f3636c.f3364c;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3636c;
            fragment.f3365d = fragment.f3364c.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3636c;
            fragment2.f3366e = fragment2.f3364c.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f3636c;
            fragment3.f3371j = fragment3.f3364c.getString("android:target_state");
            Fragment fragment4 = this.f3636c;
            if (fragment4.f3371j != null) {
                fragment4.f3372k = fragment4.f3364c.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f3636c;
            Boolean bool = fragment5.f3367f;
            if (bool != null) {
                fragment5.f3347K = bool.booleanValue();
                this.f3636c.f3367f = null;
            } else {
                fragment5.f3347K = fragment5.f3364c.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f3636c;
            if (!fragment6.f3347K) {
                fragment6.f3346J = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3818n() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3636c);
        }
        this.f3636c.mo3436n1();
        this.f3634a.mo3783i(this.f3636c, false);
        Fragment fragment = this.f3636c;
        fragment.f3364c = null;
        fragment.f3365d = null;
        fragment.f3366e = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public FragmentState mo3819p() {
        FragmentState fragmentState = new FragmentState(this.f3636c);
        Fragment fragment = this.f3636c;
        if (fragment.f3363b <= -1 || fragmentState.f3516n != null) {
            fragmentState.f3516n = fragment.f3364c;
        } else {
            Bundle o = m4031o();
            fragmentState.f3516n = o;
            if (this.f3636c.f3371j != null) {
                if (o == null) {
                    fragmentState.f3516n = new Bundle();
                }
                fragmentState.f3516n.putString("android:target_state", this.f3636c.f3371j);
                int i = this.f3636c.f3372k;
                if (i != 0) {
                    fragmentState.f3516n.putInt("android:target_req_state", i);
                }
            }
        }
        return fragmentState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3820q() {
        if (this.f3636c.f3345I != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3636c.f3345I.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3636c.f3365d = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3636c.f3357U.mo3913g(bundle);
            if (!bundle.isEmpty()) {
                this.f3636c.f3366e = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3821r(int i) {
        this.f3638e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3822s() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3636c);
        }
        this.f3636c.mo3445p1();
        this.f3634a.mo3785k(this.f3636c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3823t() {
        if (FragmentManager.m3729F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3636c);
        }
        this.f3636c.mo3448q1();
        this.f3634a.mo3786l(this.f3636c, false);
    }

    C0716o(C0709j jVar, C0719p pVar, ClassLoader classLoader, C0706g gVar, FragmentState fragmentState) {
        this.f3634a = jVar;
        this.f3635b = pVar;
        Fragment a = gVar.mo3627a(classLoader, fragmentState.f3504b);
        this.f3636c = a;
        Bundle bundle = fragmentState.f3513k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo3343A1(fragmentState.f3513k);
        a.f3368g = fragmentState.f3505c;
        a.f3376o = fragmentState.f3506d;
        a.f3378q = true;
        a.f3385x = fragmentState.f3507e;
        a.f3386y = fragmentState.f3508f;
        a.f3387z = fragmentState.f3509g;
        a.f3339C = fragmentState.f3510h;
        a.f3375n = fragmentState.f3511i;
        a.f3338B = fragmentState.f3512j;
        a.f3337A = fragmentState.f3514l;
        a.f3355S = C0769d.C0772c.values()[fragmentState.f3515m];
        Bundle bundle2 = fragmentState.f3516n;
        if (bundle2 != null) {
            a.f3364c = bundle2;
        } else {
            a.f3364c = new Bundle();
        }
        if (FragmentManager.m3729F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    C0716o(C0709j jVar, C0719p pVar, Fragment fragment, FragmentState fragmentState) {
        this.f3634a = jVar;
        this.f3635b = pVar;
        this.f3636c = fragment;
        fragment.f3365d = null;
        fragment.f3366e = null;
        fragment.f3380s = 0;
        fragment.f3377p = false;
        fragment.f3374m = false;
        Fragment fragment2 = fragment.f3370i;
        fragment.f3371j = fragment2 != null ? fragment2.f3368g : null;
        fragment.f3370i = null;
        Bundle bundle = fragmentState.f3516n;
        if (bundle != null) {
            fragment.f3364c = bundle;
        } else {
            fragment.f3364c = new Bundle();
        }
    }
}
