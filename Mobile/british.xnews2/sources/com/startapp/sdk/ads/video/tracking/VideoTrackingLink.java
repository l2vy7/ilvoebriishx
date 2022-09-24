package com.startapp.sdk.ads.video.tracking;

import com.startapp.C12458z0;
import com.startapp.C5010hb;
import java.io.Serializable;

/* compiled from: Sta */
public abstract class VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean appendReplayParameter;
    private String replayParameter;
    @C5010hb(type = TrackingSource.class)
    private TrackingSource trackingSource;
    private String trackingUrl;

    /* compiled from: Sta */
    public enum TrackingSource {
        STARTAPP,
        EXTERNAL
    }

    /* renamed from: a */
    public void mo46074a(boolean z) {
        this.appendReplayParameter = z;
    }

    /* renamed from: b */
    public void mo46076b(String str) {
        this.trackingUrl = str;
    }

    /* renamed from: c */
    public String mo46077c() {
        return this.trackingUrl;
    }

    /* renamed from: d */
    public boolean mo46078d() {
        return this.appendReplayParameter;
    }

    public String toString() {
        StringBuilder a = C12458z0.m53804a("trackingSource=");
        a.append(this.trackingSource);
        a.append(", trackingUrl=");
        a.append(this.trackingUrl);
        a.append(", replayParameter=");
        a.append(this.replayParameter);
        a.append(", appendReplayParameter=");
        a.append(this.appendReplayParameter);
        return a.toString();
    }

    /* renamed from: a */
    public String mo46072a() {
        return this.replayParameter;
    }

    /* renamed from: b */
    public TrackingSource mo46075b() {
        return this.trackingSource;
    }

    /* renamed from: a */
    public void mo46073a(String str) {
        this.replayParameter = str;
    }
}
