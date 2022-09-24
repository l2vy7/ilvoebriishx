package p244q4;

import com.google.android.gms.common.api.internal.C7291p;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: q4.v */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final /* synthetic */ class C10952v implements C7291p {

    /* renamed from: a */
    private final C10921a0 f49904a;

    /* renamed from: b */
    private final String[] f49905b;

    C10952v(C10921a0 a0Var, String[] strArr) {
        this.f49904a = a0Var;
        this.f49905b = strArr;
    }

    public final void accept(Object obj, Object obj2) {
        C10921a0 a0Var = this.f49904a;
        String[] strArr = this.f49905b;
        ((C10934h) ((C10923b0) obj).getService()).mo43222p6(new C10956z(a0Var, (TaskCompletionSource) obj2), strArr);
    }
}
