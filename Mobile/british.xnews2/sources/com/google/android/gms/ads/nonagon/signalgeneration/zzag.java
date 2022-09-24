package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.cv3;
import com.google.android.gms.internal.ads.iv3;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.uu3;
import com.google.android.gms.internal.ads.vz1;
import com.google.android.gms.internal.ads.wz1;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzag implements uu3<zzaf> {

    /* renamed from: a */
    private final iv3<Executor> f28074a;

    /* renamed from: b */
    private final iv3<vz1> f28075b;

    public zzag(iv3<Executor> iv3, iv3<vz1> iv32) {
        this.f28074a = iv3;
        this.f28075b = iv32;
    }

    /* renamed from: zza */
    public final zzaf zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new zzaf(nb3, ((wz1) this.f28075b).zzb());
    }
}
