package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.z2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7339z2 {

    /* renamed from: a */
    public final int f29206a;

    public C7339z2(int i) {
        this.f29206a = i;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ Status m29905e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo29920a(Status status);

    /* renamed from: b */
    public abstract void mo29921b(Exception exc);

    /* renamed from: c */
    public abstract void mo29922c(C4596m1<?> m1Var) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo29949d(C7336z zVar, boolean z);
}
