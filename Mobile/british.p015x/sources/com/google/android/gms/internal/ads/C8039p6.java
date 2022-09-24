package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.p6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8039p6 extends FilterInputStream {

    /* renamed from: b */
    private final long f37342b;

    /* renamed from: c */
    private long f37343c;

    C8039p6(InputStream inputStream, long j) {
        super(inputStream);
        this.f37342b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo34059c() {
        return this.f37342b - this.f37343c;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f37343c++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f37343c += (long) read;
        }
        return read;
    }
}
