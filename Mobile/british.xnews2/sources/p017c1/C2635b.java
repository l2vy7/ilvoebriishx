package p017c1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: c1.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2635b implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Handler f10389b;

    public /* synthetic */ C2635b(Handler handler) {
        this.f10389b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f10389b.post(runnable);
    }
}
