package com.startapp;

import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.C5065h;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.m1 */
/* compiled from: Sta */
public class C12041m1 extends C12068n1 {

    /* renamed from: e */
    public final FailuresHandler f53258e = CacheMetaData.m23190b().mo21039a().mo21028c();

    /* renamed from: f */
    public int f53259f = 0;

    /* renamed from: g */
    public boolean f53260g = false;

    public C12041m1(C5065h hVar) {
        super(hVar);
    }

    /* renamed from: a */
    public boolean mo45529a() {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        if (!(startAppSDKInternal.f22271c && !startAppSDKInternal.f22272d && !startAppSDKInternal.f22274f)) {
            return false;
        }
        FailuresHandler failuresHandler = this.f53258e;
        if (!((failuresHandler == null || failuresHandler.mo46170a() == null) ? false : true)) {
            return false;
        }
        if (this.f53260g) {
            return this.f53258e.mo46171b();
        }
        return true;
    }

    /* renamed from: b */
    public long mo45530b() {
        Long l;
        if (this.f53259f >= this.f53258e.mo46170a().size() || (l = this.f53321c) == null) {
            return -1;
        }
        long millis = TimeUnit.SECONDS.toMillis((long) this.f53258e.mo46170a().get(this.f53259f).intValue()) - (System.currentTimeMillis() - l.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0;
    }

    /* renamed from: c */
    public void mo45531c() {
        if (this.f53259f == this.f53258e.mo46170a().size() - 1) {
            this.f53260g = true;
        } else {
            this.f53259f++;
        }
        super.mo45531c();
    }

    /* renamed from: f */
    public void mo45532f() {
        mo45561e();
        this.f53259f = 0;
        this.f53260g = false;
    }
}
