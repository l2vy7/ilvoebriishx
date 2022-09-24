package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class kx1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ tx1 f34727b;

    /* renamed from: c */
    public final /* synthetic */ uo0 f34728c;

    public /* synthetic */ kx1(tx1 tx1, uo0 uo0) {
        this.f34727b = tx1;
        this.f34728c = uo0;
    }

    public final void run() {
        uo0 uo0 = this.f34728c;
        String c = zzt.zzo().mo18583h().zzg().mo32721c();
        if (!TextUtils.isEmpty(c)) {
            uo0.zzd(c);
        } else {
            uo0.zze(new Exception());
        }
    }
}
