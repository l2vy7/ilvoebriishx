package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C0720q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* compiled from: BackStackRecord */
final class C0674a extends C0720q implements FragmentManager.C0667n {

    /* renamed from: t */
    final FragmentManager f3529t;

    /* renamed from: u */
    boolean f3530u;

    /* renamed from: v */
    int f3531v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0674a(FragmentManager fragmentManager) {
        super(fragmentManager.mo3603r0(), fragmentManager.mo3608u0() != null ? fragmentManager.mo3608u0().mo3770k().getClassLoader() : null);
        this.f3531v = -1;
        this.f3529t = fragmentManager;
    }

    /* renamed from: B */
    private static boolean m3882B(C0720q.C0721a aVar) {
        Fragment fragment = aVar.f3668b;
        return fragment != null && fragment.f3374m && fragment.f3345I != null && !fragment.f3338B && !fragment.f3337A && fragment.mo3419h0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo3667A(ArrayList<C0674a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f3650c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f3650c.get(i4).f3668b;
            int i5 = fragment != null ? fragment.f3386y : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0674a aVar = arrayList.get(i6);
                    int size2 = aVar.f3650c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f3650c.get(i7).f3668b;
                        if ((fragment2 != null ? fragment2.f3386y : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo3668C() {
        for (int i = 0; i < this.f3650c.size(); i++) {
            if (m3882B(this.f3650c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public void mo3669D() {
        if (this.f3666s != null) {
            for (int i = 0; i < this.f3666s.size(); i++) {
                this.f3666s.get(i).run();
            }
            this.f3666s = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo3670E(Fragment.C0648h hVar) {
        for (int i = 0; i < this.f3650c.size(); i++) {
            C0720q.C0721a aVar = this.f3650c.get(i);
            if (m3882B(aVar)) {
                aVar.f3668b.mo3358F1(hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public Fragment mo3671F(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3650c.size() - 1; size >= 0; size--) {
            C0720q.C0721a aVar = this.f3650c.get(size);
            int i = aVar.f3667a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3668b;
                            break;
                        case 10:
                            aVar.f3674h = aVar.f3673g;
                            break;
                    }
                }
                arrayList.add(aVar.f3668b);
            }
            arrayList.remove(aVar.f3668b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo3637a(ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m3729F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3656i) {
            return true;
        }
        this.f3529t.mo3579e(this);
        return true;
    }

    /* renamed from: g */
    public int mo3672g() {
        return mo3680s(false);
    }

    /* renamed from: h */
    public int mo3673h() {
        return mo3680s(true);
    }

    /* renamed from: i */
    public void mo3674i() {
        mo3855l();
        this.f3529t.mo3577c0(this, false);
    }

    /* renamed from: j */
    public void mo3675j() {
        mo3855l();
        this.f3529t.mo3577c0(this, true);
    }

    /* renamed from: k */
    public C0720q mo3676k(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f3381t;
        if (fragmentManager == null || fragmentManager == this.f3529t) {
            return super.mo3676k(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3677m(int i, Fragment fragment, String str, int i2) {
        super.mo3677m(i, fragment, str, i2);
        fragment.f3381t = this.f3529t;
    }

    /* renamed from: n */
    public C0720q mo3678n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f3381t;
        if (fragmentManager == null || fragmentManager == this.f3529t) {
            return super.mo3678n(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3679r(int i) {
        if (this.f3656i) {
            if (FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f3650c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0720q.C0721a aVar = this.f3650c.get(i2);
                Fragment fragment = aVar.f3668b;
                if (fragment != null) {
                    fragment.f3380s += i;
                    if (FragmentManager.m3729F0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3668b + " to " + aVar.f3668b.f3380s);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo3680s(boolean z) {
        if (!this.f3530u) {
            if (FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0745w("FragmentManager"));
                mo3681t("  ", printWriter);
                printWriter.close();
            }
            this.f3530u = true;
            if (this.f3656i) {
                this.f3531v = this.f3529t.mo3591j();
            } else {
                this.f3531v = -1;
            }
            this.f3529t.mo3573Z(this, z);
            return this.f3531v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: t */
    public void mo3681t(String str, PrintWriter printWriter) {
        mo3683u(str, printWriter, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3531v >= 0) {
            sb.append(" #");
            sb.append(this.f3531v);
        }
        if (this.f3658k != null) {
            sb.append(" ");
            sb.append(this.f3658k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo3683u(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3658k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3531v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3530u);
            if (this.f3655h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3655h));
            }
            if (!(this.f3651d == 0 && this.f3652e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3651d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3652e));
            }
            if (!(this.f3653f == 0 && this.f3654g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3653f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3654g));
            }
            if (!(this.f3659l == 0 && this.f3660m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3659l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3660m);
            }
            if (!(this.f3661n == 0 && this.f3662o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3661n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3662o);
            }
        }
        if (!this.f3650c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3650c.size();
            for (int i = 0; i < size; i++) {
                C0720q.C0721a aVar = this.f3650c.get(i);
                switch (aVar.f3667a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3667a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3668b);
                if (z) {
                    if (!(aVar.f3669c == 0 && aVar.f3670d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3669c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3670d));
                    }
                    if (aVar.f3671e != 0 || aVar.f3672f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3671e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3672f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3684v() {
        int size = this.f3650c.size();
        for (int i = 0; i < size; i++) {
            C0720q.C0721a aVar = this.f3650c.get(i);
            Fragment fragment = aVar.f3668b;
            if (fragment != null) {
                fragment.mo3355E1(this.f3655h);
                fragment.mo3367I1(this.f3663p, this.f3664q);
            }
            switch (aVar.f3667a) {
                case 1:
                    fragment.mo3352D1(aVar.f3669c);
                    this.f3529t.mo3587h1(fragment, false);
                    this.f3529t.mo3583g(fragment);
                    break;
                case 3:
                    fragment.mo3352D1(aVar.f3670d);
                    this.f3529t.mo3574Z0(fragment);
                    break;
                case 4:
                    fragment.mo3352D1(aVar.f3670d);
                    this.f3529t.mo3539D0(fragment);
                    break;
                case 5:
                    fragment.mo3352D1(aVar.f3669c);
                    this.f3529t.mo3587h1(fragment, false);
                    this.f3529t.mo3597l1(fragment);
                    break;
                case 6:
                    fragment.mo3352D1(aVar.f3670d);
                    this.f3529t.mo3613y(fragment);
                    break;
                case 7:
                    fragment.mo3352D1(aVar.f3669c);
                    this.f3529t.mo3587h1(fragment, false);
                    this.f3529t.mo3596l(fragment);
                    break;
                case 8:
                    this.f3529t.mo3593j1(fragment);
                    break;
                case 9:
                    this.f3529t.mo3593j1((Fragment) null);
                    break;
                case 10:
                    this.f3529t.mo3590i1(fragment, aVar.f3674h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3667a);
            }
            if (!(this.f3665r || aVar.f3667a == 1 || fragment == null)) {
                if (FragmentManager.f3428P) {
                    this.f3529t.mo3610w(fragment).mo3815k();
                } else {
                    this.f3529t.mo3555N0(fragment);
                }
            }
        }
        if (!this.f3665r) {
            FragmentManager fragmentManager = this.f3529t;
            fragmentManager.mo3557O0(fragmentManager.f3459q, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3685w(boolean z) {
        for (int size = this.f3650c.size() - 1; size >= 0; size--) {
            C0720q.C0721a aVar = this.f3650c.get(size);
            Fragment fragment = aVar.f3668b;
            if (fragment != null) {
                fragment.mo3355E1(FragmentManager.m3747e1(this.f3655h));
                fragment.mo3367I1(this.f3664q, this.f3663p);
            }
            switch (aVar.f3667a) {
                case 1:
                    fragment.mo3352D1(aVar.f3672f);
                    this.f3529t.mo3587h1(fragment, true);
                    this.f3529t.mo3574Z0(fragment);
                    break;
                case 3:
                    fragment.mo3352D1(aVar.f3671e);
                    this.f3529t.mo3583g(fragment);
                    break;
                case 4:
                    fragment.mo3352D1(aVar.f3671e);
                    this.f3529t.mo3597l1(fragment);
                    break;
                case 5:
                    fragment.mo3352D1(aVar.f3672f);
                    this.f3529t.mo3587h1(fragment, true);
                    this.f3529t.mo3539D0(fragment);
                    break;
                case 6:
                    fragment.mo3352D1(aVar.f3671e);
                    this.f3529t.mo3596l(fragment);
                    break;
                case 7:
                    fragment.mo3352D1(aVar.f3672f);
                    this.f3529t.mo3587h1(fragment, true);
                    this.f3529t.mo3613y(fragment);
                    break;
                case 8:
                    this.f3529t.mo3593j1((Fragment) null);
                    break;
                case 9:
                    this.f3529t.mo3593j1(fragment);
                    break;
                case 10:
                    this.f3529t.mo3590i1(fragment, aVar.f3673g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3667a);
            }
            if (!(this.f3665r || aVar.f3667a == 3 || fragment == null)) {
                if (FragmentManager.f3428P) {
                    this.f3529t.mo3610w(fragment).mo3815k();
                } else {
                    this.f3529t.mo3555N0(fragment);
                }
            }
        }
        if (!this.f3665r && z) {
            FragmentManager fragmentManager = this.f3529t;
            fragmentManager.mo3557O0(fragmentManager.f3459q, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public Fragment mo3686x(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3650c.size()) {
            C0720q.C0721a aVar = this.f3650c.get(i);
            int i2 = aVar.f3667a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3668b;
                    int i3 = fragment3.f3386y;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f3386y == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3650c.add(i, new C0720q.C0721a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C0720q.C0721a aVar2 = new C0720q.C0721a(3, fragment4);
                                aVar2.f3669c = aVar.f3669c;
                                aVar2.f3671e = aVar.f3671e;
                                aVar2.f3670d = aVar.f3670d;
                                aVar2.f3672f = aVar.f3672f;
                                this.f3650c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3650c.remove(i);
                        i--;
                    } else {
                        aVar.f3667a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f3668b);
                    Fragment fragment5 = aVar.f3668b;
                    if (fragment5 == fragment2) {
                        this.f3650c.add(i, new C0720q.C0721a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3650c.add(i, new C0720q.C0721a(9, fragment2));
                        i++;
                        fragment2 = aVar.f3668b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f3668b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: y */
    public String mo3687y() {
        return this.f3658k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo3688z(int i) {
        int size = this.f3650c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f3650c.get(i2).f3668b;
            int i3 = fragment != null ? fragment.f3386y : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }
}
