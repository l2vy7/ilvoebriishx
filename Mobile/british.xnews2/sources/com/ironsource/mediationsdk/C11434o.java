package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.o */
public final class C11434o {

    /* renamed from: g */
    private static final C11434o f51440g = new C11434o();

    /* renamed from: a */
    private Map<String, Long> f51441a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Map<String, Boolean> f51442b = new HashMap();

    /* renamed from: c */
    InterstitialListener f51443c = null;

    /* renamed from: d */
    private int f51444d;

    /* renamed from: e */
    private RewardedVideoManualListener f51445e = null;

    /* renamed from: f */
    private int f51446f;

    /* renamed from: com.ironsource.mediationsdk.o$b */
    class C11435b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSource.AD_UNIT f51447b;

        /* renamed from: c */
        private /* synthetic */ IronSourceError f51448c;

        /* renamed from: d */
        private /* synthetic */ String f51449d;

        C11435b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, String str) {
            this.f51447b = ad_unit;
            this.f51448c = ironSourceError;
            this.f51449d = str;
        }

        public final void run() {
            C11434o.this.m51100d(this.f51447b, this.f51448c);
            C11434o.this.f51442b.put(this.f51449d, Boolean.FALSE);
        }
    }

    private C11434o() {
    }

    /* renamed from: a */
    public static synchronized C11434o m51097a() {
        C11434o oVar;
        synchronized (C11434o.class) {
            oVar = f51440g;
        }
        return oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m51100d(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f51441a.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        IronLog ironLog = IronLog.CALLBACK;
        ironLog.info("adUnit = " + ad_unit + " - error = " + ironSourceError.toString());
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            InterstitialListener interstitialListener = this.f51443c;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdLoadFailed(ironSourceError);
            } else {
                IronLog.INTERNAL.error("mInterstitialListener is null");
            }
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog.INTERNAL.warning("mRewardedVideoListener is null");
        } else {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("ad unit not supported - " + ad_unit);
        }
    }

    /* renamed from: a */
    public final void mo44451a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f51444d = i;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f51446f = i;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    /* renamed from: a */
    public final synchronized void mo44452a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        int i;
        if (!mo44453a(ad_unit)) {
            String ad_unit2 = ad_unit.toString();
            if (!this.f51441a.containsKey(ad_unit2)) {
                m51100d(ad_unit, ironSourceError);
                return;
            }
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = this.f51444d;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = this.f51446f;
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("ad unit not supported - " + ad_unit);
                i = 0;
            }
            long j = (long) (i * 1000);
            long currentTimeMillis = System.currentTimeMillis() - this.f51441a.get(ad_unit2).longValue();
            if (currentTimeMillis > j) {
                m51100d(ad_unit, ironSourceError);
                return;
            }
            this.f51442b.put(ad_unit2, Boolean.TRUE);
            new Handler(Looper.getMainLooper()).postDelayed(new C11435b(ad_unit, ironSourceError, ad_unit2), j - currentTimeMillis);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo44453a(IronSource.AD_UNIT ad_unit) {
        if (!this.f51442b.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.f51442b.get(ad_unit.toString()).booleanValue();
    }
}
