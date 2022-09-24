package p099k0;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: k0.b */
/* compiled from: ICUCompat */
public final class C5538b {

    /* renamed from: a */
    private static Method f24049a;

    /* renamed from: b */
    private static Method f24050b;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                f24049a = cls2.getMethod("getScript", new Class[]{cls});
                f24050b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
            } catch (Exception e) {
                f24049a = null;
                f24050b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f24050b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m24715a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f24050b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    /* renamed from: b */
    private static String m24716b(String str) {
        try {
            Method method = f24049a;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: c */
    public static String m24717c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f24050b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        } else {
            String a = m24715a(locale);
            if (a != null) {
                return m24716b(a);
            }
            return null;
        }
    }
}
