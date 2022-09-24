package com.ironsource.mediationsdk.adunit.p279c;

import com.ironsource.mediationsdk.C11304ab;
import com.ironsource.mediationsdk.adunit.p279c.p281b.C11325a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.adunit.c.c */
public final class C11327c {

    /* renamed from: a */
    C11325a f50849a;

    /* renamed from: b */
    C11304ab f50850b;

    /* renamed from: c */
    private Timer f50851c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.c$a */
    class C11328a extends TimerTask {
        C11328a() {
        }

        public final void run() {
            C11327c.this.f50850b.mo44036d();
        }
    }

    public C11327c(C11325a aVar, C11304ab abVar) {
        this.f50849a = aVar;
        this.f50850b = abVar;
    }

    /* renamed from: c */
    private void m50603c() {
        Timer timer = this.f50851c;
        if (timer != null) {
            timer.cancel();
            this.f50851c = null;
        }
    }

    /* renamed from: a */
    public final void mo44132a() {
        C11325a aVar = this.f50849a;
        if (aVar.f50841a != C11325a.C11326a.MANUAL) {
            mo44134b(aVar.f50843c);
        }
    }

    /* renamed from: b */
    public final void mo44133b() {
        if (this.f50849a.f50841a != C11325a.C11326a.MANUAL) {
            mo44134b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo44134b(long j) {
        m50603c();
        Timer timer = new Timer();
        this.f50851c = timer;
        timer.schedule(new C11328a(), j);
    }
}
