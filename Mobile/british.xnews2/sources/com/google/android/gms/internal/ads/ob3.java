package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ob3 implements Executor {

    /* renamed from: b */
    final /* synthetic */ Executor f36363b;

    /* renamed from: c */
    final /* synthetic */ q93 f36364c;

    ob3(Executor executor, q93 q93) {
        this.f36363b = executor;
        this.f36364c = q93;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f36363b.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f36364c.mo18664w(e);
        }
    }
}
