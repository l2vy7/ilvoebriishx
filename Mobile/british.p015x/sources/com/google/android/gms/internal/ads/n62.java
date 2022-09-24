package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n62 implements r42<m41> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final k51 f35918a;

    /* renamed from: b */
    private final t52 f35919b;

    /* renamed from: c */
    private final nb3 f35920c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final oa1 f35921d;

    /* renamed from: e */
    private final ScheduledExecutorService f35922e;

    public n62(k51 k51, t52 t52, oa1 oa1, ScheduledExecutorService scheduledExecutorService, nb3 nb3) {
        this.f35918a = k51;
        this.f35919b = t52;
        this.f35921d = oa1;
        this.f35922e = scheduledExecutorService;
        this.f35920c = nb3;
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        return ur2.f39936a.f38765a.mo30795a() != null && this.f35919b.mo31509a(ur2, ir2);
    }

    /* renamed from: b */
    public final mb3<m41> mo31510b(ur2 ur2, ir2 ir2) {
        return this.f35920c.mo33675b(new l62(this, ur2, ir2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ m41 mo33663c(ur2 ur2, ir2 ir2) throws Exception {
        return this.f35918a.mo33032b(new e71(ur2, ir2, (String) null), new z51(ur2.f39936a.f38765a.mo30795a(), new k62(this, ur2, ir2))).zza();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo33664f(ur2 ur2, ir2 ir2) {
        bb3.m30658r(bb3.m30655o(this.f35919b.mo31510b(ur2, ir2), (long) ir2.f33452O, TimeUnit.SECONDS, this.f35922e), new m62(this), this.f35920c);
    }
}
