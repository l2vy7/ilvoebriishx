package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ow */
final /* synthetic */ class C4246ow implements Executor {

    /* renamed from: a */
    private final Handler f18233a;

    private C4246ow(Handler handler) {
        this.f18233a = handler;
    }

    /* renamed from: a */
    static Executor m18412a(Handler handler) {
        return new C4246ow(handler);
    }

    public final void execute(Runnable runnable) {
        this.f18233a.post(runnable);
    }
}
