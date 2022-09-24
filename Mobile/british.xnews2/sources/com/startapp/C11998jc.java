package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* renamed from: com.startapp.jc */
/* compiled from: Sta */
public class C11998jc extends C11938h5 {

    /* renamed from: h */
    public Runnable f53180h = null;

    /* renamed from: i */
    public Runnable f53181i = null;

    /* renamed from: j */
    public Runnable f53182j = null;

    public C11998jc(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, Runnable runnable5, TrackingParams trackingParams, boolean z) {
        super(context, runnable, runnable2, trackingParams);
        this.f53180h = runnable3;
        this.f53181i = runnable4;
        this.f53182j = runnable5;
        this.f53035b = z;
    }

    @JavascriptInterface
    public void replayVideo() {
        if (this.f53180h != null) {
            new Handler(Looper.getMainLooper()).post(this.f53180h);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        if (this.f53181i != null) {
            new Handler(Looper.getMainLooper()).post(this.f53181i);
        }
    }

    @JavascriptInterface
    public void toggleSound() {
        if (this.f53182j != null) {
            new Handler(Looper.getMainLooper()).post(this.f53182j);
        }
    }
}
