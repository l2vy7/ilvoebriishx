package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import com.startapp.C11881e3;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class BannerStandardAd extends HtmlAd {
    private static final long serialVersionUID = 1;
    private int bannerType;
    private boolean fixedSize;
    private int offset = 0;

    public BannerStandardAd(Context context, int i) {
        super(context, AdPreferences.Placement.INAPP_BANNER);
        this.offset = i;
    }

    /* renamed from: a */
    public void mo20839a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C11881e3(this.f22229a, this, this.offset, adPreferences, adEventListener).mo46157c();
        this.offset++;
    }

    /* renamed from: b */
    public void mo45849b(boolean z) {
        this.fixedSize = z;
    }

    /* renamed from: c */
    public void mo45850c(int i) {
        this.bannerType = i;
    }

    /* renamed from: u */
    public int mo45851u() {
        return this.bannerType;
    }

    /* renamed from: v */
    public int mo45852v() {
        return this.offset;
    }

    /* renamed from: w */
    public boolean mo45853w() {
        return this.fixedSize;
    }
}
