package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9126e2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ Bundle f45000f;

    /* renamed from: g */
    final /* synthetic */ C9078b1 f45001g;

    /* renamed from: h */
    final /* synthetic */ C9372u2 f45002h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9126e2(C9372u2 u2Var, Bundle bundle, C9078b1 b1Var) {
        super(u2Var, true);
        this.f45002h = u2Var;
        this.f45000f = bundle;
        this.f45001g = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45002h.f45490i)).performAction(this.f45000f, this.f45001g, this.f45115b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37306b() {
        this.f45001g.mo37383e((Bundle) null);
    }
}
