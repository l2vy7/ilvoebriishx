package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amg */
/* compiled from: IMASDK */
public final class amg implements aks {
    protected amg() {
    }

    /* renamed from: a */
    public final long mo13857a() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final alb mo13858b(Looper looper, Handler.Callback callback) {
        return new ami(new Handler(looper, callback));
    }
}
