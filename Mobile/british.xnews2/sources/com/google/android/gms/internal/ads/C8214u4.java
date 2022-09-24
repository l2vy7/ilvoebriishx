package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.u4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8214u4 implements C8178t4 {

    /* renamed from: a */
    private final FileChannel f39755a;

    /* renamed from: b */
    private final long f39756b;

    /* renamed from: c */
    private final long f39757c;

    public C8214u4(FileChannel fileChannel, long j, long j2) {
        this.f39755a = fileChannel;
        this.f39756b = j;
        this.f39757c = j2;
    }

    /* renamed from: a */
    public final void mo34658a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f39755a.map(FileChannel.MapMode.READ_ONLY, this.f39756b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long zza() {
        return this.f39757c;
    }
}
