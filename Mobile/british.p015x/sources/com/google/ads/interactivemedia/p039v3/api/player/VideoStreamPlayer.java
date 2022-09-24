package com.google.ads.interactivemedia.p039v3.api.player;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer */
/* compiled from: IMASDK */
public interface VideoStreamPlayer extends ContentProgressProvider, VolumeProvider {

    /* renamed from: com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer$VideoStreamPlayerCallback */
    /* compiled from: IMASDK */
    public interface VideoStreamPlayerCallback {
        void onContentComplete();

        void onPause();

        void onResume();

        void onUserTextReceived(String str);

        void onVolumeChanged(int i);
    }

    void addCallback(VideoStreamPlayerCallback videoStreamPlayerCallback);

    void loadUrl(String str, List<HashMap<String, String>> list);

    void onAdBreakEnded();

    void onAdBreakStarted();

    void onAdPeriodEnded();

    void onAdPeriodStarted();

    void pause();

    void removeCallback(VideoStreamPlayerCallback videoStreamPlayerCallback);

    void resume();

    void seek(long j);
}
