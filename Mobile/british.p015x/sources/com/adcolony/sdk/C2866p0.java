package com.adcolony.sdk;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.adcolony.sdk.p0 */
class C2866p0 extends InputStream {

    /* renamed from: a */
    InputStream f11632a;

    /* renamed from: b */
    int f11633b;

    C2866p0(InputStream inputStream, int i, int i2) throws IOException {
        this.f11632a = inputStream;
        while (i > 0) {
            i -= (int) inputStream.skip((long) i);
        }
        this.f11633b = i2;
    }

    public int available() throws IOException {
        int available = this.f11632a.available();
        int i = this.f11633b;
        return available <= i ? available : i;
    }

    public void close() throws IOException {
        this.f11632a.close();
    }

    public int read() throws IOException {
        int i = this.f11633b;
        if (i == 0) {
            return -1;
        }
        this.f11633b = i - 1;
        return this.f11632a.read();
    }

    public long skip(long j) throws IOException {
        int i = (int) j;
        if (i <= 0) {
            return 0;
        }
        int i2 = this.f11633b;
        if (i > i2) {
            i = i2;
        }
        this.f11633b = i2 - i;
        while (i > 0) {
            i -= (int) this.f11632a.skip(j);
        }
        return j;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f11633b;
        if (i3 == 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int read = this.f11632a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f11633b -= read;
        return read;
    }
}
