package com.google.android.material.internal;

import android.annotation.SuppressLint;
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

/* renamed from: com.google.android.material.internal.p */
/* compiled from: ViewOverlayApi14 */
class C10223p implements C10226r {

    /* renamed from: a */
    protected C10224a f48131a;

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* renamed from: com.google.android.material.internal.p$a */
    /* compiled from: ViewOverlayApi14 */
    static class C10224a extends ViewGroup {

        /* renamed from: g */
        static Method f48132g;

        /* renamed from: b */
        ViewGroup f48133b;

        /* renamed from: c */
        View f48134c;

        /* renamed from: d */
        ArrayList<Drawable> f48135d = null;

        /* renamed from: e */
        C10223p f48136e;

        /* renamed from: f */
        private boolean f48137f;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f48132g = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C10224a(Context context, ViewGroup viewGroup, View view, C10223p pVar) {
            super(context);
            this.f48133b = viewGroup;
            this.f48134c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f48136e = pVar;
        }

        /* renamed from: b */
        private void m47124b() {
            if (this.f48137f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: c */
        private void m47125c() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f48135d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f48137f = true;
                    this.f48133b.removeView(this);
                }
            }
        }

        /* renamed from: d */
        private void m47126d(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f48133b.getLocationOnScreen(iArr2);
            this.f48134c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo41002a(Drawable drawable) {
            m47124b();
            if (this.f48135d == null) {
                this.f48135d = new ArrayList<>();
            }
            if (!this.f48135d.contains(drawable)) {
                this.f48135d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f48133b.getLocationOnScreen(iArr);
            this.f48134c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f48134c.getWidth(), this.f48134c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f48135d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f48135d.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public void mo41005e(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f48135d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                m47125c();
            }
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f48133b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f48133b != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m47126d(iArr2);
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
            r0 = r1.f48135d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f48135d
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C10223p.C10224a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    C10223p(Context context, ViewGroup viewGroup, View view) {
        this.f48131a = new C10224a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C10223p m47121c(View view) {
        ViewGroup d = C10227s.m47136d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C10224a) {
                return ((C10224a) childAt).f48136e;
            }
        }
        return new C10222o(d.getContext(), d, view);
    }

    /* renamed from: a */
    public void mo41000a(Drawable drawable) {
        this.f48131a.mo41002a(drawable);
    }

    /* renamed from: b */
    public void mo41001b(Drawable drawable) {
        this.f48131a.mo41005e(drawable);
    }
}
