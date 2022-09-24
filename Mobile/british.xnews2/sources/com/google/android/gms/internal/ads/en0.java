package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import p251t4.C11013c;
import p251t4.C11014d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class en0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Context f31431b;

    /* renamed from: c */
    final /* synthetic */ uo0 f31432c;

    en0(fn0 fn0, Context context, uo0 uo0) {
        this.f31431b = context;
        this.f31432c = uo0;
    }

    public final void run() {
        try {
            this.f31432c.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.f31431b));
        } catch (IOException | IllegalStateException | C11013c | C11014d e) {
            this.f31432c.zze(e);
            co0.zzh("Exception while getting advertising Id info", e);
        }
    }
}
