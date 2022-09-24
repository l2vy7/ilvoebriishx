package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vr0 implements gu3 {

    /* renamed from: b */
    private final ByteBuffer f40524b;

    vr0(ByteBuffer byteBuffer) {
        this.f40524b = byteBuffer.duplicate();
    }

    /* renamed from: a */
    public final void mo32294a(long j) throws IOException {
        this.f40524b.position((int) j);
    }

    public final void close() throws IOException {
    }

    /* renamed from: v0 */
    public final int mo32295v0(ByteBuffer byteBuffer) throws IOException {
        if (this.f40524b.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f40524b.remaining());
        byte[] bArr = new byte[min];
        this.f40524b.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    /* renamed from: z0 */
    public final ByteBuffer mo32296z0(long j, long j2) throws IOException {
        int position = this.f40524b.position();
        this.f40524b.position((int) j);
        ByteBuffer slice = this.f40524b.slice();
        slice.limit((int) j2);
        this.f40524b.position(position);
        return slice;
    }

    public final long zzb() throws IOException {
        return (long) this.f40524b.position();
    }

    public final long zzc() throws IOException {
        return (long) this.f40524b.limit();
    }
}
