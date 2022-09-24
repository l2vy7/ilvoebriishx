package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C7377d;

/* renamed from: com.google.android.gms.internal.ads.op */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8023op implements C7377d.C7378a {

    /* renamed from: b */
    final /* synthetic */ C8094qp f36567b;

    C8023op(C8094qp qpVar) {
        this.f36567b = qpVar;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.f36567b.f38217b) {
            try {
                if (this.f36567b.f38218c != null) {
                    C8094qp qpVar = this.f36567b;
                    qpVar.f38220e = qpVar.f38218c.mo34770f();
                }
            } catch (DeadObjectException e) {
                co0.zzh("Unable to obtain a cache service instance.", e);
                C8094qp.m36567h(this.f36567b);
            }
            this.f36567b.f38217b.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.f36567b.f38217b) {
            this.f36567b.f38220e = null;
            this.f36567b.f38217b.notifyAll();
        }
    }
}
