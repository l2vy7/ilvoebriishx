package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class jx1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ tx1 f34070b;

    /* renamed from: c */
    public final /* synthetic */ e90 f34071c;

    public /* synthetic */ jx1(tx1 tx1, e90 e90) {
        this.f34070b = tx1;
        this.f34071c = e90;
    }

    public final void run() {
        tx1 tx1 = this.f34070b;
        try {
            this.f34071c.mo30862O4(tx1.mo35058f());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }
}
