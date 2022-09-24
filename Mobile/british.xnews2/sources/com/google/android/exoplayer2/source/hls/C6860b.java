package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;

/* renamed from: com.google.android.exoplayer2.source.hls.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6860b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ HlsSampleStreamWrapper.Callback f27548b;

    public /* synthetic */ C6860b(HlsSampleStreamWrapper.Callback callback) {
        this.f27548b = callback;
    }

    public final void run() {
        this.f27548b.onPrepared();
    }
}
