package com.google.ads.interactivemedia.p039v3.api;

import com.google.ads.interactivemedia.p039v3.api.player.VideoAdPlayer;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdDisplayContainer */
/* compiled from: IMASDK */
public interface AdDisplayContainer extends BaseDisplayContainer {
    VideoAdPlayer getPlayer();

    @Deprecated
    void setPlayer(VideoAdPlayer videoAdPlayer);
}
