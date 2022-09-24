package p233m6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.C0384f0;
import p079g.C5264a;

/* renamed from: m6.c */
/* compiled from: MaterialResources */
public class C10805c {
    /* renamed from: a */
    public static ColorStateList m48753a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (c = C5264a.m23788c(context, resourceId)) != null) {
            return c;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) {
            return typedArray.getColorStateList(i);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: b */
    public static ColorStateList m48754b(Context context, C0384f0 f0Var, int i) {
        int b;
        int n;
        ColorStateList c;
        if (f0Var.mo2113s(i) && (n = f0Var.mo2108n(i, 0)) != 0 && (c = C5264a.m23788c(context, n)) != null) {
            return c;
        }
        if (Build.VERSION.SDK_INT > 15 || (b = f0Var.mo2096b(i, -1)) == -1) {
            return f0Var.mo2097c(i);
        }
        return ColorStateList.valueOf(b);
    }

    /* renamed from: c */
    public static int m48755c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m48756d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable d;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = C5264a.m23789d(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return d;
    }

    /* renamed from: e */
    static int m48757e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C10806d m48758f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C10806d(context, resourceId);
    }

    /* renamed from: g */
    public static boolean m48759g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m48760h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
