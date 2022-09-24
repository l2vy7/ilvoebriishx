package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sc4 {
    /* renamed from: a */
    public static List<byte[]> m37375a(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m37377c(m37376b((long) (((b & 255) << 8) | (b2 & 255)))));
        arrayList.add(m37377c(m37376b(3840)));
        return arrayList;
    }

    /* renamed from: b */
    private static long m37376b(long j) {
        return (j * C6540C.NANOS_PER_SECOND) / 48000;
    }

    /* renamed from: c */
    private static byte[] m37377c(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
