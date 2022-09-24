package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.r2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class C7303r2<T> extends C7317u1 {

    /* renamed from: b */
    protected final TaskCompletionSource<T> f29102b;

    public C7303r2(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.f29102b = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo29920a(Status status) {
        this.f29102b.trySetException(new C7203b(status));
    }

    /* renamed from: b */
    public final void mo29921b(Exception exc) {
        this.f29102b.trySetException(exc);
    }

    /* renamed from: c */
    public final void mo29922c(C4596m1<?> m1Var) throws DeadObjectException {
        try {
            mo29923h(m1Var);
        } catch (DeadObjectException e) {
            mo29920a(C7339z2.m29905e(e));
            throw e;
        } catch (RemoteException e2) {
            mo29920a(C7339z2.m29905e(e2));
        } catch (RuntimeException e3) {
            this.f29102b.trySetException(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo29923h(C4596m1<?> m1Var) throws RemoteException;
}
