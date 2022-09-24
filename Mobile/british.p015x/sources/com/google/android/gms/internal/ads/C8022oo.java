package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.oo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8022oo extends C4614jo {

    /* renamed from: c */
    private MessageDigest f36561c;

    /* renamed from: b */
    public final byte[] mo18456b(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int a = C4615no.m20740a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr = allocate.array();
        } else {
            if (length < 5) {
                bArr2 = new byte[(length + length)];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int a2 = C4615no.m20740a(split[i2]);
                    char c = (a2 >> 16) ^ ((char) a2);
                    byte[] bArr3 = {(byte) c, (byte) (c >> 8)};
                    int i3 = i2 + i2;
                    bArr2[i3] = bArr3[0];
                    bArr2[i3 + 1] = bArr3[1];
                }
            } else {
                bArr2 = new byte[length];
                for (int i4 = 0; i4 < split.length; i4++) {
                    int a3 = C4615no.m20740a(split[i4]);
                    bArr2[i4] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
                }
            }
            bArr = bArr2;
        }
        this.f36561c = mo18455a();
        synchronized (this.f20471a) {
            MessageDigest messageDigest = this.f36561c;
            if (messageDigest == null) {
                byte[] bArr4 = new byte[0];
                return bArr4;
            }
            messageDigest.reset();
            this.f36561c.update(bArr);
            byte[] digest = this.f36561c.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr5 = new byte[i];
            System.arraycopy(digest, 0, bArr5, 0, i);
            return bArr5;
        }
    }
}
