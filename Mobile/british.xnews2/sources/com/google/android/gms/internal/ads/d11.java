package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d11 implements uu3<c11> {

    /* renamed from: a */
    private final iv3<Map<String, f11>> f30560a;

    /* renamed from: b */
    private final iv3<Map<String, e11>> f30561b;

    public d11(iv3<Map<String, f11>> iv3, iv3<Map<String, e11>> iv32) {
        this.f30560a = iv3;
        this.f30561b = iv32;
    }

    /* renamed from: a */
    public final c11 zzb() {
        return new c11(((yu3) this.f30560a).zzb(), ((yu3) this.f30561b).zzb());
    }
}
