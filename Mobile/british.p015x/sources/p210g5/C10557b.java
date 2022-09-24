package p210g5;

import android.content.SharedPreferences;
import android.util.Log;
import p239o5.C10856d;

/* renamed from: g5.b */
public final class C10557b extends C10556a<Boolean> {
    /* renamed from: a */
    public static Boolean m48309a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) C10856d.m48866a(new C10558c(sharedPreferences, str, bool));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
