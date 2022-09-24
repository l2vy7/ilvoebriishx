package com.google.ads.interactivemedia.p039v3.internal;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.beg */
/* compiled from: IMASDK */
final class beg extends bed {

    /* renamed from: a */
    private final bef f16202a = new bef();

    beg() {
    }

    /* renamed from: a */
    public final void mo14956a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f16202a.mo14961a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }

    /* renamed from: b */
    public final void mo14957b(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f16202a.mo14961a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo14958c(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f16202a.mo14961a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }
}
