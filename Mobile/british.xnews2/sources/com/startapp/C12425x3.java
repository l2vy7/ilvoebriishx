package com.startapp;

import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import java.nio.ByteBuffer;
import java.util.Random;

/* renamed from: com.startapp.x3 */
/* compiled from: Sta */
public class C12425x3 {

    /* renamed from: b */
    private static final int f55109b = 65507;

    /* renamed from: c */
    public static final byte f55110c = 8;

    /* renamed from: d */
    public static final byte f55111d = Byte.MIN_VALUE;

    /* renamed from: e */
    private static final byte f55112e = 0;

    /* renamed from: f */
    public static final int f55113f = 8;

    /* renamed from: a */
    private final byte f55114a;

    public C12425x3(byte b) {
        this.f55114a = b;
    }

    /* renamed from: a */
    public ByteBuffer mo46807a(short s, short s2, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        } else if (bArr.length > 65507) {
            bArr = m53743a(65507);
        }
        int length = bArr.length + 8;
        byte[] bArr2 = new byte[length];
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        wrap.put(this.f55114a);
        wrap.put(f55112e);
        int position = wrap.position();
        wrap.position(position + 2);
        wrap.putShort(s2);
        wrap.putShort(s);
        wrap.put(bArr);
        wrap.putShort(position, m53742a(bArr2, length));
        wrap.flip();
        return wrap;
    }

    /* renamed from: a */
    private static short m53742a(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            int i4 = i2 + ((bArr[i3] & 255) << 8);
            i2 = (i4 >> 16) + (65535 & i4);
        }
        for (int i5 = 1; i5 < i; i5 += 2) {
            int i6 = i2 + (bArr[i5] & 255);
            i2 = (i6 >> 16) + (i6 & RtpPacket.MAX_SEQUENCE_NUMBER);
        }
        return (short) (((i2 & RtpPacket.MAX_SEQUENCE_NUMBER) + (i2 >> 16)) ^ RtpPacket.MAX_SEQUENCE_NUMBER);
    }

    /* renamed from: a */
    public static byte[] m53743a(int i) {
        byte[] bArr = new byte[i];
        new Random().nextBytes(bArr);
        return bArr;
    }
}
