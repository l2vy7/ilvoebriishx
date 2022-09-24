package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.pc */
/* compiled from: Sta */
public class C12133pc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f54036a;

    public C12133pc(VideoMode videoMode) {
        this.f54036a = videoMode;
    }

    public void run() {
        try {
            this.f54036a.mo45123u();
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }
}
