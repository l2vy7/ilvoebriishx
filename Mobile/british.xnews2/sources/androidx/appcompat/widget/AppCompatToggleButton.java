package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p110m0.C5722t;

public class AppCompatToggleButton extends ToggleButton implements C5722t {

    /* renamed from: b */
    private final C0378d f1264b;

    /* renamed from: c */
    private final C0399l f1265c;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378d dVar = this.f1264b;
        if (dVar != null) {
            dVar.mo2067b();
        }
        C0399l lVar = this.f1265c;
        if (lVar != null) {
            lVar.mo2184b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378d dVar = this.f1264b;
        if (dVar != null) {
            return dVar.mo2068c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378d dVar = this.f1264b;
        if (dVar != null) {
            return dVar.mo2069d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378d dVar = this.f1264b;
        if (dVar != null) {
            dVar.mo2071f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378d dVar = this.f1264b;
        if (dVar != null) {
            dVar.mo2072g(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378d dVar = this.f1264b;
        if (dVar != null) {
            dVar.mo2074i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378d dVar = this.f1264b;
        if (dVar != null) {
            dVar.mo2075j(mode);
        }
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0373a0.m1942a(this, getContext());
        C0378d dVar = new C0378d(this);
        this.f1264b = dVar;
        dVar.mo2070e(attributeSet, i);
        C0399l lVar = new C0399l(this);
        this.f1265c = lVar;
        lVar.mo2194m(attributeSet, i);
    }
}
