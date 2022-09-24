package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l41 implements uu3<ed1> {

    /* renamed from: a */
    private final iv3<ScheduledExecutorService> f34894a;

    /* renamed from: b */
    private final iv3<C6483e> f34895b;

    public l41(iv3<ScheduledExecutorService> iv3, iv3<C6483e> iv32) {
        this.f34894a = iv3;
        this.f34895b = iv32;
    }

    /* renamed from: a */
    public final ed1 zzb() {
        return new ed1(this.f34894a.zzb(), this.f34895b.zzb());
    }
}
