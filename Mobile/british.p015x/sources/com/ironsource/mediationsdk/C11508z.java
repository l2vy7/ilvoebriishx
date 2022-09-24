package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;

/* renamed from: com.ironsource.mediationsdk.z */
public final class C11508z {

    /* renamed from: b */
    private static final C11508z f51771b = new C11508z();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyInterstitialListener f51772a = null;

    /* renamed from: com.ironsource.mediationsdk.z$b */
    class C11509b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51773b;

        C11509b(String str) {
            this.f51773b = str;
        }

        public final void run() {
            C11508z.this.f51772a.onInterstitialAdReady(this.f51773b);
            C11508z zVar = C11508z.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady() instanceId=" + this.f51773b, 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.z$c */
    class C11510c implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51775b;

        /* renamed from: c */
        private /* synthetic */ IronSourceError f51776c;

        C11510c(String str, IronSourceError ironSourceError) {
            this.f51775b = str;
            this.f51776c = ironSourceError;
        }

        public final void run() {
            C11508z.this.f51772a.onInterstitialAdLoadFailed(this.f51775b, this.f51776c);
            C11508z zVar = C11508z.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() instanceId=" + this.f51775b + " error=" + this.f51776c.getErrorMessage(), 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.z$d */
    class C11511d implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51778b;

        C11511d(String str) {
            this.f51778b = str;
        }

        public final void run() {
            C11508z.this.f51772a.onInterstitialAdOpened(this.f51778b);
            C11508z zVar = C11508z.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened() instanceId=" + this.f51778b, 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.z$e */
    class C11512e implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51780b;

        C11512e(String str) {
            this.f51780b = str;
        }

        public final void run() {
            C11508z.this.f51772a.onInterstitialAdClosed(this.f51780b);
            C11508z zVar = C11508z.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed() instanceId=" + this.f51780b, 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.z$f */
    class C11513f implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51782b;

        /* renamed from: c */
        private /* synthetic */ IronSourceError f51783c;

        C11513f(String str, IronSourceError ironSourceError) {
            this.f51782b = str;
            this.f51783c = ironSourceError;
        }

        public final void run() {
            C11508z.this.f51772a.onInterstitialAdShowFailed(this.f51782b, this.f51783c);
            C11508z zVar = C11508z.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() instanceId=" + this.f51782b + " error=" + this.f51783c.getErrorMessage(), 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.z$g */
    class C11514g implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51785b;

        C11514g(String str) {
            this.f51785b = str;
        }

        public final void run() {
            C11508z.this.f51772a.onInterstitialAdClicked(this.f51785b);
            C11508z zVar = C11508z.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked() instanceId=" + this.f51785b, 1);
        }
    }

    private C11508z() {
    }

    /* renamed from: a */
    public static C11508z m51348a() {
        return f51771b;
    }

    /* renamed from: a */
    public final void mo44589a(String str, IronSourceError ironSourceError) {
        if (this.f51772a != null) {
            new Handler(Looper.getMainLooper()).post(new C11510c(str, ironSourceError));
        }
    }

    /* renamed from: b */
    public final void mo44590b(String str, IronSourceError ironSourceError) {
        if (this.f51772a != null) {
            new Handler(Looper.getMainLooper()).post(new C11513f(str, ironSourceError));
        }
    }
}
