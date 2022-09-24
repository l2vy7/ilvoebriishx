package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.lifecycle.f */
public final class C4995f implements C4990c {

    /* renamed from: a */
    private String f22081a = "INTERNAL";

    /* renamed from: b */
    private Timer f22082b;

    /* renamed from: c */
    private boolean f22083c;

    /* renamed from: d */
    private Long f22084d;

    /* renamed from: e */
    private long f22085e;

    /* renamed from: f */
    Runnable f22086f;

    /* renamed from: com.ironsource.lifecycle.f$a */
    class C4996a extends TimerTask {
        C4996a() {
        }

        public final void run() {
            C4995f.this.f22086f.run();
        }
    }

    public C4995f(long j, Runnable runnable, boolean z) {
        this.f22085e = j;
        this.f22086f = runnable;
        this.f22083c = false;
        this.f22084d = null;
        this.f22083c = true;
        C4991d.m22849a().mo20610a(this);
        this.f22084d = Long.valueOf(System.currentTimeMillis() + this.f22085e);
        if (!C4991d.m22849a().mo20611b()) {
            m22857d();
        }
    }

    /* renamed from: d */
    private void m22857d() {
        if (this.f22082b == null) {
            Timer timer = new Timer();
            this.f22082b = timer;
            timer.schedule(new C4996a(), this.f22085e);
            Calendar.getInstance().setTimeInMillis(this.f22084d.longValue());
        }
    }

    /* renamed from: e */
    private void m22858e() {
        Timer timer = this.f22082b;
        if (timer != null) {
            timer.cancel();
            this.f22082b = null;
        }
    }

    /* renamed from: a */
    public final void mo20600a() {
        Long l;
        if (this.f22082b == null && (l = this.f22084d) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.f22085e = longValue;
            if (longValue <= 0) {
                mo20620c();
                this.f22086f.run();
                return;
            }
            m22857d();
        }
    }

    /* renamed from: b */
    public final void mo20601b() {
        if (this.f22082b != null) {
            m22858e();
        }
    }

    /* renamed from: c */
    public final void mo20620c() {
        m22858e();
        this.f22083c = false;
        this.f22084d = null;
        C4991d a = C4991d.m22849a();
        if (a.f22070i.contains(this)) {
            a.f22070i.remove(this);
        }
    }
}
