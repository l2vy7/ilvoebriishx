package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class er2 extends e03 {

    /* renamed from: a */
    final /* synthetic */ C8279vw f31485a;

    /* renamed from: b */
    final /* synthetic */ fr2 f31486b;

    er2(fr2 fr2, C8279vw vwVar) {
        this.f31486b = fr2;
        this.f31485a = vwVar;
    }

    /* renamed from: l */
    public final void mo18124l() {
        if (this.f31486b.f31860e != null) {
            try {
                this.f31485a.zze();
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
