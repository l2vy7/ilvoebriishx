package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p017c0.C2617a;
import p073f.C5247j;

/* renamed from: androidx.appcompat.widget.a0 */
/* compiled from: ThemeUtils */
public class C0373a0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1519a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1520b = {-16842910};

    /* renamed from: c */
    static final int[] f1521c = {16842908};

    /* renamed from: d */
    static final int[] f1522d = {16843518};

    /* renamed from: e */
    static final int[] f1523e = {16842919};

    /* renamed from: f */
    static final int[] f1524f = {16842912};

    /* renamed from: g */
    static final int[] f1525g = {16842913};

    /* renamed from: h */
    static final int[] f1526h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1527i = new int[0];

    /* renamed from: j */
    private static final int[] f1528j = new int[1];

    /* renamed from: a */
    public static void m1942a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C5247j.f22986B0);
        try {
            if (!obtainStyledAttributes.hasValue(C5247j.f23011G0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1943b(Context context, int i) {
        ColorStateList e = m1946e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1520b, e.getDefaultColor());
        }
        TypedValue f = m1947f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m1945d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m1944c(Context context, int i) {
        int[] iArr = f1528j;
        iArr[0] = i;
        C0384f0 u = C0384f0.m1993u(context, (AttributeSet) null, iArr);
        try {
            return u.mo2096b(0, 0);
        } finally {
            u.mo2114w();
        }
    }

    /* renamed from: d */
    static int m1945d(Context context, int i, float f) {
        int c = m1944c(context, i);
        return C2617a.m9119m(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m1946e(Context context, int i) {
        int[] iArr = f1528j;
        iArr[0] = i;
        C0384f0 u = C0384f0.m1993u(context, (AttributeSet) null, iArr);
        try {
            return u.mo2097c(0);
        } finally {
            u.mo2114w();
        }
    }

    /* renamed from: f */
    private static TypedValue m1947f() {
        ThreadLocal<TypedValue> threadLocal = f1519a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
