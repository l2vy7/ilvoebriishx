package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.c2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9094c2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ String f44917f;

    /* renamed from: g */
    final /* synthetic */ String f44918g;

    /* renamed from: h */
    final /* synthetic */ boolean f44919h;

    /* renamed from: i */
    final /* synthetic */ C9078b1 f44920i;

    /* renamed from: j */
    final /* synthetic */ C9372u2 f44921j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9094c2(C9372u2 u2Var, String str, String str2, boolean z, C9078b1 b1Var) {
        super(u2Var, true);
        this.f44921j = u2Var;
        this.f44917f = str;
        this.f44918g = str2;
        this.f44919h = z;
        this.f44920i = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f44921j.f45490i)).getUserProperties(this.f44917f, this.f44918g, this.f44919h, this.f44920i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37306b() {
        this.f44920i.mo37383e((Bundle) null);
    }
}
