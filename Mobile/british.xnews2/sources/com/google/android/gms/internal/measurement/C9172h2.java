package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.h2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9172h2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ boolean f45066f;

    /* renamed from: g */
    final /* synthetic */ C9372u2 f45067g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9172h2(C9372u2 u2Var, boolean z) {
        super(u2Var, true);
        this.f45067g = u2Var;
        this.f45066f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45067g.f45490i)).setDataCollectionEnabled(this.f45066f);
    }
}
