package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C0615b;
import androidx.core.widget.C0624k;
import androidx.core.widget.C0627m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p017c0.C2622d;
import p079g.C5264a;
import p100k0.C5539c;
import p111m0.C5722t;

public class AppCompatTextView extends TextView implements C5722t, C0627m, C0615b {

    /* renamed from: b */
    private final C0378d f1259b;

    /* renamed from: c */
    private final C0399l f1260c;

    /* renamed from: d */
    private final C0397k f1261d;

    /* renamed from: e */
    private boolean f1262e;

    /* renamed from: f */
    private Future<C5539c> f1263f;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private void m1745c() {
        Future<C5539c> future = this.f1263f;
        if (future != null) {
            try {
                this.f1263f = null;
                C0624k.m3466p(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378d dVar = this.f1259b;
        if (dVar != null) {
            dVar.mo2067b();
        }
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2184b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0615b.f3242a0) {
            return super.getAutoSizeMaxTextSize();
        }
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            return lVar.mo2186e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0615b.f3242a0) {
            return super.getAutoSizeMinTextSize();
        }
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            return lVar.mo2187f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0615b.f3242a0) {
            return super.getAutoSizeStepGranularity();
        }
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            return lVar.mo2188g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0615b.f3242a0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0399l lVar = this.f1260c;
        return lVar != null ? lVar.mo2189h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0615b.f3242a0) {
            C0399l lVar = this.f1260c;
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

    public int getFirstBaselineToTopHeight() {
        return C0624k.m3452b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0624k.m3453c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378d dVar = this.f1259b;
        if (dVar != null) {
            return dVar.mo2068c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378d dVar = this.f1259b;
        if (dVar != null) {
            return dVar.mo2069d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1260c.mo2191j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1260c.mo2192k();
    }

    public CharSequence getText() {
        m1745c();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C0397k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f1261d) == null) {
            return super.getTextClassifier();
        }
        return kVar.mo2180a();
    }

    public C5539c.C5540a getTextMetricsParamsCompat() {
        return C0624k.m3457g(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0385g.m2015a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2196o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m1745c();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0399l lVar = this.f1260c;
        if (lVar != null && !C0615b.f3242a0 && lVar.mo2193l()) {
            this.f1260c.mo2185c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0615b.f3242a0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2200s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0615b.f3242a0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2201t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0615b.f3242a0) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2202u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378d dVar = this.f1259b;
        if (dVar != null) {
            dVar.mo2071f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378d dVar = this.f1259b;
        if (dVar != null) {
            dVar.mo2072g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2197p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2197p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2197p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2197p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0624k.m3469s(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0624k.m3463m(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0624k.m3464n(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0624k.m3465o(this, i);
    }

    public void setPrecomputedText(C5539c cVar) {
        C0624k.m3466p(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378d dVar = this.f1259b;
        if (dVar != null) {
            dVar.mo2074i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378d dVar = this.f1259b;
        if (dVar != null) {
            dVar.mo2075j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1260c.mo2203v(colorStateList);
        this.f1260c.mo2184b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1260c.mo2204w(mode);
        this.f1260c.mo2184b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2198q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0397k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f1261d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            kVar.mo2181b(textClassifier);
        }
    }

    public void setTextFuture(Future<C5539c> future) {
        this.f1263f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C5539c.C5540a aVar) {
        C0624k.m3468r(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0615b.f3242a0) {
            super.setTextSize(i, f);
            return;
        }
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2205z(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.f1262e) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                typeface2 = C2622d.m9140a(getContext(), typeface, i);
            }
            this.f1262e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f1262e = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0377c0.m1949b(context), attributeSet, i);
        this.f1262e = false;
        C0373a0.m1942a(this, getContext());
        C0378d dVar = new C0378d(this);
        this.f1259b = dVar;
        dVar.mo2070e(attributeSet, i);
        C0399l lVar = new C0399l(this);
        this.f1260c = lVar;
        lVar.mo2194m(attributeSet, i);
        lVar.mo2184b();
        this.f1261d = new C0397k(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C5264a.m23789d(context, i) : null;
        Drawable d2 = i2 != 0 ? C5264a.m23789d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C5264a.m23789d(context, i3) : null;
        if (i4 != 0) {
            drawable = C5264a.m23789d(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d, d2, d3, drawable);
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2197p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C5264a.m23789d(context, i) : null;
        Drawable d2 = i2 != 0 ? C5264a.m23789d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C5264a.m23789d(context, i3) : null;
        if (i4 != 0) {
            drawable = C5264a.m23789d(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(d, d2, d3, drawable);
        C0399l lVar = this.f1260c;
        if (lVar != null) {
            lVar.mo2197p();
        }
    }
}
