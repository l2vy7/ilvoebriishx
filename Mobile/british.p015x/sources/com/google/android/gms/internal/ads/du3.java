package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class du3 extends au3 {

    /* renamed from: l */
    private int f31007l;

    protected du3(String str) {
        super("mvhd");
    }

    /* renamed from: f */
    public final int mo31413f() {
        if (!this.f29763d) {
            mo30507d();
        }
        return this.f31007l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final long mo31414g(ByteBuffer byteBuffer) {
        this.f31007l = C7784i7.m33101c(byteBuffer.get());
        C7784i7.m33102d(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
