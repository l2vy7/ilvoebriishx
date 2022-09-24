package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g70 implements e70<xt0> {

    /* renamed from: a */
    private final h70 f32177a;

    public g70(h70 h70, byte[] bArr) {
        this.f32177a = h70;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("transparentBackground"));
        boolean equals2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            co0.zzh("Fail to parse float", e);
        }
        this.f32177a.mo32357c(equals);
        this.f32177a.mo32356b(equals2, f);
        xt0.mo18717H(equals);
    }
}
