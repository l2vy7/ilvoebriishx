package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.h7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7746h7 extends fu3 {

    /* renamed from: j */
    private static final mu3 f32639j = mu3.m34909b(C7746h7.class);

    public C7746h7(gu3 gu3, C7710g7 g7Var) throws IOException {
        mo31929h(gu3, gu3.zzc(), g7Var);
    }

    public final void close() throws IOException {
    }

    public final String toString() {
        String obj = this.f31884c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
