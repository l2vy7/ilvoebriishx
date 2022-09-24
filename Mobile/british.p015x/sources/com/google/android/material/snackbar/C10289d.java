package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.C10227s;
import p063d0.C5135a;
import p111m0.C5723u;
import p194c6.C6522b;
import p194c6.C6524d;
import p194c6.C6532l;
import p208f6.C10538a;
import p233m6.C10805c;
import p246q6.C10962a;

/* renamed from: com.google.android.material.snackbar.d */
/* compiled from: BaseTransientBottomBar */
public class C10289d extends FrameLayout {

    /* renamed from: i */
    private static final View.OnTouchListener f48400i = new C10290a();

    /* renamed from: b */
    private C10288c f48401b;

    /* renamed from: c */
    private C10287b f48402c;

    /* renamed from: d */
    private int f48403d;

    /* renamed from: e */
    private final float f48404e;

    /* renamed from: f */
    private final float f48405f;

    /* renamed from: g */
    private ColorStateList f48406g;

    /* renamed from: h */
    private PorterDuff.Mode f48407h;

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* compiled from: BaseTransientBottomBar */
    static class C10290a implements View.OnTouchListener {
        C10290a() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    protected C10289d(Context context, AttributeSet attributeSet) {
        super(C10962a.m49296c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C6532l.f26907b7);
        int i = C6532l.f26984i7;
        if (obtainStyledAttributes.hasValue(i)) {
            C5723u.m25344v0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
        }
        this.f48403d = obtainStyledAttributes.getInt(C6532l.f26940e7, 0);
        this.f48404e = obtainStyledAttributes.getFloat(C6532l.f26951f7, 1.0f);
        setBackgroundTintList(C10805c.m48753a(context2, obtainStyledAttributes, C6532l.f26962g7));
        setBackgroundTintMode(C10227s.m47141i(obtainStyledAttributes.getInt(C6532l.f26973h7, -1), PorterDuff.Mode.SRC_IN));
        this.f48405f = obtainStyledAttributes.getFloat(C6532l.f26929d7, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f48400i);
        setFocusable(true);
        if (getBackground() == null) {
            C5723u.m25336r0(this, m47491a());
        }
    }

    /* renamed from: a */
    private Drawable m47491a() {
        float dimension = getResources().getDimension(C6524d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(C10538a.m48274h(this, C6522b.colorSurface, C6522b.colorOnSurface, getBackgroundOverlayColorAlpha()));
        if (this.f48406g == null) {
            return C5135a.m23418r(gradientDrawable);
        }
        Drawable r = C5135a.m23418r(gradientDrawable);
        C5135a.m23415o(r, this.f48406g);
        return r;
    }

    /* access modifiers changed from: package-private */
    public float getActionTextColorAlpha() {
        return this.f48405f;
    }

    /* access modifiers changed from: package-private */
    public int getAnimationMode() {
        return this.f48403d;
    }

    /* access modifiers changed from: package-private */
    public float getBackgroundOverlayColorAlpha() {
        return this.f48404e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10287b bVar = this.f48402c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        C5723u.m25324l0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10287b bVar = this.f48402c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C10288c cVar = this.f48401b;
        if (cVar != null) {
            cVar.mo41380a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationMode(int i) {
        this.f48403d = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f48406g == null)) {
            drawable = C5135a.m23418r(drawable.mutate());
            C5135a.m23415o(drawable, this.f48406g);
            C5135a.m23416p(drawable, this.f48407h);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f48406g = colorStateList;
        if (getBackground() != null) {
            Drawable r = C5135a.m23418r(getBackground().mutate());
            C5135a.m23415o(r, colorStateList);
            C5135a.m23416p(r, this.f48407h);
            if (r != getBackground()) {
                super.setBackgroundDrawable(r);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f48407h = mode;
        if (getBackground() != null) {
            Drawable r = C5135a.m23418r(getBackground().mutate());
            C5135a.m23416p(r, mode);
            if (r != getBackground()) {
                super.setBackgroundDrawable(r);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(C10287b bVar) {
        this.f48402c = bVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f48400i);
        super.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(C10288c cVar) {
        this.f48401b = cVar;
    }
}
