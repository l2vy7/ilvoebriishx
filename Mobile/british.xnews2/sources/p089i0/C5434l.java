package p089i0;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: i0.l */
/* compiled from: UserManagerCompat */
public class C5434l {
    /* renamed from: a */
    public static boolean m24390a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
