package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ki2 implements yi2<Bundle> {

    /* renamed from: a */
    public final String f34340a;

    /* renamed from: b */
    public final String f34341b;

    /* renamed from: c */
    public final String f34342c;

    /* renamed from: d */
    public final String f34343d;

    /* renamed from: e */
    public final Long f34344e;

    public ki2(String str, String str2, String str3, String str4, Long l) {
        this.f34340a = str;
        this.f34341b = str2;
        this.f34342c = str3;
        this.f34343d = str4;
        this.f34344e = l;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        ms2.m34889c(bundle, "gmp_app_id", this.f34340a);
        ms2.m34889c(bundle, "fbs_aiid", this.f34341b);
        ms2.m34889c(bundle, "fbs_aeid", this.f34342c);
        ms2.m34889c(bundle, "apm_id_origin", this.f34343d);
        Long l = this.f34344e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
