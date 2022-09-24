package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zi0 implements Callable<yi0> {

    /* renamed from: a */
    final /* synthetic */ Context f42478a;

    /* renamed from: b */
    final /* synthetic */ bj0 f42479b;

    zi0(bj0 bj0, Context context) {
        this.f42479b = bj0;
        this.f42478a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        yi0 yi0;
        aj0 aj0 = (aj0) this.f42479b.f30018a.get(this.f42478a);
        if (aj0 == null || aj0.f29653a + v10.f40234a.mo34648e().longValue() < zzt.zzA().currentTimeMillis()) {
            yi0 = new xi0(this.f42478a).mo35758a();
        } else {
            yi0 = new xi0(this.f42478a, aj0.f29654b).mo35758a();
        }
        this.f42479b.f30018a.put(this.f42478a, new aj0(this.f42479b, yi0));
        return yi0;
    }
}
