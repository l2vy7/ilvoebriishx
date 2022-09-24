package p006a5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: a5.g */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C6485g {

    /* renamed from: a */
    private static final String[] f26567a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: a */
    public static boolean m28260a(Context context, Throwable th) {
        try {
            C4604n.m20098k(context);
            C4604n.m20098k(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
