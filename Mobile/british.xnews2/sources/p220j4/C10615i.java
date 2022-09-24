package p220j4;

import android.os.RemoteException;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;

/* renamed from: j4.i */
final class C10615i extends C10617k<Status> {
    C10615i(C7206f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ C7341k mo29539e(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final /* synthetic */ void mo29843q(C7191a.C7193b bVar) throws RemoteException {
        C10613g gVar = (C10613g) bVar;
        ((C10623q) gVar.getService()).mo42741s3(new C10616j(this), gVar.mo42734e());
    }
}
