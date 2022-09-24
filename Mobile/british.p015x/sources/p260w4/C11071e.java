package p260w4;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7236e;

/* renamed from: w4.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C11071e extends C11068b {

    /* renamed from: b */
    private final C7236e<Status> f50016b;

    public C11071e(C7236e<Status> eVar) {
        this.f50016b = eVar;
    }

    /* renamed from: M2 */
    public final void mo43349M2(int i) throws RemoteException {
        this.f50016b.mo29842a(new Status(i));
    }
}
