package p190b5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p232m5.C10801e;

/* renamed from: b5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C6508a implements Executor {

    /* renamed from: b */
    private final Handler f26583b;

    public C6508a(Looper looper) {
        this.f26583b = new C10801e(looper);
    }

    public final void execute(Runnable runnable) {
        this.f26583b.post(runnable);
    }
}
