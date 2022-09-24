package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.lo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7911lo {

    /* renamed from: a */
    ByteArrayOutputStream f35148a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    Base64OutputStream f35149b = new Base64OutputStream(this.f35148a, 10);

    public final String toString() {
        try {
            this.f35149b.close();
        } catch (IOException e) {
            co0.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f35148a.close();
            return this.f35148a.toString();
        } catch (IOException e2) {
            co0.zzh("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.f35148a = null;
            this.f35149b = null;
        }
    }
}
