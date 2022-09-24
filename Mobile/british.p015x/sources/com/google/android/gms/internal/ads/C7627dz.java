package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7627dz implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C7701fz f31126b;

    C7627dz(C7701fz fzVar) {
        this.f31126b = fzVar;
    }

    public final void run() {
        if (this.f31126b.f32049b.f32533b != null) {
            try {
                this.f31126b.f32049b.f32533b.mo30547l(1);
            } catch (RemoteException e) {
                co0.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
