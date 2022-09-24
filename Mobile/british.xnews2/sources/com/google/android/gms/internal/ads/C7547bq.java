package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7377d;

/* renamed from: com.google.android.gms.internal.ads.bq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7547bq implements C7377d.C7379b {

    /* renamed from: b */
    final /* synthetic */ uo0 f30069b;

    /* renamed from: c */
    final /* synthetic */ C7583cq f30070c;

    C7547bq(C7583cq cqVar, uo0 uo0) {
        this.f30070c = cqVar;
        this.f30069b = uo0;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.f30070c.f30459d) {
            this.f30069b.zze(new RuntimeException("Connection failed."));
        }
    }
}
