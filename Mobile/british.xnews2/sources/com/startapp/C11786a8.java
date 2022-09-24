package com.startapp;

import com.startapp.sdk.ads.video.C12237d;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* renamed from: com.startapp.a8 */
/* compiled from: Sta */
public class C11786a8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f52585a;

    /* renamed from: b */
    public final /* synthetic */ C12237d f52586b;

    public C11786a8(C12237d dVar, int i) {
        this.f52586b = dVar;
        this.f52585a = i;
    }

    public void run() {
        VideoPlayerInterface.C12249a aVar = this.f52586b.f54397b;
        if (aVar != null) {
            ((C12376uc) aVar).mo46667a(this.f52585a);
        }
    }
}
