package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9339s1 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ Bundle f45438f;

    /* renamed from: g */
    final /* synthetic */ C9372u2 f45439g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9339s1(C9372u2 u2Var, Bundle bundle) {
        super(u2Var, true);
        this.f45439g = u2Var;
        this.f45438f = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45439g.f45490i)).setConsent(this.f45438f, this.f45115b);
    }
}
