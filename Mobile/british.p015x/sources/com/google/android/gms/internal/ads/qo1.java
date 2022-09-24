package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qo1 implements uu3<yh1<VideoController.VideoLifecycleCallbacks>> {

    /* renamed from: a */
    private final jo1 f38209a;

    /* renamed from: b */
    private final iv3<tr1> f38210b;

    /* renamed from: c */
    private final iv3<Executor> f38211c;

    public qo1(jo1 jo1, iv3<tr1> iv3, iv3<Executor> iv32) {
        this.f38209a = jo1;
        this.f38210b = iv3;
        this.f38211c = iv32;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new yh1(((ur1) this.f38210b).zzb(), this.f38211c.zzb());
    }
}
