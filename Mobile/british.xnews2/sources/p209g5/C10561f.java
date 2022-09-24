package p209g5;

import android.content.SharedPreferences;
import android.util.Log;
import p238o5.C10856d;

/* renamed from: g5.f */
public final class C10561f extends C10556a<Long> {
    /* renamed from: a */
    public static Long m48311a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) C10856d.m48866a(new C10562g(sharedPreferences, str, l));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return l;
        }
    }
}
