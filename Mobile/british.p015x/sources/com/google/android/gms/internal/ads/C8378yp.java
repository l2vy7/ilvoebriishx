package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.yp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C8378yp implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ uo0 f41945b;

    /* renamed from: c */
    public final /* synthetic */ Future f41946c;

    public /* synthetic */ C8378yp(uo0 uo0, Future future) {
        this.f41945b = uo0;
        this.f41946c = future;
    }

    public final void run() {
        uo0 uo0 = this.f41945b;
        Future future = this.f41946c;
        if (uo0.isCancelled()) {
            future.cancel(true);
        }
    }
}
