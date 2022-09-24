package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7310t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.n2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7283n2 extends C7310t {

    /* renamed from: d */
    final /* synthetic */ C7310t.C7311a f29075d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7283n2(C7310t.C7311a aVar, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f29075d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29906b(C7191a.C7193b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f29075d.f29141a.accept(bVar, taskCompletionSource);
    }
}
