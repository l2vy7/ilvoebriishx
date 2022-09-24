package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pb */
/* compiled from: IMASDK */
final class C4252pb extends C4238oo {

    /* renamed from: d */
    private static final int f18297d = Float.floatToIntBits(Float.NaN);

    C4252pb() {
    }

    /* renamed from: o */
    private static void m18469o(int i, ByteBuffer byteBuffer) {
        double d = (double) i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == f18297d) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: c */
    public final void mo16375c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f18203b.f18098d;
        if (i2 == 536870912) {
            byteBuffer2 = mo16465i((i / 3) * 4);
            while (position < limit) {
                m18469o(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo16465i(i);
            while (position < limit) {
                m18469o((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: k */
    public final C4213nq mo16467k(C4213nq nqVar) throws C4214nr {
        int i = nqVar.f18098d;
        if (amm.m14208Y(i)) {
            return i != 4 ? new C4213nq(nqVar.f18096b, nqVar.f18097c, 4) : C4213nq.f18095a;
        }
        throw new C4214nr(nqVar);
    }
}
