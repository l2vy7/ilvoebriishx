package com.startapp;

import com.startapp.sdk.adsbase.C5068d;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.C5065h;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* renamed from: com.startapp.o1 */
/* compiled from: Sta */
public class C12103o1 extends C12068n1 {
    public C12103o1(C5065h hVar) {
        super(hVar);
    }

    /* renamed from: a */
    public boolean mo45529a() {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        return startAppSDKInternal.f22271c && !startAppSDKInternal.f22274f && (!startAppSDKInternal.f22272d || (this.f53319a.f22364a == AdPreferences.Placement.INAPP_RETURN && CacheMetaData.f22345a.mo21039a().mo21033g()));
    }

    /* renamed from: b */
    public long mo45530b() {
        C5068d dVar = this.f53319a.f22368e;
        if (dVar == null) {
            return -1;
        }
        Long c = dVar.mo21077c();
        Long b = dVar.mo21076b();
        if (c == null || b == null) {
            return -1;
        }
        long longValue = c.longValue() - (System.currentTimeMillis() - b.longValue());
        if (longValue >= 0) {
            return longValue;
        }
        return 0;
    }
}
