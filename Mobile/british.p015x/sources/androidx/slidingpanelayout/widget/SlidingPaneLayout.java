package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C0600b;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p111m0.C5682a;
import p111m0.C5723u;
import p117n0.C5771c;
import p135q0.C5931c;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: b */
    private int f5544b;

    /* renamed from: c */
    private int f5545c;

    /* renamed from: d */
    private Drawable f5546d;

    /* renamed from: e */
    private Drawable f5547e;

    /* renamed from: f */
    private final int f5548f;

    /* renamed from: g */
    private boolean f5549g;

    /* renamed from: h */
    View f5550h;

    /* renamed from: i */
    float f5551i;

    /* renamed from: j */
    private float f5552j;

    /* renamed from: k */
    int f5553k;

    /* renamed from: l */
    boolean f5554l;

    /* renamed from: m */
    private int f5555m;

    /* renamed from: n */
    private float f5556n;

    /* renamed from: o */
    private float f5557o;

    /* renamed from: p */
    private C1226d f5558p;

    /* renamed from: q */
    final C5931c f5559q;

    /* renamed from: r */
    boolean f5560r;

    /* renamed from: s */
    private boolean f5561s;

    /* renamed from: t */
    private final Rect f5562t;

    /* renamed from: u */
    final ArrayList<C1224b> f5563u;

    /* renamed from: v */
    private Method f5564v;

    /* renamed from: w */
    private Field f5565w;

    /* renamed from: x */
    private boolean f5566x;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1222a();

        /* renamed from: d */
        boolean f5572d;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        static class C1222a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1222a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5572d ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5572d = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    class C1223a extends C5682a {

        /* renamed from: d */
        private final Rect f5573d = new Rect();

        C1223a() {
        }

        /* renamed from: n */
        private void m6677n(C5771c cVar, C5771c cVar2) {
            Rect rect = this.f5573d;
            cVar2.mo22643m(rect);
            cVar.mo22619X(rect);
            cVar2.mo22645n(rect);
            cVar.mo22620Y(rect);
            cVar.mo22605F0(cVar2.mo22614N());
            cVar.mo22651q0(cVar2.mo22660v());
            cVar.mo22627c0(cVar2.mo22649p());
            cVar.mo22634g0(cVar2.mo22652r());
            cVar.mo22635h0(cVar2.mo22604F());
            cVar.mo22629d0(cVar2.mo22602E());
            cVar.mo22639j0(cVar2.mo22606G());
            cVar.mo22641k0(cVar2.mo22608H());
            cVar.mo22618V(cVar2.mo22596B());
            cVar.mo22666y0(cVar2.mo22612L());
            cVar.mo22646n0(cVar2.mo22609I());
            cVar.mo22622a(cVar2.mo22640k());
            cVar.mo22650p0(cVar2.mo22656t());
        }

        /* renamed from: f */
        public void mo3196f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3196f(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            C5771c Q = C5771c.m25535Q(cVar);
            super.mo3197g(view, Q);
            m6677n(cVar, Q);
            Q.mo22616S();
            cVar.mo22627c0(SlidingPaneLayout.class.getName());
            cVar.mo22595A0(view);
            ViewParent H = C5723u.m25277H(view);
            if (H instanceof View) {
                cVar.mo22655s0((View) H);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!mo6026o(childAt) && childAt.getVisibility() == 0) {
                    C5723u.m25350y0(childAt, 1);
                    cVar.mo22626c(childAt);
                }
            }
        }

        /* renamed from: i */
        public boolean mo3314i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo6026o(view)) {
                return super.mo3314i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: o */
        public boolean mo6026o(View view) {
            return SlidingPaneLayout.this.mo5991h(view);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    private class C1224b implements Runnable {

        /* renamed from: b */
        final View f5575b;

        C1224b(View view) {
            this.f5575b = view;
        }

        public void run() {
            if (this.f5575b.getParent() == SlidingPaneLayout.this) {
                this.f5575b.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.mo5984g(this.f5575b);
            }
            SlidingPaneLayout.this.f5563u.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    private class C1225c extends C5931c.C5934c {
        C1225c() {
        }

        /* renamed from: a */
        public int mo3319a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f5550h.getLayoutParams();
            if (SlidingPaneLayout.this.mo5992i()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.f5550h.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f5553k);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f5553k + paddingLeft);
        }

        /* renamed from: b */
        public int mo3320b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo3321d(View view) {
            return SlidingPaneLayout.this.f5553k;
        }

        /* renamed from: f */
        public void mo3322f(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f5559q.mo22959c(slidingPaneLayout.f5550h, i2);
        }

        /* renamed from: i */
        public void mo3325i(View view, int i) {
            SlidingPaneLayout.this.mo6006p();
        }

        /* renamed from: j */
        public void mo3326j(int i) {
            if (SlidingPaneLayout.this.f5559q.mo22945A() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f5551i == 0.0f) {
                    slidingPaneLayout.mo6008r(slidingPaneLayout.f5550h);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.mo5979d(slidingPaneLayout2.f5550h);
                    SlidingPaneLayout.this.f5560r = false;
                    return;
                }
                slidingPaneLayout.mo5982e(slidingPaneLayout.f5550h);
                SlidingPaneLayout.this.f5560r = true;
            }
        }

        /* renamed from: k */
        public void mo3327k(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.mo5995l(i);
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo3328l(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo5992i()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f5551i > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f5553k;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f5550h.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.f5551i > 0.5f)) {
                    i += SlidingPaneLayout.this.f5553k;
                }
            }
            SlidingPaneLayout.this.f5559q.mo22953N(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo3329m(View view, int i) {
            if (SlidingPaneLayout.this.f5554l) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f5569b;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface C1226d {
        /* renamed from: a */
        void mo6028a(View view, float f);

        /* renamed from: b */
        void mo6029b(View view);

        /* renamed from: c */
        void mo6030c(View view);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private boolean m6655b(View view, int i) {
        if (!this.f5561s && !mo6007q(0.0f, i)) {
            return false;
        }
        this.f5560r = false;
        return true;
    }

    /* renamed from: c */
    private void m6656c(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.f5571d == null) {
                layoutParams.f5571d = new Paint();
            }
            layoutParams.f5571d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f5571d);
            }
            mo5984g(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.f5571d;
            if (paint != null) {
                paint.setColorFilter((ColorFilter) null);
            }
            C1224b bVar = new C1224b(view);
            this.f5563u.add(bVar);
            C5723u.m25314g0(this, bVar);
        }
    }

    /* renamed from: n */
    private boolean m6657n(View view, int i) {
        if (!this.f5561s && !mo6007q(1.0f, i)) {
            return false;
        }
        this.f5560r = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6658o(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo5992i()
            android.view.View r1 = r9.f5550h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f5570c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f5550h
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.f5552j
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f5555m
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f5552j = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.f5552j
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.f5545c
            r9.m6656c(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m6658o(float):void");
    }

    /* renamed from: s */
    private static boolean m6659s(View view) {
        Drawable background;
        if (view.isOpaque()) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5976a() {
        return m6655b(this.f5550h, 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f5559q.mo22962n(true)) {
            return;
        }
        if (!this.f5549g) {
            this.f5559q.mo22957a();
        } else {
            C5723u.m25310e0(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5979d(View view) {
        C1226d dVar = this.f5558p;
        if (dVar != null) {
            dVar.mo6030c(view);
        }
        sendAccessibilityEvent(32);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (mo5992i()) {
            drawable = this.f5547e;
        } else {
            drawable = this.f5546d;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo5992i()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f5549g && !layoutParams.f5569b && this.f5550h != null) {
            canvas.getClipBounds(this.f5562t);
            if (mo5992i()) {
                Rect rect = this.f5562t;
                rect.left = Math.max(rect.left, this.f5550h.getRight());
            } else {
                Rect rect2 = this.f5562t;
                rect2.right = Math.min(rect2.right, this.f5550h.getLeft());
            }
            canvas.clipRect(this.f5562t);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5982e(View view) {
        C1226d dVar = this.f5558p;
        if (dVar != null) {
            dVar.mo6029b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5983f(View view) {
        C1226d dVar = this.f5558p;
        if (dVar != null) {
            dVar.mo6028a(view, this.f5551i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5984g(View view) {
        Field field;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            C5723u.m25264A0(view, ((LayoutParams) view.getLayoutParams()).f5571d);
            return;
        }
        if (i >= 16) {
            if (!this.f5566x) {
                try {
                    this.f5564v = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
                } catch (NoSuchMethodException e) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
                }
                try {
                    Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f5565w = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
                }
                this.f5566x = true;
            }
            if (this.f5564v == null || (field = this.f5565w) == null) {
                view.invalidate();
                return;
            }
            try {
                field.setBoolean(view, true);
                this.f5564v.invoke(view, (Object[]) null);
            } catch (Exception e3) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e3);
            }
        }
        C5723u.m25312f0(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f5545c;
    }

    public int getParallaxDistance() {
        return this.f5555m;
    }

    public int getSliderFadeColor() {
        return this.f5544b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo5991h(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f5549g || !layoutParams.f5570c || this.f5551i <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo5992i() {
        return C5723u.m25265B(this) == 1;
    }

    /* renamed from: j */
    public boolean mo5993j() {
        return !this.f5549g || this.f5551i == 1.0f;
    }

    /* renamed from: k */
    public boolean mo5994k() {
        return this.f5549g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5995l(int i) {
        if (this.f5550h == null) {
            this.f5551i = 0.0f;
            return;
        }
        boolean i2 = mo5992i();
        LayoutParams layoutParams = (LayoutParams) this.f5550h.getLayoutParams();
        int width = this.f5550h.getWidth();
        if (i2) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = ((float) (i - ((i2 ? getPaddingRight() : getPaddingLeft()) + (i2 ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) this.f5553k);
        this.f5551i = paddingRight;
        if (this.f5555m != 0) {
            m6658o(paddingRight);
        }
        if (layoutParams.f5570c) {
            m6656c(this.f5550h, this.f5551i, this.f5544b);
        }
        mo5983f(this.f5550h);
    }

    /* renamed from: m */
    public boolean mo5996m() {
        return m6657n(this.f5550h, 0);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5561s = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5561s = true;
        int size = this.f5563u.size();
        for (int i = 0; i < size; i++) {
            this.f5563u.get(i).run();
        }
        this.f5563u.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f5549g && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f5560r = !this.f5559q.mo22948E(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f5549g || (this.f5554l && actionMasked != 0)) {
            this.f5559q.mo22958b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f5559q.mo22958b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f5554l = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f5556n = x;
                this.f5557o = y;
                if (this.f5559q.mo22948E(this.f5550h, (int) x, (int) y) && mo5991h(this.f5550h)) {
                    z = true;
                    if (this.f5559q.mo22954O(motionEvent) && !z) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f5556n);
                float abs2 = Math.abs(y2 - this.f5557o);
                if (abs > ((float) this.f5559q.mo22966z()) && abs2 > abs) {
                    this.f5559q.mo22958b();
                    this.f5554l = true;
                    return false;
                }
            }
            z = false;
            return this.f5559q.mo22954O(motionEvent) ? true : true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean i9 = mo5992i();
        if (i9) {
            this.f5559q.mo22951L(2);
        } else {
            this.f5559q.mo22951L(1);
        }
        int i10 = i3 - i;
        int paddingRight = i9 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = i9 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f5561s) {
            this.f5551i = (!this.f5549g || !this.f5560r) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f5569b) {
                    int i13 = i10 - paddingLeft;
                    int min = (Math.min(paddingRight, i13 - this.f5548f) - i11) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f5553k = min;
                    int i14 = i9 ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f5570c = ((i11 + i14) + min) + (measuredWidth / 2) > i13;
                    int i15 = (int) (((float) min) * this.f5551i);
                    i11 += i14 + i15;
                    this.f5551i = ((float) i15) / ((float) min);
                    i5 = 0;
                } else if (!this.f5549g || (i8 = this.f5555m) == 0) {
                    i11 = paddingRight;
                    i5 = 0;
                } else {
                    i5 = (int) ((1.0f - this.f5551i) * ((float) i8));
                    i11 = paddingRight;
                }
                if (i9) {
                    i6 = (i10 - i11) + i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i7 = i11 - i5;
                    i6 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.f5561s) {
            if (this.f5549g) {
                if (this.f5555m != 0) {
                    m6658o(this.f5551i);
                }
                if (((LayoutParams) this.f5550h.getLayoutParams()).f5570c) {
                    m6656c(this.f5550h, this.f5551i, this.f5544b);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    m6656c(getChildAt(i16), 0.0f, this.f5544b);
                }
            }
            mo6008r(this.f5550h);
        }
        this.f5561s = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        int i11;
        int i12;
        int i13;
        int i14;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f5550h = null;
        int i15 = paddingLeft;
        int i16 = 0;
        boolean z2 = false;
        float f2 = 0.0f;
        while (true) {
            i5 = 8;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f5570c = z;
            } else {
                float f3 = layoutParams.f5568a;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (layoutParams.width == 0) {
                    }
                }
                int i17 = layoutParams.leftMargin + layoutParams.rightMargin;
                int i18 = layoutParams.width;
                if (i18 == -2) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i17, Integer.MIN_VALUE);
                    f = f2;
                    i12 = Integer.MIN_VALUE;
                } else {
                    f = f2;
                    i12 = Integer.MIN_VALUE;
                    if (i18 == -1) {
                        i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i17, 1073741824);
                    } else {
                        i11 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    }
                }
                int i19 = layoutParams.height;
                if (i19 == -2) {
                    i13 = View.MeasureSpec.makeMeasureSpec(i3, i12);
                } else {
                    if (i19 == -1) {
                        i14 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else {
                        i14 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    }
                    i13 = i14;
                }
                childAt.measure(i11, i13);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i12 && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, i3);
                }
                i15 -= measuredWidth;
                boolean z3 = i15 < 0;
                layoutParams.f5569b = z3;
                z2 |= z3;
                if (z3) {
                    this.f5550h = childAt;
                }
                f2 = f;
            }
            i16++;
            z = false;
        }
        if (z2 || f2 > 0.0f) {
            int i20 = paddingLeft - this.f5548f;
            int i21 = 0;
            while (i21 < childCount) {
                View childAt2 = getChildAt(i21);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        boolean z4 = layoutParams2.width == 0 && layoutParams2.f5568a > 0.0f;
                        if (z4) {
                            i7 = 0;
                        } else {
                            i7 = childAt2.getMeasuredWidth();
                        }
                        if (!z2 || childAt2 == this.f5550h) {
                            if (layoutParams2.f5568a > 0.0f) {
                                if (layoutParams2.width == 0) {
                                    int i22 = layoutParams2.height;
                                    if (i22 == -2) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    } else if (i22 == -1) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                    } else {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
                                    }
                                } else {
                                    i8 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z2) {
                                    int i23 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i6 = i20;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23, 1073741824);
                                    if (i7 != i23) {
                                        childAt2.measure(makeMeasureSpec, i8);
                                    }
                                    i21++;
                                    i20 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i20;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7 + ((int) ((layoutParams2.f5568a * ((float) Math.max(0, i15))) / f2)), 1073741824), i8);
                                    i21++;
                                    i20 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i7 > i20 || layoutParams2.f5568a > 0.0f)) {
                            if (z4) {
                                int i24 = layoutParams2.height;
                                if (i24 == -2) {
                                    i10 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    i9 = 1073741824;
                                } else if (i24 == -1) {
                                    i9 = 1073741824;
                                    i10 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i9 = 1073741824;
                                    i10 = View.MeasureSpec.makeMeasureSpec(i24, 1073741824);
                                }
                            } else {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i20, i9), i10);
                        }
                    }
                }
                i6 = i20;
                i21++;
                i20 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, i4 + getPaddingTop() + getPaddingBottom());
        this.f5549g = z2;
        if (this.f5559q.mo22945A() != 0 && !z2) {
            this.f5559q.mo22957a();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        if (savedState.f5572d) {
            mo5996m();
        } else {
            mo5976a();
        }
        this.f5560r = savedState.f5572d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5572d = mo5994k() ? mo5993j() : this.f5560r;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f5561s = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5549g) {
            return super.onTouchEvent(motionEvent);
        }
        this.f5559q.mo22949F(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f5556n = x;
            this.f5557o = y;
        } else if (actionMasked == 1 && mo5991h(this.f5550h)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f5556n;
            float f2 = y2 - this.f5557o;
            int z = this.f5559q.mo22966z();
            if ((f * f) + (f2 * f2) < ((float) (z * z)) && this.f5559q.mo22948E(this.f5550h, (int) x2, (int) y2)) {
                m6655b(this.f5550h, 0);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6006p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo6007q(float f, int i) {
        int i2;
        if (!this.f5549g) {
            return false;
        }
        boolean i3 = mo5992i();
        LayoutParams layoutParams = (LayoutParams) this.f5550h.getLayoutParams();
        if (i3) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f5553k))) + ((float) this.f5550h.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f5553k)));
        }
        C5931c cVar = this.f5559q;
        View view = this.f5550h;
        if (!cVar.mo22955P(view, i2, view.getTop())) {
            return false;
        }
        mo6006p();
        C5723u.m25310e0(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo6008r(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean i5 = mo5992i();
        int width = i5 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = i5 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m6659s(view)) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 < childCount && (childAt = getChildAt(i6)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z = i5;
                } else {
                    z = i5;
                    childAt.setVisibility((Math.max(i5 ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(i5 ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4);
                }
                i6++;
                view2 = view;
                i5 = z;
            } else {
                return;
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f5549g) {
            this.f5560r = view == this.f5550h;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f5545c = i;
    }

    public void setPanelSlideListener(C1226d dVar) {
        this.f5558p = dVar;
    }

    public void setParallaxDistance(int i) {
        this.f5555m = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f5546d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f5547e = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0600b.m3294f(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0600b.m3294f(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.f5544b = i;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f5567e = {16843137};

        /* renamed from: a */
        public float f5568a = 0.0f;

        /* renamed from: b */
        boolean f5569b;

        /* renamed from: c */
        boolean f5570c;

        /* renamed from: d */
        Paint f5571d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5567e);
            this.f5568a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5544b = -858993460;
        this.f5561s = true;
        this.f5562t = new Rect();
        this.f5563u = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f5548f = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C5723u.m25330o0(this, new C1223a());
        C5723u.m25350y0(this, 1);
        C5931c o = C5931c.m26182o(this, 0.5f, new C1225c());
        this.f5559q = o;
        o.mo22952M(f * 400.0f);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
