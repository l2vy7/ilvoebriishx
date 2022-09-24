package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7377d;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7262j0 extends C7228c1 {

    /* renamed from: b */
    final /* synthetic */ C7377d.C7380c f29030b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7262j0(C7267k0 k0Var, C7222b1 b1Var, C7377d.C7380c cVar) {
        super(b1Var);
        this.f29030b = cVar;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo29838a() {
        this.f29030b.mo29866a(new ConnectionResult(16, (PendingIntent) null));
    }
}
