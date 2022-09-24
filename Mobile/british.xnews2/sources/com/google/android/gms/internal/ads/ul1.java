package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ul1 extends m30 {

    /* renamed from: b */
    private final im1 f39890b;

    /* renamed from: c */
    private C10487a f39891c;

    public ul1(im1 im1) {
        this.f39890b = im1;
    }

    /* renamed from: n6 */
    private static float m38364n6(C10487a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) C10489b.m48194f3(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    /* renamed from: S0 */
    public final void mo33625S0(z40 z40) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36900I4)).booleanValue() && (this.f39890b.mo32658R() instanceof uu0)) {
            ((uu0) this.f39890b.mo32658R()).mo35278t6(z40);
        }
    }

    public final float zze() throws RemoteException {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36892H4)).booleanValue()) {
            return 0.0f;
        }
        if (this.f39890b.mo32650J() != 0.0f) {
            return this.f39890b.mo32650J();
        }
        if (this.f39890b.mo32658R() != null) {
            try {
                return this.f39890b.mo32658R().zze();
            } catch (RemoteException e) {
                co0.zzh("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        } else {
            C10487a aVar = this.f39891c;
            if (aVar != null) {
                return m38364n6(aVar);
            }
            q30 U = this.f39890b.mo32661U();
            if (U == null) {
                return 0.0f;
            }
            float zzd = (U.zzd() == -1 || U.zzc() == -1) ? 0.0f : ((float) U.zzd()) / ((float) U.zzc());
            return zzd == 0.0f ? m38364n6(U.zzf()) : zzd;
        }
    }

    public final float zzf() throws RemoteException {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36900I4)).booleanValue() && this.f39890b.mo32658R() != null) {
            return this.f39890b.mo32658R().zzf();
        }
        return 0.0f;
    }

    public final float zzg() throws RemoteException {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36900I4)).booleanValue() && this.f39890b.mo32658R() != null) {
            return this.f39890b.mo32658R().zzg();
        }
        return 0.0f;
    }

    public final C7774hy zzh() throws RemoteException {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36900I4)).booleanValue()) {
            return null;
        }
        return this.f39890b.mo32658R();
    }

    public final C10487a zzi() throws RemoteException {
        C10487a aVar = this.f39891c;
        if (aVar != null) {
            return aVar;
        }
        q30 U = this.f39890b.mo32661U();
        if (U == null) {
            return null;
        }
        return U.zzf();
    }

    public final void zzj(C10487a aVar) {
        this.f39891c = aVar;
    }

    public final boolean zzk() throws RemoteException {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36900I4)).booleanValue() && this.f39890b.mo32658R() != null) {
            return true;
        }
        return false;
    }
}
