package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.clearcut.b */
public class C8854b {

    /* renamed from: a */
    private static volatile UserManager f44393a;

    /* renamed from: b */
    private static volatile boolean f44394b = (!m41533b());

    private C8854b() {
    }

    /* renamed from: a */
    public static boolean m41532a(Context context) {
        return m41533b() && !m41534c(context);
    }

    /* renamed from: b */
    private static boolean m41533b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @TargetApi(24)
    /* renamed from: c */
    private static boolean m41534c(Context context) {
        boolean z = f44394b;
        if (!z) {
            UserManager userManager = f44393a;
            if (userManager == null) {
                synchronized (C8854b.class) {
                    userManager = f44393a;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        f44393a = userManager2;
                        if (userManager2 == null) {
                            f44394b = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                }
            }
            z = userManager.isUserUnlocked();
            f44394b = z;
            if (z) {
                f44393a = null;
            }
        }
        return z;
    }
}
