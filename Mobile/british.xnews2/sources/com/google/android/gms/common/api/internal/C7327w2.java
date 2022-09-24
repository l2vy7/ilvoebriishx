package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.w2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7327w2 extends C7303r2<Void> {

    /* renamed from: c */
    public final C7229c2 f29179c;

    public C7327w2(C7229c2 c2Var, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f29179c = c2Var;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo29949d(C7336z zVar, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo29944f(C4596m1<?> m1Var) {
        return this.f29179c.f28985a.mo29905f();
    }

    /* renamed from: g */
    public final Feature[] mo29945g(C4596m1<?> m1Var) {
        return this.f29179c.f28985a.mo29903c();
    }

    /* renamed from: h */
    public final void mo29923h(C4596m1<?> m1Var) throws RemoteException {
        this.f29179c.f28985a.mo29853d(m1Var.mo17958s(), this.f29102b);
        C7259j.C7260a<?> b = this.f29179c.f28985a.mo29902b();
        if (b != null) {
            m1Var.mo17959u().put(b, this.f29179c);
        }
    }
}
