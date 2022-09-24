package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.measurement.j2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9202j2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ String f45095f;

    /* renamed from: g */
    final /* synthetic */ String f45096g;

    /* renamed from: h */
    final /* synthetic */ Object f45097h;

    /* renamed from: i */
    final /* synthetic */ boolean f45098i;

    /* renamed from: j */
    final /* synthetic */ C9372u2 f45099j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9202j2(C9372u2 u2Var, String str, String str2, Object obj, boolean z) {
        super(u2Var, true);
        this.f45099j = u2Var;
        this.f45095f = str;
        this.f45096g = str2;
        this.f45097h = obj;
        this.f45098i = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        ((C9140f1) C4604n.m20098k(this.f45099j.f45490i)).setUserProperty(this.f45095f, this.f45096g, C10489b.m48195m6(this.f45097h), this.f45098i, this.f45115b);
    }
}
