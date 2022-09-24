package p089i0;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: i0.c */
/* compiled from: ConfigurationCompat */
public final class C5423c {
    /* renamed from: a */
    public static C5428f m24376a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C5428f.m24382d(configuration.getLocales());
        }
        return C5428f.m24380a(configuration.locale);
    }
}
