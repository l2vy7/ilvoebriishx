package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.splash.C12216a;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.C5073c;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;

/* renamed from: com.startapp.x9 */
/* compiled from: Sta */
public class C12432x9 implements C5073c {

    /* renamed from: a */
    public final /* synthetic */ Runnable f55132a;

    /* renamed from: b */
    public final /* synthetic */ CacheKey f55133b;

    /* renamed from: c */
    public final /* synthetic */ SplashEventHandler f55134c;

    public C12432x9(SplashEventHandler splashEventHandler, Runnable runnable, CacheKey cacheKey) {
        this.f55134c = splashEventHandler;
        this.f55132a = runnable;
        this.f55133b = cacheKey;
    }

    /* renamed from: a */
    public void mo20651a(MetaDataRequest.RequestReason requestReason, boolean z) {
        SplashEventHandler splashEventHandler = this.f55134c;
        Runnable runnable = this.f55132a;
        CacheKey cacheKey = this.f55133b;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new C12216a(splashEventHandler, runnable, cacheKey));
    }

    /* renamed from: a */
    public void mo20650a(MetaDataRequest.RequestReason requestReason) {
        SplashEventHandler splashEventHandler = this.f55134c;
        Runnable runnable = this.f55132a;
        CacheKey cacheKey = this.f55133b;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new C12216a(splashEventHandler, runnable, cacheKey));
    }
}
