package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pn0 {
    @GuardedBy("this")

    /* renamed from: a */
    private BigInteger f37719a = BigInteger.ONE;
    @GuardedBy("this")

    /* renamed from: b */
    private String f37720b = SessionDescription.SUPPORTED_SDP_VERSION;

    /* renamed from: a */
    public final synchronized String mo34157a() {
        String bigInteger;
        bigInteger = this.f37719a.toString();
        this.f37719a = this.f37719a.add(BigInteger.ONE);
        this.f37720b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String mo34158b() {
        return this.f37720b;
    }
}
