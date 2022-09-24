package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cv2 implements uu3<ScheduledExecutorService> {

    /* renamed from: a */
    private final iv3<ThreadFactory> f30501a;

    public cv2(iv3<ThreadFactory> iv3) {
        this.f30501a = iv3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        c33.m30893a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, this.f30501a.zzb()));
        cv3.m31156b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
