package com.startapp.sdk.ads.video.tracking;

import com.startapp.C12458z0;

/* compiled from: Sta */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 940417627850369979L;
    private boolean isVideoFinished;

    public VideoClickedTrackingParams(String str, int i, int i2, boolean z, String str2) {
        super(str, i, i2, str2);
        this.isVideoFinished = z;
    }

    /* renamed from: e */
    public String mo46051e() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo46052f());
        StringBuilder a = C12458z0.m53804a("&co=");
        a.append(this.isVideoFinished ? "POSTROLL" : "VIDEO");
        sb.append(a.toString());
        sb.append(mo46083g());
        return mo46080b(sb.toString());
    }
}
