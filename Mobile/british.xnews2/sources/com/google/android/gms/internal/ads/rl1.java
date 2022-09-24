package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rl1 implements uu3<C7580cn> {

    /* renamed from: a */
    private final iv3<zzcjf> f38714a;

    /* renamed from: b */
    private final iv3<String> f38715b;

    public rl1(iv3<zzcjf> iv3, iv3<String> iv32) {
        this.f38714a = iv3;
        this.f38715b = iv32;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcjf a = ((kw0) this.f38714a).mo33191a();
        zzt.zzp();
        return new C7580cn(UUID.randomUUID().toString(), a, "native", new JSONObject(), false, true);
    }
}
