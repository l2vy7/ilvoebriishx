package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.BandwidthMeter;

/* renamed from: com.google.android.exoplayer2.upstream.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6989b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener f27657b;

    /* renamed from: c */
    public final /* synthetic */ int f27658c;

    /* renamed from: d */
    public final /* synthetic */ long f27659d;

    /* renamed from: e */
    public final /* synthetic */ long f27660e;

    public /* synthetic */ C6989b(BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener, int i, long j, long j2) {
        this.f27657b = handlerAndListener;
        this.f27658c = i;
        this.f27659d = j;
        this.f27660e = j2;
    }

    public final void run() {
        this.f27657b.listener.onBandwidthSample(this.f27658c, this.f27659d, this.f27660e);
    }
}
