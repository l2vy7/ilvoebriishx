package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vm3 {

    /* renamed from: a */
    private final byte[] f40470a;

    private vm3(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f40470a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: a */
    public static vm3 m38842a(byte[] bArr, int i, int i2) {
        return new vm3(bArr, 0, i2);
    }

    /* renamed from: b */
    public final byte[] mo35444b() {
        byte[] bArr = this.f40470a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
