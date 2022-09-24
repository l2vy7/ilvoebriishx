package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

/* renamed from: com.startapp.kc */
/* compiled from: Sta */
public class C12017kc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoListener f53214a;

    public C12017kc(VideoListener videoListener, Context context) {
        this.f53214a = videoListener;
    }

    public void run() {
        try {
            this.f53214a.onVideoCompleted();
        } catch (Throwable th) {
            C5015nb.m22918a((Object) this.f53214a, th);
        }
    }
}
