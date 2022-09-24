package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.C0624k;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p063d0.C5135a;
import p079g.C5264a;
import p111m0.C5723u;
import p194c6.C6522b;
import p194c6.C6531k;
import p243p6.C10893i;
import p243p6.C10897m;
import p243p6.C10913p;

public class MaterialButton extends AppCompatButton implements Checkable, C10913p {

    /* renamed from: q */
    private static final int[] f47419q = {16842911};

    /* renamed from: r */
    private static final int[] f47420r = {16842912};

    /* renamed from: s */
    private static final int f47421s = C6531k.Widget_MaterialComponents_Button;

    /* renamed from: d */
    private final C10063a f47422d;

    /* renamed from: e */
    private final LinkedHashSet<C10055a> f47423e;

    /* renamed from: f */
    private C10056b f47424f;

    /* renamed from: g */
    private PorterDuff.Mode f47425g;

    /* renamed from: h */
    private ColorStateList f47426h;

    /* renamed from: i */
    private Drawable f47427i;

    /* renamed from: j */
    private int f47428j;

    /* renamed from: k */
    private int f47429k;

    /* renamed from: l */
    private int f47430l;

    /* renamed from: m */
    private int f47431m;

    /* renamed from: n */
    private boolean f47432n;

    /* renamed from: o */
    private boolean f47433o;

    /* renamed from: p */
    private int f47434p;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10054a();

