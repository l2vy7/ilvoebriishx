package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.common.collect.C4766t;

/* renamed from: com.google.android.exoplayer2.l0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6730l0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaPeriodQueue f27446b;

    /* renamed from: c */
    public final /* synthetic */ C4766t.C4768a f27447c;

    /* renamed from: d */
    public final /* synthetic */ MediaSource.MediaPeriodId f27448d;

    public /* synthetic */ C6730l0(MediaPeriodQueue mediaPeriodQueue, C4766t.C4768a aVar, MediaSource.MediaPeriodId mediaPeriodId) {
        this.f27446b = mediaPeriodQueue;
        this.f27447c = aVar;
        this.f27448d = mediaPeriodId;
    }

    public final void run() {
        this.f27446b.lambda$notifyQueueUpdate$0(this.f27447c, this.f27448d);
    }
}
