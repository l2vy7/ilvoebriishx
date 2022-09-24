package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p247r5.C10965a;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class zzu implements Executor {
    private final Handler zza = new C10965a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
