package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.mg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7940mg extends C7719gg {

    /* renamed from: b */
    public final C7830jg f35509b = new C7830jg();

    /* renamed from: c */
    public ByteBuffer f35510c;

    /* renamed from: d */
    public long f35511d;

    public C7940mg(int i) {
    }

    /* renamed from: j */
    private final ByteBuffer m34780j(int i) {
        int i2;
        ByteBuffer byteBuffer = this.f35510c;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(i2);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final void mo32117b() {
        super.mo32117b();
        ByteBuffer byteBuffer = this.f35510c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: h */
    public final void mo33538h(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f35510c;
        if (byteBuffer == null) {
            this.f35510c = m34780j(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f35510c.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer j = m34780j(i2);
            if (position > 0) {
                this.f35510c.position(0);
                this.f35510c.limit(position);
                j.put(this.f35510c);
            }
            this.f35510c = j;
        }
    }

    /* renamed from: i */
    public final boolean mo33539i() {
        return mo32119d(1073741824);
    }
}
