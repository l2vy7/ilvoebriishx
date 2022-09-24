package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9371u1 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ String f45479f;

    /* renamed from: g */
    final /* synthetic */ C9372u2 f45480g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9371u1(C9372u2 u2Var, String str) {
        super(u2Var, true);
        this.f45480g = u2Var;
        this.f45479f = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45480g.f45490i)).beginAdUnitExposure(this.f45479f, this.f45116c);
    }
}