        /* renamed from: d */
        boolean f47435d;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        static class C10054a implements Parcelable.ClassLoaderCreator<SavedState> {
            C10054a() {
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

        /* renamed from: b */
        private void m46038b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f47435d = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f47435d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m46038b(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C10055a {
        /* renamed from: a */
        void mo39896a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface C10056b {
        /* renamed from: a */
        void mo39897a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.materialButtonStyle);
    }

    /* renamed from: c */
    private boolean m46027c() {
        int i = this.f47434p;
        return i == 3 || i == 4;
    }

    /* renamed from: d */
    private boolean m46028d() {
        int i = this.f47434p;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    private boolean m46029e() {
        int i = this.f47434p;
        return i == 16 || i == 32;
    }

    /* renamed from: f */
    private boolean m46030f() {
        return C5723u.m25265B(this) == 1;
    }

    /* renamed from: g */
    private boolean m46031g() {
        C10063a aVar = this.f47422d;
        return aVar != null && !aVar.mo39934o();
    }

    private String getA11yClassName() {
        return (mo39835b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: i */
    private void m46032i() {
        if (m46028d()) {
            C0624k.m3462l(this, this.f47427i, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (m46027c()) {
            C0624k.m3462l(this, (Drawable) null, (Drawable) null, this.f47427i, (Drawable) null);
        } else if (m46029e()) {
            C0624k.m3462l(this, (Drawable) null, this.f47427i, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: j */
    private void m46033j(boolean z) {
        Drawable drawable = this.f47427i;
        if (drawable != null) {
            Drawable mutate = C5135a.m23418r(drawable).mutate();
            this.f47427i = mutate;
            C5135a.m23415o(mutate, this.f47426h);
            PorterDuff.Mode mode = this.f47425g;
            if (mode != null) {
                C5135a.m23416p(this.f47427i, mode);
            }
            int i = this.f47428j;
            if (i == 0) {
                i = this.f47427i.getIntrinsicWidth();
            }
            int i2 = this.f47428j;
            if (i2 == 0) {
                i2 = this.f47427i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f47427i;
            int i3 = this.f47429k;
            int i4 = this.f47430l;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            m46032i();
            return;
        }
        Drawable[] a = C0624k.m3451a(this);
        boolean z2 = false;
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[1];
        Drawable drawable5 = a[2];
        if ((m46028d() && drawable3 != this.f47427i) || ((m46027c() && drawable5 != this.f47427i) || (m46029e() && drawable4 != this.f47427i))) {
            z2 = true;
        }
        if (z2) {
            m46032i();
        }
    }

    /* renamed from: k */
    private void m46034k(int i, int i2) {
        if (this.f47427i != null && getLayout() != null) {
            if (m46028d() || m46027c()) {
                this.f47430l = 0;
                int i3 = this.f47434p;
                boolean z = true;
                if (i3 == 1 || i3 == 3) {
                    this.f47429k = 0;
                    m46033j(false);
                    return;
                }
                int i4 = this.f47428j;
                if (i4 == 0) {
                    i4 = this.f47427i.getIntrinsicWidth();
                }
                int textWidth = (((((i - getTextWidth()) - C5723u.m25273F(this)) - i4) - this.f47431m) - C5723u.m25275G(this)) / 2;
                boolean f = m46030f();
                if (this.f47434p != 4) {
                    z = false;
                }
                if (f != z) {
                    textWidth = -textWidth;
                }
                if (this.f47429k != textWidth) {
                    this.f47429k = textWidth;
                    m46033j(false);
                }
            } else if (m46029e()) {
                this.f47429k = 0;
                if (this.f47434p == 16) {
                    this.f47430l = 0;
                    m46033j(false);
                    return;
                }
                int i5 = this.f47428j;
                if (i5 == 0) {
                    i5 = this.f47427i.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.f47431m) - getPaddingBottom()) / 2;
                if (this.f47430l != textHeight) {
                    this.f47430l = textHeight;
                    m46033j(false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo39834a(C10055a aVar) {
        this.f47423e.add(aVar);
    }

    /* renamed from: b */
    public boolean mo39835b() {
        C10063a aVar = this.f47422d;
        return aVar != null && aVar.mo39935p();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m46031g()) {
            return this.f47422d.mo39923b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f47427i;
    }

    public int getIconGravity() {
        return this.f47434p;
    }

    public int getIconPadding() {
        return this.f47431m;
    }

    public int getIconSize() {
        return this.f47428j;
    }

    public ColorStateList getIconTint() {
        return this.f47426h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f47425g;
    }

    public int getInsetBottom() {
        return this.f47422d.mo39924c();
    }

    public int getInsetTop() {
        return this.f47422d.mo39925d();
    }

    public ColorStateList getRippleColor() {
        if (m46031g()) {
            return this.f47422d.mo39928h();
        }
        return null;
    }

    public C10897m getShapeAppearanceModel() {
        if (m46031g()) {
            return this.f47422d.mo39929i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m46031g()) {
            return this.f47422d.mo39930j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m46031g()) {
            return this.f47422d.mo39931k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m46031g()) {
            return this.f47422d.mo39932l();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m46031g()) {
            return this.f47422d.mo39933m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public void mo39851h(C10055a aVar) {
        this.f47423e.remove(aVar);
    }

    public boolean isChecked() {
        return this.f47432n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m46031g()) {
            C10893i.m48987f(this, this.f47422d.mo39927f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo39835b()) {
            Button.mergeDrawableStates(onCreateDrawableState, f47419q);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f47420r);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo39835b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C10063a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f47422d) != null) {
            aVar.mo39922H(i4 - i2, i3 - i);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        setChecked(savedState.f47435d);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f47435d = this.f47432n;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m46034k(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m46034k(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m46031g()) {
            this.f47422d.mo39937r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!m46031g()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f47422d.mo39938s();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C5264a.m23789d(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m46031g()) {
            this.f47422d.mo39939t(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo39835b() && isEnabled() && this.f47432n != z) {
            this.f47432n = z;
            refreshDrawableState();
            if (!this.f47433o) {
                this.f47433o = true;
                Iterator it = this.f47423e.iterator();
                while (it.hasNext()) {
                    ((C10055a) it.next()).mo39896a(this, this.f47432n);
                }
                this.f47433o = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m46031g()) {
            this.f47422d.mo39940u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m46031g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m46031g()) {
            this.f47422d.mo39927f().mo43090Z(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f47427i != drawable) {
            this.f47427i = drawable;
            m46033j(true);
            m46034k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f47434p != i) {
            this.f47434p = i;
            m46034k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f47431m != i) {
            this.f47431m = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C5264a.m23789d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f47428j != i) {
            this.f47428j = i;
            m46033j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f47426h != colorStateList) {
            this.f47426h = colorStateList;
            m46033j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f47425g != mode) {
            this.f47425g = mode;
            m46033j(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C5264a.m23788c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f47422d.mo39941v(i);
    }

    public void setInsetTop(int i) {
        this.f47422d.mo39942w(i);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(C10056b bVar) {
        this.f47424f = bVar;
    }

    public void setPressed(boolean z) {
        C10056b bVar = this.f47424f;
        if (bVar != null) {
            bVar.mo39897a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m46031g()) {
            this.f47422d.mo39943x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m46031g()) {
            setRippleColor(C5264a.m23788c(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C10897m mVar) {
        if (m46031g()) {
            this.f47422d.mo39944y(mVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m46031g()) {
            this.f47422d.mo39945z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m46031g()) {
            this.f47422d.mo39918A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m46031g()) {
            setStrokeColor(C5264a.m23788c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m46031g()) {
            this.f47422d.mo39919B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m46031g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m46031g()) {
            this.f47422d.mo39920C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m46031g()) {
            this.f47422d.mo39921D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f47432n);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f47421s
            android.content.Context r9 = p246q6.C10962a.m49296c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f47423e = r9
            r9 = 0
            r8.f47432n = r9
            r8.f47433o = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p194c6.C6532l.f26613A3
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r1 = p194c6.C6532l.f26756N3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f47431m = r1
            int r1 = p194c6.C6532l.f26789Q3
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C10227s.m47141i(r1, r2)
            r8.f47425g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p194c6.C6532l.f26778P3
            android.content.res.ColorStateList r1 = p233m6.C10805c.m48753a(r1, r0, r2)
            r8.f47426h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p194c6.C6532l.f26734L3
            android.graphics.drawable.Drawable r1 = p233m6.C10805c.m48756d(r1, r0, r2)
            r8.f47427i = r1
            int r1 = p194c6.C6532l.f26745M3
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f47434p = r1
            int r1 = p194c6.C6532l.f26767O3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f47428j = r1
            p6.m$b r10 = p243p6.C10897m.m48996e(r7, r10, r11, r6)
            p6.m r10 = r10.mo43154m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f47422d = r11
            r11.mo39936q(r0)
            r0.recycle()
            int r10 = r8.f47431m
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f47427i
            if (r10 == 0) goto L_0x0084
            r9 = 1
        L_0x0084:
            r8.m46033j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
