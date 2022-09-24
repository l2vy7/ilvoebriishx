package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* renamed from: com.startapp.uc */
/* compiled from: Sta */
public class C12376uc implements VideoPlayerInterface.C12249a {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f54852a;

    public C12376uc(VideoMode videoMode) {
        this.f54852a = videoMode;
    }

    /* renamed from: a */
    public void mo46667a(int i) {
        VideoMode videoMode;
        VideoPlayerInterface videoPlayerInterface;
        VideoPlayerInterface videoPlayerInterface2 = this.f54852a.f54325K;
        int duration = videoPlayerInterface2 != null ? ((NativeVideoPlayer) videoPlayerInterface2).f54422g.getDuration() : 0;
        VideoMode videoMode2 = this.f54852a;
        if (videoMode2.f54345e0 && videoMode2.f54346f0 && duration > 0) {
            videoMode2.f54344d0 = i;
            int currentPosition = (((NativeVideoPlayer) videoMode2.f54325K).f54422g.getCurrentPosition() * 100) / duration;
            if (this.f54852a.mo45993F()) {
                VideoMode videoMode3 = this.f54852a;
                if (videoMode3.f54347g0 || !videoMode3.mo45991D()) {
                    int i2 = this.f54852a.f54344d0;
                    if (i2 == 100 || i2 - currentPosition > AdsCommonMetaData.f22242h.mo20877G().mo21000h()) {
                        VideoMode videoMode4 = this.f54852a;
                        videoMode4.mo46003P();
                        videoMode4.mo46005R();
                        return;
                    }
                    return;
                }
                this.f54852a.mo46004Q();
                return;
            }
            int i3 = this.f54852a.f54344d0;
            if (i3 < 100 && i3 - currentPosition <= AdsCommonMetaData.f22242h.mo20877G().mo21002i() && (videoPlayerInterface = videoMode.f54325K) != null) {
                ((NativeVideoPlayer) videoPlayerInterface).f54422g.pause();
                (videoMode = this.f54852a).mo46002O();
            }
        }
    }
}
