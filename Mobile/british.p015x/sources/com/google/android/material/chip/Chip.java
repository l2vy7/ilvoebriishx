package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.C10074a;
import com.google.android.material.internal.C10220m;
import com.google.android.material.internal.C10227s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p111m0.C5682a;
import p111m0.C5723u;
import p117n0.C5771c;
import p135q0.C5923a;
import p194c6.C6522b;
import p194c6.C6530j;
import p194c6.C6531k;
import p194c6.C6532l;
import p200d6.C10500h;
import p233m6.C10806d;
import p233m6.C10810f;
import p237n6.C10841b;
import p243p6.C10893i;
import p243p6.C10897m;
import p243p6.C10913p;

public class Chip extends AppCompatCheckBox implements C10074a.C10075a, C10913p {

    /* renamed from: u */
    private static final int f47512u = C6531k.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final Rect f47513v = new Rect();

    /* renamed from: w */
    private static final int[] f47514w = {16842913};

    /* renamed from: x */
    private static final int[] f47515x = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10074a f47516e;

    /* renamed from: f */
    private InsetDrawable f47517f;

    /* renamed from: g */
    private RippleDrawable f47518g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public View.OnClickListener f47519h;

    /* renamed from: i */
    private CompoundButton.OnCheckedChangeListener f47520i;

    /* renamed from: j */
    private boolean f47521j;

    /* renamed from: k */
    private boolean f47522k;

    /* renamed from: l */
    private boolean f47523l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f47524m;

    /* renamed from: n */
    private boolean f47525n;

    /* renamed from: o */
    private int f47526o;

    /* renamed from: p */
    private int f47527p;

    /* renamed from: q */
    private final C10069c f47528q;

    /* renamed from: r */
    private final Rect f47529r;

    /* renamed from: s */
    private final RectF f47530s;

