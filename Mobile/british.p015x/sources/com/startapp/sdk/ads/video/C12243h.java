package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.sdk.adsbase.C5068d;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.cache.C5065h;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.sdk.ads.video.h */
/* compiled from: Sta */
public class C12243h {

    /* renamed from: a */
    public LinkedList<CachedVideoAd> f54409a = new LinkedList<>();

    /* renamed from: b */
    public final Context f54410b;

    /* renamed from: c */
    public final Executor f54411c;

    /* renamed from: d */
    public final C5059d f54412d;

    public C12243h(Context context, Executor executor, C5059d dVar) {
        this.f54410b = context;
        this.f54411c = executor;
        this.f54412d = dVar;
    }

    /* renamed from: a */
    public boolean mo46037a(int i) {
        ArrayList arrayList;
        boolean z;
        Iterator it = this.f54409a.iterator();
        boolean z2 = false;
        while (it.hasNext() && this.f54409a.size() > i) {
            CachedVideoAd cachedVideoAd = (CachedVideoAd) it.next();
            C5059d dVar = this.f54412d;
            String a = cachedVideoAd.mo46159a();
            synchronized (dVar) {
                arrayList = new ArrayList(dVar.f22347a.values());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                C5068d dVar2 = ((C5065h) it2.next()).f22368e;
                if (dVar2 instanceof VideoEnabledAd) {
                    VideoEnabledAd videoEnabledAd = (VideoEnabledAd) dVar2;
                    if (!(videoEnabledAd.mo45987w() == null || videoEnabledAd.mo45987w().mo45971c() == null || !videoEnabledAd.mo45987w().mo45971c().equals(a))) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                it.remove();
                if (cachedVideoAd.mo46159a() != null) {
                    new File(cachedVideoAd.mo46159a()).delete();
                }
                z2 = true;
            }
        }
        return z2;
    }
}
