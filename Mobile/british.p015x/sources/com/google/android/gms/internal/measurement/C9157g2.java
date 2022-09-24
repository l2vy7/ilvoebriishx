package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.g2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9157g2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ String f45040f;

    /* renamed from: g */
    final /* synthetic */ C9078b1 f45041g;

    /* renamed from: h */
    final /* synthetic */ C9372u2 f45042h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9157g2(C9372u2 u2Var, String str, C9078b1 b1Var) {
        super(u2Var, true);
        this.f45042h = u2Var;
        this.f45040f = str;
        this.f45041g = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45042h.f45490i)).getMaxUserProperties(this.f45040f, this.f45041g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37306b() {
        this.f45041g.mo37383e((Bundle) null);
    }
}
