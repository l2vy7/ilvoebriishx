package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.zp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8414zp extends PushbackInputStream {

    /* renamed from: b */
    final /* synthetic */ C7512aq f42544b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8414zp(C7512aq aqVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f42544b = aqVar;
    }

    public final synchronized void close() throws IOException {
        C7583cq.m31085e(this.f42544b.f29718d);
        super.close();
    }
}
