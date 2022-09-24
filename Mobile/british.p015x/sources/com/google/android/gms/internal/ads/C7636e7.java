package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.e7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7636e7 extends ThreadLocal<ByteBuffer> {
    C7636e7(C7673f7 f7Var) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
