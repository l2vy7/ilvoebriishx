package com.google.ads.interactivemedia.p039v3.internal;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aml */
final /* synthetic */ class aml implements ThreadFactory {

    /* renamed from: a */
    private final String f15297a;

    aml(String str) {
        this.f15297a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f15297a);
    }
}
