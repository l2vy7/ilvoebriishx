package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.SplashScreen;

/* renamed from: com.startapp.sdk.ads.splash.e */
/* compiled from: Sta */
public class C12220e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SplashScreen f54323a;

    public C12220e(SplashScreen splashScreen) {
        this.f54323a = splashScreen;
    }

    public void run() {
        SplashScreen splashScreen = this.f54323a;
        SplashEventHandler splashEventHandler = splashScreen.f54297b;
        SplashScreen.SplashStartAppAd splashStartAppAd = splashScreen.f54303h;
        if (splashEventHandler.f54282i == SplashEventHandler.SplashState.DISPLAYED && !splashEventHandler.f54279f) {
            splashStartAppAd.close();
            splashEventHandler.f54282i = SplashEventHandler.SplashState.HIDDEN;
            splashEventHandler.mo45943b();
        }
    }
}
