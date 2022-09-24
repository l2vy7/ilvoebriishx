package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.C12451y9;
import com.startapp.C5004d4;
import com.startapp.C5009h0;
import com.startapp.C5116u5;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.lang.ref.WeakReference;

/* compiled from: Sta */
public class SplashEventHandler {

    /* renamed from: a */
    public final Context f54274a;

    /* renamed from: b */
    public final WeakReference<Activity> f54275b;

    /* renamed from: c */
    public boolean f54276c;

    /* renamed from: d */
    public boolean f54277d;

    /* renamed from: e */
    public boolean f54278e;

    /* renamed from: f */
    public boolean f54279f;

    /* renamed from: g */
    public boolean f54280g;

    /* renamed from: h */
    public boolean f54281h;

    /* renamed from: i */
    public SplashState f54282i;

    /* renamed from: j */
    public SplashHtml f54283j;

    /* renamed from: k */
    public final BroadcastReceiver f54284k;

    /* compiled from: Sta */
    public enum SplashState {
        LOADING,
        RECEIVED,
        DISPLAYED,
        HIDDEN,
        DO_NOT_DISPLAY
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashEventHandler$a */
    /* compiled from: Sta */
    public class C12207a implements C12451y9 {
        public C12207a() {
        }

        /* renamed from: a */
        public void mo45946a() {
            SplashEventHandler.this.mo45943b();
        }
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashEventHandler$b */
    /* compiled from: Sta */
    public class C12208b extends BroadcastReceiver {
        public C12208b() {
        }

        public void onReceive(Context context, Intent intent) {
            SplashEventHandler.this.f54279f = true;
        }
    }

    public SplashEventHandler(Activity activity) {
        this.f54276c = false;
        this.f54277d = true;
        this.f54278e = false;
        this.f54279f = false;
        this.f54280g = false;
        this.f54281h = false;
        this.f54282i = SplashState.LOADING;
        this.f54283j = null;
        this.f54284k = new C12208b();
        this.f54274a = C5009h0.m22893b(activity);
        this.f54275b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public void mo45942a(Runnable runnable, CacheKey cacheKey) {
        AdRulesResult a = AdaptMetaData.f54531a.mo46145a().mo21019a(AdPreferences.Placement.INAPP_SPLASH, (String) null);
        if (a.mo21025b()) {
            mo45941a(runnable);
            return;
        }
        this.f54282i = SplashState.DO_NOT_DISPLAY;
        if (cacheKey != null) {
            C5055a.m23154a(C5055a.m23159a(C5059d.f22346h.mo21043a(cacheKey)), (String) null, 0, a.mo21024a());
        }
        mo45944c();
    }

    /* renamed from: b */
    public void mo45943b() {
        if (!this.f54278e) {
            this.f54278e = true;
            C5116u5.m23368a(this.f54274a).mo21244a(new Intent("com.startapp.android.splashHidden"));
        }
        try {
            C5116u5.m23368a(this.f54274a).mo21242a(this.f54284k);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
        Activity activity = (Activity) this.f54275b.get();
        if (activity != null && !activity.isFinishing()) {
            try {
                activity.finish();
            } catch (Throwable th2) {
                C5004d4.m22887a(th2);
            }
        }
    }

    /* renamed from: c */
    public final void mo45944c() {
        SplashHtml splashHtml = this.f54283j;
        C12207a aVar = new C12207a();
        if (splashHtml == null) {
            mo45943b();
            return;
        }
        splashHtml.callback = aVar;
        splashHtml.mo45948a();
    }

    /* renamed from: d */
    public void mo45945d() {
        this.f54276c = true;
    }

    /* renamed from: a */
    public void mo45940a() {
        this.f54282i = SplashState.DO_NOT_DISPLAY;
        mo45941a((Runnable) null);
    }

    /* renamed from: a */
    public final void mo45941a(Runnable runnable) {
        if (!this.f54276c) {
            return;
        }
        if (this.f54281h || runnable == null) {
            SplashState splashState = this.f54282i;
            if (splashState == SplashState.RECEIVED && runnable != null) {
                this.f54277d = false;
                runnable.run();
            } else if (splashState != SplashState.LOADING) {
                mo45944c();
            }
        }
    }

    public SplashEventHandler(Activity activity, SplashHtml splashHtml) {
        this(activity);
        this.f54283j = splashHtml;
    }
}
