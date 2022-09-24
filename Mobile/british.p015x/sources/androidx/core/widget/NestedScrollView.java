package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import p111m0.C5682a;
import p111m0.C5712j;
import p111m0.C5713k;
import p111m0.C5715m;
import p111m0.C5717o;
import p111m0.C5723u;
import p117n0.C5771c;
import p117n0.C5780e;
import p181z.C6417a;

public class NestedScrollView extends FrameLayout implements C5715m, C5712j {

    /* renamed from: B */
    private static final C0610a f3183B = new C0610a();

    /* renamed from: C */
    private static final int[] f3184C = {16843130};

    /* renamed from: A */
    private C0611b f3185A;

    /* renamed from: b */
    private long f3186b;

    /* renamed from: c */
    private final Rect f3187c;

    /* renamed from: d */
    private OverScroller f3188d;

    /* renamed from: e */
    private EdgeEffect f3189e;

    /* renamed from: f */
    private EdgeEffect f3190f;

    /* renamed from: g */
    private int f3191g;

    /* renamed from: h */
    private boolean f3192h;

    /* renamed from: i */
    private boolean f3193i;

    /* renamed from: j */
    private View f3194j;

    /* renamed from: k */
    private boolean f3195k;

    /* renamed from: l */
    private VelocityTracker f3196l;

    /* renamed from: m */
    private boolean f3197m;

    /* renamed from: n */
    private boolean f3198n;

    /* renamed from: o */
    private int f3199o;

    /* renamed from: p */
    private int f3200p;

    /* renamed from: q */
    private int f3201q;

    /* renamed from: r */
    private int f3202r;

    /* renamed from: s */
    private final int[] f3203s;

    /* renamed from: t */
    private final int[] f3204t;

    /* renamed from: u */
    private int f3205u;

    /* renamed from: v */
    private int f3206v;

    /* renamed from: w */
    private SavedState f3207w;

    /* renamed from: x */
    private final C5717o f3208x;

    /* renamed from: y */
    private final C5713k f3209y;

    /* renamed from: z */
    private float f3210z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0609a();

