package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.cache.C5065h;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.startapp.b */
/* compiled from: Sta */
public class C11793b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f52593a;

    /* renamed from: b */
    public final /* synthetic */ C5059d f52594b;

    public C11793b(C5059d dVar, Context context) {
        this.f52594b = dVar;
        this.f52593a = context;
    }

    public void run() {
        try {
            C5126w2.m23388a(this.f52593a, DiskAdCacheManager.m53191b());
            C5126w2.m23388a(this.f52593a, DiskAdCacheManager.m53188a());
            CacheKey cacheKey = null;
            for (Map.Entry next : this.f52594b.f22347a.entrySet()) {
                CacheKey cacheKey2 = (CacheKey) next.getKey();
                if (cacheKey2.mo21035a() == AdPreferences.Placement.INAPP_SPLASH) {
                    cacheKey = cacheKey2;
                } else {
                    C5065h hVar = (C5065h) next.getValue();
                    Context context = this.f52593a;
                    AdPreferences.Placement a = cacheKey2.mo21035a();
                    AdPreferences adPreferences = hVar.f22367d;
                    String b = this.f52594b.mo21050b(cacheKey2);
                    int i = hVar.f22376m;
                    DiskAdCacheManager.DiskCacheKey diskCacheKey = new DiskAdCacheManager.DiskCacheKey(a, adPreferences);
                    diskCacheKey.mo46165a(i);
                    String b2 = DiskAdCacheManager.m53191b();
                    if (b != null) {
                        C5126w2.m23391a(C5126w2.m23393b(context, b2), b, (Serializable) diskCacheKey);
                    }
                    Context context2 = this.f52593a;
                    String b3 = this.f52594b.mo21050b(cacheKey2);
                    DiskAdCacheManager.DiskCachedAd diskCachedAd = new DiskAdCacheManager.DiskCachedAd(hVar.f22368e);
                    String a2 = DiskAdCacheManager.m53188a();
                    if (b3 != null) {
                        try {
                            C5126w2.m23391a(C5126w2.m23393b(context2, a2), b3, (Serializable) diskCachedAd);
                        } catch (Throwable th) {
                            if (C5126w2.m23392a(4)) {
                                C5004d4.m22887a(th);
                            }
                        }
                    }
                }
            }
            if (cacheKey != null) {
                this.f52594b.f22347a.remove(cacheKey);
            }
        } catch (Throwable th2) {
            C5004d4.m22887a(th2);
        }
    }
}
