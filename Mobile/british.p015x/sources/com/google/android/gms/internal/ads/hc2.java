package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hc2 implements C7659eu, gi1 {
    @GuardedBy("this")

    /* renamed from: b */
    private C7518aw f32703b;

    /* renamed from: a */
    public final synchronized void mo32383a(C7518aw awVar) {
        this.f32703b = awVar;
    }

    public final synchronized void onAdClicked() {
        C7518aw awVar = this.f32703b;
        if (awVar != null) {
            try {
                awVar.zzb();
            } catch (RemoteException e) {
                co0.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zzq() {
        C7518aw awVar = this.f32703b;
        if (awVar != null) {
            try {
                awVar.zzb();
            } catch (RemoteException e) {
                co0.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
