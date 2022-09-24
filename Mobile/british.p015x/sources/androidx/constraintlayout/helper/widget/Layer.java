package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0572f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import p166w.C6246e;

public class Layer extends ConstraintHelper {

    /* renamed from: A */
    private boolean f1821A;

    /* renamed from: j */
    private float f1822j = Float.NaN;

    /* renamed from: k */
    private float f1823k = Float.NaN;

    /* renamed from: l */
    private float f1824l = Float.NaN;

    /* renamed from: m */
    ConstraintLayout f1825m;

    /* renamed from: n */
    private float f1826n = 1.0f;

    /* renamed from: o */
    private float f1827o = 1.0f;

    /* renamed from: p */
    protected float f1828p = Float.NaN;

    /* renamed from: q */
    protected float f1829q = Float.NaN;

    /* renamed from: r */
    protected float f1830r = Float.NaN;

    /* renamed from: s */
    protected float f1831s = Float.NaN;

    /* renamed from: t */
    protected float f1832t = Float.NaN;

    /* renamed from: u */
    protected float f1833u = Float.NaN;

    /* renamed from: v */
    boolean f1834v = true;

    /* renamed from: w */
    View[] f1835w = null;

    /* renamed from: x */
    private float f1836x = 0.0f;

    /* renamed from: y */
    private float f1837y = 0.0f;

    /* renamed from: z */
    private boolean f1838z;

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: w */
    private void m2481w() {
        int i;
        if (this.f1825m != null && (i = this.f2312c) != 0) {
            View[] viewArr = this.f1835w;
            if (viewArr == null || viewArr.length != i) {
                this.f1835w = new View[i];
            }
            for (int i2 = 0; i2 < this.f2312c; i2++) {
                this.f1835w[i2] = this.f1825m.mo2840h(this.f2311b[i2]);
            }
        }
    }

    /* renamed from: x */
    private void m2482x() {
        if (this.f1825m != null) {
            if (this.f1835w == null) {
                m2481w();
            }
            mo2521v();
            double radians = Math.toRadians((double) this.f1824l);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f = this.f1826n;
            float f2 = f * cos;
            float f3 = this.f1827o;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.f2312c; i++) {
                View view = this.f1835w[i];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - this.f1828p;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - this.f1829q;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.f1836x);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.f1837y);
                view.setScaleY(this.f1827o);
                view.setScaleX(this.f1826n);
                view.setRotation(this.f1824l);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2484m(AttributeSet attributeSet) {
        super.mo2484m(attributeSet);
        this.f2315f = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2808a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2878h1) {
                    this.f1838z = true;
                } else if (index == C0572f.f2946o1) {
                    this.f1821A = true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1825m = (ConstraintLayout) getParent();
        if (this.f1838z || this.f1821A) {
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f2312c; i++) {
                View h = this.f1825m.mo2840h(this.f2311b[i]);
                if (h != null) {
                    if (this.f1838z) {
                        h.setVisibility(visibility);
                    }
                    if (this.f1821A && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        h.setTranslationZ(h.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public void mo2510p(ConstraintLayout constraintLayout) {
        m2481w();
        this.f1828p = Float.NaN;
        this.f1829q = Float.NaN;
        C6246e b = ((ConstraintLayout.LayoutParams) getLayoutParams()).mo2858b();
        b.mo23792F0(0);
        b.mo23827i0(0);
        mo2521v();
        layout(((int) this.f1832t) - getPaddingLeft(), ((int) this.f1833u) - getPaddingTop(), ((int) this.f1830r) + getPaddingRight(), ((int) this.f1831s) + getPaddingBottom());
        if (!Float.isNaN(this.f1824l)) {
            m2482x();
        }
    }

    /* renamed from: r */
    public void mo2511r(ConstraintLayout constraintLayout) {
        this.f1825m = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f1824l = rotation;
        } else if (!Float.isNaN(this.f1824l)) {
            this.f1824l = rotation;
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2814g();
    }

    public void setPivotX(float f) {
        this.f1822j = f;
        m2482x();
    }

    public void setPivotY(float f) {
        this.f1823k = f;
        m2482x();
    }

    public void setRotation(float f) {
        this.f1824l = f;
        m2482x();
    }

    public void setScaleX(float f) {
        this.f1826n = f;
        m2482x();
    }

    public void setScaleY(float f) {
        this.f1827o = f;
        m2482x();
    }

    public void setTranslationX(float f) {
        this.f1836x = f;
        m2482x();
    }

    public void setTranslationY(float f) {
        this.f1837y = f;
        m2482x();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2814g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo2521v() {
        if (this.f1825m != null) {
            if (!this.f1834v && !Float.isNaN(this.f1828p) && !Float.isNaN(this.f1829q)) {
                return;
            }
            if (Float.isNaN(this.f1822j) || Float.isNaN(this.f1823k)) {
                View[] l = mo2817l(this.f1825m);
                int left = l[0].getLeft();
                int top = l[0].getTop();
                int right = l[0].getRight();
                int bottom = l[0].getBottom();
                for (int i = 0; i < this.f2312c; i++) {
                    View view = l[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f1830r = (float) right;
                this.f1831s = (float) bottom;
                this.f1832t = (float) left;
                this.f1833u = (float) top;
                if (Float.isNaN(this.f1822j)) {
                    this.f1828p = (float) ((left + right) / 2);
                } else {
                    this.f1828p = this.f1822j;
                }
                if (Float.isNaN(this.f1823k)) {
                    this.f1829q = (float) ((top + bottom) / 2);
                } else {
                    this.f1829q = this.f1823k;
                }
            } else {
                this.f1829q = this.f1823k;
                this.f1828p = this.f1822j;
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
