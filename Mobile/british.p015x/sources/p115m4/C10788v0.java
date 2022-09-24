package p115m4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: m4.v0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final /* synthetic */ class C10788v0 implements OnCompleteListener {

    /* renamed from: a */
    private final C10792x0 f49523a;

    C10788v0(C10792x0 x0Var) {
        this.f49523a = x0Var;
    }

    public final void onComplete(Task task) {
        C5759d.m25477A(this.f49523a.f49525b, "joinApplication", task);
    }
}