        /* renamed from: b */
        public int f3211b;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        class C0609a implements Parcelable.Creator<SavedState> {
            C0609a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3211b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3211b);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3211b = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0610a extends C5682a {
        C0610a() {
        }

        /* renamed from: f */
        public void mo3196f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3196f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C5780e.m25631a(accessibilityEvent, nestedScrollView.getScrollX());
            C5780e.m25632b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            int scrollRange;
            super.mo3197g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo22627c0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.mo22664x0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.mo22624b(C5771c.C5772a.f24485r);
                    cVar.mo22624b(C5771c.C5772a.f24457C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.mo22624b(C5771c.C5772a.f24484q);
                    cVar.mo22624b(C5771c.C5772a.f24459E);
                }
            }
        }

        /* renamed from: j */
        public boolean mo3198j(View view, int i, Bundle bundle) {
            if (super.mo3198j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo3129O(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo3129O(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0611b {
        /* renamed from: a */
        void mo748a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6417a.nestedScrollViewStyle);
    }

    /* renamed from: A */
    private static boolean m3350A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m3350A((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private boolean m3351B(View view, int i, int i2) {
        view.getDrawingRect(this.f3187c);
        offsetDescendantRectToMyCoords(view, this.f3187c);
        return this.f3187c.bottom + i >= getScrollY() && this.f3187c.top - i <= getScrollY() + i2;
    }

    /* renamed from: C */
    private void m3352C(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3209y.mo22459e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: D */
    private void m3353D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3202r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3191g = (int) motionEvent.getY(i);
            this.f3202r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3196l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: G */
    private void m3354G() {
        VelocityTracker velocityTracker = this.f3196l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3196l = null;
        }
    }

    /* renamed from: H */
    private void m3355H(boolean z) {
        if (z) {
            mo3130P(2, 1);
        } else {
            mo3131Q(1);
        }
        this.f3206v = getScrollY();
        C5723u.m25310e0(this);
    }

    /* renamed from: I */
    private boolean m3356I(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View r = m3366r(z2, i2, i3);
        if (r == null) {
            r = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m3363h(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (r != findFocus()) {
            r.requestFocus(i);
        }
        return z;
    }

    /* renamed from: J */
    private void m3357J(View view) {
        view.getDrawingRect(this.f3187c);
        offsetDescendantRectToMyCoords(view, this.f3187c);
        int e = mo3150e(this.f3187c);
        if (e != 0) {
            scrollBy(0, e);
        }
    }

    /* renamed from: K */
    private boolean m3358K(Rect rect, boolean z) {
        int e = mo3150e(rect);
        boolean z2 = e != 0;
        if (z2) {
            if (z) {
                scrollBy(0, e);
            } else {
                mo3127L(0, e);
            }
        }
        return z2;
    }

    /* renamed from: M */
    private void m3359M(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3186b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f3188d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m3355H(z);
            } else {
                if (!this.f3188d.isFinished()) {
                    m3360a();
                }
                scrollBy(i, i2);
            }
            this.f3186b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    private void m3360a() {
        this.f3188d.abortAnimation();
        mo3131Q(1);
    }

    /* renamed from: c */
    private boolean m3361c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m3362d(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3210z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3210z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3210z;
    }

    /* renamed from: h */
    private void m3363h(int i) {
        if (i == 0) {
            return;
        }
        if (this.f3198n) {
            mo3127L(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: i */
    private void m3364i() {
        this.f3195k = false;
        m3354G();
        mo3131Q(0);
        EdgeEffect edgeEffect = this.f3189e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f3190f.onRelease();
        }
    }

    /* renamed from: p */
    private void m3365p() {
        if (getOverScrollMode() == 2) {
            this.f3189e = null;
            this.f3190f = null;
        } else if (this.f3189e == null) {
            Context context = getContext();
            this.f3189e = new EdgeEffect(context);
            this.f3190f = new EdgeEffect(context);
        }
    }

    /* renamed from: r */
    private View m3366r(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    private boolean m3367v(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private void m3368w() {
        VelocityTracker velocityTracker = this.f3196l;
        if (velocityTracker == null) {
            this.f3196l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    private void m3369x() {
        this.f3188d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3199o = viewConfiguration.getScaledTouchSlop();
        this.f3200p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3201q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    private void m3370y() {
        if (this.f3196l == null) {
            this.f3196l = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    private boolean m3371z(View view) {
        return !m3351B(view, 0, getHeight());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3125E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo3189u(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f3188d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo3125E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean mo3126F(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f3187c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3187c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3187c.top = getScrollY() - height;
            Rect rect2 = this.f3187c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3187c;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m3356I(i, i2, i3);
    }

    /* renamed from: L */
    public final void mo3127L(int i, int i2) {
        m3359M(i, i2, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3128N(int i, int i2, int i3, boolean z) {
        m3359M(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo3129O(int i, int i2, boolean z) {
        mo3128N(i, i2, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, z);
    }

    /* renamed from: P */
    public boolean mo3130P(int i, int i2) {
        return this.f3209y.mo22466p(i, i2);
    }

    /* renamed from: Q */
    public void mo3131Q(int i) {
        this.f3209y.mo22468r(i);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo3136b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3351B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3363h(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3187c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3187c);
            m3363h(mo3150e(this.f3187c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m3371z(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f3188d.isFinished()) {
            this.f3188d.computeScrollOffset();
            int currY = this.f3188d.getCurrY();
            int i = currY - this.f3206v;
            this.f3206v = currY;
            int[] iArr = this.f3204t;
            boolean z = false;
            iArr[1] = 0;
            mo3151f(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f3204t[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo3125E(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f3204t;
                iArr2[1] = 0;
                mo3152g(0, scrollY2, 0, i3, this.f3203s, 1, iArr2);
                i2 = i3 - this.f3204t[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m3365p();
                    if (i2 < 0) {
                        if (this.f3189e.isFinished()) {
                            this.f3189e.onAbsorb((int) this.f3188d.getCurrVelocity());
                        }
                    } else if (this.f3190f.isFinished()) {
                        this.f3190f.onAbsorb((int) this.f3188d.getCurrVelocity());
                    }
                }
                m3360a();
            }
            if (!this.f3188d.isFinished()) {
                C5723u.m25310e0(this);
            } else {
                mo3131Q(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3174q(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3209y.mo22455a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3209y.mo22456b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3151f(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3209y.mo22460f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f3189e != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f3189e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f3189e.setSize(width, height);
                if (this.f3189e.draw(canvas)) {
                    C5723u.m25310e0(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f3190f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (i4 >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f3190f.setSize(width2, height2);
                if (this.f3190f.draw(canvas)) {
                    C5723u.m25310e0(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo3150e(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    /* renamed from: f */
    public boolean mo3151f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3209y.mo22458d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: g */
    public void mo3152g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f3209y.mo22459e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f3208x.mo22469a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return mo3189u(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3209y.mo22463l();
    }

    /* renamed from: j */
    public void mo1345j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m3352C(i4, i5, iArr);
    }

    /* renamed from: k */
    public void mo1346k(View view, int i, int i2, int i3, int i4, int i5) {
        m3352C(i4, i5, (int[]) null);
    }

    /* renamed from: l */
    public boolean mo1347l(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: m */
    public void mo1348m(View view, View view2, int i, int i2) {
        this.f3208x.mo22471c(view, view2, i, i2);
        mo3130P(2, i2);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo1349n(View view, int i) {
        this.f3208x.mo22473e(view, i);
        mo3131Q(i);
    }

    /* renamed from: o */
    public void mo1350o(View view, int i, int i2, int[] iArr, int i3) {
        mo3151f(i, i2, iArr, (int[]) null, i3);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3193i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f3195k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f3195k) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f3202r;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f3191g) > this.f3199o && (2 & getNestedScrollAxes()) == 0) {
                                this.f3195k = true;
                                this.f3191g = y;
                                m3370y();
                                this.f3196l.addMovement(motionEvent);
                                this.f3205u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m3353D(motionEvent);
                    }
                }
            }
            this.f3195k = false;
            this.f3202r = -1;
            m3354G();
            if (this.f3188d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C5723u.m25310e0(this);
            }
            mo3131Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m3367v((int) motionEvent.getX(), y2)) {
                this.f3195k = false;
                m3354G();
            } else {
                this.f3191g = y2;
                this.f3202r = motionEvent.getPointerId(0);
                m3368w();
                this.f3196l.addMovement(motionEvent);
                this.f3188d.computeScrollOffset();
                this.f3195k = !this.f3188d.isFinished();
                mo3130P(2, 0);
            }
        }
        return this.f3195k;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3192h = false;
        View view = this.f3194j;
        if (view != null && m3350A(view, this)) {
            m3357J(this.f3194j);
        }
        this.f3194j = null;
        if (!this.f3193i) {
            if (this.f3207w != null) {
                scrollTo(getScrollX(), this.f3207w.f3211b);
                this.f3207w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d = m3362d(scrollY, paddingTop, i5);
            if (d != scrollY) {
                scrollTo(getScrollX(), d);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3193i = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3197m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo3179s((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1350o(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m3352C(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1348m(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m3371z(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3207w = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3211b = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0611b bVar = this.f3185A;
        if (bVar != null) {
            bVar.mo748a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m3351B(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f3187c);
            offsetDescendantRectToMyCoords(findFocus, this.f3187c);
            m3363h(mo3150e(this.f3187c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1347l(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1349n(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        m3370y();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3205u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f3205u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3196l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f3201q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3202r);
                if (Math.abs(yVelocity) >= this.f3200p) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        mo3179s(i);
                    }
                } else if (this.f3188d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C5723u.m25310e0(this);
                }
                this.f3202r = -1;
                m3364i();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f3202r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3202r + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f3191g - y;
                    if (!this.f3195k && Math.abs(i2) > this.f3199o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3195k = true;
                        i2 = i2 > 0 ? i2 - this.f3199o : i2 + this.f3199o;
                    }
                    int i3 = i2;
                    if (this.f3195k) {
                        if (mo3151f(0, i3, this.f3204t, this.f3203s, 0)) {
                            i3 -= this.f3204t[1];
                            this.f3205u += this.f3203s[1];
                        }
                        int i4 = i3;
                        this.f3191g = y - this.f3203s[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i5 = scrollRange;
                        if (mo3125E(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !mo3189u(0)) {
                            this.f3196l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f3204t;
                        iArr[1] = 0;
                        mo3152g(0, scrollY2, 0, i4 - scrollY2, this.f3203s, 0, iArr);
                        int i6 = this.f3191g;
                        int[] iArr2 = this.f3203s;
                        this.f3191g = i6 - iArr2[1];
                        this.f3205u += iArr2[1];
                        if (z) {
                            int i7 = i4 - this.f3204t[1];
                            m3365p();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                C0619f.m3438a(this.f3189e, ((float) i7) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f3190f.isFinished()) {
                                    this.f3190f.onRelease();
                                }
                            } else if (i8 > i5) {
                                C0619f.m3438a(this.f3190f, ((float) i7) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f3189e.isFinished()) {
                                    this.f3189e.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f3189e;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f3190f.isFinished())) {
                                C5723u.m25310e0(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3195k && getChildCount() > 0 && this.f3188d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C5723u.m25310e0(this);
                }
                this.f3202r = -1;
                m3364i();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3191g = (int) motionEvent2.getY(actionIndex);
                this.f3202r = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m3353D(motionEvent);
                this.f3191g = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f3202r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f3188d.isFinished();
            this.f3195k = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3188d.isFinished()) {
                m3360a();
            }
            this.f3191g = (int) motionEvent.getY();
            this.f3202r = motionEvent2.getPointerId(0);
            mo3130P(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f3196l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: q */
    public boolean mo3174q(KeyEvent keyEvent) {
        this.f3187c.setEmpty();
        boolean c = m3361c();
        int i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        if (!c) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    mo3126F(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return mo3136b(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                } else {
                    return mo3188t(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                }
            } else if (!keyEvent.isAltPressed()) {
                return mo3136b(33);
            } else {
                return mo3188t(33);
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3192h) {
            m3357J(view2);
        } else {
            this.f3194j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m3358K(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m3354G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f3192h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void mo3179s(int i) {
        if (getChildCount() > 0) {
            this.f3188d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m3355H(true);
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int d = m3362d(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int d2 = m3362d(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (d != getScrollX() || d2 != getScrollY()) {
                super.scrollTo(d, d2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3197m) {
            this.f3197m = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3209y.mo22464m(z);
    }

    public void setOnScrollChangeListener(C0611b bVar) {
        this.f3185A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3198n = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo3130P(i, 0);
    }

    public void stopNestedScroll() {
        mo3131Q(0);
    }

    /* renamed from: t */
    public boolean mo3188t(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f3187c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3187c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3187c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3187c;
        return m3356I(i, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean mo3189u(int i) {
        return this.f3209y.mo22462k(i);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3187c = new Rect();
        this.f3192h = true;
        this.f3193i = false;
        this.f3194j = null;
        this.f3195k = false;
        this.f3198n = true;
        this.f3202r = -1;
        this.f3203s = new int[2];
        this.f3204t = new int[2];
        m3369x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3184C, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3208x = new C5717o(this);
        this.f3209y = new C5713k(this);
        setNestedScrollingEnabled(true);
        C5723u.m25330o0(this, f3183B);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
