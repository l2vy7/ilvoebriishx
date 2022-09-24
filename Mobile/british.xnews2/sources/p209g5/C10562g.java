package p209g5;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: g5.g */
final class C10562g implements Callable<Long> {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f49113a;

    /* renamed from: b */
    private final /* synthetic */ String f49114b;

    /* renamed from: c */
    private final /* synthetic */ Long f49115c;

    C10562g(SharedPreferences sharedPreferences, String str, Long l) {
        this.f49113a = sharedPreferences;
        this.f49114b = str;
        this.f49115c = l;
    }

    public final /* synthetic */ Object call() throws Exception {
        return Long.valueOf(this.f49113a.getLong(this.f49114b, this.f49115c.longValue()));
    }
}
