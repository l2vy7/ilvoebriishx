package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p110m0.C5723u;

/* renamed from: androidx.recyclerview.widget.c */
/* compiled from: DefaultItemAnimator */
public class C1133c extends C1165m {

    /* renamed from: s */
    private static TimeInterpolator f5263s;

    /* renamed from: h */
    private ArrayList<RecyclerView.C1087c0> f5264h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.C1087c0> f5265i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C1143j> f5266j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C1142i> f5267k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.C1087c0>> f5268l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C1143j>> f5269m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C1142i>> f5270n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.C1087c0> f5271o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.C1087c0> f5272p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.C1087c0> f5273q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.C1087c0> f5274r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* compiled from: DefaultItemAnimator */
    class C1134a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f5275b;

        C1134a(ArrayList arrayList) {
            this.f5275b = arrayList;
        }

        public void run() {
            Iterator it = this.f5275b.iterator();
            while (it.hasNext()) {
                C1143j jVar = (C1143j) it.next();
                C1133c.this.mo5710S(jVar.f5309a, jVar.f5310b, jVar.f5311c, jVar.f5312d, jVar.f5313e);
            }
            this.f5275b.clear();
            C1133c.this.f5269m.remove(this.f5275b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* compiled from: DefaultItemAnimator */
    class C1135b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f5277b;

        C1135b(ArrayList arrayList) {
            this.f5277b = arrayList;
        }

        public void run() {
            Iterator it = this.f5277b.iterator();
            while (it.hasNext()) {
                C1133c.this.mo5709R((C1142i) it.next());
            }
            this.f5277b.clear();
            C1133c.this.f5270n.remove(this.f5277b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* compiled from: DefaultItemAnimator */
    class C1136c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f5279b;

        C1136c(ArrayList arrayList) {
            this.f5279b = arrayList;
        }

        public void run() {
            Iterator it = this.f5279b.iterator();
            while (it.hasNext()) {
                C1133c.this.mo5708Q((RecyclerView.C1087c0) it.next());
            }
            this.f5279b.clear();
            C1133c.this.f5268l.remove(this.f5279b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    /* compiled from: DefaultItemAnimator */
    class C1137d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1087c0 f5281a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f5282b;

        /* renamed from: c */
        final /* synthetic */ View f5283c;

        C1137d(RecyclerView.C1087c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5281a = c0Var;
            this.f5282b = viewPropertyAnimator;
            this.f5283c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5282b.setListener((Animator.AnimatorListener) null);
            this.f5283c.setAlpha(1.0f);
            C1133c.this.mo5806G(this.f5281a);
            C1133c.this.f5273q.remove(this.f5281a);
            C1133c.this.mo5712V();
        }

        public void onAnimationStart(Animator animator) {
            C1133c.this.mo5807H(this.f5281a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    /* compiled from: DefaultItemAnimator */
    class C1138e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1087c0 f5285a;

        /* renamed from: b */
        final /* synthetic */ View f5286b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f5287c;

        C1138e(RecyclerView.C1087c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5285a = c0Var;
            this.f5286b = view;
            this.f5287c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5286b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f5287c.setListener((Animator.AnimatorListener) null);
            C1133c.this.mo5800A(this.f5285a);
            C1133c.this.f5271o.remove(this.f5285a);
            C1133c.this.mo5712V();
        }

        public void onAnimationStart(Animator animator) {
            C1133c.this.mo5801B(this.f5285a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$f */
    /* compiled from: DefaultItemAnimator */
    class C1139f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1087c0 f5289a;

        /* renamed from: b */
        final /* synthetic */ int f5290b;

        /* renamed from: c */
        final /* synthetic */ View f5291c;

        /* renamed from: d */
        final /* synthetic */ int f5292d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f5293e;

        C1139f(RecyclerView.C1087c0 c0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5289a = c0Var;
            this.f5290b = i;
            this.f5291c = view;
            this.f5292d = i2;
            this.f5293e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f5290b != 0) {
                this.f5291c.setTranslationX(0.0f);
            }
            if (this.f5292d != 0) {
                this.f5291c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f5293e.setListener((Animator.AnimatorListener) null);
            C1133c.this.mo5804E(this.f5289a);
            C1133c.this.f5272p.remove(this.f5289a);
            C1133c.this.mo5712V();
        }

        public void onAnimationStart(Animator animator) {
            C1133c.this.mo5805F(this.f5289a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$g */
    /* compiled from: DefaultItemAnimator */
    class C1140g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1142i f5295a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f5296b;

        /* renamed from: c */
        final /* synthetic */ View f5297c;

        C1140g(C1142i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5295a = iVar;
            this.f5296b = viewPropertyAnimator;
            this.f5297c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5296b.setListener((Animator.AnimatorListener) null);
            this.f5297c.setAlpha(1.0f);
            this.f5297c.setTranslationX(0.0f);
            this.f5297c.setTranslationY(0.0f);
            C1133c.this.mo5802C(this.f5295a.f5303a, true);
            C1133c.this.f5274r.remove(this.f5295a.f5303a);
            C1133c.this.mo5712V();
        }

        public void onAnimationStart(Animator animator) {
            C1133c.this.mo5803D(this.f5295a.f5303a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$h */
    /* compiled from: DefaultItemAnimator */
    class C1141h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1142i f5299a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f5300b;

        /* renamed from: c */
        final /* synthetic */ View f5301c;

        C1141h(C1142i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5299a = iVar;
            this.f5300b = viewPropertyAnimator;
            this.f5301c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5300b.setListener((Animator.AnimatorListener) null);
            this.f5301c.setAlpha(1.0f);
            this.f5301c.setTranslationX(0.0f);
            this.f5301c.setTranslationY(0.0f);
            C1133c.this.mo5802C(this.f5299a.f5304b, false);
            C1133c.this.f5274r.remove(this.f5299a.f5304b);
            C1133c.this.mo5712V();
        }

        public void onAnimationStart(Animator animator) {
            C1133c.this.mo5803D(this.f5299a.f5304b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$j */
    /* compiled from: DefaultItemAnimator */
    private static class C1143j {

        /* renamed from: a */
        public RecyclerView.C1087c0 f5309a;

        /* renamed from: b */
        public int f5310b;

        /* renamed from: c */
        public int f5311c;

        /* renamed from: d */
        public int f5312d;

        /* renamed from: e */
        public int f5313e;

        C1143j(RecyclerView.C1087c0 c0Var, int i, int i2, int i3, int i4) {
            this.f5309a = c0Var;
            this.f5310b = i;
            this.f5311c = i2;
            this.f5312d = i3;
            this.f5313e = i4;
        }
    }

    /* renamed from: T */
    private void m6310T(RecyclerView.C1087c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f5273q.add(c0Var);
        animate.setDuration(mo5382o()).alpha(0.0f).setListener(new C1137d(c0Var, animate, view)).start();
    }

    /* renamed from: W */
    private void m6311W(List<C1142i> list, RecyclerView.C1087c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1142i iVar = list.get(size);
            if (m6313Y(iVar, c0Var) && iVar.f5303a == null && iVar.f5304b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: X */
    private void m6312X(C1142i iVar) {
        RecyclerView.C1087c0 c0Var = iVar.f5303a;
        if (c0Var != null) {
            m6313Y(iVar, c0Var);
        }
        RecyclerView.C1087c0 c0Var2 = iVar.f5304b;
        if (c0Var2 != null) {
            m6313Y(iVar, c0Var2);
        }
    }

    /* renamed from: Y */
    private boolean m6313Y(C1142i iVar, RecyclerView.C1087c0 c0Var) {
        boolean z = false;
        if (iVar.f5304b == c0Var) {
            iVar.f5304b = null;
        } else if (iVar.f5303a != c0Var) {
            return false;
        } else {
            iVar.f5303a = null;
            z = true;
        }
        c0Var.itemView.setAlpha(1.0f);
        c0Var.itemView.setTranslationX(0.0f);
        c0Var.itemView.setTranslationY(0.0f);
        mo5802C(c0Var, z);
        return true;
    }

    /* renamed from: Z */
    private void m6314Z(RecyclerView.C1087c0 c0Var) {
        if (f5263s == null) {
            f5263s = new ValueAnimator().getInterpolator();
        }
        c0Var.itemView.animate().setInterpolator(f5263s);
        mo5377j(c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo5708Q(RecyclerView.C1087c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f5271o.add(c0Var);
        animate.alpha(1.0f).setDuration(mo5379l()).setListener(new C1138e(c0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo5709R(C1142i iVar) {
        View view;
        RecyclerView.C1087c0 c0Var = iVar.f5303a;
        View view2 = null;
        if (c0Var == null) {
            view = null;
        } else {
            view = c0Var.itemView;
        }
        RecyclerView.C1087c0 c0Var2 = iVar.f5304b;
        if (c0Var2 != null) {
            view2 = c0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(mo5380m());
            this.f5274r.add(iVar.f5303a);
            duration.translationX((float) (iVar.f5307e - iVar.f5305c));
            duration.translationY((float) (iVar.f5308f - iVar.f5306d));
            duration.alpha(0.0f).setListener(new C1140g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f5274r.add(iVar.f5304b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo5380m()).alpha(1.0f).setListener(new C1141h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo5710S(RecyclerView.C1087c0 c0Var, int i, int i2, int i3, int i4) {
        View view = c0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f5272p.add(c0Var);
        animate.setDuration(mo5381n()).setListener(new C1139f(c0Var, i5, view, i6, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo5711U(List<RecyclerView.C1087c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo5712V() {
        if (!mo5383p()) {
            mo5376i();
        }
    }

    /* renamed from: g */
    public boolean mo5374g(RecyclerView.C1087c0 c0Var, List<Object> list) {
        return !list.isEmpty() || super.mo5374g(c0Var, list);
    }

    /* renamed from: j */
    public void mo5377j(RecyclerView.C1087c0 c0Var) {
        View view = c0Var.itemView;
        view.animate().cancel();
        int size = this.f5266j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f5266j.get(size).f5309a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5804E(c0Var);
                this.f5266j.remove(size);
            }
        }
        m6311W(this.f5267k, c0Var);
        if (this.f5264h.remove(c0Var)) {
            view.setAlpha(1.0f);
            mo5806G(c0Var);
        }
        if (this.f5265i.remove(c0Var)) {
            view.setAlpha(1.0f);
            mo5800A(c0Var);
        }
        for (int size2 = this.f5270n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f5270n.get(size2);
            m6311W(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.f5270n.remove(size2);
            }
        }
        for (int size3 = this.f5269m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f5269m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1143j) arrayList2.get(size4)).f5309a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5804E(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5269m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f5268l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f5268l.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                mo5800A(c0Var);
                if (arrayList3.isEmpty()) {
                    this.f5268l.remove(size5);
                }
            }
        }
        this.f5273q.remove(c0Var);
        this.f5271o.remove(c0Var);
        this.f5274r.remove(c0Var);
        this.f5272p.remove(c0Var);
        mo5712V();
    }

    /* renamed from: k */
    public void mo5378k() {
        int size = this.f5266j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1143j jVar = this.f5266j.get(size);
            View view = jVar.f5309a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5804E(jVar.f5309a);
            this.f5266j.remove(size);
        }
        for (int size2 = this.f5264h.size() - 1; size2 >= 0; size2--) {
            mo5806G(this.f5264h.get(size2));
            this.f5264h.remove(size2);
        }
        int size3 = this.f5265i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C1087c0 c0Var = this.f5265i.get(size3);
            c0Var.itemView.setAlpha(1.0f);
            mo5800A(c0Var);
            this.f5265i.remove(size3);
        }
        for (int size4 = this.f5267k.size() - 1; size4 >= 0; size4--) {
            m6312X(this.f5267k.get(size4));
        }
        this.f5267k.clear();
        if (mo5383p()) {
            for (int size5 = this.f5269m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f5269m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1143j jVar2 = (C1143j) arrayList.get(size6);
                    View view2 = jVar2.f5309a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5804E(jVar2.f5309a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5269m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f5268l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f5268l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C1087c0 c0Var2 = (RecyclerView.C1087c0) arrayList2.get(size8);
                    c0Var2.itemView.setAlpha(1.0f);
                    mo5800A(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5268l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f5270n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f5270n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m6312X((C1142i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5270n.remove(arrayList3);
                    }
                }
            }
            mo5711U(this.f5273q);
            mo5711U(this.f5272p);
            mo5711U(this.f5271o);
            mo5711U(this.f5274r);
            mo5376i();
        }
    }

    /* renamed from: p */
    public boolean mo5383p() {
        return !this.f5265i.isEmpty() || !this.f5267k.isEmpty() || !this.f5266j.isEmpty() || !this.f5264h.isEmpty() || !this.f5272p.isEmpty() || !this.f5273q.isEmpty() || !this.f5271o.isEmpty() || !this.f5274r.isEmpty() || !this.f5269m.isEmpty() || !this.f5268l.isEmpty() || !this.f5270n.isEmpty();
    }

    /* renamed from: u */
    public void mo5388u() {
        boolean z = !this.f5264h.isEmpty();
        boolean z2 = !this.f5266j.isEmpty();
        boolean z3 = !this.f5267k.isEmpty();
        boolean z4 = !this.f5265i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C1087c0> it = this.f5264h.iterator();
            while (it.hasNext()) {
                m6310T(it.next());
            }
            this.f5264h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f5266j);
                this.f5269m.add(arrayList);
                this.f5266j.clear();
                C1134a aVar = new C1134a(arrayList);
                if (z) {
                    C5723u.m25316h0(((C1143j) arrayList.get(0)).f5309a.itemView, aVar, mo5382o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f5267k);
                this.f5270n.add(arrayList2);
                this.f5267k.clear();
                C1135b bVar = new C1135b(arrayList2);
                if (z) {
                    C5723u.m25316h0(((C1142i) arrayList2.get(0)).f5303a.itemView, bVar, mo5382o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f5265i);
                this.f5268l.add(arrayList3);
                this.f5265i.clear();
                C1136c cVar = new C1136c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo5382o() : 0;
                    long n = z2 ? mo5381n() : 0;
                    if (z3) {
                        j = mo5380m();
                    }
                    C5723u.m25316h0(((RecyclerView.C1087c0) arrayList3.get(0)).itemView, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: w */
    public boolean mo5713w(RecyclerView.C1087c0 c0Var) {
        m6314Z(c0Var);
        c0Var.itemView.setAlpha(0.0f);
        this.f5265i.add(c0Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo5714x(RecyclerView.C1087c0 c0Var, RecyclerView.C1087c0 c0Var2, int i, int i2, int i3, int i4) {
        if (c0Var == c0Var2) {
            return mo5715y(c0Var, i, i2, i3, i4);
        }
        float translationX = c0Var.itemView.getTranslationX();
        float translationY = c0Var.itemView.getTranslationY();
        float alpha = c0Var.itemView.getAlpha();
        m6314Z(c0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        c0Var.itemView.setTranslationX(translationX);
        c0Var.itemView.setTranslationY(translationY);
        c0Var.itemView.setAlpha(alpha);
        if (c0Var2 != null) {
            m6314Z(c0Var2);
            c0Var2.itemView.setTranslationX((float) (-i5));
            c0Var2.itemView.setTranslationY((float) (-i6));
            c0Var2.itemView.setAlpha(0.0f);
        }
        this.f5267k.add(new C1142i(c0Var, c0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: y */
    public boolean mo5715y(RecyclerView.C1087c0 c0Var, int i, int i2, int i3, int i4) {
        View view = c0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) c0Var.itemView.getTranslationY());
        m6314Z(c0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5804E(c0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f5266j.add(new C1143j(c0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: z */
    public boolean mo5716z(RecyclerView.C1087c0 c0Var) {
        m6314Z(c0Var);
        this.f5264h.add(c0Var);
        return true;
    }

    /* renamed from: androidx.recyclerview.widget.c$i */
    /* compiled from: DefaultItemAnimator */
    private static class C1142i {

        /* renamed from: a */
        public RecyclerView.C1087c0 f5303a;

        /* renamed from: b */
        public RecyclerView.C1087c0 f5304b;

        /* renamed from: c */
        public int f5305c;

        /* renamed from: d */
        public int f5306d;

        /* renamed from: e */
        public int f5307e;

        /* renamed from: f */
        public int f5308f;

        private C1142i(RecyclerView.C1087c0 c0Var, RecyclerView.C1087c0 c0Var2) {
            this.f5303a = c0Var;
            this.f5304b = c0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f5303a + ", newHolder=" + this.f5304b + ", fromX=" + this.f5305c + ", fromY=" + this.f5306d + ", toX=" + this.f5307e + ", toY=" + this.f5308f + '}';
        }

        C1142i(RecyclerView.C1087c0 c0Var, RecyclerView.C1087c0 c0Var2, int i, int i2, int i3, int i4) {
            this(c0Var, c0Var2);
            this.f5305c = i;
            this.f5306d = i2;
            this.f5307e = i3;
            this.f5308f = i4;
        }
    }
}
