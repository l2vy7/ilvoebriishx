package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.y1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9432y1 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ C9078b1 f45528f;

    /* renamed from: g */
    final /* synthetic */ C9372u2 f45529g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9432y1(C9372u2 u2Var, C9078b1 b1Var) {
        super(u2Var, true);
        this.f45529g = u2Var;
        this.f45528f = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45529g.f45490i)).getCachedAppInstanceId(this.f45528f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37306b() {
        this.f45528f.mo37383e((Bundle) null);
    }
}
