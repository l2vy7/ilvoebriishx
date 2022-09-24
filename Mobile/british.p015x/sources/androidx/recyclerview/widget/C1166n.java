package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
/* compiled from: SnapHelper */
public abstract class C1166n extends RecyclerView.C1110r {

    /* renamed from: a */
    RecyclerView f5394a;

    /* renamed from: b */
    private Scroller f5395b;

    /* renamed from: c */
    private final RecyclerView.C1112t f5396c = new C1167a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* compiled from: SnapHelper */
    class C1167a extends RecyclerView.C1112t {

        /* renamed from: a */
        boolean f5397a = false;

        C1167a() {
        }

        /* renamed from: a */
        public void mo5505a(RecyclerView recyclerView, int i) {
            super.mo5505a(recyclerView, i);
            if (i == 0 && this.f5397a) {
                this.f5397a = false;
                C1166n.this.mo5817j();
            }
        }

        /* renamed from: b */
        public void mo5506b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f5397a = true;
            }
        }
    }

    /* renamed from: e */
    private void m6501e() {
        this.f5394a.mo5108b1(this.f5396c);
        this.f5394a.setOnFlingListener((RecyclerView.C1110r) null);
    }

    /* renamed from: h */
    private void m6502h() throws IllegalStateException {
        if (this.f5394a.getOnFlingListener() == null) {
            this.f5394a.mo5164l(this.f5396c);
            this.f5394a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: i */
    private boolean m6503i(RecyclerView.C1104p pVar, int i, int i2) {
        RecyclerView.C1118y d;
        int g;
        if (!(pVar instanceof RecyclerView.C1118y.C1120b) || (d = mo5789d(pVar)) == null || (g = mo5791g(pVar, i, i2)) == -1) {
            return false;
        }
        d.mo5570p(g);
        pVar.mo5420J1(d);
        return true;
    }

    /* renamed from: a */
    public boolean mo5501a(int i, int i2) {
        RecyclerView.C1104p layoutManager = this.f5394a.getLayoutManager();
        if (layoutManager == null || this.f5394a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5394a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m6503i(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo5816b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f5394a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m6501e();
            }
            this.f5394a = recyclerView;
            if (recyclerView != null) {
                m6502h();
                this.f5395b = new Scroller(this.f5394a.getContext(), new DecelerateInterpolator());
                mo5817j();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo5788c(RecyclerView.C1104p pVar, View view);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract RecyclerView.C1118y mo5789d(RecyclerView.C1104p pVar);

    /* renamed from: f */
    public abstract View mo5790f(RecyclerView.C1104p pVar);

    /* renamed from: g */
    public abstract int mo5791g(RecyclerView.C1104p pVar, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5817j() {
        RecyclerView.C1104p layoutManager;
        View f;
        RecyclerView recyclerView = this.f5394a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f = mo5790f(layoutManager)) != null) {
            int[] c = mo5788c(layoutManager, f);
            if (c[0] != 0 || c[1] != 0) {
                this.f5394a.mo5171o1(c[0], c[1]);
            }
        }
    }
}
