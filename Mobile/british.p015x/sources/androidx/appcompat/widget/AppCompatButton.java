package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C0615b;
import androidx.core.widget.C0624k;
import androidx.core.widget.C0627m;
import p073f.C5238a;
import p111m0.C5722t;

public class AppCompatButton extends Button implements C5722t, C0615b, C0627m {

    /* renamed from: b */
    private final C0378d f1205b;

    /* renamed from: c */
    private final C0399l f1206c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22821q);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378d dVar = this.f1205b;
        if (dVar != null) {
            dVar.mo2067b();
        }
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            lVar.mo2184b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0615b.f3242a0) {
            return super.getAutoSizeMaxTextSize();
        }
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            return lVar.mo2186e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0615b.f3242a0) {
            return super.getAutoSizeMinTextSize();
        }
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            return lVar.mo2187f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0615b.f3242a0) {
            return super.getAutoSizeStepGranularity();
        }
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            return lVar.mo2188g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0615b.f3242a0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0399l lVar = this.f1206c;
        return lVar != null ? lVar.mo2189h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0615b.f3242a0) {
            C0399l lVar = this.f1206c;
            if (lVar != null) {
                return lVar.mo2190i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378d dVar = this.f1205b;
        if (dVar != null) {
            return dVar.mo2068c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378d dVar = this.f1205b;
        if (dVar != null) {
            return dVar.mo2069d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1206c.mo2191j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1206c.mo2192k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            lVar.mo2196o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0399l lVar = this.f1206c;
        if (lVar != null && !C0615b.f3242a0 && lVar.mo2193l()) {
            this.f1206c.mo2185c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0615b.f3242a0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            lVar.mo2200s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0615b.f3242a0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            lVar.mo2201t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0615b.f3242a0) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            lVar.mo2202u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378d dVar = this.f1205b;
        if (dVar != null) {
            dVar.mo2071f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378d dVar = this.f1205b;
        if (dVar != null) {
            dVar.mo2072g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0624k.m3469s(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            lVar.mo2199r(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378d dVar = this.f1205b;
        if (dVar != null) {
            dVar.mo2074i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378d dVar = this.f1205b;
        if (dVar != null) {
            dVar.mo2075j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1206c.mo2203v(colorStateList);
        this.f1206c.mo2184b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1206c.mo2204w(mode);
        this.f1206c.mo2184b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            lVar.mo2198q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0615b.f3242a0) {
            super.setTextSize(i, f);
            return;
        }
        C0399l lVar = this.f1206c;
        if (lVar != null) {
            lVar.mo2205z(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0377c0.m1949b(context), attributeSet, i);
        C0373a0.m1942a(this, getContext());
        C0378d dVar = new C0378d(this);
        this.f1205b = dVar;
        dVar.mo2070e(attributeSet, i);
        C0399l lVar = new C0399l(this);
        this.f1206c = lVar;
        lVar.mo2194m(attributeSet, i);
        lVar.mo2184b();
    }
}
