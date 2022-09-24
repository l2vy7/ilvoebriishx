package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C5004d4;
import com.startapp.C5126w2;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;

/* renamed from: com.startapp.sdk.adsbase.cache.i */
/* compiled from: Sta */
public class C12272i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f54549a;

    /* renamed from: b */
    public final /* synthetic */ DiskAdCacheManager.C12265c f54550b;

    /* renamed from: com.startapp.sdk.adsbase.cache.i$a */
    /* compiled from: Sta */
    public class C12273a implements Runnable {
        public C12273a() {
        }

        public void run() {
            ((C12267b) C12272i.this.f54550b).f54542a.f22349c = false;
        }
    }

    public C12272i(Context context, DiskAdCacheManager.C12265c cVar) {
        this.f54549a = context;
        this.f54550b = cVar;
    }

    public void run() {
        try {
            C5126w2.m23388a(this.f54549a, "startapp_ads");
            new Handler(Looper.getMainLooper()).post(new C12273a());
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }
}