    /* renamed from: t */
    private final C10810f f47531t;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C10067a extends C10810f {
        C10067a() {
        }

        /* renamed from: a */
        public void mo40176a(int i) {
        }

        /* renamed from: b */
        public void mo40177b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f47516e.mo40257R2() ? Chip.this.f47516e.mo40306n1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C10068b extends ViewOutlineProvider {
        C10068b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f47516e != null) {
                Chip.this.f47516e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C10069c extends C5923a {
        C10069c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public int mo22919B(float f, float f2) {
            return (!Chip.this.m46190n() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo22920C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m46190n() && Chip.this.mo40079s() && Chip.this.f47519h != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public boolean mo22925L(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo40174t();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public void mo22928O(C5771c cVar) {
            cVar.mo22623a0(Chip.this.mo40078r());
            cVar.mo22629d0(Chip.this.isClickable());
            if (Chip.this.mo40078r() || Chip.this.isClickable()) {
                cVar.mo22627c0(Chip.this.mo40078r() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                cVar.mo22627c0("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo22601D0(text);
            } else {
                cVar.mo22634g0(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo22929P(int i, C5771c cVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.mo22634g0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C6530j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    cVar.mo22634g0(context.getString(i2, objArr).trim());
                }
                cVar.mo22619X(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo22624b(C5771c.C5772a.f24476i);
                cVar.mo22635h0(Chip.this.isEnabled());
                return;
            }
            cVar.mo22634g0(charSequence);
            cVar.mo22619X(Chip.f47513v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: Q */
        public void mo22930Q(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f47524m = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.chipStyle);
    }

    /* renamed from: A */
    private void m46176A() {
        C10074a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f47516e) != null) {
            int P0 = (int) (aVar.mo40249P0() + this.f47516e.mo40312p1() + this.f47516e.mo40330w0());
            int U0 = (int) (this.f47516e.mo40262U0() + this.f47516e.mo40314q1() + this.f47516e.mo40317s0());
            if (this.f47517f != null) {
                Rect rect = new Rect();
                this.f47517f.getPadding(rect);
                U0 += rect.left;
                P0 += rect.right;
            }
            C5723u.m25268C0(this, U0, getPaddingTop(), P0, getPaddingBottom());
        }
    }

    /* renamed from: B */
    private void m46177B() {
        TextPaint paint = getPaint();
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C10806d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo42976j(getContext(), paint, this.f47531t);
        }
    }

    /* renamed from: C */
    private void m46178C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f47530s.setEmpty();
        if (m46190n() && this.f47519h != null) {
            this.f47516e.mo40283e1(this.f47530s);
        }
        return this.f47530s;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f47529r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f47529r;
    }

    private C10806d getTextAppearance() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40308o1();
        }
        return null;
    }

    /* renamed from: i */
    private void m46186i(C10074a aVar) {
        aVar.mo40329v2(this);
    }

    /* renamed from: j */
    private int[] m46187j() {
        int isEnabled = isEnabled();
        if (this.f47524m) {
            isEnabled++;
        }
        if (this.f47523l) {
            isEnabled++;
        }
        if (this.f47522k) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f47524m) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f47523l) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f47522k) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m46188l() {
        if (getBackgroundDrawable() == this.f47517f && this.f47516e.getCallback() == null) {
            this.f47516e.setCallback(this.f47517f);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: m */
    private boolean m46189m(MotionEvent motionEvent) {
        Class<C5923a> cls = C5923a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f47528q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("X", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f47528q, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (InvocationTargetException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchFieldException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m46190n() {
        C10074a aVar = this.f47516e;
        return (aVar == null || aVar.mo40268X0() == null) ? false : true;
    }

    /* renamed from: o */
    private void m46191o(Context context, AttributeSet attributeSet, int i) {
        TypedArray h = C10220m.m47116h(context, attributeSet, C6532l.f26632C0, i, f47512u, new int[0]);
        this.f47525n = h.getBoolean(C6532l.f26989j1, false);
        this.f47527p = (int) Math.ceil((double) h.getDimension(C6532l.f26859X0, (float) Math.ceil((double) C10227s.m47135c(getContext(), 48))));
        h.recycle();
    }

    /* renamed from: p */
    private void m46192p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C10068b());
        }
    }

    /* renamed from: q */
    private void m46193q(int i, int i2, int i3, int i4) {
        this.f47517f = new InsetDrawable(this.f47516e, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f47523l != z) {
            this.f47523l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f47522k != z) {
            this.f47522k = z;
            refreshDrawableState();
        }
    }

    /* renamed from: u */
    private void m46194u() {
        if (this.f47517f != null) {
            this.f47517f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m46197y();
        }
    }

    /* renamed from: w */
    private void m46195w(C10074a aVar) {
        if (aVar != null) {
            aVar.mo40329v2((C10074a.C10075a) null);
        }
    }

    /* renamed from: x */
    private void m46196x() {
        if (!m46190n() || !mo40079s() || this.f47519h == null) {
            C5723u.m25330o0(this, (C5682a) null);
        } else {
            C5723u.m25330o0(this, this.f47528q);
        }
    }

    /* renamed from: y */
    private void m46197y() {
        if (C10841b.f49599a) {
            m46198z();
            return;
        }
        this.f47516e.mo40254Q2(true);
        C5723u.m25336r0(this, getBackgroundDrawable());
        m46176A();
        m46188l();
    }

    /* renamed from: z */
    private void m46198z() {
        this.f47518g = new RippleDrawable(C10841b.m48833d(this.f47516e.mo40302l1()), getBackgroundDrawable(), (Drawable) null);
        this.f47516e.mo40254Q2(false);
        C5723u.m25336r0(this, this.f47518g);
        m46176A();
    }

    /* renamed from: a */
    public void mo40035a() {
        mo40069k(this.f47527p);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m46189m(motionEvent) || this.f47528q.mo22935v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f47528q.mo22936w(keyEvent) || this.f47528q.mo22918A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10074a aVar = this.f47516e;
        if ((aVar == null || !aVar.mo40328v1()) ? false : this.f47516e.mo40316r2(m46187j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f47517f;
        return insetDrawable == null ? this.f47516e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40237L0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40240M0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40243N0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.mo40246O0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f47516e;
    }

    public float getChipEndPadding() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40249P0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40252Q0();
        }
        return null;
    }

    public float getChipIconSize() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40255R0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40258S0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40260T0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40262U0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40264V0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40266W0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40268X0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40270Y0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40272Z0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40274a1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40276b1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40280d1();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40293h1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f47528q.mo22918A() == 1 || this.f47528q.mo22937x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C10500h getHideMotionSpec() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40294i1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40298j1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40300k1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40302l1();
        }
        return null;
    }

    public C10897m getShapeAppearanceModel() {
        return this.f47516e.mo43076D();
    }

    public C10500h getShowMotionSpec() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40304m1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40312p1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            return aVar.mo40314q1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public boolean mo40069k(int i) {
        this.f47527p = i;
        int i2 = 0;
        if (!mo40175v()) {
            if (this.f47517f != null) {
                m46194u();
            } else {
                m46197y();
            }
            return false;
        }
        int max = Math.max(0, i - this.f47516e.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f47516e.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            if (this.f47517f != null) {
                Rect rect = new Rect();
                this.f47517f.getPadding(rect);
                if (rect.top == i2 && rect.bottom == i2 && rect.left == i3 && rect.right == i3) {
                    m46197y();
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
            } else {
                setMinHeight(i);
                setMinWidth(i);
            }
            m46193q(i3, i2, i3, i2);
            m46197y();
            return true;
        }
        if (this.f47517f != null) {
            m46194u();
        } else {
            m46197y();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10893i.m48987f(this, this.f47516e);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f47514w);
        }
        if (mo40078r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f47515x);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f47528q.mo22924K(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mo40078r() || isClickable()) {
            accessibilityNodeInfo.setClassName(mo40078r() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(mo40078r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C5771c.m25532H0(accessibilityNodeInfo).mo22633f0(C5771c.C5774c.m25623a(chipGroup.mo40824b(this), 1, chipGroup.mo40180c() ? chipGroup.mo40191o(this) : -1, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f47526o != i) {
            this.f47526o = i;
            m46176A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f47522k
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f47522k
            if (r0 == 0) goto L_0x0034
            r5.mo40174t()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean mo40078r() {
        C10074a aVar = this.f47516e;
        return aVar != null && aVar.mo40325u1();
    }

    /* renamed from: s */
    public boolean mo40079s() {
        C10074a aVar = this.f47516e;
        return aVar != null && aVar.mo40331w1();
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f47518g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f47518g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40221D1(z);
        }
    }

    public void setCheckableResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40223E1(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C10074a aVar = this.f47516e;
        if (aVar == null) {
            this.f47521j = z;
        } else if (aVar.mo40325u1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f47520i) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40225F1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40227G1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40229H1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40231I1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40233J1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40238L1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40241M1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40244N1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40247O1(i);
        }
    }

    public void setChipDrawable(C10074a aVar) {
        C10074a aVar2 = this.f47516e;
        if (aVar2 != aVar) {
            m46195w(aVar2);
            this.f47516e = aVar;
            aVar.mo40228G2(false);
            m46186i(this.f47516e);
            mo40069k(this.f47527p);
        }
    }

    public void setChipEndPadding(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40250P1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40253Q1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40256R1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40259S1(i);
        }
    }

    public void setChipIconSize(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40261T1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40263U1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40265V1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40267W1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40269X1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40273Z1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40275a2(i);
        }
    }

    public void setChipStartPadding(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40277b2(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40279c2(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40281d2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40284e2(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40285f2(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40286g2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40295i2(drawable);
        }
        m46196x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40299j2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40301k2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40303l2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40305m2(i);
        }
        m46196x();
    }

    public void setCloseIconSize(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40307n2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40309o2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40313p2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40315q2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40319s2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40324t2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo43090Z(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f47516e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C10074a aVar = this.f47516e;
                if (aVar != null) {
                    aVar.mo40332w2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f47525n = z;
        mo40069k(this.f47527p);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C10500h hVar) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40333x2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40334y2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40336z2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40217A2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40219B2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40220C2(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f47516e != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40222D2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f47520i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f47519h = onClickListener;
        m46196x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40224E2(colorStateList);
        }
        if (!this.f47516e.mo40318s1()) {
            m46198z();
        }
    }

    public void setRippleColorResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40226F2(i);
            if (!this.f47516e.mo40318s1()) {
                m46198z();
            }
        }
    }

    public void setShapeAppearanceModel(C10897m mVar) {
        this.f47516e.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(C10500h hVar) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40230H2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40232I2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.mo40257R2() ? null : charSequence, bufferType);
            C10074a aVar2 = this.f47516e;
            if (aVar2 != null) {
                aVar2.mo40234J2(charSequence);
            }
        }
    }

    public void setTextAppearance(C10806d dVar) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40236K2(dVar);
        }
        m46177B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40242M2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40245N2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40248O2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40251P2(i);
        }
    }

    /* renamed from: t */
    public boolean mo40174t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f47519h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f47528q.mo22933W(1, 1);
        return z;
    }

