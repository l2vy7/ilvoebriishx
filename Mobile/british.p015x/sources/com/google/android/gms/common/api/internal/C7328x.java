package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C7210g;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.x */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7328x implements C7210g.C7211a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f29180a;

    /* renamed from: b */
    final /* synthetic */ C7336z f29181b;

    C7328x(C7336z zVar, BasePendingResult basePendingResult) {
        this.f29181b = zVar;
        this.f29180a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo29787a(Status status) {
        this.f29181b.f29202a.remove(this.f29180a);
    }
}
