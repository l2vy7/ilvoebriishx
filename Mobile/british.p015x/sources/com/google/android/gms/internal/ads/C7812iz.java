package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.iz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7812iz implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C7848jz f33678b;

    C7812iz(C7848jz jzVar) {
        this.f33678b = jzVar;
    }

    public final void run() {
        if (this.f33678b.f34079b != null) {
            try {
                this.f33678b.f34079b.mo30547l(1);
            } catch (RemoteException e) {
                co0.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
