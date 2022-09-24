package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* compiled from: PagerSnapHelper */
public class C1160j extends C1166n {

    /* renamed from: d */
    private C1157i f5386d;

    /* renamed from: e */
    private C1157i f5387e;

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* compiled from: PagerSnapHelper */
    class C1161a extends C1154g {
        C1161a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo5569o(View view, RecyclerView.C1121z zVar, RecyclerView.C1118y.C1119a aVar) {
            C1160j jVar = C1160j.this;
            int[] c = jVar.mo5788c(jVar.f5394a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = mo5766w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.mo5576d(i, i2, w, this.f5375j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo5765v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public int mo5767x(int i) {
            return Math.min(100, super.mo5767x(i));
        }
    }

    /* renamed from: k */
    private int m6443k(View view, C1157i iVar) {
        return (iVar.mo5775g(view) + (iVar.mo5773e(view) / 2)) - (iVar.mo5781m() + (iVar.mo5782n() / 2));
    }

    /* renamed from: l */
    private View m6444l(RecyclerView.C1104p pVar, C1157i iVar) {
        int J = pVar.mo5419J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m = iVar.mo5781m() + (iVar.mo5782n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < J; i2++) {
            View I = pVar.mo5418I(i2);
            int abs = Math.abs((iVar.mo5775g(I) + (iVar.mo5773e(I) / 2)) - m);
            if (abs < i) {
                view = I;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: m */
    private C1157i m6445m(RecyclerView.C1104p pVar) {
        C1157i iVar = this.f5387e;
        if (iVar == null || iVar.f5383a != pVar) {
            this.f5387e = C1157i.m6396a(pVar);
        }
        return this.f5387e;
    }

    /* renamed from: n */
    private C1157i m6446n(RecyclerView.C1104p pVar) {
        if (pVar.mo5033l()) {
            return m6447o(pVar);
        }
        if (pVar.mo5031k()) {
            return m6445m(pVar);
        }
        return null;
    }

    /* renamed from: o */
    private C1157i m6447o(RecyclerView.C1104p pVar) {
        C1157i iVar = this.f5386d;
        if (iVar == null || iVar.f5383a != pVar) {
            this.f5386d = C1157i.m6398c(pVar);
        }
        return this.f5386d;
    }

    /* renamed from: p */
    private boolean m6448p(RecyclerView.C1104p pVar, int i, int i2) {
        return pVar.mo5031k() ? i > 0 : i2 > 0;
    }

    /* renamed from: q */
    private boolean m6449q(RecyclerView.C1104p pVar) {
        PointF a;
        int Y = pVar.mo5439Y();
        if (!(pVar instanceof RecyclerView.C1118y.C1120b) || (a = ((RecyclerView.C1118y.C1120b) pVar).mo5024a(Y - 1)) == null) {
            return false;
        }
        if (a.x < 0.0f || a.y < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int[] mo5788c(RecyclerView.C1104p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.mo5031k()) {
            iArr[0] = m6443k(view, m6445m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.mo5033l()) {
            iArr[1] = m6443k(view, m6447o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public RecyclerView.C1118y mo5789d(RecyclerView.C1104p pVar) {
        if (!(pVar instanceof RecyclerView.C1118y.C1120b)) {
            return null;
        }
        return new C1161a(this.f5394a.getContext());
    }

    /* renamed from: f */
    public View mo5790f(RecyclerView.C1104p pVar) {
        if (pVar.mo5033l()) {
            return m6444l(pVar, m6447o(pVar));
        }
        if (pVar.mo5031k()) {
            return m6444l(pVar, m6445m(pVar));
        }
        return null;
    }

    /* renamed from: g */
    public int mo5791g(RecyclerView.C1104p pVar, int i, int i2) {
        C1157i n;
        int Y = pVar.mo5439Y();
        if (Y == 0 || (n = m6446n(pVar)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int J = pVar.mo5419J();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < J; i5++) {
            View I = pVar.mo5418I(i5);
            if (I != null) {
                int k = m6443k(I, n);
                if (k <= 0 && k > i3) {
                    view2 = I;
                    i3 = k;
                }
                if (k >= 0 && k < i4) {
                    view = I;
                    i4 = k;
                }
            }
        }
        boolean p = m6448p(pVar, i, i2);
        if (p && view != null) {
            return pVar.mo5459h0(view);
        }
        if (!p && view2 != null) {
            return pVar.mo5459h0(view2);
        }
        if (p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int h0 = pVar.mo5459h0(view) + (m6449q(pVar) == p ? -1 : 1);
        if (h0 < 0 || h0 >= Y) {
            return -1;
        }
        return h0;
    }
}
