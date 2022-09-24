package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.extractor.SeekMap;

/* renamed from: com.google.android.exoplayer2.source.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6875p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ProgressiveMediaPeriod f27574b;

    /* renamed from: c */
    public final /* synthetic */ SeekMap f27575c;

    public /* synthetic */ C6875p(ProgressiveMediaPeriod progressiveMediaPeriod, SeekMap seekMap) {
        this.f27574b = progressiveMediaPeriod;
        this.f27575c = seekMap;
    }

    public final void run() {
        this.f27574b.lambda$seekMap$1(this.f27575c);
    }
}
