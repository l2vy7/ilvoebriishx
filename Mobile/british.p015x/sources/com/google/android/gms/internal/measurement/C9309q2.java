package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.measurement.q2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9309q2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ Activity f45385f;

    /* renamed from: g */
    final /* synthetic */ C9356t2 f45386g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9309q2(C9356t2 t2Var, Activity activity) {
        super(t2Var.f45457b, true);
        this.f45386g = t2Var;
        this.f45385f = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45386g.f45457b.f45490i)).onActivityStopped(C10489b.m48195m6(this.f45385f), this.f45116c);
    }
}
