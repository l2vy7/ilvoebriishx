package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class BundleUtil {
    private static final String TAG = "BundleUtil";
    private static Method getIBinderMethod;
    private static Method putIBinderMethod;

    private BundleUtil() {
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        if (Util.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return getBinderByReflection(bundle, str);
    }

    private static IBinder getBinderByReflection(Bundle bundle, String str) {
        Method method = getIBinderMethod;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                getIBinderMethod = method2;
                method2.setAccessible(true);
                method = getIBinderMethod;
            } catch (NoSuchMethodException e) {
                Log.m19796i(TAG, "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, new Object[]{str});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.m19796i(TAG, "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        if (Util.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            putBinderByReflection(bundle, str, iBinder);
        }
    }

    private static void putBinderByReflection(Bundle bundle, String str, IBinder iBinder) {
        Method method = putIBinderMethod;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                putIBinderMethod = method2;
                method2.setAccessible(true);
                method = putIBinderMethod;
            } catch (NoSuchMethodException e) {
                Log.m19796i(TAG, "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, new Object[]{str, iBinder});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.m19796i(TAG, "Failed to invoke putIBinder via reflection", e2);
        }
    }
}
