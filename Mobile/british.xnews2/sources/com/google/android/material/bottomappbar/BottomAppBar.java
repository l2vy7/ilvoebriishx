package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C10227s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p062d0.C5135a;
import p110m0.C5690c0;
import p110m0.C5723u;
import p193c6.C6522b;
import p193c6.C6524d;
import p193c6.C6531k;
import p199d6.C10503k;
import p242p6.C10889h;
import p242p6.C10893i;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0578b {

    /* renamed from: z0 */
    private static final int f47287z0 = C6531k.Widget_MaterialComponents_BottomAppBar;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final int f47288Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C10889h f47289R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public Animator f47290S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public Animator f47291T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f47292U;

    /* renamed from: V */
    private int f47293V;

    /* renamed from: W */
    private boolean f47294W;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public final boolean f47295l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public final boolean f47296m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public final boolean f47297n0;

    /* renamed from: o0 */
    private int f47298o0;

    /* renamed from: p0 */
    private ArrayList<C10041j> f47299p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public int f47300q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public boolean f47301r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public boolean f47302s0;

    /* renamed from: t0 */
    private Behavior f47303t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public int f47304u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public int f47305v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public int f47306w0;

    /* renamed from: x0 */
    AnimatorListenerAdapter f47307x0;

    /* renamed from: y0 */
    C10503k<FloatingActionButton> f47308y0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10030a();

        /* renamed from: d */
        int f47314d;

        /* renamed from: e */
        boolean f47315e;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        static class C10030a implements Parcelable.ClassLoaderCreator<SavedState> {
            C10030a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f47314d);
            parcel.writeInt(this.f47315e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f47314d = parcel.readInt();
            this.f47315e = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C10031a extends AnimatorListenerAdapter {
        C10031a() {
        }

        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.f47301r0) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m45866I0(bottomAppBar.f47292U, BottomAppBar.this.f47302s0);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C10032b implements C10503k<FloatingActionButton> {
        C10032b() {
        }

        /* renamed from: c */
        public void mo39766a(FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f47289R.mo43092b0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        /* renamed from: d */
        public void mo39767b(FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().mo39788k() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().mo39794s(translationX);
                BottomAppBar.this.f47289R.invalidateSelf();
            }
            float f = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().mo39783c() != max) {
                BottomAppBar.this.getTopEdgeTreatment().mo39789l(max);
                BottomAppBar.this.f47289R.invalidateSelf();
            }
            C10889h p0 = BottomAppBar.this.f47289R;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            p0.mo43092b0(f);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C10033c implements C10227s.C10232e {
        C10033c() {
        }

        /* renamed from: a */
        public C5690c0 mo19455a(View view, C5690c0 c0Var, C10227s.C10233f fVar) {
            boolean z;
            if (BottomAppBar.this.f47295l0) {
                int unused = BottomAppBar.this.f47304u0 = c0Var.mo22410i();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.f47296m0) {
                z = BottomAppBar.this.f47306w0 != c0Var.mo22411j();
                int unused2 = BottomAppBar.this.f47306w0 = c0Var.mo22411j();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f47297n0) {
                if (BottomAppBar.this.f47305v0 == c0Var.mo22412k()) {
                    z2 = false;
                }
                int unused3 = BottomAppBar.this.f47305v0 = c0Var.mo22412k();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.m45906x0();
                BottomAppBar.this.m45869M0();
                BottomAppBar.this.m45868L0();
            }
            return c0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C10034d extends AnimatorListenerAdapter {
        C10034d() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m45860B0();
            Animator unused = BottomAppBar.this.f47290S = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m45861C0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C10035e extends FloatingActionButton.C10155b {

        /* renamed from: a */
        final /* synthetic */ int f47320a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        class C10036a extends FloatingActionButton.C10155b {
            C10036a() {
            }

            /* renamed from: b */
            public void mo39773b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m45860B0();
            }
        }

        C10035e(int i) {
            this.f47320a = i;
        }

        /* renamed from: a */
        public void mo39772a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m45864G0(this.f47320a));
            floatingActionButton.mo40640s(new C10036a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    class C10037f extends AnimatorListenerAdapter {
        C10037f() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m45860B0();
            boolean unused = BottomAppBar.this.f47301r0 = false;
            Animator unused2 = BottomAppBar.this.f47291T = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m45861C0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    class C10038g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f47324a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f47325b;

        /* renamed from: c */
        final /* synthetic */ int f47326c;

        /* renamed from: d */
        final /* synthetic */ boolean f47327d;

        C10038g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f47325b = actionMenuView;
            this.f47326c = i;
            this.f47327d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f47324a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f47324a) {
                boolean z = BottomAppBar.this.f47300q0 != 0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.mo39735K0(bottomAppBar.f47300q0);
                BottomAppBar.this.m45873Q0(this.f47325b, this.f47326c, this.f47327d, z);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    class C10039h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f47329b;

        /* renamed from: c */
        final /* synthetic */ int f47330c;

        /* renamed from: d */
        final /* synthetic */ boolean f47331d;

        C10039h(ActionMenuView actionMenuView, int i, boolean z) {
            this.f47329b = actionMenuView;
            this.f47330c = i;
            this.f47331d = z;
        }

        public void run() {
            ActionMenuView actionMenuView = this.f47329b;
            actionMenuView.setTranslationX((float) BottomAppBar.this.mo39734F0(actionMenuView, this.f47330c, this.f47331d));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    class C10040i extends AnimatorListenerAdapter {
        C10040i() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f47307x0.onAnimationStart(animator);
            FloatingActionButton g0 = BottomAppBar.this.m45862D0();
            if (g0 != null) {
                g0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    interface C10041j {
        /* renamed from: a */
        void mo39780a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo39781b(BottomAppBar bottomAppBar);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.bottomAppBarStyle);
    }

    /* renamed from: A0 */
    private void m45859A0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo39734F0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C10038g(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m45860B0() {
        ArrayList<C10041j> arrayList;
        int i = this.f47298o0 - 1;
        this.f47298o0 = i;
        if (i == 0 && (arrayList = this.f47299p0) != null) {
            Iterator<C10041j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo39781b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m45861C0() {
        ArrayList<C10041j> arrayList;
        int i = this.f47298o0;
        this.f47298o0 = i + 1;
        if (i == 0 && (arrayList = this.f47299p0) != null) {
            Iterator<C10041j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo39780a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public FloatingActionButton m45862D0() {
        View E0 = m45863E0();
        if (E0 instanceof FloatingActionButton) {
            return (FloatingActionButton) E0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m45863E0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo2987w(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m45863E0():android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public float m45864G0(int i) {
        boolean h = C10227s.m47140h(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f47288Q + (h ? this.f47306w0 : this.f47305v0));
        if (h) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: H0 */
    private boolean m45865H0() {
        FloatingActionButton D0 = m45862D0();
        return D0 != null && D0.mo40633o();
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public void m45866I0(int i, boolean z) {
        if (!C5723u.m25294T(this)) {
            this.f47301r0 = false;
            mo39735K0(this.f47300q0);
            return;
        }
        Animator animator = this.f47291T;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m45865H0()) {
            i = 0;
            z = false;
        }
        m45859A0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f47291T = animatorSet;
        animatorSet.addListener(new C10037f());
        this.f47291T.start();
    }

    /* renamed from: J0 */
    private void m45867J0(int i) {
        if (this.f47292U != i && C5723u.m25294T(this)) {
            Animator animator = this.f47290S;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f47293V == 1) {
                m45907z0(i, arrayList);
            } else {
                mo39755y0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f47290S = animatorSet;
            animatorSet.addListener(new C10034d());
            this.f47290S.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public void m45868L0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f47291T == null) {
            actionMenuView.setAlpha(1.0f);
            if (!m45865H0()) {
                m45871P0(actionMenuView, 0, false);
            } else {
                m45871P0(actionMenuView, this.f47292U, this.f47302s0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public void m45869M0() {
        getTopEdgeTreatment().mo39794s(getFabTranslationX());
        View E0 = m45863E0();
        this.f47289R.mo43092b0((!this.f47302s0 || !m45865H0()) ? 0.0f : 1.0f);
        if (E0 != null) {
            E0.setTranslationY(getFabTranslationY());
            E0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: P0 */
    private void m45871P0(ActionMenuView actionMenuView, int i, boolean z) {
        m45873Q0(actionMenuView, i, z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m45873Q0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        C10039h hVar = new C10039h(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f47304u0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m45864G0(this.f47292U);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo39783c();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f47306w0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f47305v0;
    }

    /* access modifiers changed from: private */
    public C10042a getTopEdgeTreatment() {
        return (C10042a) this.f47289R.mo43076D().mo43134p();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m45905w0(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo40608e(this.f47307x0);
        floatingActionButton.mo40609f(new C10040i());
        floatingActionButton.mo40610g(this.f47308y0);
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m45906x0() {
        Animator animator = this.f47291T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f47290S;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: z0 */
    private void m45907z0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m45862D0(), "translationX", new float[]{m45864G0(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public int mo39734F0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean h = C10227s.m47140h(this);
        int measuredWidth = h ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f552a & 8388615) == 8388611) {
                if (h) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((h ? actionMenuView.getRight() : actionMenuView.getLeft()) + (h ? this.f47305v0 : -this.f47306w0));
    }

    /* renamed from: K0 */
    public void mo39735K0(int i) {
        if (i != 0) {
            this.f47300q0 = 0;
            getMenu().clear();
            mo2027x(i);
        }
    }

    /* renamed from: N0 */
    public void mo39736N0(int i, int i2) {
        this.f47300q0 = i2;
        this.f47301r0 = true;
        m45866I0(i, this.f47302s0);
        m45867J0(i);
        this.f47292U = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public boolean mo39737O0(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo39787i()) {
            return false;
        }
        getTopEdgeTreatment().mo39793p(f);
        this.f47289R.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f47289R.mo43079H();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo39783c();
    }

    public int getFabAlignmentMode() {
        return this.f47292U;
    }

    public int getFabAnimationMode() {
        return this.f47293V;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo39785g();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo39786h();
    }

    public boolean getHideOnScroll() {
        return this.f47294W;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10893i.m48987f(this, this.f47289R);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m45906x0();
            m45869M0();
        }
        m45868L0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        this.f47292U = savedState.f47314d;
        this.f47302s0 = savedState.f47315e;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f47314d = this.f47292U;
        savedState.f47315e = this.f47302s0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C5135a.m23415o(this.f47289R, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo39789l(f);
            this.f47289R.invalidateSelf();
            m45869M0();
        }
    }

    public void setElevation(float f) {
        this.f47289R.mo43090Z(f);
        getBehavior().mo39723G(this, this.f47289R.mo43075C() - this.f47289R.mo43074B());
    }

    public void setFabAlignmentMode(int i) {
        mo39736N0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f47293V = i;
    }

    /* access modifiers changed from: package-private */
    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().mo39784d()) {
            getTopEdgeTreatment().mo39790m(f);
            this.f47289R.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo39791n(f);
            this.f47289R.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo39792o(f);
            this.f47289R.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f47294W = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo39755y0(int i, List<Animator> list) {
        FloatingActionButton D0 = m45862D0();
        if (D0 != null && !D0.mo40632n()) {
            m45861C0();
            D0.mo40630l(new C10035e(i));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f47287z0
            android.content.Context r11 = p245q6.C10962a.m49296c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            p6.h r11 = new p6.h
            r11.<init>()
            r10.f47289R = r11
            r7 = 0
            r10.f47298o0 = r7
            r10.f47300q0 = r7
            r10.f47301r0 = r7
            r0 = 1
            r10.f47302s0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r10.f47307x0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r10.f47308y0 = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = p193c6.C6532l.f26818T
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r1 = p193c6.C6532l.f26828U
            android.content.res.ColorStateList r1 = p232m6.C10805c.m48753a(r8, r0, r1)
            int r2 = p193c6.C6532l.f26838V
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = p193c6.C6532l.f26868Y
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = p193c6.C6532l.f26878Z
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = p193c6.C6532l.f26889a0
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = p193c6.C6532l.f26848W
            int r9 = r0.getInt(r9, r7)
            r10.f47292U = r9
            int r9 = p193c6.C6532l.f26858X
            int r9 = r0.getInt(r9, r7)
            r10.f47293V = r9
            int r9 = p193c6.C6532l.f26900b0
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f47294W = r9
            int r9 = p193c6.C6532l.f26911c0
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f47295l0 = r9
            int r9 = p193c6.C6532l.f26922d0
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f47296m0 = r9
            int r9 = p193c6.C6532l.f26933e0
            boolean r7 = r0.getBoolean(r9, r7)
            r10.f47297n0 = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = p193c6.C6524d.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.f47288Q = r0
            com.google.android.material.bottomappbar.a r0 = new com.google.android.material.bottomappbar.a
            r0.<init>(r3, r4, r5)
            p6.m$b r3 = p242p6.C10897m.m48992a()
            p6.m$b r0 = r3.mo43145B(r0)
            p6.m r0 = r0.mo43154m()
            r11.setShapeAppearanceModel(r0)
            r0 = 2
            r11.mo43103i0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.mo43094d0(r0)
            r11.mo43084P(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            p062d0.C5135a.m23415o(r11, r1)
            p110m0.C5723u.m25336r0(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$c r11 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r11.<init>()
            com.google.android.material.internal.C10227s.m47133a(r10, r12, r13, r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public Behavior getBehavior() {
        if (this.f47303t0 == null) {
            this.f47303t0 = new Behavior();
        }
        return this.f47303t0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Rect f47309e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f47310f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f47311g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f47312h = new C10029a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C10029a implements View.OnLayoutChangeListener {
            C10029a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f47310f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo40628j(Behavior.this.f47309e);
                int height = Behavior.this.f47309e.height();
                bottomAppBar.mo39737O0(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().mo43136r().mo43065a(new RectF(Behavior.this.f47309e)));
                CoordinatorLayout.C0581e eVar = (CoordinatorLayout.C0581e) view.getLayoutParams();
                if (Behavior.this.f47311g == 0) {
                    eVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C6524d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    eVar.leftMargin = bottomAppBar.getLeftInset();
                    eVar.rightMargin = bottomAppBar.getRightInset();
                    if (C10227s.m47140h(floatingActionButton)) {
                        eVar.leftMargin += bottomAppBar.f47288Q;
                    } else {
                        eVar.rightMargin += bottomAppBar.f47288Q;
                    }
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: M */
        public boolean mo3005l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f47310f = new WeakReference<>(bottomAppBar);
            View n0 = bottomAppBar.m45863E0();
            if (n0 != null && !C5723u.m25294T(n0)) {
                CoordinatorLayout.C0581e eVar = (CoordinatorLayout.C0581e) n0.getLayoutParams();
                eVar.f3098d = 49;
                this.f47311g = eVar.bottomMargin;
                if (n0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) n0;
                    floatingActionButton.addOnLayoutChangeListener(this.f47312h);
                    bottomAppBar.m45905w0(floatingActionButton);
                }
                bottomAppBar.m45869M0();
            }
            coordinatorLayout.mo2944M(bottomAppBar, i);
            return super.mo3005l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: N */
        public boolean mo2990A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo2990A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
