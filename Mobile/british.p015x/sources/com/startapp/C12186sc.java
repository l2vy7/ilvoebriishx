package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.sc */
/* compiled from: Sta */
public class C12186sc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f54150a;

    public C12186sc(VideoMode videoMode) {
        this.f54150a = videoMode;
    }

    public void run() {
        VideoMode videoMode = this.f54150a;
        if (videoMode.f54325K != null) {
            videoMode.f52555E++;
            videoMode.f54326L.setVisibility(0);
            VideoMode videoMode2 = this.f54150a;
            videoMode2.f54334T = false;
            videoMode2.f54331Q = 0;
            C5015nb.m22916a(videoMode2.f52561v, true, "videoApi.setVideoCurrentPosition", 0);
            C5015nb.m22916a(videoMode2.f52561v, true, "videoApi.setSkipTimer", 0);
            this.f54150a.mo46000M();
        }
    }
}
