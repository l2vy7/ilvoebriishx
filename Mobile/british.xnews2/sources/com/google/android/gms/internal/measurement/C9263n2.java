package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9263n2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ Activity f45298f;

    /* renamed from: g */
    final /* synthetic */ C9356t2 f45299g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9263n2(C9356t2 t2Var, Activity activity) {
        super(t2Var.f45457b, true);
        this.f45299g = t2Var;
        this.f45298f = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45299g.f45457b.f45490i)).onActivityResumed(C10489b.m48195m6(this.f45298f), this.f45116c);
    }
}
