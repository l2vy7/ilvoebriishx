package p108l4;

import com.google.android.gms.common.api.internal.C7291p;
import com.google.android.gms.tasks.TaskCompletionSource;
import p243q4.C10928e;
import p243q4.C10941k0;

/* renamed from: l4.n */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final /* synthetic */ class C10692n implements C7291p {

    /* renamed from: a */
    private final C5675h0 f49313a;

    C10692n(C5675h0 h0Var) {
        this.f49313a = h0Var;
    }

    public final void accept(Object obj, Object obj2) {
        C10941k0 k0Var = (C10941k0) obj;
        ((C10928e) k0Var.getService()).mo43213s6(this.f49313a.f24261a);
        ((C10928e) k0Var.getService()).zzp();
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
