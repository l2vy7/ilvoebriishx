package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.api.AdPodInfo;
import com.google.ads.interactivemedia.p039v3.internal.bnh;
import com.google.ads.interactivemedia.p039v3.internal.bnj;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.d */
/* compiled from: IMASDK */
public final class C3804d implements AdPodInfo {
    public int adPosition = 1;
    public boolean isBumper = false;
    public double maxDuration = -1.0d;
    public int podIndex;
    public double timeOffset;
    public int totalAds = 1;

    public boolean equals(Object obj) {
        return bnh.m16832c(this, obj, new String[0]);
    }

    public int getAdPosition() {
        return this.adPosition;
    }

    public double getMaxDuration() {
        return this.maxDuration;
    }

    public int getPodIndex() {
        return this.podIndex;
    }

    public double getTimeOffset() {
        return this.timeOffset;
    }

    public int getTotalAds() {
        return this.totalAds;
    }

    public int hashCode() {
        return bnj.m16840b(this, new String[0]);
    }

    public boolean isBumper() {
        return this.isBumper;
    }

    public String toString() {
        int i = this.totalAds;
        int i2 = this.adPosition;
        boolean z = this.isBumper;
        double d = this.maxDuration;
        int i3 = this.podIndex;
        double d2 = this.timeOffset;
        StringBuilder sb = new StringBuilder(169);
        sb.append("AdPodInfo [totalAds=");
        sb.append(i);
        sb.append(", adPosition=");
        sb.append(i2);
        sb.append(", isBumper=");
        sb.append(z);
        sb.append(", maxDuration=");
        sb.append(d);
        sb.append(", podIndex=");
        sb.append(i3);
        sb.append(", timeOffset=");
        sb.append(d2);
        sb.append("]");
        return sb.toString();
    }
}
