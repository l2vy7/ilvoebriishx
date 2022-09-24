package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;

/* renamed from: com.google.android.exoplayer2.m0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6732m0 implements MediaSource.MediaSourceCaller {

    /* renamed from: b */
    public final /* synthetic */ MediaSourceList f27451b;

    public /* synthetic */ C6732m0(MediaSourceList mediaSourceList) {
        this.f27451b = mediaSourceList;
    }

    public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
        this.f27451b.lambda$prepareChildSource$0(mediaSource, timeline);
    }
}
