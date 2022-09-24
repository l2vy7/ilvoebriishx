package com.startapp.sdk.ads.video.tracking;

import com.startapp.C12458z0;

/* compiled from: Sta */
public class VideoPausedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 1;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    /* compiled from: Sta */
    public enum PauseOrigin {
        INAPP,
        EXTERNAL
    }

    public VideoPausedTrackingParams(String str, int i, int i2, int i3, PauseOrigin pauseOrigin2, String str2) {
        super(str, i, i2, str2);
        this.pauseNum = i3;
        this.pauseOrigin = pauseOrigin2;
    }

    /* renamed from: e */
    public String mo46051e() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo46052f());
        StringBuilder a = C12458z0.m53804a("&po=");
        a.append(this.pauseOrigin.toString());
        sb.append(a.toString());
        StringBuilder a2 = C12458z0.m53804a("&pn=");
        a2.append(this.pauseNum);
        sb.append(a2.toString());
        sb.append(mo46083g());
        return mo46080b(sb.toString());
    }
}
