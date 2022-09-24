package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* renamed from: com.google.android.gms.internal.ads.vv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class C8278vv extends AdListener {

    /* renamed from: a */
    private final Object f40558a = new Object();

    /* renamed from: b */
    private AdListener f40559b;

    /* renamed from: a */
    public final void mo35500a(AdListener adListener) {
        synchronized (this.f40558a) {
            this.f40559b = adListener;
        }
    }

    public final void onAdClicked() {
        synchronized (this.f40558a) {
            AdListener adListener = this.f40559b;
            if (adListener != null) {
                adListener.onAdClicked();
            }
        }
    }

    public final void onAdClosed() {
        synchronized (this.f40558a) {
            AdListener adListener = this.f40559b;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.f40558a) {
            AdListener adListener = this.f40559b;
            if (adListener != null) {
                adListener.onAdFailedToLoad(loadAdError);
            }
        }
    }

    public final void onAdImpression() {
        synchronized (this.f40558a) {
            AdListener adListener = this.f40559b;
            if (adListener != null) {
                adListener.onAdImpression();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f40558a) {
            AdListener adListener = this.f40559b;
            if (adListener != null) {
                adListener.onAdLoaded();
            }
        }
    }

    public final void onAdOpened() {
        synchronized (this.f40558a) {
            AdListener adListener = this.f40559b;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }
}
