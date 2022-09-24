package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xp3 extends InputStream {

    /* renamed from: b */
    private Iterator<ByteBuffer> f41249b;

    /* renamed from: c */
    private ByteBuffer f41250c;

    /* renamed from: d */
    private int f41251d = 0;

    /* renamed from: e */
    private int f41252e;

    /* renamed from: f */
    private int f41253f;

    /* renamed from: g */
    private boolean f41254g;

    /* renamed from: h */
    private byte[] f41255h;

    /* renamed from: i */
    private int f41256i;

    /* renamed from: j */
    private long f41257j;

    xp3(Iterable<ByteBuffer> iterable) {
        this.f41249b = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f41251d++;
        }
        this.f41252e = -1;
        if (!m39527d()) {
            this.f41250c = up3.f39922e;
            this.f41252e = 0;
            this.f41253f = 0;
            this.f41257j = 0;
        }
    }

    /* renamed from: c */
    private final void m39526c(int i) {
        int i2 = this.f41253f + i;
        this.f41253f = i2;
        if (i2 == this.f41250c.limit()) {
            m39527d();
        }
    }

    /* renamed from: d */
    private final boolean m39527d() {
        this.f41252e++;
        if (!this.f41249b.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f41249b.next();
        this.f41250c = next;
        this.f41253f = next.position();
        if (this.f41250c.hasArray()) {
            this.f41254g = true;
            this.f41255h = this.f41250c.array();
            this.f41256i = this.f41250c.arrayOffset();
        } else {
            this.f41254g = false;
            this.f41257j = qs3.m36721m(this.f41250c);
            this.f41255h = null;
        }
        return true;
    }

    public final int read() throws IOException {
        byte i;
        if (this.f41252e == this.f41251d) {
            return -1;
        }
        if (this.f41254g) {
            i = this.f41255h[this.f41253f + this.f41256i];
            m39526c(1);
        } else {
            i = qs3.m36717i(((long) this.f41253f) + this.f41257j);
            m39526c(1);
        }
        return i & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f41252e == this.f41251d) {
            return -1;
        }
        int limit = this.f41250c.limit();
        int i3 = this.f41253f;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f41254g) {
            System.arraycopy(this.f41255h, i3 + this.f41256i, bArr, i, i2);
            m39526c(i2);
        } else {
            int position = this.f41250c.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f41250c.position(this.f41253f);
            this.f41250c.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f41250c.position(position);
            m39526c(i2);
        }
        return i2;
    }
}
