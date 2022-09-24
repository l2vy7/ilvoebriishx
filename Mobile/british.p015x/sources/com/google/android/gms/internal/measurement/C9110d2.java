package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.measurement.d2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9110d2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ String f44948f;

    /* renamed from: g */
    final /* synthetic */ Object f44949g;

    /* renamed from: h */
    final /* synthetic */ C9372u2 f44950h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9110d2(C9372u2 u2Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(u2Var, false);
        this.f44950h = u2Var;
        this.f44948f = str;
        this.f44949g = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f44950h.f45490i)).logHealthData(5, this.f44948f, C10489b.m48195m6(this.f44949g), C10489b.m48195m6(null), C10489b.m48195m6(null));
    }
}
