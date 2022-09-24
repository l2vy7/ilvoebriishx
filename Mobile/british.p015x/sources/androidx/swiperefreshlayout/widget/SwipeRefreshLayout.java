package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.C0600b;
import androidx.core.widget.C0622i;
import p111m0.C5712j;
import p111m0.C5713k;
import p111m0.C5716n;
import p111m0.C5717o;
import p111m0.C5723u;

public class SwipeRefreshLayout extends ViewGroup implements C5716n, C5712j {

    /* renamed from: P */
    private static final String f5583P = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: Q */
    private static final int[] f5584Q = {16842766};

    /* renamed from: A */
    int f5585A;

    /* renamed from: B */
    int f5586B;

    /* renamed from: C */
    C1240b f5587C;

    /* renamed from: D */
    private Animation f5588D;

    /* renamed from: E */
    private Animation f5589E;

    /* renamed from: F */
    private Animation f5590F;

    /* renamed from: G */
    private Animation f5591G;

    /* renamed from: H */
    private Animation f5592H;

    /* renamed from: I */
    boolean f5593I;

    /* renamed from: J */
    private int f5594J;

    /* renamed from: K */
    boolean f5595K;

    /* renamed from: L */
    private C1236i f5596L;

    /* renamed from: M */
    private Animation.AnimationListener f5597M = new C1228a();

    /* renamed from: N */
    private final Animation f5598N = new C1233f();

    /* renamed from: O */
    private final Animation f5599O = new C1234g();

    /* renamed from: b */
    private View f5600b;

    /* renamed from: c */
    C1237j f5601c;

    /* renamed from: d */
    boolean f5602d = false;

    /* renamed from: e */
    private int f5603e;

    /* renamed from: f */
    private float f5604f = -1.0f;

    /* renamed from: g */
    private float f5605g;

    /* renamed from: h */
    private final C5717o f5606h;

    /* renamed from: i */
    private final C5713k f5607i;

    /* renamed from: j */
    private final int[] f5608j = new int[2];

    /* renamed from: k */
    private final int[] f5609k = new int[2];

    /* renamed from: l */
    private boolean f5610l;

    /* renamed from: m */
    private int f5611m;

    /* renamed from: n */
    int f5612n;

    /* renamed from: o */
    private float f5613o;

    /* renamed from: p */
    private float f5614p;

    /* renamed from: q */
    private boolean f5615q;

    /* renamed from: r */
    private int f5616r = -1;

    /* renamed from: s */
    boolean f5617s;

    /* renamed from: t */
    private boolean f5618t;

    /* renamed from: u */
    private final DecelerateInterpolator f5619u;

    /* renamed from: v */
    C1238a f5620v;

    /* renamed from: w */
    private int f5621w = -1;

    /* renamed from: x */
    protected int f5622x;

    /* renamed from: y */
    float f5623y;

