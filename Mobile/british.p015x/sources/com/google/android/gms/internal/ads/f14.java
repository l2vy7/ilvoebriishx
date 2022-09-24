package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f14 extends e14 {

    /* renamed from: i */
    private int[] f31571i;

    /* renamed from: j */
    private int[] f31572j;

    f14() {
    }

    /* renamed from: b */
    public final void mo30600b(ByteBuffer byteBuffer) {
        int[] iArr = this.f31572j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer d = mo31449d(((limit - position) / this.f31158b.f31146d) * this.f31159c.f31146d);
        while (position < limit) {
            for (int i : iArr) {
                d.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.f31158b.f31146d;
        }
        byteBuffer.position(limit);
        d.flip();
    }

    /* renamed from: c */
    public final e04 mo30601c(e04 e04) throws f04 {
        int[] iArr = this.f31571i;
        if (iArr == null) {
            return e04.f31142e;
        }
        if (e04.f31145c == 2) {
            boolean z = e04.f31144b != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new e04(e04.f31143a, length, 2) : e04.f31142e;
                }
                int i2 = iArr[i];
                if (i2 < e04.f31144b) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new f04(e04);
                }
            }
        } else {
            throw new f04(e04);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo30602e() {
        this.f31572j = this.f31571i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo30604g() {
        this.f31572j = null;
        this.f31571i = null;
    }

    /* renamed from: i */
    public final void mo31709i(int[] iArr) {
        this.f31571i = iArr;
    }
}
