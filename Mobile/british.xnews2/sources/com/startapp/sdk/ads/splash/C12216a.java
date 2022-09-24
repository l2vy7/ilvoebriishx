package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;

/* renamed from: com.startapp.sdk.ads.splash.a */
/* compiled from: Sta */
public class C12216a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f54314a;

    /* renamed from: b */
    public final /* synthetic */ CacheKey f54315b;

    /* renamed from: c */
    public final /* synthetic */ SplashEventHandler f54316c;

    public C12216a(SplashEventHandler splashEventHandler, Runnable runnable, CacheKey cacheKey) {
        this.f54316c = splashEventHandler;
        this.f54314a = runnable;
        this.f54315b = cacheKey;
    }

    public void run() {
        SplashEventHandler splashEventHandler = this.f54316c;
        splashEventHandler.f54281h = true;
        if (splashEventHandler.f54282i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
            splashEventHandler.mo45942a(this.f54314a, this.f54315b);
        }
    }
}
