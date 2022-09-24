package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.p */
/* compiled from: FragmentStore */
class C0719p {

    /* renamed from: a */
    private final ArrayList<Fragment> f3645a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0716o> f3646b = new HashMap<>();

    /* renamed from: c */
    private C0712l f3647c;

    C0719p() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3826a(Fragment fragment) {
        if (!this.f3645a.contains(fragment)) {
            synchronized (this.f3645a) {
                this.f3645a.add(fragment);
            }
            fragment.f3374m = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3827b() {
        this.f3646b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3828c(String str) {
        return this.f3646b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3829d(int i) {
        for (C0716o next : this.f3646b.values()) {
            if (next != null) {
                next.mo3821r(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3830e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3646b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0716o next : this.f3646b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment j = next.mo3814j();
                    printWriter.println(j);
                    j.mo3432m(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3645a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3645a.get(i).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment mo3831f(String str) {
        C0716o oVar = this.f3646b.get(str);
        if (oVar != null) {
            return oVar.mo3814j();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3832g(int i) {
        for (int size = this.f3645a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3645a.get(size);
            if (fragment != null && fragment.f3385x == i) {
                return fragment;
            }
        }
        for (C0716o next : this.f3646b.values()) {
            if (next != null) {
                Fragment j = next.mo3814j();
                if (j.f3385x == i) {
                    return j;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo3833h(String str) {
        if (str != null) {
            for (int size = this.f3645a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3645a.get(size);
                if (fragment != null && str.equals(fragment.f3387z)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0716o next : this.f3646b.values()) {
            if (next != null) {
                Fragment j = next.mo3814j();
                if (str.equals(j.f3387z)) {
                    return j;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo3834i(String str) {
        Fragment o;
        for (C0716o next : this.f3646b.values()) {
            if (next != null && (o = next.mo3814j().mo3437o(str)) != null) {
                return o;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo3835j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f3344H;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3645a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f3645a.get(i);
            if (fragment2.f3344H == viewGroup && (view2 = fragment2.f3345I) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3645a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3645a.get(indexOf);
            if (fragment3.f3344H == viewGroup && (view = fragment3.f3345I) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C0716o> mo3836k() {
        ArrayList arrayList = new ArrayList();
        for (C0716o next : this.f3646b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> mo3837l() {
        ArrayList arrayList = new ArrayList();
        for (C0716o next : this.f3646b.values()) {
            if (next != null) {
                arrayList.add(next.mo3814j());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0716o mo3838m(String str) {
        return this.f3646b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public List<Fragment> mo3839n() {
        ArrayList arrayList;
        if (this.f3645a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3645a) {
            arrayList = new ArrayList(this.f3645a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0712l mo3840o() {
        return this.f3647c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3841p(C0716o oVar) {
        Fragment j = oVar.mo3814j();
        if (!mo3828c(j.f3368g)) {
            this.f3646b.put(j.f3368g, oVar);
            if (j.f3340D) {
                if (j.f3339C) {
                    this.f3647c.mo3790e(j);
                } else {
                    this.f3647c.mo3799m(j);
                }
                j.f3340D = false;
            }
            if (FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3842q(C0716o oVar) {
        Fragment j = oVar.mo3814j();
        if (j.f3339C) {
            this.f3647c.mo3799m(j);
        }
        if (this.f3646b.put(j.f3368g, (Object) null) != null && FragmentManager.m3729F0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3843r() {
        Iterator<Fragment> it = this.f3645a.iterator();
        while (it.hasNext()) {
            C0716o oVar = this.f3646b.get(it.next().f3368g);
            if (oVar != null) {
                oVar.mo3815k();
            }
        }
        for (C0716o next : this.f3646b.values()) {
            if (next != null) {
                next.mo3815k();
                Fragment j = next.mo3814j();
                if (j.f3375n && !j.mo3412e0()) {
                    mo3842q(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3844s(Fragment fragment) {
        synchronized (this.f3645a) {
            this.f3645a.remove(fragment);
        }
        fragment.f3374m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3845t() {
        this.f3646b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3846u(List<String> list) {
        this.f3645a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo3831f(next);
                if (f != null) {
                    if (FragmentManager.m3729F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f);
                    }
                    mo3826a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public ArrayList<FragmentState> mo3847v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f3646b.size());
        for (C0716o next : this.f3646b.values()) {
            if (next != null) {
                Fragment j = next.mo3814j();
                FragmentState p = next.mo3819p();
                arrayList.add(p);
                if (FragmentManager.m3729F0(2)) {
                    Log.v("FragmentManager", "Saved state of " + j + ": " + p.f3516n);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public ArrayList<String> mo3848w() {
        synchronized (this.f3645a) {
            if (this.f3645a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3645a.size());
            Iterator<Fragment> it = this.f3645a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f3368g);
                if (FragmentManager.m3729F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f3368g + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3849x(C0712l lVar) {
        this.f3647c = lVar;
    }
}
