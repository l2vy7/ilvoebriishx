package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yf2 implements yi2<Bundle> {

    /* renamed from: a */
    public final String f41853a;

    /* renamed from: b */
    public final boolean f41854b;

    public yf2(String str, boolean z) {
        this.f41853a = str;
        this.f41854b = z;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f41853a);
        if (this.f41854b) {
            bundle.putString("de", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
    }
}
