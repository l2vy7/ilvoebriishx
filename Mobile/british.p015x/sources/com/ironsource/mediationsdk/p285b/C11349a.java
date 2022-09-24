package com.ironsource.mediationsdk.p285b;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.b.a */
public abstract class C11349a<T> {

    /* renamed from: a */
    private Timer f50964a;

    /* renamed from: b */
    private long f50965b;

    /* renamed from: c */
    protected T f50966c;

    /* renamed from: com.ironsource.mediationsdk.b.a$a */
    class C11350a extends TimerTask {
        C11350a() {
        }

        public final void run() {
            C11349a.this.mo44188a();
        }
    }

    public C11349a(long j) {
        this.f50965b = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo44188a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo44189b(T t) {
        if (!(this.f50965b <= 0) && t != null) {
            this.f50966c = t;
            mo44191e();
            Timer timer = new Timer();
            this.f50964a = timer;
            timer.schedule(new C11350a(), this.f50965b);
        }
    }

    /* renamed from: c */
    public final void mo44190c() {
        this.f50966c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo44191e() {
        Timer timer = this.f50964a;
        if (timer != null) {
            timer.cancel();
            this.f50964a = null;
        }
    }
}
