package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.source.rtsp.RtpPacket;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vo3 {

    /* renamed from: a */
    private final Object f40499a;

    /* renamed from: b */
    private final int f40500b;

    vo3(Object obj, int i) {
        this.f40499a = obj;
        this.f40500b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vo3)) {
            return false;
        }
        vo3 vo3 = (vo3) obj;
        if (this.f40499a == vo3.f40499a && this.f40500b == vo3.f40500b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f40499a) * RtpPacket.MAX_SEQUENCE_NUMBER) + this.f40500b;
    }
}
