package com.google.android.exoplayer2.extractor.p040ts;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* renamed from: com.google.android.exoplayer2.extractor.ts.TsUtil */
public final class TsUtil {
    private TsUtil() {
    }

    public static int findSyncBytePosition(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.setPosition(i);
        if (parsableByteArray.bytesLeft() < 5) {
            return C6540C.TIME_UNSET;
        }
        int readInt = parsableByteArray.readInt();
        if ((8388608 & readInt) != 0 || ((2096896 & readInt) >> 8) != i2) {
            return C6540C.TIME_UNSET;
        }
        boolean z = true;
        if (((readInt & 32) != 0) && parsableByteArray.readUnsignedByte() >= 7 && parsableByteArray.bytesLeft() >= 7) {
            if ((parsableByteArray.readUnsignedByte() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                parsableByteArray.readBytes(bArr, 0, 6);
                return readPcrValueFromPcrBytes(bArr);
            }
        }
        return C6540C.TIME_UNSET;
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
