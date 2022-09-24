package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0382f;
import androidx.appcompat.widget.C0389h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.C0628n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C10164d;
import com.google.android.material.internal.C10192c;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import p063d0.C5135a;
import p105l0.C5648h;
import p111m0.C5722t;
import p111m0.C5723u;
import p194c6.C6522b;
import p194c6.C6524d;
import p194c6.C6531k;
import p194c6.C6532l;
import p200d6.C10500h;
import p200d6.C10503k;
import p223j6.C10632a;
import p223j6.C10633b;
import p240o6.C10858b;
import p243p6.C10897m;
import p243p6.C10913p;

public class FloatingActionButton extends VisibilityAwareImageButton implements C5722t, C0628n, C10632a, C10913p, CoordinatorLayout.C0578b {

    /* renamed from: s */
    private static final int f47833s = C6531k.Widget_Design_FloatingActionButton;

    /* renamed from: c */
    private ColorStateList f47834c;

    /* renamed from: d */
    private PorterDuff.Mode f47835d;

    /* renamed from: e */
    private ColorStateList f47836e;

    /* renamed from: f */
    private PorterDuff.Mode f47837f;

    /* renamed from: g */
    private ColorStateList f47838g;

    /* renamed from: h */
    private int f47839h;

    /* renamed from: i */
    private int f47840i;

    /* renamed from: j */
    private int f47841j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f47842k;

    /* renamed from: l */
    private int f47843l;

    /* renamed from: m */
    boolean f47844m;

    /* renamed from: n */
    final Rect f47845n;

    /* renamed from: o */
    private final Rect f47846o;

    /* renamed from: p */
    private final C0389h f47847p;

    /* renamed from: q */
    private final C10633b f47848q;