    /* renamed from: v */
    public boolean mo40175v() {
        return this.f47525n;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f47512u
            android.content.Context r8 = p246q6.C10962a.m49296c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f47529r = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f47530s = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.f47531t = r8
            android.content.Context r8 = r7.getContext()
            r7.m46178C(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.C10074a.m46232B0(r8, r9, r10, r4)
            r7.m46191o(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = p111m0.C5723u.m25345w(r7)
            r6.mo43090Z(r0)
            int[] r2 = p194c6.C6532l.f26632C0
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L_0x0051
            int r10 = p194c6.C6532l.f26665F0
            android.content.res.ColorStateList r8 = p233m6.C10805c.m48753a(r8, r9, r10)
            r7.setTextColor(r8)
        L_0x0051:
            int r8 = p194c6.C6532l.f27044o1
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.f47528q = r9
            r7.m46196x()
            if (r8 != 0) goto L_0x0069
            r7.m46192p()
        L_0x0069:
            boolean r8 = r7.f47521j
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.mo40306n1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.mo40293h1()
            r7.setEllipsize(r8)
            r7.m46177B()
            com.google.android.material.chip.a r8 = r7.f47516e
            boolean r8 = r8.mo40257R2()
            if (r8 != 0) goto L_0x008e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L_0x008e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.m46176A()
            boolean r8 = r7.mo40175v()
            if (r8 == 0) goto L_0x00a2
            int r8 = r7.f47527p
            r7.setMinHeight(r8)
        L_0x00a2:
            int r8 = p111m0.C5723u.m25265B(r7)
            r7.f47526o = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40326u2(z);
        }
        m46196x();
    }

    public void setCheckedIconVisible(boolean z) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40235K1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40271Y1(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40239L2(i);
        }
        m46177B();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C10074a aVar = this.f47516e;
        if (aVar != null) {
            aVar.mo40239L2(i);
        }
        m46177B();
    }
}
