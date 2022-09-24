package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.f2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9141f2 implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f45024a = Executors.defaultThreadFactory();

    C9141f2(C9372u2 u2Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f45024a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
