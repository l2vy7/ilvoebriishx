package com.startapp.sdk.ads.video.tracking;

import com.startapp.C5006gb;

@C5006gb(extendsClass = true)
/* compiled from: Sta */
public class AbsoluteTrackingLink extends VideoTrackingLink {
    private static final long serialVersionUID = 1;
    private int videoOffsetMillis;

    /* renamed from: a */
    public void mo46046a(int i) {
        this.videoOffsetMillis = i;
    }

    /* renamed from: e */
    public int mo46047e() {
        return this.videoOffsetMillis;
    }

    public String toString() {
        return super.toString() + ", videoOffsetMillis=" + this.videoOffsetMillis;
    }
}
