package com.google.ads.interactivemedia.p039v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.p039v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p039v3.api.player.VideoStreamPlayer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ex */
/* compiled from: IMASDK */
public final class C3977ex extends C3932df implements StreamDisplayContainer {

    /* renamed from: a */
    private VideoStreamPlayer f17019a;

    public C3977ex(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        super(viewGroup);
        this.f17019a = videoStreamPlayer;
    }

    public final VideoStreamPlayer getVideoStreamPlayer() {
        return this.f17019a;
    }

    public final void setVideoStreamPlayer(VideoStreamPlayer videoStreamPlayer) {
        ars.m14627g(videoStreamPlayer);
        this.f17019a = videoStreamPlayer;
    }
}
