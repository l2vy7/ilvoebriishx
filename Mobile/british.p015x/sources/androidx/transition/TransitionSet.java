package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import p010b0.C1532g;
import p112m1.C5748d;

public class TransitionSet extends Transition {

    /* renamed from: L */
    private ArrayList<Transition> f5820L = new ArrayList<>();

    /* renamed from: M */
    private boolean f5821M = true;

    /* renamed from: N */
    int f5822N;

    /* renamed from: O */
    boolean f5823O = false;

    /* renamed from: P */
    private int f5824P = 0;

    /* renamed from: androidx.transition.TransitionSet$a */
    class C1282a extends C1330r {

        /* renamed from: a */
        final /* synthetic */ Transition f5825a;

        C1282a(Transition transition) {
            this.f5825a = transition;
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            this.f5825a.mo6250m0();
            transition.mo6246i0(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    static class C1283b extends C1330r {

        /* renamed from: a */
        TransitionSet f5827a;

        C1283b(TransitionSet transitionSet) {
            this.f5827a = transitionSet;
        }

        /* renamed from: a */
        public void mo6269a(Transition transition) {
            TransitionSet transitionSet = this.f5827a;
            if (!transitionSet.f5823O) {
                transitionSet.mo6262u0();
                this.f5827a.f5823O = true;
            }
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            TransitionSet transitionSet = this.f5827a;
            int i = transitionSet.f5822N - 1;
            transitionSet.f5822N = i;
            if (i == 0) {
                transitionSet.f5823O = false;
                transitionSet.mo6222B();
            }
            transition.mo6246i0(this);
        }
    }

    public TransitionSet() {
    }

    /* renamed from: I0 */
    private void m6942I0() {
        C1283b bVar = new C1283b(this);
        Iterator<Transition> it = this.f5820L.iterator();
        while (it.hasNext()) {
            it.next().mo6239a(bVar);
        }
        this.f5822N = this.f5820L.size();
    }

    /* renamed from: z0 */
    private void m6943z0(Transition transition) {
        this.f5820L.add(transition);
        transition.f5804s = this;
    }

    /* renamed from: A0 */
    public Transition mo6270A0(int i) {
        if (i < 0 || i >= this.f5820L.size()) {
            return null;
        }
        return this.f5820L.get(i);
    }

    /* renamed from: B0 */
    public int mo6271B0() {
        return this.f5820L.size();
    }

    /* renamed from: C0 */
    public TransitionSet mo6246i0(Transition.C1281f fVar) {
        return (TransitionSet) super.mo6246i0(fVar);
    }

    /* renamed from: D0 */
    public TransitionSet mo6247j0(View view) {
        for (int i = 0; i < this.f5820L.size(); i++) {
            this.f5820L.get(i).mo6247j0(view);
        }
        return (TransitionSet) super.mo6247j0(view);
    }

    /* renamed from: E0 */
    public TransitionSet mo6251n0(long j) {
        ArrayList<Transition> arrayList;
        super.mo6251n0(j);
        if (this.f5789d >= 0 && (arrayList = this.f5820L) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5820L.get(i).mo6251n0(j);
            }
        }
        return this;
    }

    /* renamed from: F0 */
    public TransitionSet mo6255p0(TimeInterpolator timeInterpolator) {
        this.f5824P |= 1;
        ArrayList<Transition> arrayList = this.f5820L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5820L.get(i).mo6255p0(timeInterpolator);
            }
        }
        return (TransitionSet) super.mo6255p0(timeInterpolator);
    }

    /* renamed from: G0 */
    public TransitionSet mo6276G0(int i) {
        if (i == 0) {
            this.f5821M = true;
        } else if (i == 1) {
            this.f5821M = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: H0 */
    public TransitionSet mo6260t0(long j) {
        return (TransitionSet) super.mo6260t0(j);
    }

    /* renamed from: g0 */
    public void mo6242g0(View view) {
        super.mo6242g0(view);
        int size = this.f5820L.size();
        for (int i = 0; i < size; i++) {
            this.f5820L.get(i).mo6242g0(view);
        }
    }

    /* renamed from: k */
    public void mo6152k(C1336u uVar) {
        if (mo6238Y(uVar.f5950b)) {
            Iterator<Transition> it = this.f5820L.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo6238Y(uVar.f5950b)) {
                    next.mo6152k(uVar);
                    uVar.f5951c.add(next);
                }
            }
        }
    }

