package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.dash.DashMediaSource;

/* renamed from: com.google.android.exoplayer2.source.dash.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6846c implements DrmSessionManagerProvider {

    /* renamed from: a */
    public final /* synthetic */ DrmSessionManager f27535a;

    public /* synthetic */ C6846c(DrmSessionManager drmSessionManager) {
        this.f27535a = drmSessionManager;
    }

    public final DrmSessionManager get(MediaItem mediaItem) {
        return DashMediaSource.Factory.lambda$setDrmSessionManager$0(this.f27535a, mediaItem);
    }
}
