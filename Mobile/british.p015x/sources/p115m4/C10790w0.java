package p115m4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: m4.w0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final /* synthetic */ class C10790w0 implements OnCompleteListener {

    /* renamed from: a */
    private final C10792x0 f49524a;

    C10790w0(C10792x0 x0Var) {
        this.f49524a = x0Var;
    }

    public final void onComplete(Task task) {
        C5759d.m25477A(this.f49524a.f49525b, "launchApplication", task);
    }
}
