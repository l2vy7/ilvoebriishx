package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.measurement.r1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9323r1 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ Activity f45407f;

    /* renamed from: g */
    final /* synthetic */ String f45408g;

    /* renamed from: h */
    final /* synthetic */ String f45409h;

    /* renamed from: i */
    final /* synthetic */ C9372u2 f45410i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9323r1(C9372u2 u2Var, Activity activity, String str, String str2) {
        super(u2Var, true);
        this.f45410i = u2Var;
        this.f45407f = activity;
        this.f45408g = str;
        this.f45409h = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45410i.f45490i)).setCurrentScreen(C10489b.m48195m6(this.f45407f), this.f45408g, this.f45409h, this.f45115b);
    }
}
