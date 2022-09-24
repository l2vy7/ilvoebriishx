package p256u5;

import com.google.android.gms.internal.measurement.C9352se;
import com.google.android.gms.measurement.internal.C9726b4;
import com.google.android.gms.measurement.internal.C9953x3;
import java.util.concurrent.Callable;

/* renamed from: u5.k */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final /* synthetic */ class C11036k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C9726b4 f49995a;

    /* renamed from: b */
    public final /* synthetic */ String f49996b;

    public /* synthetic */ C11036k(C9726b4 b4Var, String str) {
        this.f49995a = b4Var;
        this.f49996b = str;
    }

    public final Object call() {
        return new C9352se("internal.appMetadata", new C9953x3(this.f49995a, this.f49996b));
    }
}
