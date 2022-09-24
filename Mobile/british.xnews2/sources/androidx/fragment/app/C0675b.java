package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0696d;
import androidx.fragment.app.C0746x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p089i0.C5421b;
import p110m0.C5720r;
import p110m0.C5723u;
import p110m0.C5738w;
import p149t.C6077a;

/* renamed from: androidx.fragment.app.b */
/* compiled from: DefaultSpecialEffectsController */
class C0675b extends C0746x {

    /* renamed from: f */
    private final HashMap<C0746x.C0751e, HashSet<C5421b>> f3532f = new HashMap<>();

    /* renamed from: androidx.fragment.app.b$a */
    /* compiled from: DefaultSpecialEffectsController */
    class C0676a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0689m f3533b;

        C0676a(C0689m mVar) {
            this.f3533b = mVar;
        }

        public void run() {
            C0675b.this.mo3694u(this.f3533b.mo3711c(), this.f3533b.mo3713e());
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    /* compiled from: DefaultSpecialEffectsController */
    static /* synthetic */ class C0677b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3535a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.x$e$d[] r0 = androidx.fragment.app.C0746x.C0751e.C0755d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3535a = r0
                androidx.fragment.app.x$e$d r1 = androidx.fragment.app.C0746x.C0751e.C0755d.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3535a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.x$e$d r1 = androidx.fragment.app.C0746x.C0751e.C0755d.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3535a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.x$e$d r1 = androidx.fragment.app.C0746x.C0751e.C0755d.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3535a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.x$e$d r1 = androidx.fragment.app.C0746x.C0751e.C0755d.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0675b.C0677b.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    /* compiled from: DefaultSpecialEffectsController */
    class C0678c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0746x.C0751e f3536b;

        C0678c(C0746x.C0751e eVar) {
            this.f3536b = eVar;
        }

        public void run() {
            View C;
            if (this.f3536b.mo3940d() == C0746x.C0751e.C0755d.VISIBLE && (C = this.f3536b.mo3941e().mo3347C()) != null) {
                C.requestFocus();
                this.f3536b.mo3941e().mo3346B1((View) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    /* compiled from: DefaultSpecialEffectsController */
    class C0679d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ List f3538b;

        /* renamed from: c */
        final /* synthetic */ C0746x.C0751e f3539c;

        C0679d(List list, C0746x.C0751e eVar) {
            this.f3538b = list;
            this.f3539c = eVar;
        }

        public void run() {
            if (this.f3538b.contains(this.f3539c)) {
                this.f3538b.remove(this.f3539c);
                C0675b.this.mo3690q(this.f3539c);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$e */
    /* compiled from: DefaultSpecialEffectsController */
    class C0680e implements C5421b.C5422a {

        /* renamed from: a */
        final /* synthetic */ C0746x.C0751e f3541a;

        C0680e(C0746x.C0751e eVar) {
            this.f3541a = eVar;
        }

        public void onCancel() {
            C0675b.this.mo3691r(this.f3541a);
        }
    }

    /* renamed from: androidx.fragment.app.b$f */
    /* compiled from: DefaultSpecialEffectsController */
    class C0681f implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3543a;

        /* renamed from: b */
        final /* synthetic */ View f3544b;

        /* renamed from: c */
        final /* synthetic */ C0746x.C0751e f3545c;

        /* renamed from: d */
        final /* synthetic */ C5421b f3546d;

        /* renamed from: androidx.fragment.app.b$f$a */
        /* compiled from: DefaultSpecialEffectsController */
        class C0682a implements Runnable {
            C0682a() {
            }

            public void run() {
                C0681f fVar = C0681f.this;
                fVar.f3543a.endViewTransition(fVar.f3544b);
                C0681f fVar2 = C0681f.this;
                C0675b.this.mo3694u(fVar2.f3545c, fVar2.f3546d);
            }
        }

        C0681f(ViewGroup viewGroup, View view, C0746x.C0751e eVar, C5421b bVar) {
            this.f3543a = viewGroup;
            this.f3544b = view;
            this.f3545c = eVar;
            this.f3546d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3543a.post(new C0682a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.b$g */
    /* compiled from: DefaultSpecialEffectsController */
    class C0683g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3549a;

        /* renamed from: b */
        final /* synthetic */ View f3550b;

        /* renamed from: c */
        final /* synthetic */ C0746x.C0751e f3551c;

        /* renamed from: d */
        final /* synthetic */ C5421b f3552d;

        C0683g(ViewGroup viewGroup, View view, C0746x.C0751e eVar, C5421b bVar) {
            this.f3549a = viewGroup;
            this.f3550b = view;
            this.f3551c = eVar;
            this.f3552d = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3549a.endViewTransition(this.f3550b);
            C0675b.this.mo3694u(this.f3551c, this.f3552d);
        }
    }

    /* renamed from: androidx.fragment.app.b$h */
    /* compiled from: DefaultSpecialEffectsController */
    class C0684h implements C5421b.C5422a {

        /* renamed from: a */
        final /* synthetic */ View f3554a;

        C0684h(View view) {
            this.f3554a = view;
        }

        public void onCancel() {
            this.f3554a.clearAnimation();
        }
    }

    /* renamed from: androidx.fragment.app.b$i */
    /* compiled from: DefaultSpecialEffectsController */
    class C0685i implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0746x.C0751e f3556b;

        /* renamed from: c */
        final /* synthetic */ C0746x.C0751e f3557c;

        /* renamed from: d */
        final /* synthetic */ boolean f3558d;

        /* renamed from: e */
        final /* synthetic */ C6077a f3559e;

        C0685i(C0746x.C0751e eVar, C0746x.C0751e eVar2, boolean z, C6077a aVar) {
            this.f3556b = eVar;
            this.f3557c = eVar2;
            this.f3558d = z;
            this.f3559e = aVar;
        }

        public void run() {
            C0722r.m4098f(this.f3556b.mo3941e(), this.f3557c.mo3941e(), this.f3558d, this.f3559e, false);
        }
    }

    /* renamed from: androidx.fragment.app.b$j */
    /* compiled from: DefaultSpecialEffectsController */
    class C0686j implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0737t f3561b;

        /* renamed from: c */
        final /* synthetic */ View f3562c;

        /* renamed from: d */
        final /* synthetic */ Rect f3563d;

        C0686j(C0737t tVar, View view, Rect rect) {
            this.f3561b = tVar;
            this.f3562c = view;
            this.f3563d = rect;
        }

        public void run() {
            this.f3561b.mo3901k(this.f3562c, this.f3563d);
        }
    }

    /* renamed from: androidx.fragment.app.b$k */
    /* compiled from: DefaultSpecialEffectsController */
    class C0687k implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f3565b;

        C0687k(ArrayList arrayList) {
            this.f3565b = arrayList;
        }

        public void run() {
            C0722r.m4091A(this.f3565b, 4);
        }
    }

    /* renamed from: androidx.fragment.app.b$l */
    /* compiled from: DefaultSpecialEffectsController */
    private static class C0688l {

        /* renamed from: a */
        private final C0746x.C0751e f3567a;

        /* renamed from: b */
        private final C5421b f3568b;

        C0688l(C0746x.C0751e eVar, C5421b bVar) {
            this.f3567a = eVar;
            this.f3568b = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0746x.C0751e mo3708a() {
            return this.f3567a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5421b mo3709b() {
            return this.f3568b;
        }
    }

    /* renamed from: androidx.fragment.app.b$m */
    /* compiled from: DefaultSpecialEffectsController */
    private static class C0689m {

        /* renamed from: a */
        private final C0746x.C0751e f3569a;

        /* renamed from: b */
        private final C5421b f3570b;

        /* renamed from: c */
        private final Object f3571c;

        /* renamed from: d */
        private final boolean f3572d;

        /* renamed from: e */
        private final Object f3573e;

        C0689m(C0746x.C0751e eVar, C5421b bVar, boolean z, boolean z2) {
            Object obj;
            Object obj2;
            boolean z3;
            this.f3569a = eVar;
            this.f3570b = bVar;
            if (eVar.mo3940d() == C0746x.C0751e.C0755d.VISIBLE) {
                if (z) {
                    obj2 = eVar.mo3941e().mo3377M();
                } else {
                    obj2 = eVar.mo3941e().mo3470y();
                }
                this.f3571c = obj2;
                if (z) {
                    z3 = eVar.mo3941e().mo3449r();
                } else {
                    z3 = eVar.mo3941e().mo3446q();
                }
                this.f3572d = z3;
            } else {
                if (z) {
                    obj = eVar.mo3941e().mo3384P();
                } else {
                    obj = eVar.mo3941e().mo3341A();
                }
                this.f3571c = obj;
                this.f3572d = true;
            }
            if (!z2) {
                this.f3573e = null;
            } else if (z) {
                this.f3573e = eVar.mo3941e().mo3388R();
            } else {
                this.f3573e = eVar.mo3941e().mo3386Q();
            }
        }

        /* renamed from: b */
        private C0737t m3917b(Object obj) {
            if (obj == null) {
                return null;
            }
            C0737t tVar = C0722r.f3676b;
            if (tVar != null && tVar.mo3870e(obj)) {
                return tVar;
            }
            C0737t tVar2 = C0722r.f3677c;
            if (tVar2 != null && tVar2.mo3870e(obj)) {
                return tVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f3569a.mo3941e() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0737t mo3710a() {
            C0737t b = m3917b(this.f3571c);
            C0737t b2 = m3917b(this.f3573e);
            if (b == null || b2 == null || b == b2) {
                return b != null ? b : b2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f3569a.mo3941e() + " returned Transition " + this.f3571c + " which uses a different Transition  type than its shared element transition " + this.f3573e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0746x.C0751e mo3711c() {
            return this.f3569a;
        }

        /* renamed from: d */
        public Object mo3712d() {
            return this.f3573e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C5421b mo3713e() {
            return this.f3570b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Object mo3714f() {
            return this.f3571c;
        }

        /* renamed from: g */
        public boolean mo3715g() {
            return this.f3573e != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo3716h() {
            return this.f3572d;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.C0746x.C0751e.C0755d.VISIBLE;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3717i() {
            /*
                r3 = this;
                androidx.fragment.app.x$e r0 = r3.f3569a
                androidx.fragment.app.Fragment r0 = r0.mo3941e()
                android.view.View r0 = r0.f3345I
                androidx.fragment.app.x$e$d r0 = androidx.fragment.app.C0746x.C0751e.C0755d.m4210c(r0)
                androidx.fragment.app.x$e r1 = r3.f3569a
                androidx.fragment.app.x$e$d r1 = r1.mo3940d()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.x$e$d r2 = androidx.fragment.app.C0746x.C0751e.C0755d.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0675b.C0689m.mo3717i():boolean");
        }
    }

    C0675b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: p */
    private void m3905p(C0746x.C0751e eVar, C5421b bVar) {
        if (this.f3532f.get(eVar) == null) {
            this.f3532f.put(eVar, new HashSet());
        }
        this.f3532f.get(eVar).add(bVar);
    }

    /* renamed from: w */
    private void m3906w(C0746x.C0751e eVar, C5421b bVar, boolean z, boolean z2) {
        C0746x.C0751e.C0755d dVar;
        Animation animation;
        ViewGroup k = mo3933k();
        Context context = k.getContext();
        Fragment e = eVar.mo3941e();
        View view = e.f3345I;
        C0746x.C0751e.C0755d c = C0746x.C0751e.C0755d.m4210c(view);
        C0746x.C0751e.C0755d d = eVar.mo3940d();
        if (c == d || !(c == (dVar = C0746x.C0751e.C0755d.VISIBLE) || d == dVar)) {
            mo3694u(eVar, bVar);
            return;
        }
        C0696d.C0701d b = C0696d.m3959b(context, e, d == dVar);
        if (b == null) {
            mo3694u(eVar, bVar);
        } else if (z && b.f3607a != null) {
            if (FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + e + " as Animations cannot run alongside Transitions.");
            }
            mo3694u(eVar, bVar);
        } else if (z2) {
            if (FragmentManager.m3729F0(2)) {
                Log.v("FragmentManager", "Ignoring Animator set on " + e + " as this Fragment was involved in a Transition.");
            }
            mo3694u(eVar, bVar);
        } else {
            k.startViewTransition(view);
            if (b.f3607a != null) {
                if (eVar.mo3940d() == dVar) {
                    animation = new C0696d.C0703f(b.f3607a);
                } else {
                    animation = new C0696d.C0702e(b.f3607a, k, view);
                }
                animation.setAnimationListener(new C0681f(k, view, eVar, bVar));
                view.startAnimation(animation);
            } else {
                b.f3608b.addListener(new C0683g(k, view, eVar, bVar));
                b.f3608b.setTarget(view);
                b.f3608b.start();
            }
            bVar.mo21874d(new C0684h(view));
        }
    }

    /* renamed from: x */
    private Map<C0746x.C0751e, Boolean> m3907x(List<C0689m> list, boolean z, C0746x.C0751e eVar, C0746x.C0751e eVar2) {
        View view;
        View view2;
        C0746x.C0751e eVar3;
        Object obj;
        Object obj2;
        C6077a aVar;
        C0746x.C0751e eVar4;
        C0737t tVar;
        View view3;
        Rect rect;
        ArrayList arrayList;
        ArrayList arrayList2;
        C0746x.C0751e eVar5;
        boolean z2 = z;
        C0746x.C0751e eVar6 = eVar;
        C0746x.C0751e eVar7 = eVar2;
        HashMap hashMap = new HashMap();
        C0737t tVar2 = null;
        for (C0689m next : list) {
            if (!next.mo3717i()) {
                C0737t a = next.mo3710a();
                if (tVar2 == null) {
                    tVar2 = a;
                } else if (!(a == null || tVar2 == a)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.mo3711c().mo3941e() + " returned Transition " + next.mo3714f() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (tVar2 == null) {
            for (C0689m next2 : list) {
                hashMap.put(next2.mo3711c(), Boolean.FALSE);
                mo3694u(next2.mo3711c(), next2.mo3713e());
            }
            return hashMap;
        }
        View view4 = new View(mo3933k().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C6077a aVar2 = new C6077a();
        Object obj3 = null;
        View view5 = null;
        boolean z3 = false;
        for (C0689m next3 : list) {
            if (!next3.mo3715g() || eVar6 == null || eVar7 == null) {
                aVar = aVar2;
                arrayList2 = arrayList4;
                eVar5 = eVar6;
                arrayList = arrayList3;
                rect = rect2;
                view3 = view4;
                tVar = tVar2;
                eVar4 = eVar7;
                view5 = view5;
            } else {
                Object B = tVar2.mo3866B(tVar2.mo3871g(next3.mo3712d()));
                ArrayList<String> S = eVar2.mo3941e().mo3390S();
                ArrayList<String> S2 = eVar.mo3941e().mo3390S();
                ArrayList<String> T = eVar.mo3941e().mo3392T();
                Object obj4 = B;
                View view6 = view5;
                int i = 0;
                while (i < T.size()) {
                    int indexOf = S.indexOf(T.get(i));
                    ArrayList<String> arrayList5 = T;
                    if (indexOf != -1) {
                        S.set(indexOf, S2.get(i));
                    }
                    i++;
                    T = arrayList5;
                }
                ArrayList<String> T2 = eVar2.mo3941e().mo3392T();
                if (!z2) {
                    eVar.mo3941e().mo3344B();
                    eVar2.mo3941e().mo3473z();
                } else {
                    eVar.mo3941e().mo3473z();
                    eVar2.mo3941e().mo3344B();
                }
                int i2 = 0;
                for (int size = S.size(); i2 < size; size = size) {
                    aVar2.put(S.get(i2), T2.get(i2));
                    i2++;
                }
                C6077a aVar3 = new C6077a();
                mo3693t(aVar3, eVar.mo3941e().f3345I);
                aVar3.mo23263q(S);
                aVar2.mo23263q(aVar3.keySet());
                C6077a aVar4 = new C6077a();
                mo3693t(aVar4, eVar2.mo3941e().f3345I);
                aVar4.mo23263q(T2);
                aVar4.mo23263q(aVar2.values());
                C0722r.m4116x(aVar2, aVar4);
                mo3695v(aVar3, aVar2.keySet());
                mo3695v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList3.clear();
                    arrayList4.clear();
                    aVar = aVar2;
                    arrayList2 = arrayList4;
                    eVar5 = eVar6;
                    arrayList = arrayList3;
                    rect = rect2;
                    view3 = view4;
                    tVar = tVar2;
                    view5 = view6;
                    obj3 = null;
                    eVar4 = eVar7;
                } else {
                    C0722r.m4098f(eVar2.mo3941e(), eVar.mo3941e(), z2, aVar3, true);
                    ArrayList<String> arrayList6 = S;
                    C0685i iVar = r0;
                    ViewGroup k = mo3933k();
                    Object obj5 = obj4;
                    C6077a aVar5 = aVar4;
                    View view7 = view6;
                    C6077a aVar6 = aVar3;
                    aVar = aVar2;
                    ArrayList arrayList7 = arrayList4;
                    C0685i iVar2 = new C0685i(eVar2, eVar, z, aVar5);
                    C5720r.m25259a(k, iVar2);
                    for (View s : aVar6.values()) {
                        mo3692s(arrayList3, s);
                    }
                    if (!arrayList6.isEmpty()) {
                        View view8 = (View) aVar6.get(arrayList6.get(0));
                        tVar2.mo3879v(obj5, view8);
                        view5 = view8;
                    } else {
                        view5 = view7;
                    }
                    for (View s2 : aVar5.values()) {
                        mo3692s(arrayList7, s2);
                    }
                    arrayList2 = arrayList7;
                    if (!T2.isEmpty()) {
                        View view9 = (View) aVar5.get(T2.get(0));
                        if (view9 != null) {
                            C5720r.m25259a(mo3933k(), new C0686j(tVar2, view9, rect2));
                            z3 = true;
                        }
                    }
                    tVar2.mo3881z(obj5, view4, arrayList3);
                    arrayList = arrayList3;
                    rect = rect2;
                    view3 = view4;
                    tVar = tVar2;
                    tVar2.mo3877t(obj5, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj5, arrayList2);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar4 = eVar2;
                    hashMap.put(eVar4, bool);
                    obj3 = obj5;
                }
            }
            eVar6 = eVar5;
            arrayList3 = arrayList;
            rect2 = rect;
            view4 = view3;
            eVar7 = eVar4;
            aVar2 = aVar;
            z2 = z;
            arrayList4 = arrayList2;
            tVar2 = tVar;
        }
        View view10 = view5;
        C6077a aVar7 = aVar2;
        ArrayList arrayList8 = arrayList4;
        C0746x.C0751e eVar8 = eVar6;
        ArrayList arrayList9 = arrayList3;
        Rect rect3 = rect2;
        View view11 = view4;
        C0737t tVar3 = tVar2;
        C0746x.C0751e eVar9 = eVar7;
        ArrayList arrayList10 = new ArrayList();
        Object obj6 = null;
        Object obj7 = null;
        for (C0689m next4 : list) {
            if (next4.mo3717i()) {
                hashMap.put(next4.mo3711c(), Boolean.FALSE);
                mo3694u(next4.mo3711c(), next4.mo3713e());
            } else {
                Object g = tVar3.mo3871g(next4.mo3714f());
                C0746x.C0751e c = next4.mo3711c();
                boolean z4 = obj3 != null && (c == eVar8 || c == eVar9);
                if (g == null) {
                    if (!z4) {
                        hashMap.put(c, Boolean.FALSE);
                        mo3694u(c, next4.mo3713e());
                    }
                    view = view11;
                    view2 = view10;
                } else {
                    ArrayList arrayList11 = new ArrayList();
                    Object obj8 = obj6;
                    mo3692s(arrayList11, c.mo3941e().f3345I);
                    if (z4) {
                        if (c == eVar8) {
                            arrayList11.removeAll(arrayList9);
                        } else {
                            arrayList11.removeAll(arrayList8);
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        tVar3.mo3867a(g, view11);
                        obj2 = obj8;
                        view = view11;
                        eVar3 = c;
                        obj = obj7;
                    } else {
                        tVar3.mo3868b(g, arrayList11);
                        obj2 = obj8;
                        eVar3 = c;
                        view = view11;
                        obj = obj7;
                        tVar3.mo3877t(g, g, arrayList11, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (eVar3.mo3940d() == C0746x.C0751e.C0755d.GONE) {
                            tVar3.mo3876r(g, eVar3.mo3941e().f3345I, arrayList11);
                            C5720r.m25259a(mo3933k(), new C0687k(arrayList11));
                        }
                    }
                    if (eVar3.mo3940d() == C0746x.C0751e.C0755d.VISIBLE) {
                        arrayList10.addAll(arrayList11);
                        if (z3) {
                            tVar3.mo3878u(g, rect3);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        tVar3.mo3879v(g, view2);
                    }
                    hashMap.put(eVar3, Boolean.TRUE);
                    if (next4.mo3716h()) {
                        obj6 = obj2;
                        obj7 = tVar3.mo3873n(obj, g, (Object) null);
                    } else {
                        obj6 = tVar3.mo3873n(obj2, g, (Object) null);
                        obj7 = obj;
                    }
                }
                eVar8 = eVar;
                eVar9 = eVar2;
                view10 = view2;
                view11 = view;
            }
        }
        Object m = tVar3.mo3872m(obj7, obj6, obj3);
        for (C0689m next5 : list) {
            if (!next5.mo3717i() && next5.mo3714f() != null) {
                tVar3.mo3880w(next5.mo3711c().mo3941e(), m, next5.mo3713e(), new C0676a(next5));
            }
        }
        C0722r.m4091A(arrayList10, 4);
        ArrayList<String> o = tVar3.mo3902o(arrayList8);
        tVar3.mo3869c(mo3933k(), m);
        tVar3.mo3905y(mo3933k(), arrayList9, arrayList8, o, aVar7);
        C0722r.m4091A(arrayList10, 0);
        tVar3.mo3865A(obj3, arrayList9, arrayList8);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3689f(List<C0746x.C0751e> list, boolean z) {
        C0746x.C0751e eVar = null;
        C0746x.C0751e eVar2 = null;
        for (C0746x.C0751e next : list) {
            C0746x.C0751e.C0755d c = C0746x.C0751e.C0755d.m4210c(next.mo3941e().f3345I);
            int i = C0677b.f3535a[next.mo3940d().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (c == C0746x.C0751e.C0755d.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i == 4 && c != C0746x.C0751e.C0755d.VISIBLE) {
                eVar2 = next;
            }
        }
        ArrayList<C0688l> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C0746x.C0751e> arrayList3 = new ArrayList<>(list);
        Iterator<C0746x.C0751e> it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            C0746x.C0751e next2 = it.next();
            C5421b bVar = new C5421b();
            m3905p(next2, bVar);
            arrayList.add(new C0688l(next2, bVar));
            C5421b bVar2 = new C5421b();
            m3905p(next2, bVar2);
            if (z) {
                if (next2 != eVar) {
                    arrayList2.add(new C0689m(next2, bVar2, z, z2));
                    next2.mo3938a(new C0678c(next2));
                    next2.mo3938a(new C0679d(arrayList3, next2));
                    next2.mo3939c().mo21874d(new C0680e(next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new C0689m(next2, bVar2, z, z2));
                next2.mo3938a(new C0678c(next2));
                next2.mo3938a(new C0679d(arrayList3, next2));
                next2.mo3939c().mo21874d(new C0680e(next2));
            }
            z2 = true;
            arrayList2.add(new C0689m(next2, bVar2, z, z2));
            next2.mo3938a(new C0678c(next2));
            next2.mo3938a(new C0679d(arrayList3, next2));
            next2.mo3939c().mo21874d(new C0680e(next2));
        }
        Map<C0746x.C0751e, Boolean> x = m3907x(arrayList2, z, eVar, eVar2);
        boolean containsValue = x.containsValue(Boolean.TRUE);
        for (C0688l lVar : arrayList) {
            C0746x.C0751e a = lVar.mo3708a();
            m3906w(a, lVar.mo3709b(), containsValue, x.containsKey(a) ? x.get(a).booleanValue() : false);
        }
        for (C0746x.C0751e q : arrayList3) {
            mo3690q(q);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3690q(C0746x.C0751e eVar) {
        eVar.mo3940d().mo3944a(eVar.mo3941e().f3345I);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3691r(C0746x.C0751e eVar) {
        HashSet remove = this.f3532f.remove(eVar);
        if (remove != null) {
            Iterator it = remove.iterator();
            while (it.hasNext()) {
                ((C5421b) it.next()).mo21871a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3692s(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C5738w.m25406a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo3692s(arrayList, childAt);
                }
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3693t(Map<String, View> map, View view) {
        String K = C5723u.m25283K(view);
        if (K != null) {
            map.put(K, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo3693t(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3694u(C0746x.C0751e eVar, C5421b bVar) {
        HashSet hashSet = this.f3532f.get(eVar);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f3532f.remove(eVar);
            eVar.mo3937b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3695v(C6077a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C5723u.m25283K((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
