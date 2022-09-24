package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.n7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7969n7 extends au3 {

    /* renamed from: l */
    ByteBuffer f35924l;

    public C7969n7(String str) {
        super(str);
    }

    /* renamed from: b */
    public final void mo30505b(ByteBuffer byteBuffer) {
        this.f35924l = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