    /* renamed from: z */
    protected int f5624z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    class C1228a implements Animation.AnimationListener {
        C1228a() {
        }

        public void onAnimationEnd(Animation animation) {
            C1237j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f5602d) {
                swipeRefreshLayout.f5587C.setAlpha(255);
                SwipeRefreshLayout.this.f5587C.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f5593I && (jVar = swipeRefreshLayout2.f5601c) != null) {
                    jVar.mo6090a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f5612n = swipeRefreshLayout3.f5620v.getTop();
                return;
            }
            swipeRefreshLayout.mo6057r();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    class C1229b extends Animation {
        C1229b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    class C1230c extends Animation {
        C1230c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    class C1231d extends Animation {

        /* renamed from: b */
        final /* synthetic */ int f5628b;

        /* renamed from: c */
        final /* synthetic */ int f5629c;

        C1231d(int i, int i2) {
            this.f5628b = i;
            this.f5629c = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C1240b bVar = SwipeRefreshLayout.this.f5587C;
            int i = this.f5628b;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f5629c - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    class C1232e implements Animation.AnimationListener {
        C1232e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f5617s) {
                swipeRefreshLayout.mo6076x((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    class C1233f extends Animation {
        C1233f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f5595K) {
                i = swipeRefreshLayout.f5585A - Math.abs(swipeRefreshLayout.f5624z);
            } else {
                i = swipeRefreshLayout.f5585A;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f5622x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.f5620v.getTop());
            SwipeRefreshLayout.this.f5587C.mo6101e(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    class C1234g extends Animation {
        C1234g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo6056p(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    class C1235h extends Animation {
        C1235h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f5623y;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo6056p(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface C1236i {
        /* renamed from: a */
        boolean mo6089a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface C1237j {
        /* renamed from: a */
        void mo6090a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5603e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5611m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f5619u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f5594J = (int) (displayMetrics.density * 40.0f);
        m6699d();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f5585A = i;
        this.f5604f = (float) i;
        this.f5606h = new C5717o(this);
        this.f5607i = new C5713k(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f5594J;
        this.f5612n = i2;
        this.f5624z = i2;
        mo6056p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5584Q);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m6697a(int i, Animation.AnimationListener animationListener) {
        this.f5622x = i;
        this.f5598N.reset();
        this.f5598N.setDuration(200);
        this.f5598N.setInterpolator(this.f5619u);
        if (animationListener != null) {
            this.f5620v.mo6091b(animationListener);
        }
        this.f5620v.clearAnimation();
        this.f5620v.startAnimation(this.f5598N);
    }

    /* renamed from: b */
    private void m6698b(int i, Animation.AnimationListener animationListener) {
        if (this.f5617s) {
            m6710y(i, animationListener);
            return;
        }
        this.f5622x = i;
        this.f5599O.reset();
        this.f5599O.setDuration(200);
        this.f5599O.setInterpolator(this.f5619u);
        if (animationListener != null) {
            this.f5620v.mo6091b(animationListener);
        }
        this.f5620v.clearAnimation();
        this.f5620v.startAnimation(this.f5599O);
    }

    /* renamed from: d */
    private void m6699d() {
        this.f5620v = new C1238a(getContext(), -328966);
        C1240b bVar = new C1240b(getContext());
        this.f5587C = bVar;
        bVar.mo6109l(1);
        this.f5620v.setImageDrawable(this.f5587C);
        this.f5620v.setVisibility(8);
        addView(this.f5620v);
    }

    /* renamed from: e */
    private void m6700e() {
        if (this.f5600b == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f5620v)) {
                    this.f5600b = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m6701f(float f) {
        if (f > this.f5604f) {
            m6705s(true, true);
            return;
        }
        this.f5602d = false;
        this.f5587C.mo6107j(0.0f, 0.0f);
        C1232e eVar = null;
        if (!this.f5617s) {
            eVar = new C1232e();
        }
        m6698b(this.f5612n, eVar);
        this.f5587C.mo6099d(false);
    }

    /* renamed from: g */
    private boolean m6702g(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: i */
    private void m6703i(float f) {
        this.f5587C.mo6099d(true);
        float min = Math.min(1.0f, Math.abs(f / this.f5604f));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f5604f;
        int i = this.f5586B;
        if (i <= 0) {
            i = this.f5595K ? this.f5585A - this.f5624z : this.f5585A;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.f5624z + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f5620v.getVisibility() != 0) {
            this.f5620v.setVisibility(0);
        }
        if (!this.f5617s) {
            this.f5620v.setScaleX(1.0f);
            this.f5620v.setScaleY(1.0f);
        }
        if (this.f5617s) {
            setAnimationProgress(Math.min(1.0f, f / this.f5604f));
        }
        if (f < this.f5604f) {
            if (this.f5587C.getAlpha() > 76 && !m6702g(this.f5590F)) {
                m6709w();
            }
        } else if (this.f5587C.getAlpha() < 255 && !m6702g(this.f5591G)) {
            m6708v();
        }
        this.f5587C.mo6107j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f5587C.mo6101e(Math.min(1.0f, max));
        this.f5587C.mo6103g((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f5612n);
    }

    /* renamed from: q */
    private void m6704q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5616r) {
            this.f5616r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: s */
    private void m6705s(boolean z, boolean z2) {
        if (this.f5602d != z) {
            this.f5593I = z2;
            m6700e();
            this.f5602d = z;
            if (z) {
                m6697a(this.f5612n, this.f5597M);
            } else {
                mo6076x(this.f5597M);
            }
        }
    }

    private void setColorViewAlpha(int i) {
        this.f5620v.getBackground().setAlpha(i);
        this.f5587C.setAlpha(i);
    }

    /* renamed from: t */
    private Animation m6706t(int i, int i2) {
        C1231d dVar = new C1231d(i, i2);
        dVar.setDuration(300);
        this.f5620v.mo6091b((Animation.AnimationListener) null);
        this.f5620v.clearAnimation();
        this.f5620v.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: u */
    private void m6707u(float f) {
        float f2 = this.f5614p;
        int i = this.f5603e;
        if (f - f2 > ((float) i) && !this.f5615q) {
            this.f5613o = f2 + ((float) i);
            this.f5615q = true;
            this.f5587C.setAlpha(76);
        }
    }

    /* renamed from: v */
    private void m6708v() {
        this.f5591G = m6706t(this.f5587C.getAlpha(), 255);
    }

    /* renamed from: w */
    private void m6709w() {
        this.f5590F = m6706t(this.f5587C.getAlpha(), 76);
    }

    /* renamed from: y */
    private void m6710y(int i, Animation.AnimationListener animationListener) {
        this.f5622x = i;
        this.f5623y = this.f5620v.getScaleX();
        C1235h hVar = new C1235h();
        this.f5592H = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f5620v.mo6091b(animationListener);
        }
        this.f5620v.clearAnimation();
        this.f5620v.startAnimation(this.f5592H);
    }

    /* renamed from: z */
    private void m6711z(Animation.AnimationListener animationListener) {
        this.f5620v.setVisibility(0);
        this.f5587C.setAlpha(255);
        C1229b bVar = new C1229b();
        this.f5588D = bVar;
        bVar.setDuration((long) this.f5611m);
        if (animationListener != null) {
            this.f5620v.mo6091b(animationListener);
        }
        this.f5620v.clearAnimation();
        this.f5620v.startAnimation(this.f5588D);
    }

    /* renamed from: c */
    public boolean mo6039c() {
        C1236i iVar = this.f5596L;
        if (iVar != null) {
            return iVar.mo6089a(this, this.f5600b);
        }
        View view = this.f5600b;
        if (view instanceof ListView) {
            return C0622i.m3446a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f5607i.mo22455a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f5607i.mo22456b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f5607i.mo22457c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f5607i.mo22460f(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f5621w;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f5606h.mo22469a();
    }

    public int getProgressCircleDiameter() {
        return this.f5594J;
    }

    public int getProgressViewEndOffset() {
        return this.f5585A;
    }

    public int getProgressViewStartOffset() {
        return this.f5624z;
    }

    /* renamed from: h */
    public boolean mo6049h() {
        return this.f5602d;
    }

    public boolean hasNestedScrollingParent() {
        return this.f5607i.mo22461j();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f5607i.mo22463l();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo6057r();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m6700e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5618t && actionMasked == 0) {
            this.f5618t = false;
        }
        if (!isEnabled() || this.f5618t || mo6039c() || this.f5602d || this.f5610l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f5616r;
                    if (i == -1) {
                        Log.e(f5583P, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m6707u(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m6704q(motionEvent);
                    }
                }
            }
            this.f5615q = false;
            this.f5616r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f5624z - this.f5620v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f5616r = pointerId;
            this.f5615q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f5614p = motionEvent.getY(findPointerIndex2);
        }
        return this.f5615q;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f5600b == null) {
                m6700e();
            }
            View view = this.f5600b;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f5620v.getMeasuredWidth();
                int measuredHeight2 = this.f5620v.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f5612n;
                this.f5620v.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5600b == null) {
            m6700e();
        }
        View view = this.f5600b;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f5620v.measure(View.MeasureSpec.makeMeasureSpec(this.f5594J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5594J, 1073741824));
            this.f5621w = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f5620v) {
                    this.f5621w = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f5605g;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f5605g = 0.0f;
                } else {
                    this.f5605g = f - f2;
                    iArr[1] = i2;
                }
                m6703i(this.f5605g);
            }
        }
        if (this.f5595K && i2 > 0 && this.f5605g == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f5620v.setVisibility(8);
        }
        int[] iArr2 = this.f5608j;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f5609k);
        int i5 = i4 + this.f5609k[1];
        if (i5 < 0 && !mo6039c()) {
            float abs = this.f5605g + ((float) Math.abs(i5));
            this.f5605g = abs;
            m6703i(abs);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f5606h.mo22470b(view, view2, i);
        startNestedScroll(i & 2);
        this.f5605g = 0.0f;
        this.f5610l = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f5618t && !this.f5602d && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f5606h.mo22472d(view);
        this.f5610l = false;
        float f = this.f5605g;
        if (f > 0.0f) {
            m6701f(f);
            this.f5605g = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5618t && actionMasked == 0) {
            this.f5618t = false;
        }
        if (!isEnabled() || this.f5618t || mo6039c() || this.f5602d || this.f5610l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f5616r = motionEvent.getPointerId(0);
            this.f5615q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5616r);
            if (findPointerIndex < 0) {
                Log.e(f5583P, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f5615q) {
                this.f5615q = false;
                m6701f((motionEvent.getY(findPointerIndex) - this.f5613o) * 0.5f);
            }
            this.f5616r = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f5616r);
            if (findPointerIndex2 < 0) {
                Log.e(f5583P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            m6707u(y);
            if (this.f5615q) {
                float f = (y - this.f5613o) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m6703i(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f5583P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f5616r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m6704q(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6056p(float f) {
        int i = this.f5622x;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f5624z - i)) * f))) - this.f5620v.getTop());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo6057r() {
        this.f5620v.clearAnimation();
        this.f5587C.stop();
        this.f5620v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f5617s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f5624z - this.f5612n);
        }
        this.f5612n = this.f5620v.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f5600b instanceof AbsListView)) {
            View view = this.f5600b;
            if (view == null || C5723u.m25295U(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        this.f5620v.setScaleX(f);
        this.f5620v.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m6700e();
        this.f5587C.mo6102f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0600b.m3292d(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f5604f = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo6057r();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f5607i.mo22464m(z);
    }

    public void setOnChildScrollUpCallback(C1236i iVar) {
        this.f5596L = iVar;
    }

    public void setOnRefreshListener(C1237j jVar) {
        this.f5601c = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f5620v.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0600b.m3292d(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f5602d == z) {
            m6705s(z, false);
            return;
        }
        this.f5602d = z;
        if (!this.f5595K) {
            i = this.f5585A + this.f5624z;
        } else {
            i = this.f5585A;
        }
        setTargetOffsetTopAndBottom(i - this.f5612n);
        this.f5593I = false;
        m6711z(this.f5597M);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f5594J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f5594J = (int) (displayMetrics.density * 40.0f);
            }
            this.f5620v.setImageDrawable((Drawable) null);
            this.f5587C.mo6109l(i);
            this.f5620v.setImageDrawable(this.f5587C);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f5586B = i;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f5620v.bringToFront();
        C5723u.m25300Z(this.f5620v, i);
        this.f5612n = this.f5620v.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f5607i.mo22465o(i);
    }

    public void stopNestedScroll() {
        this.f5607i.mo22467q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo6076x(Animation.AnimationListener animationListener) {
        C1230c cVar = new C1230c();
        this.f5589E = cVar;
        cVar.setDuration(150);
        this.f5620v.mo6091b(animationListener);
        this.f5620v.clearAnimation();
        this.f5620v.startAnimation(this.f5589E);
    }
}
