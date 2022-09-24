package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.x2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7331x2<ResultT> extends C7317u1 {

    /* renamed from: b */
    private final C7310t<C7191a.C7193b, ResultT> f29191b;

    /* renamed from: c */
    private final TaskCompletionSource<ResultT> f29192c;

    /* renamed from: d */
    private final C7301r f29193d;

    public C7331x2(int i, C7310t<C7191a.C7193b, ResultT> tVar, TaskCompletionSource<ResultT> taskCompletionSource, C7301r rVar) {
        super(i);
        this.f29192c = taskCompletionSource;
        this.f29191b = tVar;
        this.f29193d = rVar;
        if (i == 2 && tVar.mo29934c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo29920a(Status status) {
        this.f29192c.trySetException(this.f29193d.mo29806a(status));
    }

    /* renamed from: b */
    public final void mo29921b(Exception exc) {
        this.f29192c.trySetException(exc);
    }

    /* renamed from: c */
    public final void mo29922c(C4596m1<?> m1Var) throws DeadObjectException {
        try {
            this.f29191b.mo29906b(m1Var.mo17958s(), this.f29192c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo29920a(C7339z2.m29905e(e2));
        } catch (RuntimeException e3) {
            this.f29192c.trySetException(e3);
        }
    }

    /* renamed from: d */
    public final void mo29949d(C7336z zVar, boolean z) {
        zVar.mo29954d(this.f29192c, z);
    }

    /* renamed from: f */
    public final boolean mo29944f(C4596m1<?> m1Var) {
        return this.f29191b.mo29934c();
    }

    /* renamed from: g */
    public final Feature[] mo29945g(C4596m1<?> m1Var) {
        return this.f29191b.mo29936e();
    }
}
