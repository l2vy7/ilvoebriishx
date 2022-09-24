package p001a0;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: a0.b */
/* compiled from: ActivityManagerCompat */
public final class C0014b {
    /* renamed from: a */
    public static boolean m39a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
