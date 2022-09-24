package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y21 implements uu3<C7580cn> {

    /* renamed from: a */
    private final iv3<ir2> f41672a;

    /* renamed from: b */
    private final iv3<zzcjf> f41673b;

    /* renamed from: c */
    private final iv3<JSONObject> f41674c;

    /* renamed from: d */
    private final iv3<String> f41675d;

    public y21(iv3<ir2> iv3, iv3<zzcjf> iv32, iv3<JSONObject> iv33, iv3<String> iv34) {
        this.f41672a = iv3;
        this.f41673b = iv32;
        this.f41674c = iv33;
        this.f41675d = iv34;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ((f71) this.f41672a).mo31778a();
        String zzb = this.f41675d.zzb();
        boolean equals = "native".equals(zzb);
        zzt.zzp();
        return new C7580cn(UUID.randomUUID().toString(), ((kw0) this.f41673b).mo33191a(), zzb, this.f41674c.zzb(), false, equals);
    }
}
