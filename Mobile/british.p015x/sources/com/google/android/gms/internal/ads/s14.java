package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class s14 extends e14 {

    /* renamed from: i */
    private static final int f38836i = Float.floatToIntBits(Float.NaN);

    s14() {
    }

    /* renamed from: i */
    private static void m37300i(int i, ByteBuffer byteBuffer) {
        double d = (double) i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == f38836i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: b */
    public final void mo30600b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f31158b.f31145c;
        if (i2 == 536870912) {
            byteBuffer2 = mo31449d((i / 3) * 4);
            while (position < limit) {
                m37300i(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo31449d(i);
            while (position < limit) {
                m37300i((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: c */
    public final e04 mo30601c(e04 e04) throws f04 {
        int i = e04.f31145c;
        if (d13.m20318q(i)) {
            return i != 4 ? new e04(e04.f31143a, e04.f31144b, 4) : e04.f31142e;
        }
        throw new f04(e04);
    }
}
