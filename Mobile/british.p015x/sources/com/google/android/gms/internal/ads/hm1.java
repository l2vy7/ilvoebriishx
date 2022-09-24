package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hm1 extends C7736gy {

    /* renamed from: b */
    private final Object f20379b = new Object();
    @Nullable

    /* renamed from: c */
    private final C7774hy f20380c;
    @Nullable

    /* renamed from: d */
    private final id0 f20381d;

    public hm1(@Nullable C7774hy hyVar, @Nullable id0 id0) {
        this.f20380c = hyVar;
        this.f20381d = id0;
    }

    /* renamed from: F */
    public final void mo18394F(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: i3 */
    public final void mo18395i3(@Nullable C7921ly lyVar) throws RemoteException {
        synchronized (this.f20379b) {
            C7774hy hyVar = this.f20380c;
            if (hyVar != null) {
                hyVar.mo18395i3(lyVar);
            }
        }
    }

    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzf() throws RemoteException {
        id0 id0 = this.f20381d;
        if (id0 != null) {
            return id0.zzg();
        }
        return 0.0f;
    }

    public final float zzg() throws RemoteException {
        id0 id0 = this.f20381d;
        if (id0 != null) {
            return id0.zzh();
        }
        return 0.0f;
    }

    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    public final C7921ly zzi() throws RemoteException {
        synchronized (this.f20379b) {
            C7774hy hyVar = this.f20380c;
            if (hyVar == null) {
                return null;
            }
            C7921ly zzi = hyVar.zzi();
            return zzi;
        }
    }

    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
