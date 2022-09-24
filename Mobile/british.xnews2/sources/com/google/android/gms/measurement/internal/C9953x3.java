package com.google.android.gms.measurement.internal;

import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final /* synthetic */ class C9953x3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C9726b4 f46848a;

    /* renamed from: b */
    public final /* synthetic */ String f46849b;

    public /* synthetic */ C9953x3(C9726b4 b4Var, String str) {
        this.f46848a = b4Var;
        this.f46849b = str;
    }

    public final Object call() {
        C9726b4 b4Var = this.f46848a;
        String str = this.f46849b;
        C9885q4 R = b4Var.f46518b.mo39280V().mo38989R(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        hashMap.put("package_name", str);
        b4Var.f21269a.mo19392z().mo19350p();
        hashMap.put("gmp_version", 55005L);
        if (R != null) {
            String f0 = R.mo39144f0();
            if (f0 != null) {
                hashMap.put("app_version", f0);
            }
            hashMap.put("app_version_int", Long.valueOf(R.mo39117K()));
            hashMap.put("dynamite_version", Long.valueOf(R.mo39126T()));
        }
        return hashMap;
    }
}
