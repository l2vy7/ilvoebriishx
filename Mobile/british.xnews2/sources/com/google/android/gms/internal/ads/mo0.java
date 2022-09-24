package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mo0 implements Executor {

    /* renamed from: b */
    private final Handler f35588b = new zzf(Looper.getMainLooper());

    mo0() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzP(zzt.zzo().mo18579c(), th);
                throw th;
            }
        } else {
            this.f35588b.post(runnable);
        }
    }
}
