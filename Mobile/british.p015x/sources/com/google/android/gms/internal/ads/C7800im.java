package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.im */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7800im implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ String f33301a = "Loader:ExtractorMediaPeriod";

    C7800im(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f33301a);
    }
}
