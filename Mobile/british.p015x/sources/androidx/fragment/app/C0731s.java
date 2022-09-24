package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p090i0.C5421b;

/* renamed from: androidx.fragment.app.s */
/* compiled from: FragmentTransitionCompat21 */
class C0731s extends C0737t {

    /* renamed from: androidx.fragment.app.s$a */
    /* compiled from: FragmentTransitionCompat21 */
    class C0732a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3718a;

        C0732a(Rect rect) {
            this.f3718a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f3718a;
        }
    }

    /* renamed from: androidx.fragment.app.s$b */
    /* compiled from: FragmentTransitionCompat21 */
    class C0733b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3720a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3721b;

        C0733b(View view, ArrayList arrayList) {
            this.f3720a = view;
            this.f3721b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3720a.setVisibility(8);
            int size = this.f3721b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3721b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.s$c */
    /* compiled from: FragmentTransitionCompat21 */
    class C0734c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3723a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3724b;

        /* renamed from: c */
        final /* synthetic */ Object f3725c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3726d;

        /* renamed from: e */
        final /* synthetic */ Object f3727e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3728f;

        C0734c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3723a = obj;
            this.f3724b = arrayList;
            this.f3725c = obj2;
            this.f3726d = arrayList2;
            this.f3727e = obj3;
            this.f3728f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f3723a;
            if (obj != null) {
                C0731s.this.mo3875q(obj, this.f3724b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3725c;
            if (obj2 != null) {
                C0731s.this.mo3875q(obj2, this.f3726d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3727e;
            if (obj3 != null) {
                C0731s.this.mo3875q(obj3, this.f3728f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.s$d */
    /* compiled from: FragmentTransitionCompat21 */
    class C0735d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3730a;

        C0735d(Runnable runnable) {
            this.f3730a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f3730a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.s$e */
    /* compiled from: FragmentTransitionCompat21 */
    class C0736e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3732a;

        C0736e(Rect rect) {
            this.f3732a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3732a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3732a;
        }
    }

    C0731s() {
    }

    /* renamed from: C */
    private static boolean m4121C(Transition transition) {
        return !C0737t.m4142l(transition.getTargetIds()) || !C0737t.m4142l(transition.getTargetNames()) || !C0737t.m4142l(transition.getTargetTypes());
    }

    /* renamed from: A */
    public void mo3865A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3875q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo3866B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo3867a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo3868b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo3868b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m4121C(transition) && C0737t.m4142l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3869c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo3870e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo3871g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo3872m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo3873n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo3874p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: q */
    public void mo3875q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo3875q(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m4121C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    /* renamed from: r */
    public void mo3876r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0733b(view, arrayList));
    }

    /* renamed from: t */
    public void mo3877t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0734c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo3878u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0736e(rect));
        }
    }

    /* renamed from: v */
    public void mo3879v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo3901k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0732a(rect));
        }
    }

    /* renamed from: w */
    public void mo3880w(Fragment fragment, Object obj, C5421b bVar, Runnable runnable) {
        ((Transition) obj).addListener(new C0735d(runnable));
    }

    /* renamed from: z */
    public void mo3881z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0737t.m4139d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo3868b(transitionSet, arrayList);
    }
}
