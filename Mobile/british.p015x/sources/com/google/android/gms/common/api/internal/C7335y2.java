package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.y2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7335y2 extends C7303r2<Boolean> {

    /* renamed from: c */
    public final C7259j.C7260a<?> f29201c;

    public C7335y2(C7259j.C7260a<?> aVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f29201c = aVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo29949d(C7336z zVar, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo29944f(C4596m1<?> m1Var) {
        C7229c2 c2Var = m1Var.mo17959u().get(this.f29201c);
        return c2Var != null && c2Var.f28985a.mo29905f();
    }

    /* renamed from: g */
    public final Feature[] mo29945g(C4596m1<?> m1Var) {
        C7229c2 c2Var = m1Var.mo17959u().get(this.f29201c);
        if (c2Var == null) {
            return null;
        }
        return c2Var.f28985a.mo29903c();
    }

    /* renamed from: h */
    public final void mo29923h(C4596m1<?> m1Var) throws RemoteException {
        C7229c2 remove = m1Var.mo17959u().remove(this.f29201c);
        if (remove != null) {
            remove.f28986b.mo29856b(m1Var.mo17958s(), this.f29102b);
            remove.f28985a.mo29901a();
            return;
        }
        this.f29102b.trySetResult(Boolean.FALSE);
    }
}
