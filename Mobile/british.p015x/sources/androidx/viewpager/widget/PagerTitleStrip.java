package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.C0624k;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.C1377e
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: p */
    private static final int[] f6095p = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: q */
    private static final int[] f6096q = {16843660};

    /* renamed from: b */
    ViewPager f6097b;

    /* renamed from: c */
    TextView f6098c;

    /* renamed from: d */
    TextView f6099d;

    /* renamed from: e */
    TextView f6100e;

    /* renamed from: f */
    private int f6101f = -1;

    /* renamed from: g */
    float f6102g = -1.0f;

    /* renamed from: h */
    private int f6103h;

    /* renamed from: i */
    private int f6104i;

    /* renamed from: j */
    private boolean f6105j;

    /* renamed from: k */
    private boolean f6106k;

    /* renamed from: l */
    private final C1370a f6107l = new C1370a();

    /* renamed from: m */
    private WeakReference<C1385a> f6108m;

    /* renamed from: n */
    private int f6109n;

    /* renamed from: o */
    int f6110o;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    private class C1370a extends DataSetObserver implements ViewPager.C1381i, ViewPager.C1380h {

        /* renamed from: a */
        private int f6111a;

        C1370a() {
        }

        /* renamed from: a */
        public void mo6615a(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo6587d(i, f, false);
        }

        /* renamed from: b */
        public void mo6616b(ViewPager viewPager, C1385a aVar, C1385a aVar2) {
            PagerTitleStrip.this.mo6604b(aVar, aVar2);
        }

        /* renamed from: c */
        public void mo6617c(int i) {
            this.f6111a = i;
        }

        /* renamed from: d */
        public void mo6618d(int i) {
            if (this.f6111a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.mo6605c(pagerTitleStrip.f6097b.getCurrentItem(), PagerTitleStrip.this.f6097b.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f6102g;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo6587d(pagerTitleStrip2.f6097b.getCurrentItem(), f, true);
            }
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.mo6605c(pagerTitleStrip.f6097b.getCurrentItem(), PagerTitleStrip.this.f6097b.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f6102g;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo6587d(pagerTitleStrip2.f6097b.getCurrentItem(), f, true);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    private static class C1371b extends SingleLineTransformationMethod {

        /* renamed from: b */
        private Locale f6113b;

        C1371b(Context context) {
            this.f6113b = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f6113b);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        this.f6098c = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f6099d = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f6100e = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6095p);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C0624k.m3467q(this.f6098c, resourceId);
            C0624k.m3467q(this.f6099d, resourceId);
            C0624k.m3467q(this.f6100e, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            mo6603a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f6098c.setTextColor(color);
            this.f6099d.setTextColor(color);
            this.f6100e.setTextColor(color);
        }
        this.f6104i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f6110o = this.f6099d.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f6098c.setEllipsize(TextUtils.TruncateAt.END);
        this.f6099d.setEllipsize(TextUtils.TruncateAt.END);
        this.f6100e.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f6096q);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f6098c);
            setSingleLineAllCaps(this.f6099d);
            setSingleLineAllCaps(this.f6100e);
        } else {
            this.f6098c.setSingleLine();
            this.f6099d.setSingleLine();
            this.f6100e.setSingleLine();
        }
        this.f6103h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C1371b(textView.getContext()));
    }

    /* renamed from: a */
    public void mo6603a(int i, float f) {
        this.f6098c.setTextSize(i, f);
        this.f6099d.setTextSize(i, f);
        this.f6100e.setTextSize(i, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6604b(C1385a aVar, C1385a aVar2) {
        if (aVar != null) {
            aVar.mo6719t(this.f6107l);
            this.f6108m = null;
        }
        if (aVar2 != null) {
            aVar2.mo6711l(this.f6107l);
            this.f6108m = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f6097b;
        if (viewPager != null) {
            this.f6101f = -1;
            this.f6102g = -1.0f;
            mo6605c(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6605c(int i, C1385a aVar) {
        int e = aVar != null ? aVar.mo6704e() : 0;
        this.f6105j = true;
        CharSequence charSequence = null;
        this.f6098c.setText((i < 1 || aVar == null) ? null : aVar.mo6706g(i - 1));
        this.f6099d.setText((aVar == null || i >= e) ? null : aVar.mo6706g(i));
        int i2 = i + 1;
        if (i2 < e && aVar != null) {
            charSequence = aVar.mo6706g(i2);
        }
        this.f6100e.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f6098c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f6099d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f6100e.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f6101f = i;
        if (!this.f6106k) {
            mo6587d(i, this.f6102g, false);
        }
        this.f6105j = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6587d(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        float f2 = f;
        if (i6 != this.f6101f) {
            mo6605c(i6, this.f6097b.getAdapter());
        } else if (!z && f2 == this.f6102g) {
            return;
        }
        this.f6106k = true;
        int measuredWidth = this.f6098c.getMeasuredWidth();
        int measuredWidth2 = this.f6099d.getMeasuredWidth();
        int measuredWidth3 = this.f6100e.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i10 = ((width - i8) - ((int) (((float) i9) * f3))) - i7;
        int i11 = measuredWidth2 + i10;
        int baseline = this.f6098c.getBaseline();
        int baseline2 = this.f6099d.getBaseline();
        int baseline3 = this.f6100e.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i12 = max - baseline;
        int i13 = max - baseline2;
        int i14 = max - baseline3;
        int i15 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f6098c.getMeasuredHeight() + i12, this.f6099d.getMeasuredHeight() + i13), this.f6100e.getMeasuredHeight() + i14);
        int i16 = this.f6104i & 112;
        if (i16 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i16 != 80) {
            i4 = i12 + paddingTop;
            i2 = i13 + paddingTop;
            i3 = paddingTop + i14;
            TextView textView = this.f6099d;
            textView.layout(i10, i2, i11, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i10 - this.f6103h) - measuredWidth);
            TextView textView2 = this.f6098c;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - i15, i11 + this.f6103h);
            TextView textView3 = this.f6100e;
            textView3.layout(max3, i3, max3 + i15, textView3.getMeasuredHeight() + i3);
            this.f6102g = f;
            this.f6106k = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i12 + i5;
        i2 = i13 + i5;
        i3 = i5 + i14;
        TextView textView4 = this.f6099d;
        textView4.layout(i10, i2, i11, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i10 - this.f6103h) - measuredWidth);
        TextView textView22 = this.f6098c;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - i15, i11 + this.f6103h);
        TextView textView32 = this.f6100e;
        textView32.layout(max32, i3, max32 + i15, textView32.getMeasuredHeight() + i3);
        this.f6102g = f;
        this.f6106k = false;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f6103h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            C1385a adapter = viewPager.getAdapter();
            viewPager.mo6630Q(this.f6107l);
            viewPager.mo6636b(this.f6107l);
            this.f6097b = viewPager;
            WeakReference<C1385a> weakReference = this.f6108m;
            mo6604b(weakReference != null ? (C1385a) weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f6097b;
        if (viewPager != null) {
            mo6604b(viewPager.getAdapter(), (C1385a) null);
            this.f6097b.mo6630Q((ViewPager.C1381i) null);
            this.f6097b.mo6625I(this.f6107l);
            this.f6097b = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f6097b != null) {
            float f = this.f6102g;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo6587d(this.f6101f, f, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f6098c.measure(childMeasureSpec2, childMeasureSpec);
            this.f6099d.measure(childMeasureSpec2, childMeasureSpec);
            this.f6100e.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f6099d.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f6099d.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.f6105j) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f6104i = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f6109n = i;
        int i2 = (i << 24) | (this.f6110o & 16777215);
        this.f6098c.setTextColor(i2);
        this.f6100e.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.f6110o = i;
        this.f6099d.setTextColor(i);
        int i2 = (this.f6109n << 24) | (this.f6110o & 16777215);
        this.f6098c.setTextColor(i2);
        this.f6100e.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f6103h = i;
        requestLayout();
    }
}
