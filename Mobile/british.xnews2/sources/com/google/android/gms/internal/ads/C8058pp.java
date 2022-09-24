package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7377d;

/* renamed from: com.google.android.gms.internal.ads.pp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8058pp implements C7377d.C7379b {

    /* renamed from: b */
    final /* synthetic */ C8094qp f37729b;

    C8058pp(C8094qp qpVar) {
        this.f37729b = qpVar;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.f37729b.f38217b) {
            this.f37729b.f38220e = null;
            if (this.f37729b.f38218c != null) {
                this.f37729b.f38218c = null;
            }
            this.f37729b.f38217b.notifyAll();
        }
    }
}
