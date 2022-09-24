package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hb2 extends C7845jw {

    /* renamed from: b */
    private final oc2 f32698b;

    public hb2(Context context, uv0 uv0, zr2 zr2, tm1 tm1, C7624dw dwVar) {
        qc2 qc2 = new qc2(tm1, uv0.mo35282D());
        qc2.mo34316e(dwVar);
        this.f32698b = new oc2(new ad2(uv0, context, qc2, zr2), zr2.mo36117h());
    }

    /* renamed from: i4 */
    public final void mo31966i4(zzbfd zzbfd) throws RemoteException {
        this.f32698b.mo33864d(zzbfd, 1);
    }

    /* renamed from: y0 */
    public final synchronized void mo31967y0(zzbfd zzbfd, int i) throws RemoteException {
        this.f32698b.mo33864d(zzbfd, i);
    }

    public final synchronized String zze() {
        return this.f32698b.mo33862a();
    }

    public final synchronized String zzf() {
        return this.f32698b.mo33863b();
    }

    public final synchronized boolean zzi() throws RemoteException {
        return this.f32698b.mo33865e();
    }
}
