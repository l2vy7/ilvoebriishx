package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6901b implements DrmSessionManagerProvider {

    /* renamed from: a */
    public final /* synthetic */ DrmSessionManager f27598a;

    public /* synthetic */ C6901b(DrmSessionManager drmSessionManager) {
        this.f27598a = drmSessionManager;
    }

    public final DrmSessionManager get(MediaItem mediaItem) {
        return SsMediaSource.Factory.lambda$setDrmSessionManager$0(this.f27598a, mediaItem);
    }
}
