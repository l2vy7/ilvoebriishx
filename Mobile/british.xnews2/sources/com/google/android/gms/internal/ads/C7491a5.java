package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.a5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7491a5 {
    /* renamed from: a */
    public static long m30234a(ByteBuffer byteBuffer) {
        m30240g(byteBuffer);
        return m30238e(byteBuffer, byteBuffer.position() + 16);
    }

    /* renamed from: b */
    public static long m30235b(ByteBuffer byteBuffer) {
        m30240g(byteBuffer);
        return m30238e(byteBuffer, byteBuffer.position() + 12);
    }

    /* renamed from: c */
    static Pair<ByteBuffer, Long> m30236c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> f = m30239f(randomAccessFile, 0);
        if (f != null) {
            return f;
        }
        return m30239f(randomAccessFile, RtpPacket.MAX_SEQUENCE_NUMBER);
    }

    /* renamed from: d */
    public static void m30237d(ByteBuffer byteBuffer, long j) {
        m30240g(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j);
    }

    /* renamed from: e */
    private static long m30238e(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* renamed from: f */
    private static Pair<ByteBuffer, Long> m30239f(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, -22 + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m30240g(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, RtpPacket.MAX_SEQUENCE_NUMBER);
            int i4 = 0;
            while (true) {
                if (i4 >= min) {
                    break;
                }
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i2)));
    }

    /* renamed from: g */
    private static void m30240g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
