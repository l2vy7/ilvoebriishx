package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C5004d4;
import com.startapp.C5126w2;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;

/* renamed from: com.startapp.sdk.adsbase.cache.k */
/* compiled from: Sta */
public class C12276k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f54556a;

    /* renamed from: b */
    public final /* synthetic */ String f54557b;

    /* renamed from: c */
    public final /* synthetic */ AdEventListener f54558c;

    /* renamed from: d */
    public final /* synthetic */ DiskAdCacheManager.C12263a f54559d;

    /* renamed from: com.startapp.sdk.adsbase.cache.k$a */
    /* compiled from: Sta */
    public class C12277a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ DiskAdCacheManager.DiskCachedAd f54560a;

        public C12277a(DiskAdCacheManager.DiskCachedAd diskCachedAd) {
            this.f54560a = diskCachedAd;
        }

        public void run() {
            try {
                DiskAdCacheManager.DiskCachedAd diskCachedAd = this.f54560a;
                if (diskCachedAd == null) {
                    C12276k kVar = C12276k.this;
                    DiskAdCacheManager.m53189a(kVar.f54556a, kVar.f54558c);
                    return;
                }
                if (diskCachedAd.mo46166a() != null) {
                    if (this.f54560a.mo46166a().isReady()) {
                        if (this.f54560a.mo46166a().mo21078d()) {
                            C12276k kVar2 = C12276k.this;
                            DiskAdCacheManager.m53189a(kVar2.f54556a, kVar2.f54558c);
                            return;
                        }
                        C12276k kVar3 = C12276k.this;
                        DiskAdCacheManager.m53190a(kVar3.f54556a, this.f54560a, kVar3.f54559d, kVar3.f54558c);
                        return;
                    }
                }
                C12276k kVar4 = C12276k.this;
                DiskAdCacheManager.m53189a(kVar4.f54556a, kVar4.f54558c);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                C12276k kVar5 = C12276k.this;
                DiskAdCacheManager.m53189a(kVar5.f54556a, kVar5.f54558c);
            }
        }
    }

    public C12276k(Context context, String str, AdEventListener adEventListener, DiskAdCacheManager.C12263a aVar) {
        this.f54556a = context;
        this.f54557b = str;
        this.f54558c = adEventListener;
        this.f54559d = aVar;
    }

    public void run() {
        Object obj;
        try {
            Context context = this.f54556a;
            String a = DiskAdCacheManager.m53188a();
            String str = this.f54557b;
            obj = null;
            if (str != null) {
                obj = C5126w2.m23387a(C5126w2.m23393b(context, a), str);
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            DiskAdCacheManager.m53189a(this.f54556a, this.f54558c);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new C12277a((DiskAdCacheManager.DiskCachedAd) obj));
    }
}
