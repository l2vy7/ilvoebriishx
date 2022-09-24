package p210g5;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: g5.c */
final class C10558c implements Callable<Boolean> {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f49107a;

    /* renamed from: b */
    private final /* synthetic */ String f49108b;

    /* renamed from: c */
    private final /* synthetic */ Boolean f49109c;

    C10558c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f49107a = sharedPreferences;
        this.f49108b = str;
        this.f49109c = bool;
    }

    public final /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf(this.f49107a.getBoolean(this.f49108b, this.f49109c.booleanValue()));
    }
}
