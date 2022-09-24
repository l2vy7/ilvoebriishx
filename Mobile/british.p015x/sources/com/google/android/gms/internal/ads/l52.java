package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l52 implements r42<v31> {

    /* renamed from: a */
    private final o31 f34910a;

    /* renamed from: b */
    private final Context f34911b;

    /* renamed from: c */
    private final vs1 f34912c;

    /* renamed from: d */
    private final Executor f34913d;

    public l52(o31 o31, Context context, Executor executor, vs1 vs1) {
        this.f34911b = context;
        this.f34910a = o31;
        this.f34913d = executor;
        this.f34912c = vs1;
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        nr2 nr2 = ir2.f33494t;
        return (nr2 == null || nr2.f36095a == null) ? false : true;
    }

    /* renamed from: b */
    public final mb3<v31> mo31510b(ur2 ur2, ir2 ir2) {
        return bb3.m30654n(bb3.m30649i(null), new k52(this, ur2, ir2), this.f34913d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo33282c(ur2 ur2, ir2 ir2, Object obj) throws Exception {
        zzbfi a = fs2.m32243a(this.f34911b, ir2.f33496v);
        xt0 a2 = this.f34912c.mo35491a(a, ir2, ur2.f39937b.f39519b);
        h31 a3 = this.f34910a.mo33832a(new e71(ur2, ir2, (String) null), new i31((View) a2, a2, fs2.m32245c(a), ir2.f33461X, ir2.f33467b0, ir2.f33449L));
        a3.mo31424i().mo35267i(a2, false, (h70) null);
        fb1 b = a3.mo30387b();
        i52 i52 = new i52(a2);
        nb3 nb3 = po0.f37727f;
        b.mo30921s0(i52, nb3);
        a3.mo31424i();
        nr2 nr2 = ir2.f33494t;
        return bb3.m30653m(us1.m38435j(a2, nr2.f36096b, nr2.f36095a), new j52(a3), nb3);
    }
}
