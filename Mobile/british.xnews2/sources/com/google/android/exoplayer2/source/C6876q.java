package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* renamed from: com.google.android.exoplayer2.source.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6876q implements DrmSessionManagerProvider {

    /* renamed from: a */
    public final /* synthetic */ DrmSessionManager f27576a;

    public /* synthetic */ C6876q(DrmSessionManager drmSessionManager) {
        this.f27576a = drmSessionManager;
    }

    public final DrmSessionManager get(MediaItem mediaItem) {
        return ProgressiveMediaSource.Factory.lambda$setDrmSessionManager$2(this.f27576a, mediaItem);
    }
}
