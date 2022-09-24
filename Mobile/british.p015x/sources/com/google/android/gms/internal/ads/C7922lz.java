package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import p199d5.C10487a;

/* renamed from: com.google.android.gms.internal.ads.lz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7922lz extends C7810ix {

    /* renamed from: b */
    private e90 f35314b;

    /* renamed from: M3 */
    public final void mo31973M3(String str, C10487a aVar) throws RemoteException {
    }

    /* renamed from: R1 */
    public final void mo31974R1(C10487a aVar, String str) throws RemoteException {
    }

    /* renamed from: a0 */
    public final void mo31975a0(boolean z) throws RemoteException {
    }

    /* renamed from: c0 */
    public final void mo31976c0(String str) throws RemoteException {
    }

    /* renamed from: c2 */
    public final void mo31977c2(e90 e90) throws RemoteException {
        this.f35314b = e90;
    }

    /* renamed from: g5 */
    public final void mo31978g5(C4627vx vxVar) {
    }

    /* renamed from: j5 */
    public final void mo31979j5(tc0 tc0) throws RemoteException {
    }

    /* renamed from: t0 */
    public final void mo31981t0(zzbkk zzbkk) throws RemoteException {
    }

    /* renamed from: w */
    public final void mo31982w(String str) throws RemoteException {
    }

    /* renamed from: w5 */
    public final void mo31983w5(float f) throws RemoteException {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        e90 e90 = this.f35314b;
        if (e90 != null) {
            try {
                e90.mo30862O4(Collections.emptyList());
            } catch (RemoteException e) {
                co0.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    public final float zze() throws RemoteException {
        return 1.0f;
    }

    public final String zzf() {
        return "";
    }

    public final List<zzbtn> zzg() throws RemoteException {
        return Collections.emptyList();
    }

    public final void zzi() {
    }

    public final void zzj() throws RemoteException {
        co0.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        vn0.f40472b.post(new C7885kz(this));
    }

    public final boolean zzt() throws RemoteException {
        return false;
    }
}
