package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.op */
/* compiled from: IMASDK */
final class C4239op extends C4238oo {

    /* renamed from: d */
    private int[] f18210d;

    /* renamed from: e */
    private int[] f18211e;

    C4239op() {
    }

    /* renamed from: c */
    public final void mo16375c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) aup.m14890u(this.f18211e);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer i = mo16465i(((limit - position) / this.f18203b.f18099e) * this.f18204c.f18099e);
        while (position < limit) {
            for (int i2 : iArr) {
                i.putShort(byteBuffer.getShort(i2 + i2 + position));
            }
            position += this.f18203b.f18099e;
        }
        byteBuffer.position(limit);
        i.flip();
    }

    /* renamed from: k */
    public final C4213nq mo16467k(C4213nq nqVar) throws C4214nr {
        int[] iArr = this.f18210d;
        if (iArr == null) {
            return C4213nq.f18095a;
        }
        if (nqVar.f18098d == 2) {
            boolean z = nqVar.f18097c != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new C4213nq(nqVar.f18096b, length, 2) : C4213nq.f18095a;
                }
                int i2 = iArr[i];
                if (i2 < nqVar.f18097c) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new C4214nr(nqVar);
                }
            }
        } else {
            throw new C4214nr(nqVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo16469m() {
        this.f18211e = this.f18210d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo16470n() {
        this.f18211e = null;
        this.f18210d = null;
    }

    /* renamed from: o */
    public final void mo16471o(int[] iArr) {
        this.f18210d = iArr;
    }
}
