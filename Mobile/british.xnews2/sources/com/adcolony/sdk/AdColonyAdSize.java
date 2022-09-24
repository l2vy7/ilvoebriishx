package com.adcolony.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class AdColonyAdSize {
    public static final AdColonyAdSize BANNER = new AdColonyAdSize(320, 50);
    public static final AdColonyAdSize LEADERBOARD = new AdColonyAdSize(728, 90);
    public static final AdColonyAdSize MEDIUM_RECTANGLE = new AdColonyAdSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
    public static final AdColonyAdSize SKYSCRAPER = new AdColonyAdSize(160, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED);

    /* renamed from: a */
    int f10506a;

    /* renamed from: b */
    int f10507b;

    public AdColonyAdSize(int i, int i2) {
        this.f10506a = i;
        this.f10507b = i2;
    }

    public int getHeight() {
        return this.f10507b;
    }

    public int getWidth() {
        return this.f10506a;
    }
}
