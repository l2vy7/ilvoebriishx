package com.startapp;

import android.os.Handler;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* renamed from: com.startapp.mc */
/* compiled from: Sta */
public class C12060mc implements Runnable {

    /* renamed from: a */
    public boolean f53303a;

    /* renamed from: b */
    public final int f53304b;

    /* renamed from: c */
    public final /* synthetic */ VideoMode f53305c;

    public C12060mc(VideoMode videoMode) {
        this.f53305c = videoMode;
        this.f53304b = videoMode.mo46015d(AdsCommonMetaData.m23014k().mo20877G().mo21004k());
    }

    public void run() {
        try {
            VideoPlayerInterface videoPlayerInterface = this.f53305c.f54325K;
            int currentPosition = videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f54422g.getCurrentPosition() : 0;
            int i = currentPosition + 50;
            long c = this.f53305c.mo46014c(i);
            long j = 0;
            int i2 = (c > 0 ? 1 : (c == 0 ? 0 : -1));
            if (i2 >= 0 && !this.f53303a) {
                if (i2 != 0) {
                    VideoMode videoMode = this.f53305c;
                    if (((long) videoMode.f54331Q) < videoMode.mo46019y().mo45975g()) {
                        C5015nb.m22916a(this.f53305c.f52561v, true, "videoApi.setSkipTimer", Long.valueOf(c));
                    }
                }
                this.f53303a = true;
                C5015nb.m22916a(this.f53305c.f52561v, true, "videoApi.setSkipTimer", 0);
            }
            VideoMode videoMode2 = this.f53305c;
            if (videoMode2.f54345e0 && currentPosition >= this.f53304b) {
                videoMode2.mo45123u();
            }
            int i3 = i / 1000;
            C5015nb.m22916a(this.f53305c.f52561v, true, "videoApi.setVideoCurrentPosition", Integer.valueOf(i3));
            if (i3 < ((NativeVideoPlayer) this.f53305c.f54325K).f54422g.getDuration() / 1000) {
                VideoMode videoMode3 = this.f53305c;
                Handler handler = videoMode3.f54353m0;
                VideoPlayerInterface videoPlayerInterface2 = videoMode3.f54325K;
                if (videoPlayerInterface2 != null) {
                    j = (long) (1000 - (((NativeVideoPlayer) videoPlayerInterface2).f54422g.getCurrentPosition() % 1000));
                }
                handler.postDelayed(this, j);
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }
}
