package com.startapp.sdk.adsbase.commontracking;

/* compiled from: Sta */
public class CloseTrackingParams extends TrackingParams {
    private static final long serialVersionUID = 1;
    private final long duration;

    public CloseTrackingParams(long j, String str) {
        super(str);
        this.duration = j;
    }

    /* renamed from: e */
    public String mo46051e() {
        return super.mo46051e() + "&displayDuration=" + Math.max(0, this.duration);
    }
}
