package p108l4;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7315u;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: l4.t0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C10705t0 extends C10707u0 {

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f49328b;

    /* renamed from: c */
    final /* synthetic */ C10673e f49329c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10705t0(C10673e eVar, TaskCompletionSource taskCompletionSource) {
        super((C10703s0) null);
        this.f49329c = eVar;
        this.f49328b = taskCompletionSource;
    }

    /* renamed from: s */
    public final void mo36421s(int i) throws RemoteException {
        this.f49329c.f49271a.mo43190a("onError: %d", Integer.valueOf(i));
        C10673e.m48494i(this.f49329c);
        C7315u.m29815a(Status.f28884i, this.f49328b);
    }

    public final void zzf() throws RemoteException {
        this.f49329c.f49271a.mo43190a("onDisconnected", new Object[0]);
        C10673e.m48494i(this.f49329c);
        C7315u.m29815a(Status.f28882g, this.f49328b);
    }
}
