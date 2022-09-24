package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;

/* renamed from: com.ironsource.mediationsdk.X */
public final class C11270X {

    /* renamed from: b */
    private static final C11270X f50623b = new C11270X();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public RewardedVideoListener f50624a = null;

    /* renamed from: com.ironsource.mediationsdk.X$a */
    class C11271a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f50625b;

        C11271a(IronSourceError ironSourceError) {
            this.f50625b = ironSourceError;
        }

        public final void run() {
            synchronized (this) {
                C11270X.this.f50624a.onRewardedVideoAdShowFailed(this.f50625b);
                C11270X x = C11270X.this;
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() error=" + this.f50625b.getErrorMessage(), 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.X$b */
    class C11272b implements Runnable {
        C11272b() {
        }

        public final void run() {
            synchronized (this) {
                ((RewardedVideoManualListener) C11270X.this.f50624a).onRewardedVideoAdReady();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdReady()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.X$c */
    class C11273c implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Placement f50628b;

        C11273c(Placement placement) {
            this.f50628b = placement;
        }

        public final void run() {
            synchronized (this) {
                C11270X.this.f50624a.onRewardedVideoAdClicked(this.f50628b);
                C11270X x = C11270X.this;
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + this.f50628b + ")", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.X$d */
    class C11274d implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f50630b;

        C11274d(IronSourceError ironSourceError) {
            this.f50630b = ironSourceError;
        }

        public final void run() {
            synchronized (this) {
                ((RewardedVideoManualListener) C11270X.this.f50624a).onRewardedVideoAdLoadFailed(this.f50630b);
                C11270X x = C11270X.this;
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() error=" + this.f50630b.getErrorMessage(), 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.X$e */
    class C11275e implements Runnable {
        C11275e() {
        }

        public final void run() {
            synchronized (this) {
                C11270X.this.f50624a.onRewardedVideoAdOpened();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.X$f */
    class C11276f implements Runnable {
        C11276f() {
        }

        public final void run() {
            synchronized (this) {
                C11270X.this.f50624a.onRewardedVideoAdClosed();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.X$g */
    class C11277g implements Runnable {

        /* renamed from: b */
        private /* synthetic */ boolean f50634b;

        C11277g(boolean z) {
            this.f50634b = z;
        }

        public final void run() {
            synchronized (this) {
                C11270X.this.f50624a.onRewardedVideoAvailabilityChanged(this.f50634b);
                C11270X x = C11270X.this;
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged() available=" + this.f50634b, 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.X$h */
    class C11278h implements Runnable {
        C11278h() {
        }

        public final void run() {
            synchronized (this) {
                C11270X.this.f50624a.onRewardedVideoAdStarted();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.X$i */
    class C11279i implements Runnable {
        C11279i() {
        }

        public final void run() {
            synchronized (this) {
                C11270X.this.f50624a.onRewardedVideoAdEnded();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.X$j */
    class C11280j implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Placement f50638b;

        C11280j(Placement placement) {
            this.f50638b = placement;
        }

        public final void run() {
            synchronized (this) {
                C11270X.this.f50624a.onRewardedVideoAdRewarded(this.f50638b);
                C11270X x = C11270X.this;
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + this.f50638b + ")", 1);
            }
        }
    }

    private C11270X() {
    }

    /* renamed from: a */
    public static synchronized C11270X m50368a() {
        C11270X x;
        synchronized (C11270X.class) {
            x = f50623b;
        }
        return x;
    }

    /* renamed from: a */
    public final synchronized void mo43941a(IronSourceError ironSourceError) {
        if (this.f50624a instanceof RewardedVideoManualListener) {
            new Handler(Looper.getMainLooper()).post(new C11274d(ironSourceError));
        }
    }

    /* renamed from: a */
    public final synchronized void mo43942a(Placement placement) {
        if (this.f50624a != null) {
            new Handler(Looper.getMainLooper()).post(new C11280j(placement));
        }
    }

    /* renamed from: a */
    public final synchronized void mo43943a(RewardedVideoListener rewardedVideoListener) {
        this.f50624a = rewardedVideoListener;
    }

    /* renamed from: a */
    public final synchronized void mo43944a(boolean z) {
        if (this.f50624a != null) {
            new Handler(Looper.getMainLooper()).post(new C11277g(z));
        }
    }

    /* renamed from: b */
    public final synchronized void mo43945b() {
        if (this.f50624a instanceof RewardedVideoManualListener) {
            new Handler(Looper.getMainLooper()).post(new C11272b());
        }
    }

    /* renamed from: b */
    public final synchronized void mo43946b(IronSourceError ironSourceError) {
        if (this.f50624a != null) {
            new Handler(Looper.getMainLooper()).post(new C11271a(ironSourceError));
        }
    }

    /* renamed from: b */
    public final synchronized void mo43947b(Placement placement) {
        if (this.f50624a != null) {
            new Handler(Looper.getMainLooper()).post(new C11273c(placement));
        }
    }

    /* renamed from: c */
    public final synchronized void mo43948c() {
        if (this.f50624a != null) {
            new Handler(Looper.getMainLooper()).post(new C11275e());
        }
    }

    /* renamed from: d */
    public final synchronized void mo43949d() {
        if (this.f50624a != null) {
            new Handler(Looper.getMainLooper()).post(new C11276f());
        }
    }

    /* renamed from: e */
    public final synchronized void mo43950e() {
        if (this.f50624a != null) {
            new Handler(Looper.getMainLooper()).post(new C11278h());
        }
    }

    /* renamed from: f */
    public final synchronized void mo43951f() {
        if (this.f50624a != null) {
            new Handler(Looper.getMainLooper()).post(new C11279i());
        }
    }
}
