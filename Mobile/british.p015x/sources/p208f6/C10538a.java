package p208f6;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p017c0.C2617a;
import p233m6.C10804b;

/* renamed from: f6.a */
/* compiled from: MaterialColors */
public class C10538a {
    /* renamed from: a */
    public static int m48267a(int i, int i2) {
        return C2617a.m9119m(i, (Color.alpha(i) * i2) / 255);
    }

    /* renamed from: b */
    public static int m48268b(Context context, int i, int i2) {
        TypedValue a = C10804b.m48749a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: c */
    public static int m48269c(Context context, int i, String str) {
        return C10804b.m48751c(context, i, str);
    }

    /* renamed from: d */
    public static int m48270d(View view, int i) {
        return C10804b.m48752d(view, i);
    }

    /* renamed from: e */
    public static int m48271e(View view, int i, int i2) {
        return m48268b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static int m48272f(int i, int i2) {
        return C2617a.m9115i(i2, i);
    }

    /* renamed from: g */
    public static int m48273g(int i, int i2, float f) {
        return m48272f(i, C2617a.m9119m(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: h */
    public static int m48274h(View view, int i, int i2, float f) {
        return m48273g(m48270d(view, i), m48270d(view, i2), f);
    }
}
