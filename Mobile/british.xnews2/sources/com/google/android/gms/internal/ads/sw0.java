package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sw0 implements uu3<fj0> {

    /* renamed from: a */
    private final iv3<Context> f39083a;

    public sw0(iv3<Context> iv3) {
        this.f39083a = iv3;
    }

    /* renamed from: a */
    public final fj0 zzb() {
        Context a = ((zv0) this.f39083a).mo36135a();
        sb0 b = zzt.zzf().mo18421b(a, zzcjf.m40656C0());
        mb0<JSONObject> mb0 = pb0.f37568b;
        b.mo18829a("google.afma.request.getAdDictionary", mb0, mb0);
        return new ej0(a, zzt.zzf().mo18421b(a, zzcjf.m40656C0()).mo18829a("google.afma.sdkConstants.getSdkConstants", mb0, mb0));
    }
}
