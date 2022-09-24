package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
/* compiled from: SimpleItemAnimator */
public abstract class C1165m extends RecyclerView.C1098m {

    /* renamed from: g */
    boolean f5393g = true;

    /* renamed from: A */
    public final void mo5800A(RecyclerView.C1087c0 c0Var) {
        mo5808I(c0Var);
        mo5375h(c0Var);
    }

    /* renamed from: B */
    public final void mo5801B(RecyclerView.C1087c0 c0Var) {
        mo5809J(c0Var);
    }

    /* renamed from: C */
    public final void mo5802C(RecyclerView.C1087c0 c0Var, boolean z) {
        mo5810K(c0Var, z);
        mo5375h(c0Var);
    }

    /* renamed from: D */
    public final void mo5803D(RecyclerView.C1087c0 c0Var, boolean z) {
        mo5811L(c0Var, z);
    }

    /* renamed from: E */
    public final void mo5804E(RecyclerView.C1087c0 c0Var) {
        mo5812M(c0Var);
        mo5375h(c0Var);
    }

    /* renamed from: F */
    public final void mo5805F(RecyclerView.C1087c0 c0Var) {
        mo5813N(c0Var);
    }

    /* renamed from: G */
    public final void mo5806G(RecyclerView.C1087c0 c0Var) {
        mo5814O(c0Var);
        mo5375h(c0Var);
    }

    /* renamed from: H */
    public final void mo5807H(RecyclerView.C1087c0 c0Var) {
        mo5815P(c0Var);
    }

    /* renamed from: I */
    public void mo5808I(RecyclerView.C1087c0 c0Var) {
    }

    /* renamed from: J */
    public void mo5809J(RecyclerView.C1087c0 c0Var) {
    }

    /* renamed from: K */
    public void mo5810K(RecyclerView.C1087c0 c0Var, boolean z) {
    }

    /* renamed from: L */
    public void mo5811L(RecyclerView.C1087c0 c0Var, boolean z) {
    }

    /* renamed from: M */
    public void mo5812M(RecyclerView.C1087c0 c0Var) {
    }

    /* renamed from: N */
    public void mo5813N(RecyclerView.C1087c0 c0Var) {
    }

    /* renamed from: O */
    public void mo5814O(RecyclerView.C1087c0 c0Var) {
    }

    /* renamed from: P */
    public void mo5815P(RecyclerView.C1087c0 c0Var) {
    }

    /* renamed from: a */
    public boolean mo5369a(RecyclerView.C1087c0 c0Var, RecyclerView.C1098m.C1101c cVar, RecyclerView.C1098m.C1101c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f5114a) == (i2 = cVar2.f5114a) && cVar.f5115b == cVar2.f5115b)) {
            return mo5713w(c0Var);
        }
        return mo5715y(c0Var, i, cVar.f5115b, i2, cVar2.f5115b);
    }

    /* renamed from: b */
    public boolean mo5370b(RecyclerView.C1087c0 c0Var, RecyclerView.C1087c0 c0Var2, RecyclerView.C1098m.C1101c cVar, RecyclerView.C1098m.C1101c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f5114a;
        int i4 = cVar.f5115b;
        if (c0Var2.shouldIgnore()) {
            int i5 = cVar.f5114a;
            i = cVar.f5115b;
            i2 = i5;
        } else {
            i2 = cVar2.f5114a;
            i = cVar2.f5115b;
        }
        return mo5714x(c0Var, c0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo5371c(RecyclerView.C1087c0 c0Var, RecyclerView.C1098m.C1101c cVar, RecyclerView.C1098m.C1101c cVar2) {
        int i = cVar.f5114a;
        int i2 = cVar.f5115b;
        View view = c0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f5114a;
        int top = cVar2 == null ? view.getTop() : cVar2.f5115b;
        if (c0Var.isRemoved() || (i == left && i2 == top)) {
            return mo5716z(c0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo5715y(c0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo5372d(RecyclerView.C1087c0 c0Var, RecyclerView.C1098m.C1101c cVar, RecyclerView.C1098m.C1101c cVar2) {
        int i = cVar.f5114a;
        int i2 = cVar2.f5114a;
        if (i == i2 && cVar.f5115b == cVar2.f5115b) {
            mo5804E(c0Var);
            return false;
        }
        return mo5715y(c0Var, i, cVar.f5115b, i2, cVar2.f5115b);
    }

    /* renamed from: f */
    public boolean mo5373f(RecyclerView.C1087c0 c0Var) {
        return !this.f5393g || c0Var.isInvalid();
    }

    /* renamed from: w */
    public abstract boolean mo5713w(RecyclerView.C1087c0 c0Var);

    /* renamed from: x */
    public abstract boolean mo5714x(RecyclerView.C1087c0 c0Var, RecyclerView.C1087c0 c0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo5715y(RecyclerView.C1087c0 c0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo5716z(RecyclerView.C1087c0 c0Var);
}
