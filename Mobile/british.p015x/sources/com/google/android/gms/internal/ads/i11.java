package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i11 implements e11 {

    /* renamed from: a */
    private final zzg f33027a;

    public i11(zzg zzg) {
        this.f33027a = zzg;
    }

    /* renamed from: a */
    public final void mo31442a(Map<String, String> map) {
        this.f33027a.zzx(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
