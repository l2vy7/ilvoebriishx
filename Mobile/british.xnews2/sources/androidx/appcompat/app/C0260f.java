package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.f */
/* compiled from: ResourcesFlusher */
class C0260f {

    /* renamed from: a */
    private static Field f789a;

    /* renamed from: b */
    private static boolean f790b;

    /* renamed from: c */
    private static Class<?> f791c;

    /* renamed from: d */
    private static boolean f792d;

    /* renamed from: e */
    private static Field f793e;

    /* renamed from: f */
    private static boolean f794f;

    /* renamed from: g */
    private static Field f795g;

    /* renamed from: h */
    private static boolean f796h;

    /* renamed from: a */
    static void m1224a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m1227d(resources);
            } else if (i >= 23) {
                m1226c(resources);
            } else if (i >= 21) {
                m1225b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m1225b(Resources resources) {
        if (!f790b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f789a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f790b = true;
        }
        Field field = f789a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m1226c(Resources resources) {
        if (!f790b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f789a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f790b = true;
        }
        Object obj = null;
        Field field = f789a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m1228e(obj);
        }
    }

    /* renamed from: d */
    private static void m1227d(Resources resources) {
        Object obj;
        if (!f796h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f795g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f796h = true;
        }
        Field field = f795g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f790b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f789a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f790b = true;
                }
                Field field2 = f789a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m1228e(obj2);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m1228e(Object obj) {
        if (!f792d) {
            try {
                f791c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f792d = true;
        }
        Class<?> cls = f791c;
        if (cls != null) {
            if (!f794f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f793e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f794f = true;
            }
            Field field = f793e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
