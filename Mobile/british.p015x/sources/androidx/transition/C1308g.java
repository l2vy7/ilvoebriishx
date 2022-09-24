package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.g */
/* compiled from: GhostViewPlatform */
class C1308g implements C1302e {

    /* renamed from: c */
    private static Class<?> f5885c;

    /* renamed from: d */
    private static boolean f5886d;

    /* renamed from: e */
    private static Method f5887e;

    /* renamed from: f */
    private static boolean f5888f;

    /* renamed from: g */
    private static Method f5889g;

    /* renamed from: h */
    private static boolean f5890h;

    /* renamed from: b */
    private final View f5891b;

    private C1308g(View view) {
        this.f5891b = view;
    }

    /* renamed from: b */
    static C1302e m7075b(View view, ViewGroup viewGroup, Matrix matrix) {
        m7076c();
        Method method = f5887e;
        if (method != null) {
            try {
                return new C1308g((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    private static void m7076c() {
        if (!f5888f) {
            try {
                m7077d();
                Method declaredMethod = f5885c.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                f5887e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
            }
            f5888f = true;
        }
    }

    /* renamed from: d */
    private static void m7077d() {
        if (!f5886d) {
            try {
                f5885c = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            f5886d = true;
        }
    }

    /* renamed from: e */
    private static void m7078e() {
        if (!f5890h) {
            try {
                m7077d();
                Method declaredMethod = f5885c.getDeclaredMethod("removeGhost", new Class[]{View.class});
                f5889g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
            }
            f5890h = true;
        }
    }

    /* renamed from: f */
    static void m7079f(View view) {
        m7078e();
        Method method = f5889g;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo6306a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.f5891b.setVisibility(i);
    }
}
