package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x14 extends e14 {

    /* renamed from: i */
    private int f40996i;

    /* renamed from: j */
    private boolean f40997j;

    /* renamed from: k */
    private byte[] f40998k;

    /* renamed from: l */
    private byte[] f40999l;

    /* renamed from: m */
    private int f41000m;

    /* renamed from: n */
    private int f41001n;

    /* renamed from: o */
    private int f41002o;

    /* renamed from: p */
    private boolean f41003p;

    /* renamed from: q */
    private long f41004q;

    public x14() {
        byte[] bArr = d13.f20200f;
        this.f40998k = bArr;
        this.f40999l = bArr;
    }

    /* renamed from: k */
    private final int m39328k(long j) {
        return (int) ((j * ((long) this.f31158b.f31143a)) / 1000000);
    }

    /* renamed from: l */
    private final int m39329l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > 1024) {
                int i = this.f40996i;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: m */
    private final void m39330m(byte[] bArr, int i) {
        mo31449d(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f41003p = true;
        }
    }

    /* renamed from: n */
    private final void m39331n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f41002o);
        int i2 = this.f41002o - min;
        System.arraycopy(bArr, i - i2, this.f40999l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f40999l, i2, min);
    }

    /* renamed from: b */
    public final void mo30600b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !mo31450h()) {
            int i = this.f41000m;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f40998k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.f40996i;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f41000m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo31449d(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f41003p = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i != 1) {
                int limit3 = byteBuffer.limit();
                int l = m39329l(byteBuffer);
                byteBuffer.limit(l);
                this.f41004q += (long) (byteBuffer.remaining() / this.f40996i);
                m39331n(byteBuffer, this.f40999l, this.f41002o);
                if (l < limit3) {
                    m39330m(this.f40999l, this.f41002o);
                    this.f41000m = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int l2 = m39329l(byteBuffer);
                int position2 = l2 - byteBuffer.position();
                byte[] bArr = this.f40998k;
                int length = bArr.length;
                int i3 = this.f41001n;
                int i4 = length - i3;
                if (l2 >= limit4 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f40998k, this.f41001n, min);
                    int i5 = this.f41001n + min;
                    this.f41001n = i5;
                    byte[] bArr2 = this.f40998k;
                    if (i5 == bArr2.length) {
                        if (this.f41003p) {
                            m39330m(bArr2, this.f41002o);
                            long j = this.f41004q;
                            int i6 = this.f41001n;
                            int i7 = this.f41002o;
                            this.f41004q = j + ((long) ((i6 - (i7 + i7)) / this.f40996i));
                            i5 = i6;
                        } else {
                            this.f41004q += (long) ((i5 - this.f41002o) / this.f40996i);
                        }
                        m39331n(byteBuffer, this.f40998k, i5);
                        this.f41001n = 0;
                        this.f41000m = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    m39330m(bArr, i3);
                    this.f41001n = 0;
                    this.f41000m = 0;
                }
            }
        }
    }

    /* renamed from: c */
    public final e04 mo30601c(e04 e04) throws f04 {
        if (e04.f31145c == 2) {
            return this.f40997j ? e04 : e04.f31142e;
        }
        throw new f04(e04);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo30602e() {
        if (this.f40997j) {
            this.f40996i = this.f31158b.f31146d;
            int k = m39328k(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) * this.f40996i;
            if (this.f40998k.length != k) {
                this.f40998k = new byte[k];
            }
            int k2 = m39328k(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) * this.f40996i;
            this.f41002o = k2;
            if (this.f40999l.length != k2) {
                this.f40999l = new byte[k2];
            }
        }
        this.f41000m = 0;
        this.f41004q = 0;
        this.f41001n = 0;
        this.f41003p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30603f() {
        int i = this.f41001n;
        if (i > 0) {
            m39330m(this.f40998k, i);
        }
        if (!this.f41003p) {
            this.f41004q += (long) (this.f41002o / this.f40996i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo30604g() {
        this.f40997j = false;
        this.f41002o = 0;
        byte[] bArr = d13.f20200f;
        this.f40998k = bArr;
        this.f40999l = bArr;
    }

    /* renamed from: i */
    public final long mo35707i() {
        return this.f41004q;
    }

    /* renamed from: j */
    public final void mo35708j(boolean z) {
        this.f40997j = z;
    }

    public final boolean zzg() {
        return this.f40997j;
    }
}
