package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p073f.C5243f;
import p073f.C5247j;
import p111m0.C5723u;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    private boolean f1064b;

    /* renamed from: c */
    private View f1065c;

    /* renamed from: d */
    private View f1066d;

    /* renamed from: e */
    private View f1067e;

    /* renamed from: f */
    Drawable f1068f;

    /* renamed from: g */
    Drawable f1069g;

    /* renamed from: h */
    Drawable f1070h;

    /* renamed from: i */
    boolean f1071i;

    /* renamed from: j */
    boolean f1072j;

    /* renamed from: k */
    private int f1073k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5723u.m25336r0(this, new C0374b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5247j.f23110a);
        this.f1068f = obtainStyledAttributes.getDrawable(C5247j.f23116b);
        this.f1069g = obtainStyledAttributes.getDrawable(C5247j.f23126d);
        this.f1073k = obtainStyledAttributes.getDimensionPixelSize(C5247j.f23156j, -1);
        boolean z = true;
        if (getId() == C5243f.f22905N) {
            this.f1071i = true;
            this.f1070h = obtainStyledAttributes.getDrawable(C5247j.f23121c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1071i ? !(this.f1068f == null && this.f1069g == null) : this.f1070h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m1572a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m1573b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1068f;
        if (drawable != null && drawable.isStateful()) {
            this.f1068f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1069g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1069g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1070h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1070h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1065c;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1068f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1069g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1070h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1066d = findViewById(C5243f.f22914a);
        this.f1067e = findViewById(C5243f.f22919f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1064b || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1065c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1071i) {
            Drawable drawable2 = this.f1070h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1068f != null) {
                if (this.f1066d.getVisibility() == 0) {
                    this.f1068f.setBounds(this.f1066d.getLeft(), this.f1066d.getTop(), this.f1066d.getRight(), this.f1066d.getBottom());
                } else {
                    View view2 = this.f1067e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1068f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1068f.setBounds(this.f1067e.getLeft(), this.f1067e.getTop(), this.f1067e.getRight(), this.f1067e.getBottom());
                    }
                }
                z3 = true;
            }
            this.f1072j = z4;
            if (!z4 || (drawable = this.f1069g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1066d == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.f1073k) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1066d != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f1065c;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m1573b(this.f1066d)) {
                    i3 = m1572a(this.f1066d);
                } else {
                    i3 = !m1573b(this.f1067e) ? m1572a(this.f1067e) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m1572a(this.f1065c), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1068f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1068f);
        }
        this.f1068f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1066d;
            if (view != null) {
                this.f1068f.setBounds(view.getLeft(), this.f1066d.getTop(), this.f1066d.getRight(), this.f1066d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1071i ? !(this.f1068f == null && this.f1069g == null) : this.f1070h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1070h;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1070h);
        }
        this.f1070h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1071i && (drawable2 = this.f1070h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1071i ? this.f1068f == null && this.f1069g == null : this.f1070h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1069g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1069g);
        }
        this.f1069g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1072j && (drawable2 = this.f1069g) != null) {
                drawable2.setBounds(this.f1065c.getLeft(), this.f1065c.getTop(), this.f1065c.getRight(), this.f1065c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1071i ? !(this.f1068f == null && this.f1069g == null) : this.f1070h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0431y yVar) {
        View view = this.f1065c;
        if (view != null) {
            removeView(view);
        }
        this.f1065c = yVar;
        if (yVar != null) {
            addView(yVar);
            ViewGroup.LayoutParams layoutParams = yVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            yVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1064b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1068f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1069g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1070h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1068f && !this.f1071i) || (drawable == this.f1069g && this.f1072j) || ((drawable == this.f1070h && this.f1071i) || super.verifyDrawable(drawable));
    }
}
