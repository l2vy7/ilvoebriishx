package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oc2 {

    /* renamed from: a */
    private final tc2<o61> f36381a;

    /* renamed from: b */
    private final String f36382b;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: c */
    public C7663ey f36383c;

    public oc2(tc2<o61> tc2, String str) {
        this.f36381a = tc2;
        this.f36382b = str;
    }

    /* renamed from: a */
    public final synchronized String mo33862a() {
        String str;
        str = null;
        try {
            C7663ey eyVar = this.f36383c;
            if (eyVar != null) {
                str = eyVar.zze();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public final synchronized String mo33863b() {
        String str;
        str = null;
        try {
            C7663ey eyVar = this.f36383c;
            if (eyVar != null) {
                str = eyVar.zze();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public final synchronized void mo33864d(zzbfd zzbfd, int i) throws RemoteException {
        this.f36383c = null;
        this.f36381a.mo18423a(zzbfd, this.f36382b, new uc2(i), new nc2(this));
    }

    /* renamed from: e */
    public final synchronized boolean mo33865e() throws RemoteException {
        return this.f36381a.zza();
    }
}
