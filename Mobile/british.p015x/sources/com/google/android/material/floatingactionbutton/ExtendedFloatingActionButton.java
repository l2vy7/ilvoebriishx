package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C10192c;
import java.util.List;
import p111m0.C5723u;
import p194c6.C6521a;
import p194c6.C6522b;
import p194c6.C6531k;
import p194c6.C6532l;
import p200d6.C10500h;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0578b {

    /* renamed from: H */
    private static final int f47797H = C6531k.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: I */
    static final Property<View, Float> f47798I;

    /* renamed from: J */
    static final Property<View, Float> f47799J;

    /* renamed from: K */
    static final Property<View, Float> f47800K;

    /* renamed from: L */
    static final Property<View, Float> f47801L;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f47802A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f47803B;

    /* renamed from: C */
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f47804C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f47805D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f47806E;

    /* renamed from: F */
    private boolean f47807F;

    /* renamed from: G */
    protected ColorStateList f47808G;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f47809t;

    /* renamed from: u */
    private final C10158a f47810u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C10179f f47811v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C10179f f47812w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C10179f f47813x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C10179f f47814y;

    /* renamed from: z */
    private final int f47815z;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C10142a implements C10153l {
        C10142a() {
        }

        /* renamed from: a */
        public int mo40574a() {
            return ExtendedFloatingActionButton.this.f47803B;
        }

        /* renamed from: b */
        public int mo40575b() {
            return ExtendedFloatingActionButton.this.f47802A;
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f47802A + ExtendedFloatingActionButton.this.f47803B;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    class C10143b implements C10153l {
        C10143b() {
        }

        /* renamed from: a */
        public int mo40574a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        /* renamed from: b */
        public int mo40575b() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    class C10144c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f47823a;

        /* renamed from: b */
        final /* synthetic */ C10179f f47824b;

        /* renamed from: c */
        final /* synthetic */ C10151j f47825c;

        C10144c(C10179f fVar, C10151j jVar) {
            this.f47824b = fVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f47823a = true;
            this.f47824b.mo40605b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f47824b.mo40598a();
            if (!this.f47823a) {
                this.f47824b.mo40603i(this.f47825c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f47824b.onAnimationStart(animator);
            this.f47823a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    static class C10145d extends Property<View, Float> {
        C10145d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    static class C10146e extends Property<View, Float> {
        C10146e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    static class C10147f extends Property<View, Float> {
        C10147f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) C5723u.m25275G(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C5723u.m25268C0(view, f.intValue(), view.getPaddingTop(), C5723u.m25273F(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    static class C10148g extends Property<View, Float> {
        C10148g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) C5723u.m25273F(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C5723u.m25268C0(view, C5723u.m25275G(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    class C10149h extends C10159b {

        /* renamed from: g */
        private final C10153l f47827g;

        /* renamed from: h */
        private final boolean f47828h;

        C10149h(C10158a aVar, C10153l lVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f47827g = lVar;
            this.f47828h = z;
        }

        /* renamed from: a */
        public void mo40598a() {
            super.mo40598a();
            boolean unused = ExtendedFloatingActionButton.this.f47806E = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f47827g.getLayoutParams().width;
                layoutParams.height = this.f47827g.getLayoutParams().height;
            }
        }

        /* renamed from: c */
        public int mo40599c() {
            return this.f47828h ? C6521a.mtrl_extended_fab_change_size_expand_motion_spec : C6521a.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        /* renamed from: d */
        public void mo40600d() {
            boolean unused = ExtendedFloatingActionButton.this.f47805D = this.f47828h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f47827g.getLayoutParams().width;
                layoutParams.height = this.f47827g.getLayoutParams().height;
                C5723u.m25268C0(ExtendedFloatingActionButton.this, this.f47827g.mo40575b(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f47827g.mo40574a(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: f */
        public boolean mo40601f() {
            return this.f47828h == ExtendedFloatingActionButton.this.f47805D || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        /* renamed from: g */
        public AnimatorSet mo40602g() {
            C10500h m = mo40693m();
            if (m.mo42627j("width")) {
                PropertyValuesHolder[] g = m.mo42623g("width");
                g[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f47827g.getWidth()});
                m.mo42629l("width", g);
            }
            if (m.mo42627j("height")) {
                PropertyValuesHolder[] g2 = m.mo42623g("height");
                g2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f47827g.getHeight()});
                m.mo42629l("height", g2);
            }
            if (m.mo42627j("paddingStart")) {
                PropertyValuesHolder[] g3 = m.mo42623g("paddingStart");
                g3[0].setFloatValues(new float[]{(float) C5723u.m25275G(ExtendedFloatingActionButton.this), (float) this.f47827g.mo40575b()});
                m.mo42629l("paddingStart", g3);
            }
            if (m.mo42627j("paddingEnd")) {
                PropertyValuesHolder[] g4 = m.mo42623g("paddingEnd");
                g4[0].setFloatValues(new float[]{(float) C5723u.m25273F(ExtendedFloatingActionButton.this), (float) this.f47827g.mo40574a()});
                m.mo42629l("paddingEnd", g4);
            }
            if (m.mo42627j("labelOpacity")) {
                PropertyValuesHolder[] g5 = m.mo42623g("labelOpacity");
                boolean z = this.f47828h;
                float f = 0.0f;
                float f2 = z ? 0.0f : 1.0f;
                if (z) {
                    f = 1.0f;
                }
                g5[0].setFloatValues(new float[]{f2, f});
                m.mo42629l("labelOpacity", g5);
            }
            return super.mo40692l(m);
        }

        /* renamed from: i */
        public void mo40603i(C10151j jVar) {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean unused = ExtendedFloatingActionButton.this.f47805D = this.f47828h;
            boolean unused2 = ExtendedFloatingActionButton.this.f47806E = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    class C10150i extends C10159b {

        /* renamed from: g */
        private boolean f47830g;

        public C10150i(C10158a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public void mo40598a() {
            super.mo40598a();
            int unused = ExtendedFloatingActionButton.this.f47809t = 0;
            if (!this.f47830g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        /* renamed from: b */
        public void mo40605b() {
            super.mo40605b();
            this.f47830g = true;
        }

        /* renamed from: c */
        public int mo40599c() {
            return C6521a.mtrl_extended_fab_hide_motion_spec;
        }

        /* renamed from: d */
        public void mo40600d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: f */
        public boolean mo40601f() {
            return ExtendedFloatingActionButton.this.m46688y();
        }

        /* renamed from: i */
        public void mo40603i(C10151j jVar) {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f47830g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f47809t = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public static abstract class C10151j {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    class C10152k extends C10159b {
        public C10152k(C10158a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public void mo40598a() {
            super.mo40598a();
            int unused = ExtendedFloatingActionButton.this.f47809t = 0;
        }

        /* renamed from: c */
        public int mo40599c() {
            return C6521a.mtrl_extended_fab_show_motion_spec;
        }

        /* renamed from: d */
        public void mo40600d() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: f */
        public boolean mo40601f() {
            return ExtendedFloatingActionButton.this.m46689z();
        }

        /* renamed from: i */
        public void mo40603i(C10151j jVar) {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f47809t = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    interface C10153l {
        /* renamed from: a */
        int mo40574a();

        /* renamed from: b */
        int mo40575b();

        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        f47798I = new C10145d(cls, "width");
        f47799J = new C10146e(cls, "height");
        f47800K = new C10147f(cls, "paddingStart");
        f47801L = new C10148g(cls, "paddingEnd");
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.extendedFloatingActionButtonStyle);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m46672A(C10179f fVar, C10151j jVar) {
        if (!fVar.mo40601f()) {
            if (!m46674C()) {
                fVar.mo40600d();
                fVar.mo40603i(jVar);
                return;
            }
            measure(0, 0);
            AnimatorSet g = fVar.mo40602g();
            g.addListener(new C10144c(fVar, jVar));
            for (Animator.AnimatorListener addListener : fVar.mo40690h()) {
                g.addListener(addListener);
            }
            g.start();
        }
    }

    /* renamed from: B */
    private void m46673B() {
        this.f47808G = getTextColors();
    }

    /* renamed from: C */
    private boolean m46674C() {
        return (C5723u.m25294T(this) || (!m46689z() && this.f47807F)) && !isInEditMode();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public boolean m46688y() {
        if (getVisibility() == 0) {
            if (this.f47809t == 1) {
                return true;
            }
            return false;
        } else if (this.f47809t != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public boolean m46689z() {
        if (getVisibility() != 0) {
            if (this.f47809t == 2) {
                return true;
            }
            return false;
        } else if (this.f47809t != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo40548D(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f47804C;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        int i = this.f47815z;
        return i < 0 ? (Math.min(C5723u.m25275G(this), C5723u.m25273F(this)) * 2) + getIconSize() : i;
    }

    public C10500h getExtendMotionSpec() {
        return this.f47812w.mo40689e();
    }

    public C10500h getHideMotionSpec() {
        return this.f47814y.mo40689e();
    }

    public C10500h getShowMotionSpec() {
        return this.f47813x.mo40689e();
    }

    public C10500h getShrinkMotionSpec() {
        return this.f47811v.mo40689e();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f47805D && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f47805D = false;
            this.f47811v.mo40600d();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f47807F = z;
    }

    public void setExtendMotionSpec(C10500h hVar) {
        this.f47812w.mo40691j(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C10500h.m48214d(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f47805D != z) {
            C10179f fVar = z ? this.f47812w : this.f47811v;
            if (!fVar.mo40601f()) {
                fVar.mo40600d();
            }
        }
    }

    public void setHideMotionSpec(C10500h hVar) {
        this.f47814y.mo40691j(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C10500h.m48214d(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f47805D && !this.f47806E) {
            this.f47802A = C5723u.m25275G(this);
            this.f47803B = C5723u.m25273F(this);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f47805D && !this.f47806E) {
            this.f47802A = i;
            this.f47803B = i3;
        }
    }

    public void setShowMotionSpec(C10500h hVar) {
        this.f47813x.mo40691j(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C10500h.m48214d(getContext(), i));
    }

    public void setShrinkMotionSpec(C10500h hVar) {
        this.f47811v.mo40691j(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C10500h.m48214d(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        m46673B();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f47797H
            r1 = r17
            android.content.Context r1 = p246q6.C10962a.m49296c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f47809t = r10
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>()
            r0.f47810u = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.f47813x = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f47814y = r12
            r13 = 1
            r0.f47805D = r13
            r0.f47806E = r10
            r0.f47807F = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f47804C = r1
            int[] r3 = p194c6.C6532l.f27100t2
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C10220m.m47116h(r1, r2, r3, r4, r5, r6)
            int r2 = p194c6.C6532l.f27144x2
            d6.h r2 = p200d6.C10500h.m48213c(r14, r1, r2)
            int r3 = p194c6.C6532l.f27133w2
            d6.h r3 = p200d6.C10500h.m48213c(r14, r1, r3)
            int r4 = p194c6.C6532l.f27122v2
            d6.h r4 = p200d6.C10500h.m48213c(r14, r1, r4)
            int r5 = p194c6.C6532l.f27155y2
            d6.h r5 = p200d6.C10500h.m48213c(r14, r1, r5)
            int r6 = p194c6.C6532l.f27111u2
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f47815z = r6
            int r6 = p111m0.C5723u.m25275G(r16)
            r0.f47802A = r6
            int r6 = p111m0.C5723u.m25273F(r16)
            r0.f47803B = r6
            com.google.android.material.floatingactionbutton.a r6 = new com.google.android.material.floatingactionbutton.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f47812w = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f47811v = r10
            r11.mo40691j(r2)
            r12.mo40691j(r3)
            r15.mo40691j(r4)
            r10.mo40691j(r5)
            r1.recycle()
            p6.c r1 = p243p6.C10897m.f49721m
            r2 = r18
            p6.m$b r1 = p243p6.C10897m.m48998g(r14, r2, r8, r9, r1)
            p6.m r1 = r1.mo43154m()
            r0.setShapeAppearanceModel(r1)
            r16.m46673B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f47816a;

        /* renamed from: b */
        private C10151j f47817b;

        /* renamed from: c */
        private C10151j f47818c;

        /* renamed from: d */
        private boolean f47819d;

        /* renamed from: e */
        private boolean f47820e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f47819d = false;
            this.f47820e = true;
        }

        /* renamed from: G */
        private static boolean m46691G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0581e) {
                return ((CoordinatorLayout.C0581e) layoutParams).mo3035f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m46692J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0581e eVar = (CoordinatorLayout.C0581e) extendedFloatingActionButton.getLayoutParams();
            if ((this.f47819d || this.f47820e) && eVar.mo3034e() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: L */
        private boolean m46693L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m46692J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f47816a == null) {
                this.f47816a = new Rect();
            }
            Rect rect = this.f47816a;
            C10192c.m47017a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo40573K(extendedFloatingActionButton);
                return true;
            }
            mo40569E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m46694M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m46692J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0581e) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo40573K(extendedFloatingActionButton);
                return true;
            }
            mo40569E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo40569E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C10179f fVar;
            boolean z = this.f47820e;
            C10151j jVar = z ? this.f47818c : this.f47817b;
            if (z) {
                fVar = extendedFloatingActionButton.f47812w;
            } else {
                fVar = extendedFloatingActionButton.f47813x;
            }
            extendedFloatingActionButton.m46672A(fVar, jVar);
        }

        /* renamed from: F */
        public boolean mo2995b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo2995b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean mo3001h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m46693L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m46691G(view)) {
                return false;
            } else {
                m46694M(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo3005l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> v = coordinatorLayout.mo2985v(extendedFloatingActionButton);
            int size = v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = v.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m46691G(view) && m46694M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m46693L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2944M(extendedFloatingActionButton, i);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: K */
        public void mo40573K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C10179f fVar;
            boolean z = this.f47820e;
            C10151j jVar = z ? this.f47818c : this.f47817b;
            if (z) {
                fVar = extendedFloatingActionButton.f47811v;
            } else {
                fVar = extendedFloatingActionButton.f47814y;
            }
            extendedFloatingActionButton.m46672A(fVar, jVar);
        }

        /* renamed from: g */
        public void mo3000g(CoordinatorLayout.C0581e eVar) {
            if (eVar.f3102h == 0) {
                eVar.f3102h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f27166z2);
            this.f47819d = obtainStyledAttributes.getBoolean(C6532l.f26612A2, false);
            this.f47820e = obtainStyledAttributes.getBoolean(C6532l.f26623B2, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m46673B();
    }
}
