package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p143s.C6003a;
import p143s.C6004b;
import p143s.C6006d;
import p143s.C6007e;

public class CardView extends FrameLayout {

    /* renamed from: i */
    private static final int[] f1777i = {16842801};

    /* renamed from: j */
    private static final C0460e f1778j;

    /* renamed from: b */
    private boolean f1779b;

    /* renamed from: c */
    private boolean f1780c;

    /* renamed from: d */
    int f1781d;

    /* renamed from: e */
    int f1782e;

    /* renamed from: f */
    final Rect f1783f;

    /* renamed from: g */
    final Rect f1784g;

    /* renamed from: h */
    private final C0459d f1785h;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0453a implements C0459d {

        /* renamed from: a */
        private Drawable f1786a;

        C0453a() {
        }

        /* renamed from: a */
        public void mo2425a(int i, int i2, int i3, int i4) {
            CardView.this.f1784g.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1783f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: b */
        public void mo2426b(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1781d) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1782e) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        /* renamed from: c */
        public void mo2427c(Drawable drawable) {
            this.f1786a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: d */
        public boolean mo2428d() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: e */
        public boolean mo2429e() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: f */
        public Drawable mo2430f() {
            return this.f1786a;
        }

        /* renamed from: g */
        public View mo2431g() {
            return CardView.this;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f1778j = new C0456b();
        } else if (i >= 17) {
            f1778j = new C0454a();
        } else {
            f1778j = new C0457c();
        }
        f1778j.mo2432j();
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1778j.mo2441h(this.f1785h);
    }

    public float getCardElevation() {
        return f1778j.mo2436c(this.f1785h);
    }

    public int getContentPaddingBottom() {
        return this.f1783f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1783f.left;
    }

    public int getContentPaddingRight() {
        return this.f1783f.right;
    }

    public int getContentPaddingTop() {
        return this.f1783f.top;
    }

    public float getMaxCardElevation() {
        return f1778j.mo2440g(this.f1785h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1780c;
    }

    public float getRadius() {
        return f1778j.mo2437d(this.f1785h);
    }

    public boolean getUseCompatPadding() {
        return this.f1779b;
    }

    /* renamed from: h */
    public void mo2412h(int i, int i2, int i3, int i4) {
        this.f1783f.set(i, i2, i3, i4);
        f1778j.mo2442i(this.f1785h);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0460e eVar = f1778j;
        if (!(eVar instanceof C0456b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo2444l(this.f1785h)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo2443k(this.f1785h)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1778j.mo2446n(this.f1785h, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f1778j.mo2439f(this.f1785h, f);
    }

    public void setMaxCardElevation(float f) {
        f1778j.mo2447o(this.f1785h, f);
    }

    public void setMinimumHeight(int i) {
        this.f1782e = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1781d = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1780c) {
            this.f1780c = z;
            f1778j.mo2445m(this.f1785h);
        }
    }

    public void setRadius(float f) {
        f1778j.mo2435b(this.f1785h, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1779b != z) {
            this.f1779b = z;
            f1778j.mo2438e(this.f1785h);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6003a.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1778j.mo2446n(this.f1785h, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1783f = rect;
        this.f1784g = new Rect();
        C0453a aVar = new C0453a();
        this.f1785h = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6007e.f24992a, i, C6006d.f24991a);
        int i3 = C6007e.f24995d;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1777i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C6004b.cardview_light_background);
            } else {
                i2 = getResources().getColor(C6004b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C6007e.f24996e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C6007e.f24997f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C6007e.f24998g, 0.0f);
        this.f1779b = obtainStyledAttributes.getBoolean(C6007e.f25000i, false);
        this.f1780c = obtainStyledAttributes.getBoolean(C6007e.f24999h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C6007e.f25001j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C6007e.f25003l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C6007e.f25005n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C6007e.f25004m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C6007e.f25002k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1781d = obtainStyledAttributes.getDimensionPixelSize(C6007e.f24993b, 0);
        this.f1782e = obtainStyledAttributes.getDimensionPixelSize(C6007e.f24994c, 0);
        obtainStyledAttributes.recycle();
        f1778j.mo2434a(aVar, context, colorStateList, dimension, dimension2, f);
    }
}
