package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b24 extends e14 {

    /* renamed from: i */
    private int f29871i;

    /* renamed from: j */
    private int f29872j;

    /* renamed from: k */
    private boolean f29873k;

    /* renamed from: l */
    private int f29874l;

    /* renamed from: m */
    private byte[] f29875m = d13.f20200f;

    /* renamed from: n */
    private int f29876n;

    /* renamed from: o */
    private long f29877o;

    /* renamed from: b */
    public final void mo30600b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f29874l);
            this.f29877o += (long) (min / this.f31158b.f31146d);
            this.f29874l -= min;
            byteBuffer.position(position + min);
            if (this.f29874l <= 0) {
                int i2 = i - min;
                int length = (this.f29876n + i2) - this.f29875m.length;
                ByteBuffer d = mo31449d(length);
                int L = d13.m20281L(length, 0, this.f29876n);
                d.put(this.f29875m, 0, L);
                int L2 = d13.m20281L(length - L, 0, i2);
                byteBuffer.limit(byteBuffer.position() + L2);
                d.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - L2;
                int i4 = this.f29876n - L;
                this.f29876n = i4;
                byte[] bArr = this.f29875m;
                System.arraycopy(bArr, L, bArr, 0, i4);
                byteBuffer.get(this.f29875m, this.f29876n, i3);
                this.f29876n += i3;
                d.flip();
            }
        }
    }

    /* renamed from: c */
    public final e04 mo30601c(e04 e04) throws f04 {
        if (e04.f31145c == 2) {
            this.f29873k = true;
            return (this.f29871i == 0 && this.f29872j == 0) ? e04.f31142e : e04;
        }
        throw new f04(e04);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo30602e() {
        if (this.f29873k) {
            this.f29873k = false;
            int i = this.f29872j;
            int i2 = this.f31158b.f31146d;
            this.f29875m = new byte[(i * i2)];
            this.f29874l = this.f29871i * i2;
        }
        this.f29876n = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30603f() {
        if (this.f29873k) {
            int i = this.f29876n;
            if (i > 0) {
                this.f29877o += (long) (i / this.f31158b.f31146d);
            }
            this.f29876n = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo30604g() {
        this.f29875m = d13.f20200f;
    }

    /* renamed from: i */
    public final long mo30605i() {
        return this.f29877o;
    }

    /* renamed from: j */
    public final void mo30606j() {
        this.f29877o = 0;
    }

    /* renamed from: k */
    public final void mo30607k(int i, int i2) {
        this.f29871i = i;
        this.f29872j = i2;
    }

    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.f29876n) > 0) {
            mo31449d(i).put(this.f29875m, 0, this.f29876n).flip();
            this.f29876n = 0;
        }
        return super.zzb();
    }

    public final boolean zzh() {
        return super.zzh() && this.f29876n == 0;
    }
}
