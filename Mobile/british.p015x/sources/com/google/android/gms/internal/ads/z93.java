package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class z93<InputT, OutputT> extends fa3<OutputT> {

    /* renamed from: p */
    private static final Logger f21039p = Logger.getLogger(z93.class.getName());
    @CheckForNull

    /* renamed from: m */
    private k63<? extends mb3<? extends InputT>> f21040m;

    /* renamed from: n */
    private final boolean f21041n;

    /* renamed from: o */
    private final boolean f21042o;

    z93(k63<? extends mb3<? extends InputT>> k63, boolean z, boolean z2) {
        super(k63.size());
        this.f21040m = k63;
        this.f21041n = z;
        this.f21042o = z2;
    }

    /* renamed from: M */
    private final void m21268M(int i, Future<? extends InputT> future) {
        try {
            mo18518R(i, bb3.m30656p(future));
        } catch (ExecutionException e) {
            m21270O(e.getCause());
        } catch (Throwable th) {
            m21270O(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void mo19056V(@CheckForNull k63<? extends Future<? extends InputT>> k63) {
        int E = mo18333E();
        int i = 0;
        b43.m20210g(E >= 0, "Less than 0 remaining futures");
        if (E == 0) {
            if (k63 != null) {
                s83<? extends Future<? extends InputT>> g = k63.iterator();
                while (g.hasNext()) {
                    Future future = (Future) g.next();
                    if (!future.isCancelled()) {
                        m21268M(i, future);
                    }
                    i++;
                }
            }
            mo18335J();
            mo18519S();
            mo18517L(2);
        }
    }

    /* renamed from: O */
    private final void m21270O(Throwable th) {
        Objects.requireNonNull(th);
        if (this.f21041n && !mo18664w(th) && m21272Q(mo18334G(), th)) {
            m21271P(th);
        } else if (th instanceof Error) {
            m21271P(th);
        }
    }

    /* renamed from: P */
    private static void m21271P(Throwable th) {
        f21039p.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* renamed from: Q */
    private static boolean m21272Q(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo18336K(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (!isCancelled()) {
            Throwable b = mo18655b();
            b.getClass();
            m21272Q(set, b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo18517L(int i) {
        this.f21040m = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public abstract void mo18518R(int i, InputT inputt);

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public abstract void mo18519S();

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo19054T() {
        k63<? extends mb3<? extends InputT>> k63 = this.f21040m;
        k63.getClass();
        if (k63.isEmpty()) {
            mo18519S();
        } else if (this.f21041n) {
            s83<? extends mb3<? extends InputT>> g = this.f21040m.iterator();
            int i = 0;
            while (g.hasNext()) {
                mb3 mb3 = (mb3) g.next();
                mb3.zzc(new y93(this, mb3, i), pa3.INSTANCE);
                i++;
            }
        } else {
            x93 x93 = new x93(this, this.f21042o ? this.f21040m : null);
            s83<? extends mb3<? extends InputT>> g2 = this.f21040m.iterator();
            while (g2.hasNext()) {
                ((mb3) g2.next()).zzc(x93, pa3.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final /* synthetic */ void mo19055U(mb3 mb3, int i) {
        try {
            if (mb3.isCancelled()) {
                this.f21040m = null;
                cancel(false);
            } else {
                m21268M(i, mb3);
            }
        } finally {
            mo19056V((k63) null);
        }
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: h */
    public final String mo18119h() {
        k63<? extends mb3<? extends InputT>> k63 = this.f21040m;
        if (k63 != null) {
            return "futures=".concat(k63.toString());
        }
        return super.mo18119h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo18120i() {
        k63<? extends mb3<? extends InputT>> k63 = this.f21040m;
        boolean z = true;
        mo18517L(1);
        boolean isCancelled = isCancelled();
        if (k63 == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean y = mo18666y();
            s83<? extends mb3<? extends InputT>> g = k63.iterator();
            while (g.hasNext()) {
                ((Future) g.next()).cancel(y);
            }
        }
    }
}
