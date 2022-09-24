package com.startapp.sdk.ads.video;

import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* renamed from: com.startapp.sdk.ads.video.i */
/* compiled from: Sta */
public class C12244i implements VideoPlayerInterface.C12250b {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f54413a;

    public C12244i(VideoMode videoMode) {
        this.f54413a = videoMode;
    }

    /* renamed from: a */
    public void mo46038a() {
        if (!this.f54413a.mo45996I()) {
            this.f54413a.mo46008a(VideoMode.VideoFinishedReason.COMPLETE);
        }
        VideoPlayerInterface videoPlayerInterface = this.f54413a.f54325K;
        if (videoPlayerInterface != null) {
            ((NativeVideoPlayer) videoPlayerInterface).f54422g.stopPlayback();
        }
    }
}
