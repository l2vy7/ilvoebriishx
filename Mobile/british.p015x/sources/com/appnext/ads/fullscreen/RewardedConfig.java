package com.appnext.ads.fullscreen;

import com.appnext.core.SettingsManager;

public class RewardedConfig extends VideoConfig {
    private String mode = RewardedVideo.VIDEO_MODE_DEFAULT;
    private int multiTimerLength = 3;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final SettingsManager mo10155g() {
        return C3012f.m10411o();
    }

    public String getMode() {
        return this.mode;
    }

    public int getMultiTimerLength() {
        return this.multiTimerLength;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setMultiTimerLength(int i) {
        this.multiTimerLength = i;
    }
}
