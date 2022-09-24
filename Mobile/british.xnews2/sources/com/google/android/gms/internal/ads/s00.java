package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s00 {

    /* renamed from: a */
    private final String f38825a = z10.f42255b.mo34648e();

    /* renamed from: b */
    private final Map<String, String> f38826b;

    /* renamed from: c */
    private final Context f38827c;

    /* renamed from: d */
    private final String f38828d;

    public s00(Context context, String str) {
        String str2;
        this.f38827c = context;
        this.f38828d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f38826b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzt.zzx());
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        linkedHashMap.put("app", str2);
        zzt.zzp();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzI(context) ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        Future<yi0> b = zzt.zzm().mo30682b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(b.get().f41886k));
            linkedHashMap.put("network_fine", Integer.toString(b.get().f41887l));
        } catch (Exception e) {
            zzt.zzo().mo18592s(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo34643a() {
        return this.f38827c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo34644b() {
        return this.f38828d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo34645c() {
        return this.f38825a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<String, String> mo34646d() {
        return this.f38826b;
    }
}
