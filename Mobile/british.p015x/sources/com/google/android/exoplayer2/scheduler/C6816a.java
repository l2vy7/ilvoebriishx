package com.google.android.exoplayer2.scheduler;

import com.google.android.exoplayer2.scheduler.RequirementsWatcher;

/* renamed from: com.google.android.exoplayer2.scheduler.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6816a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RequirementsWatcher.NetworkCallback f27507b;

    public /* synthetic */ C6816a(RequirementsWatcher.NetworkCallback networkCallback) {
        this.f27507b = networkCallback;
    }

    public final void run() {
        this.f27507b.lambda$postCheckRequirements$0();
    }
}
