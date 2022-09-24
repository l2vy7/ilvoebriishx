package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.C11483b;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.aa */
public final class C11300aa {

    /* renamed from: a */
    private C11483b f50746a;

    /* renamed from: b */
    C11304ab f50747b;

    /* renamed from: c */
    private Timer f50748c = null;

    /* renamed from: com.ironsource.mediationsdk.aa$a */
    class C11301a extends TimerTask {
        C11301a() {
        }

        public final void run() {
            C11300aa.this.f50747b.mo44036d();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.aa$b */
    class C11302b extends TimerTask {
        C11302b() {
        }

        public final void run() {
            C11300aa.this.f50747b.mo44036d();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.aa$c */
    class C11303c extends TimerTask {
        C11303c() {
        }

        public final void run() {
            C11300aa.this.f50747b.mo44036d();
        }
    }

    public C11300aa(C11483b bVar, C11304ab abVar) {
        this.f50746a = bVar;
        this.f50747b = abVar;
    }

    /* renamed from: e */
    private void m50507e() {
        Timer timer = this.f50748c;
        if (timer != null) {
            timer.cancel();
            this.f50748c = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo44029a() {
        if (this.f50746a.f51544m) {
            m50507e();
            Timer timer = new Timer();
            this.f50748c = timer;
            timer.schedule(new C11301a(), this.f50746a.f51542k);
        }
    }

    /* renamed from: b */
    public final synchronized void mo44030b() {
        if (!this.f50746a.f51544m) {
            m50507e();
            Timer timer = new Timer();
            this.f50748c = timer;
            timer.schedule(new C11302b(), this.f50746a.f51542k);
        }
    }

    /* renamed from: c */
    public final void mo44031c() {
        synchronized (this) {
            m50507e();
        }
        this.f50747b.mo44036d();
    }

    /* renamed from: d */
    public final synchronized void mo44032d() {
        m50507e();
        Timer timer = new Timer();
        this.f50748c = timer;
        timer.schedule(new C11303c(), this.f50746a.f51541j);
    }
}
