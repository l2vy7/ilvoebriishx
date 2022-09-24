package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class j03 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f33688b;

    public /* synthetic */ j03(TaskCompletionSource taskCompletionSource) {
        this.f33688b = taskCompletionSource;
    }

    public final void run() {
        this.f33688b.setResult(j23.m33513c());
    }
}
