package com.appnext.ads.fullscreen;

import com.appnext.core.SettingsManager;
import com.google.android.exoplayer2.SimpleExoPlayer;

public class FullscreenConfig extends VideoConfig {
    public Boolean backButtonCanClose;
    public long closeDelay;
    public Boolean showClose;

    public FullscreenConfig() {
        this.backButtonCanClose = Boolean.TRUE;
        this.closeDelay = SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        this.closeDelay = (long) Integer.parseInt(C3002c.m10393h().mo10732y("show_close_time"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final SettingsManager mo10155g() {
        return C3002c.m10393h();
    }

    public boolean isBackButtonCanClose() {
        Boolean bool = this.backButtonCanClose;
        return bool == null ? Boolean.parseBoolean(C3002c.m10393h().mo10732y("can_close")) : bool.booleanValue();
    }

    public boolean isShowClose() {
        Boolean bool = this.showClose;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setBackButtonCanClose(boolean z) {
        this.backButtonCanClose = Boolean.valueOf(z);
    }

    public void setShowClose(Boolean bool) {
        this.showClose = bool;
    }

    public void setShowClose(boolean z, long j) {
        this.showClose = Boolean.valueOf(z);
        if (j >= 100 && j <= 7500) {
            this.closeDelay = j;
        }
    }
}
