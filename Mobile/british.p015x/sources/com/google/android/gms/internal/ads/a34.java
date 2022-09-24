package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a34 extends s51 {

    /* renamed from: h */
    private long f29515h;

    /* renamed from: i */
    private int f29516i;

    /* renamed from: j */
    private int f29517j = 32;

    public a34() {
        super(2, 0);
    }

    /* renamed from: b */
    public final void mo18824b() {
        super.mo18824b();
        this.f29516i = 0;
    }

    /* renamed from: m */
    public final int mo30296m() {
        return this.f29516i;
    }

    /* renamed from: n */
    public final long mo30297n() {
        return this.f29515h;
    }

    /* renamed from: o */
    public final void mo30298o(int i) {
        this.f29517j = i;
    }

    /* renamed from: p */
    public final boolean mo30299p(s51 s51) {
        ByteBuffer byteBuffer;
        nu1.m20745d(!s51.mo33438d(1073741824));
        nu1.m20745d(!s51.mo33438d(268435456));
        nu1.m20745d(!s51.mo33438d(4));
        if (mo30300q()) {
            if (this.f29516i >= this.f29517j || s51.mo33438d(Integer.MIN_VALUE) != mo33438d(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = s51.f20810c;
            if (!(byteBuffer2 == null || (byteBuffer = this.f20810c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.f29516i;
        this.f29516i = i + 1;
        if (i == 0) {
            this.f20812e = s51.f20812e;
            if (s51.mo33438d(1)) {
                mo33437c(1);
            }
        }
        if (s51.mo33438d(Integer.MIN_VALUE)) {
            mo33437c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = s51.f20810c;
        if (byteBuffer3 != null) {
            mo18825i(byteBuffer3.remaining());
            this.f20810c.put(byteBuffer3);
        }
        this.f29515h = s51.f20812e;
        return true;
    }

    /* renamed from: q */
    public final boolean mo30300q() {
        return this.f29516i > 0;
    }
}
