package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C5004d4;
import com.startapp.C5126w2;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import java.util.List;

/* renamed from: com.startapp.sdk.adsbase.cache.j */
/* compiled from: Sta */
public class C12274j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f54552a;

    /* renamed from: b */
    public final /* synthetic */ DiskAdCacheManager.C12264b f54553b;

    /* renamed from: com.startapp.sdk.adsbase.cache.j$a */
    /* compiled from: Sta */
    public class C12275a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f54554a;

        public C12275a(List list) {
            this.f54554a = list;
        }

        public void run() {
            DiskAdCacheManager.C12264b bVar = C12274j.this.f54553b;
            List<DiskAdCacheManager.DiskCacheKey> list = this.f54554a;
            C12266a aVar = (C12266a) bVar;
            aVar.getClass();
            if (list != null) {
                try {
                    for (DiskAdCacheManager.DiskCacheKey diskCacheKey : list) {
                        if (aVar.f54541b.mo21049a(diskCacheKey.placement)) {
                            aVar.f54541b.mo21046a(aVar.f54540a, (StartAppAd) null, diskCacheKey.placement, diskCacheKey.adPreferences, (C5059d.C5060d) null, true, diskCacheKey.mo46164a());
                        }
                    }
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
            C5059d dVar = aVar.f54541b;
            Context context = aVar.f54540a;
            dVar.f22350d = false;
            for (C5059d.C5064e eVar : dVar.f22351e) {
                if (dVar.mo21049a(eVar.f22361b)) {
                    dVar.mo21046a(context, eVar.f22360a, eVar.f22361b, eVar.f22362c, new C12268c(dVar, eVar), false, 0);
                }
            }
            dVar.f22351e.clear();
        }
    }

    public C12274j(Context context, DiskAdCacheManager.C12264b bVar) {
        this.f54552a = context;
        this.f54553b = bVar;
    }

    public void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new C12275a(C5126w2.m23396d(this.f54552a, DiskAdCacheManager.m53191b())));
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }
}
