package p210g5;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: g5.i */
final class C10564i implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f49116a;

    /* renamed from: b */
    private final /* synthetic */ String f49117b;

    /* renamed from: c */
    private final /* synthetic */ String f49118c;

    C10564i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f49116a = sharedPreferences;
        this.f49117b = str;
        this.f49118c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f49116a.getString(this.f49117b, this.f49118c);
    }
}
