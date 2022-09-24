package p006a5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.C7355d;

/* renamed from: a5.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C6487i {

    /* renamed from: a */
    private static Boolean f26569a;

    /* renamed from: b */
    private static Boolean f26570b;

    /* renamed from: c */
    private static Boolean f26571c;

    /* renamed from: d */
    private static Boolean f26572d;

    /* renamed from: e */
    private static Boolean f26573e;

    /* renamed from: a */
    public static boolean m28263a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f26573e == null) {
            boolean z = false;
            if (C6492o.m28288k() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f26573e = Boolean.valueOf(z);
        }
        return f26573e.booleanValue();
    }

    /* renamed from: b */
    public static boolean m28264b(Context context) {
        if (f26571c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f26571c = Boolean.valueOf(z);
        }
        return f26571c.booleanValue();
    }

    @TargetApi(21)
    /* renamed from: c */
    public static boolean m28265c(Context context) {
        return m28269g(context);
    }

    /* renamed from: d */
    public static boolean m28266d() {
        int i = C7355d.f29215a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: e */
    public static boolean m28267e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f26569a == null) {
            boolean z = false;
            if (C6492o.m28284g() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f26569a = Boolean.valueOf(z);
        }
        return f26569a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: f */
    public static boolean m28268f(Context context) {
        if (m28267e(context)) {
            if (!C6492o.m28287j()) {
                return true;
            }
            if (!m28269g(context) || C6492o.m28288k()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: g */
    public static boolean m28269g(Context context) {
        if (f26570b == null) {
            boolean z = false;
            if (C6492o.m28285h() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f26570b = Boolean.valueOf(z);
        }
        return f26570b.booleanValue();
    }

    /* renamed from: h */
    public static boolean m28270h(Context context) {
        if (f26572d == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f26572d = Boolean.valueOf(z);
        }
        return f26572d.booleanValue();
    }
}
