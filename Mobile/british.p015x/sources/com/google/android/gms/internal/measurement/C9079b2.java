package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.b2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9079b2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ C9078b1 f44899f;

    /* renamed from: g */
    final /* synthetic */ C9372u2 f44900g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9079b2(C9372u2 u2Var, C9078b1 b1Var) {
        super(u2Var, true);
        this.f44900g = u2Var;
        this.f44899f = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f44900g.f45490i)).getCurrentScreenClass(this.f44899f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37306b() {
        this.f44899f.mo37383e((Bundle) null);
    }
}
