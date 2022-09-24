package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p111m0.C5723u;

/* renamed from: androidx.transition.c0 */
/* compiled from: ViewOverlayApi14 */
class C1294c0 implements C1303e0 {

    /* renamed from: a */
    protected C1295a f5858a;

    /* renamed from: androidx.transition.c0$a */
    /* compiled from: ViewOverlayApi14 */
    static class C1295a extends ViewGroup {

        /* renamed from: g */
        static Method f5859g;

        /* renamed from: b */
        ViewGroup f5860b;

        /* renamed from: c */
        View f5861c;

        /* renamed from: d */
        ArrayList<Drawable> f5862d = null;

        /* renamed from: e */
        C1294c0 f5863e;

        /* renamed from: f */
        private boolean f5864f;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f5859g = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C1295a(Context context, ViewGroup viewGroup, View view, C1294c0 c0Var) {
            super(context);
            this.f5860b = viewGroup;
            this.f5861c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f5863e = c0Var;
        }

        /* renamed from: c */
        private void m7015c() {
            if (this.f5864f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m7016d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f5862d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f5864f = true;
                    this.f5860b.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m7017e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f5860b.getLocationOnScreen(iArr2);
            this.f5861c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo6296a(Drawable drawable) {
            m7015c();
            if (this.f5862d == null) {
                this.f5862d = new ArrayList<>();
            }
            if (!this.f5862d.contains(drawable)) {
                this.f5862d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo6297b(View view) {
            m7015c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f5860b || viewGroup.getParent() == null || !C5723u.m25293S(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f5860b.getLocationOnScreen(iArr2);
                    C5723u.m25299Y(view, iArr[0] - iArr2[0]);
                    C5723u.m25300Z(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f5860b.getLocationOnScreen(iArr);
            this.f5861c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f5861c.getWidth(), this.f5861c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f5862d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5862d.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo6300f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f5862d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                m7016d();
            }
        }

        /* renamed from: g */
        public void mo6301g(View view) {
            super.removeView(view);
            m7016d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f5860b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f5860b instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m7017e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f5862d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f5862d
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1294c0.C1295a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    C1294c0(Context context, ViewGroup viewGroup, View view) {
        this.f5858a = new C1295a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    static C1294c0 m7011e(View view) {
        ViewGroup f = m7012f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C1295a) {
                return ((C1295a) childAt).f5863e;
            }
        }
        return new C1340x(f.getContext(), f, view);
    }

    /* renamed from: f */
    static ViewGroup m7012f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo6294a(Drawable drawable) {
        this.f5858a.mo6296a(drawable);
    }

    /* renamed from: b */
    public void mo6295b(Drawable drawable) {
        this.f5858a.mo6300f(drawable);
    }
}
