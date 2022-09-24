package com.google.ads.interactivemedia.p039v3.api;

import com.google.ads.interactivemedia.p039v3.api.player.VideoStreamPlayer;

/* renamed from: com.google.ads.interactivemedia.v3.api.StreamDisplayContainer */
/* compiled from: IMASDK */
public interface StreamDisplayContainer extends BaseDisplayContainer {
    VideoStreamPlayer getVideoStreamPlayer();

    @Deprecated
    void setVideoStreamPlayer(VideoStreamPlayer videoStreamPlayer);
}
