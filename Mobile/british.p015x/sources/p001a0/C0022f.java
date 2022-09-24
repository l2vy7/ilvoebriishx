package p001a0;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a0.f */
/* compiled from: BundleCompat */
public final class C0022f {

    /* renamed from: a0.f$a */
    /* compiled from: BundleCompat */
    static class C0023a {

        /* renamed from: a */
        private static Method f28a;

        /* renamed from: b */
        private static boolean f29b;

        /* renamed from: c */
        private static Method f30c;

        /* renamed from: d */
        private static boolean f31d;

        /* renamed from: a */
        public static IBinder m53a(Bundle bundle, String str) {
            if (!f29b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f28a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f29b = true;
            }
            Method method2 = f28a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f28a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m54b(Bundle bundle, String str, IBinder iBinder) {
            if (!f31d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f30c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f31d = true;
            }
            Method method2 = f30c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f30c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m51a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0023a.m53a(bundle, str);
    }

    /* renamed from: b */
    public static void m52b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0023a.m54b(bundle, str, iBinder);
        }
    }
}
