package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.measurement.r2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9324r2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ Activity f45411f;

    /* renamed from: g */
    final /* synthetic */ C9078b1 f45412g;

    /* renamed from: h */
    final /* synthetic */ C9356t2 f45413h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9324r2(C9356t2 t2Var, Activity activity, C9078b1 b1Var) {
        super(t2Var.f45457b, true);
        this.f45413h = t2Var;
        this.f45411f = activity;
        this.f45412g = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45413h.f45457b.f45490i)).onActivitySaveInstanceState(C10489b.m48195m6(this.f45411f), this.f45412g, this.f45116c);
    }
}
