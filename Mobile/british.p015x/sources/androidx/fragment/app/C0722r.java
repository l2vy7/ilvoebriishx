package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1296d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p090i0.C5421b;
import p111m0.C5720r;
import p111m0.C5723u;
import p150t.C6077a;

/* renamed from: androidx.fragment.app.r */
/* compiled from: FragmentTransition */
class C0722r {

    /* renamed from: a */
    private static final int[] f3675a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final C0737t f3676b = (Build.VERSION.SDK_INT >= 21 ? new C0731s() : null);

    /* renamed from: c */
    static final C0737t f3677c = m4115w();

    /* renamed from: androidx.fragment.app.r$a */
    /* compiled from: FragmentTransition */
    class C0723a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0729g f3678b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3679c;

        /* renamed from: d */
        final /* synthetic */ C5421b f3680d;

        C0723a(C0729g gVar, Fragment fragment, C5421b bVar) {
            this.f3678b = gVar;
            this.f3679c = fragment;
            this.f3680d = bVar;
        }

        public void run() {
            this.f3678b.mo3625a(this.f3679c, this.f3680d);
        }
    }

    /* renamed from: androidx.fragment.app.r$b */
    /* compiled from: FragmentTransition */
    class C0724b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f3681b;

        C0724b(ArrayList arrayList) {
            this.f3681b = arrayList;
        }

        public void run() {
            C0722r.m4091A(this.f3681b, 4);
        }
    }

    /* renamed from: androidx.fragment.app.r$c */
    /* compiled from: FragmentTransition */
    class C0725c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0729g f3682b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3683c;

        /* renamed from: d */
        final /* synthetic */ C5421b f3684d;

        C0725c(C0729g gVar, Fragment fragment, C5421b bVar) {
            this.f3682b = gVar;
            this.f3683c = fragment;
            this.f3684d = bVar;
        }

        public void run() {
            this.f3682b.mo3625a(this.f3683c, this.f3684d);
        }
    }

    /* renamed from: androidx.fragment.app.r$d */
    /* compiled from: FragmentTransition */
    class C0726d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f3685b;

        /* renamed from: c */
        final /* synthetic */ C0737t f3686c;

        /* renamed from: d */
        final /* synthetic */ View f3687d;

        /* renamed from: e */
        final /* synthetic */ Fragment f3688e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3689f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f3690g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f3691h;

        /* renamed from: i */
        final /* synthetic */ Object f3692i;

        C0726d(Object obj, C0737t tVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3685b = obj;
            this.f3686c = tVar;
            this.f3687d = view;
            this.f3688e = fragment;
            this.f3689f = arrayList;
            this.f3690g = arrayList2;
            this.f3691h = arrayList3;
            this.f3692i = obj2;
        }

        public void run() {
            Object obj = this.f3685b;
            if (obj != null) {
                this.f3686c.mo3874p(obj, this.f3687d);
                this.f3690g.addAll(C0722r.m4103k(this.f3686c, this.f3685b, this.f3688e, this.f3689f, this.f3687d));
            }
            if (this.f3691h != null) {
                if (this.f3692i != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f3687d);
                    this.f3686c.mo3875q(this.f3692i, this.f3691h, arrayList);
                }
                this.f3691h.clear();
                this.f3691h.add(this.f3687d);
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$e */
    /* compiled from: FragmentTransition */
    class C0727e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Fragment f3693b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3694c;

        /* renamed from: d */
        final /* synthetic */ boolean f3695d;

        /* renamed from: e */
        final /* synthetic */ C6077a f3696e;

        /* renamed from: f */
        final /* synthetic */ View f3697f;

        /* renamed from: g */
        final /* synthetic */ C0737t f3698g;

        /* renamed from: h */
        final /* synthetic */ Rect f3699h;

        C0727e(Fragment fragment, Fragment fragment2, boolean z, C6077a aVar, View view, C0737t tVar, Rect rect) {
            this.f3693b = fragment;
            this.f3694c = fragment2;
            this.f3695d = z;
            this.f3696e = aVar;
            this.f3697f = view;
            this.f3698g = tVar;
            this.f3699h = rect;
        }

        public void run() {
            C0722r.m4098f(this.f3693b, this.f3694c, this.f3695d, this.f3696e, false);
            View view = this.f3697f;
            if (view != null) {
                this.f3698g.mo3901k(view, this.f3699h);
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$f */
    /* compiled from: FragmentTransition */
    class C0728f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0737t f3700b;

        /* renamed from: c */
        final /* synthetic */ C6077a f3701c;

        /* renamed from: d */
        final /* synthetic */ Object f3702d;

        /* renamed from: e */
        final /* synthetic */ C0730h f3703e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3704f;

        /* renamed from: g */
        final /* synthetic */ View f3705g;

        /* renamed from: h */
        final /* synthetic */ Fragment f3706h;

        /* renamed from: i */
        final /* synthetic */ Fragment f3707i;

        /* renamed from: j */
        final /* synthetic */ boolean f3708j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f3709k;

        /* renamed from: l */
        final /* synthetic */ Object f3710l;

        /* renamed from: m */
        final /* synthetic */ Rect f3711m;

        C0728f(C0737t tVar, C6077a aVar, Object obj, C0730h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3700b = tVar;
            this.f3701c = aVar;
            this.f3702d = obj;
            this.f3703e = hVar;
            this.f3704f = arrayList;
            this.f3705g = view;
            this.f3706h = fragment;
            this.f3707i = fragment2;
            this.f3708j = z;
            this.f3709k = arrayList2;
            this.f3710l = obj2;
            this.f3711m = rect;
        }

        public void run() {
            C6077a<String, View> h = C0722r.m4100h(this.f3700b, this.f3701c, this.f3702d, this.f3703e);
            if (h != null) {
                this.f3704f.addAll(h.values());
                this.f3704f.add(this.f3705g);
            }
            C0722r.m4098f(this.f3706h, this.f3707i, this.f3708j, h, false);
            Object obj = this.f3702d;
            if (obj != null) {
                this.f3700b.mo3865A(obj, this.f3709k, this.f3704f);
                View s = C0722r.m4111s(h, this.f3703e, this.f3710l, this.f3708j);
                if (s != null) {
                    this.f3700b.mo3901k(s, this.f3711m);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$g */
    /* compiled from: FragmentTransition */
    interface C0729g {
        /* renamed from: a */
        void mo3625a(Fragment fragment, C5421b bVar);

        /* renamed from: b */
        void mo3626b(Fragment fragment, C5421b bVar);
    }

    /* renamed from: androidx.fragment.app.r$h */
    /* compiled from: FragmentTransition */
    static class C0730h {

        /* renamed from: a */
        public Fragment f3712a;

        /* renamed from: b */
        public boolean f3713b;

        /* renamed from: c */
        public C0674a f3714c;

        /* renamed from: d */
        public Fragment f3715d;

        /* renamed from: e */
        public boolean f3716e;

        /* renamed from: f */
        public C0674a f3717f;

        C0730h() {
        }
    }

    /* renamed from: A */
    static void m4091A(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: B */
    static void m4092B(Context context, C0704e eVar, ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C0729g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0674a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m4097e(aVar, sparseArray, z);
            } else {
                m4095c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C6077a<String, String> d = m4096d(keyAt, arrayList, arrayList2, i, i2);
                C0730h hVar = (C0730h) sparseArray.valueAt(i4);
                if (eVar.mo3488h() && (viewGroup = (ViewGroup) eVar.mo3487f(keyAt)) != null) {
                    if (z) {
                        m4107o(viewGroup, hVar, view, d, gVar);
                    } else {
                        m4106n(viewGroup, hVar, view, d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m4093a(ArrayList<View> arrayList, C6077a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View o = aVar.mo23391o(size);
            if (collection.contains(C5723u.m25283K(o))) {
                arrayList.add(o);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f3374m != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        if (r0.f3337A == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m4094b(androidx.fragment.app.C0674a r8, androidx.fragment.app.C0720q.C0721a r9, android.util.SparseArray<androidx.fragment.app.C0722r.C0730h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f3668b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f3386y
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f3675a
            int r9 = r9.f3667a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f3667a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
            r3 = 0
        L_0x002a:
            r4 = 0
            goto L_0x0092
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f3351O
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.f3337A
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.f3374m
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003c:
            boolean r9 = r0.f3337A
            goto L_0x008f
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f3351O
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f3374m
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f3337A
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f3374m
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f3337A
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0072
            boolean r9 = r0.f3374m
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f3345I
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f3352P
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x007b
        L_0x0070:
            r9 = 0
            goto L_0x007b
        L_0x0072:
            boolean r9 = r0.f3374m
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f3337A
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L_0x0092
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.f3350N
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.f3374m
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.f3337A
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r2 = r9
            r9 = 0
            goto L_0x002a
        L_0x0092:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.r$h r5 = (androidx.fragment.app.C0722r.C0730h) r5
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.r$h r5 = m4108p(r5, r10, r1)
            r5.f3712a = r0
            r5.f3713b = r11
            r5.f3714c = r8
        L_0x00a4:
            r2 = 0
            if (r12 != 0) goto L_0x00c5
            if (r3 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00b1
            androidx.fragment.app.Fragment r3 = r5.f3715d
            if (r3 != r0) goto L_0x00b1
            r5.f3715d = r2
        L_0x00b1:
            boolean r3 = r8.f3665r
            if (r3 != 0) goto L_0x00c5
            androidx.fragment.app.FragmentManager r3 = r8.f3529t
            androidx.fragment.app.o r6 = r3.mo3610w(r0)
            androidx.fragment.app.p r7 = r3.mo3604s0()
            r7.mo3841p(r6)
            r3.mo3559P0(r0)
        L_0x00c5:
            if (r4 == 0) goto L_0x00d7
            if (r5 == 0) goto L_0x00cd
            androidx.fragment.app.Fragment r3 = r5.f3715d
            if (r3 != 0) goto L_0x00d7
        L_0x00cd:
            androidx.fragment.app.r$h r5 = m4108p(r5, r10, r1)
            r5.f3715d = r0
            r5.f3716e = r11
            r5.f3717f = r8
        L_0x00d7:
            if (r12 != 0) goto L_0x00e3
            if (r9 == 0) goto L_0x00e3
            if (r5 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r8 = r5.f3712a
            if (r8 != r0) goto L_0x00e3
            r5.f3712a = r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0722r.m4094b(androidx.fragment.app.a, androidx.fragment.app.q$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m4095c(C0674a aVar, SparseArray<C0730h> sparseArray, boolean z) {
        int size = aVar.f3650c.size();
        for (int i = 0; i < size; i++) {
            m4094b(aVar, aVar.f3650c.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C6077a<String, String> m4096d(int i, ArrayList<C0674a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C6077a<String, String> aVar = new C6077a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0674a aVar2 = arrayList.get(i4);
            if (aVar2.mo3688z(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3663p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f3663p;
                        arrayList4 = aVar2.f3664q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f3663p;
                        arrayList3 = aVar2.f3664q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m4097e(C0674a aVar, SparseArray<C0730h> sparseArray, boolean z) {
        if (aVar.f3529t.mo3601p0().mo3488h()) {
            for (int size = aVar.f3650c.size() - 1; size >= 0; size--) {
                m4094b(aVar, aVar.f3650c.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m4098f(Fragment fragment, Fragment fragment2, boolean z, C6077a<String, View> aVar, boolean z2) {
        if (z) {
            fragment2.mo3473z();
        } else {
            fragment.mo3473z();
        }
    }

    /* renamed from: g */
    private static boolean m4099g(C0737t tVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!tVar.mo3870e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C6077a<String, View> m4100h(C0737t tVar, C6077a<String, String> aVar, Object obj, C0730h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3712a;
        View W = fragment.mo3398W();
        if (aVar.isEmpty() || obj == null || W == null) {
            aVar.clear();
            return null;
        }
        C6077a<String, View> aVar2 = new C6077a<>();
        tVar.mo3900j(aVar2, W);
        C0674a aVar3 = hVar.f3714c;
        if (hVar.f3713b) {
            fragment.mo3344B();
            arrayList = aVar3.f3663p;
        } else {
            fragment.mo3473z();
            arrayList = aVar3.f3664q;
        }
        if (arrayList != null) {
            aVar2.mo23263q(arrayList);
            aVar2.mo23263q(aVar.values());
        }
        m4116x(aVar, aVar2);
        return aVar2;
    }

    /* renamed from: i */
    private static C6077a<String, View> m4101i(C0737t tVar, C6077a<String, String> aVar, Object obj, C0730h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f3715d;
        C6077a<String, View> aVar2 = new C6077a<>();
        tVar.mo3900j(aVar2, fragment.mo3462u1());
        C0674a aVar3 = hVar.f3717f;
        if (hVar.f3716e) {
            fragment.mo3473z();
            arrayList = aVar3.f3664q;
        } else {
            fragment.mo3344B();
            arrayList = aVar3.f3663p;
        }
        if (arrayList != null) {
            aVar2.mo23263q(arrayList);
        }
        aVar.mo23263q(aVar2.keySet());
        return aVar2;
    }

    /* renamed from: j */
    private static C0737t m4102j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object A = fragment.mo3341A();
            if (A != null) {
                arrayList.add(A);
            }
            Object P = fragment.mo3384P();
            if (P != null) {
                arrayList.add(P);
            }
            Object R = fragment.mo3388R();
            if (R != null) {
                arrayList.add(R);
            }
        }
        if (fragment2 != null) {
            Object y = fragment2.mo3470y();
            if (y != null) {
                arrayList.add(y);
            }
            Object M = fragment2.mo3377M();
            if (M != null) {
                arrayList.add(M);
            }
            Object Q = fragment2.mo3386Q();
            if (Q != null) {
                arrayList.add(Q);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0737t tVar = f3676b;
        if (tVar != null && m4099g(tVar, arrayList)) {
            return tVar;
        }
        C0737t tVar2 = f3677c;
        if (tVar2 != null && m4099g(tVar2, arrayList)) {
            return tVar2;
        }
        if (tVar == null && tVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m4103k(C0737t tVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View W = fragment.mo3398W();
        if (W != null) {
            tVar.mo3899f(arrayList2, W);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        tVar.mo3868b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m4104l(C0737t tVar, ViewGroup viewGroup, View view, C6077a<String, String> aVar, C0730h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C6077a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0737t tVar2 = tVar;
        C0730h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3712a;
        Fragment fragment2 = hVar2.f3715d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3713b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m4112t(tVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C6077a<String, View> i = m4101i(tVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m4098f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            tVar2.mo3881z(obj4, view, arrayList3);
            m4118z(tVar, obj4, obj2, i, hVar2.f3716e, hVar2.f3717f);
            if (obj5 != null) {
                tVar2.mo3878u(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0728f fVar = r0;
        C0728f fVar2 = new C0728f(tVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C5720r.m25259a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: m */
    private static Object m4105m(C0737t tVar, ViewGroup viewGroup, View view, C6077a<String, String> aVar, C0730h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        C0737t tVar2 = tVar;
        View view3 = view;
        C6077a<String, String> aVar2 = aVar;
        C0730h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3712a;
        Fragment fragment2 = hVar2.f3715d;
        if (fragment != null) {
            fragment.mo3462u1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3713b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m4112t(tVar, fragment, fragment2, z);
        }
        C6077a<String, View> i = m4101i(tVar, aVar2, obj3, hVar2);
        C6077a<String, View> h = m4100h(tVar, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj4 = null;
        } else {
            m4093a(arrayList3, i, aVar.keySet());
            m4093a(arrayList4, h, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m4098f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            tVar.mo3881z(obj4, view3, arrayList3);
            m4118z(tVar, obj4, obj2, i, hVar2.f3716e, hVar2.f3717f);
            Rect rect2 = new Rect();
            View s = m4111s(h, hVar2, obj5, z);
            if (s != null) {
                tVar.mo3878u(obj5, rect2);
            }
            rect = rect2;
            view2 = s;
        } else {
            view2 = null;
            rect = null;
        }
        C5720r.m25259a(viewGroup, new C0727e(fragment, fragment2, z, h, view2, tVar, rect));
        return obj4;
    }

    /* renamed from: n */
    private static void m4106n(ViewGroup viewGroup, C0730h hVar, View view, C6077a<String, String> aVar, C0729g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        C0730h hVar2 = hVar;
        View view2 = view;
        C6077a<String, String> aVar2 = aVar;
        C0729g gVar2 = gVar;
        Fragment fragment = hVar2.f3712a;
        Fragment fragment2 = hVar2.f3715d;
        C0737t j = m4102j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f3713b;
            boolean z2 = hVar2.f3716e;
            Object q = m4109q(j, fragment, z);
            Object r = m4110r(j, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = r;
            C0737t tVar = j;
            Object l = m4104l(j, viewGroup, view, aVar, hVar, arrayList, arrayList2, q, obj2);
            Object obj3 = q;
            if (obj3 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = m4103k(tVar, obj, fragment2, arrayList4, view2);
            if (k == null || k.isEmpty()) {
                obj = null;
            }
            Object obj4 = obj;
            tVar.mo3867a(obj3, view2);
            Object u = m4113u(tVar, obj3, obj4, l, fragment, hVar2.f3713b);
            if (!(fragment2 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                C5421b bVar = new C5421b();
                gVar2.mo3626b(fragment2, bVar);
                tVar.mo3880w(fragment2, u, bVar, new C0725c(gVar2, fragment2, bVar));
            }
            if (u != null) {
                ArrayList arrayList5 = new ArrayList();
                C0737t tVar2 = tVar;
                tVar2.mo3877t(u, obj3, arrayList5, obj4, k, l, arrayList2);
                m4117y(tVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList5, obj4, k);
                ViewGroup viewGroup3 = viewGroup;
                C0737t tVar3 = tVar;
                ArrayList arrayList6 = arrayList2;
                tVar3.mo3904x(viewGroup3, arrayList6, aVar2);
                tVar3.mo3869c(viewGroup3, u);
                tVar3.mo3903s(viewGroup3, arrayList6, aVar2);
            }
        }
    }

    /* renamed from: o */
    private static void m4107o(ViewGroup viewGroup, C0730h hVar, View view, C6077a<String, String> aVar, C0729g gVar) {
        Object obj;
        C0730h hVar2 = hVar;
        View view2 = view;
        C0729g gVar2 = gVar;
        Fragment fragment = hVar2.f3712a;
        Fragment fragment2 = hVar2.f3715d;
        C0737t j = m4102j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f3713b;
            boolean z2 = hVar2.f3716e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object q = m4109q(j, fragment, z);
            Object r = m4110r(j, fragment2, z2);
            ArrayList arrayList3 = arrayList2;
            Object m = m4105m(j, viewGroup, view, aVar, hVar, arrayList2, arrayList, q, r);
            Object obj2 = q;
            if (obj2 == null && m == null) {
                obj = r;
                if (obj == null) {
                    return;
                }
            } else {
                obj = r;
            }
            ArrayList<View> k = m4103k(j, obj, fragment2, arrayList3, view2);
            ArrayList<View> k2 = m4103k(j, obj2, fragment, arrayList, view2);
            m4091A(k2, 4);
            Fragment fragment3 = fragment;
            ArrayList<View> arrayList4 = k;
            Object u = m4113u(j, obj2, obj, m, fragment3, z);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                C5421b bVar = new C5421b();
                C0729g gVar3 = gVar;
                gVar3.mo3626b(fragment2, bVar);
                j.mo3880w(fragment2, u, bVar, new C0723a(gVar3, fragment2, bVar));
            }
            if (u != null) {
                m4114v(j, obj, fragment2, arrayList4);
                ArrayList<String> o = j.mo3902o(arrayList);
                C0737t tVar = j;
                tVar.mo3877t(u, obj2, k2, obj, arrayList4, m, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j.mo3869c(viewGroup2, u);
                tVar.mo3905y(viewGroup2, arrayList3, arrayList, o, aVar);
                m4091A(k2, 0);
                j.mo3865A(m, arrayList3, arrayList);
            }
        }
    }

    /* renamed from: p */
    private static C0730h m4108p(C0730h hVar, SparseArray<C0730h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C0730h hVar2 = new C0730h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static Object m4109q(C0737t tVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo3377M();
        } else {
            obj = fragment.mo3470y();
        }
        return tVar.mo3871g(obj);
    }

    /* renamed from: r */
    private static Object m4110r(C0737t tVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo3384P();
        } else {
            obj = fragment.mo3341A();
        }
        return tVar.mo3871g(obj);
    }

    /* renamed from: s */
    static View m4111s(C6077a<String, View> aVar, C0730h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        C0674a aVar2 = hVar.f3714c;
        if (obj == null || aVar == null || (arrayList = aVar2.f3663p) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.f3663p.get(0);
        } else {
            str = aVar2.f3664q.get(0);
        }
        return aVar.get(str);
    }

    /* renamed from: t */
    private static Object m4112t(C0737t tVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.mo3388R();
        } else {
            obj = fragment.mo3386Q();
        }
        return tVar.mo3866B(tVar.mo3871g(obj));
    }

    /* renamed from: u */
    private static Object m4113u(C0737t tVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.mo3449r() : fragment.mo3446q();
        }
        if (z2) {
            return tVar.mo3873n(obj2, obj, obj3);
        }
        return tVar.mo3872m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m4114v(C0737t tVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f3374m && fragment.f3337A && fragment.f3351O) {
            fragment.mo3349C1(true);
            tVar.mo3876r(obj, fragment.mo3398W(), arrayList);
            C5720r.m25259a(fragment.f3344H, new C0724b(arrayList));
        }
    }

    /* renamed from: w */
    private static C0737t m4115w() {
        try {
            return C1296d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    static void m4116x(C6077a<String, String> aVar, C6077a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo23391o(size))) {
                aVar.mo159m(size);
            }
        }
    }

    /* renamed from: y */
    private static void m4117y(C0737t tVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        C5720r.m25259a(viewGroup, new C0726d(obj, tVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m4118z(C0737t tVar, Object obj, Object obj2, C6077a<String, View> aVar, boolean z, C0674a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f3663p;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.f3664q.get(0);
            } else {
                str = aVar2.f3663p.get(0);
            }
            View view = aVar.get(str);
            tVar.mo3879v(obj, view);
            if (obj2 != null) {
                tVar.mo3879v(obj2, view);
            }
        }
    }
}
