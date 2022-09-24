package p251s5;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7310t;
import com.google.android.gms.tasks.TaskCompletionSource;
import p132p5.C5905g;

/* renamed from: s5.p */
final class C10985p extends C7310t<C5905g, Location> {
    C10985p(C10971b bVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ void mo29906b(C7191a.C7193b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((C5905g) bVar).mo22892f());
    }
}
