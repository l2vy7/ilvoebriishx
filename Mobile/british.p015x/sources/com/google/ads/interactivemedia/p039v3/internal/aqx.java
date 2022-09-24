package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqx */
/* compiled from: IMASDK */
final class aqx implements Executor {

    /* renamed from: a */
    private final Handler f15586a = new apz(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f15586a.post(runnable);
    }
}
