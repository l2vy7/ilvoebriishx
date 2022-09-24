package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class fq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ hq1 f31842b;

    public /* synthetic */ fq1(hq1 hq1) {
        this.f31842b = hq1;
    }

    public final void run() {
        try {
            this.f31842b.zzd();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
