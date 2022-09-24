package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class i03 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f33012b;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f33013c;

    public /* synthetic */ i03(Context context, TaskCompletionSource taskCompletionSource) {
        this.f33012b = context;
        this.f33013c = taskCompletionSource;
    }

    public final void run() {
        this.f33013c.setResult(j23.m33512b(this.f33012b, "GLAS", (String) null));
    }
}
