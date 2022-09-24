package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0737t;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.transition.d */
/* compiled from: FragmentTransitionSupport */
public class C1296d extends C0737t {

    /* renamed from: androidx.transition.d$a */
    /* compiled from: FragmentTransitionSupport */
    class C1297a extends Transition.C1280e {

        /* renamed from: a */
        final /* synthetic */ Rect f5865a;

        C1297a(Rect rect) {
            this.f5865a = rect;
        }

        /* renamed from: a */
        public Rect mo6268a(Transition transition) {
            return this.f5865a;
        }
    }

    /* renamed from: androidx.transition.d$b */
    /* compiled from: FragmentTransitionSupport */
    class C1298b implements Transition.C1281f {

        /* renamed from: a */
        final /* synthetic */ View f5867a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5868b;

        C1298b(View view, ArrayList arrayList) {
            this.f5867a = view;
            this.f5868b = arrayList;
        }

        /* renamed from: a */
        public void mo6269a(Transition transition) {
        }

        /* renamed from: b */
        public void mo6183b(Transition transition) {
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            transition.mo6246i0(this);
            this.f5867a.setVisibility(8);
            int size = this.f5868b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5868b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo6185d(Transition transition) {
        }

        /* renamed from: e */
        public void mo6186e(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.d$c */
    /* compiled from: FragmentTransitionSupport */
    class C1299c extends C1330r {

        /* renamed from: a */
        final /* synthetic */ Object f5870a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5871b;

        /* renamed from: c */
        final /* synthetic */ Object f5872c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f5873d;

        /* renamed from: e */
        final /* synthetic */ Object f5874e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f5875f;

        C1299c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5870a = obj;
            this.f5871b = arrayList;
            this.f5872c = obj2;
            this.f5873d = arrayList2;
            this.f5874e = obj3;
            this.f5875f = arrayList3;
        }

        /* renamed from: a */
        public void mo6269a(Transition transition) {
            Object obj = this.f5870a;
            if (obj != null) {
                C1296d.this.mo3875q(obj, this.f5871b, (ArrayList<View>) null);
            }
            Object obj2 = this.f5872c;
            if (obj2 != null) {
                C1296d.this.mo3875q(obj2, this.f5873d, (ArrayList<View>) null);
            }
            Object obj3 = this.f5874e;
            if (obj3 != null) {
                C1296d.this.mo3875q(obj3, this.f5875f, (ArrayList<View>) null);
            }
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            transition.mo6246i0(this);
        }
    }

    /* renamed from: androidx.transition.d$d */
    /* compiled from: FragmentTransitionSupport */
    class C1300d extends Transition.C1280e {

        /* renamed from: a */
        final /* synthetic */ Rect f5877a;

        C1300d(Rect rect) {
            this.f5877a = rect;
        }

        /* renamed from: a */
        public Rect mo6268a(Transition transition) {
            Rect rect = this.f5877a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5877a;
        }
    }

    /* renamed from: C */
    private static boolean m7022C(Transition transition) {
        return !C0737t.m4142l(transition.mo6232Q()) || !C0737t.m4142l(transition.mo6233R()) || !C0737t.m4142l(transition.mo6234S());
    }

    /* renamed from: A */
    public void mo3865A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.mo6235T().clear();
            transitionSet.mo6235T().addAll(arrayList2);
            mo3875q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo3866B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo6280y0((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo3867a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo6240b(view);
        }
    }

    /* renamed from: b */
    public void mo3868b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int B0 = transitionSet.mo6271B0();
                while (i < B0) {
                    mo3868b(transitionSet.mo6270A0(i), arrayList);
                    i++;
                }
            } else if (!m7022C(transition) && C0737t.m4142l(transition.mo6235T())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.mo6240b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3869c(ViewGroup viewGroup, Object obj) {
        C1331s.m7133a(viewGroup, (Transition) obj);
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
            transition = new TransitionSet().mo6280y0(transition).mo6280y0(transition2).mo6276G0(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.mo6280y0(transition);
        }
        transitionSet.mo6280y0(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo3873n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.mo6280y0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.mo6280y0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.mo6280y0((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo3874p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo6247j0(view);
        }
    }

    /* renamed from: q */
    public void mo3875q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int B0 = transitionSet.mo6271B0();
            while (i2 < B0) {
                mo3875q(transitionSet.mo6270A0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m7022C(transition)) {
            List<View> T = transition.mo6235T();
            if (T.size() == arrayList.size() && T.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.mo6240b(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.mo6247j0(arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: r */
    public void mo3876r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo6239a(new C1298b(view, arrayList));
    }

    /* renamed from: t */
    public void mo3877t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).mo6239a(new C1299c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo3878u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo6253o0(new C1300d(rect));
        }
    }

    /* renamed from: v */
    public void mo3879v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo3901k(view, rect);
            ((Transition) obj).mo6253o0(new C1297a(rect));
        }
    }

    /* renamed from: z */
    public void mo3881z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> T = transitionSet.mo6235T();
        T.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0737t.m4139d(T, arrayList.get(i));
        }
        T.add(view);
        arrayList.add(view);
        mo3868b(transitionSet, arrayList);
    }
}
