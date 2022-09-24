package com.google.android.exoplayer2.scheduler;

import com.google.android.exoplayer2.scheduler.RequirementsWatcher;

/* renamed from: com.google.android.exoplayer2.scheduler.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6817b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RequirementsWatcher.NetworkCallback f27508b;

    public /* synthetic */ C6817b(RequirementsWatcher.NetworkCallback networkCallback) {
        this.f27508b = networkCallback;
    }

    public final void run() {
        this.f27508b.lambda$postRecheckNotMetNetworkRequirements$1();
    }
}
