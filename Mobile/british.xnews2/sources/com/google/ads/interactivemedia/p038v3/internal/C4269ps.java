package com.google.ads.interactivemedia.p038v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ps */
/* compiled from: IMASDK */
public class C4269ps extends C4263pm {

    /* renamed from: a */
    public final C4265po f18396a;

    /* renamed from: b */
    public ByteBuffer f18397b;

    /* renamed from: c */
    public boolean f18398c;

    /* renamed from: d */
    public long f18399d;

    /* renamed from: e */
    public ByteBuffer f18400e;

    /* renamed from: f */
    private final int f18401f;

    public C4269ps(int i) {
        this.f18396a = new C4265po();
        this.f18401f = i;
    }

    /* renamed from: l */
    private final ByteBuffer mo16771l(int i) {
        int i2;
        int i3 = this.f18401f;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f18397b;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new C4268pr(i2, i);
    }

    /* renamed from: a */
    public void mo16508a() {
        super.mo16508a();
        ByteBuffer byteBuffer = this.f18397b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f18400e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f18398c = false;
    }

    /* renamed from: i */
    public final void mo16520i(int i) {
        ByteBuffer byteBuffer = this.f18397b;
        if (byteBuffer == null) {
            this.f18397b = mo16771l(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f18397b = byteBuffer;
            return;
        }
        ByteBuffer l = mo16771l(i2);
        l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l.put(byteBuffer);
        }
        this.f18397b = l;
    }

    /* renamed from: j */
    public final boolean mo16521j() {
        return mo16515h(1073741824);
    }

    /* renamed from: k */
    public final void mo16522k() {
        ByteBuffer byteBuffer = this.f18397b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f18400e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public C4269ps() {
        this(1);
    }
}
