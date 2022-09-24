package p243q4;

import com.google.android.gms.common.api.internal.C7291p;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: q4.u */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final /* synthetic */ class C10951u implements C7291p {

    /* renamed from: a */
    private final C10921a0 f49902a;

    /* renamed from: b */
    private final String[] f49903b;

    C10951u(C10921a0 a0Var, String[] strArr) {
        this.f49902a = a0Var;
        this.f49903b = strArr;
    }

    public final void accept(Object obj, Object obj2) {
        C10921a0 a0Var = this.f49902a;
        String[] strArr = this.f49903b;
        ((C10934h) ((C10923b0) obj).getService()).mo43221o6(new C10955y(a0Var, (TaskCompletionSource) obj2), strArr);
    }
}
