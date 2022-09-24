package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9308q1 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ String f45381f;

    /* renamed from: g */
    final /* synthetic */ String f45382g;

    /* renamed from: h */
    final /* synthetic */ C9078b1 f45383h;

    /* renamed from: i */
    final /* synthetic */ C9372u2 f45384i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9308q1(C9372u2 u2Var, String str, String str2, C9078b1 b1Var) {
        super(u2Var, true);
        this.f45384i = u2Var;
        this.f45381f = str;
        this.f45382g = str2;
        this.f45383h = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45384i.f45490i)).getConditionalUserProperties(this.f45381f, this.f45382g, this.f45383h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37306b() {
        this.f45383h.mo37383e((Bundle) null);
    }
}
