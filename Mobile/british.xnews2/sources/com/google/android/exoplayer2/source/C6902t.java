package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.source.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6902t implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C6902t f27599a = new C6902t();

    private /* synthetic */ C6902t() {
    }

    public final void accept(Object obj) {
        ((SampleQueue.SharedSampleMetadata) obj).drmSessionReference.release();
    }
}
