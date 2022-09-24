package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p11 implements e11 {

    /* renamed from: a */
    private final Context f37279a;

    /* renamed from: b */
    private final zzg f37280b = zzt.zzo().mo18583h();

    public p11(Context context) {
        this.f37279a = context;
    }

    /* renamed from: a */
    public final void mo31442a(Map<String, String> map) {
        if (!map.isEmpty()) {
            String str = map.get("gad_idless");
            if (str != null) {
                boolean parseBoolean = Boolean.parseBoolean(str);
                map.remove("gad_idless");
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37166o0)).booleanValue()) {
                    this.f37280b.zzD(parseBoolean);
                    if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36868E4)).booleanValue() && parseBoolean) {
                        this.f37279a.deleteDatabase("OfflineUpload.db");
                    }
                }
            }
            Bundle bundle = new Bundle();
            for (Map.Entry next : map.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37121j0)).booleanValue()) {
                zzt.zzn().mo18498w(bundle);
            }
        }
    }
}
