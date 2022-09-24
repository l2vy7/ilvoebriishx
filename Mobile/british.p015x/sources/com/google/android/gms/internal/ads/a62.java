package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class a62 implements m61 {

    /* renamed from: a */
    public final /* synthetic */ u42 f29542a;

    public /* synthetic */ a62(u42 u42) {
        this.f29542a = u42;
    }

    public final C7774hy zza() {
        try {
            return ((te0) this.f29542a.f39763b).zze();
        } catch (RemoteException e) {
            throw new gs2(e);
        }
    }
}
