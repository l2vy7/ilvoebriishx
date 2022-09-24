package p210g5;

import android.content.SharedPreferences;
import android.util.Log;
import p239o5.C10856d;

/* renamed from: g5.h */
public final class C10563h extends C10556a<String> {
    /* renamed from: a */
    public static String m48312a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) C10856d.m48866a(new C10564i(sharedPreferences, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
