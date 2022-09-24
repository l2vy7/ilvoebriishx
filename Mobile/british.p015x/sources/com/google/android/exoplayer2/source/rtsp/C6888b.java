package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtpPacketReorderingQueue;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.source.rtsp.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6888b implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C6888b f27581b = new C6888b();

    private /* synthetic */ C6888b() {
    }

    public final int compare(Object obj, Object obj2) {
        return RtpPacketReorderingQueue.calculateSequenceNumberShift(((RtpPacketReorderingQueue.RtpPacketContainer) obj).packet.sequenceNumber, ((RtpPacketReorderingQueue.RtpPacketContainer) obj2).packet.sequenceNumber);
    }
}
