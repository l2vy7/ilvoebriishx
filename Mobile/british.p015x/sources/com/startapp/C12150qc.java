package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.qc */
/* compiled from: Sta */
public class C12150qc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f54074a;

    public C12150qc(VideoMode videoMode) {
        this.f54074a = videoMode;
    }

    public void run() {
        VideoMode videoMode = this.f54074a;
        if (videoMode.f54325K != null) {
            videoMode.f54330P = !videoMode.f54330P;
            videoMode.mo45999L();
            VideoMode videoMode2 = this.f54074a;
            videoMode2.mo46010a(videoMode2.f54330P);
        }
    }
}