    /* renamed from: r */
    private C10164d f47849r;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo40674E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo2995b(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo40675H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo3001h(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo40676I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo3005l(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo3000g(CoordinatorLayout.C0581e eVar) {
            super.mo3000g(eVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C10154a implements C10164d.C10174j {

        /* renamed from: a */
        final /* synthetic */ C10155b f47853a;

        C10154a(C10155b bVar) {
            this.f47853a = bVar;
        }

        /* renamed from: a */
        public void mo40677a() {
            this.f47853a.mo39773b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo40678b() {
            this.f47853a.mo39772a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C10155b {
        /* renamed from: a */
        public void mo39772a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo39773b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C10156c implements C10858b {
        C10156c() {
        }

        /* renamed from: a */
        public void mo40679a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f47845n.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f47842k, i2 + FloatingActionButton.this.f47842k, i3 + FloatingActionButton.this.f47842k, i4 + FloatingActionButton.this.f47842k);
        }

        /* renamed from: b */
        public void mo40680b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: c */
        public boolean mo40681c() {
            return FloatingActionButton.this.f47844m;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C10157d<T extends FloatingActionButton> implements C10164d.C10173i {

        /* renamed from: a */
        private final C10503k<T> f47856a;

        C10157d(C10503k<T> kVar) {
            this.f47856a = kVar;
        }

        /* renamed from: a */
        public void mo40682a() {
            this.f47856a.mo39767b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo40683b() {
            this.f47856a.mo39766a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C10157d) && ((C10157d) obj).f47856a.equals(this.f47856a);
        }

        public int hashCode() {
            return this.f47856a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.floatingActionButtonStyle);
    }

    private C10164d getImpl() {
        if (this.f47849r == null) {
            this.f47849r = m46737h();
        }
        return this.f47849r;
    }

    /* renamed from: h */
    private C10164d m46737h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C10177e(this, new C10156c());
        }
        return new C10164d(this, new C10156c());
    }

    /* renamed from: k */
    private int m46738k(int i) {
        int i2 = this.f47841j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C6524d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C6524d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m46738k(1);
        } else {
            return m46738k(0);
        }
    }

    /* renamed from: p */
    private void m46739p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f47845n;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m46740q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f47836e;
            if (colorStateList == null) {
                C5135a.m23403c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f47837f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0382f.m1972e(colorForState, mode));
        }
    }

    /* renamed from: r */
    private static int m46741r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C10164d.C10174j m46742u(C10155b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C10154a(bVar);
    }

    /* renamed from: a */
    public boolean mo40606a() {
        return this.f47848q.mo42746c();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo40719E(getDrawableState());
    }

    /* renamed from: e */
    public void mo40608e(Animator.AnimatorListener animatorListener) {
        getImpl().mo40743d(animatorListener);
    }

    /* renamed from: f */
    public void mo40609f(Animator.AnimatorListener animatorListener) {
        getImpl().mo40745e(animatorListener);
    }

    /* renamed from: g */
    public void mo40610g(C10503k<? extends FloatingActionButton> kVar) {
        getImpl().mo40747f(new C10157d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f47834c;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f47835d;
    }

    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo40752n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo40755q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo40757t();
    }

    public Drawable getContentBackground() {
        return getImpl().mo40751k();
    }

    public int getCustomSize() {
        return this.f47841j;
    }

    public int getExpandedComponentIdHint() {
        return this.f47848q.mo42745b();
    }

    public C10500h getHideMotionSpec() {
        return getImpl().mo40754p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f47838g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f47838g;
    }

    public C10897m getShapeAppearanceModel() {
        return (C10897m) C5648h.m24964c(getImpl().mo40758u());
    }

    public C10500h getShowMotionSpec() {
        return getImpl().mo40759v();
    }

    public int getSize() {
        return this.f47840i;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m46738k(this.f47840i);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f47836e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f47837f;
    }

    public boolean getUseCompatPadding() {
        return this.f47844m;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo40627i(Rect rect) {
        if (!C5723u.m25294T(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m46739p(rect);
        return true;
    }

    /* renamed from: j */
    public void mo40628j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m46739p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo40715A();
    }

    /* renamed from: l */
    public void mo40630l(C10155b bVar) {
        mo40631m(bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo40631m(C10155b bVar, boolean z) {
        getImpl().mo40760w(m46742u(bVar), z);
    }

    /* renamed from: n */
    public boolean mo40632n() {
        return getImpl().mo40762y();
    }

    /* renamed from: o */
    public boolean mo40633o() {
        return getImpl().mo40763z();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo40716B();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo40718D();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f47842k = (sizeDimension - this.f47843l) / 2;
        getImpl().mo40748f0();
        int min = Math.min(m46741r(sizeDimension, i), m46741r(sizeDimension, i2));
        Rect rect = this.f47845n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mo3233a());
        this.f47848q.mo42747d((Bundle) C5648h.m24964c(extendableSavedState.f48417d.get("expandableWidgetHelper")));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f48417d.put("expandableWidgetHelper", this.f47848q.mo42748e());
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo40627i(this.f47846o) || this.f47846o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: s */
    public void mo40640s(C10155b bVar) {
        mo40673t(bVar, true);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f47834c != colorStateList) {
            this.f47834c = colorStateList;
            getImpl().mo40726L(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f47835d != mode) {
            this.f47835d = mode;
            getImpl().mo40727M(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo40728N(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo40731Q(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo40735U(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f47841j) {
            this.f47841j = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo40749g0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo40753o()) {
            getImpl().mo40729O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f47848q.mo42749f(i);
    }

    public void setHideMotionSpec(C10500h hVar) {
        getImpl().mo40730P(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C10500h.m48214d(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo40746e0();
            if (this.f47836e != null) {
                m46740q();
            }
        }
    }

    public void setImageResource(int i) {
        this.f47847p.mo2160g(i);
        m46740q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo40723I();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo40723I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo40737W(z);
    }

    public void setShapeAppearanceModel(C10897m mVar) {
        getImpl().mo40738X(mVar);
    }

    public void setShowMotionSpec(C10500h hVar) {
        getImpl().mo40739Y(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C10500h.m48214d(getContext(), i));
    }

    public void setSize(int i) {
        this.f47841j = 0;
        if (i != this.f47840i) {
            this.f47840i = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f47836e != colorStateList) {
            this.f47836e = colorStateList;
            m46740q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f47837f != mode) {
            this.f47837f = mode;
            m46740q();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo40724J();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo40724J();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo40724J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f47844m != z) {
            this.f47844m = z;
            getImpl().mo40717C();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo40673t(C10155b bVar, boolean z) {
        getImpl().mo40742c0(m46742u(bVar), z);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f47850a;

        /* renamed from: b */
        private C10155b f47851b;

        /* renamed from: c */
        private boolean f47852c;

        public BaseBehavior() {
            this.f47852c = true;
        }

        /* renamed from: F */
        private static boolean m46755F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0581e) {
                return ((CoordinatorLayout.C0581e) layoutParams).mo3035f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m46756G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f47845n;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0581e eVar = (CoordinatorLayout.C0581e) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin) {
                    i = rect.right;
                } else {
                    i = floatingActionButton.getLeft() <= eVar.leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C5723u.m25300Z(floatingActionButton, i2);
                }
                if (i != 0) {
                    C5723u.m25299Y(floatingActionButton, i);
                }
            }
        }

        /* renamed from: J */
        private boolean m46757J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0581e eVar = (CoordinatorLayout.C0581e) floatingActionButton.getLayoutParams();
            if (this.f47852c && eVar.mo3034e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: K */
        private boolean m46758K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m46757J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f47850a == null) {
                this.f47850a = new Rect();
            }
            Rect rect = this.f47850a;
            C10192c.m47017a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo40631m(this.f47851b, false);
                return true;
            }
            floatingActionButton.mo40673t(this.f47851b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m46759L(View view, FloatingActionButton floatingActionButton) {
            if (!m46757J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0581e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo40631m(this.f47851b, false);
                return true;
            }
            floatingActionButton.mo40673t(this.f47851b, false);
            return true;
        }

        /* renamed from: E */
        public boolean mo2995b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f47845n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo3001h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m46758K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m46755F(view)) {
                return false;
            } else {
                m46759L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo3005l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> v = coordinatorLayout.mo2985v(floatingActionButton);
            int size = v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = v.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m46755F(view) && m46759L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m46758K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2944M(floatingActionButton, i);
            m46756G(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: g */
        public void mo3000g(CoordinatorLayout.C0581e eVar) {
            if (eVar.f3102h == 0) {
                eVar.f3102h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f26810S2);
            this.f47852c = obtainStyledAttributes.getBoolean(C6532l.f26821T2, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f47833s
            android.content.Context r11 = p246q6.C10962a.m49296c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f47845n = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f47846o = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = p194c6.C6532l.f26634C2
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r1 = p194c6.C6532l.f26656E2
            android.content.res.ColorStateList r1 = p233m6.C10805c.m48753a(r11, r0, r1)
            r10.f47834c = r1
            int r1 = p194c6.C6532l.f26667F2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C10227s.m47141i(r1, r3)
            r10.f47835d = r1
            int r1 = p194c6.C6532l.f26777P2
            android.content.res.ColorStateList r1 = p233m6.C10805c.m48753a(r11, r0, r1)
            r10.f47838g = r1
            int r1 = p194c6.C6532l.f26722K2
            int r1 = r0.getInt(r1, r2)
            r10.f47840i = r1
            int r1 = p194c6.C6532l.f26711J2
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f47841j = r1
            int r1 = p194c6.C6532l.f26678G2
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f47839h = r1
            int r1 = p194c6.C6532l.f26689H2
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = p194c6.C6532l.f26744M2
            float r3 = r0.getDimension(r3, r2)
            int r4 = p194c6.C6532l.f26766O2
            float r2 = r0.getDimension(r4, r2)
            int r4 = p194c6.C6532l.f26799R2
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f47844m = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = p194c6.C6524d.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = p194c6.C6532l.f26755N2
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.f47843l = r5
            int r5 = p194c6.C6532l.f26788Q2
            d6.h r5 = p200d6.C10500h.m48213c(r11, r0, r5)
            int r8 = p194c6.C6532l.f26733L2
            d6.h r8 = p200d6.C10500h.m48213c(r11, r0, r8)
            p6.c r9 = p243p6.C10897m.f49721m
            p6.m$b r11 = p243p6.C10897m.m48998g(r11, r12, r13, r6, r9)
            p6.m r11 = r11.mo43154m()
            int r6 = p194c6.C6532l.f26700I2
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = p194c6.C6532l.f26645D2
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.h r0 = new androidx.appcompat.widget.h
            r0.<init>(r10)
            r10.f47847p = r0
            r0.mo2159f(r12, r13)
            j6.b r12 = new j6.b
            r12.<init>(r10)
            r10.f47848q = r12
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            r12.mo40738X(r11)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.f47834c
            android.graphics.PorterDuff$Mode r13 = r10.f47835d
            android.content.res.ColorStateList r0 = r10.f47838g
            int r7 = r10.f47839h
            r11.mo40761x(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo40734T(r4)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo40728N(r1)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo40731Q(r3)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo40735U(r2)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            int r12 = r10.f47843l
            r11.mo40733S(r12)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo40739Y(r5)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo40730P(r8)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo40729O(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f47838g != colorStateList) {
            this.f47838g = colorStateList;
            getImpl().mo40736V(this.f47838g);
        }
    }
}
