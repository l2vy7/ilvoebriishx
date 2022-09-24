package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
/* compiled from: OrientationHelper */
public abstract class C1157i {

    /* renamed from: a */
    protected final RecyclerView.C1104p f5383a;

    /* renamed from: b */
    private int f5384b;

    /* renamed from: c */
    final Rect f5385c;

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* compiled from: OrientationHelper */
    class C1158a extends C1157i {
        C1158a(RecyclerView.C1104p pVar) {
            super(pVar, (C1158a) null);
        }

        /* renamed from: d */
        public int mo5772d(View view) {
            return this.f5383a.mo5433T(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo5773e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5383a.mo5432S(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: f */
        public int mo5774f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5383a.mo5431R(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: g */
        public int mo5775g(View view) {
            return this.f5383a.mo5429Q(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo5776h() {
            return this.f5383a.mo5473o0();
        }

        /* renamed from: i */
        public int mo5777i() {
            return this.f5383a.mo5473o0() - this.f5383a.mo5454f0();
        }

        /* renamed from: j */
        public int mo5778j() {
            return this.f5383a.mo5454f0();
        }

        /* renamed from: k */
        public int mo5779k() {
            return this.f5383a.mo5475p0();
        }

        /* renamed from: l */
        public int mo5780l() {
            return this.f5383a.mo5438X();
        }

        /* renamed from: m */
        public int mo5781m() {
            return this.f5383a.mo5452e0();
        }

        /* renamed from: n */
        public int mo5782n() {
            return (this.f5383a.mo5473o0() - this.f5383a.mo5452e0()) - this.f5383a.mo5454f0();
        }

        /* renamed from: p */
        public int mo5784p(View view) {
            this.f5383a.mo5471n0(view, true, this.f5385c);
            return this.f5385c.right;
        }

        /* renamed from: q */
        public int mo5785q(View view) {
            this.f5383a.mo5471n0(view, true, this.f5385c);
            return this.f5385c.left;
        }

        /* renamed from: r */
        public void mo5786r(int i) {
            this.f5383a.mo5406C0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    /* compiled from: OrientationHelper */
    class C1159b extends C1157i {
        C1159b(RecyclerView.C1104p pVar) {
            super(pVar, (C1158a) null);
        }

        /* renamed from: d */
        public int mo5772d(View view) {
            return this.f5383a.mo5426O(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo5773e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5383a.mo5431R(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: f */
        public int mo5774f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5383a.mo5432S(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: g */
        public int mo5775g(View view) {
            return this.f5383a.mo5434U(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo5776h() {
            return this.f5383a.mo5437W();
        }

        /* renamed from: i */
        public int mo5777i() {
            return this.f5383a.mo5437W() - this.f5383a.mo5450d0();
        }

        /* renamed from: j */
        public int mo5778j() {
            return this.f5383a.mo5450d0();
        }

        /* renamed from: k */
        public int mo5779k() {
            return this.f5383a.mo5438X();
        }

        /* renamed from: l */
        public int mo5780l() {
            return this.f5383a.mo5475p0();
        }

        /* renamed from: m */
        public int mo5781m() {
            return this.f5383a.mo5456g0();
        }

        /* renamed from: n */
        public int mo5782n() {
            return (this.f5383a.mo5437W() - this.f5383a.mo5456g0()) - this.f5383a.mo5450d0();
        }

        /* renamed from: p */
        public int mo5784p(View view) {
            this.f5383a.mo5471n0(view, true, this.f5385c);
            return this.f5385c.bottom;
        }

        /* renamed from: q */
        public int mo5785q(View view) {
            this.f5383a.mo5471n0(view, true, this.f5385c);
            return this.f5385c.top;
        }

        /* renamed from: r */
        public void mo5786r(int i) {
            this.f5383a.mo5407D0(i);
        }
    }

    /* synthetic */ C1157i(RecyclerView.C1104p pVar, C1158a aVar) {
        this(pVar);
    }

    /* renamed from: a */
    public static C1157i m6396a(RecyclerView.C1104p pVar) {
        return new C1158a(pVar);
    }

    /* renamed from: b */
    public static C1157i m6397b(RecyclerView.C1104p pVar, int i) {
        if (i == 0) {
            return m6396a(pVar);
        }
        if (i == 1) {
            return m6398c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C1157i m6398c(RecyclerView.C1104p pVar) {
        return new C1159b(pVar);
    }

    /* renamed from: d */
    public abstract int mo5772d(View view);

    /* renamed from: e */
    public abstract int mo5773e(View view);

    /* renamed from: f */
    public abstract int mo5774f(View view);

    /* renamed from: g */
    public abstract int mo5775g(View view);

    /* renamed from: h */
    public abstract int mo5776h();

    /* renamed from: i */
    public abstract int mo5777i();

    /* renamed from: j */
    public abstract int mo5778j();

    /* renamed from: k */
    public abstract int mo5779k();

    /* renamed from: l */
    public abstract int mo5780l();

    /* renamed from: m */
    public abstract int mo5781m();

    /* renamed from: n */
    public abstract int mo5782n();

    /* renamed from: o */
    public int mo5783o() {
        if (Integer.MIN_VALUE == this.f5384b) {
            return 0;
        }
        return mo5782n() - this.f5384b;
    }

    /* renamed from: p */
    public abstract int mo5784p(View view);

    /* renamed from: q */
    public abstract int mo5785q(View view);

    /* renamed from: r */
    public abstract void mo5786r(int i);

    /* renamed from: s */
    public void mo5787s() {
        this.f5384b = mo5782n();
    }

    private C1157i(RecyclerView.C1104p pVar) {
        this.f5384b = Integer.MIN_VALUE;
        this.f5385c = new Rect();
        this.f5383a = pVar;
    }
}
