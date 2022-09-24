package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import p001a0.C0021e;

/* renamed from: androidx.core.content.c */
/* compiled from: PermissionChecker */
public final class C0608c {
    /* renamed from: a */
    public static int m3319a(Context context, String str) {
        return m3320b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    /* renamed from: b */
    public static int m3320b(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String b = C0021e.m50b(str);
        if (b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (C0021e.m49a(context, b, str2) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m3321c(Context context, String str) {
        return m3320b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
