package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.source.rtsp.RtpPacket;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjz */
/* compiled from: IMASDK */
final class bjz {

    /* renamed from: a */
    private final Object f16510a;

    /* renamed from: b */
    private final int f16511b;

    bjz(Object obj, int i) {
        this.f16510a = obj;
        this.f16511b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bjz)) {
            return false;
        }
        bjz bjz = (bjz) obj;
        if (this.f16510a == bjz.f16510a && this.f16511b == bjz.f16511b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f16510a) * RtpPacket.MAX_SEQUENCE_NUMBER) + this.f16511b;
    }
}
