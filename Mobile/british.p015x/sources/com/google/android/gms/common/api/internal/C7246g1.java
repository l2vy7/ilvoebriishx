package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.g1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class C7246g1 implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Handler f29011b;

    public /* synthetic */ C7246g1(Handler handler) {
        this.f29011b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f29011b.post(runnable);
    }
}
