package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7285o;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.e2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7238e2 extends C7280n {

    /* renamed from: e */
    final /* synthetic */ C7285o.C7286a f29001e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7238e2(C7285o.C7286a aVar, C7259j jVar, Feature[] featureArr, boolean z, int i) {
        super(jVar, featureArr, z, i);
        this.f29001e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo29853d(C7191a.C7193b bVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.f29001e.f29079a.accept(bVar, taskCompletionSource);
    }
}
