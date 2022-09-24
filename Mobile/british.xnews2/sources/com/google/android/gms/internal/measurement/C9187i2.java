package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.internal.measurement.i2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9187i2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ Long f45077f;

    /* renamed from: g */
    final /* synthetic */ String f45078g;

    /* renamed from: h */
    final /* synthetic */ String f45079h;

    /* renamed from: i */
    final /* synthetic */ Bundle f45080i;

    /* renamed from: j */
    final /* synthetic */ boolean f45081j;

    /* renamed from: k */
    final /* synthetic */ boolean f45082k;

    /* renamed from: l */
    final /* synthetic */ C9372u2 f45083l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9187i2(C9372u2 u2Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(u2Var, true);
        this.f45083l = u2Var;
        this.f45077f = l;
        this.f45078g = str;
        this.f45079h = str2;
        this.f45080i = bundle;
        this.f45081j = z;
        this.f45082k = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        long j;
        Long l = this.f45077f;
        if (l == null) {
            j = this.f45115b;
        } else {
            j = l.longValue();
        }
        ((C9140f1) C4604n.m20098k(this.f45083l.f45490i)).logEvent(this.f45078g, this.f45079h, this.f45080i, this.f45081j, this.f45082k, j);
    }
}
