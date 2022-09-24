package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import p062d0.C5135a;
import p062d0.C5137c;
import p083h.C5366c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.p */
/* compiled from: DrawableUtils */
public class C0409p {

    /* renamed from: a */
    private static final int[] f1654a = {16842912};

    /* renamed from: b */
    private static final int[] f1655b = new int[0];

    /* renamed from: c */
    public static final Rect f1656c = new Rect();

    /* renamed from: d */
    private static Class<?> f1657d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1657d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m2197a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m2197a(a)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof C5137c) {
            return m2197a(((C5137c) drawable).mo21284b());
        } else {
            if (drawable instanceof C5366c) {
                return m2197a(((C5366c) drawable).mo21750a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m2197a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: b */
    static void m2198b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m2199c(drawable);
        }
    }

    /* renamed from: c */
    private static void m2199c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1654a);
        } else {
            drawable.setState(f1655b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m2200d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1657d != null) {
            try {
                Drawable q = C5135a.m23417q(drawable);
                Object invoke = q.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(q, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1657d.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals(TtmlNode.LEFT)) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals(TtmlNode.RIGHT)) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1656c;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m2201e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
