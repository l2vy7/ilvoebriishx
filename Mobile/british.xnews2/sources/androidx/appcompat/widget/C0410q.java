package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.C0621h;
import java.lang.reflect.Field;
import p062d0.C5135a;
import p072f.C5238a;
import p083h.C5366c;
import p110m0.C5740y;

/* renamed from: androidx.appcompat.widget.q */
/* compiled from: DropDownListView */
class C0410q extends ListView {

    /* renamed from: b */
    private final Rect f1658b = new Rect();

    /* renamed from: c */
    private int f1659c = 0;

    /* renamed from: d */
    private int f1660d = 0;

    /* renamed from: e */
    private int f1661e = 0;

    /* renamed from: f */
    private int f1662f = 0;

    /* renamed from: g */
    private int f1663g;

    /* renamed from: h */
    private Field f1664h;

    /* renamed from: i */
    private C0411a f1665i;

    /* renamed from: j */
    private boolean f1666j;

    /* renamed from: k */
    private boolean f1667k;

    /* renamed from: l */
    private boolean f1668l;

    /* renamed from: m */
    private C5740y f1669m;

    /* renamed from: n */
    private C0621h f1670n;

    /* renamed from: o */
    C0412b f1671o;

    /* renamed from: androidx.appcompat.widget.q$a */
    /* compiled from: DropDownListView */
    private static class C0411a extends C5366c {

        /* renamed from: c */
        private boolean f1672c = true;

        C0411a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2238c(boolean z) {
            this.f1672c = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1672c) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1672c) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1672c) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1672c) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1672c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.q$b */
    /* compiled from: DropDownListView */
    private class C0412b implements Runnable {
        C0412b() {
        }

        /* renamed from: a */
        public void mo2244a() {
            C0410q qVar = C0410q.this;
            qVar.f1671o = null;
            qVar.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo2245b() {
            C0410q.this.post(this);
        }

        public void run() {
            C0410q qVar = C0410q.this;
            qVar.f1671o = null;
            qVar.drawableStateChanged();
        }
    }

    C0410q(Context context, boolean z) {
        super(context, (AttributeSet) null, C5238a.f22788B);
        this.f1667k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1664h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2202a() {
        this.f1668l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1663g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C5740y yVar = this.f1669m;
        if (yVar != null) {
            yVar.mo22505b();
            this.f1669m = null;
        }
    }

    /* renamed from: b */
    private void m2203b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m2204c(Canvas canvas) {
        Drawable selector;
        if (!this.f1658b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1658b);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m2205f(int i, View view) {
        Rect rect = this.f1658b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1659c;
        rect.top -= this.f1660d;
        rect.right += this.f1661e;
        rect.bottom += this.f1662f;
        try {
            boolean z = this.f1664h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1664h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m2206g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m2205f(i, view);
        if (z2) {
            Rect rect = this.f1658b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C5135a.m23411k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m2207h(int i, View view, float f, float f2) {
        m2206g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C5135a.m23411k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m2208i(View view, int i, float f, float f2) {
        View childAt;
        this.f1668l = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f1663g;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1663g = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (i2 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m2207h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m2209j() {
        return this.f1668l;
    }

    /* renamed from: k */
    private void m2210k() {
        Drawable selector = getSelector();
        if (selector != null && m2209j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0411a aVar = this.f1665i;
        if (aVar != null) {
            aVar.mo2238c(z);
        }
    }

    /* renamed from: d */
    public int mo2225d(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m2204c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1671o == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m2210k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2228e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m2208i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m2203b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m2202a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.h r9 = r7.f1670n
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f1670n = r9
        L_0x005a:
            androidx.core.widget.h r9 = r7.f1670n
            r9.mo3205m(r2)
            androidx.core.widget.h r9 = r7.f1670n
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.h r8 = r7.f1670n
            if (r8 == 0) goto L_0x006c
            r8.mo3205m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0410q.mo2228e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f1667k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1667k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1667k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1667k && this.f1666j) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1671o = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1671o == null) {
            C0412b bVar = new C0412b();
            this.f1671o = bVar;
            bVar.mo2245b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m2210k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1663g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0412b bVar = this.f1671o;
        if (bVar != null) {
            bVar.mo2244a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1666j = z;
    }

    public void setSelector(Drawable drawable) {
        C0411a aVar = drawable != null ? new C0411a(drawable) : null;
        this.f1665i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1659c = rect.left;
        this.f1660d = rect.top;
        this.f1661e = rect.right;
        this.f1662f = rect.bottom;
    }
}
