package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pl */
/* compiled from: IMASDK */
final class C4262pl extends C4238oo {

    /* renamed from: d */
    private int f18370d;

    /* renamed from: e */
    private int f18371e;

    /* renamed from: f */
    private boolean f18372f;

    /* renamed from: g */
    private int f18373g;

    /* renamed from: h */
    private byte[] f18374h = amm.f15303f;

    /* renamed from: i */
    private int f18375i;

    /* renamed from: j */
    private long f18376j;

    /* renamed from: c */
    public final void mo16375c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f18373g);
            this.f18376j += (long) (min / this.f18203b.f18099e);
            this.f18373g -= min;
            byteBuffer.position(position + min);
            if (this.f18373g <= 0) {
                int i2 = i - min;
                int length = (this.f18375i + i2) - this.f18374h.length;
                ByteBuffer i3 = mo16465i(length);
                int H = amm.m14191H(length, 0, this.f18375i);
                i3.put(this.f18374h, 0, H);
                int H2 = amm.m14191H(length - H, 0, i2);
                byteBuffer.limit(byteBuffer.position() + H2);
                i3.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i2 - H2;
                int i5 = this.f18375i - H;
                this.f18375i = i5;
                byte[] bArr = this.f18374h;
                System.arraycopy(bArr, H, bArr, 0, i5);
                byteBuffer.get(this.f18374h, this.f18375i, i4);
                this.f18375i += i4;
                i3.flip();
            }
        }
    }

    /* renamed from: e */
    public final ByteBuffer mo16377e() {
        int i;
        if (super.mo16378f() && (i = this.f18375i) > 0) {
            mo16465i(i).put(this.f18374h, 0, this.f18375i).flip();
            this.f18375i = 0;
        }
        return super.mo16377e();
    }

    /* renamed from: f */
    public final boolean mo16378f() {
        return super.mo16378f() && this.f18375i == 0;
    }

    /* renamed from: k */
    public final C4213nq mo16467k(C4213nq nqVar) throws C4214nr {
        if (nqVar.f18098d == 2) {
            this.f18372f = true;
            return (this.f18370d == 0 && this.f18371e == 0) ? C4213nq.f18095a : nqVar;
        }
        throw new C4214nr(nqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo16468l() {
        if (this.f18372f) {
            int i = this.f18375i;
            if (i > 0) {
                this.f18376j += (long) (i / this.f18203b.f18099e);
            }
            this.f18375i = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo16469m() {
        if (this.f18372f) {
            this.f18372f = false;
            int i = this.f18371e;
            int i2 = this.f18203b.f18099e;
            this.f18374h = new byte[(i * i2)];
            this.f18373g = this.f18370d * i2;
        }
        this.f18375i = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo16470n() {
        this.f18374h = amm.f15303f;
    }

    /* renamed from: o */
    public final void mo16505o(int i, int i2) {
        this.f18370d = i;
        this.f18371e = i2;
    }

    /* renamed from: p */
    public final void mo16506p() {
        this.f18376j = 0;
    }

    /* renamed from: q */
    public final long mo16507q() {
        return this.f18376j;
    }
}
