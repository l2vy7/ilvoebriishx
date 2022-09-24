package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xo */
/* compiled from: IMASDK */
final class C4481xo extends C4269ps {

    /* renamed from: f */
    private long f19580f;

    /* renamed from: g */
    private int f19581g;

    /* renamed from: h */
    private int f19582h = 32;

    public C4481xo() {
        super(2);
    }

    /* renamed from: a */
    public final void mo16508a() {
        super.mo16508a();
        this.f19581g = 0;
    }

    /* renamed from: l */
    public final void mo16771l(int i) {
        aup.m14885p(true);
        this.f19582h = i;
    }

    /* renamed from: m */
    public final long mo16772m() {
        return this.f19580f;
    }

    /* renamed from: n */
    public final int mo16773n() {
        return this.f19581g;
    }

    /* renamed from: o */
    public final boolean mo16774o() {
        return this.f19581g > 0;
    }

    /* renamed from: p */
    public final boolean mo16775p(C4269ps psVar) {
        ByteBuffer byteBuffer;
        aup.m14885p(!psVar.mo16521j());
        aup.m14885p(!psVar.mo16512e());
        aup.m14885p(!psVar.mo16510c());
        if (mo16774o()) {
            if (this.f19581g >= this.f19582h || psVar.mo16509b() != mo16509b()) {
                return false;
            }
            ByteBuffer byteBuffer2 = psVar.f18397b;
            if (!(byteBuffer2 == null || (byteBuffer = this.f18397b) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.f19581g;
        this.f19581g = i + 1;
        if (i == 0) {
            this.f18399d = psVar.f18399d;
            if (psVar.mo16511d()) {
                mo16513f(1);
            }
        }
        if (psVar.mo16509b()) {
            mo16513f(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = psVar.f18397b;
        if (byteBuffer3 != null) {
            mo16520i(byteBuffer3.remaining());
            this.f18397b.put(byteBuffer3);
        }
        this.f19580f = psVar.f18399d;
        return true;
    }
}
