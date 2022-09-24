package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7191a.C7193b;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7231d<R extends C7341k, A extends C7191a.C7193b> extends BasePendingResult<R> implements C7236e<R> {

    /* renamed from: r */
    private final C7191a.C7194c<A> f28993r;

    /* renamed from: s */
    private final C7191a<?> f28994s;

    protected C7231d(C7191a<?> aVar, C7206f fVar) {
        super((C7206f) C4604n.m20099l(fVar, "GoogleApiClient must not be null"));
        C4604n.m20099l(aVar, "Api must not be null");
        this.f28993r = aVar.mo29742b();
        this.f28994s = aVar;
    }

    /* renamed from: v */
    private void m29634v(RemoteException remoteException) {
        mo29848w(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo29842a(Object obj) {
        super.mo29791i((C7341k) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo29843q(A a) throws RemoteException;

    /* renamed from: r */
    public final C7191a<?> mo29844r() {
        return this.f28994s;
    }

    /* renamed from: s */
    public final C7191a.C7194c<A> mo29845s() {
        return this.f28993r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo29846t(R r) {
    }

    /* renamed from: u */
    public final void mo29847u(A a) throws DeadObjectException {
        try {
            mo29843q(a);
        } catch (DeadObjectException e) {
            m29634v(e);
            throw e;
        } catch (RemoteException e2) {
            m29634v(e2);
        }
    }

    /* renamed from: w */
    public final void mo29848w(Status status) {
        C4604n.m20089b(!status.mo29735G0(), "Failed result must not be success");
        C7341k e = mo29539e(status);
        mo29791i(e);
        mo29846t(e);
    }
}
