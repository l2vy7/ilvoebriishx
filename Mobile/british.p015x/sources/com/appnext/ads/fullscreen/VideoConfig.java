package com.appnext.ads.fullscreen;

import com.appnext.base.C3117a;
import com.appnext.core.Configuration;
import com.appnext.core.SettingsManager;

public class VideoConfig extends Configuration {
    public int rollCaptionTime = -2;
    public Boolean showCta;
    public String videoLength = "15";

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public SettingsManager mo10155g() {
        return C3002c.m10393h();
    }

    public int getRollCaptionTime() {
        return this.rollCaptionTime;
    }

    public String getVideoLength() {
        return this.videoLength;
    }

    public boolean isShowCta() {
        Boolean bool = this.showCta;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setRollCaptionTime(int i) {
        this.rollCaptionTime = i;
    }

    public void setShowCta(boolean z) {
        this.showCta = Boolean.valueOf(z);
    }

    public void setVideoLength(String str) {
        if (str.equals("15") || str.equals("30")) {
            this.videoLength = str;
        } else {
            C3117a.m10553a("VideoConfig$setVideoLength", new Throwable("Wrong video length"));
        }
    }
}
