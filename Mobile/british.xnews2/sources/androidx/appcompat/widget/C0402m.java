package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p072f.C5247j;
import p110m0.C5723u;

/* renamed from: androidx.appcompat.widget.m */
/* compiled from: AppCompatTextViewAutoSizeHelper */
class C0402m {

    /* renamed from: l */
    private static final RectF f1640l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1641m = new ConcurrentHashMap<>();

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1642n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1643a = 0;

    /* renamed from: b */
    private boolean f1644b = false;

    /* renamed from: c */
    private float f1645c = -1.0f;

    /* renamed from: d */
    private float f1646d = -1.0f;

    /* renamed from: e */
    private float f1647e = -1.0f;

    /* renamed from: f */
    private int[] f1648f = new int[0];

    /* renamed from: g */
    private boolean f1649g = false;

    /* renamed from: h */
    private TextPaint f1650h;

    /* renamed from: i */
    private final TextView f1651i;

    /* renamed from: j */
    private final Context f1652j;

    /* renamed from: k */
    private final C0405c f1653k;

    /* renamed from: androidx.appcompat.widget.m$a */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0403a extends C0405c {
        C0403a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2222a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0402m.m2141r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.m$b */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0404b extends C0403a {
        C0404b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2222a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2223b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.m$c */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0405c {
        C0405c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2222a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2223b(TextView textView) {
            return ((Boolean) C0402m.m2141r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0402m(TextView textView) {
        this.f1651i = textView;
        this.f1652j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f1653k = new C0404b();
        } else if (i >= 23) {
            this.f1653k = new C0403a();
        } else {
            this.f1653k = new C0405c();
        }
    }

    /* renamed from: A */
    private void m2127A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1648f = m2133c(iArr);
            m2128B();
        }
    }

    /* renamed from: B */
    private boolean m2128B() {
        int[] iArr = this.f1648f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1649g = z;
        if (z) {
            this.f1643a = 1;
            this.f1646d = (float) iArr[0];
            this.f1647e = (float) iArr[length - 1];
            this.f1645c = -1.0f;
        }
        return z;
    }

    /* renamed from: C */
    private boolean m2129C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1651i.getText();
        TransformationMethod transformationMethod = this.f1651i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1651i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1651i.getMaxLines() : -1;
        mo2215q(i);
        StaticLayout e = mo2209e(text, (Layout.Alignment) m2141r(this.f1651i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e.getLineCount() <= maxLines && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m2130D() {
        return !(this.f1651i instanceof AppCompatEditText);
    }

    /* renamed from: E */
    private void m2131E(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1643a = 1;
            this.f1646d = f;
            this.f1647e = f2;
            this.f1645c = f3;
            this.f1649g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private static <T> T m2132a(Object obj, String str, T t) {
        try {
            Field o = m2139o(str);
            if (o == null) {
                return t;
            }
            return o.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m2133c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m2134d() {
        this.f1643a = 0;
        this.f1646d = -1.0f;
        this.f1647e = -1.0f;
        this.f1645c = -1.0f;
        this.f1648f = new int[0];
        this.f1644b = false;
    }

    /* renamed from: f */
    private StaticLayout m2135f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1650h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1651i.getLineSpacingExtra(), this.f1651i.getLineSpacingMultiplier()).setIncludePad(this.f1651i.getIncludeFontPadding()).setBreakStrategy(this.f1651i.getBreakStrategy()).setHyphenationFrequency(this.f1651i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f1653k.mo2222a(obtain, this.f1651i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m2136g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1650h, i, alignment, ((Float) m2132a(this.f1651i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m2132a(this.f1651i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m2132a(this.f1651i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: h */
    private StaticLayout m2137h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1650h, i, alignment, this.f1651i.getLineSpacingMultiplier(), this.f1651i.getLineSpacingExtra(), this.f1651i.getIncludeFontPadding());
    }

    /* renamed from: i */
    private int m2138i(RectF rectF) {
        int length = this.f1648f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m2129C(this.f1648f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1648f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: o */
    private static Field m2139o(String str) {
        try {
            Field field = f1642n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1642n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m2140p(String str) {
        try {
            Method method = f1641m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1641m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: r */
    static <T> T m2141r(Object obj, String str, T t) {
        try {
            return m2140p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: x */
    private void m2142x(float f) {
        if (f != this.f1651i.getPaint().getTextSize()) {
            this.f1651i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1651i.isInLayout() : false;
            if (this.f1651i.getLayout() != null) {
                this.f1644b = false;
                try {
                    Method p = m2140p("nullLayouts");
                    if (p != null) {
                        p.invoke(this.f1651i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1651i.requestLayout();
                } else {
                    this.f1651i.forceLayout();
                }
                this.f1651i.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m2143z() {
        if (!m2130D() || this.f1643a != 1) {
            this.f1644b = false;
        } else {
            if (!this.f1649g || this.f1648f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1647e - this.f1646d) / this.f1645c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1646d + (((float) i) * this.f1645c));
                }
                this.f1648f = m2133c(iArr);
            }
            this.f1644b = true;
        }
        return this.f1644b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2208b() {
        int i;
        if (mo2216s()) {
            if (this.f1644b) {
                if (this.f1651i.getMeasuredHeight() > 0 && this.f1651i.getMeasuredWidth() > 0) {
                    if (this.f1653k.mo2223b(this.f1651i)) {
                        i = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i = (this.f1651i.getMeasuredWidth() - this.f1651i.getTotalPaddingLeft()) - this.f1651i.getTotalPaddingRight();
                    }
                    int height = (this.f1651i.getHeight() - this.f1651i.getCompoundPaddingBottom()) - this.f1651i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f1640l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float i2 = (float) m2138i(rectF);
                            if (i2 != this.f1651i.getTextSize()) {
                                mo2221y(0, i2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1644b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public StaticLayout mo2209e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            return m2135f(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return m2137h(charSequence, alignment, i);
        }
        return m2136g(charSequence, alignment, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo2210j() {
        return Math.round(this.f1647e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo2211k() {
        return Math.round(this.f1646d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2212l() {
        return Math.round(this.f1645c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] mo2213m() {
        return this.f1648f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo2214n() {
        return this.f1643a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2215q(int i) {
        TextPaint textPaint = this.f1650h;
        if (textPaint == null) {
            this.f1650h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1650h.set(this.f1651i.getPaint());
        this.f1650h.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo2216s() {
        return m2130D() && this.f1643a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2217t(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f1652j;
        int[] iArr = C5247j.f23162k0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1651i;
        C5723u.m25326m0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C5247j.f23187p0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1643a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C5247j.f23182o0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C5247j.f23172m0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C5247j.f23167l0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C5247j.f23177n0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m2127A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m2130D()) {
            this.f1643a = 0;
        } else if (this.f1643a == 1) {
            if (!this.f1649g) {
                DisplayMetrics displayMetrics = this.f1652j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m2131E(dimension2, dimension3, dimension);
            }
            m2143z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2218u(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m2130D()) {
            DisplayMetrics displayMetrics = this.f1652j.getResources().getDisplayMetrics();
            m2131E(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m2143z()) {
                mo2208b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2219v(int[] iArr, int i) throws IllegalArgumentException {
        if (m2130D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1652j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1648f = m2133c(iArr2);
                if (!m2128B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1649g = false;
            }
            if (m2143z()) {
                mo2208b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2220w(int i) {
        if (!m2130D()) {
            return;
        }
        if (i == 0) {
            m2134d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1652j.getResources().getDisplayMetrics();
            m2131E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m2143z()) {
                mo2208b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo2221y(int i, float f) {
        Resources resources;
        Context context = this.f1652j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m2142x(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }
}
