package com.appnext.ads.interstitial;

import android.graphics.Color;
import com.appnext.base.C3117a;
import com.appnext.core.Configuration;
import com.appnext.core.SettingsManager;

public class InterstitialConfig extends Configuration {

    /* renamed from: aK */
    protected boolean f12110aK = false;
    public Boolean autoPlay;
    public String buttonColor = "";
    public String creativeType = Interstitial.TYPE_MANAGED;
    public String skipText = "";

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final SettingsManager mo10155g() {
        return C3063c.m10511C();
    }

    public String getButtonColor() {
        return this.buttonColor;
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    public String getSkipText() {
        return this.skipText;
    }

    public boolean isAutoPlay() {
        try {
            Boolean bool = this.autoPlay;
            return bool == null ? Boolean.parseBoolean(C3063c.m10511C().mo10732y("auto_play")) : bool.booleanValue();
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialConfig$isAutoPlay", th);
            return false;
        }
    }

    public void setAutoPlay(boolean z) {
        this.autoPlay = Boolean.valueOf(z);
    }

    @Deprecated
    public void setBackButtonCanClose(boolean z) {
        this.backButtonCanClose = Boolean.valueOf(z);
    }

    public void setButtonColor(String str) {
        if (str == null) {
            this.buttonColor = "";
            return;
        }
        if (!str.startsWith("#")) {
            str = "#" + str;
        }
        try {
            Color.parseColor(str);
            this.buttonColor = str;
            this.f12110aK = true;
        } catch (Throwable unused) {
            throw new IllegalArgumentException("Unknown color");
        }
    }

    public void setCreativeType(String str) {
        if (str.equals(Interstitial.TYPE_MANAGED) || str.equals("static") || str.equals("video")) {
            this.creativeType = str;
        } else {
            C3117a.m10553a("InterstitialConfig$setCreativeType", new Throwable("Wrong creative type"));
        }
    }

    @Deprecated
    public void setOrientation(String str) {
    }

    public void setSkipText(String str) {
        if (str == null) {
            str = "";
        }
        this.skipText = str;
    }
}
