package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;

/* renamed from: com.google.android.exoplayer2.source.hls.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6859a implements DrmSessionManagerProvider {

    /* renamed from: a */
    public final /* synthetic */ DrmSessionManager f27547a;

    public /* synthetic */ C6859a(DrmSessionManager drmSessionManager) {
        this.f27547a = drmSessionManager;
    }

    public final DrmSessionManager get(MediaItem mediaItem) {
        return HlsMediaSource.Factory.lambda$setDrmSessionManager$0(this.f27547a, mediaItem);
    }
}
