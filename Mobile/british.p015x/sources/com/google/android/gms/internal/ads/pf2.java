package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pf2 implements yi2<Bundle> {

    /* renamed from: a */
    private final String f37629a;

    /* renamed from: b */
    private final String f37630b;

    /* renamed from: c */
    private final Bundle f37631c;

    /* synthetic */ pf2(String str, String str2, Bundle bundle, of2 of2) {
        this.f37629a = str;
        this.f37630b = str2;
        this.f37631c = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f37629a);
        bundle.putString("fc_consent", this.f37630b);
        bundle.putBundle("iab_consent_info", this.f37631c);
    }
}
