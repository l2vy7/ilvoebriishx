package p100k0;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: k0.f */
/* compiled from: TextUtilsCompat */
public final class C5550f {

    /* renamed from: a */
    private static final Locale f24076a = new Locale("", "");

    /* renamed from: a */
    private static int m24740a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m24741b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f24076a)) {
            return 0;
        }
        String c = C5538b.m24717c(locale);
        if (c == null) {
            return m24740a(locale);
        }
        return (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
