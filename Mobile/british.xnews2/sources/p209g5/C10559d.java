package p209g5;

import android.content.SharedPreferences;
import android.util.Log;
import p238o5.C10856d;

/* renamed from: g5.d */
public final class C10559d extends C10556a<Integer> {
    /* renamed from: a */
    public static Integer m48310a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) C10856d.m48866a(new C10560e(sharedPreferences, str, num));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
