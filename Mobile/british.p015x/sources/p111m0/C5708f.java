package p111m0;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: m0.f */
/* compiled from: LayoutInflaterCompat */
public final class C5708f {

    /* renamed from: a */
    private static Field f24336a;

    /* renamed from: b */
    private static boolean f24337b;

    /* renamed from: a */
    private static void m25214a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f24337b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f24336a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f24337b = true;
        }
        Field field = f24336a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m25215b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m25214a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m25214a(layoutInflater, factory2);
            }
        }
    }
}
