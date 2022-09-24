package p230l6;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;

/* renamed from: l6.a */
/* compiled from: AnimatorDurationScaleProvider */
public class C10724a {

    /* renamed from: a */
    private static float f49348a = 1.0f;

    /* renamed from: a */
    public float mo42876a(ContentResolver contentResolver) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        if (i == 16) {
            return Settings.System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        return f49348a;
    }
}
