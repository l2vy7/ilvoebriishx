package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;

/* renamed from: com.ironsource.mediationsdk.W */
public final class C11262W {

    /* renamed from: b */
    private static final C11262W f50605b = new C11262W();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyRewardedVideoListener f50606a = null;

    /* renamed from: com.ironsource.mediationsdk.W$a */
    class C11263a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f50607b;

        C11263a(String str) {
            this.f50607b = str;
        }

        public final void run() {
            C11262W.this.f50606a.onRewardedVideoAdLoadSuccess(this.f50607b);
            C11262W w = C11262W.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadSuccess() instanceId=" + this.f50607b, 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.W$b */
    class C11264b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f50609b;

        /* renamed from: c */
        private /* synthetic */ IronSourceError f50610c;

        C11264b(String str, IronSourceError ironSourceError) {
            this.f50609b = str;
            this.f50610c = ironSourceError;
        }

        public final void run() {
            C11262W.this.f50606a.onRewardedVideoAdLoadFailed(this.f50609b, this.f50610c);
            C11262W w = C11262W.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() instanceId=" + this.f50609b + "error=" + this.f50610c.getErrorMessage(), 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.W$c */
    class C11265c implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f50612b;

        C11265c(String str) {
            this.f50612b = str;
        }

        public final void run() {
            C11262W.this.f50606a.onRewardedVideoAdOpened(this.f50612b);
            C11262W w = C11262W.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened() instanceId=" + this.f50612b, 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.W$d */
    class C11266d implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f50614b;

        C11266d(String str) {
            this.f50614b = str;
        }

        public final void run() {
            C11262W.this.f50606a.onRewardedVideoAdClosed(this.f50614b);
            C11262W w = C11262W.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed() instanceId=" + this.f50614b, 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.W$e */
    class C11267e implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f50616b;

        /* renamed from: c */
        private /* synthetic */ IronSourceError f50617c;

        C11267e(String str, IronSourceError ironSourceError) {
            this.f50616b = str;
            this.f50617c = ironSourceError;
        }

        public final void run() {
            C11262W.this.f50606a.onRewardedVideoAdShowFailed(this.f50616b, this.f50617c);
            C11262W w = C11262W.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() instanceId=" + this.f50616b + "error=" + this.f50617c.getErrorMessage(), 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.W$f */
    class C11268f implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f50619b;

        C11268f(String str) {
            this.f50619b = str;
        }

        public final void run() {
            C11262W.this.f50606a.onRewardedVideoAdClicked(this.f50619b);
            C11262W w = C11262W.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked() instanceId=" + this.f50619b, 1);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.W$g */
    class C11269g implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f50621b;

        C11269g(String str) {
            this.f50621b = str;
        }

        public final void run() {
            C11262W.this.f50606a.onRewardedVideoAdRewarded(this.f50621b);
            C11262W w = C11262W.this;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded() instanceId=" + this.f50621b, 1);
        }
    }

    private C11262W() {
    }

    /* renamed from: a */
    public static C11262W m50363a() {
        return f50605b;
    }

    /* renamed from: a */
    public final void mo43932a(String str, IronSourceError ironSourceError) {
        if (this.f50606a != null) {
            new Handler(Looper.getMainLooper()).post(new C11264b(str, ironSourceError));
        }
    }

    /* renamed from: b */
    public final void mo43933b(String str, IronSourceError ironSourceError) {
        if (this.f50606a != null) {
            new Handler(Looper.getMainLooper()).post(new C11267e(str, ironSourceError));
        }
    }
}
