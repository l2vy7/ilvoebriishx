package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.s4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8143s4 implements C8178t4 {

    /* renamed from: a */
    private final ByteBuffer f38867a;

    public C8143s4(ByteBuffer byteBuffer) {
        this.f38867a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final void mo34658a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f38867a) {
            int i2 = (int) j;
            this.f38867a.position(i2);
            this.f38867a.limit(i2 + i);
            slice = this.f38867a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public final long zza() {
        return (long) this.f38867a.capacity();
    }
}
