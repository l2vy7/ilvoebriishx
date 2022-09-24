package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7191a.C7193b;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7320v<A extends C7191a.C7193b, L> {

    /* renamed from: a */
    private final C7259j.C7260a<L> f29157a;

    protected C7320v(C7259j.C7260a<L> aVar) {
        this.f29157a = aVar;
    }

    /* renamed from: a */
    public C7259j.C7260a<L> mo29948a() {
        return this.f29157a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo29856b(A a, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
