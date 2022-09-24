package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import p079g.C5264a;
import p194c6.C6522b;
import p194c6.C6531k;
import p243p6.C10893i;
import p243p6.C10897m;
import p243p6.C10913p;

public class MaterialCardView extends CardView implements Checkable, C10913p {

    /* renamed from: p */
    private static final int[] f47477p = {16842911};

    /* renamed from: q */
    private static final int[] f47478q = {16842912};

    /* renamed from: r */
    private static final int[] f47479r = {C6522b.state_dragged};

    /* renamed from: s */
    private static final int f47480s = C6531k.Widget_MaterialComponents_CardView;

    /* renamed from: k */
    private final C10065a f47481k;

    /* renamed from: l */
    private boolean f47482l;

    /* renamed from: m */
    private boolean f47483m;

    /* renamed from: n */
    private boolean f47484n;

    /* renamed from: o */
    private C10064a f47485o;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C10064a {
        /* renamed from: a */
        void mo39989a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.materialCardViewStyle);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f47481k.mo40016k().getBounds());
        return rectF;
    }

    /* renamed from: j */
    private void m46115j() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f47481k.mo40015j();
        }
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f47481k.mo40017l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f47481k.mo40018m();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f47481k.mo40019n();
    }

    public int getCheckedIconMargin() {
        return this.f47481k.mo40020o();
    }

    public int getCheckedIconSize() {
        return this.f47481k.mo40021p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f47481k.mo40022q();
    }

    public int getContentPaddingBottom() {
        return this.f47481k.mo39990A().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f47481k.mo39990A().left;
    }

    public int getContentPaddingRight() {
        return this.f47481k.mo39990A().right;
    }

    public int getContentPaddingTop() {
        return this.f47481k.mo39990A().top;
    }

    public float getProgress() {
        return this.f47481k.mo40024u();
    }

    public float getRadius() {
        return this.f47481k.mo40023s();
    }

    public ColorStateList getRippleColor() {
        return this.f47481k.mo40025v();
    }

    public C10897m getShapeAppearanceModel() {
        return this.f47481k.mo40026w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f47481k.mo40027x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f47481k.mo40028y();
    }

    public int getStrokeWidth() {
        return this.f47481k.mo40029z();
    }

    public boolean isChecked() {
        return this.f47483m;
    }

    /* renamed from: k */
    public boolean mo39959k() {
        C10065a aVar = this.f47481k;
        return aVar != null && aVar.mo39992D();
    }

    /* renamed from: l */
    public boolean mo39960l() {
        return this.f47484n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo39961m(int i, int i2, int i3, int i4) {
        super.mo2412h(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10893i.m48987f(this, this.f47481k.mo40016k());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo39959k()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f47477p);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f47478q);
        }
        if (mo39960l()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f47479r);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo39959k());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f47481k.mo39994F(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f47482l) {
            if (!this.f47481k.mo39991C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f47481k.mo39995G(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.f47481k.mo39996H(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f47481k.mo40012Z();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f47481k.mo39997I(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f47481k.mo39998J(z);
    }

    public void setChecked(boolean z) {
        if (this.f47483m != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f47481k.mo39999K(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.f47481k.mo40000L(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f47481k.mo40000L(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.f47481k.mo39999K(C5264a.m23789d(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f47481k.mo40001M(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f47481k.mo40001M(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f47481k.mo40002N(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C10065a aVar = this.f47481k;
        if (aVar != null) {
            aVar.mo40010X();
        }
    }

    public void setDragged(boolean z) {
        if (this.f47484n != z) {
            this.f47484n = z;
            refreshDrawableState();
            m46115j();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f47481k.mo40013b0();
    }

    public void setOnCheckedChangeListener(C10064a aVar) {
        this.f47485o = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f47481k.mo40013b0();
        this.f47481k.mo40011Y();
    }

    public void setProgress(float f) {
        this.f47481k.mo40004P(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f47481k.mo40003O(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f47481k.mo40005Q(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f47481k.mo40005Q(C5264a.m23788c(getContext(), i));
    }

    public void setShapeAppearanceModel(C10897m mVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(mVar.mo43139u(getBoundsAsRectF()));
        }
        this.f47481k.mo40006R(mVar);
    }

    public void setStrokeColor(int i) {
        this.f47481k.mo40007S(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f47481k.mo40008T(i);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f47481k.mo40013b0();
        this.f47481k.mo40011Y();
    }

    public void toggle() {
        if (mo39959k() && isEnabled()) {
            this.f47483m = !this.f47483m;
            refreshDrawableState();
            m46115j();
            C10064a aVar = this.f47485o;
            if (aVar != null) {
                aVar.mo39989a(this, this.f47483m);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f47480s
            android.content.Context r8 = p246q6.C10962a.m49296c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f47483m = r8
            r7.f47484n = r8
            r0 = 1
            r7.f47482l = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = p194c6.C6532l.f27091s4
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f47481k = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.mo39996H(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.mo40009U(r9, r10, r1, r2)
            r0.mo39993E(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f47481k.mo39996H(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f47481k.mo40007S(colorStateList);
    }
}
