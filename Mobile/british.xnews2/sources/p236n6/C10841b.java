package p236n6;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p016c0.C2617a;

/* renamed from: n6.b */
/* compiled from: RippleUtils */
public class C10841b {

    /* renamed from: a */
    public static final boolean f49599a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f49600b = {16842919};

    /* renamed from: c */
    private static final int[] f49601c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f49602d = {16842908};

    /* renamed from: e */
    private static final int[] f49603e = {16843623};

    /* renamed from: f */
    private static final int[] f49604f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f49605g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f49606h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f49607i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f49608j = {16842913};

    /* renamed from: k */
    private static final int[] f49609k = {16842910, 16842919};

    /* renamed from: l */
    static final String f49610l = C10841b.class.getSimpleName();

    private C10841b() {
    }

    /* renamed from: a */
    public static ColorStateList m48830a(ColorStateList colorStateList) {
        if (f49599a) {
            return new ColorStateList(new int[][]{f49608j, StateSet.NOTHING}, new int[]{m48832c(colorStateList, f49604f), m48832c(colorStateList, f49600b)});
        }
        int[] iArr = f49604f;
        int[] iArr2 = f49605g;
        int[] iArr3 = f49606h;
        int[] iArr4 = f49607i;
        int[] iArr5 = f49600b;
        int[] iArr6 = f49601c;
        int[] iArr7 = f49602d;
        int[] iArr8 = f49603e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f49608j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m48832c(colorStateList, iArr), m48832c(colorStateList, iArr2), m48832c(colorStateList, iArr3), m48832c(colorStateList, iArr4), 0, m48832c(colorStateList, iArr5), m48832c(colorStateList, iArr6), m48832c(colorStateList, iArr7), m48832c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m48831b(int i) {
        return C2617a.m9119m(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: c */
    private static int m48832c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f49599a ? m48831b(colorForState) : colorForState;
    }

    /* renamed from: d */
    public static ColorStateList m48833d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f49609k, 0)) != 0) {
            Log.w(f49610l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m48834e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
