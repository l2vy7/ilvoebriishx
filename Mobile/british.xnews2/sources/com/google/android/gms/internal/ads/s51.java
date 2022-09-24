package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class s51 extends lz0 {

    /* renamed from: b */
    public final o21 f20809b = new o21();

    /* renamed from: c */
    public ByteBuffer f20810c;

    /* renamed from: d */
    public boolean f20811d;

    /* renamed from: e */
    public long f20812e;

    /* renamed from: f */
    public ByteBuffer f20813f;

    /* renamed from: g */
    private final int f20814g;

    public s51(int i, int i2) {
        this.f20814g = i;
    }

    /* renamed from: l */
    private final ByteBuffer m21014l(int i) {
        int i2;
        int i3 = this.f20814g;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f20810c;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new q41(i2, i);
    }

    /* renamed from: b */
    public void mo18824b() {
        super.mo18824b();
        ByteBuffer byteBuffer = this.f20810c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f20813f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f20811d = false;
    }

    @EnsuresNonNull({"data"})
    /* renamed from: i */
    public final void mo18825i(int i) {
        ByteBuffer byteBuffer = this.f20810c;
        if (byteBuffer == null) {
            this.f20810c = m21014l(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f20810c = byteBuffer;
            return;
        }
        ByteBuffer l = m21014l(i2);
        l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l.put(byteBuffer);
        }
        this.f20810c = l;
    }

    /* renamed from: j */
    public final void mo18826j() {
        ByteBuffer byteBuffer = this.f20810c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f20813f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: k */
    public final boolean mo18827k() {
        return mo33438d(1073741824);
    }
}
