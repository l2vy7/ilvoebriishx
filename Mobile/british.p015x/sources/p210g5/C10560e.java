package p210g5;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: g5.e */
final class C10560e implements Callable<Integer> {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f49110a;

    /* renamed from: b */
    private final /* synthetic */ String f49111b;

    /* renamed from: c */
    private final /* synthetic */ Integer f49112c;

    C10560e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f49110a = sharedPreferences;
        this.f49111b = str;
        this.f49112c = num;
    }

    public final /* synthetic */ Object call() throws Exception {
        return Integer.valueOf(this.f49110a.getInt(this.f49111b, this.f49112c.intValue()));
    }
}
