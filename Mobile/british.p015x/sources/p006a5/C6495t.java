package p006a5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C4599e;
import p193c5.C6520c;

/* renamed from: a5.t */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C6495t {
    /* renamed from: a */
    public static boolean m28292a(Context context, int i) {
        if (!m28293b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C4599e.m20051a(context).mo17971b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m28293b(Context context, int i, String str) {
        return C6520c.m28321a(context).mo24357h(i, str);
    }
}
