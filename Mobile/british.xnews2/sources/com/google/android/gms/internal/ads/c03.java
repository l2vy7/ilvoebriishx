package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class c03 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f30195a = "ExoPlayer:Loader:ProgressiveMediaPeriod";

    public /* synthetic */ c03(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f30195a);
    }
}
