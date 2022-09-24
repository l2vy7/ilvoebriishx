package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.C0626l;
import p073f.C5238a;
import p079g.C5264a;
import p111m0.C5722t;

public class AppCompatRadioButton extends RadioButton implements C0626l, C5722t {

    /* renamed from: b */
    private final C0380e f1225b;

    /* renamed from: c */
    private final C0378d f1226c;

    /* renamed from: d */
    private final C0399l f1227d;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22795I);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378d dVar = this.f1226c;
        if (dVar != null) {
            dVar.mo2067b();
        }
        C0399l lVar = this.f1227d;
        if (lVar != null) {
            lVar.mo2184b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0380e eVar = this.f1225b;
        return eVar != null ? eVar.mo2078b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378d dVar = this.f1226c;
        if (dVar != null) {
            return dVar.mo2068c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378d dVar = this.f1226c;
        if (dVar != null) {
            return dVar.mo2069d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0380e eVar = this.f1225b;
        if (eVar != null) {
            return eVar.mo2079c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0380e eVar = this.f1225b;
        if (eVar != null) {
            return eVar.mo2080d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378d dVar = this.f1226c;
        if (dVar != null) {
            dVar.mo2071f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378d dVar = this.f1226c;
        if (dVar != null) {
            dVar.mo2072g(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0380e eVar = this.f1225b;
        if (eVar != null) {
            eVar.mo2082f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378d dVar = this.f1226c;
        if (dVar != null) {
            dVar.mo2074i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378d dVar = this.f1226c;
        if (dVar != null) {
            dVar.mo2075j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0380e eVar = this.f1225b;
        if (eVar != null) {
            eVar.mo2083g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0380e eVar = this.f1225b;
        if (eVar != null) {
            eVar.mo2084h(mode);
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C0377c0.m1949b(context), attributeSet, i);
        C0373a0.m1942a(this, getContext());
        C0380e eVar = new C0380e(this);
        this.f1225b = eVar;
        eVar.mo2081e(attributeSet, i);
        C0378d dVar = new C0378d(this);
        this.f1226c = dVar;
        dVar.mo2070e(attributeSet, i);
        C0399l lVar = new C0399l(this);
        this.f1227d = lVar;
        lVar.mo2194m(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C5264a.m23789d(getContext(), i));
    }
}
