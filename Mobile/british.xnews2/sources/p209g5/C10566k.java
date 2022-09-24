package p209g5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: g5.k */
final class C10566k implements Callable<SharedPreferences> {

    /* renamed from: a */
    private final /* synthetic */ Context f49120a;

    C10566k(Context context) {
        this.f49120a = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f49120a.getSharedPreferences("google_sdk_flags", 0);
    }
}
