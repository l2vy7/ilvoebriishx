package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.upstream.cache.CacheWriter;

/* renamed from: com.google.android.exoplayer2.offline.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6806p implements CacheWriter.ProgressListener {

    /* renamed from: a */
    public final /* synthetic */ ProgressiveDownloader f27501a;

    public /* synthetic */ C6806p(ProgressiveDownloader progressiveDownloader) {
        this.f27501a = progressiveDownloader;
    }

    public final void onProgress(long j, long j2, long j3) {
        this.f27501a.onProgress(j, j2, j3);
    }
}
