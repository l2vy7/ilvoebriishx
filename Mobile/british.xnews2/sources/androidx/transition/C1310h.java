package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import p110m0.C5723u;
import p111m1.C5746b;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.h */
/* compiled from: GhostViewPort */
class C1310h extends ViewGroup implements C1302e {

    /* renamed from: b */
    ViewGroup f5893b;

    /* renamed from: c */
    View f5894c;

    /* renamed from: d */
    final View f5895d;

    /* renamed from: e */
    int f5896e;

    /* renamed from: f */
    private Matrix f5897f;

    /* renamed from: g */
    private final ViewTreeObserver.OnPreDrawListener f5898g = new C1311a();

    /* renamed from: androidx.transition.h$a */
    /* compiled from: GhostViewPort */
    class C1311a implements ViewTreeObserver.OnPreDrawListener {
        C1311a() {
        }

        public boolean onPreDraw() {
            View view;
            C5723u.m25310e0(C1310h.this);
            C1310h hVar = C1310h.this;
            ViewGroup viewGroup = hVar.f5893b;
            if (viewGroup == null || (view = hVar.f5894c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C5723u.m25310e0(C1310h.this.f5893b);
            C1310h hVar2 = C1310h.this;
            hVar2.f5893b = null;
            hVar2.f5894c = null;
            return true;
        }
    }

    C1310h(View view) {
        super(view.getContext());
        this.f5895d = view;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: b */
    static C1310h m7085b(View view, ViewGroup viewGroup, Matrix matrix) {
        C1304f fVar;
        if (view.getParent() instanceof ViewGroup) {
            C1304f b = C1304f.m7053b(viewGroup);
            C1310h e = m7088e(view);
            int i = 0;
            if (!(e == null || (fVar = (C1304f) e.getParent()) == b)) {
                i = e.f5896e;
                fVar.removeView(e);
                e = null;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m7086c(view, viewGroup, matrix);
                }
                e = new C1310h(view);
                e.mo6324h(matrix);
                if (b == null) {
                    b = new C1304f(viewGroup);
                } else {
                    b.mo6309g();
                }
                m7087d(viewGroup, b);
                m7087d(viewGroup, e);
                b.mo6308a(e);
                e.f5896e = i;
            } else if (matrix != null) {
                e.mo6324h(matrix);
            }
            e.f5896e++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    static void m7086c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C1305f0.m7069j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        C1305f0.m7070k(viewGroup, matrix);
    }

    /* renamed from: d */
    static void m7087d(View view, View view2) {
        C1305f0.m7066g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    static C1310h m7088e(View view) {
        return (C1310h) view.getTag(C5746b.ghost_view);
    }

    /* renamed from: f */
    static void m7089f(View view) {
        C1310h e = m7088e(view);
        if (e != null) {
            int i = e.f5896e - 1;
            e.f5896e = i;
            if (i <= 0) {
                ((C1304f) e.getParent()).removeView(e);
            }
        }
    }

    /* renamed from: g */
    static void m7090g(View view, C1310h hVar) {
        view.setTag(C5746b.ghost_view, hVar);
    }

    /* renamed from: a */
    public void mo6306a(ViewGroup viewGroup, View view) {
        this.f5893b = viewGroup;
        this.f5894c = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6324h(Matrix matrix) {
        this.f5897f = matrix;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7090g(this.f5895d, this);
        this.f5895d.getViewTreeObserver().addOnPreDrawListener(this.f5898g);
        C1305f0.m7068i(this.f5895d, 4);
        if (this.f5895d.getParent() != null) {
            ((View) this.f5895d.getParent()).invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f5895d.getViewTreeObserver().removeOnPreDrawListener(this.f5898g);
        C1305f0.m7068i(this.f5895d, 0);
        m7090g(this.f5895d, (C1310h) null);
        if (this.f5895d.getParent() != null) {
            ((View) this.f5895d.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C1290b.m7007a(canvas, true);
        canvas.setMatrix(this.f5897f);
        C1305f0.m7068i(this.f5895d, 0);
        this.f5895d.invalidate();
        C1305f0.m7068i(this.f5895d, 4);
        drawChild(canvas, this.f5895d, getDrawingTime());
        C1290b.m7007a(canvas, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m7088e(this.f5895d) == this) {
            C1305f0.m7068i(this.f5895d, i == 0 ? 4 : 0);
        }
    }
}
