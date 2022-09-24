package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.a0 */
/* compiled from: ViewGroupUtils */
class C1289a0 {

    /* renamed from: a */
    private static boolean f5846a = true;

    /* renamed from: b */
    private static Method f5847b;

    /* renamed from: c */
    private static boolean f5848c;

    /* renamed from: a */
    static int m7003a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f5848c) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                f5847b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f5848c = true;
        }
        Method method = f5847b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    static C1342z m7004b(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1341y(viewGroup);
        }
        return C1340x.m7149g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private static void m7005c(ViewGroup viewGroup, boolean z) {
        if (f5846a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f5846a = false;
            }
        }
    }

    /* renamed from: d */
    static void m7006d(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m7005c(viewGroup, z);
        } else {
            C1291b0.m7009b(viewGroup, z);
        }
    }
}
