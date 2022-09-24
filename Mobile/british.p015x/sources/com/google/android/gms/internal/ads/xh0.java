package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class xh0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f41167a;

    /* renamed from: b */
    final /* synthetic */ zh0 f41168b;

    xh0(zh0 zh0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f41168b = zh0;
        this.f41167a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f41168b.mo19059e(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f41167a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f41167a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
