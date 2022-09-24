package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class o14 implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Handler f36233b;

    public /* synthetic */ o14(Handler handler) {
        this.f36233b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f36233b.post(runnable);
    }
}
