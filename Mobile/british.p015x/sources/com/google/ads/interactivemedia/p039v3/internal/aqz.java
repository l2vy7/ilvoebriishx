package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqz */
/* compiled from: IMASDK */
final class aqz<TResult> extends aqs<TResult> {

    /* renamed from: a */
    private final Object f15589a = new Object();

    /* renamed from: b */
    private final aqu<TResult> f15590b = new aqu<>();

    /* renamed from: c */
    private boolean f15591c;

    /* renamed from: d */
    private volatile boolean f15592d;

    /* renamed from: e */
    private TResult f15593e;

    /* renamed from: f */
    private Exception f15594f;

    aqz() {
    }

    /* renamed from: p */
    private final void m14567p() {
        if (this.f15591c) {
            throw aqe.m14534a(this);
        }
    }

    /* renamed from: q */
    private final void m14568q() {
        synchronized (this.f15589a) {
            if (this.f15591c) {
                this.f15590b.mo14229b(this);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo14218a() {
        boolean z;
        synchronized (this.f15589a) {
            z = this.f15591c;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo14219b() {
        boolean z;
        synchronized (this.f15589a) {
            z = false;
            if (this.f15591c && !this.f15592d && this.f15594f == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo14220c() {
        return this.f15592d;
    }

    /* renamed from: d */
    public final TResult mo14221d() {
        TResult tresult;
        synchronized (this.f15589a) {
            C4604n.m20102o(this.f15591c, "Task is not yet complete");
            if (!this.f15592d) {
                Exception exc = this.f15594f;
                if (exc == null) {
                    tresult = this.f15593e;
                } else {
                    throw new aqr(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    /* renamed from: e */
    public final Exception mo14222e() {
        Exception exc;
        synchronized (this.f15589a) {
            exc = this.f15594f;
        }
        return exc;
    }

    /* renamed from: f */
    public final <TContinuationResult> aqs<TContinuationResult> mo14223f(aqb<TResult, aqs<TContinuationResult>> aqb) {
        Executor executor = aqy.f15587a;
        aqz aqz = new aqz();
        this.f15590b.mo14228a(new aqd(arc.m14584a(executor), aqb, aqz));
        m14568q();
        return aqz;
    }

    /* renamed from: g */
    public final void mo14224g(Executor executor, aqh aqh) {
        this.f15590b.mo14228a(new aqg(arc.m14584a(executor), aqh));
        m14568q();
    }

    /* renamed from: h */
    public final void mo14225h(aqk<TResult> aqk) {
        this.f15590b.mo14228a(new aqj(arc.m14584a(aqy.f15587a), aqk));
        m14568q();
    }

    /* renamed from: i */
    public final void mo14226i(Executor executor, aqn aqn) {
        this.f15590b.mo14228a(new aqm(arc.m14584a(executor), aqn));
        m14568q();
    }

    /* renamed from: j */
    public final void mo14227j(Executor executor, aqq<? super TResult> aqq) {
        this.f15590b.mo14228a(new aqp(arc.m14584a(executor), aqq));
        m14568q();
    }

    /* renamed from: k */
    public final void mo14235k(TResult tresult) {
        synchronized (this.f15589a) {
            m14567p();
            this.f15591c = true;
            this.f15593e = tresult;
        }
        this.f15590b.mo14229b(this);
    }

    /* renamed from: l */
    public final boolean mo14236l(TResult tresult) {
        synchronized (this.f15589a) {
            if (this.f15591c) {
                return false;
            }
            this.f15591c = true;
            this.f15593e = tresult;
            this.f15590b.mo14229b(this);
            return true;
        }
    }

    /* renamed from: m */
    public final void mo14237m(Exception exc) {
        C4604n.m20099l(exc, "Exception must not be null");
        synchronized (this.f15589a) {
            m14567p();
            this.f15591c = true;
            this.f15594f = exc;
        }
        this.f15590b.mo14229b(this);
    }

    /* renamed from: n */
    public final boolean mo14238n(Exception exc) {
        C4604n.m20099l(exc, "Exception must not be null");
        synchronized (this.f15589a) {
            if (this.f15591c) {
                return false;
            }
            this.f15591c = true;
            this.f15594f = exc;
            this.f15590b.mo14229b(this);
            return true;
        }
    }

    /* renamed from: o */
    public final void mo14239o() {
        synchronized (this.f15589a) {
            if (!this.f15591c) {
                this.f15591c = true;
                this.f15592d = true;
                this.f15590b.mo14229b(this);
            }
        }
    }
}
