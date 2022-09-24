package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ww2 {

    /* renamed from: a */
    private final Context f40943a;

    /* renamed from: b */
    private final String f40944b;

    /* renamed from: c */
    private final String f40945c;

    public ww2(Context context, zzcjf zzcjf) {
        this.f40943a = context;
        this.f40944b = context.getPackageName();
        this.f40945c = zzcjf.f43036b;
    }

    /* renamed from: a */
    public final void mo35688a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzt.zzx());
        map.put("app", this.f40944b);
        zzt.zzp();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzI(this.f40943a) ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        List<String> b = p00.m35912b();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37153m5)).booleanValue()) {
            b.addAll(zzt.zzo().mo18583h().zzg().mo32722d());
        }
        map.put("e", TextUtils.join(",", b));
        map.put("sdkVersion", this.f40945c);
    }
}
