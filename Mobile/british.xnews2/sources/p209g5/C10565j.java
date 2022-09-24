package p209g5;

import android.content.Context;
import android.content.SharedPreferences;
import p238o5.C10856d;

/* renamed from: g5.j */
public final class C10565j {

    /* renamed from: a */
    private static SharedPreferences f49119a;

    /* renamed from: a */
    public static SharedPreferences m48313a(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f49119a == null) {
                f49119a = (SharedPreferences) C10856d.m48866a(new C10566k(context));
            }
            sharedPreferences = f49119a;
        }
        return sharedPreferences;
    }
}
