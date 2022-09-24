package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.v1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9386v1 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ String f45500f;

    /* renamed from: g */
    final /* synthetic */ C9372u2 f45501g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9386v1(C9372u2 u2Var, String str) {
        super(u2Var, true);
        this.f45501g = u2Var;
        this.f45500f = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45501g.f45490i)).endAdUnitExposure(this.f45500f, this.f45116c);
    }
}
