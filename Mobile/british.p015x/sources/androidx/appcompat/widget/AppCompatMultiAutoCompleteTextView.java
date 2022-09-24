package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p073f.C5238a;
import p079g.C5264a;
import p111m0.C5722t;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements C5722t {

    /* renamed from: d */
    private static final int[] f1220d = {16843126};

    /* renamed from: b */
    private final C0378d f1221b;

    /* renamed from: c */
    private final C0399l f1222c;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22820p);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378d dVar = this.f1221b;
        if (dVar != null) {
            dVar.mo2067b();
        }
        C0399l lVar = this.f1222c;
        if (lVar != null) {
            lVar.mo2184b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378d dVar = this.f1221b;
        if (dVar != null) {
            return dVar.mo2068c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378d dVar = this.f1221b;
        if (dVar != null) {
            return dVar.mo2069d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0385g.m2015a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378d dVar = this.f1221b;
        if (dVar != null) {
            dVar.mo2071f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378d dVar = this.f1221b;
        if (dVar != null) {
            dVar.mo2072g(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C5264a.m23789d(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378d dVar = this.f1221b;
        if (dVar != null) {
            dVar.mo2074i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378d dVar = this.f1221b;
        if (dVar != null) {
            dVar.mo2075j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0399l lVar = this.f1222c;
        if (lVar != null) {
            lVar.mo2198q(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0377c0.m1949b(context), attributeSet, i);
        C0373a0.m1942a(this, getContext());
        C0384f0 v = C0384f0.m1994v(getContext(), attributeSet, f1220d, i, 0);
        if (v.mo2113s(0)) {
            setDropDownBackgroundDrawable(v.mo2101g(0));
        }
        v.mo2114w();
        C0378d dVar = new C0378d(this);
        this.f1221b = dVar;
        dVar.mo2070e(attributeSet, i);
        C0399l lVar = new C0399l(this);
        this.f1222c = lVar;
        lVar.mo2194m(attributeSet, i);
        lVar.mo2184b();
    }
}
