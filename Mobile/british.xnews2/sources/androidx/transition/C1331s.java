package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p110m0.C5723u;
import p149t.C6077a;

/* renamed from: androidx.transition.s */
/* compiled from: TransitionManager */
public class C1331s {

    /* renamed from: a */
    private static Transition f5936a = new AutoTransition();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C6077a<ViewGroup, ArrayList<Transition>>>> f5937b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f5938c = new ArrayList<>();

    /* renamed from: androidx.transition.s$a */
    /* compiled from: TransitionManager */
    private static class C1332a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        Transition f5939b;

        /* renamed from: c */
        ViewGroup f5940c;

        /* renamed from: androidx.transition.s$a$a */
        /* compiled from: TransitionManager */
        class C1333a extends C1330r {

            /* renamed from: a */
            final /* synthetic */ C6077a f5941a;

            C1333a(C6077a aVar) {
                this.f5941a = aVar;
            }

            /* renamed from: c */
            public void mo6184c(Transition transition) {
                ((ArrayList) this.f5941a.get(C1332a.this.f5940c)).remove(transition);
                transition.mo6246i0(this);
            }
        }

        C1332a(Transition transition, ViewGroup viewGroup) {
            this.f5939b = transition;
            this.f5940c = viewGroup;
        }

        /* renamed from: a */
        private void m7137a() {
            this.f5940c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5940c.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m7137a();
            if (!C1331s.f5938c.remove(this.f5940c)) {
                return true;
            }
            C6077a<ViewGroup, ArrayList<Transition>> b = C1331s.m7134b();
            ArrayList arrayList = b.get(this.f5940c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f5940c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f5939b);
            this.f5939b.mo6239a(new C1333a(b));
            this.f5939b.mo6252o(this.f5940c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo6248k0(this.f5940c);
                }
            }
            this.f5939b.mo6244h0(this.f5940c);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m7137a();
            C1331s.f5938c.remove(this.f5940c);
            ArrayList arrayList = C1331s.m7134b().get(this.f5940c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo6248k0(this.f5940c);
                }
            }
            this.f5939b.mo6254p(true);
        }
    }

    /* renamed from: a */
    public static void m7133a(ViewGroup viewGroup, Transition transition) {
        if (!f5938c.contains(viewGroup) && C5723u.m25294T(viewGroup)) {
            f5938c.add(viewGroup);
            if (transition == null) {
                transition = f5936a;
            }
            Transition s = transition.clone();
            m7136d(viewGroup, s);
            C1328p.m7127c(viewGroup, (C1328p) null);
            m7135c(viewGroup, s);
        }
    }

    /* renamed from: b */
    static C6077a<ViewGroup, ArrayList<Transition>> m7134b() {
        C6077a<ViewGroup, ArrayList<Transition>> aVar;
        WeakReference weakReference = f5937b.get();
        if (weakReference != null && (aVar = (C6077a) weakReference.get()) != null) {
            return aVar;
        }
        C6077a<ViewGroup, ArrayList<Transition>> aVar2 = new C6077a<>();
        f5937b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: c */
    private static void m7135c(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            C1332a aVar = new C1332a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m7136d(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = m7134b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo6242g0(viewGroup);
            }
        }
        if (transition != null) {
            transition.mo6252o(viewGroup, true);
        }
        C1328p b = C1328p.m7126b(viewGroup);
        if (b != null) {
            b.mo6377a();
        }
    }
}
