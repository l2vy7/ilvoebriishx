package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;
import java.util.concurrent.Executor;
import p010b0.C1523f;
import p090i0.C5424d;

/* renamed from: androidx.core.content.b */
/* compiled from: ContextCompat */
public class C0600b {

    /* renamed from: a */
    private static final Object f3163a = new Object();

    /* renamed from: b */
    private static final Object f3164b = new Object();

    /* renamed from: c */
    private static TypedValue f3165c;

    /* renamed from: androidx.core.content.b$a */
    /* compiled from: ContextCompat */
    static class C0601a {
        /* renamed from: a */
        static void m3302a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m3303b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.b$b */
    /* compiled from: ContextCompat */
    static class C0602b {
        /* renamed from: a */
        static File[] m3304a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m3305b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m3306c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.b$c */
    /* compiled from: ContextCompat */
    static class C0603c {
        /* renamed from: a */
        static File m3307a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m3308b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m3309c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.b$d */
    /* compiled from: ContextCompat */
    static class C0604d {
        /* renamed from: a */
        static int m3310a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static ColorStateList m3311b(Context context, int i) {
            return context.getColorStateList(i);
        }

        /* renamed from: c */
        static <T> T m3312c(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: d */
        static String m3313d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.b$e */
    /* compiled from: ContextCompat */
    static class C0605e {
        /* renamed from: a */
        static Context m3314a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m3315b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m3316c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: androidx.core.content.b$f */
    /* compiled from: ContextCompat */
    static class C0606f {
        /* renamed from: a */
        static ComponentName m3317a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: androidx.core.content.b$g */
    /* compiled from: ContextCompat */
    static class C0607g {
        /* renamed from: a */
        static Executor m3318a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: a */
    public static int m3289a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static Context m3290b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0605e.m3314a(context);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File m3291c(java.io.File r4) {
        /*
            java.lang.Object r0 = f3164b
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x002b
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0011:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r2.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r3 = r4.getPath()     // Catch:{ all -> 0x002d }
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002d }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.C0600b.m3291c(java.io.File):java.io.File");
    }

    /* renamed from: d */
    public static int m3292d(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0604d.m3310a(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: e */
    public static ColorStateList m3293e(Context context, int i) {
        return C1523f.m7885d(context.getResources(), i, context.getTheme());
    }

    /* renamed from: f */
    public static Drawable m3294f(Context context, int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return C0603c.m3308b(context, i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f3163a) {
            if (f3165c == null) {
                f3165c = new TypedValue();
            }
            context.getResources().getValue(i, f3165c, true);
            i2 = f3165c.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: g */
    public static File[] m3295g(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0602b.m3304a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: h */
    public static File[] m3296h(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0602b.m3305b(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: i */
    public static Executor m3297i(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0607g.m3318a(context);
        }
        return C5424d.m24377a(new Handler(context.getMainLooper()));
    }

    /* renamed from: j */
    public static File m3298j(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0603c.m3309c(context);
        }
        return m3291c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: k */
    public static boolean m3299k(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0601a.m3302a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: l */
    public static void m3300l(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0601a.m3303b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: m */
    public static void m3301m(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0606f.m3317a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
