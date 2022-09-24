package p218i5;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* renamed from: i5.r */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C10603r implements AppSetIdClient {

    /* renamed from: a */
    private final AppSetIdClient f49151a;

    /* renamed from: b */
    private final AppSetIdClient f49152b;

    public C10603r(Context context) {
        this.f49151a = new C10601p(context, C7353b.m29920h());
        this.f49152b = C10597l.m48339c(context);
    }

    /* renamed from: a */
    public static /* synthetic */ Task m48346a(C10603r rVar, Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return task;
        }
        Exception exception = task.getException();
        if (!(exception instanceof C7203b)) {
            return task;
        }
        int b = ((C7203b) exception).mo29766b();
        if (b == 43001 || b == 43002 || b == 43003 || b == 17) {
            return rVar.f49152b.getAppSetIdInfo();
        }
        if (b == 43000) {
            return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
        }
        if (b != 15) {
            return task;
        }
        return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        return this.f49151a.getAppSetIdInfo().continueWithTask(new C10602q(this));
    }
}
