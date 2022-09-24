package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;

/* renamed from: com.google.android.exoplayer2.source.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6826a implements MediaSource.MediaSourceCaller {

    /* renamed from: b */
    public final /* synthetic */ CompositeMediaSource f27511b;

    /* renamed from: c */
    public final /* synthetic */ Object f27512c;

    public /* synthetic */ C6826a(CompositeMediaSource compositeMediaSource, Object obj) {
        this.f27511b = compositeMediaSource;
        this.f27512c = obj;
    }

    public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
        this.f27511b.lambda$prepareChildSource$0(this.f27512c, mediaSource, timeline);
    }
}
