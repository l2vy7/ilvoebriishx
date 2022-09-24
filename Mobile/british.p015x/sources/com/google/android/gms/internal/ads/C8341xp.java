package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.xp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C8341xp implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7512aq f41242b;

    /* renamed from: c */
    public final /* synthetic */ C8163sp f41243c;

    /* renamed from: d */
    public final /* synthetic */ zzbak f41244d;

    /* renamed from: e */
    public final /* synthetic */ uo0 f41245e;

    public /* synthetic */ C8341xp(C7512aq aqVar, C8163sp spVar, zzbak zzbak, uo0 uo0) {
        this.f41242b = aqVar;
        this.f41243c = spVar;
        this.f41244d = zzbak;
        this.f41245e = uo0;
    }

    public final void run() {
        zzbah zzbah;
        C7512aq aqVar = this.f41242b;
        C8163sp spVar = this.f41243c;
        zzbak zzbak = this.f41244d;
        uo0 uo0 = this.f41245e;
        try {
            C8235up f = spVar.mo34770f();
            if (spVar.mo34769e()) {
                zzbah = f.mo35219p6(zzbak);
            } else {
                zzbah = f.mo35218o6(zzbak);
            }
            if (!zzbah.mo36231G0()) {
                uo0.zze(new RuntimeException("No entry contents."));
                C7583cq.m31085e(aqVar.f29718d);
                return;
            }
            C8414zp zpVar = new C8414zp(aqVar, zzbah.mo36229E0(), 1);
            int read = zpVar.read();
            if (read != -1) {
                zpVar.unread(read);
                uo0.zzd(C7655eq.m31908b(zpVar, zzbah.mo36230F0(), zzbah.mo36233I0(), zzbah.mo36227C0(), zzbah.mo36232H0()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            co0.zzh("Unable to obtain a cache service instance.", e);
            uo0.zze(e);
            C7583cq.m31085e(aqVar.f29718d);
        }
    }
}
