package com.startapp.sdk.ads.video.tracking;

import com.startapp.C5006gb;

@C5006gb(extendsClass = true)
/* compiled from: Sta */
public class FractionTrackingLink extends VideoTrackingLink {
    private static final long serialVersionUID = 1;
    private int fraction;

    /* renamed from: a */
    public void mo46049a(int i) {
        this.fraction = i;
    }

    /* renamed from: e */
    public int mo46050e() {
        return this.fraction;
    }

    public String toString() {
        return super.toString() + ", fraction=" + this.fraction;
    }
}
