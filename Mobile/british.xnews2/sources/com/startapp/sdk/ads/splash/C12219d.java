package com.startapp.sdk.ads.splash;

import com.startapp.C12432x9;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.C5073c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;

/* renamed from: com.startapp.sdk.ads.splash.d */
/* compiled from: Sta */
public class C12219d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SplashScreen f54322a;

    public C12219d(SplashScreen splashScreen) {
        this.f54322a = splashScreen;
    }

    public void run() {
        SplashScreen splashScreen = this.f54322a;
        SplashEventHandler splashEventHandler = splashScreen.f54297b;
        Runnable runnable = splashScreen.f54306k;
        CacheKey cacheKey = splashScreen.f54299d;
        splashEventHandler.f54276c = true;
        if (splashEventHandler.f54282i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
            C12432x9 x9Var = new C12432x9(splashEventHandler, runnable, cacheKey);
            synchronized (MetaData.f22400d) {
                if (MetaData.f22407k.f22410b) {
                    x9Var.mo20651a((MetaDataRequest.RequestReason) null, false);
                } else {
                    MetaData.f22407k.mo21186a((C5073c) x9Var);
                }
            }
            return;
        }
        splashEventHandler.mo45944c();
    }
}
