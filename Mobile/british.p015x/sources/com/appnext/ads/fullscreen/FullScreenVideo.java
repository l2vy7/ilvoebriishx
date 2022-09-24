package com.appnext.ads.fullscreen;

import android.content.Context;
import com.appnext.base.C3117a;

public class FullScreenVideo extends Video {
    private long closeDelay;
    private boolean showClose;

    protected FullScreenVideo(Context context, FullScreenVideo fullScreenVideo) {
        super(context, fullScreenVideo);
        this.showClose = true;
        setShowClose(fullScreenVideo.isShowClose());
        setCloseDelay(fullScreenVideo.getCloseDelay());
        setBackButtonCanClose(fullScreenVideo.isBackButtonCanClose());
    }

    public String getAUID() {
        return "700";
    }

    public long getCloseDelay() {
        return this.closeDelay;
    }

    public boolean isShowClose() {
        return this.showClose;
    }

    /* access modifiers changed from: protected */
    public void setCloseDelay(long j) {
        this.closeDelay = j;
    }

    public void setShowClose(boolean z) {
        this.showClose = z;
    }

    /* access modifiers changed from: protected */
    public C3002c getConfig() {
        return C3002c.m10393h();
    }

    public void setShowClose(boolean z, long j) {
        this.showClose = z;
        if (j >= 100 && j <= 7500) {
            this.closeDelay = j;
        }
    }

    public FullScreenVideo(Context context, String str) {
        super(context, 1, str);
        this.showClose = true;
        this.closeDelay = (long) Integer.parseInt(getConfig().mo10732y("show_close_time"));
    }

    public FullScreenVideo(Context context, String str, FullscreenConfig fullscreenConfig) {
        super(context, 1, str, fullscreenConfig);
        this.showClose = true;
        if (fullscreenConfig != null) {
            try {
                setBackButtonCanClose(fullscreenConfig.isBackButtonCanClose());
                if (fullscreenConfig.showClose != null) {
                    setShowClose(fullscreenConfig.isShowClose());
                }
                setCloseDelay(fullscreenConfig.closeDelay);
            } catch (Throwable th) {
                C3117a.m10553a("FullScreenVideo$FullScreenVideo", th);
            }
        }
    }
}
