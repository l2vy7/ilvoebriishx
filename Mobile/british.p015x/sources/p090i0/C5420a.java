package p090i0;

import android.os.Build;

/* renamed from: i0.a */
/* compiled from: BuildCompat */
public class C5420a {
    /* renamed from: a */
    protected static boolean m24367a(String str, String str2) {
        if (!"REL".equals(str2) && str2.compareTo(str) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m24368b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m24369c() {
        return Build.VERSION.SDK_INT >= 31 || m24367a("S", Build.VERSION.CODENAME);
    }
}
