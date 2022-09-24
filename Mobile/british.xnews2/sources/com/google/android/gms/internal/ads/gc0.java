package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class gc0 extends io0 {

    /* renamed from: b */
    private final fc0 f32241b;

    public gc0(fc0 fc0, String str) {
        super(str);
        this.f32241b = fc0;
    }

    public final void zza(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "LeibnizHttpUrlPinger pinging URL: ".concat(valueOf);
        } else {
            str2 = new String("LeibnizHttpUrlPinger pinging URL: ");
        }
        co0.zze(str2);
        if (!"oda".equals(Uri.parse(str).getScheme())) {
            co0.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
            super.zza(str);
        }
    }
}
