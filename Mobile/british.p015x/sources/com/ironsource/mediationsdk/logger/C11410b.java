package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* renamed from: com.ironsource.mediationsdk.logger.b */
public final class C11410b extends IronSourceLogger {

    /* renamed from: c */
    public LogListener f51317c;

    private C11410b() {
        super("publisher");
    }

    public C11410b(LogListener logListener, int i) {
        super("publisher", 1);
        this.f51317c = null;
    }

    public final synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        LogListener logListener = this.f51317c;
        if (!(logListener == null || str == null)) {
            logListener.onLog(ironSourceTag, str, i);
        }
    }

    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
