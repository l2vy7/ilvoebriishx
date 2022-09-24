package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.source.rtsp.RtpPacket;

/* renamed from: com.google.android.gms.internal.measurement.d8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9116d8 {

    /* renamed from: a */
    private final Object f44953a;

    /* renamed from: b */
    private final int f44954b;

    C9116d8(Object obj, int i) {
        this.f44953a = obj;
        this.f44954b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9116d8)) {
            return false;
        }
        C9116d8 d8Var = (C9116d8) obj;
        if (this.f44953a == d8Var.f44953a && this.f44954b == d8Var.f44954b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f44953a) * RtpPacket.MAX_SEQUENCE_NUMBER) + this.f44954b;
    }
}
