package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e60 implements e70<Object> {

    /* renamed from: a */
    private final f60 f31231a;

    public e60(f60 f60) {
        this.f31231a = f60;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map<String, String> map) {
        String str = map.get(MediationMetaData.KEY_NAME);
        if (str == null) {
            co0.zzj("App event with no name parameter.");
        } else {
            this.f31231a.mo18309M(str, map.get("info"));
        }
    }
}
