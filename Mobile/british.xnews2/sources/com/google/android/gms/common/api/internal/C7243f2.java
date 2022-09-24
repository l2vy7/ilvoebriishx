package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.common.api.internal.C7285o;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.f2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7243f2 extends C7320v {

    /* renamed from: b */
    final /* synthetic */ C7285o.C7286a f29007b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7243f2(C7285o.C7286a aVar, C7259j.C7260a aVar2) {
        super(aVar2);
        this.f29007b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29856b(C7191a.C7193b bVar, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        this.f29007b.f29080b.accept(bVar, taskCompletionSource);
    }
}
