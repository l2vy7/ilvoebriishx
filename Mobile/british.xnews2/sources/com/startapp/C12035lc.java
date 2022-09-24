package com.startapp;

import android.os.Handler;
import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.lc */
/* compiled from: Sta */
public class C12035lc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f53255a;

    public C12035lc(VideoMode videoMode) {
        this.f53255a = videoMode;
    }

    public void run() {
        int N = this.f53255a.mo46001N();
        if (N >= 1000) {
            Handler handler = this.f53255a.f54353m0;
            long j = 1000;
            long j2 = ((long) N) % 1000;
            if (j2 != 0) {
                j = j2;
            }
            handler.postDelayed(this, j + 50);
        }
    }
}
