package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C7659eu;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.gi1;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.xg0;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzv extends xg0 {

    /* renamed from: b */
    private final AdOverlayInfoParcel f27817b;

    /* renamed from: c */
    private final Activity f27818c;

    /* renamed from: d */
    private boolean f27819d = false;

    /* renamed from: e */
    private boolean f27820e = false;

    public zzv(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f27817b = adOverlayInfoParcel;
        this.f27818c = activity;
    }

    private final synchronized void zzb() {
        if (!this.f27820e) {
            zzo zzo = this.f27817b.zzc;
            if (zzo != null) {
                zzo.zzf(4);
            }
            this.f27820e = true;
        }
    }

    public final boolean zzE() throws RemoteException {
        return false;
    }

    public final void zzg(int i, int i2, Intent intent) throws RemoteException {
    }

    public final void zzh() throws RemoteException {
    }

    public final void zzj(C10487a aVar) throws RemoteException {
    }

    public final void zzk(Bundle bundle) {
        zzo zzo;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37256y6)).booleanValue()) {
            this.f27818c.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f27817b;
        if (adOverlayInfoParcel == null) {
            this.f27818c.finish();
        } else if (z) {
            this.f27818c.finish();
        } else {
            if (bundle == null) {
                C7659eu euVar = adOverlayInfoParcel.zzb;
                if (euVar != null) {
                    euVar.onAdClicked();
                }
                gi1 gi1 = this.f27817b.zzy;
                if (gi1 != null) {
                    gi1.zzq();
                }
                if (!(this.f27818c.getIntent() == null || !this.f27818c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (zzo = this.f27817b.zzc) == null)) {
                    zzo.zzb();
                }
            }
            zzt.zzi();
            Activity activity = this.f27818c;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f27817b;
            zzc zzc = adOverlayInfoParcel2.zza;
            if (!zza.zzb(activity, zzc, adOverlayInfoParcel2.zzi, zzc.zzi)) {
                this.f27818c.finish();
            }
        }
    }

    public final void zzl() throws RemoteException {
        if (this.f27818c.isFinishing()) {
            zzb();
        }
    }

    public final void zzn() throws RemoteException {
        zzo zzo = this.f27817b.zzc;
        if (zzo != null) {
            zzo.zzbz();
        }
        if (this.f27818c.isFinishing()) {
            zzb();
        }
    }

    public final void zzo() throws RemoteException {
    }

    public final void zzp() throws RemoteException {
        if (this.f27819d) {
            this.f27818c.finish();
            return;
        }
        this.f27819d = true;
        zzo zzo = this.f27817b.zzc;
        if (zzo != null) {
            zzo.zzbS();
        }
    }

    public final void zzq(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f27819d);
    }

    public final void zzr() throws RemoteException {
    }

    public final void zzs() throws RemoteException {
        if (this.f27818c.isFinishing()) {
            zzb();
        }
    }

    public final void zzt() throws RemoteException {
        zzo zzo = this.f27817b.zzc;
        if (zzo != null) {
            zzo.zze();
        }
    }

    public final void zzv() throws RemoteException {
    }
}
