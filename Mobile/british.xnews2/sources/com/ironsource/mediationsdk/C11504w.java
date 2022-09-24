package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.C4995f;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.mediationsdk.w */
public final class C11504w {

    /* renamed from: a */
    private Runnable f51766a;

    /* renamed from: b */
    private int f51767b = 0;

    /* renamed from: c */
    C11359c f51768c;

    /* renamed from: d */
    private C4995f f51769d;

    /* renamed from: com.ironsource.mediationsdk.w$h */
    class C11505h implements Runnable {
        C11505h() {
        }

        public final void run() {
            IronLog.INTERNAL.info("loaded ads are expired");
            C11359c cVar = C11504w.this.f51768c;
            if (cVar != null) {
                cVar.mo44142c_();
            }
        }
    }

    public C11504w(int i, C11359c cVar) {
        this.f51768c = cVar;
        this.f51767b = i;
        this.f51766a = new C11505h();
    }

    /* renamed from: b */
    private boolean m51335b() {
        return this.f51767b > 0;
    }

    /* renamed from: a */
    public final void mo44583a() {
        if (m51335b() && this.f51769d != null) {
            IronLog.INTERNAL.info("canceling expiration timer");
            this.f51769d.mo20620c();
            this.f51769d = null;
        }
    }

    /* renamed from: a */
    public final void mo44584a(long j) {
        if (m51335b()) {
            long millis = TimeUnit.MINUTES.toMillis((long) this.f51767b) - Math.max(j, 0);
            if (millis > 0) {
                mo44583a();
                this.f51769d = new C4995f(millis, this.f51766a, true);
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) millis);
                IronLog ironLog = IronLog.INTERNAL;
                StringBuilder sb = new StringBuilder("loaded ads will expire on: ");
                sb.append(instance.getTime());
                sb.append(" in ");
                double d = (double) millis;
                Double.isNaN(d);
                sb.append(String.format("%.2f", new Object[]{Double.valueOf((d / 1000.0d) / 60.0d)}));
                sb.append(" minutes");
                ironLog.info(sb.toString());
                return;
            }
            IronLog.INTERNAL.info("no delay - onAdExpired called");
            this.f51768c.mo44142c_();
        }
    }
}
