package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pi */
/* compiled from: IMASDK */
public final class C4259pi extends C4238oo {

    /* renamed from: d */
    private int f18324d;

    /* renamed from: e */
    private boolean f18325e;

    /* renamed from: f */
    private byte[] f18326f;

    /* renamed from: g */
    private byte[] f18327g;

    /* renamed from: h */
    private int f18328h;

    /* renamed from: i */
    private int f18329i;

    /* renamed from: j */
    private int f18330j;

    /* renamed from: k */
    private boolean f18331k;

    /* renamed from: l */
    private long f18332l;

    public C4259pi() {
        aup.m14885p(true);
        byte[] bArr = amm.f15303f;
        this.f18326f = bArr;
        this.f18327g = bArr;
    }

    /* renamed from: q */
    private final void m18535q(byte[] bArr, int i) {
        mo16465i(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f18331k = true;
        }
    }

    /* renamed from: r */
    private final void m18536r(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f18330j);
        int i2 = this.f18330j - min;
        System.arraycopy(bArr, i - i2, this.f18327g, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f18327g, i2, min);
    }

    /* renamed from: s */
    private final int m18537s(long j) {
        return (int) ((j * ((long) this.f18203b.f18096b)) / 1000000);
    }

    /* renamed from: t */
    private final int m18538t(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > 1024) {
                int i = this.f18324d;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: b */
    public final boolean mo16374b() {
        return this.f18325e;
    }

    /* renamed from: c */
    public final void mo16375c(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !mo16466j()) {
            int i = this.f18328h;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f18326f.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.f18324d;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f18328h = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo16465i(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f18331k = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i != 1) {
                int limit3 = byteBuffer.limit();
                int t = m18538t(byteBuffer);
                byteBuffer.limit(t);
                this.f18332l += (long) (byteBuffer.remaining() / this.f18324d);
                m18536r(byteBuffer, this.f18327g, this.f18330j);
                if (t < limit3) {
                    m18535q(this.f18327g, this.f18330j);
                    this.f18328h = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int t2 = m18538t(byteBuffer);
                int position2 = t2 - byteBuffer.position();
                byte[] bArr = this.f18326f;
                int length = bArr.length;
                int i3 = this.f18329i;
                int i4 = length - i3;
                if (t2 >= limit4 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f18326f, this.f18329i, min);
                    int i5 = this.f18329i + min;
                    this.f18329i = i5;
                    byte[] bArr2 = this.f18326f;
                    if (i5 == bArr2.length) {
                        if (this.f18331k) {
                            m18535q(bArr2, this.f18330j);
                            long j = this.f18332l;
                            int i6 = this.f18329i;
                            int i7 = this.f18330j;
                            this.f18332l = j + ((long) ((i6 - (i7 + i7)) / this.f18324d));
                            i5 = i6;
                        } else {
                            this.f18332l += (long) ((i5 - this.f18330j) / this.f18324d);
                        }
                        m18536r(byteBuffer, this.f18326f, i5);
                        this.f18329i = 0;
                        this.f18328h = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    m18535q(bArr, i3);
                    this.f18329i = 0;
                    this.f18328h = 0;
                }
            }
        }
    }

    /* renamed from: k */
    public final C4213nq mo16467k(C4213nq nqVar) throws C4214nr {
        if (nqVar.f18098d == 2) {
            return this.f18325e ? nqVar : C4213nq.f18095a;
        }
        throw new C4214nr(nqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo16468l() {
        int i = this.f18329i;
        if (i > 0) {
            m18535q(this.f18326f, i);
        }
        if (!this.f18331k) {
            this.f18332l += (long) (this.f18330j / this.f18324d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo16469m() {
        if (this.f18325e) {
            this.f18324d = this.f18203b.f18099e;
            int s = m18537s(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) * this.f18324d;
            if (this.f18326f.length != s) {
                this.f18326f = new byte[s];
            }
            int s2 = m18537s(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) * this.f18324d;
            this.f18330j = s2;
            if (this.f18327g.length != s2) {
                this.f18327g = new byte[s2];
            }
        }
        this.f18328h = 0;
        this.f18332l = 0;
        this.f18329i = 0;
        this.f18331k = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo16470n() {
        this.f18325e = false;
        this.f18330j = 0;
        byte[] bArr = amm.f15303f;
        this.f18326f = bArr;
        this.f18327g = bArr;
    }

    /* renamed from: o */
    public final void mo16494o(boolean z) {
        this.f18325e = z;
    }

    /* renamed from: p */
    public final long mo16495p() {
        return this.f18332l;
    }
}
