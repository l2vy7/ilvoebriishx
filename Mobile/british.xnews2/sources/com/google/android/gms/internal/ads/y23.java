package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class y23 extends q23 {

    /* renamed from: b */
    private n43<Integer> f41678b;

    /* renamed from: c */
    private n43<Integer> f41679c;

    /* renamed from: d */
    private x23 f41680d;

    /* renamed from: e */
    private HttpURLConnection f41681e;

    y23() {
        this(v23.f40273b, w23.f40678b, (x23) null);
    }

    y23(n43<Integer> n43, n43<Integer> n432, x23 x23) {
        this.f41678b = n43;
        this.f41679c = n432;
        this.f41680d = x23;
    }

    /* renamed from: d */
    static /* synthetic */ Integer m39747d() {
        return -1;
    }

    /* renamed from: e */
    static /* synthetic */ Integer m39748e() {
        return -1;
    }

    /* renamed from: k */
    public static void m39751k(HttpURLConnection httpURLConnection) {
        r23.m36908a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        m39751k(this.f41681e);
    }

    /* renamed from: h */
    public HttpURLConnection mo35842h() throws IOException {
        r23.m36909b(this.f41678b.zza().intValue(), this.f41679c.zza().intValue());
        x23 x23 = this.f41680d;
        Objects.requireNonNull(x23);
        HttpURLConnection httpURLConnection = (HttpURLConnection) x23.zza();
        this.f41681e = httpURLConnection;
        return httpURLConnection;
    }

    /* renamed from: j */
    public HttpURLConnection mo35843j(x23 x23, int i, int i2) throws IOException {
        this.f41678b = new s23(i);
        this.f41679c = new u23(i2);
        this.f41680d = x23;
        return mo35842h();
    }
}
