package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yw2 {

    /* renamed from: a */
    private final String f42015a = z10.f42255b.mo34648e();

    /* renamed from: a */
    public final String mo35979a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f42015a).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.build().toString();
    }
}
