package com.google.ads.interactivemedia.p038v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yo */
/* compiled from: IMASDK */
public abstract class C4508yo {
    /* renamed from: a */
    public final C4507yn mo16840a(C4269ps psVar) {
        ByteBuffer byteBuffer = psVar.f18397b;
        aup.m14890u(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        aup.m14885p(z);
        if (psVar.mo16509b()) {
            return null;
        }
        return mo16841b(byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C4507yn mo16841b(ByteBuffer byteBuffer);
}
