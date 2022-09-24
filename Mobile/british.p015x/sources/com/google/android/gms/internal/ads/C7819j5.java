package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.j5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7819j5 implements Executor {

    /* renamed from: b */
    final /* synthetic */ Handler f33773b;

    C7819j5(C7892l5 l5Var, Handler handler) {
        this.f33773b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f33773b.post(runnable);
    }
}