    /* renamed from: k0 */
    public void mo6248k0(View view) {
        super.mo6248k0(view);
        int size = this.f5820L.size();
        for (int i = 0; i < size; i++) {
            this.f5820L.get(i).mo6248k0(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6249m(C1336u uVar) {
        super.mo6249m(uVar);
        int size = this.f5820L.size();
        for (int i = 0; i < size; i++) {
            this.f5820L.get(i).mo6249m(uVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public void mo6250m0() {
        if (this.f5820L.isEmpty()) {
            mo6262u0();
            mo6222B();
            return;
        }
        m6942I0();
        if (!this.f5821M) {
            for (int i = 1; i < this.f5820L.size(); i++) {
                this.f5820L.get(i - 1).mo6239a(new C1282a(this.f5820L.get(i)));
            }
            Transition transition = this.f5820L.get(0);
            if (transition != null) {
                transition.mo6250m0();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.f5820L.iterator();
        while (it.hasNext()) {
            it.next().mo6250m0();
        }
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        if (mo6238Y(uVar.f5950b)) {
            Iterator<Transition> it = this.f5820L.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo6238Y(uVar.f5950b)) {
                    next.mo6153n(uVar);
                    uVar.f5951c.add(next);
                }
            }
        }
    }

    /* renamed from: o0 */
    public void mo6253o0(Transition.C1280e eVar) {
        super.mo6253o0(eVar);
        this.f5824P |= 8;
        int size = this.f5820L.size();
        for (int i = 0; i < size; i++) {
            this.f5820L.get(i).mo6253o0(eVar);
        }
    }

    /* renamed from: r0 */
    public void mo6257r0(PathMotion pathMotion) {
        super.mo6257r0(pathMotion);
        this.f5824P |= 4;
        if (this.f5820L != null) {
            for (int i = 0; i < this.f5820L.size(); i++) {
                this.f5820L.get(i).mo6257r0(pathMotion);
            }
        }
    }

    /* renamed from: s */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f5820L = new ArrayList<>();
        int size = this.f5820L.size();
        for (int i = 0; i < size; i++) {
            transitionSet.m6943z0(this.f5820L.get(i).clone());
        }
        return transitionSet;
    }

    /* renamed from: s0 */
    public void mo6259s0(C5748d dVar) {
        super.mo6259s0(dVar);
        this.f5824P |= 2;
        int size = this.f5820L.size();
        for (int i = 0; i < size; i++) {
            this.f5820L.get(i).mo6259s0(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public String mo6263v0(String str) {
        String v0 = super.mo6263v0(str);
        for (int i = 0; i < this.f5820L.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(v0);
            sb.append("\n");
            sb.append(this.f5820L.get(i).mo6263v0(str + "  "));
            v0 = sb.toString();
        }
        return v0;
    }

    /* renamed from: w0 */
    public TransitionSet mo6239a(Transition.C1281f fVar) {
        return (TransitionSet) super.mo6239a(fVar);
    }

    /* renamed from: x0 */
    public TransitionSet mo6240b(View view) {
        for (int i = 0; i < this.f5820L.size(); i++) {
            this.f5820L.get(i).mo6240b(view);
        }
        return (TransitionSet) super.mo6240b(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo6264y(ViewGroup viewGroup, C1337v vVar, C1337v vVar2, ArrayList<C1336u> arrayList, ArrayList<C1336u> arrayList2) {
        long P = mo6231P();
        int size = this.f5820L.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f5820L.get(i);
            if (P > 0 && (this.f5821M || i == 0)) {
                long P2 = transition.mo6231P();
                if (P2 > 0) {
                    transition.mo6260t0(P2 + P);
                } else {
                    transition.mo6260t0(P);
                }
            }
            transition.mo6264y(viewGroup, vVar, vVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: y0 */
    public TransitionSet mo6280y0(Transition transition) {
        m6943z0(transition);
        long j = this.f5789d;
        if (j >= 0) {
            transition.mo6251n0(j);
        }
        if ((this.f5824P & 1) != 0) {
            transition.mo6255p0(mo6226J());
        }
        if ((this.f5824P & 2) != 0) {
            transition.mo6259s0(mo6230N());
        }
        if ((this.f5824P & 4) != 0) {
            transition.mo6257r0(mo6229M());
        }
        if ((this.f5824P & 8) != 0) {
            transition.mo6253o0(mo6225I());
        }
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1329q.f5933i);
        mo6276G0(C1532g.m7913k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
