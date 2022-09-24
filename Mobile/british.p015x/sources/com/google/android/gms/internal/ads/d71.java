package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d71 {

    /* renamed from: a */
    private final Executor f30674a;

    /* renamed from: b */
    private final ScheduledExecutorService f30675b;

    /* renamed from: c */
    private final mb3<w61> f30676c;

    /* renamed from: d */
    private volatile boolean f30677d = true;

    public d71(Executor executor, ScheduledExecutorService scheduledExecutorService, mb3<w61> mb3) {
        this.f30674a = executor;
        this.f30675b = scheduledExecutorService;
        this.f30676c = mb3;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m31262b(d71 d71, List list, xa3 xa3) {
        if (list == null || list.isEmpty()) {
            d71.f30674a.execute(new a71(xa3));
            return;
        }
        mb3<O> i = bb3.m30649i(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i = bb3.m30654n(bb3.m30647g(i, Throwable.class, new y61(xa3), d71.f30674a), new x61(d71, xa3, (mb3) it.next()), d71.f30674a);
        }
        bb3.m30658r(i, new c71(d71, xa3), d71.f30674a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ mb3 mo31124a(xa3 xa3, mb3 mb3, o61 o61) throws Exception {
        if (o61 != null) {
            xa3.zzb(o61);
        }
        return bb3.m30655o(mb3, q20.f37837b.mo34648e().longValue(), TimeUnit.MILLISECONDS, this.f30675b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo31125d() {
        this.f30677d = false;
    }

    /* renamed from: e */
    public final void mo31126e(xa3<o61> xa3) {
        bb3.m30658r(this.f30676c, new b71(this, xa3), this.f30674a);
    }

    /* renamed from: f */
    public final boolean mo31127f() {
        return this.f30677d;
    }
}
