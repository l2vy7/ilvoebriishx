package p001a0;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: a0.e */
/* compiled from: AppOpsManagerCompat */
public final class C0021e {
    /* renamed from: a */
    public static int m49a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    /* renamed from: b */
    public static String m50b(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
