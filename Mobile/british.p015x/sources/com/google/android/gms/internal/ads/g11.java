package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g11 implements e11 {

    /* renamed from: a */
    private final zzg f32095a;

    public g11(zzg zzg) {
        this.f32095a = zzg;
    }

    /* renamed from: a */
    public final void mo31442a(Map<String, String> map) {
        this.f32095a.zzv(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
