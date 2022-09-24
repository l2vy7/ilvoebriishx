package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p072f.C5238a;
import p072f.C5247j;
import p110m0.C5723u;
import p110m0.C5740y;
import p110m0.C5744z;

/* renamed from: androidx.appcompat.widget.a */
/* compiled from: AbsActionBarView */
abstract class C0371a extends ViewGroup {

    /* renamed from: b */
    protected final C0372a f1508b;

    /* renamed from: c */
    protected final Context f1509c;

    /* renamed from: d */
    protected ActionMenuView f1510d;

    /* renamed from: e */
    protected ActionMenuPresenter f1511e;

    /* renamed from: f */
    protected int f1512f;

    /* renamed from: g */
    protected C5740y f1513g;

    /* renamed from: h */
    private boolean f1514h;

    /* renamed from: i */
    private boolean f1515i;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* compiled from: AbsActionBarView */
    protected class C0372a implements C5744z {

        /* renamed from: a */
        private boolean f1516a = false;

        /* renamed from: b */
        int f1517b;

        protected C0372a() {
        }

        /* renamed from: a */
        public void mo2054a(View view) {
            this.f1516a = true;
        }

        /* renamed from: b */
        public void mo875b(View view) {
            if (!this.f1516a) {
                C0371a aVar = C0371a.this;
                aVar.f1513g = null;
                C0371a.super.setVisibility(this.f1517b);
            }
        }

        /* renamed from: c */
        public void mo876c(View view) {
            C0371a.super.setVisibility(0);
            this.f1516a = false;
        }

        /* renamed from: d */
        public C0372a mo2055d(C5740y yVar, int i) {
            C0371a.this.f1513g = yVar;
            this.f1517b = i;
            return this;
        }
    }

    C0371a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    protected static int m1934d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo2051c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo2052e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C5740y mo1301f(int i, long j) {
        C5740y yVar = this.f1513g;
        if (yVar != null) {
            yVar.mo22505b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C5740y a = C5723u.m25307d(this).mo22504a(1.0f);
            a.mo22507d(j);
            a.mo22509f(this.f1508b.mo2055d(a, i));
            return a;
        }
        C5740y a2 = C5723u.m25307d(this).mo22504a(0.0f);
        a2.mo22507d(j);
        a2.mo22509f(this.f1508b.mo2055d(a2, i));
        return a2;
    }

    public int getAnimatedVisibility() {
        if (this.f1513g != null) {
            return this.f1508b.f1517b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1512f;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C5247j.f23110a, C5238a.f22807c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C5247j.f23156j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1511e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1393I(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1515i = false;
        }
        if (!this.f1515i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1515i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1515i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1514h = false;
        }
        if (!this.f1514h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1514h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1514h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1512f = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C5740y yVar = this.f1513g;
            if (yVar != null) {
                yVar.mo22505b();
            }
            super.setVisibility(i);
        }
    }

    C0371a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1508b = new C0372a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C5238a.f22805a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1509c = context;
        } else {
            this.f1509c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
