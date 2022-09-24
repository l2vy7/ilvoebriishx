package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vb3<V> implements Runnable {
    @CheckForNull

    /* renamed from: b */
    yb3<V> f20926b;

    vb3(yb3<V> yb3) {
        this.f20926b = yb3;
    }

    public final void run() {
        mb3 E;
        String str;
        yb3<V> yb3 = this.f20926b;
        if (yb3 != null && (E = yb3.f21019i) != null) {
            this.f20926b = null;
            if (E.isDone()) {
                yb3.mo18665x(E);
                return;
            }
            try {
                ScheduledFuture G = yb3.f21020j;
                yb3.f21020j = null;
                str = "Timed out";
                if (G != null) {
                    long abs = Math.abs(G.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append(str);
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                }
                String obj = E.toString();
                StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
                sb2.append(str);
                sb2.append(": ");
                sb2.append(obj);
                yb3.mo18664w(new xb3(sb2.toString(), (wb3) null));
                E.cancel(true);
            } catch (Throwable th) {
                E.cancel(true);
                throw th;
            }
        }
    }
}
