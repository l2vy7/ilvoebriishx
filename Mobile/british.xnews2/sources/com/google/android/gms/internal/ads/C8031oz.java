package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class C8031oz implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ jk0 f36818b;

    public /* synthetic */ C8031oz(jk0 jk0) {
        this.f36818b = jk0;
    }

    public final void run() {
        jk0 jk0 = this.f36818b;
        if (jk0 != null) {
            try {
                jk0.mo31425l(1);
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
