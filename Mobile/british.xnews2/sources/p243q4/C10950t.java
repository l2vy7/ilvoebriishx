package p243q4;

import com.google.android.gms.common.api.internal.C7291p;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: q4.t */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final /* synthetic */ class C10950t implements C7291p {

    /* renamed from: a */
    private final C10921a0 f49900a;

    /* renamed from: b */
    private final String[] f49901b;

    C10950t(C10921a0 a0Var, String[] strArr) {
        this.f49900a = a0Var;
        this.f49901b = strArr;
    }

    public final void accept(Object obj, Object obj2) {
        C10921a0 a0Var = this.f49900a;
        String[] strArr = this.f49901b;
        ((C10934h) ((C10923b0) obj).getService()).mo43220n6(new C10954x(a0Var, (TaskCompletionSource) obj2), strArr);
    }
}
