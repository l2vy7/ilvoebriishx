package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.v0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7321v0 implements C7206f.C7208b {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f29158b;

    /* renamed from: c */
    final /* synthetic */ C7305s f29159c;

    /* renamed from: d */
    final /* synthetic */ C7217a1 f29160d;

    C7321v0(C7217a1 a1Var, AtomicReference atomicReference, C7305s sVar) {
        this.f29160d = a1Var;
        this.f29158b = atomicReference;
        this.f29159c = sVar;
    }

    public final void onConnected(Bundle bundle) {
        this.f29160d.m29572C((C7206f) C4604n.m20098k((C7206f) this.f29158b.get()), this.f29159c, true);
    }

    public final void onConnectionSuspended(int i) {
    }
}
