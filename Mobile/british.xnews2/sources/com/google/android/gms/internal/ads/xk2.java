package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xk2 implements zi2<yk2> {

    /* renamed from: a */
    final ScheduledExecutorService f41205a;

    /* renamed from: b */
    final Context f41206b;

    /* renamed from: c */
    final ch0 f41207c;

    public xk2(ch0 ch0, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f41207c = ch0;
        this.f41205a = scheduledExecutorService;
        this.f41206b = context;
    }

    public final mb3<yk2> zzb() {
        return bb3.m30653m(bb3.m30655o(bb3.m30649i(new Bundle()), ((Long) C8311wv.m39277c().mo18570b(p00.f36874F2)).longValue(), TimeUnit.MILLISECONDS, this.f41205a), wk2.f40816a, po0.f37722a);
    }
}
