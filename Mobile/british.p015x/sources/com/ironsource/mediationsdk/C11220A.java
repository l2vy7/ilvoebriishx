package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;

/* renamed from: com.ironsource.mediationsdk.A */
public final class C11220A {

    /* renamed from: b */
    private static final C11220A f50353b = new C11220A();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public InterstitialListener f50354a = null;

    /* renamed from: com.ironsource.mediationsdk.A$a */
    class C11221a implements Runnable {
        C11221a() {
        }

        public final void run() {
            synchronized (this) {
                C11220A.this.f50354a.onInterstitialAdReady();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.A$b */
    class C11222b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f50356b;

        C11222b(IronSourceError ironSourceError) {
            this.f50356b = ironSourceError;
        }

        public final void run() {
            synchronized (this) {
                C11220A.this.f50354a.onInterstitialAdLoadFailed(this.f50356b);
                C11220A a = C11220A.this;
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() error=" + this.f50356b.getErrorMessage(), 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.A$c */
    class C11223c implements Runnable {
        C11223c() {
        }

        public final void run() {
            synchronized (this) {
                C11220A.this.f50354a.onInterstitialAdOpened();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.A$d */
    class C11224d implements Runnable {
        C11224d() {
        }

        public final void run() {
            synchronized (this) {
                C11220A.this.f50354a.onInterstitialAdClosed();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.A$e */
    class C11225e implements Runnable {
        C11225e() {
        }

        public final void run() {
            synchronized (this) {
                C11220A.this.f50354a.onInterstitialAdShowSucceeded();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.A$f */
    class C11226f implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f50361b;

        C11226f(IronSourceError ironSourceError) {
            this.f50361b = ironSourceError;
        }

        public final void run() {
            synchronized (this) {
                C11220A.this.f50354a.onInterstitialAdShowFailed(this.f50361b);
                C11220A a = C11220A.this;
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() error=" + this.f50361b.getErrorMessage(), 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.A$g */
    class C11227g implements Runnable {
        C11227g() {
        }

        public final void run() {
            synchronized (this) {
                C11220A.this.f50354a.onInterstitialAdClicked();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
            }
        }
    }

    private C11220A() {
    }

    /* renamed from: a */
    public static synchronized C11220A m50068a() {
        C11220A a;
        synchronized (C11220A.class) {
            a = f50353b;
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized void mo43687a(IronSourceError ironSourceError) {
        if (this.f50354a != null) {
            new Handler(Looper.getMainLooper()).post(new C11222b(ironSourceError));
        }
    }

    /* renamed from: a */
    public final synchronized void mo43688a(InterstitialListener interstitialListener) {
        this.f50354a = interstitialListener;
    }

    /* renamed from: b */
    public final synchronized void mo43689b() {
        if (this.f50354a != null) {
            new Handler(Looper.getMainLooper()).post(new C11221a());
        }
    }

    /* renamed from: b */
    public final synchronized void mo43690b(IronSourceError ironSourceError) {
        if (this.f50354a != null) {
            new Handler(Looper.getMainLooper()).post(new C11226f(ironSourceError));
        }
    }

    /* renamed from: c */
    public final synchronized void mo43691c() {
        if (this.f50354a != null) {
            new Handler(Looper.getMainLooper()).post(new C11223c());
        }
    }

    /* renamed from: d */
    public final synchronized void mo43692d() {
        if (this.f50354a != null) {
            new Handler(Looper.getMainLooper()).post(new C11224d());
        }
    }

    /* renamed from: e */
    public final synchronized void mo43693e() {
        if (this.f50354a != null) {
            new Handler(Looper.getMainLooper()).post(new C11225e());
        }
    }

    /* renamed from: f */
    public final synchronized void mo43694f() {
        if (this.f50354a != null) {
            new Handler(Looper.getMainLooper()).post(new C11227g());
        }
    }
}
