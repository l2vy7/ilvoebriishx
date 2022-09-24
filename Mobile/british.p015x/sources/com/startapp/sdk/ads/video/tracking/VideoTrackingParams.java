package com.startapp.sdk.ads.video.tracking;

import com.startapp.C12458z0;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* compiled from: Sta */
public class VideoTrackingParams extends TrackingParams {
    private static final long serialVersionUID = 1;
    private int completed;
    public boolean internalParamsIndicator;
    private String replayParameter;
    private boolean shouldAppendOffset;
    private String videoPlayingMode;

    public VideoTrackingParams(String str, int i, int i2, String str2) {
        super(str);
        mo46181a(i2);
        this.completed = i;
        this.videoPlayingMode = str2;
    }

    /* renamed from: a */
    public VideoTrackingParams mo46079a(boolean z) {
        this.shouldAppendOffset = z;
        return this;
    }

    /* renamed from: b */
    public String mo46080b(String str) {
        if (!this.internalParamsIndicator) {
            return mo46082c();
        }
        return super.mo46051e() + str;
    }

    /* renamed from: c */
    public VideoTrackingParams mo46081c(String str) {
        this.replayParameter = str;
        return this;
    }

    /* renamed from: e */
    public String mo46051e() {
        return mo46080b(mo46052f() + mo46083g());
    }

    /* renamed from: f */
    public String mo46052f() {
        StringBuilder a = C12458z0.m53804a("&cp=");
        a.append(this.completed);
        return a.toString();
    }

    /* renamed from: g */
    public String mo46083g() {
        StringBuilder a = C12458z0.m53804a("&vpm=");
        a.append(this.videoPlayingMode);
        return a.toString();
    }

    /* renamed from: c */
    public String mo46082c() {
        if (!this.shouldAppendOffset) {
            return "";
        }
        String str = this.replayParameter;
        if (str != null) {
            return str.replace("%startapp_replay_count%", new Integer(mo46184b()).toString());
        }
        return super.mo46082c();
    }
}
