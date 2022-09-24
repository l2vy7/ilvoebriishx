package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.p1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9293p1 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ String f45357f;

    /* renamed from: g */
    final /* synthetic */ String f45358g;

    /* renamed from: h */
    final /* synthetic */ Bundle f45359h;

    /* renamed from: i */
    final /* synthetic */ C9372u2 f45360i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9293p1(C9372u2 u2Var, String str, String str2, Bundle bundle) {
        super(u2Var, true);
        this.f45360i = u2Var;
        this.f45357f = str;
        this.f45358g = str2;
        this.f45359h = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45360i.f45490i)).clearConditionalUserProperty(this.f45357f, this.f45358g, this.f45359h);
    }
}
